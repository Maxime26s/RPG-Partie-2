import armes.*;
import personnages.*;
import java.util.Scanner;

/**
 * Created by SimMa1733207 on 2018-01-29.
 */
public class Simulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choix=0;
        int choix2=0;
        Personnage personnage1 = null;
        Personnage personnage2 = null;

        System.out.println("Bienvenue dans RPG Simulator!");

        while(choix<1||choix>4) {
            System.out.println("Veuillez choisir le premier personnage");
            System.out.println(" 1- Barbare");
            System.out.println(" 2- Paladin");
            System.out.println(" 3- Magicien noir");
            System.out.println(" 4- Magicien rouge");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du premier personnage");
                        System.out.println(" 1- Masse");
                        System.out.println(" 2- Épée Lourde");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage1 = new Barbare(new Masse());
                                break;
                            case 2:
                                personnage1 = new Barbare(new EpeeLourde());
                                break;
                            case 3:
                                personnage1 = new Barbare(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new Barbare(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 2:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du premier personnage");
                        System.out.println(" 1- Épée");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Épée Lourde");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage1 = new Paladin(new Epee());
                                break;
                            case 2:
                                personnage1 = new Paladin(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new Paladin(new EpeeLourde());
                                break;
                            case 4:
                                personnage1 = new Paladin(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 3:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du premier personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage1 = new MagicienNoir(new Baguette());
                                break;
                            case 2:
                                personnage1 = new MagicienNoir(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new MagicienNoir(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new MagicienNoir(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 4:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du premier personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage1 = new MagicienRouge(new Baguette());
                                break;
                            case 2:
                                personnage1 = new MagicienRouge(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new MagicienRouge(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new MagicienRouge(new Masamune());
                                break;
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
        choix=0;
        choix2=0;
        System.out.println("");
        while(choix<1||choix>4) {
            System.out.println("Veuillez choisir le deuxième personnage");
            System.out.println(" 1- Barbare");
            System.out.println(" 2- Paladin");
            System.out.println(" 3- Magicien noir");
            System.out.println(" 4- Magicien rouge");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du deuxième personnage");
                        System.out.println(" 1- Masse");
                        System.out.println(" 2- Épée Lourde");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage2 = new Barbare(new Masse());
                                break;
                            case 2:
                                personnage2 = new Barbare(new EpeeLourde());
                                break;
                            case 3:
                                personnage2 = new Barbare(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new Barbare(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 2:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du deuxième personnage");
                        System.out.println(" 1- Épée");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Épée Lourde");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage2 = new Paladin(new Epee());
                                break;
                            case 2:
                                personnage2 = new Paladin(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new Paladin(new EpeeLourde());
                                break;
                            case 4:
                                personnage2 = new Paladin(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 3:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du deuxième personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage2 = new MagicienNoir(new Baguette());
                                break;
                            case 2:
                                personnage2 = new MagicienNoir(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new MagicienNoir(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new MagicienNoir(new Masamune());
                                break;
                            default:
                                System.out.println("ERREUR: Entrer un numero valide");
                                break;
                        }
                    }
                    break;
                case 4:
                    while(choix2<1||choix2>4) {
                        System.out.println("Veuillez choisir l'arme du deuxième personnage");
                        System.out.println(" 1- Baguette");
                        System.out.println(" 2- Épée Magique");
                        System.out.println(" 3- Sceptre");
                        System.out.println(" 4- Masamune");
                        System.out.println("Votre choix : ");
                        choix2 = sc.nextInt();
                        switch (choix2) {
                            case 1:
                                personnage2 = new MagicienRouge(new Baguette());
                                break;
                            case 2:
                                personnage2 = new MagicienRouge(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new MagicienRouge(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new MagicienRouge(new Masamune());
                                break;
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
        System.out.println("");

        while(true) {
            if(personnage1.getPv()>0){
                personnage1.attaque(personnage2);
                System.out.println("");
            }
            else{
                System.out.println("Le "+personnage1.getNom()+" est mort, le "+personnage2.getNom()+" a gagné!");
                System.exit(0);
            }
            if(personnage2.getPv()>0){
                personnage2.attaque(personnage1);
                System.out.println("");
            }
            else{
                System.out.println("Le "+personnage2.getNom()+" est mort, le "+personnage1.getNom()+" a gagné!");
                System.exit(0);
            }
            if (personnage1 instanceof Magicien&&personnage2 instanceof Magicien&&((Magicien) personnage1).getMagie()<2&&((Magicien) personnage2).getMagie()<2){
                System.out.println("Les deux magiciens n'ont plus de magie. C'est un match nul!");
                System.exit(0);
            }
        }
    }
}

