package Class;

import java.util.Date;

 

public class Auteur {

    public String nom;
    public Date date_de_naissance;
    


    public Auteur(String _nom, Date _date_de_naissance) {
        this.nom = _nom;
        this.date_de_naissance = _date_de_naissance;
    }

    public void setDate_de_naissance(Date _date_de_naissance){
        this.date_de_naissance = _date_de_naissance;
    }
    
    public void setNom(String _nom){
        this.nom = _nom;
    }
    
    public Date getDate_de_naissance(){
        return this.date_de_naissance;
    }

    public String getNom(){
        return this.nom;
    }
}