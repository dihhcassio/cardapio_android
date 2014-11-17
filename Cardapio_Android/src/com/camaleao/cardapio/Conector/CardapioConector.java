package com.camaleao.cardapio.Conector;

public class CardapioConector extends HttpConect {
	
	public CardapioConector() {
		super("http://10.0.2.2:8080/cardapio");
	}

	
	public boolean logar(String usuario, String senha){
		
		return true;
	}
	
	public static CardapioConector buildConector(){
		return new CardapioConector();
	}
}
