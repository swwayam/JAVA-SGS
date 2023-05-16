public class array {
    public static void main(String[] args) {
        // arr = ["sid",3]
//
//        System.out.println(arr[0]);
////        System.out.println(arr);
//        // Two Types of arrays
//        // 1. Static -> Defining the number of elements manually
//        // 2. Dynamic -> The compiler will automatically adjust the array size
//        int [] arr1 = new int[5];
//        arr1[0] = 23;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i * 7;
//        }
//
//        // Printing the array
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

        int [] arr = {1,2,3,4,5,6};

        int index = indexOf(51, arr);
        System.out.println(index);


    }

    static int indexOf(int toFind, int arr2 []){
        for(int i = 0; i < arr2.length; i ++){
            if ( arr2[i]== toFind){
                return i;
            }
        }
        return -1;
    }
}
