package com.ecommerce.controller;

import org.apache.http.HttpStatus;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class PingController {
    public Map<String, String> ping(final Request request, final Response response) {
        response.status(HttpStatus.SC_OK);
        final HashMap<String, String> result = new HashMap<>();
        result.put("ping", "message");
        return result;
    }
}
