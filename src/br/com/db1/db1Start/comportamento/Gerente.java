package br.com.db1.db1Start.comportamento;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		return "GERENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
