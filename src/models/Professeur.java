package models;

import java.util.Arrays;

public class Professeur {
    //MR Manque les finals sur les deux premiers attributs
    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        //MR Il faut crééer le tableau de modulesEnseignés à une taille de 0
        modulesEnseignes = null;
        

    }

    public boolean enseigneCeModule(String nomDuModule) {
       boolean enseigneCeModule = false;
        for (int j = 0; j < modulesEnseignes.length; j++) {
            //MR Pourquoi i ci-dessous ?
             if (modulesEnseignes[i] != null) {
                enseigneCeModule = true;
                //MR un petit break ici
       }
        }
      
        return enseigneCeModule;

    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes != null) {
                module[i] += modulesEnseignes[i];
            }
        }
    }

    public void viderModules() {

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom.toUpperCase();
    }

}
