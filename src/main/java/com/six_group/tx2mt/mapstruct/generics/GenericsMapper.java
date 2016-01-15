package com.six_group.tx2mt.mapstruct.generics;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface GenericsMapper {

    // This mapping fails with a NPE during annotation processing
    @Mapping(target = "id", source = "header.id")
    Target map(Context<Header> context);

    // This mapping is fine
    @Mapping(target = "id", source = "header.id")
    Target map(HeaderContext context);
}
