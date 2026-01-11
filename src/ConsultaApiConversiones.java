import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApiConversiones {

    public ConversionRate convertirMoneda(String parDeConvecion){
        String apiKey = "db5d6f1593bafdebc76a4b85";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+parDeConvecion+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversionRate.class);
        } catch (Exception e) {
            throw new RuntimeException("No pude convertir la moneda.");
        }
    }



}
