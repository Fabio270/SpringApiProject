package com.trabalhofinal.parte1.controller;

import com.trabalhofinal.parte1.usuario.DadosAutenticacao;
import com.trabalhofinal.parte1.usuario.Usuario;
import com.trabalhofinal.parte1.util.security.DadosTokenJWT;
import com.trabalhofinal.parte1.util.security.PW3TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {
    @Autowired
    private AuthenticationManager manager; // Objeto AuthenticationManager,
    // que será injetado aqui.
    @Autowired
    private PW3TokenService tokenService;
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
        var token = new UsernamePasswordAuthenticationToken( dados.login(), dados.senha() );
        var authentication = manager.authenticate(token);
        var tokenJWT = tokenService.gerarToken( (Usuario) authentication.getPrincipal() );

        return ResponseEntity.ok( new DadosTokenJWT(tokenJWT) );
    }
}


