//Promocoes de tipos de dados em java
public class promocoes {
    public static void main(String[] args) {
        byte a = 10;
        //byte b = a + 5; // Erro de compilação
        byte c = (byte) (a + 5); // Correto
        System.out.println(c);

        //Ou tambem posso fazer
        byte d = 11;
        int f = d + 5;
        System.out.println(f);

        //Ou tambem posso fazer
        int a2 = 10;
        float b2 = 1.5f;
        float c2 = a2 + b2;
        System.out.println(c2);

        //Ou tambem posso fazer
        double a3 = 10.0;
        int b3 = 5;
        double c3 = a3 + b3;
        System.out.println(c3);
    }
}
