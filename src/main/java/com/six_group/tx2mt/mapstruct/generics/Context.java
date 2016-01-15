package com.six_group.tx2mt.mapstruct.generics;

public class Context<H extends Id> {

    private H header;

    public H getHeader() {
        return header;
    }

    public void setHeader(H header) {
        this.header = header;
    }
}
