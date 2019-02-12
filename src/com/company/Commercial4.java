package com.company;

public class Commercial4 extends PEnergyclass {

    private double costdue;
    private double cost;
    private double usage;

    public Commercial4(double soutput, double svalue, double susage, double rate, double excess, double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double costdue, double cost, double usage1) {
        super(soutput, svalue, susage, rate, excess, consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.costdue = costdue;
        this.cost = cost;
        this.usage = usage1;
    }

    public Commercial4(double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double costdue, double cost, double usage1) {
        super(consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.costdue = costdue;
        this.cost = cost;
        this.usage = usage1;
    }


    public Commercial4(double costdue, double cost, double usage) {
        this.costdue = costdue;
        this.cost = cost;
        this.usage = usage;
    }

    public Commercial4() {
        this.costdue =(cost)-excess;
        this.cost =(consumption +FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP)*usage;
        this.usage = 0;
    }

    public double getPeriod(boolean time) {
        //if time of consumption is peak
        if(time=true){
            energy=10.30;
        }
        else{
            energy=5.15;
        }
        return energy;
    }


    public double getConsumption(){

        consumption=energy+demand;
        return consumption;
    }

    public double getCostdue(){

        costdue=(cost)-excess;
        return costdue;
    }

    public double getCost() {
        cost=(consumption+ FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP)*usage;
        return cost;
    }

    public double getUsage(double use) {
        this.usage=use;

        return usage;
    }
}
