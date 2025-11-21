public class Main {
    public static void main(String[] args) {
        Restaurant rest=new Restaurant("Restaurent Abou Zayd","sidi jaber beni mellal");

        Plat p = new Plat("Tacos Poulet",35.00);
        Plat p2 = new Plat("Pizza Margherita",55.00);
        Plat p3 = new Plat("Burger Double",45.00);
        Plat p4 = new Plat("Couscous",50.00);
        Plat p5 = new Plat("Pastilla",60.00);
        Serveur ser1 =new Serveur("Ayoub","0634852458");
        Serveur ser2 =new Serveur("sana","0634852458");
        Serveur ser3 =new Serveur("Amin","0634852458");
        rest.addServeur(ser1);
        rest.addServeur(ser2);
        rest.addServeur(ser3);
        rest.Afficher_serveur();
        rest.addPlat(p);
        rest.addPlat(p2);
        rest.addPlat(p3);
        rest.addPlat(p4);
        rest.removePlat(p5);

        rest.afficher_menu();
//        Commande c=new Commande(1,"Command1");
        p.isDisponibilite();



    }
}
