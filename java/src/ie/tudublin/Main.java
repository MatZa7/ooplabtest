package ie.tudublin;



public class Main
{
    public static void nematodeVisualiser()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new NematodeVisualiser());
    }

    
    public static void main(String[] args)
    {
        nematodeVisualiser();
        
    }
}