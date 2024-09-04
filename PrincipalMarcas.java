package Aula_Enum;

public class PrincipalMarcas {

	public static void main(String[] args) {
		
		
		System.out.println("           Marcas de roupa esportivas            "); 
		for (Marcas marcas : Marcas .values()) { // valores
			 System.out.println("----------");
				System.out.println(marcas); //Saída
			
		}

	}

}
