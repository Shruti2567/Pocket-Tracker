package com.wd.pocket_tracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI myCustomConfiguration() {
		return new OpenAPI().info(
					new Info().title("Pocket tracker APIs")
					.description("By Shruti")
				)
				;
	}

}
