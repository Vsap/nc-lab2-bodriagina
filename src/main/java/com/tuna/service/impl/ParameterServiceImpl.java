package com.tuna.service.impl;

import com.tuna.entity.Parameter;
import com.tuna.repository.ParameterRepository;
import com.tuna.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import com.tuna.entity.Object;


import java.util.List;

public class ParameterServiceImpl implements ParameterService {
    @Autowired
    private ParameterRepository parameterRepository;


    @Override
    public Parameter addParameter(Parameter parameter){
        return parameterRepository.saveAndFlush(parameter);
    }

    @Override
    public void delete(long id){
        parameterRepository.delete(id);
    }

    @Override
    public Parameter getByName(String name){
        return parameterRepository.findByName(name);
    }

    @Override
    public Parameter editParameter(Parameter parameter){
        return parameterRepository.saveAndFlush(parameter);
    }

    @Override
    public List<Parameter> getAll(){
        return parameterRepository.findAll();
    }
    public List<Parameter> getAllByObjectId(Long object_id){
        return parameterRepository.findAllByObjectId(object_id);
    }
    public List<Parameter> getAllByObject(Object object){
        return parameterRepository.findAllByObjectId(object.getId());
    }
    public Parameter getByAttrAndObj(Long attr_id, Long object_id){
        return parameterRepository.findByAttributeAndObject(object_id, attr_id);
    }

}
