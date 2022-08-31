import java.util.*;

public class MinAndMax{
public static void main(String[] args){
	int[] arr ={33, 35, 1, 10, 12, 34};
	minAndMaxNum(arr);
}
public static void minAndMaxNum(int[] arr){
	int min,max,i;
	min = max = arr[0];
	for(i=1;i<arr.length;i++){
	if(arr[i]>max){
		max=arr[i];
}
	if(arr[i]<min){
		min = arr[i];
}
}
	System.out.println(min);
	System.out.println(max);
}
}