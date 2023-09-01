package APS;

public class Heroi extends Personagem {
	private int pontuacao;
	private int atqsFeitos;
	
	public Heroi(String nome, int vida, int pontuacao) {
		super(nome, vida); 
		this.pontuacao = 100;
		this.atqsFeitos = 0;
	}
	public int getPontuacao() {
		return pontuacao;
	}
		 private void calcularPontuacao() {
	        pontuacao = 100 - (atqsFeitos * 2);
	        }
    public void ataqueBasico(Inimigo inimigo) {
        System.out.println("\n" + nome + " Atira com seu estilingue no " + inimigo.getNome() + ".");
        inimigo.dano(10);
        System.out.println("O ataque n�o pareceu ser muito efetivo.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void ataqueGrito(Inimigo inimigo) {
        System.out.println("\n" + nome + " Grita por socorro.");
        inimigo.dano(0);
        System.out.println(inimigo.getNome() + " Ri da sua cara.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void ataqueEfetivo(Inimigo inimigo) {
        System.out.println("\n" + nome + " Come�a a tentar convencer que a polui��o do " + inimigo.getNome() + " n�o faz bem para o mundo, e ensina t�cnicas de reciclagem e sustentabilidade.");
        inimigo.dano(50);
        System.out.println("Voc� parece estar convencendo ele.");
        atqsFeitos++;
        System.out.println("Poluidor tem " + inimigo.getVida() + " pontos de vida.\n");
        calcularPontuacao();
    }

    public void curar() {
        System.out.println("\n" + nome + " Faz um post em seu Blog sobre a import�ncia das �rvores no mundo.");
        vida += 5;
        System.out.println("N�o surte efeito no Poluidor, mas voc� se sente melhor.\n");    
    }

	@Override
	public void dialogarV() {
		System.out.println("Ah�, voc� achou que s� por que era a polui��o encarnada iria me derrotar?");
		System.out.println("Pois achou errado! Todo mundo com muita dedica��o e conhecimento consegue batalhar a polui��o do mundo inteiro.");
		System.out.println("Quem sabe na pr�xima voc� se lembre que uma pessoa com a educa��o ambiental atualizada � extremamente superior.");
		System.out.println("Por isso mesmo posto sempre milhoes de novidades no meu Blog, para ajudar n�o s� esse planeta, como muitas outras pessoas!");
	}
	
	@Override
	public void dialogarD() {
		System.out.println("O que? n�o � poss�vel que eu deixei a polui��o ganhar.");
		System.out.println("Eu deveria ter lido mais sobre a educa��o ambiental!!!");
	}
	
    @Override
    public String getNome() {
        return nome;
    }
}

