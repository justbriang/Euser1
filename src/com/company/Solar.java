package com.company;

public class Solar {

    protected double Soutput;
    protected double Svalue;
    protected double Susage;
    protected double rate;
    protected double excess;

    public Solar(double soutput, double svalue, double susage, double rate, double excess) {
        Soutput = soutput;
        Svalue = svalue;
        Susage = susage;
        this.rate = rate;
        this.excess = excess;
    }
    public Solar() {

         Soutput=0;
         Svalue=0;
         Susage=0;
         rate=0;
         excess=0;

    }

    public double getSoutput() {
        return Soutput;
    }

    public void setSoutput(double soutput) {
        Soutput = soutput;
    }

    public double getSusage() {
        return Susage;
    }

    public void setSusage(double susage) {
        Susage = susage;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getexcess(){
    excess=Soutput-Susage;
        return excess;
}
    public double getSvalue() {
        Svalue=rate*excess;
        return Svalue;
    }

}
