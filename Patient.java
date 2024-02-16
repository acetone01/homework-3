public class Patient
{
    private int id;
    private double caffeineLevel;

    public Patient(int id, double caffeineLevel)
    {
        this.id = id;
        this.caffeineLevel = caffeineLevel;
    }

    //getters
    public int getId() {return id;}
    public double getCaffeineLevel() {return caffeineLevel;}

    //setters
    public void setCaffeineLevel(double caffeineLevel) {this.caffeineLevel = caffeineLevel;}
}
