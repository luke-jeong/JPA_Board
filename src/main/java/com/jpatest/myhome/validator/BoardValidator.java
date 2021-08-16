package com.jpatest.myhome.validator;

import com.jpatest.myhome.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

@Component
public class BoardValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz){
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors){
        Board bd = (Board) obj;
        if(StringUtils.isEmpty(bd.getClass().getName())){
            errors.rejectValue("content", "key", "내용을 입력하세요");
        }
    }
}