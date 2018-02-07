package personnages;

import armes.Contondant;

/**
 * Created by SimMa1733207 on 2018-01-29.
 */
public class Barbare extends Guerrier{
    private Contondant arme;
    public Barbare(Contondant arme) {
        setNom("Barbare");
        setForce(10);
        setDef(3);
        setPv(100);
        this.arme=arme;
    }
    public int getDegats(){
        return arme.frapper();
    }
}