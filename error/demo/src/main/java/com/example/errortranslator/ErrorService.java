package com.example.errortranslator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Service
public class ErrorService {

    @Autowired
    private ErrorRepository errorRepository;
    public ResponseEntity registerError(Error error, BindingResult result, RedirectAttributes redirectAttributes) {

        return new ResponseEntity<>(errorRepository.save(error), HttpStatus.OK);
    }
}

