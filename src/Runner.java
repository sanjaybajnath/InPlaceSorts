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


    }
}
