package app;

import java.util.ArrayList;
import java.util.ArrayList;
import app.models.Personne;

public class Application {

    public static void main(String[] args) {
        ArrayList<Personne> listePersonne = new ArrayList<Personne>();
        Personne personne1 = new Personne("Jean", "Jean", "a", "a", 1000);
        Personne personne2 = new Personne("Luc", "Luc", "b", "b", 2000);
        listePersonne.add(personne1);
        listePersonne.add(personne2);
        for (Personne personne : listePersonne) {
            System.out.println(personne.getNom());
            System.out.println(personne.getPrenom());
            System.out.println(personne.getRue());
            System.out.println(personne.getLocalite());
            System.out.println(personne.getNpa());
        }
    }

}
