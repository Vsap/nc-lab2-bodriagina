package com.tuna.service.impl;

import com.tuna.entity.Attribute;
import com.tuna.repository.AttributeRepository;
import com.tuna.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    private AttributeRepository attributeRepository;

    @Override
    public Attribute addAttribute(Attribute attribute){
        return attributeRepository.saveAndFlush(attribute);
    }

    @Override
    public void delete(long id){
        attributeRepository.delete(id);
    }

    @Override
    public Attribute getByName(String name){
        return attributeRepository.findByName(name);
    }

    @Override
    public Attribute editAttribute(Attribute attribute){
        return attributeRepository.saveAndFlush(attribute);
    }

    @Override
    public List<Attribute> getAll(){
        return attributeRepository.findAll();
    }
}
