import java.util.Scanner;
public class Exo7 {

   //Avant modification : public staic void main (String[] args) {}
     public static void AffichePrenom() {

        //Unitialisation de scanner
        Scanner sc = new Scanner(System.in);
        //Recuperation du nom au clavier
        System.out.println("Veillez saisir  nom");
        String nom = sc.nextLine();
        ////Recuperation du prenom au clavier
        System.out.println("Veillez saisir prenom");
        String prenom = sc.nextLine();
        //Affichage du nom complet
        System.out.println("votre Nom complet est :" + nom + " " + prenom);

     }
}