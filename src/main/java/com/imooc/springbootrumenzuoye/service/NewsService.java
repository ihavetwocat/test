package com.imooc.springbootrumenzuoye.service;

import com.imooc.springbootrumenzuoye.dao.NewsDao;
import com.imooc.springbootrumenzuoye.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 增删改查
 */
@Service
public class NewsService {
    @Autowired
    NewsDao newsDao;

    //增
    public News addNews(String title,String author,String source,String content){
        return newsDao.add(title,author,source,content);
    }

    //改
    public News updateNews(Integer id,String content) {
        return newsDao.updateById(id,content);
    }

    //删
    public News delNews(Integer id){
        return newsDao.delById(id);
    }

    //查找的方法
    public News getNews(Integer id){
        return newsDao.findById(id);
    }
}
