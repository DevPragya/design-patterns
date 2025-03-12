package org.example.solutions;

public class PrefixSum {
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
