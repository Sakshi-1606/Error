package com.example.errortranslator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RestController
public class ErrorController {

    @Autowired
    private ErrorRepository errorRepository;

    @Autowired
    private ErrorService errorService;


    @GetMapping("/error")
    public String showError() {
        return "error.html";
    }

    @PostMapping("/error")
    public ModelAndView registerError(@ModelAttribute("error") @RequestBody Error error, BindingResult result, RedirectAttributes redirectAttributes) {

        ModelAndView model = new ModelAndView("redirect:/error");
        errorService.registerError(error, result, redirectAttributes);
        return model;
    }

    }
