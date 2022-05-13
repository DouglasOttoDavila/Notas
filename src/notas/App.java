package notas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Student stud = new Student();
        Commons com = new Commons();
        Scanner scan = new Scanner(System.in);

        String nome;
        int aluId;
        int trimestre;
        float notaFinal;

        int opcao = 0;
        while (opcao >= 0) {
            com.limparTela();
            System.out.println("| Sistema de Gerenciamento de Notas v1.0 |");
            System.out.println("Selecione a opção desejada:");
            System.out.println("\n1 - Incluir aluno\n2 - Adicionar nota\n3 - Exibir nota final\n4 - Sair");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    com.limparTela();
                    System.out.println("Informe o nome do aluno:");
                    scan.nextLine();
                    nome = scan.nextLine();
                    stud.inserirNomes(nome);
                    stud.retornaNomes();
                    com.aguardaInput();
                    break;

                case 2:
                    com.limparTela();
                    System.out.println("Escolha o aluno:");
                    stud.retornaNomes();
                    System.out.println("Digite o número do aluno.");
                    aluId = scan.nextInt();
                    System.out.println("\nInforme o trimestre.");
                    trimestre = scan.nextInt();
                    System.out.println("Informe a nota do " + trimestre + "º trimestre.");
                    float nota = scan.nextFloat();
                    trimestre--;
                    stud.inserirNota(aluId, trimestre, nota);
                    com.aguardaInput();
                    break;

                case 3:
                    com.limparTela();
                    System.out.println("Escolha o aluno:");
                    stud.retornaNomes();
                    System.out.println("\nDigite o número do aluno.");
                    aluId = scan.nextInt();
                    com.limparTela();
                    notaFinal = stud.calcularNota(aluId);
                    System.out.println("A nota final é: " + notaFinal);
                    stud.checarResultado(aluId);
                    stud.retornaNotasAluno(aluId);
                    com.aguardaInput();
                    break;

                case 4:
                    opcao = -1;
                    break;
            }
            
        }
        scan.close();

    }
}
