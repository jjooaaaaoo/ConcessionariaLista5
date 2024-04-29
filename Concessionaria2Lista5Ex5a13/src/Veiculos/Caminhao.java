package Veiculos;

import Motores.Motor;
import Motores.MotorACombustao;

public class Caminhao extends Veiculo{
	private Motor motor = new MotorACombustao();
	private float pesoCarga;
	private float alturaMax;
	private float comprimento;
	
	public Caminhao() {
		super();
	}
	public Caminhao(float pesoEmQuilos, float velocMax, float preco, int eixos, int rodas, Motor motor, float pesoCarga,float alturaMax,float compr) {
		super(pesoEmQuilos, velocMax, preco, eixos, rodas);
		this.motor = motor;
		this.pesoCarga = pesoCarga;
		this.alturaMax = alturaMax;
		this.comprimento = compr;
	}
	public String toString() {
		return "[Peso do veículo=" + super.pesoEmQuilos + "\nvelocMax=" + super.velocMax + "\npreço=" + super.preco + "\neixos="
				+ super.eixos + "\nrodas=" + super.rodas + "\nMotor:"+this.motor.toString() + "\nPeso da carga: "+this.pesoCarga + 
				"\nAltura Máxima permitida: " + this.alturaMax + "\nComprimento do caminhão: " + this.comprimento + "]\n";
	}
	

}
