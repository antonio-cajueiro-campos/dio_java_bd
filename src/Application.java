public class Application {

	public static void main(String [] args)  {

		Banco banco = new Banco("Santander");
		
		Conta conta1 = new ContaCorrente(new Cliente("Antonio"));
		Conta conta2 = new ContaPoupanca(new Cliente("Carlos"));
		
		System.out.println(banco);

		banco.cadastrarConta(conta1);
		banco.cadastrarConta(conta2);

		conta1.depositar(50.00);
		conta2.depositar(70.00);

		System.out.println(conta1);
		System.out.println(conta2);

		conta1.transferir(conta2, 10.00);

		System.out.println(conta1);
		System.out.println(conta2);

		System.out.println(banco);
	}
}