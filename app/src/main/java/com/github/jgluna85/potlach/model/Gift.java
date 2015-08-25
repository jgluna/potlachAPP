package com.github.jgluna85.potlach.model;

import java.util.Date;
import java.util.List;

public class Gift {
    private long id;
    private Gift parentGift;
    private List<Gift> responses;

    private String title;
    private String text;
    private Date creationDate;
    private User user;
    private String imageURL;
    private int touchesCount;
    private int reportCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Gift getParentGift() {
        return parentGift;
    }

    public void setParentGift(Gift parentGift) {
        this.parentGift = parentGift;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getTouchesCount() {
        return touchesCount;
    }

    public void setTouchesCount(int touchesCount) {
        this.touchesCount = touchesCount;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void setReportCount(int reportCount) {
        this.reportCount = reportCount;
    }

    public List<Gift> getResponses() {
        return responses;
    }

    public void setResponses(List<Gift> responses) {
        this.responses = responses;
    }

}
