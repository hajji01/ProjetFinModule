package src.test.java.org.example;

import src.main.java.org.example.pojo.Chef;
import src.main.java.org.example.pojo.Directeur;
import src.main.java.org.example.pojo.Ouvrier;
import src.main.java.org.example.pojo.Salarie;

import java.util.ArrayList;
import java.util.ArrayList;
/**
 * Unit test for simple App.
 */
public class Test {

    public static void main(String[] args) {
        ArrayList <Salarie> lesSalaries= new ArrayList <>();
        lesSalaries.add(new Directeur(15000,"Zakaria",5000));
        lesSalaries.add(new Chef(10000,"Baptiste",3000));
        lesSalaries.add(new Ouvrier(6000,"Hugo"));

        for (Salarie a:lesSalaries) {
            System.out.println(a);
            a.afficheSalaire();
        }


    }


}