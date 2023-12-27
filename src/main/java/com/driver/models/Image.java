package com.driver.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            int blogId;

    String description;


    String dimensions;


    public Image() {
    }

    public Image(int blogId, String description, String dimensions) {
        this.blogId = blogId;
        this.description = description;
        this.dimensions = dimensions;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}