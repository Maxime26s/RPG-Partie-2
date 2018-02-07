package personnages;

import armes.Tranchant;

/**
 * Created by SimMa1733207 on 2018-01-29.
 */
public class Paladin extends Guerrier{
    Tranchant arme;
    public Paladin(Tranchant arme) {
        setNom("Paladin");
        setForce(5);
        setDef(5);
        setPv(80);
        this.arme=arme;
    }
    public int getDegats(){
        return arme.trancher();
    }
}
