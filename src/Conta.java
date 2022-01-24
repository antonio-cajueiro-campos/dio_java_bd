public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected Tipo tipo;
	protected int agencia;
	protected int numero;
	protected Cliente cliente;
	protected double saldo;

	public Conta(Cliente cliente, Tipo tipo) {
		this.tipo = tipo;
		this.cliente = cliente;
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Conta conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", cliente=" + cliente + ", numero=" + numero + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}


	
}
