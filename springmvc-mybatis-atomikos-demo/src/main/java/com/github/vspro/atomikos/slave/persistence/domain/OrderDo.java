package com.github.vspro.atomikos.slave.persistence.domain;

public class OrderDo {
    private Integer id;

    private String name;

    private Boolean optDelete;

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getOptDelete() {
        return optDelete;
    }

    public void setOptDelete(Boolean optDelete) {
        this.optDelete = optDelete;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}