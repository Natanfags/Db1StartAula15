package br.com.db1.db1Start.comportamento;

public class Cliente extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		return "ClIENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}
	
}
