/**
 * FileName: SwaggerConfig
 * Author:   lijiaze
 * Date:     2018/4/23 10:13
 * Description: SwaggerConfig
 */
package com.td.spec.test.factorcalculatetest.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 〈SwaggerConfig〉
 *
 * @author lijiaze
 * @create 2018/4/23
 * @since 1.3.0
 */
@Slf4j
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.td.spec"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title(
        "calculate-factor使用Swagger2构建RESTful APIs").description("支持指定任务回测").
        termsOfServiceUrl("http://blog.xxx.com/").contact("lijiaze").version("1.3.0").build();
  }
}