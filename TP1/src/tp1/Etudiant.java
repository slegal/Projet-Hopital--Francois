/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author solenn
 */
public class Etudiant {

    private String identifiant;
    private float notes[];
    private int taille;
    public String nom;
    public String prenom;

    public Etudiant() {
        identifiant = "";
        taille = 0;
        nom = "";
        prenom = "";
        notes = null;
    }

    public Etudiant(float tab[]) {
        notes = new float[tab.length];
        this.taille = tab.length;
        System.arraycopy(tab, 0, this.notes, 0, taille);
    }

    // Getter
    public String getIdentifiant() {
        return identifiant;
    }

    public int getTaille() {
        return taille;
    }

    public float getNotes(int i) {
        return this.notes[i];
    }

    public void modifier(String new_identifiant, int new_taille, String new_nom, String new_prenom, float[] tab) {
        this.identifiant = new_identifiant;
        this.taille = new_taille;
        this.nom = new_nom;
        this.prenom = new_prenom;
        this.taille = tab.length;
        notes = new float[tab.length];
        System.arraycopy(tab, 0, this.notes, 0, taille);
    }

    public void afficher() {
        for (int i = 0; i < notes.length; i++) {
            System.out.println("note " + i + ": " + notes[i]);
        }
    }

    public void remplir() {
        for (int i = 0; i < this.taille; i++) {
            Random r = new Random();
            this.notes[i] = r.nextInt(21);
        }
        System.out.println("Tableau rempli aléatoirement avant le tri: ");
    }

    public void trier() {
      Arrays.sort(notes);
      System.out.println("Tableau après le tri: ");
    }
    
   public void min_max()
   {
       float max=0;
       float min=20;
       
       for (int i=0; i<this.taille; i++)
       {
           if (notes[i]<min)
           {
               min=this.notes[i];
           }
           
           if (notes[i]>max)
           {
               max=this.notes[i];
           }
       }
       System.out.println("La note minimum est: "+ min);
       System.out.println("La note maximal est: "+ max);
   }
    public void moyenne()
    {
        float total=0;
        float moyenne=0;
        for(int i=0; i<this.taille;i++)
        {
            total+=this.notes[i];
        }
        moyenne=total/this.taille;
        System.out.println("La moyenne des notes est: "+ moyenne);
    }
    
    public void pourcentage()
    {
        int compteur_tiers1=0;
        int compteur_tiers2=0;
        int compteur_tiers3=0;
        for ( int i=0; i<this.taille; i++)
        {
            if (notes[i]<8)
            {
                compteur_tiers1++;
            }
            else if (notes[i]>12)
            {
                compteur_tiers3++;
            }
            else{ 
                compteur_tiers2++;     
        }
           
        }
         float pourcentage1 = 0;
         pourcentage1=compteur_tiers1*100/this.taille;
         float pourcentage2= 0;
            pourcentage2=(compteur_tiers2*100/this.taille);
        float pourcentage3= 0;
           pourcentage3=(compteur_tiers3*100/this.taille);
          
            System.out.println("Le pourcentage de note inférieur à 8 est: "+pourcentage1+" %.");
            System.out.println("Le pourcentage de note entre 8 et 12 est: "+ pourcentage2+" %.");
            System.out.println("Le pourcentage de note supérieur à 12 est: "+ pourcentage3+" %.");
            
    }
    
    public boolean isNote(float recherche)
    {
       
    for(int i=0;i<this.taille;i++){
        if(notes[i]==recherche){ 
            return true;
        }
    }
    return false;
}
    
}
