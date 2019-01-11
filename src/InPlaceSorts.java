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
    public static void BubbleSort(String[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }
    public static void InsertionSort (String[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j].compareTo( arr[j-1])<0){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }


}
