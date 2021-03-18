package br.com.concessionariaxyz.teste;

import br.com.concessionariaxyz.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherCor("  azul  ");
		System.out.println(objeto.retornarCor());
		objeto.preencherMontadora("  vw  ");
		System.out.println(objeto.retornarMontadora());
		objeto.preencherValor(69990);
		System.out.println(objeto.retornarValor());
		System.out.println();		
		System.out.println(objeto.toString());
		System.out.println(objeto.retornarDesconto());
		System.out.println("Desconto 10%: "+ objeto.retornarDesconto());

		System.out.println("Desconto X%: " + objeto.retornarDesconto(20));
		
	
		
		
		
		
		
	}

}
