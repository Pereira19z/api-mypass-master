package br.fiap.mypass.model;

public record Token (
        String token,
        String type,
        String username
) {}