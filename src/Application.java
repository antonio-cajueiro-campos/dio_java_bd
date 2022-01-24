public class Application {

	public static void main(String [] args)  {

		Conta conta1 = new ContaCorrente(new Cliente("Antonio"));
		conta1.depositar(50.00);

		Conta conta2 = new ContaPoupanca(new Cliente("Carlos"));
		conta2.depositar(70.00);

		System.out.println(conta1);
		System.out.println(conta2);

		conta1.transferir(conta2, 10.00);

		System.out.println(conta1);
		System.out.println(conta2);
	}
}