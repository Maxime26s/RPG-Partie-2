package personnages;

public abstract class Guerrier extends Personnage{
    private int force;

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void attaque(Personnage personnage){
        personnage.setPv(personnage.getPv()-(2*force-personnage.getDef()+getDegats()));
        System.out.println("Le "+getNom()+" attaque!");
        System.out.println("Le "+personnage.getNom()+" perd "+(2*force-personnage.getDef()+getDegats())+" points de vie. Il lui en reste "+personnage.getPv()+".");
    }
}
