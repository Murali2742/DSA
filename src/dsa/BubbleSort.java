package dsa;
import java.util.*;

public class BubbleSort {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int p =arr[n];
        int temp=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }


        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(arr[i]);
        }


    }

}
