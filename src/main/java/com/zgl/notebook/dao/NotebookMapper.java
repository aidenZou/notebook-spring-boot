package com.zgl.notebook.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zgl.notebook.entity.Notebook;

public interface NotebookMapper {
    @Select("SELECT * FROM Notebook WHERE id = #{id}")
    Notebook selectByPrimaryKey(@Param("id") Integer id);
}
