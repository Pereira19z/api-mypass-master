package br.fiap.mypass.service;

import br.fiap.mypass.model.Token;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public Token createToken(String username) {
        Algorithm algorithm = Algorithm.HMAC256("secret123");
        String token = JWT.create()
                .withSubject(username)
                .withIssuer("mypass")
                .sign(algorithm);

        return new Token(token, "JWT", username);
    }

}
