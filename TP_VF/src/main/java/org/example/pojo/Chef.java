package src.main.java.org.example.pojo;

public class Chef extends Salarie{
    private double primeChef;
    public Chef(double salaire,String nom,double primeChef) {
        super(salaire,nom);
        this.primeChef=primeChef;
    }
    public Chef() {
        primeChef = 0.0;
    }

    public double getprimeChef() {
        return primeChef;

    }

    public void setprimeChef(double primeChef) {
        this.primeChef=primeChef;
    }


    public String toString() {
        return super.toString()+" et son prime est : "+this.primeChef;
    }
    public void  afficheSalaire() {
        System.out.println("Le salaire est : "+(this.salaire+this.primeChef));
    }

    public double getPrimeChef() {
        return primeChef;
    }

    public void setPrimeChef(double primeChef) {
        this.primeChef = primeChef;
    }
}
