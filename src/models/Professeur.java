package models;

import java.util.Arrays;

public class Professeur {
    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        modulesEnseignes = null;
        

    }

    public boolean enseigneCeModule(String nomDuModule) {
       boolean enseigneCeModule = false;
        for (int j = 0; j < modulesEnseignes.length; j++) {
             if (modulesEnseignes[i] != null) {
                enseigneCeModule = true;
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
