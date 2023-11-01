import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []array={1,1,1,3,3,5};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int N=occurences(array, number);
        System.out.println(N);

    }
    public static int occurences(int []array,int number) {
      try {
          int count = 0;
          for (int i = 0; i < array.length; i++) {
              if (number == array[i]) {
                  count = count + 1;
              }
          }
          return count;
      }catch(Exception e){
      }
    }
}