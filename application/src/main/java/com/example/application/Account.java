package com.example.application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // ← 「これはデータベースのテーブルですよ」という目印
public class Account {

    @Id // ← 「これがID（主キー）ですよ」という目印
    private String username;
    
    private String password;

    // 必須：空のコンストラクタ
    public Account() {}

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}