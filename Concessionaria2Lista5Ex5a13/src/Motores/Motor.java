package Motores;

public class Motor {
	protected float consumo;
	protected int potencia;
	
	public Motor() {
		
	}
	public Motor(float c,int p) {
		this.consumo = c;
		this.potencia = p;
	}
	
	public String toString() {
		String resultado;
		resultado = "Consumo: "+this.consumo+"\nPotência: "+String.format("%d\n",this.potencia);
		return resultado;
	}
}
