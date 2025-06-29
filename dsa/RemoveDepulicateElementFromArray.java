package dsa;

public class RemoveDepulicateElementFromArray {

    public static void main(String[] args) {

//        int a[]=new int[]
        int a[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
    }
    public static int  removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Pointer for the place to insert the next unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
