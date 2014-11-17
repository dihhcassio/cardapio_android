package com.camaleao.cardapio.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.camaleao.cardapio.R;
import com.camaleao.cardapio.Conector.CardapioConector;

/**
 * Created by adriano on 02/11/14.
 */
public class LoginActivity extends Activity {
	
	private TextView user;
	private TextView pass;
	private Button logar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		this.user = (TextView) findViewById(R.id.login_user);
		this.pass = (TextView) findViewById(R.id.login_pass);
		this.logar = (Button) findViewById(R.id.login_logar);
		
		this.logar.setOnClickListener(getListenerLogar());
	}

	private OnClickListener getListenerLogar() {
		return new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (CardapioConector.buildConector().logar(LoginActivity.this.user.getText().toString(), 
						LoginActivity.this.pass.getText().toString())){
					Intent it = new Intent(LoginActivity.this, MainActivity.class);
					LoginActivity.this.startActivity(it);
				} else
					Toast.makeText(LoginActivity.this, "Não foi possível logar", Toast.LENGTH_LONG).show();				
			}
		};
	}

}
