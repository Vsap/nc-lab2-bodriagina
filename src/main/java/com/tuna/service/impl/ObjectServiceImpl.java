package com.tuna.service.impl;

import com.tuna.entity.Object;
import com.tuna.repository.ObjectRepository;
import com.tuna.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectServiceImpl implements ObjectService {
    @Autowired
    private ObjectRepository objectRepository;

    @Override
    public Object addObject(Object object){
        return objectRepository.saveAndFlush(object);
    }

    @Override
    public void delete(long id){
        objectRepository.delete(id);
    }

    @Override
    public Object getByName(String name){
        return objectRepository.findByName(name);
    }

    @Override
    public Object editObject(Object object){
        return objectRepository.saveAndFlush(object);
    }

    @Override
    public List<Object> getAll(){
        return objectRepository.findAll();
    }
}
