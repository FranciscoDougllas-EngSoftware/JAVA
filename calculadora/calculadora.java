import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.printf("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.printf("Digite a operação desejada: ");
        char operacao = scanner.next().charAt(0);

        if(operacao == '+'){
            int resultado = num1 + num2;
            System.out.println("O resultado e: " + resultado);
        }else if(operacao == '-'){
            int resultado = num1 - num2;
            System.out.println("O resultado e: " + resultado);
        }else if(operacao == '*'){
            int resultado = num1 * num2;
            System.out.println("O resultado e: " + resultado);
        }else if(operacao == '/'){
            int resultado = num1 / num2;
            System.out.println("O resultado e: " + resultado);
        }else{
            System.out.println("Operação invalida");
        }

        scanner.close();
    }
}