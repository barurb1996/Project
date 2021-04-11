public class BubbleSortExample {  
    static void bubbleSort(int[] arr) {  
        int arrayLength = arr.length;  
        int temporary = 0;  
         for(int i=0; i < arrayLength; i++){  
                 for(int j=1; j < (arrayLength-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temporary = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temporary;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){
			Sytsem.out.print("Those numbers are not sorted:");  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
			System.out.print("Those numbers are sorted");
                        System.out.print(arr[i] + " ");  
                }

//TO DO add funcionality of repeating program itself depending on user choice.  
   
        }  
}  
