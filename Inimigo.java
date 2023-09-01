package APS;

public class Inimigo extends Personagem{

	public Inimigo(String nome, int vida) {
				super(nome, vida);
	}
	
	 public void atacar(Heroi heroi) {
	        System.out.println(nome + " Joga uma bola preta de fuma�a em " + heroi.getNome() + ", voc� se sente sufocado.");
	        heroi.dano(10);
	        System.out.println("Voc� tem " + heroi.getVida() + " pontos de vida.\n\n");
	 }
	@Override
	public void dialogarV() {
		System.out.println("Aaarrgghh!");
		System.out.println("n�o � poss�ve.... ");
		System.out.println("\nFim de jogo!");
	}

	@Override
	public void dialogarD() {
		System.out.println("Muahahaha, ser humano pat�tico.");
		System.out.println("Agora vai ver o que a falta de conhecimento faz com o seu planeta.");
		System.out.println("\n O mundo entra em colapso pela quantidade de lixo e gases que se tem nele.");
	}
    
	@Override
    public String getNome() {
        return nome;
    }
}
