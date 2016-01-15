package com.six_group.tx2mt.mapstruct.generics;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface GenericsMapper {

    // This mapping fails with a NPE during annotation processing
    @Mapping(target = "data", source = "contents.data")
    Target mapGeneric(Source<Contents> source);

    // This mapping is fine
    @Mapping(target = "data", source = "contents.data")
    Target mapSpecialized(ContentsSource source);
}
