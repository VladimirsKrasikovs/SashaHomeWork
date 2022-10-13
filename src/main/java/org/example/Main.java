package org.example;

import java.sql.SQLOutput;

public class Main {




    public static void main(String[] args) {

        Transport train = new Transport("Rail", 2500, 40.5);
        Transport carToyotaPrius = new Transport("Road", 60, 7.2);
        Transport plainCesna = new Transport("Fly", 1500, 150);


        Rout rout1 = new Rout("Riga", "Moscow", 850);
        Rout rout2 = new Rout("Riga", "Berlin", 1850);
        Rout rout3 = new Rout("Riga", "Sochi", 3600);

        System.out.println(rout1);
      System.out.println("To complete 1 Rout train will consume " + rout1.getDistance()*train.transportFuelConsumptionOnOneKM() + " Lit");
      System.out.println("To complete 1 Rout Car will consume " + rout1.getDistance()*carToyotaPrius.transportFuelConsumptionOnOneKM() + " Lit");
      System.out.println("To complete 1 Rout Plain will consume " + rout1.getDistance()*plainCesna.transportFuelConsumptionOnOneKM() + " Lit");
        System.out.println(train.canComplete(850));


    }


    }

