package projectarea.volume;

import java.util.Scanner;

public class AreaRect 
{
    public void Rect()
    {
        int length,width,area;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Length");
        length = sc.nextInt();
        System.err.println("Enter the Width");
        width = sc.nextInt();
        area = length*width;
        System.err.println("The area is "+area);
    }
}
