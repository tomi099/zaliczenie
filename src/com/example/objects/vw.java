package com.example.objects;

    public class vw extends car implements czynnosci{

    vw(String marka, String model, double waga, double moc, double spalanie) {
        super(marka, model, waga, moc, spalanie);
    }

    @Override
    String informacje() {
        return "volkswagen";
    }
}
