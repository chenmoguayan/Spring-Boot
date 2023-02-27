package org.hj.boot.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author hj
 * @data 2023/2/24 9:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user")
public class User extends BaseEntity {
    @TableId("id")
    private Long id;
    @TableField("name")
    private String name;
    private Integer age;
    private String email;


}
