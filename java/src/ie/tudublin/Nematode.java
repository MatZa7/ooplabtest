package ie.tudublin;

import processing.core.PApplet;
import processing.core.PConstants;
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
        pa.colorMode(PConstants.RGB);
        
        if(gender.equals("f"))
        {
            pa.fill(255, 192, 203);
        }
        else if(gender.equals("m"))
        {
            pa.fill(194, 255, 245);
        }
        float center = pa.width/2;
        float space = 10-length;
        space = space * 40;

        pa.fill(255,255,255);
        pa.textSize(25);
        pa.textAlign(PApplet.CENTER, PApplet.CENTER);
        pa.text(name, center, space/4);
        
        for(int i=1;i<=length;i++)
        {
            if(gender.equals("h")) 
            {
                if(i%2==0)
                {
                    pa.fill(194, 255, 245);
                }
                else
                {
                    pa.fill(255, 192, 203);
                }
            }
            float y;
            if(length == 1)
            {
                y = pa.height/2;
            }
            else{
                y = PApplet.map(i, 1,length, space, pa.height-space);
            }
            
            pa.circle(center, y, 80);
            if( i == length && (gender.equals("f") || gender.equals("h")))
            {
                pa.fill(0);
                pa.circle(center, y, 30);
                pa.fill(255);
            }
            if( i == length && (gender.equals("m") || gender.equals("h")))
            {
                
                pa.line(center,y+30, center,y+90);
                pa.circle(center,y+90, 10);
            }

            if( i == 1 && eyes == 1)
            {
                pa.stroke(255);
                pa.line(center-30,y-30, center-60,y-60);
                pa.line(center+30,y-30, center+60,y-60);
                pa.circle(center-60,y-60, 10);
                pa.circle(center+60,y-60, 10);
            }

            if(limbs == 1)
            {
                pa.stroke(255);
                pa.line(center-30,y, center-80,y);
                pa.line(center+30,y, center+80,y);
            }
            
        }
        

    }
}