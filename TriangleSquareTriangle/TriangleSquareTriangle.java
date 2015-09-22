
/**
 * TriangleSquareTriangle 
 * 
 * @Sara Cisneros 
 * Sep.21.2015
 */
public class TriangleSquareTriangle
{
    public static void main (String[] args)
    {
        for (int lines= 1; lines <= 7; lines++)
        {
            for (int stars= 6; stars >= lines; stars--)
            { 
                System.out.print ("*");
            }
            for (int spaces=1; spaces< lines; spaces++)
            {
                System.out.print(" ");
            }
            System.out.print (" ");
            for (int slash= 6; slash>= lines; slash--)
            {
                System.out.print ("//");
            }
            for (int backslash= 1; backslash<=lines-1; backslash++)
            {
                System.out.print ("\\\\");
            }
            System.out.print (" ");
            for (int spaces=1; spaces<lines;spaces++)
            {
                System.out.print (" ");
            }
            for (int stars=6; stars>=lines; stars--)
            {
                System.out.print ("*");
            }
            System.out.println(" ");
        }
    }
}
            
        
