package com.example.application.ApplicationServer;
import lombok.Data;

@Data
public class player {
    private int userId; //ユーザID
    private int expectedCredits; //取得予定単位
    private int earnedCredits; //取得単位
    private int doubleDiceCount;    // ダブルダイスの目
    private int justDiceCount;  //ジャストダイスの目
    private int currentPlace; //現在の場所
    private boolean isSkipped; //スキップ判定
}

   