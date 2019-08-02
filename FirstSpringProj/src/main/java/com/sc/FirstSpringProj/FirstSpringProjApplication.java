package com.sc.FirstSpringProj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sc.FirstSpringProj.impl.SearchService;

@SpringBootApplication
public class FirstSpringProjApplication {

	private static final Logger logger = LoggerFactory.getLogger(FirstSpringProjApplication.class);

	public static void main(String[] args) {
		logger.info("Before calling run ...");
		ApplicationContext appContext = SpringApplication.run(FirstSpringProjApplication.class, args);
		SearchService service = appContext.getBean(SearchService.class);
		service.search();
		logger.info("After calling run ...");
	}

	/*
	 * @Autowired BubbleSort bubbleSort;
	 * 
	 * @Autowired QuickSort quickSort;
	 * 
	 * @Bean public BinarySearchImpl bubbleSortBasedSearchImpl() { return new
	 * BinarySearchImpl(bubbleSort); }
	 * 
	 * @Bean public BinarySearchImpl quickSortBasedSearchImpl() { return new
	 * BinarySearchImpl(quickSort); }
	 */
}
