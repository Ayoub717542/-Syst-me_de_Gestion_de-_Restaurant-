import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String adresse;
    List<Serveur> serveurs;
    List<Plat> plats;

    public Restaurant(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        plats = new ArrayList<>();
        serveurs = new ArrayList<>();
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}
    public List<Plat> getPlats() {return plats;}
    public void setPlats(List<Plat> plats) {this.plats = plats;}

    public void addServeur(Serveur serveur) {
        this.serveurs.add(serveur);
        System.out.println("\u001B[32m"+serveur.getNom()+"\u001B[0m"+" has been Added.");
    }
    public void RemoveServeur(Serveur serveur) {
        this.serveurs.remove(serveur);
        System.out.println("\u001B[31m"+serveur.getNom()+"\u001B[0m"+" has been Removed.");
    }
    public void Afficher_serveur(){
        for(Serveur serveur : serveurs){
            System.out.println("ID : "+serveur.getId_serveur()+"\nName : "+serveur.getNom()+"\nphone : "+serveur.getPhone());
        }
    }

    public void addPlat(Plat plat){
        plat.setDisponibilite(true);
        plats.add(plat);
        System.out.println("\u001B[32m"+plat.getNom()+"\u001B[0m"+" has been Added.");
    }
    public void removePlat(Plat plat){
        plat.setDisponibilite(false);
        plats.remove(plat);
        System.out.println("\u001B[31m"+plat.getNom()+"\u001B[0m"+" has been removed !!");
    }
    public void afficher_menu(){
        System.out.println("\u001B[32m" + "      ----- MENU DU RESTAURANT -----" + "\u001B[0m");
            for(Plat p : plats){
                if(p.isDisponibilite()==true){
                    System.out.println("        plate : "+p.getNom()+"- Prix :"+"\u001B[34m"+p.getPrice()+"\u001B[0m");
                }
            }
        System.out.println("Welcome to "+"\u001B[31m"+getName()+"\u001B[0m");
        System.out.println("Adresse => "+getAdresse());

    }
}
