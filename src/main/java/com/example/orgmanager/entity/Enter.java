package com.example.orgmanager.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Enter {
    private Integer eid;
    private Integer sid;
    private Integer cid;
    private Integer period;
    private Integer rebate;
    private Integer tid;
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone = "GMT+8")
    private Date entertime;

    public Enter() {
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getEntertime() {
        return entertime;
    }

    public void setEntertime(Date entertime) {
        this.entertime = entertime;
    }

    @Override
    public String toString() {
        return "Enter{" +
                "eid=" + eid +
                ", sid=" + sid +
                ", cid=" + cid +
                ", period=" + period +
                ", rebate=" + rebate +
                ", tid=" + tid +
                ", entertime=" + entertime +
                '}';
    }
}
