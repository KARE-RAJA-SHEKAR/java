import java.io.*;
public class TestAnonymousArray{
    static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
    printArray(new int[]{10,15,20,25,33});
    }
}
