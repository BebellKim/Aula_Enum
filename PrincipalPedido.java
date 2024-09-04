package Aula_Enum;

public class PrincipalPedido {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.Aberto;
		StatusPedido status1 = StatusPedido.Em_Andamento;
		StatusPedido status2 = StatusPedido.Entregue;
		StatusPedido status3 = StatusPedido.Cancelado;

		System.out.println(status); // Aberto
		System.out.println(status1); // Em Andamento
		System.out.println(status2); // Entregue
		System.out.println(status3); // Cancelado


	}

}
