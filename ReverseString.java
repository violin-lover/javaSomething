package numbers;

public class ReverseString {

    public static void main(String args[]){
        String testString = "Geeks";
        System.out.println("Reversed String: " + new ReverseString().reverse(testString));
    }

    public String reverse(String s) {
        String reversed = "";

        for(int i = 0; i < s.length(); i++){
            char characters = s.charAt(i);
            reversed = characters + s;
        }

        return reversed;
    }
}
