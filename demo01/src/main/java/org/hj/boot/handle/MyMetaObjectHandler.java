package org.hj.boot.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hj
 * @data 2023/2/24 16:40
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 新增数据的时候，默认值

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
        //新增数据时设置初始值为1
        this.setFieldValByName("version",1,metaObject);

        // 0 代表 未删除， 1 代表 已删除
        this.setFieldValByName("isDeleted",0,metaObject);
    }

    // 修改数据的时候，默认值

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
