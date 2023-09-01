package APS;
import java.util.Scanner;
public class JogoRPG {

	public static void main(String[] args) {

		CodTXT codTxt = new CodTXT("Gema", "Poluidor");
		Heroi heroi = new Heroi("Gema", 100, 10);
		Inimigo inimigo = new Inimigo("Poluidor", 200);
		
		System.out.println("Bem vindo �s Aventuras de Pinu!");
        System.out.println("Voc� � o her�i Pinu!");
        System.out.println("Pronto para salvar a grande metr�pole?");
        Scanner scanner = new Scanner(System.in);
			int opcao;
	        while (true) {
	            System.out.println("\nPara 'sim' digite 1, para 'n�o' digite 2");
	            if (scanner.hasNextInt()) {
	                opcao = scanner.nextInt();
	                switch (opcao) {
	           case 1:
	            System.out.println("\nSabia que podia contar com voc�!");
	            break;
	           case 2:
	             System.out.println("Infelizmente voc� n�o tem escapat�ria!");
	              continue;
	           default:
	             System.out.println("Op��o inv�lida");
	              continue;
	        }
	          break;
	      } else {
	         System.out.println("Op��o inv�lida. Insira um n�mero inteiro.");
	         scanner.nextLine();
	    }
	}
        System.out.println("\nPinu estava saindo de casa, pronto para mais um dia poder ajudar o planeta com seu amor a natureza");
        System.out.println("At� que Pinu percebe que tinha algo estranho em sua cidade, o clima estava mais seco e o c�u mais cinza, e ele v� uma fuma�a estranha vindo de uma casa.");
        System.out.println("\nChegando l� n�o parecia ser nada demais, al�m de ser uma casa de madeira com uma chamin� absurdamente grande, e dela saindo uma quantidade MASSIVA de fuma�a!");
        System.out.println("Pinu ent�o bate na porta, por�m ela estava destrancada e acaba abrindo porta. 'Poxa eu juro que foi sem querer!' disse Pinu. Mas ent�o vem uma incr�vel Sombra preta em seu caminho");
        System.out.println("Em p�nico Pinu n�o faz ideia de que tipo de se � aquele, com um formato da pr�pria fuma�a que saia de sua casa. Logo a criatura fala");
        System.out.println("\n???: O que um ser humano pat�tico faz em meu rescinto?! Voc� pagar� por isso!");
        System.out.println("\nPor sorte Pinu sempre anda com seu estilingue e seu caderno em sua mochila, ent�o antes mesmo da criatura encostar nele, Pinu pega seu caderno de matem�tica e se defende usando como um escudo.");
        System.out.println("Ent�o com seu estilingue em m�os parte pra fazer o ataque, mas antes disso a criatura diz 'Eu o Poluidor irei te derrotar e voltar ao meu plano de polui��o mundial hahahahaha'" + "\n");
       
        
        int escolha;

        do {
            System.out.println("Escolha uma a��o:");
            System.out.println("1 - Ataque b�sico");
            System.out.println("2 - Gritar em p�nico");
            System.out.println("3 - Usar conhecimentos");
            System.out.println("4 - Cura");

           if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                switch (escolha) {
            case 1:
              heroi.ataqueBasico(inimigo);
               break;
 			case 2:
              heroi.ataqueGrito(inimigo);
               break;
			case 3:
              heroi.ataqueEfetivo(inimigo);
               break;
 			case 4:
              heroi.curar();
               break;
 			default:
              System.out.println("Op��o inv�lida. Escolha novamente.");
               continue;
                }

                if (inimigo.getVida() <= 0) {
                	 codTxt.conversarV(heroi, inimigo);
                	 System.out.println("\n\nVoc� conseguiu, sua pontua��o final �: " + heroi.getPontuacao());
                    break;
                }

                inimigo.atacar(heroi);
                if (heroi.getVida() <= 0) {
                	codTxt.conversarD(heroi, inimigo);
                	System.out.println("Voc� falhou! Sua pontua��o final � 0");
                    break;
                }
            } else {
                System.out.println("Op��o inv�lida. Insira um n�mero inteiro.");
                scanner.nextLine();
            }
        } while (true);    
        scanner.close();    
     }
}
