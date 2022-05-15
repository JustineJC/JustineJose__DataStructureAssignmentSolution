import java.util.Scanner;
import java.util.*;
public class skyscaperArchitect{
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> bucket = new Stack<Integer>(); 
        int n,size,value=0;
        System.out.println("\n Enter the total no of floors in the building");
        n=sc.nextInt();//intitalize an array dynamicaly
        int[] arr = new int[n+1];
        size=n;//size holds the total nos of floors

        if(n>0){ //if n value is above zero
        //a loop to get the floor values
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter the floor size given on day : "+i);
            value=sc.nextInt();
            if(value<=n){
            arr[i]=value;
            }
            else{
                System.out.println("The total floor size should be less than or equal to building size ("+n+")");
            }
        }}
        else{
            System.out.println("Please enter a floor size above zero value!!!");
        }
        System.out.println("\n------------------------\n");
        for(int i=1;i<=n;i++){// A loop to check for the values in the array
            System.out.println("\n Day: "+i);
            if(arr[i]==size) // check for matching values
            {
                System.out.print(arr[i]+" "); 
                size--;                         //decrement floor size when match found arr[i]==size
                while(!bucket.empty())
                {
                  if(bucket.peek()==size) // compare the values pushed to stack
                  {
                   System.out.print(" "+bucket.pop()+" "); //removing values if similar size found
                   size--;                                   //reduce the floor value when match found when compared
                  }
                 else {
                   break;}
                }
            }
            else{
                bucket.push(arr[i]);//Insert values to stack if match not found during comparison
            }
        }
        sc.close();
    }
}