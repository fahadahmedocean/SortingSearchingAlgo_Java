import java.util.Scanner;

public class A_Bubble_Sort {

    public static void main(String[] args) {

        int n,c,d,swap;
        Scanner sc= new Scanner(System.in);
        System.out.println("how many number do you input...   ");
        n= sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter " + n + " integers");

        for (c=0;c<n;c++)
            arr[c] = sc.nextInt();
        for (c = 0; c < ( n - 1 ); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (arr[d] > arr[d+1]) /* For descending order use < */
                {
                    swap       = arr[d];
                    arr[d]   = arr[d+1];
                    arr[d+1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers .....");

        for (c = 0; c < n; c++)
            System.out.print(arr[c]+"   ");


    }
}

