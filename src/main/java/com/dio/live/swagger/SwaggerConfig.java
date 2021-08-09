package com.dio.live.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiAdmin() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.dio.live"))
				.paths(PathSelectors.ant("/**"))
				.build()
				.apiInfo(appInfo())
				.globalOperationParameters(Collections.singletonList(new ParameterBuilder().name("Authorization")
						.description("Header para Token JWT").modelRef(new ModelRef("Header para Token JWT"))
						.parameterType("header").required(false).build()));

	}

	@Bean
	public ApiInfo appInfo() {
		return new ApiInfoBuilder().title("API-REST").description("Api para gerencimaneto de ponto_e_acesso.")
				.version("1.0.0").license("Apache license version 2.0").licenseUrl("fasdfadf").build();

	}
}
