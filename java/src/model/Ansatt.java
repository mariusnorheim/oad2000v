package model;

public class Ansatt
{
    private int id;
    private String navn;
    private double timeLonn;
    private int avdeling;

    public Ansatt(int id, String navn, double timeLonn, int avdeling)
    {
        this.id = id;
        this.navn = navn;
        this.timeLonn = timeLonn;
        this.avdeling = avdeling;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String name)
    {
        this.navn = navn;
    }

    public double getTimeLonn()
    {
        return timeLonn;
    }

    public void setTimeLonn(double timeLonn)
    {
        this.timeLonn = timeLonn;
    }

    public boolean getAvdeling()
    {
        return avdeling;
    }

    public void setAvdeling(int avdeling)
    {
        this.avdeling = avdeling;
    }
}

