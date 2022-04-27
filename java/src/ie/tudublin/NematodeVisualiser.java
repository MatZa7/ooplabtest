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
		if (keyCode == LEFT)
		{
			if(pos == 0)
			{
				pos = nematodes.size()-1;
			}
			else
			{
				pos--;
			}
		}	
		else if (keyCode == RIGHT)
		{
			if(pos==nematodes.size()-1)
			{
				pos = 0;
			}
			else
			{
				pos++;
			}
			
		}		
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

	public void drawArrows()
	{
		fill(255);
		float leftX1 = width/8;
		float leftX2 = width/4;
		float rightX1 = width - leftX1;
		float rightX2 = width - leftX2;
		line(leftX1,height/2,leftX2,height/2);
		
		line(rightX1,height/2,rightX2,height/2);

		line(leftX1,height/2,leftX1*1.4f,height/2.1f);
		line(leftX1,height/2,leftX1*1.4f,height-(height/2.1f));

		line(rightX1,height/2,width-(leftX1*1.4f),height-(height/2.1f));
		line(rightX1, height/2,width-(leftX1*1.4f),height/2.1f);
	}


	public void draw()
	{	
		background(0);
		drawNematodes(pos);
		drawArrows();
	}
}
