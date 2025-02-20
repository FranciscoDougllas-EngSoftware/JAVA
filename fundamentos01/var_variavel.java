//Variavel var em java

public class var_variavel {
    public static void main(String[] args) {
        var nome = "Joao";
        var idade = 20;
        var altura = 1.75;

        var numero = 10.5D; //inferencia de tipo
        byte numero2 = 10; //inferencia de tipo
        short numero3 = 10; //inferencia de tipo
        long numero4 = 10; //inferencia de tipo
        float numero5 = 10; //inferencia de tipo
        double numero6 = 10; //inferencia de tipo
        char numero7 = 'A'; //inferencia de tipo

        System.out.println("Numero: " + numero);
        System.out.println("Numero2: " + numero2);
        System.out.println("Numero3: " + numero3);
        System.out.println("Numero4: " + numero4);
        System.out.println("Numero5: " + numero5);
        System.out.println("Numero6: " + numero6);
        System.out.println("Numero7: " + numero7);  
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}