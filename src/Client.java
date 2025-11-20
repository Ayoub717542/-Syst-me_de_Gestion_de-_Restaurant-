import java.util.ArrayList;
import java.util.List;

public class Client {
    int idClient;
    String nom;
    Restaurant r;
    List<Commande> commandes;

    public Client(int idClient, Restaurant r) {
        this.idClient = idClient;
        this.r = r;
        this.commandes = new ArrayList<>();
    }

    public void passerCommande(Commande c){
        commandes.add(c);
    }

    public void afficherCommandes(){
        System.out.println(" Liste des commandes: ");
        if(commandes.size()>0){
            for (Commande c : commandes ){

                System.out.println("Commandes de "+this.nom+" : "+c);
            }
        }
    }
}
