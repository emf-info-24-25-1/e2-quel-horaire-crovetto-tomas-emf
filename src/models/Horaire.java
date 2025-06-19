package models;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    //MR doit être final
    private Bloc[] blocs;

    public Horaire() {
        blocs = null;
        //MR tu dois créer le tableau avec les blocs
    }

    public boolean planifier(ModuleInfo module, Professeur[] profs) {
        boolean reussi = true;

        return reussi;

    }

    public void afficherHoraire() {
        
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        
    }

}
