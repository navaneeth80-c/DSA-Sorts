public class SelectionSort {
    public static void selectionsort(int[] num)
    {
        int min;
        for(int i=0;i<num.length;i++)
        {
           min=i;
           for(int j=i+1;j<num.length;j++)
           {
               if(num[min]<num[j])              //O(n^2)
               {
                   min=j;
               }
           }
           int temp=num[i];
           num[i]=num[min];
            num[min]=temp;
        }
    }
    public static void main(String arrgs[])
    {
        int[] num={1,5,2,6,3,5,2,0,-7,8,0};
        //selectionsort(num);
        insertionSort(num);
        for(int i=0; i<num.length;i++)
        {
            System.out.print(num[i]+",");
        }
    }
    public static void insertionSort(int num[])
    {
        for(int i=1;i<num.length;i++)
        {
            int min=num[i];
            int prev=i-1;
            while (prev>=0 && num[prev]>min)
            {
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=min;
        }
    }
}
