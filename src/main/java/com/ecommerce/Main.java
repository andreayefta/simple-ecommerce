package com.ecommerce;

import com.ecommerce.factory.ServerFactory;
import spark.Spark;

import java.util.TimeZone;

import static java.time.ZoneOffset.UTC;

public class Main {

    public static void main(final String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone(UTC));

        Server server = ServerFactory.createServer();
        server.start();

        // DBIFactory.close();
        Runtime.getRuntime().addShutdownHook(new Thread(Spark::stop));
    }
}
