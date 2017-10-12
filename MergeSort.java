import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of first array: ");
		int size1 = input.nextInt();
		System.out.println("Enter size of second array: ");
		int size2 = input.nextInt();
		int i,j,k;
		int[] arr1 = new int[size1];
		int[] arr2= new int[size2];
				
		// Read integers from the console
		System.out.println("Enter first array elements: ");
		for (i = 0; i < arr1.length; i++) {
		    arr1[i] = input.nextInt();
		    }
		
		System.out.println("Enter second array elements: ");
		for (i = 0; i < arr1.length; i++) {
		    arr2[i] = input.nextInt();
		      }

		i=0; j=0; k=0;
		int[] mergedArray=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) 
				mergedArray[k++]=arr1[i++];
			else
				mergedArray[k++]=arr2[j++];
		}
		while(i<arr1.length)
			mergedArray[k++]=arr1[i++];
		while(j<arr2.length)
			mergedArray[k++]=arr2[j++];
		
		for(i=0;i<mergedArray.length;i++)
			System.out.print(mergedArray[i]+" ");
			}
			

	}

