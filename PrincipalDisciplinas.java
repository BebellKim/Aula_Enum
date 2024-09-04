package Aula_Enum;

public class PrincipalDisciplinas {

	public static void main(String[] args) {
		
		
		System.out.println("                     Disciplinas     ");

		for (Disciplinas disciplinas : Disciplinas.values()) {
			System.out.println("----------");
			System.out.println(disciplinas);
		}

	}

}
