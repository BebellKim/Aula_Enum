package Aula_Enum;

public class PrincipalNomes {

	public static void main(String[] args) {


		System.out.println("                       Nomes     ");

		for (Nomes nomes : Nomes.values()) {
			System.out.println("----------");
			System.out.println(nomes);
		}


	}

}
