package Class;


public class Livre {

    public String titre;
    public String auteur;
    public int annee_publication;
    public String ISBN;


    public Livre(String _titre, String _auteur, int _annee_publication, String _ISBN) {

        this.titre = _titre;
        this.auteur = _auteur;
        this.annee_publication = _annee_publication;
        this.ISBN = _ISBN;

    }

    public void setTitre(String _titre) {
        this.titre = _titre;
    }

    public void setAuteur(String _auteur) {
        this.auteur = _auteur;
    }

    public void setAnnePublication(int _annee_publication){
        this.annee_publication = _annee_publication;
    }
    
}


