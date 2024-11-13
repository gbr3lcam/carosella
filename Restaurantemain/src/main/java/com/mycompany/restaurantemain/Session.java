/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantemain;

/**
 *
 * @author luism
 */
public class Session {
     private static Session instance;
    private Integer userId;  // Armazenando o ID do usuário logado

    // obter a instância da sessão (padrão Singleton)
    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    // definir o ID do usuário (quando o login for bem-sucedido)
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    // obter o ID do usuário
    public Integer getUserId() {
        return this.userId;
    }

    // (fazer logout)
    public void clearSession() {
        this.userId = null;
    }
}

