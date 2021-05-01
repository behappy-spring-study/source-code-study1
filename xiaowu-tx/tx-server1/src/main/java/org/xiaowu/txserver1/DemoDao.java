package org.xiaowu.txserver1;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoDao {

    @Insert("insert into t_test(name) values(#{name})")
    void insert(@Param("name") String name);
}