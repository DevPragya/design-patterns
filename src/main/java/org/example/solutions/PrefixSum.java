//This solutions uses additional memory to store prefix sum in int subArraysum. We can save memory by storing in the same array.
package org.example.solutions;
public class PrefixSum {
    //This solutions uses additional memory to store prefix sum in int subArraysum. We can save memory by storing in the same array.
    public int findSubarraySum(int[] array, int start, int end) { // start and end have same values as line 42 and 44

    //always put private for variables in class
        int subArraysum = 0;

        if (start < 0 || end >= array.length || start > end)
        {
            System.out.println("Invalid subarray range");
            return -1;
        }

        for (int i=start; i<=end; i++)
        {
            subArraysum += array[i];
        }
        return subArraysum;
    }

}
