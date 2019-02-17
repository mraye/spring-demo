package com.github.vspro.atomikos.master.persistence.domain;

public class UserDo {
    private Integer id;

    private String userName;

    private String mobile;

    private Boolean optDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getOptDelete() {
        return optDelete;
    }

    public void setOptDelete(Boolean optDelete) {
        this.optDelete = optDelete;
    }
}