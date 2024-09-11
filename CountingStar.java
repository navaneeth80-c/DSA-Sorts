public class CountingStar {
    public static void CountingSort(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        int[] array = new int[max + 1];
        for (int i = 0; i < num.length; i++) {
            array[num[i]] = array[num[i]] + 1; //array[num[i]]++.        }
        }
        //sort
        int j=0;
        for(int i=0;i<array.length;i++)
        {
            while (array[i]>0)
            {
                num[j]=i;
                j++;
                array[i]--;
            }
        }
    }
}