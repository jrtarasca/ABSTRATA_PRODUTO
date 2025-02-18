package  com.loja.Db;

import java.util.Scanner;

public class ProdutosCLI {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
	            case 1:
	                Inserir.main(args);
	                break;
	            case 2:
	                Atualizar.main(args);
	                break;
	            case 3:
	                Deletar.main(args);
	                break;
	            case 4:
	                Select.main(args);
	                break;

                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n#### Gerenciamento de loja ####");
        System.out.println("1 - Inserir Dados");
        System.out.println("2 - Atualizar Dados");
        System.out.println("3 - Deletar Dados");
        System.out.println("4 - Ler Dados");
        System.out.println("0 - Sair");
        System.out.print("\nEscolha uma opção: ");
    }
}
