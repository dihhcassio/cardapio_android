/**
 * 
 */
package com.camaleao.cardapio.Activity;

import com.camaleao.cardapio.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Adriano
 *
 */
public class MainActivity extends Activity {

	
	private Button btPesquisar;
	private TextView txtPesquisar;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		this.btPesquisar = (Button) findViewById(R.id.main_pesquisar);
		this.txtPesquisar = (TextView) findViewById(R.id.main_text);
		
		this.btPesquisar.setOnClickListener(getPesquisarListene);
	}


}
