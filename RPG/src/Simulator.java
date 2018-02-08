import armes.*;
import personnages.*;
import java.util.Scanner;
/**
 * Created by SimMa1733207 on 2018-01-29.
 */
public class Simulator {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenue dans RPG Simulator!");

        Personnage personnage1 = choixClasse();
        System.out.println("");
        Personnage personnage2 = choixClasse();

        combat(personnage1,personnage2);
    }
    public static Personnage choixClasse(){
        int choix=0;
        int choix2=0;
        while(choix<1||choix>4) {
            System.out.println("Veuillez choisir le personnage");
            System.out.println(" 1- Barbare");
            System.out.println(" 2- Paladin");
            System.out.println(" 3- Magicien noir");
            System.out.println(" 4- Magicien rouge");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du personnage");
                        System.out.println(" 1- Masse");
                        System.out.println(" 2- Épée Lourde");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                return new Barbare(new Masse());
                            case 2:
                                return new Barbare(new EpeeLourde());
                            case 3:
                                return new Barbare(new Sceptre());
                            case 4:
                                return new Barbare(new Masamune());
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 2:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du personnage");
                        System.out.println(" 1- Épée");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Épée Lourde");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                return new Paladin(new Epee());
                            case 2:
                                return new Paladin(new EpeeMagique());
                            case 3:
                                return new Paladin(new EpeeLourde());
                            case 4:
                                return new Paladin(new Masamune());
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 3:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                return new MagicienNoir(new Baguette());
                            case 2:
                                return new MagicienNoir(new EpeeMagique());
                            case 3:
                                return new MagicienNoir(new Sceptre());
                            case 4:
                                return new MagicienNoir(new Masamune());
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 4:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                return new MagicienRouge(new Baguette());
                            case 2:
                                return new MagicienRouge(new EpeeMagique());
                            case 3:
                                return new MagicienRouge(new Sceptre());
                            case 4:
                                return new MagicienRouge(new Masamune());
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("ERREUR: Entrer un numero valide");
                    break;
            }
        }
        return new Barbare(new Masamune());
    }
    public static void combat(Personnage personnage1,Personnage personnage2){
        while(true) {
            tour(personnage1,personnage2);
            tour(personnage2,personnage1);
            if (personnage1 instanceof Magicien&&personnage2 instanceof Magicien&&((Magicien) personnage1).getMagie()<2&&((Magicien) personnage2).getMagie()<2){
                System.out.println("Les deux magiciens n'ont plus de magie. C'est un match nul!");
                System.exit(0);
            }
        }
    }
    public static void tour(Personnage joueur,Personnage cible){
        if(joueur.getPv()>0){
            joueur.attaque(cible);
            System.out.println("");
        }
        else{
            System.out.println("Le "+joueur.getNom()+" est mort, le "+cible.getNom()+" a gagné!");
            System.exit(0);
        }
    }
}