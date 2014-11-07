package com.camaleao.cardapio.Conector;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by Adriano on 28/10/2014.
 */
public class HttpConect {

    private String URL;

    public HttpConect(String url) {
        this.URL = url;
    }

    public String get(String metodo){
        HttpClient Client = new DefaultHttpClient();
        try
        {
            HttpGet httpget = new HttpGet(URL + metodo);
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            return Client.execute(httpget, responseHandler);
        }
        catch(Exception ex)
        {
            return "";
        }
    }
}
