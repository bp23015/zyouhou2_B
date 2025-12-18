package com.example.application.ApplicationServer;

public class PlayerNotifier {
    private int userId;

    public void notifyTurn(int userId) {
        this.userId = userId;
    }

    public void notifySkip(int userId) {
        this.userId = userId;
    }

}
