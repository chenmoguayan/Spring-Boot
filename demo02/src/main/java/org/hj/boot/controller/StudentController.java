package org.hj.boot.controller;

import org.hj.boot.entity.Student;
import org.hj.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/25 9:17
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/stu")
    public ModelAndView getStudent(ModelAndView modelAndView) {
        List<Student> students = studentService.selectList(null);
        modelAndView.addObject( "list",students);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @PutMapping("/stu")
    public String setStudent(Student student){
        System.out.println(student);
        int count = studentService.update(student);
        if (count > 0) {
            return "index";
        }
        return null;
    }

    @PostMapping("/stu")
    public String addStudent(Student student){
        int i = studentService.insert(student);
        if (i > 0){
            return "index";
        }
        return null;
    }
    @DeleteMapping("/stu")
    public String removeStudent(int id){
        int count = studentService.deleteById(id);
        if (count > 0){
            return "index";
        }
        return null;
    }

    //跳转到修改界面

    @RequestMapping("/update")
    public ModelAndView updateStudent(ModelAndView modelAndView,@RequestParam("id") String id){
        Student student = studentService.selectById(id);
        System.out.println(id);
        modelAndView.setViewName("update");
        modelAndView.addObject("student",student);
        return modelAndView;
    }

    //跳转到添加界面

    @RequestMapping("/insert")
    public String insertStudent(){
        return "insert";
    }



}
