package sorts;

import personnages.Magicien;
import personnages.Personnage;

public class MortSubite extends Sort{
    public MortSubite() {
        setCout(10);
        setNom("Mort Subite");
    }

    public void lancerSort(Personnage personnage, Magicien magicien){
        if((int)(Math.random()*10)==5){
            System.out.print(personnage.getPv());
            personnage.setPv(personnage.getPv()-personnage.getPv());
        }
        else{
            System.out.print(0);
        }
    }
}
