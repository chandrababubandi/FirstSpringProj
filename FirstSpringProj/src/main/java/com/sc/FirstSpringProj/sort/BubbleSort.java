package com.sc.FirstSpringProj.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sc.FirstSpringProj.FirstSpringProjApplication;
@Component
@Primary
public class BubbleSort implements SortInterface{

	private static final Logger logger	= LoggerFactory.getLogger(FirstSpringProjApplication.class);
	
	@Override
	public int[] sort(int[] sourceNumbers) {
		logger.info("BubbleSort");
		return sourceNumbers;
	}
	
}
