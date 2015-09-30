
/**
 * ChristmasTrees 
 * print different size trees
 * 
 * @Sara Cisneros 
 * @September 28, 2015
 */
public class ChristmasTrees
{
    public static void main(String[] args)
    {
        treeTemplate(3,4);
        treeTrunk();
        System.out.println (" ");
        treeTemplate(2,5);
        treeTrunk();
    }
    public static void treeTemplate(int sections, int height)
    {
        for (int i=1; i<=sections; i++)
        {
            for (int j=1; j<= height; j++)
            {
                for (int k=1; k <= (7- i)- j; k++)
                {
                    System.out.print (" ");
                }
                for (int h= 1; h <= (2* j)+ (2*i)-3 ; h++)
                {
                    System.out.print ("*");
                }
                System.out.println (" ");
            }
        }
    }
    public static void treeTrunk()
    {
        System.out.println ("     *");
        System.out.println ("     *");
        System.out.println ("  *******");
    }
}
