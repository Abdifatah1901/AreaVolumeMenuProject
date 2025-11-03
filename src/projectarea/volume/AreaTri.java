package projectarea.volume;

import java.util.Scanner;

public class AreaTri 
{
   public void Triangle()
   {
      int base,height;
      double area;
       Scanner sc = new Scanner(System.in);
       System.err.println("Enter the base");
       base = sc.nextInt();
       System.err.println("Ente the height");
       height = sc.nextInt();
       area = 0.5*base*height;
       System.err.println("The area of triangle is "+area);
   }
}
