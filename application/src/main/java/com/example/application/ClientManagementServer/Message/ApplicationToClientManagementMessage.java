package com.example.application.ClientManagementServer.Message;

import lombok.Getter;

@Getter
public class ApplicationToClientManagementMessage {
    public String taskName = "MATCH_FOUND";
    public String matchId;
    public String roomId;

    public ApplicationToClientManagementMessage(String matchId, String roomId) {
        this.matchId = matchId;
        this.roomId = roomId;
    }
}