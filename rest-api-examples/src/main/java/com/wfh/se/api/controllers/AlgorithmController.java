package com.wfh.se.api.controllers;

import com.wfh.se.api.services.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AlgorithmController {

    @Autowired
    AlgorithmService algorithmService;

    @GetMapping("/binarySearch")
    public Integer binarySearch(@RequestParam List<Integer> numberList, Integer searchItem){
        int l=0;
        int r=numberList.size() - 1;

        final Integer searchResultIndex = algorithmService.binarySearch(numberList, searchItem, l, r);
        return searchResultIndex;

    }
}
