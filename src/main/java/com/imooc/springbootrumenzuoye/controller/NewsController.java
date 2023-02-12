package com.imooc.springbootrumenzuoye.controller;

import com.imooc.springbootrumenzuoye.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 增删改查
 * 新闻Controller
 */
@RestController
public class NewsController {
    @Autowired
    NewsService newsService;
    //增
    @GetMapping("/saveNews")
    public String add(@RequestParam String title,String author,String source,String content){
        return newsService.addNews(title,author,source,content).toString();
    }

    //删
    @GetMapping("/deleteNews")
    public String del(@RequestParam Integer id) {
        return newsService.delNews(id).toString();
    }

    //改
    @GetMapping("/updateNews")
    public String update(@RequestParam Integer id,String content) {
        return newsService.updateNews(id, content).toString();
    }

    //查
    @GetMapping("/findNews")
    public String find(@RequestParam Integer id){
        return newsService.getNews(id).toString();
    }

}
