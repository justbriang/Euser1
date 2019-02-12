package com.company;

public class Commercial3 extends PEnergyclass {
    private double cost;
    private double costdue;
    private double usage;

    public Commercial3(double soutput, double svalue, double susage, double rate, double excess, double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double cost) {
        super(soutput, svalue, susage, rate, excess, consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.cost = cost;
    }

    public Commercial3(double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double cost) {
        super(consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.cost = cost;
    }

    public Commercial3(double cost) {
        this.cost = cost;
    }

    public Commercial3() {
        consumption=demand+energy;
        FCC=2.45;
        VAT=2.98;
        FERFA=0.11;
        AI=0.25;
        WARMA=0.02;
        EFRC=0.03;
        REP=0.79;
        energy=5.25;
        demand=270;
        usage=0;
        costdue=(cost)-excess;
        cost=consumption+ FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP;
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


    public double getConsumption(){

        consumption=energy+demand;
        return consumption;
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
