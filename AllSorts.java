public class AllSorts {
    public static void swap(int[] num,int i,int j)
    {
        int k=num[i];
        num[i]=num[j];
        num[j]=k;
    }
    public static void Bubble(int[] num)
    {
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    swap(num,j,j+1);
                }
            }
        }
    }
    public static void ArrayPrint(int[] num)
    {
        for (int j : num) {
            System.out.print(j + " , ");
        }
    }
    public static void SelectionSort(int[] num)
    {
        for(int i=0;i<num.length;i++)
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
                swap(num,min,i);
            }
        }
    }
    public static void InsertionSort(int[] num) {
        int prev, current;
        for (int i = 1; i < num.length; i++) {
            prev = i - 1;
            current = num[i];
            for (int j = i; j < num.length; j++) {
                while (prev >= 0 && num[prev] > current) {
                    num[prev + 1] = num[prev];
                    prev--;
                }
                num[prev + 1] = current;
            }
        }
    }
        public static void countingSort(int[] num)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<num.length;i++)
            {
                max=Math.max(num[i],max);
            }
            int[] array= new int[max+1];int j=0;
            for(int i=0;i<num.length;i++)
            {
                array[num[i]]++;
            }
            for(int i=0;i<array.length;i++)
            {
                while (array[i]>0){
                    num[j]=i;
                    j++;array[i]--;
                }
            }
        }

    public static void main(String[] arr)
    {
        //int[] num={90,4,2,5,997,7,-56,3,-9,-7};
        //InsertionSort(num);
        int[] num={2,3,2,4,5,6,6,7,3,5,3,5,4,4,8,9,3};
        countingSort(num);
        ArrayPrint(num);

    }
}
