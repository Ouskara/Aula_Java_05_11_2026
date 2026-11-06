package aula_05_11_2026;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Motor motor = new Motor("Fundido");
		Carro carro = new Carro("Gol Quadrado", motor);
		
		System.out.println("Motor do carro: " + motor.getTipo() + "\nModelo: " + carro.getModelo());
	}

}
