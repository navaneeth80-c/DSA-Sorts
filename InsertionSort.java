import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void Insertion(int num[]) {
        for (int i = 1; i < num.length ; i++) {
            int current = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > current) {
                System.out.println(num[i]+"::");
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev+1] = current;
        }
    }
        public static void main(String aggs[])
        {
           int[] num={10,-1,5,-9,9,-99};
           selectionSort(num);
           for(int i=0;i<num.length;i++)
           {
               System.out.print(num[i]+", ");
           }
        }
        public static void Insertion1(Integer num[])
        {
            for(int i=1;i<num.length;i++)
            {
                int current=num[i];
                int prev=i-1;
                while (prev>=0&&num[prev]>current)
                {
                    num[prev+1]=num[prev];
                    prev--;
                }
                num[prev+1]=current;
            }
        }
        public static void selectionSort(int[] num)
        {
            for(int i=0;i<num.length-1;i++)
            {
                int min=i;
                for(int j=i+1;j<num.length;j++)
                {
                    if(num[min]>num[j])
                    {
                        min=j;
                    }
                }
                if(min!=i)
                {
                    int k=num[i];
                    num[i]=num[min];
                    num[min]=k;
                }
            }
        }

}
