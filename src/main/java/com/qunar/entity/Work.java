package com.qunar.entity;

/**
 * Created by dayong.gao on 2016/11/30.
 */
public class Work {
    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Work(int id, String worktype) {
        this.id = id;
        this.worktype = worktype;
    }

    int id;
    String worktype;
}
