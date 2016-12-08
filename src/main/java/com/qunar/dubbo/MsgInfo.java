package com.qunar.dubbo;

import java.io.Serializable;
import java.util.List;
/**
 * Created by dayong.gao on 2016/12/7.
 */
public class MsgInfo implements Serializable {

    private static final long serialVersionUID = 475340319429306958L;
    private int id;
    private String name;
    private List<String> msgs;
    public int getId() {
        return id;
    }
    public void setId(int id) {

        this.id= id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public List<String> getMsgs() {
        return msgs;
    }
    public void setMsgs(List<String> msgs) {
        this.msgs= msgs;
    }
    @Override
    public String toString() {
        return "MsgInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", msgs=" + msgs +
                '}';
    }
}

