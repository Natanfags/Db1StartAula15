package br.com.db1.db1Start.comportamento;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		return "DIRETOR AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
