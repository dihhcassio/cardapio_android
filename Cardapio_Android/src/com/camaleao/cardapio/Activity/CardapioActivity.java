package com.camaleao.cardapio.Activity;

import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.camaleao.cardapio.R;
import com.camaleao.cardapio.Conector.HttpConect;
import com.camaleao.cardapio.Entity.Usuario;
import com.camaleao.cardapio.Utils.Logger;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class CardapioActivity extends ActionBarActivity {

    private final String LOG = "CARDAPIO";
    TextView tvIsConnected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cardapio);
//
//        tvIsConnected = (TextView) findViewById(R.id.cardapio_texto);

        HttpConect http = new HttpConect("http://10.0.2.2:8080/cardapio");
        String json = http.get("/usuario/getAll");
        Logger.sendLog(json);
        List<Usuario> usuarios = new Gson().fromJson(json, new TypeToken<List<Usuario>>() {
        }.getType());
        String texto = "";
        Logger.sendLog("Tamanho: "+ usuarios.size());
        for (Usuario usuario : usuarios)
        {
            texto =texto + ", "+ usuario.getNome();
        }
        tvIsConnected.setText(texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.cardapio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
