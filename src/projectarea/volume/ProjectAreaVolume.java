package projectarea.volume;

import java.util.Scanner;

public class ProjectAreaVolume
{

    public static void main(String[] args) 
    {
      int num;
        Scanner sc = new Scanner(System.in);
        System.err.println("Choose one \n1.Hello World \n2.Area of Rect \n3.Area of Circle \n98.More");
        num = sc.nextInt();
        
        if (num ==1)
        {
          Helloclass obj = new Helloclass();
          obj.Hello();
        }
        else if (num ==2)
        {
          AreaRect bobj = new AreaRect();
          bobj.Rect();
        }
        else if (num ==3)
        {
          Areacircle cobj = new Areacircle();
          cobj.circle();
        }
        else if (num ==98)
        {
          int num2;
            System.err.println("Choose one \n1.Surface area of Cylinder \n2.Volume of Cylinder \n3.Area of triangle \n0:Back");
            num2 = sc.nextInt();
            if (num2 ==1)
            {
               Surfacearea dobj = new Surfacearea();
               dobj.Surface();
            }
            else if (num2 ==2)
            {
              VolumeCylind eobj = new VolumeCylind();
              eobj.Volume();
            }
            else if (num2 ==3)
            {
             AreaTri fobj = new AreaTri();
             fobj.Triangle();
            }
            else if (num2 ==0)
            {
             System.err.println("Choose one \n1.Hello World \n2.Area of Rect \n3.Area of Circle \n98.More"); 
            }
        }
    }
    
}
