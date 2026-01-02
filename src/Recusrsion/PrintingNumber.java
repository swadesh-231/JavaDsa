package Recusrsion;

public class PrintingNumber {
    public static void main(String[] args) {
        printNTOOne(5);
        System.out.println();
        printOneToN(5);
    }
    static void printNTOOne(int num){
        if (num==0){
            return;
        }
        System.out.print(num+" ");
        printNTOOne(num-1);
    }
    static void printOneToN(int num){
        if (num==0){
            return;
        }
        printOneToN(num-1);
        System.out.print(num+" ");
    }
}
