/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;
ggghh****
/**
 *
 * @author solen
 */
public class TP1 {
//j'ai bien été versionné
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int taille= 0;
       //Déclaration du premier etudiant
       Etudiant etudiant1= new Etudiant();
       // On affiche les valeurs intialisées par défaut
       System.out.println( " prenom:" +etudiant1.prenom);
       System.out.println( " nom:" +etudiant1.nom);
       System.out.println("taille: "+etudiant1.getTaille());
       
       
       Scanner clavier = new Scanner(System.in);
       do{
        System.out.print("Entrez un nombre positif:");
        
       taille = clavier.nextInt();

       }while( taille < 1);
       float notes[];
        notes = new float[taille];
        
       for (int j=0; j<taille; j++)
       {
           System.out.print("Entrez la "+j+" notes:");
           notes[j]=clavier.nextFloat();          
       }
      Etudiant etudiant2;
        etudiant2 = new Etudiant(notes);
        System.out.println("Entrer un identifiant");
        clavier.nextLine();
        String identifiant=clavier.nextLine();
        System.out.println("Entrer un prenom");
        String prenom= clavier.nextLine();
        System.out.println("Entrer un nom");
        String nom= clavier.nextLine();
        etudiant1.modifier(identifiant,taille,nom,prenom,notes);
        etudiant1.afficher();
        etudiant2.afficher();
        
        // Remplissage aléatoire du tableau de note
        etudiant1.remplir();
        etudiant1.afficher();
        
        /// Tri du tableau de note et affichage
        etudiant1.trier();
        etudiant1.afficher();
        
        /// Calcul et affichage des statistiques
        etudiant1.moyenne();
        etudiant1.min_max();
        etudiant1.pourcentage();
         
        System.out.println("Veuillez rentrer la note que vous souhaiter rechercher dans le tableau");
        float recherche=0;
        recherche=clavier.nextFloat();
        if (etudiant1.isNote(recherche)==true)
        {
            System.out.println("La note est dans le tabelau");
        }
        else 
        {
            System.out.println("La note n'est pas dans le tableau");
        };
    }   
}
