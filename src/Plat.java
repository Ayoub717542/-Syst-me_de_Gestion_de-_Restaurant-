public class Plat {
    private String nom;
    private double prix;
    private boolean special;
    private boolean disponible;

    public Plat(String nom , double prix , boolean special ,boolean disponible){
        this.nom=nom;
        this.prix=prix;
        this.special=special;
        this.disponible=disponible;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isSpecial() {
        return special;
    }

    public boolean isDisponible(){
        return disponible;
    }

        @Override
        public String toString() {
            String tag = special ? " (Spécial)" : "";
            String dispoTxt = disponible ? " Disponible " : " Indisponible ";
            return nom + " - " + prix + " DH" + tag + dispoTxt;
    }
}


