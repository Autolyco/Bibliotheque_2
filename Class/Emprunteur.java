package Class;

public class Emprunteur {
    public String nom;
    public int numero_carte_bibliotheque;


    public Emprunteur(String _nom, int _numero_carte_bibliotheque){
        this.nom = _nom;
        this.numero_carte_bibliotheque = _numero_carte_bibliotheque;
    }

    public void setNumero_carte_bibliotheque(int _Numero_carte_bibliotheque){
        this.numero_carte_bibliotheque = _Numero_carte_bibliotheque;
    }

    public void setNom(String _nom){
        this.nom = _nom;
    }

    public String getNom(){
        return this.nom;
    }

    public int getNumero_carte_bibliotheque(){
        return this.numero_carte_bibliotheque;
    }
}