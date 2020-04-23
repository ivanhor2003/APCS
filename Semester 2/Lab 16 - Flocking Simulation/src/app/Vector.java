package app;

public class Vector {
    public double xvalue;
    public double yvalue;
    
    public Vector() {
        this.xvalue = Math.random()-0.5;
        this.yvalue = Math.random()-0.5;
    }
    
    public Vector(double xvalue, double yvalue) {
        this.xvalue = xvalue;
        this.yvalue = yvalue;
    }
    
    public double getXValue() { return this.xvalue; }
    public double getYValue() { return this.yvalue; }
        
    public void setXValue(double newValue) { this.xvalue = newValue; }
    public void setYValue(double newValue) { this.yvalue = newValue; }

    public void limit(double maxForce) {
        double magnitude = Math.sqrt(Math.pow(this.xvalue, 2) + Math.pow(this.yvalue, 2));
        double multiplier;
        if(magnitude > maxForce) 
            multiplier = maxForce / magnitude;
        else
            multiplier = 1.0;
        
        this.xvalue *= multiplier;
        this.yvalue *= multiplier;
    }

    public void setMagnitude(double maxSpeed) {
        double currentMagnitude = Math.sqrt(Math.pow(this.xvalue, 2) + Math.pow(this.yvalue, 2));
        
    }
    
    void add(Vector parent) {
        this.xvalue += parent.getXValue();
        this.yvalue += parent.getYValue();
    }

    void subtract(Vector parent) {
        this.xvalue -= parent.getXValue();
        this.yvalue -= parent.getYValue();
    }

    void divide(double denominator) {
        this.xvalue /= denominator;
        this.yvalue /= denominator;
    }
}