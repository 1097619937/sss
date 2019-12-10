package com.sram.common;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import java.util.List;

public class ResponseResulu<T> {
    private Boolean flag;
    private String code;
    private T user;
    private List<T> userList;

    public ResponseResulu(Boolean flag, String code) {
        this.flag = flag;
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "ResponseResulu{" +
                "flag=" + flag +
                ", code='" + code + '\'' +
                ", user=" + user +
                ", userList=" + userList +
                '}';
    }
}
