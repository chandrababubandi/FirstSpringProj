package com.sc.FirstSpringProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.FirstSpringProj.impl.BinarySearchImpl;
import com.sc.FirstSpringProj.sort.BubbleSort;
import com.sc.FirstSpringProj.sort.QuickSort;

@Configuration
public class SearchImplFactory {

	@Autowired
	BubbleSort bubbleSort;
	
	@Autowired
	QuickSort quickSort;

	@Bean
	public BinarySearchImpl bubbleSortBasedSearchImpl() {
		return new BinarySearchImpl(bubbleSort);
	}
	
	@Bean
	public BinarySearchImpl quickSortBasedSearchImpl() {
		return new BinarySearchImpl(quickSort);
	}
}
