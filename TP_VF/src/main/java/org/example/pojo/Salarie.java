package src.main.java.org.example.pojo;

public class Salarie {
    protected double salaire;
    protected String nom;

    public Salarie(double salaire,String nom) {
        this.nom=nom;
        this.salaire=salaire;
    }
    public Salarie() {
        nom = "";
        salaire = 0;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public String getNom() {
        return this.nom;
    }


    public void setSalaire(double salaire) {
        this.salaire=salaire;
    }
    public void setNom(String nom) {
        this.nom=nom;
    }

    public String toString() {
        return "Le salaire est : "+this.salaire+ " et le nom est : "+this.nom;
    }

    public void  afficheSalaire() {
        System.out.println("Le salaire est : "+this.salaire);
    }
}
