import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Calculadora de valores monetários");
        System.out.println("Selecione uma opção:");
        System.out.println("[1] Dolar");
        System.out.println("[2] Euros");
        System.out.println("[3] Converter real para Dolar");
        System.out.println("[4] Converter real para Euros");

        int opcao=scanner.nextInt();

        System.out.println("Digite um valor: ");

        double valor=scanner.nextInt();
        double valorDolar = 5.65;
        double valorEuro = 6.70;

        switch(opcao){
            case 1:
                double realDolar = valor*valorDolar;
                System.out.println(realDolar);
                break;
                case 2:
                    double realEuro = valor*valorEuro;
                    System.out.println(realEuro);
                    break;
                    case 3:
                        double converteDolar = valor/valorDolar;
                        System.out.println(converteDolar);
                        break;
                        case 4:
                        double converteEuro = valor/valorEuro;
                        System.out.println(converteEuro);
                        break;

        }









    }
}