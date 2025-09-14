//------------Check if a string is a palindrome------------------
public class PalindromeCheck{
    public static void main (String[] args){
        String s = "madam";
        
        if (isPalindrome(s)){
            System.out.println(s + " is palindrome");
        }else{
            System.out.println(s + " is not palindrome");
        }
    }
    public static boolean isPalindrome(String s){
        int left = 0,  right = s.length()-1;
        
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}