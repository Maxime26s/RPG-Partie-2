package sorts;

import personnages.Magicien;
import personnages.Personnage;

public class Empoisonnement extends Sort{
    private int nbCast=0;
    public Empoisonnement() {
        setCout(2);
        setNom("Empoisonnement");
    }

    public void lancerSort(Personnage personnage, Magicien magicien){
        nbCast++;
        personnage.setPv(personnage.getPv()-(nbCast*2+magicien.getDegats()));
        System.out.print(nbCast*2+magicien.getDegats());
    }
}
