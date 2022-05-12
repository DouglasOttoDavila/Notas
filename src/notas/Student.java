package notas;

import java.io.*;

public class Student {

    private String nomes[] = new String[3];
    private float notas[][] = new float[3][3];
    private int aluContagem = 0;

    public void inserirNomes(String nome){
        this.nomes[aluContagem] = nome; 
        aluContagem++;
    }

    public void retornaNomes(){
        for (int i = 0; i < aluContagem; i++){
            if (this.nomes[i] != null){
                String nome = this.nomes[i];
                System.out.println(i + " " + nome);
            }
        }
    }

    public void inserirNota(int aluId, int trimestre, float nota){
        notas[aluId][trimestre] = nota;
    }

    public void retornaNotasAluno(int aluId){
        float n1 = notas[aluId][0];
        float n2 = notas[aluId][1];;
        float n3 = notas[aluId][2];;
        float total;

        if (n1 != 0f){
            System.out.println("1º Trimestre: " + n1);
        }

        
    }

    public float calcularNota(int aluId){
        float nota1 = notas[aluId][0];
        float nota2 = notas[aluId][1];
        float nota3 = notas[aluId][2];
        float notaFinal;

        notaFinal = ((nota1/100f)*3) + ((nota2/100f)*3.5f)  + ((nota3/100f)*3.5f);

        return notaFinal;
    }

}
