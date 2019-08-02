/**
 * 
 */
package com.sc.FirstSpringProj.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.FirstSpringProj.FirstSpringProjApplication;

@Service
public class SearchService {

	private static final Logger logger	= LoggerFactory.getLogger(FirstSpringProjApplication.class);
	
	@Autowired
	BinarySearchImpl bubbleSortBasedSearchImpl;
	@Autowired
	BinarySearchImpl quickSortBasedSearchImpl;
	
	public void search() {
		int sourceNumbers [] 	= 	{1,2,3,4,5,6,7,8,9,10};
		performBubbleSort(sourceNumbers);
		performQuickSort(sourceNumbers);
	}

	private void performQuickSort(int[] sourceNumbers) {
		boolean isPresent =	quickSortBasedSearchImpl.isPresent(sourceNumbers);
		logger.info("Completed QuickSort "+isPresent);
	}


	private void performBubbleSort(int[] sourceNumbers) {
		boolean isPresent =	bubbleSortBasedSearchImpl.isPresent(sourceNumbers);
		logger.info("Completed BubbleSort "+isPresent);
	}

}
