import java.util.*;
import java.io.*;
public class FindElement
{
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
