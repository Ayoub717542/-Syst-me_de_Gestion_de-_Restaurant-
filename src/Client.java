import java.util.ArrayList;
import java.util.List;

public class Client {
    private int idClient;
    private String nom;
    Restaurant r;
    List<Commande> commandes;

    public int getIdClient() {return idClient;}
    public void setIdClient(int idClient) {this.idClient = idClient;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public Client(int idClient, String nom) {
        this.idClient = idClient;
        this.nom = nom;
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
        else{
            System.out.println("Pas de Commande !");
        }
    }
}
