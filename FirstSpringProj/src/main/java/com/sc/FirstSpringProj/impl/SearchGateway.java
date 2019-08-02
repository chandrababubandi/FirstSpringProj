package com.sc.FirstSpringProj.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SearchGateway {

	public static void main(String[] args) {
		Resource resource	=	new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory	=	new XmlBeanFactory(resource);
		SearchService search	=	(SearchService)beanFactory.getBean("searchApp");
		search.search();
	}
}
