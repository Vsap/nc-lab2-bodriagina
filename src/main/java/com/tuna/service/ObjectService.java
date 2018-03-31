package com.tuna.service;

import java.util.List;
import com.tuna.entity.Object;


public interface ObjectService {
    Object addObject(Object object);
    void delete(long id);
    Object getByName(String name);
    Object editObject(Object object);
    List<Object> getAll();
}
