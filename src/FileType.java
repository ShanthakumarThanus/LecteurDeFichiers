import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class FileType implements IFileReader {

    protected FileInputStream fis;  // Flux de fichier partagé

    @Override
    public void openFile(String cheminFichier) {
        try {
            fis = new FileInputStream(cheminFichier); // Ouvrir le fichier
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception en cas d'erreur
        }
    }

    @Override
    public void closeFile() {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // permets de lire le contenu du fichier
    protected String readFile(String cheminFichier) {
        StringBuilder contenu = new StringBuilder();
        try {
            openFile(cheminFichier); // Ouvrir le fichier
            try (BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    contenu.append(ligne).append("\n"); // Ajouter chaque ligne au contenu
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeFile(); // Fermer le fichier
        }
        return contenu.toString(); // Retourner le contenu comme une chaîne
    }

    public abstract String printEndroit(String cheminFichier);
    public abstract String printEnvers(String cheminFichier);
    public abstract String palindrome(String cheminFichier);

    public boolean comparaison(String cheminFichier1, String cheminFichier2) {
        String contenu1 = readFile(cheminFichier1);
        String contenu2 = readFile(cheminFichier2);
        return contenu1.equals(contenu2);
    }
}
