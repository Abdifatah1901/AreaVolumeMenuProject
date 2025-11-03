package projectarea.volume;

import java.util.Scanner;

public class Surfacearea 
{
  public void Surface() 
  {
      int radius,height;
      double pi=3.14;
      double surfacearea;
      Scanner sc = new Scanner(System.in);
      System.err.println("Enter the radius");
      radius = sc.nextInt();
      System.err.println("Enter the height");
      height = sc.nextInt();
      surfacearea = (2*pi*radius*radius) + (pi*radius*height);
      System.err.println("The Surfacearea is "+surfacearea);
      
  } 
}
