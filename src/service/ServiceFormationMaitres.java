package service;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public static final int MIN = 1;
    public static final int MAX = 14;

    public static boolean attribuerModules(Professeur[] professeur, ModuleInfo[] modules){
        int nbre = (int)(Math.random()*(MAX - MIN + 1)) + MIN;
        for (int i = 0; i < modules.length; i++) {
            if (professeur[i] == ) {
                continue;
            }

        }
    }

    public static boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        boolean peutEnseigner = false;
        for (int i = 0; i < modules.length; i++) {

        }
        return peutEnseigner;
    }
}
