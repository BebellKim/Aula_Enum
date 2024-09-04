package Aula_Enum;

public class PrincipalCarros {

	public static void main(String[] args) {
		
		
		System.out.println("     CARROS     ");
		
		for (Carros carros : Carros.values()) {
			System.out.println("----------");
			System.out.println(carros);
			
		}
	}

}
