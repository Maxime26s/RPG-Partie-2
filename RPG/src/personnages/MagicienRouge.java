package personnages;
import armes.Magique;
import sorts.*;

public class MagicienRouge extends Magicien{
    private Magique arme;
    public MagicienRouge(Magique arme) {
        setNom("Magicien Rouge");
        setMagie(40);
        getSort()[0]=new Empoisonnement();
        getSort()[1]=new MortSubite();
        this.arme=arme;
    }
    public int getDegats(){
        return arme.lancerunsort();
    }
}
