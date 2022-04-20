import java.util.Random;
public class ExemplosAPI {

    public static void main(String[] args) {
        String teste = "Hello, sobrecarga";
        System.out.println(teste.substring(2, 5));
        System.out.println(teste.substring(5));

        Random gerador = new Random();

        System.out.println(gerador.nextInt(5));
        System.out.println(gerador.nextInt());
    }
    
}
