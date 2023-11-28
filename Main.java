import Class.Livre;
import Class.Auteur;
import Class.Emprunteur;
import Class.Bibliotheque;

import java.util.Date;

public class Main {

    public static void main(String args[]) {
        
        Auteur an_author = new Auteur("Robert Williams", new Date());
        Livre a_book = new Livre("Bim bam bom, le livre", an_author, 1974, "123458");
        Emprunteur un_emprunteur = new Emprunteur("Jason Todd", 14586);
        Bibliotheque a_bibliotheque = new Bibliotheque(null, null);

        System.out.println(a_book.getAuteur());
        System.out.println();

    }

    


}