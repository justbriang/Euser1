package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
      /*  try{
            //get a connection to database
            Connection demo= DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","");
            //create a statement
            Statement mystmt=demo.createStatement();
            //execute a sql query
            ResultSet myrs=mystmt.executeQuery("SELECT * FROM  user");

            //process result
            while(myrs.next()){
                System.out.println (myrs.getString("uindex")+" "+myrs.getString("egrid")+" "+myrs.getString("usolar"));
            }

        }
        catch(Exception exc){
            exc.printStackTrace();
        }*/
        double sumG=0;
        double sumS=0;
        double sumo=0;

        double egrid[]={12,23,13,45,67,89,34,56,78,12,45,2,34,5,6,6,78,9,0,12,34,53,32,45,33,24,55,67,23,13};
        for(int i=0;i<30;i++){
            sumG+=egrid[i];
        }
        double solar[]={11,23,14,11,23,45,34,55,34,32,22,14,32,56,12,23,11,23,45,43,33,24,35,67,89,12,11,23,44,56};
        for(int i=0;i<30;i++){
            sumS+=solar[i];
        }
        double Soutp[]={12,33,44,71,93,95,44,75,4,2,42,34,82,76,32,73,31,43,95,33,63,24,55,97,59,332,231,213,444,556};
        for(int i=0;i<30;i++){
            sumo+=solar[i];
        }

        Solar pel=new Commercial3();
        ((Commercial3) pel).getPeriod(true);
        System.out.println("The rate at which usere are selling their excess solar power is");
        pel.setSoutput(sumo);
        pel.setRate(9);
        System.out.println(pel.getRate());
        System.out.println("usage is ");
        System.out.println(((Commercial3) pel).getUsage(sumG)+" units");
        System.out.println("Solar energy produced is");
        pel.setSoutput(sumS);
        System.out.println(pel.getSoutput());
        double a, b;
        a=pel.getSvalue();
        b=((Commercial3) pel).getCost();

        System.out.println("the cost due is");
        System.out.println(b-a);

        System.out.println("Time");
        LocalTime time= LocalTime.now();
        System.out.println(time);






    }
}
