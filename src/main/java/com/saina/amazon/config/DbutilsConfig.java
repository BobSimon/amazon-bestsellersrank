package com.saina.amazon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saina.amazon.dao.DbUtilsTemplate;

@Configuration
public class DbutilsConfig {
	@Autowired
    private DruidConfig druidConfig;

	@Bean
	public DbUtilsTemplate dbUtilsTemplate() throws Exception{
		return new DbUtilsTemplate(druidConfig.mysqlDataSource());
	}
}
