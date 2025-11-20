import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private String nom;
    List<Plat> p;
    public Commande(int id, String nom) {
        this.id = id;
        this.nom = nom;
        p = new ArrayList<Plat>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Plat> getCommandes() {
        return p;
    }

    public void setCommandes(List<Plat> P) {
        this.p = p;
    }

    public void calculer_total(){
        double sum = 0;
        for(Plat p : p){
            sum=sum+p.getPrice();
        }
        System.out.println("--------- Commandes "+getId()+" ----------");
        System.out.println("Nom : "+getNom());
        System.out.println("Total de commandes : "+sum);
    }
}
