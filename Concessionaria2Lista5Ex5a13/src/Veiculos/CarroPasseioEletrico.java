package Veiculos;

import Motores.Motor;
import Motores.MotorEletrico;
public class CarroPasseioEletrico extends Veiculo{
	private Motor motor = new MotorEletrico();
	private String cor;
	private String modelo;
	
	public CarroPasseioEletrico() {
		super();
	}
	public CarroPasseioEletrico(float pesoEmQuilos, float velocMax, float preco, int eixos, int rodas, Motor motor,
			String cor, String modelo) {
		super(pesoEmQuilos, velocMax, preco, eixos, rodas);
		this.motor = motor;
		this.cor = cor;
		this.modelo = modelo;
	}
	public String toString() {
		return "[Peso do veículo=" + super.pesoEmQuilos + "\nvelocMax=" + super.velocMax + "\npreço=" + super.preco + "\neixos="
				+ super.eixos + "\nrodas=" + super.rodas + "\nMotor:"+this.motor.toString() + "\nCor: "+this.cor + 
				"\nModelo: " + this.modelo + "]\n";
	}
	
	
	

}
