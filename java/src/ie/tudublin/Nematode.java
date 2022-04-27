package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode
{
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    @Override
    public String toString() {
        return "Nematode [Name=" + name + ", Length=" + length + ", Limbs=" + limbs + ", Gender=" + gender + ", Eyes=" + eyes + "]";
    }

    public Nematode(TableRow tr)
    {
        this(
            tr.getString("name"), 
            tr.getInt("length"),
            tr.getInt("limbs"),
            tr.getString("gender"),
            tr.getInt("eyes")
        );
    }

    public Nematode(String name, int length, int limbs, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public void render(NematodeVisualiser pa)
    {
        pa.fill(255);
        float space = pa.height/(length*1f);
        for(int i=1;i<=length;i++)
        {
            float y = PApplet.map(i, 1,length, space, pa.height-space);
            pa.circle(pa.width/2, y, 80);
        }

    }
}