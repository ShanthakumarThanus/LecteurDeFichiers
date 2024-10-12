import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileCsv extends FileType {
    @Override
    public String printEndroit(String cheminFichier) {
        return readFile(cheminFichier);
    }

    @Override
    public String printEnvers(String cheminFichier) {
        List<String> lignes = new ArrayList<>();
        String contenu = readFile(cheminFichier);

        Collections.addAll(lignes, contenu.split("\n"));

        Collections.reverse(lignes);

        StringBuilder contenuInverse = new StringBuilder();
        for (String ligne : lignes) {
            contenuInverse.append(ligne).append("\n");
        }

        return contenuInverse.toString();
    }

    @Override
    public String palindrome(String cheminFichier) {
        String contenu = readFile(cheminFichier);
        return new StringBuilder(contenu).reverse().toString();
    }
}
