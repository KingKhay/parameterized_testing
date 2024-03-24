package com.ebenezer.converter;

import com.ebenezer.EmployeeRole;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class EmployeeRoleConverter implements ArgumentConverter {

    @Override
    public Object convert(Object o, ParameterContext parameterContext) throws ArgumentConversionException {
        if(!(o instanceof String)){
            throw new IllegalArgumentException("The argument should be a string");
        }
        try{
            return EmployeeRole.valueOf((String) o);
        }catch(Exception e){
            throw new IllegalArgumentException("Could not convert to EmployeeRole");
        }
    }
}
