
/**
 * Write a description of class Hourglass here.
 * 
 * @Sara Cisneros 
 * @Sep.18.15
 */
public class Hourglass
{
    public static void main (String[] args)
    { 
        hourglassTop();
        cone();
        System.out.println ("     ||");
        pyramid();
        hourglassTop();
    }
    public static void hourglassTop()
    {
        System.out.println ("|\"\"\"\"\"\"\"\"\"\"|");
    }
    public static void cone()
    {
        for (int i=1;i<=4; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print (" ");
            }
            System.out.print ("\\");
            for (int k=1; k<=10-i*2; k++)
            {
                System.out.print (":");
            }
            System.out.println ("/");
        }
    }
    public static void pyramid()
    {
        for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=5-i; j++)
            {
                System.out.print (" ");
            }
            System.out.print ("/");
            for (int k=1; k<=2*i; k++)
            {
                System.out.print (":");
            }
            System.out.println ("\\");
        }
    }
}
                
            
        
    
