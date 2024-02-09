import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_secret = 7;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un nombre : ");
        int num = scanner.nextInt();
        
        if (num > num_secret) {
            System.out.println("num supérieur au nombre secret");
        } else if (num < num_secret) {
            System.out.println("num inférieur au nombre secret.");
        } else {
            System.out.println("vous avez gagné le jeu");
        }
    }
}