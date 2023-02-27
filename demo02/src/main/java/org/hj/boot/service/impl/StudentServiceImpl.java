package org.hj.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hj.boot.entity.Student;
import org.hj.boot.mapper.StudentMapper;
import org.hj.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/25 9:12
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    private StudentMapper mapper;


    @Override
    public List<Student> selectList(Object o) {
        return mapper.selectList(null);
    }

    @Override
    public int insert(Student student) {
        return mapper.insert(student);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public Student selectById(String id) {
        return mapper.selectById(id);
    }

    @Override
    public int update(Student student) {
        return mapper.updateById(student);
    }
}
