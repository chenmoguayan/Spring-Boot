package org.hj.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hj.boot.entity.Student;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/25 9:12
 */
public interface StudentService extends IService<Student> {
    List<Student> selectList(Object o);

    int insert(Student student);

    int deleteById(int id);

    Student selectById(String id);

    int update(Student student);
}
