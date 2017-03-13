
package br.com.satc.Exemplo1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    public static void main(String[] args) {
      //IF
      //Swich case
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        if (idade <= 13){
            System.out.println("Criança");
        }
         if ((idade > 13) &&(idade<18)){
            System.out.println("adolescente");
        }else if (idade >= 18 && (idade < 26) ){
            System.out.println("adulto");     
        }else if (idade >= 26 && (idade <= 65) ){
        
                System.out.println("idoso");
       
        } else {
            System.out.println("Idoso");
        }     
                          

    }
}    
                

      