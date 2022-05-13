package notas;

public class Student {

    Commons com = new Commons();

    private String nomes[] = new String[3];
    private float notas[][] = new float[3][3];
    private float notaFinal[][] = new float[3][1];
    private int aluContagem = 0;
    private int maxAlunos = 3;

    public void inserirNomes(String nome){
        if (aluContagem >= 3){
            System.out.println("O limite de " + this.maxAlunos + " alunos foi alcançado.");
            System.out.println("Não é possível incluir outro(s) contato(s).");
        } else {
            this.nomes[aluContagem] = nome; 
            aluContagem++;
        }
    }

    public void retornaNomes(){
        for (int i = 0; i < this.aluContagem; i++){
            if (this.nomes[i] != null){
                String nome = this.nomes[i];
                System.out.println(i + " " + nome);
            }
        }
        System.out.println("\nAlunos totais: " + this.aluContagem + "/3");
    }

    public void inserirNota(int aluId, int trimestre, float nota){
        this.notas[aluId][trimestre] = nota;
    }

    public void retornaNotasAluno(int aluId){
        float n1 = notas[aluId][0];
        float n2 = notas[aluId][1];;
        float n3 = notas[aluId][2];

        if (n1 != 0f){
            System.out.println("1º Trimestre: " + n1);
        } else {
            System.out.println("1º Trimestre: Nota não contabilizada."); 
        }
        if (n2 != 0f){
            System.out.println("2º Trimestre: " + n2);
        } else {
            System.out.println("2º Trimestre: Nota não contabilizada."); 
        }
        if (n3 != 0f){
            System.out.println("3º Trimestre: " + n3);
        } else {
            System.out.println("3º Trimestre: Nota não contabilizada."); 
        }
    }

    public float calcularNota(int aluId){
        float nota1 = this.notas[aluId][0];;
        float nota2 = this.notas[aluId][1];;
        float nota3 = this.notas[aluId][2];;
        float notaFinal;

        if (nota1 != 0f){

        } else {
            nota1 = 0;
        }

        if (nota2 != 0f){

        } else {
            nota3 = 0;
        }

        if (nota3 != 0f){

        } else {
            nota3 = 0;
        }

        notaFinal = ((nota1*3.0f)/100) + ((nota2*3.5f)/100)  + ((nota3*3.5f)/100);
        this.notaFinal[aluId][0] = notaFinal*10;

        notaFinal = this.notaFinal[aluId][0];

        return notaFinal;
    }

    public void checarResultado(int aluId){
        if (this.notaFinal[aluId][0] < 6f) {
            System.out.println("O aluno está reprovado!");
        } else {
            System.out.println("O aluno está aprovado!");
        }
    }

}
