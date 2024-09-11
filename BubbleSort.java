public class BubbleSort {
    public static void bubbleSort(int[] num)
    {
        for(int i=0;i<num.length-1;i++)
        {
            int swap=0;
            for(int j=0;j<num.length-i-1;j++)
            {
                if (num[j] > num[j + 1]){
                    int k=num[j];
                    num[j]=num[j+1];
                    num[j+1]=k;
                    swap++;
                }
            }
            System.out.println(swap);
        }
    }
    public static void main(String arrgs[])
    {
        int[] num={4,3,2,1,5,6,78,4,9};
        int [] num1={0,1,2,3,4,5,6,7,8,9};
       // bubbleSort(num1);
        //wrong!!!.
        optimizedBubbleSort(num);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ,");
        }
    }
    public static void swap(int a, int b)
    {
        int k=a;
        a=b;
        b=k;
    }
    public static void optimizedBubbleSort(int[] num)
    {
        for(int i=0;i<num.length-1-i;i++)
        {
            if(num[i]>num[i+1])
            {
            swap(num[i],num[i+1]);
            }
        }
    }
}
