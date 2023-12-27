package com.driver.models;


import javax.persistence.*;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int blogId;

    @Column(unique = true,nullable = false)
    String title;

    String content;


    public Blog() {
    }

    public Blog(int blogId, String title, String content) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}