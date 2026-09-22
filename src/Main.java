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

        int opcao= (int) scanner.nextDouble();

        System.out.println("Digite um valor: ");

        double valor=scanner.nextDouble();
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
                        String dolarFormatado = String.format("%.2f", converteDolar);
                        System.out.println(dolarFormatado);
                        break;
                        case 4:
                        double converteEuro = valor/valorEuro;
                           String euroFormatado = String.format("%.2f", converteEuro);
                            System.out.println (euroFormatado);
                            break;



        }









    }
}