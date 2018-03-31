package com.tuna.service;

import com.tuna.entity.Parameter;
import java.util.List;

public interface ParameterService {

    Parameter addParameter(Parameter parameter);
    void delete(long id);
    Parameter getByName(String name);
    Parameter editParameter(Parameter parameter);
    List<Parameter> getAll();

}