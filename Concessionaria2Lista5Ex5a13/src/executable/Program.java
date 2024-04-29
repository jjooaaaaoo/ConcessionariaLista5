package executable;

import Motores.Motor;
import Motores.MotorACombustao;
import Motores.MotorEletrico;
import Veiculos.BicicletaEletrica;
import Veiculos.Caminhao;
import Veiculos.CarroPasseio;
import Veiculos.CarroPasseioEletrico;
import Veiculos.Veiculo;

public class Program {
	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[5];
		Motor[] motores = new Motor[3];
		veiculos[0] = new Veiculo((float)5000,(float)150,(float)45.600,2,4);
		veiculos[1] = new CarroPasseio((float)4900,(float)150,(float)54.640,2,4,new MotorACombustao((float)150,200,(float)200),"preto","siena");
		veiculos[2] = new CarroPasseioEletrico((float)5000,(float)150,(float)45.600,2,4,new MotorEletrico((float)150,200,(float)200,(float)150),"rosa","civic");
		veiculos[3] = new Caminhao((float)50000,(float)100,(float)450.690,12,24,new MotorACombustao((float)800,450,(float)2000),(float)12,(float)6.5,22);
		veiculos[4] = new BicicletaEletrica((float)130,(float)150,(float)12000,new MotorEletrico((float)150,200,(float)200,(float)150),"azul","caloi");
		
		motores[0] = new Motor((float)150,200);
		motores[1] = new MotorACombustao((float)150,200,(float)200);
		motores[2] = new MotorEletrico((float)150,200,(float)2000,(float)200);
		
		for(int i = 0;i<3;i++) {
			System.out.println(motores[i].toString());
		}
		for(int i = 0;i<5;i++) {
			System.out.println(veiculos[i].toString());
		}
		//testando os métodos
		veiculos[1].acelerar(50);
		System.out.println(veiculos[1].toString());
		veiculos[1].parar();
		System.out.println(veiculos[1].toString());
		//downcasting das instâncias pra conseguir chamar o método
		MotorEletrico teste = (MotorEletrico)motores[2];
		teste.carregarBateria(200);
		System.out.println(teste.toString());
		
		MotorACombustao teste2 = (MotorACombustao)motores[1];
		teste2.trocarOleo(250);
		System.out.println(teste2.toString());
	}
}
