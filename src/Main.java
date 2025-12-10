import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        
       System.out.print("informe o primeiro número: ");
       var primeiro = sc.nextInt();
    
       System.out.println();
    
       System.out.print("informe um segundo número maior que o primeiro: ");
       var segundo = sc.nextInt();
       System.out.println(); 
       while(segundo<=primeiro){
            System.out.print("Valor inválido! Digite um número mair que "+primeiro+": ");
            segundo=sc.nextInt();
       }

       System.out.print("impar ou par ? ");
       var escolha = sc.next();

       System.out.println("Números entre "+primeiro+" e "+segundo+":");
       for(int i =segundo; i>=primeiro; i--){

            if(escolha.equalsIgnoreCase("par") && i % 2 == 0){
            System.out.println(i);
       
            }

            else if(escolha.equalsIgnoreCase("impar") && i % 2 !=0){
            System.out.println(i);
            }
        }
        sc.close();
    }
    }

