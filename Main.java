//Kevin Sun & Rylen Aniar
//Period 3

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner poop = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort");
        int length = poop.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++)
        {
            System.out.println("What is item " + (i + 1) + "?");
            a[i] = poop.nextInt();

            int flag = 0;
            int len2 = i;
            int changer = 0;
            while (flag == 0)
            {
                flag=1;
                for (int p = 0; p < len2; p++)
                {
                    if(a[p]>a[p+1])
                    {
                        flag=0;
                        changer=a[p];
                        a[p]=a[p+1];
                        a[p+1]=changer;
                    }
                }
            }
        }
        for (int i = 0; i <length; i++)
        {
            System.out.print(a[i]);
            if(!((i+1)==length))
            {
                System.out.print(", ");
            }
        }


    }
}
