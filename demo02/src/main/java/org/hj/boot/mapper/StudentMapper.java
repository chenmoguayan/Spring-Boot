package org.hj.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.hj.boot.entity.Student;

/**
 * @author hj
 * @data 2023/2/25 9:11
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
