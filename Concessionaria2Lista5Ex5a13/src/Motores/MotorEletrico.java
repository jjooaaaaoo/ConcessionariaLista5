package Motores;

public class MotorEletrico extends Motor{
	protected float capacidadeDaBateria;
	protected float watts;
	
	public MotorEletrico() {
		super();
	}
	public MotorEletrico(float c, int p, float capacidadeDaBateria, float watts) {
		super(c, p);
		this.capacidadeDaBateria = capacidadeDaBateria;
		this.watts = watts;
	}
	public float carregarBateria(float watts) {
		return this.capacidadeDaBateria += watts;
	}
	public String toString() {
		String resultado;
		resultado = "Consumo: "+this.consumo+"\nPotência: "+this.potencia
				+"\nCapacidade da bateria: "+String.format("%.1f\n",this.capacidadeDaBateria);
		return resultado;
	}
}
