import java.util.Scanner;

public class Buble{ 

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ordenação : Buble

        int mesa = 0;

        System.out.printf("Digite o tamanho do seu vetor: ");
        int tamanho = scan.nextInt();

        int[] vetor = new int[tamanho];

        System.out.printf("Digite " + tamanho + " números: ");
        for(int a = 0; a < tamanho; a++){
            vetor[a] = scan.nextInt();
        }

        System.out.printf("\nSeu vetor: ");
        for(int a = 0; a < tamanho; a++){
            System.out.printf(vetor[a] + ",");
        }
        System.out.printf("\n");
        

        for(int a = 0; a < tamanho; a++){
            for(int b = 1; b < (tamanho - 1); b++){
                if(vetor[b] > vetor[b+1]){
                    
                    mesa = vetor[a];
                    vetor[a] = vetor[b+1];
                    vetor[b+1] = mesa;

                }
            }
        }

        System.out.printf("\n\nVetor Depois: ");
        for(int a = 0; a < tamanho; a++){
            System.out.printf(vetor[a] + ",");
        }

        
        System.out.printf("\n");
    }
}