package com.example.orgmanager.entity;

public class Course {
    private Integer cid;
    private String cname;
    private Integer price;

    public Course() {
    }

    public Course(Integer cid, String cname, Integer price) {
        this.cid = cid;
        this.cname = cname;
        this.price = price;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", price=" + price +
                '}';
    }
}

