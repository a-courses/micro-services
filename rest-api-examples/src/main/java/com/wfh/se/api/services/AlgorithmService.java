package com.wfh.se.api.services;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgorithmService {

    public Integer binarySearch(List<Integer> numberList, Integer searchItem, int l, int r){

        System.out.println("numberList : " + numberList);
        System.out.println("L "+l);
        System.out.println("R "+r);
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            System.out.println("MID : "+ mid);
            System.out.println(searchItem +" : numberList.get(mid) : "+ numberList.get(mid) +":"+(numberList.get(mid) == searchItem));
            if (numberList.get(mid) == searchItem)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            System.out.println(searchItem +" : numberList.get(mid) : "+ numberList.get(mid) +":"+(numberList.get(mid) > searchItem));

            if (numberList.get(mid) > searchItem)
                return binarySearch(numberList, l, mid - 1, searchItem);

            // Else the element can only be present
            // in right subarray
            return binarySearch(numberList, mid + 1, r, searchItem);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
