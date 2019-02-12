package com.company;

import com.company.PEnergyclass;

public class Commercial5 extends PEnergyclass {


        private double usage;
        private double consumption;
        private double energy;
        private double costdue;
        private double cost;

        public Commercial5(){
            this.consumption = 15.80;
            this.demand = 220;
            this.energy= 10.90;
            this.cost =(consumption +FCC+ VAT+FERFA+AI+WARMA +EFRC+ REP)*usage;
            this.costdue =(cost)-excess;

        }


    public Commercial5(double soutput, double svalue, double susage, double rate, double excess, double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double usage1, double consumption1, double energyC, double costdue, double demand1) {
        super(soutput, svalue, susage, rate, excess, consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.usage = usage1;
        this.consumption = consumption1;
        this.energy= energyC;
        this.costdue = costdue;
        this.demand = demand1;
    }

    public Commercial5(double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage, double usage1, double consumption1, double energyC, double costdue, double demand1) {
        super(consumption, FCC, VAT, FERFA, AI, WARMA, EFRC, REP, demand, energy, usage);
        this.usage = usage1;
        this.consumption = consumption1;
        this.energy= energyC;
        this.costdue = costdue;
        this.demand = demand1;
    }

    public Commercial5(double usage, double consumption, double energyC, double costdue, double demand) {
        this.usage = usage;
        this.consumption = consumption;
        this.energy= energyC;
        this.costdue = costdue;
        this.demand = demand;
    }



    public double getPeriod(boolean time){
            //if time of consumption is peak
            if(time=true){
                energy=10.10;
            }
            else{
                energy=5.05;
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


