package com.sc.FirstSpringProj.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sc.FirstSpringProj.FirstSpringProjApplication;
import com.sc.FirstSpringProj.sort.SortInterface;

@Component
public class BinarySearchImpl {
	
	private static final Logger logger	= LoggerFactory.getLogger(FirstSpringProjApplication.class);
	
	SortInterface si; 
	 
	public BinarySearchImpl(SortInterface si) {
		super();
		this.si = si;
	}

	public boolean isPresent(int[] sourceNumbers) {
		si.sort(sourceNumbers);
		logger.info("BinarySearchSymbol:searchSymbol() Binary Searching ");
		return true;
	}

	
}
