
public class Plat {
    private int id;
    private String nom;
    private double price;
    public Plat(int id, String nom, double price) {
        this.id = id;
        this.nom = nom;
        this.price = price;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
