

import java.util.Scanner;

public class NumPrimos {

  /*Números Primos são numeros que são dividos por 1 e por ele 
    mesmo com o rsto 0*/
  public static void main(String[] args) {
  
  int numeroInformado;
  int totalPrimos = 0;
  int qtdeDivisao2 = 0;
  
  Scanner numScan = new Scanner(System.in);
  
  System.out.println("Informe um Numero inteiro: ");
   
   
   numeroInformado = numScan.nextInt();
   

   
   for(int i = 2 ;i <= numeroInformado;i++){
       for(int j = 1;j <= i;j++){
          
          if(numeroInformado < 2 ){
            System.out.println("!! INFORME UM NÚMERO MAIOR QUE 2 !!");
            break;
          }
          
          if( i % j == 0 ){
         
             qtdeDivisao2 ++;
            
          }
     
     }
          if(qtdeDivisao2 == 2 ){
          
              System.out.println(i);
           
              totalPrimos += 1;  
          }
        
        
        qtdeDivisao2 = 0;
    
      
  }
       
  
  
   System.out.println("O intervalo de 1 a " +  numeroInformado );
   System.out.println("São  de " + totalPrimos + " numeros primos" );
   
  }
}
