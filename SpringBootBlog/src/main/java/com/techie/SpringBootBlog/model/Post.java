package com.techie.SpringBootBlog.model;



import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String title;

    @Lob //Lob signifies that the annotated field should be represented as BLOB (binary data) in the DataBase (for large object).
    @Column
    @NotNull
    private String content;

    @Column
    private Instant createdOn; // Instant is used to represents a specific moment on the time line.

    @Column
    private Instant updateOn;


    @Column
    @NotNull
    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Instant updateOn) {
        this.updateOn = updateOn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
