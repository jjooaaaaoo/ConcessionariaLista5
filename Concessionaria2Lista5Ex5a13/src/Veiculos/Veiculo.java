package Veiculos;

public class Veiculo {
	protected float pesoEmQuilos;
	protected float velocMax;
	protected float preco;
	protected int eixos;
	protected int rodas;
	
	public Veiculo() {
	}
	public Veiculo(float pesoEmQuilos, float velocMax, float preco, int eixos, int rodas) {
		this.pesoEmQuilos = pesoEmQuilos;
		this.velocMax = velocMax;
		this.preco = preco;
		this.eixos = eixos;
		this.rodas = rodas;
	}
	public void acelerar(float velocidade) {
		this.velocMax += this.velocMax*velocidade/100;
	}
	public void parar() {
		this.velocMax = 0;
	}
	public String toString() {
		return "[Peso do veículo=" + this.pesoEmQuilos + "\nvelocMax=" + this.velocMax + "\npreço=" + this.preco + "\neixos="
				+ this.eixos + "\nrodas=" + this.rodas + "]\n";
	}
	
}
