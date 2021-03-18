package br.com.concessionariaxyz.modelo;

public class Veiculo {
	
	private String cor;
	private String montadora;
	private float valor;
	
	// <modificador> <tipo do retorno> <nome do metodo> (<Tipo Param> <nome parametro>)
	public float retornarDesconto(float porcentagem) {
		
		return valor - valor * (porcentagem /100);
	}
	public float retornarDesconto() {
		//return  (float) (valor * 0.9);
		return valor * (float) 0.9;
	}
	
	public String toString() {
		return "Cor:" +cor  + "\n"+ "Montadora:" +montadora +"\n" + "Valor:" +valor;
				
	}
	
		
	
	public void preencherValor(float param) {
		if (param>0){
		valor = param;}
	}
	public float retornarValor() {
		return valor;
	}
	
	public void preencherMontadora(String param) {
		if (param.length()>=2){
		montadora = param.toUpperCase();}
	}
	public String retornarMontadora() {
		return montadora;
	}
	
	public String retornarCor() {
		return cor;
	}
	public void preencherCor(String param) {
		if (param.length()>2){
		cor = param.toUpperCase();}
		
	
		
	}

}
