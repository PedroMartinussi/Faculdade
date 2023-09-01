package APS;

public abstract class Personagem implements Dialogos{
	protected String nome;
	protected int vida;
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}
	public String getNome() {
		return nome;
		}
	public int getVida() {
		return vida;
		}
	public void setVida(int vida) {
		this.vida = vida;
		}
	public void dano(int ptsDano) {
		vida -= ptsDano;
		System.out.println("Causa " + ptsDano + " de dano.\n");
		if(vida <= 0) {
			System.out.println(nome + " Foi derrtotado!");
		}
	}
}