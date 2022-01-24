import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> listaContas = new ArrayList<>();

	public Banco() {}

	public Banco(String nome) {
		this.nome = nome;
	}

	public void cadastrarConta(Conta conta) {
		this.listaContas.add(conta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Banco [Contas cadastradas=" + listaContas + ", nome do banco=" + nome + "]";
	}

	
}


