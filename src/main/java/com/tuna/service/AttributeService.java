package com.tuna.service;

import com.tuna.entity.Attribute;

import java.util.List;

public interface AttributeService {
    Attribute addAttribute(Attribute attribute);
    void delete(long id);
    Attribute getByName(String name);
    Attribute editAttribute(Attribute attribute);
    List<Attribute> getAll();
}
