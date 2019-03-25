package com.ch.oss.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer extone;

    private Integer exttwo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getExtone() {
        return extone;
    }

    public void setExtone(Integer extone) {
        this.extone = extone;
    }

    public Integer getExttwo() {
        return exttwo;
    }

    public void setExttwo(Integer exttwo) {
        this.exttwo = exttwo;
    }
}