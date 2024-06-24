package com.janigeek.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Convertir {
    private double conversion;
    public double Convert(String entrada, String Salida) throws IOException, InterruptedException {
        String direction = "https://v6.exchangerate-api.com/v6/c1c0e8dab5339476be1a5bb0/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direction))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException(e);
        }
        String json = response.body();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        conversion = jsonObject.get("conversion_rates").getAsJsonObject().get(Salida).getAsDouble();

        System.out.println(conversion);

        return conversion;

    }
}
