package com.ecommerce;

import com.ecommerce.controller.PingController;
import com.google.gson.Gson;

import static spark.Spark.*;

public class Server {
    private final Gson gson;
    private final PingController pingController;

    public Server(Gson gson, PingController pingController) {
        this.gson = gson;
        this.pingController = pingController;
    }


    void start() {
        get("/ping", pingController::ping, gson::toJson);

    }
}
