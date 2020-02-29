package com.example.objects;

abstract public class car implements czynnosci{
    double waga,moc,spalanie;
    String marka, model;

    car(String marka, String model, double waga, double moc, double spalanie) {
        this.waga = waga;
        this.moc = moc;
        this.spalanie = spalanie;
        this.marka = marka;
        this.model = model;
    }
    abstract String informacje();

    @Override
    public void waga() {
        System.out.println("Waga: " + waga+"kg");

    }

    @Override
    public void moc() {
        System.out.println("Moc pojazdu: " + moc+"KM");

    }

    @Override
    public void spalanie() {
        System.out.println("Spalanie na 100km: " + spalanie+" litrow");

    }

     void print(){
            System.out.println("Samochod marki: " + informacje());
            System.out.println("Model pojazdu: "+ model);
            waga();
            moc();
            spalanie();

    }

}
