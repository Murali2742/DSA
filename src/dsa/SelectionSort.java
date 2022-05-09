package dsa;

import java.util.*;

public class SelectionSort {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min=Integer.MAX_VALUE;
        int t=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    t=j;
                }



            }
            arr[t]=arr[i];
            arr[i]=min;

            min=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }









}
