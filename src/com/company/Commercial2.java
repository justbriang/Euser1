package com.company;

public class Commercial2 extends PEnergyclass {
    private double cost;
    private double costdue;
    private double usage;



    public Commercial2() {
        consumption=demand+energy;
        costdue=(cost)-excess;
        cost=consumption +FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP;
    }

    public Commercial2(double soutput, double svalue, double susage, double rate, double excess, double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double cost, double costdue, double usage1) {
        super(soutput, svalue, susage, rate, excess, consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.cost = cost;
        this.costdue = costdue;
        this.usage = usage1;
    }

    public Commercial2(double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double cost, double costdue, double usage1) {
        super(consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.cost = cost;
        this.costdue = costdue;
        this.usage = usage1;
    }

    public Commercial2(double cost, double costdue, double usage) {
        this.cost = cost;
        this.costdue = costdue;
        this.usage = usage;
    }

    public double getPeriod(boolean time) {
        //if time of consumption is peak
        if(time=true){
            energy=10.90;
        }
        else{
            energy=5.45;
        }
        return energy;
    }


public double getConsumption() {

    consumption = energy + demand;
    return consumption;
}
    public double getCost() {
        cost=(consumption +FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP)*usage;
        return cost;
    }

    public double getCostdue() {
        costdue=(cost)-excess;
        return costdue;
    }

    public double getUsage(double use) {
        this.usage=use;
        return usage;
    }



}

