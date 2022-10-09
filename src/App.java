import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que calcule a área de um quadrado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();
        sc.close();
        double area = lado * lado;
        // mostre o dobro desta área para o usuário.
        double dobro = area * 2;
        System.out.println("O dobro da área do quadrado de lado "+lado+" é igual a " +dobro);
        
    }
}
