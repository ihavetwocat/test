package com.imooc.springbootrumenzuoye.dao;


import com.imooc.springbootrumenzuoye.entity.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NewsDao {
    //增
    @Insert("INSERT INTO news (title,author,source,content) VALUES (#{title},#{author},#{source},#{content})")
    News add(String title,String author,String source,String content);

    //删
    @Delete("DELETE FROM news WHERE id = #{id}")
    News delById(Integer id);

    //改
    @Update("UPDATE news SET content = #{content} WHERE id = #{id}")
    News updateById(Integer id, String content);

    //查
    @Select("SELECT * FROM news WHERE id = #{id}")
    News findById(long id);
}
