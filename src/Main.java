public class Main {
    public static void main(String[] args) {
        Plat plat = new Plat(1,"pla1",30);
        Plat plat1 = new Plat(1,"pla1",30);
        Commande c=new Commande(1,"Command1");
        c.calculer_total();
    }
}
