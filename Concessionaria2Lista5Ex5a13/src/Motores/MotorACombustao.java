package Motores;

public class MotorACombustao extends Motor{
	protected float litros;
	
	public MotorACombustao() {
		super();
	}
	public MotorACombustao(float c,int p,float l) {
		super(c,p);
		this.litros = l;
	}
	
	public float trocarOleo(float oleoNovo) {
		return this.litros = oleoNovo;
	}
	public String toString() {
		String resultado;
		resultado = "Consumo: "+super.consumo+"\nPotência: "+super.potencia
					+"\nLitros de óleo: "+String.format("%.0f\n",this.litros);
		return resultado;
	}
}
