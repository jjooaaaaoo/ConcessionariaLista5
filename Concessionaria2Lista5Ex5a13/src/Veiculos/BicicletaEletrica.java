package Veiculos;

import Motores.Motor;
import Motores.MotorEletrico;

public class BicicletaEletrica extends Veiculo {
	private Motor motor = new MotorEletrico();
	private String cor;
	private String modelo;

	public BicicletaEletrica() {
		super();
	}

	public BicicletaEletrica(float pesoEmQuilos, float velocMax, float preco, Motor motor, String cor, String modelo) {
		super(pesoEmQuilos, velocMax, preco, 2, 2);
		this.motor = motor;
		this.cor = cor;
		this.modelo = modelo;
	}

	public String toString() {
		return "[Peso do veículo=" + super.pesoEmQuilos + "\nvelocMax=" + super.velocMax + "\npreço=" + super.preco
				+ "\neixos=" + super.eixos + "\nrodas=" + super.rodas + "\nMotor:" + this.motor.toString() + "\nCor: "
				+ this.cor + "\nModelo: " + this.modelo + "]\n";
	}

}
