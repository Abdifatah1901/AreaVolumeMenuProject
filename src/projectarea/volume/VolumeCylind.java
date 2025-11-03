package projectarea.volume;

import java.util.Scanner;

public class VolumeCylind 
{
    public void Volume()
    {
       int radius,height;
       double pi=3.14;
       double volume;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter radius");
        radius = sc.nextInt();
        System.err.println("Enter height");
        height = sc.nextInt();
        volume = pi*radius*radius*height;
        System.err.println("The volume of cylinder is "+volume);
    }
}
