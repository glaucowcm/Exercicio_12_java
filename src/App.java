import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double altura;
        double pesoideal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a altura da pessoa:");

        altura = teclado.nextDouble();

        pesoideal = (72.7 * altura) - 58;

        System.out.println("O peso ideal para esta altura é:" + pesoideal);
    }
}