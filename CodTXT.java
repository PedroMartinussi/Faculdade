package APS;

public class CodTXT {
    private String heroiNome;
    private String inimigoNome;

    public CodTXT(String heroiNome, String inimigoNome) {
        this.heroiNome = heroiNome;
        this.inimigoNome = inimigoNome;
    }

    public String getHeroiNome() {
        return heroiNome;
    }

    public String getInimigoNome() {
        return inimigoNome;
    }
    public void conversarV(Dialogos Personagem1, Dialogos Personagem2) {
        System.out.println(Personagem1.getNome() + ":");
        Personagem1.dialogarV();
        System.out.println("\n" + Personagem2.getNome() + ":");
        Personagem2.dialogarV();
    }
    public void conversarD(Dialogos Personagem1, Dialogos Personagem2) {
        System.out.println(Personagem1.getNome() + ":");
        Personagem1.dialogarD();
        System.out.println("\n" + Personagem2.getNome() + ":");
        Personagem2.dialogarD();
    }
}
