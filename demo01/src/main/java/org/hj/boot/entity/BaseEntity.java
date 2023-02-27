package org.hj.boot.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Date;

/**
 * @author hj
 * @data 2023/2/24 16:30
 */
@Data
public class BaseEntity {
    // 在新增数据的时候进行mp的赋值

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    // 在新增和修改的时候进行mp的赋值

    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(value = "version",fill = FieldFill.INSERT)
    private Integer version ;

    // @TableLogic 注解： 可以将物理删除变为逻辑删除，前提是表中要有相应的逻辑删除的对应字段。

    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private Integer isDeleted;

}
