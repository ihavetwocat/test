package com.imooc.springbootrumenzuoye.entity;

/**
 * 新闻实体类
 */
public class News {

    Integer id;
    //标题
    String title;
    //作者
    String author;
    //来源
    String source;
    //内容
    String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public News(Integer id, String title, String author, String source, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.source = source;
        this.content = content;
    }
}
