package Principal;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);

      System.out.println("Escolha uma opção:");
      System.out.println("1 - Estacionamento");
      System.out.println("2 - Refrigerante");
      System.out.println("3 - Campeonato");
      System.out.println("4 - Cofrinho");
      System.out.println("5 - Restaurante");
      
      int opcao = scanner.nextInt();
      
      if(opcao == 1) {
    	  
    	  Estacionamento carro = new Estacionamento("ABCD", "Fiesta");
    	  carro.adicionarTempo(31);
    	  carro.calcularValor();
    	  carro.exibirResumo();
    	  
      }else if(opcao == 2) {
            Refrigerante refrigerante = new Refrigerante();
            refrigerante.comprar();
            
        }else if(opcao == 3) {

      }
      
    }
}
