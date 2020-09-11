package com.homegrown.library;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer ID;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subTitle;

    @Column(name = "read")
    private Boolean read;

    public BookEntity() {
        // Hibernate needs a public noArgs constructor
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Boolean getRead() {
        return read;
    }

    public void isRead(Boolean read) {
        this.read = read;
    }
}
