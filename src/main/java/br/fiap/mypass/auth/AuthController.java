package br.fiap.mypass.auth;

import br.fiap.mypass.model.Password;
import br.fiap.mypass.model.Token;
import br.fiap.mypass.service.AuthService;
import br.fiap.mypass.service.PasswordService;
import br.fiap.mypass.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    AuthService authService;

    @Autowired
    PasswordService passwordService;

    @PostMapping
    public Token login(@RequestBody Password password) {
        return authService.login(password);
    }

}
