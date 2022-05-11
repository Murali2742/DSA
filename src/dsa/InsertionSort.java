package dsa;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                for(int j=i;j>=1;j--)
                {
                    if(arr[j]<arr[j-1])
                    {
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);

        }

    }

}
