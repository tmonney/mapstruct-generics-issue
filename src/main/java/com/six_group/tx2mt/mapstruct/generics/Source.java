package com.six_group.tx2mt.mapstruct.generics;

public class Source<C> {

    private C contents;

    public C getContents() {
        return contents;
    }

    public void setContents(C contents) {
        this.contents = contents;
    }
}
