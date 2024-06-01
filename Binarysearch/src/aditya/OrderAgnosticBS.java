package aditya;

public class OrderAgnosticBS  {
    public static void main(String[] args) {
//        int[] arr = {-18,-12,-4,0,2,4,15,16,18,22,30,89};
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        int target = 3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find wether the array is sortd in ascending or descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;

        }else{
            isAsc = false;
        }


        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2; //might be possible that (start + end) exceed
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]){
                    end = mid - 1;

                }else{
                    start = mid +1;
                }

            }else{
                if(target > arr[mid]){
                    end = mid - 1;

                }else if(target < arr[mid]){
                    start = mid +1;
                }

            }

        }
        return -1;
    }
}
