package com.ecommerce.factory;

import com.ecommerce.controller.PingController;
import com.ecommerce.Server;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServerFactory {
    public static Server createServer() {
        final Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        final PingController pingController = new PingController();
        return new Server(gson, pingController);
    }

}
