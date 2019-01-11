public class Runner {

    public static String[] randomStringArr(int num, int length){
        String [] arr = new String [num];
        while (num>0){
            int i = 0;
            String s="";
            while (i<length){
                char c = (char)((Math.random()*26)+97);
                s= s+c;
                i++;
            }
        num --;
        arr[num]=s;
        }
    return arr;
    }

    public static void main(String[] args){
        String[] s1 = randomStringArr(5,3);
        String[] s2 = InPlaceSorts.copyStringArray(s1);
        InPlaceSorts.BubbleSort(s1);
        System.out.println("BubbleSort IsSorted: "+ InPlaceSorts.isSorted(s1));
        InPlaceSorts.printArray(s2);
        InPlaceSorts.printArray(s1);

        String[] s3 = randomStringArr(5,3);
        String[] s4 = InPlaceSorts.copyStringArray(s3);
        InPlaceSorts.SelectionSort(s3);
        System.out.println("SelectionSort IsSorted: "+ InPlaceSorts.isSorted(s3));
        InPlaceSorts.printArray(s4);
        InPlaceSorts.printArray(s3);


        String[] s5 = randomStringArr(5,3);
        String[] s6 = InPlaceSorts.copyStringArray(s5);
        InPlaceSorts.InsertionSort(s5);
        System.out.println("InsertionSort IsSorted: "+ InPlaceSorts.isSorted(s5));
        InPlaceSorts.printArray(s6);
        InPlaceSorts.printArray(s5);

    }

}
