package org.hj.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hj
 * @data 2023/2/25 9:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Integer sid;
}
