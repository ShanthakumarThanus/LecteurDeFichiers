import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le chemin du fichier texte : ");
        String cheminFichierTxt = scanner.nextLine();

        FileTxt fileTxt = new FileTxt();
        System.out.println("Contenu à l'endroit : ");
        System.out.println(fileTxt.printEndroit(cheminFichierTxt));

        System.out.println("Contenu à l'envers : ");
        System.out.println(fileTxt.printEnvers(cheminFichierTxt));

        System.out.println("Contenu palindromique : ");
        System.out.println(fileTxt.palindrome(cheminFichierTxt));

        // Comparaison de deux fichiers
        System.out.print("Entrez le chemin du premier fichier à comparer : ");
        String cheminFichier1 = scanner.nextLine();
        System.out.print("Entrez le chemin du deuxième fichier à comparer : ");
        String cheminFichier2 = scanner.nextLine();

        boolean sontIdentiques = fileTxt.comparaison(cheminFichier1, cheminFichier2);

        if (sontIdentiques) {
            System.out.println("Les fichiers sont identiques.");
        }
        else {
            System.out.println("Les fichiers ne sont pas identiques.");
        }

        scanner.close();
    }
}