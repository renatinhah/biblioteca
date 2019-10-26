package br.com.aceleradev.domain;

import java.util.Arrays;
import java.util.List;

public class Professor extends UsuarioAutorizavel {

    public Professor(String nome, String login, String cpf) {
        super(nome, login, cpf);
    }

    @Override
    protected List<String> getAutorizacao() {
        return Arrays.asList("PROF");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

}
