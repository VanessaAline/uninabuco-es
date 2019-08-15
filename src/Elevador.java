
public class Elevador {
	
	//Atributos\\
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int pessoasNoElevador;
	private int posicaoInicial;
	
	//Construtor\\
	public Elevador() {
		this.posicaoInicial = 0;
		this.pessoasNoElevador = 0;
	}
	
	//Métodos da Classe\\
	public void sobe() {
		if(this.andarAtual > this.totalAndares) {
			System.out.println("Você não pode subir mais!");
		}else {
			this.andarAtual ++;
		}
	}
	
	public void desce() {
		if(this.getAndarAtual() < this.getPosicaoInicial()) {
			System.out.println("Você já esta no Térreo!");
		}else if (this.getAndarAtual() > 0) {
			this.andarAtual --;
		}
	}
	public void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade; 
		this.totalAndares = totalAndares;
	}
	
	public void entra() {
		if(this.getPessoasNoElevador() == this.getCapacidade()) {
			System.out.println("Capacidade Máxima do Elevador!");
		}else {
			this.setPessoasNoElevador(this.getPessoasNoElevador()+1);
		}
	}
	public void sai() {
		if(this.pessoasNoElevador != 0 ) {
			this.setPessoasNoElevador(getPessoasNoElevador()-1);
			System.out.println("Atenção! Pessoas descendo de Elevador");
		}else {
			System.out.println("O elevador esta vazio!");
		}
	}

	//Get´s & Set´s\\
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoasNoElevador() {
		return pessoasNoElevador;
	}

	public void setPessoasNoElevador(int pessoasNoElevador) {
		this.pessoasNoElevador = pessoasNoElevador;
	}

	public int getPosicaoInicial() {
		return posicaoInicial;
	}

	public void setPosicaoInicial(int posicaoInicial) {
		this.posicaoInicial = posicaoInicial;
	}
	
}

