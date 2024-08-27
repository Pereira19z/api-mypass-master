package br.fiap.mypass.repository;


import br.fiap.mypass.model.Password;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordRepository extends JpaRepository<Password, Long> {
    Optional<Password> findByUsername(String username);
}
