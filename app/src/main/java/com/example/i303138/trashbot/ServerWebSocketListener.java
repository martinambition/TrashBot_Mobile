package com.example.i303138.trashbot;

import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/**
 * Created by i303138 on 6/8/19.
 */
public final class ServerWebSocketListener extends WebSocketListener {
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    @Override
    public void onOpen(WebSocket webSocket, Response response) {

    }
    @Override
    public void onMessage(WebSocket webSocket, String text) {

    }
    @Override
    public void onMessage(WebSocket webSocket, ByteString bytes) {

    }
    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
        webSocket.close(NORMAL_CLOSURE_STATUS, null);

    }
    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {

    }
}