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
        String[] s1 = randomStringArr(3,10);
        String[] s2 = InPlaceSorts.copyStringArray(s1);
        InPlaceSorts.BubbleSort(s1);
        System.out.println("IsSorted: "+ InPlaceSorts.isSorted(s1));

        String[] s3 = randomStringArr(3,10);
        String[] s4 = InPlaceSorts.copyStringArray(s3);

        String[] s5 = randomStringArr(3,10);
        String[] s6 = InPlaceSorts.copyStringArray(s5);

    }

}
