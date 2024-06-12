package aditya;

public class SmallestLetter {
    public static void main(String[] args) {


    }
    //return the index of smallest no >= target


    public char nextGreatestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            //find the middle element
            //int mid = (letters + end) / 2; //might be possible that (letters + end) exceed
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;

            }else {
                start = mid +1;
            }
        }
        return letters[start % letters.length] ;


    }

}