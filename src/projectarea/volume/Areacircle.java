package projectarea.volume;

import java.util.Scanner;

public class Areacircle 
{
    public void circle()
    {
        int radius;
        double pi=3.14;
        double area;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the radius");
        radius = sc.nextInt();
        area = pi*radius*radius;
        System.err.println("The area of circle is "+area);
    }
}
