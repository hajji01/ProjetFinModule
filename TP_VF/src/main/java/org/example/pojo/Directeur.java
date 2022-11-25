package src.main.java.org.example.pojo;

public class Directeur extends Salarie{
    private double primeDirecteur;

    public Directeur(double salaire,String nom,double primeDirecteur) {
        super(salaire,nom);
        this.primeDirecteur=primeDirecteur;

    }
    public  Directeur() {
        primeDirecteur = 0.0;
    }
    public double getprimeDirecteur() {
        return primeDirecteur;

    }

    public void setprimeDirecteur(double primeDirecteur) {
        this.primeDirecteur=primeDirecteur;
    }

    public String toString() {
        return super.toString()+" et son prime est : "+this.primeDirecteur;
    }


    public void  afficheSalaire() {
        System.out.println("Le salaire est : "+(this.salaire+this.primeDirecteur));
    }

    public double getPrimeDirecteur() {
        return primeDirecteur;
    }

    public void setPrimeDirecteur(double primeDirecteur) {
        this.primeDirecteur = primeDirecteur;
    }
}
