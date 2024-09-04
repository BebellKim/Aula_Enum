package Aula_Enum;

public class PrincipalMes {

	public static void main(String[] args) {

		System.out.println("                     Meses                      ");
		for (Mes mes : Mes.values()) { // valores que estão no enum mes(values)
			System.out.println("----------");
			System.out.println(mes); //Saída
		}

	}

}
