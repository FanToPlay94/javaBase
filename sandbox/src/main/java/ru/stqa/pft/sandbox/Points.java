package ru.stqa.pft.sandbox;

public class Points {

    public double a;
    public double b;

    public Points(double a, double b){
        this.a = a;
        this.b = b;
    }
    public  double distance(){
        return Math.sqrt(this.a) * Math.sqrt(this.b);
    }
}
