import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileTxt extends FileType{

    @Override
    public String printEndroit(String cheminFichier) {
        return readFile(cheminFichier);
    }

    @Override
    public String printEnvers(String cheminFichier) {
        List<String> lignes = new ArrayList<>();
        String contenu = readFile(cheminFichier); // Lire tout le contenu


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
