package Class;

import Class.Livre;
import Class.Emprunteur;

public class Bibliotheque{

    public Livre[] livres_disponibles;
    public Emprunteur[] liste_emprunteurs;

    
    public Bibliotheque(Livre[] _livres_disponibles, Emprunteur[] _liste_emprunteurs){
        this.livres_disponibles = _livres_disponibles;
        this.liste_emprunteurs = _liste_emprunteurs;
    }

    public void setLivres_disponibles(Livre[] _livres_disponibles){
        this.livres_disponibles = _livres_disponibles;
    }

    public void setListe_emprunteurs(Emprunteur[] _liste_emprunteurs){
        this.liste_emprunteurs = _liste_emprunteurs;
    }

    public Livre[] getLivres_disponibles(){
        return livres_disponibles;
    }

    public Emprunteur[] getListe_emprunteurs() {
        return liste_emprunteurs;
    }
}