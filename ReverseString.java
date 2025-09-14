//------------Reverse a string without using built-in functions.-----------
public class ReverseString{
    public static void main (String[] args){
        String s = "hello world";
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        System.out.println( s);
        System.out.println( reversed);
    }
}