package APS;
import java.util.Scanner;
public class JogoRPG {

	public static void main(String[] args) {

		CodTXT codTxt = new CodTXT("Gema", "Poluidor");
		Heroi heroi = new Heroi("Gema", 100, 10);
		Inimigo inimigo = new Inimigo("Poluidor", 200);
		
		System.out.println("Bem vindo ás Aventuras de Pinu!");
        System.out.println("Você é o herói Pinu!");
        System.out.println("Pronto para salvar a grande metrópole?");
        Scanner scanner = new Scanner(System.in);
			int opcao;
	        while (true) {
	            System.out.println("\nPara 'sim' digite 1, para 'não' digite 2");
	            if (scanner.hasNextInt()) {
	                opcao = scanner.nextInt();
	                switch (opcao) {
	           case 1:
	            System.out.println("\nSabia que podia contar com você!");
	            break;
	           case 2:
	             System.out.println("Infelizmente você não tem escapatória!");
	              continue;
	           default:
	             System.out.println("Opção inválida");
	              continue;
	        }
	          break;
	      } else {
	         System.out.println("Opção inválida. Insira um número inteiro.");
	         scanner.nextLine();
	    }
	}
        System.out.println("\nPinu estava saindo de casa, pronto para mais um dia poder ajudar o planeta com seu amor a natureza");
        System.out.println("Até que Pinu percebe que tinha algo estranho em sua cidade, o clima estava mais seco e o céu mais cinza, e ele vê uma fumaça estranha vindo de uma casa.");
        System.out.println("\nChegando lá não parecia ser nada demais, além de ser uma casa de madeira com uma chaminé absurdamente grande, e dela saindo uma quantidade MASSIVA de fumaça!");
        System.out.println("Pinu então bate na porta, porém ela estava destrancada e acaba abrindo porta. 'Poxa eu juro que foi sem querer!' disse Pinu. Mas então vem uma incrível Sombra preta em seu caminho");
        System.out.println("Em pânico Pinu não faz ideia de que tipo de se é aquele, com um formato da própria fumaça que saia de sua casa. Logo a criatura fala");
        System.out.println("\n???: O que um ser humano patético faz em meu rescinto?! Você pagará por isso!");
        System.out.println("\nPor sorte Pinu sempre anda com seu estilingue e seu caderno em sua mochila, então antes mesmo da criatura encostar nele, Pinu pega seu caderno de matemática e se defende usando como um escudo.");
        System.out.println("Então com seu estilingue em mãos parte pra fazer o ataque, mas antes disso a criatura diz 'Eu o Poluidor irei te derrotar e voltar ao meu plano de poluição mundial hahahahaha'" + "\n");
       
        
        int escolha;

        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Ataque básico");
            System.out.println("2 - Gritar em pânico");
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
              System.out.println("Opção inválida. Escolha novamente.");
               continue;
                }

                if (inimigo.getVida() <= 0) {
                	 codTxt.conversarV(heroi, inimigo);
                	 System.out.println("\n\nVocê conseguiu, sua pontuação final é: " + heroi.getPontuacao());
                    break;
                }

                inimigo.atacar(heroi);
                if (heroi.getVida() <= 0) {
                	codTxt.conversarD(heroi, inimigo);
                	System.out.println("Você falhou! Sua pontuação final é 0");
                    break;
                }
            } else {
                System.out.println("Opção inválida. Insira um número inteiro.");
                scanner.nextLine();
            }
        } while (true);    
        scanner.close();    
     }
}
