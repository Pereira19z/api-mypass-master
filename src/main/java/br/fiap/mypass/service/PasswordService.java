package br.fiap.mypass.service;

import br.fiap.mypass.model.Password;
import br.fiap.mypass.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordService {

    @Autowired
    PasswordRepository passwordRepository;

    public List<Password> findAll() {
        return passwordRepository.findAll();
    }

}
