package com.tuna.service.impl;

import com.tuna.entity.ObjectType;
import com.tuna.repository.ObjectTypeRepository;
import com.tuna.service.ObjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectTypeServiceImpl implements ObjectTypeService {

    @Autowired
    private ObjectTypeRepository objectTypeRepository;

    @Override
    public ObjectType addObjectType(ObjectType objectType) {
        return objectTypeRepository.saveAndFlush(objectType);
    }

    @Override
    public void delete(long id) {
        objectTypeRepository.delete(id);
    }

    @Override
    public ObjectType getByName(String name) {
        return objectTypeRepository.findByName(name);
    }

    @Override
    public ObjectType editObjectType(ObjectType objectType) {
        return objectTypeRepository.saveAndFlush(objectType);
    }

    @Override
    public List<ObjectType> getAll() {
        return objectTypeRepository.findAll();
    }
}