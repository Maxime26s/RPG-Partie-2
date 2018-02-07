package personnages;
import armes.Magique;
import sorts.*;

public class MagicienNoir extends Magicien{
    private Magique arme;
    public MagicienNoir(Magique arme) {
        setNom("Magicien Noir");
        setMagie(50);
        getSort()[0]=new BouledeFeu();
        getSort()[1]=new PicDeGlace();
        this.arme=arme;
    }
    public int getDegats(){
        return arme.lancerunsort();
    }
}
