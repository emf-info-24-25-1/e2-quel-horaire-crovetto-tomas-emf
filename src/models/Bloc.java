package models;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINES = 10;
        private String nom;
        ModuleInfo[] modules;
    
        public Bloc(String nom) {
            this.nom = nom;
            modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINES];
           
           for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null && modules[i] < 3) {
                ModuleInfo module =     
            }
           }
            
        }
    
        public boolean planifierModule(ModuleInfo module) {
            boolean trouvee = false;
            return trouvee;
        }
    
        public void afficherHoraire() {
            if (Bloc != null) {
            
        }
    }

    public boolean estTotalementPlanifie() {
        return true;
    }

    public boolean contientModule(ModuleInfo module) {
        return true;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom ;
    }
    

}
