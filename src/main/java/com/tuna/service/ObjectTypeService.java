package com.tuna.service;

import com.tuna.entity.ObjectType;

import java.util.List;

public interface ObjectTypeService {
    ObjectType addObjectType(ObjectType objectType);
    void delete(long id);
    ObjectType getByName(String name);
    ObjectType editObjectType(ObjectType objectType);
    List<ObjectType> getAll();

}
