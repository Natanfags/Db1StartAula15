package br.com.db1.db1Start.comportamento;

import org.junit.Test;

public class AutenticavelTest {
	
	@Test
	public void exemploTest() {
		Cliente cliente = new Cliente() ;
		System.out.println(cliente.autenticar());
	
		Diretor diretor = new Diretor();
		System.out.println(diretor.autenticar());
		
		Gerente gerente = new Gerente();
		System.out.println(gerente.autenticar());
	}
	
	@Test
	public void exemploInterface() {
		exibirMensagemDeAutenticacao(new Gerente());
		exibirMensagemDeAutenticacao(new Diretor());
		exibirMensagemDeAutenticacao(new Cliente());
		
	}
	
	private void exibirMensagemDeAutenticacao(Autenticavel autenticavel) {
		System.out.println(autenticavel.autenticar());
	}
	
}
