package com.six_group.tx2mt.mapstruct.generics;

public class Header implements Id {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
