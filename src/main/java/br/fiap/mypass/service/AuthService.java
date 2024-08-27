package br.fiap.mypass.service;

import br.fiap.mypass.model.Password;
import br.fiap.mypass.model.Token;
import br.fiap.mypass.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, TokenService tokenService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
    }

    public Token login(Password password) {
        // Acha pelo username. Se não, retorna um "Acesso negado".
        var user = userRepository.findByUsername(password.getUsername())
                .orElseThrow(() -> { return new RuntimeException("Access Denied"); } );

        // Se a senha não bate com a do banco, retorna um "Acesso negado".
        if (!passwordEncoder.matches(password.getPassword(), user.getPassword()))
            throw new RuntimeException("Access Denied");

        return tokenService.createToken(password.getUsername());
    }

}
