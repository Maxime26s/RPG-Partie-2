package sorts;

import personnages.Magicien;
import personnages.Personnage;

public class PicDeGlace extends Sort{
    public PicDeGlace() {
        setCout(5);
        setNom("Pic de Glace");
    }

    public void lancerSort(Personnage personnage, Magicien magicien){
        personnage.setPv(personnage.getPv()-(7-personnage.getDef()+magicien.getDegats()));
        System.out.print(7-personnage.getDef()+magicien.getDegats());
    }
}
