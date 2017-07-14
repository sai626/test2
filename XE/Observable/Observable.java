package XE.Observable;


public abstract class Observable {

    private double value = 0;
    String name;

    public void setValue(double value){
        this.value=value;
    }

    public double getValue(){
        return value;
    }

    public String getName(){
        return name;
    }
}
