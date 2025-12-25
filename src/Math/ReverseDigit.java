package Math;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 123456;
        int reversed = 0;
        while (num != 0){
         int d = num % 10;
         reversed = reversed * 10 + d;
            num /=10;
        }
        System.out.println(reversed);
    }
}
