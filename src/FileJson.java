import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileJson extends FileType {
    @Override
    public String printEndroit(String cheminFichier) {
        return readFile(cheminFichier);
    }

    @Override
    public String printEnvers(String cheminFichier) {
        List<String> lignes = new ArrayList<>();
        String contenu = readFile(cheminFichier); // Lire tout le contenu

        // Séparer le contenu par lignes (ici, on peut aussi faire un parsing JSON, selon le format)
        Collections.addAll(lignes, contenu.split("\n")); // Split the content into lines

        // Inverser l'ordre des lignes
        Collections.reverse(lignes);

        // Construire le contenu inversé
        StringBuilder contenuInverse = new StringBuilder();
        for (String ligne : lignes) {
            contenuInverse.append(ligne).append("\n"); // Ajouter chaque ligne inversée
        }

        return contenuInverse.toString();
    }

    @Override
    public String palindrome(String cheminFichier) {
        String contenu = readFile(cheminFichier);
        return new StringBuilder(contenu).reverse().toString();
    }
}
