import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);


    double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);

    System.out.printf("O seu IMC é de %.2f kg/m² %n" , imc);

    if( 25 < imc && imc < 29.9 ) {
    System.out.println("Você esta acima do peso");
      
    }

    if (30 < imc && imc < 34.9 ) {
     System.out.println("Voce apresenta Obesidade de grau 1.");
      
    }

    if (18.5 < imc && imc < 24.9 ){
     System.out.println("Seu peso é normal.");
      
    }

    if (17 < imc && imc < 18.4){
      System.out.println("Você está abaixo do peso");
      
    }
    if (8 < imc && imc < 16.9){
      System.out.println("Você está muito abaixo do peso.");
      
    }
    if (35 < imc && imc < 40){
      System.out.println("Você apresenta obesidade grau 2.");
      
    }
    if (40 < imc && imc > 40){
      System.out.println("Você apresenta obesidade 3.");
      
    }
   sc.close();

    
  }


}