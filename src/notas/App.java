package notas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Student stud = new Student();
        Commons com = new Commons();
        Scanner scan = new Scanner(System.in);

        String nome;

        int opcao = 0;
        while (opcao >= 0) {
            com.limparTela();
            System.out.println("| Sistema de Gerenciamento de Notas v1.0 |");
            System.out.println("Selecione a opção desejada:");
            System.out.println("\n1 - Incluir aluno\n2 - Adicionar nota\n3 - Exibir nota final\n4 - Sair");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do aluno:");
                    nome = scan.nextLine();
                    stud.inserirNomes(nome);
                    break;

                case 2:
                    System.out.println("Escolha o aluno:");
                    stud.retornaNomes();
                    System.out.println("Digite o número do aluno.");
                    int aluId = scan.nextInt();
                    aluId--;
                    System.out.println("Informe o trimestre.");
                    int trimestre = scan.nextInt();
                    trimestre--;
                    System.out.println("Informe a nota do " + trimestre+1 + "º trimestre.");
                    float nota = scan.nextFloat();
                    stud.inserirNota(aluId, trimestre, nota);
                    break;

                case 3:
                    /* elev.sobe(); */
                    break;

                case 4:
                    opcao = -1;
                    break;
            }
            
        }
        scan.close();

    }
}
