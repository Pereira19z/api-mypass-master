package br.fiap.mypass.controller;

import br.fiap.mypass.model.Password;
import br.fiap.mypass.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pass")
public class PasswordController {

    @Autowired
    PasswordService passwordService;

    @GetMapping
    public List<Password> get() {
        return passwordService.findAll();
    }




}