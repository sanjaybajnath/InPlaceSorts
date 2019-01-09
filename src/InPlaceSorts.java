public class InPlaceSorts {
    public static void swap(String[] arr,int i, int j){
        String t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }

    public static void SelectionSort (String[] arr){
        int curPos = 0;
        int minPos = 0;
        String minValue = arr[curPos];
        while(curPos<arr.length){
            minPos = curPos;
            minValue = arr[curPos];
            for(int i = curPos +1;i<arr.length;i++){

                if(arr[i].compareTo(minValue)<0){
                    minValue = arr[i];
                    minPos = i;
                }
            }
            swap(arr,minPos,curPos);
            curPos++;
        }
    }


}
