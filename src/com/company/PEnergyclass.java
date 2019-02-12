package com.company;

import com.company.Solar;

public class PEnergyclass extends Solar {
protected double consumption;
protected double FCC;
protected double VAT;
protected double FERFA;
protected double AI;
protected double WARMA;
protected double EFRC;
protected double REP;
protected double demand;
protected double energy;
protected double usage;

    public PEnergyclass(double soutput, double svalue, double susage, double rate, double excess, double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage) {
        super(soutput, svalue, susage, rate, excess);
        this.consumption = consumption;
        this.FCC = FCC;
        this.VAT = VAT;
        this.FERFA = FERFA;
        this.AI = AI;
        this.WARMA = WARMA;
        this.EFRC = EFRC;
        this.REP = REP;
        this.demand = demand;
        this.energy = energy;
        this.usage = usage;
    }

    public PEnergyclass(double consumption, double FCC, double VAT, double FERFA, double AI, double WARMA, double EFRC, double REP, double demand, double energy, double usage) {
        this.consumption = consumption;
        this.FCC = FCC;
        this.VAT = VAT;
        this.FERFA = FERFA;
        this.AI = AI;
        this.WARMA = WARMA;
        this.EFRC = EFRC;
        this.REP = REP;
        this.demand = demand;
        this.energy = energy;

    }

    public PEnergyclass() {
        consumption=demand+energy;
        FCC=2.45;
        VAT=2.98;
        FERFA=0.11;
        AI=0.25;
        WARMA=0.02;
        EFRC=0.03;
        REP=0.79;
        demand=0;
        energy=0;



    }

}
