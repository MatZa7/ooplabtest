package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public float border;
	int pos;

	public void keyPressed()
	{		
		System.out.println("before= " + pos);
		if (keyCode == LEFT)
		{
			if(pos == 0)
			{
				pos = nematodes.size();
			}
			else
			{
				pos--;
			}
		}	
		else if (keyCode == RIGHT)
		{
			pos++;
		}	
		System.out.println("after= " + pos);	
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		loadNematodes();
		colorMode(HSB);
		background(0);
		smooth();	
		border = width * 0.2f;	
		pos = 0;		
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode s = new Nematode(r);
            nematodes.add(s);
        }
	}

	public void drawNematodes(int x)
    {
        nematodes.get(x).render(this);;
    }


	public void draw()
	{	
		background(0);
		drawNematodes(pos);
	}
}
