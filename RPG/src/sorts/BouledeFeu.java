package sorts;

import personnages.Magicien;
import personnages.Personnage;

public class BouledeFeu extends Sort{
    public BouledeFeu() {
        setCout(5);
        setNom("Boule de Feu");
    }

    public void lancerSort(Personnage personnage, Magicien magicien){
        personnage.setPv(personnage.getPv()-(5+magicien.getDegats()));
        System.out.print(5+magicien.getDegats());
    }
}
