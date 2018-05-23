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

    // Getters og setters for alle modellfelt
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

    public void setNavn(String navn)
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

    public int getAvdeling()
    {
        return avdeling;
    }

    public void setAvdeling(int avdeling)
    {
        this.avdeling = avdeling;
    }
}

