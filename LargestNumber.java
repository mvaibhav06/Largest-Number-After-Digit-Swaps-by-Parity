public class LargestNumber {
    public static int largestInteger(int num) {

        String s = ""+num;
        char[] temp = s.toCharArray();

        for(int i=0; i<temp.length; i++){
            int a = Integer.parseInt(temp[i]+"");
            boolean isEven = false;
            boolean isOdd = false;
            if(a%2 == 0){
                isEven = true;
            }else{
                isOdd = true;
            }

            int index = -1;
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<temp.length; j++){
                int b = Integer.parseInt(temp[j]+"");
                if(b > max){
                    if(isEven && b%2==0){
                        max = b;
                        index = j;
                    }else if(isOdd && b%2!=0){
                        max = b;
                        index = j;
                    }
                }
            }
            if(max > a){
                char ch = temp[i];
                temp[i] = temp[index];
                temp[index] = ch;
            }
        }

        int out = 0;

        for(int i=0; i<temp.length; i++){
            int id = Integer.parseInt(temp[i]+"");
            out = (out*10)+id;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }
}
