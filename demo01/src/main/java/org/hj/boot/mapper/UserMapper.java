package org.hj.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.hj.boot.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author hj
 * @data 2023/2/24 9:49
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<Map<String,Object>> getEnameAndUName();

}
