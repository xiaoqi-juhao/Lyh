package com.seven.uiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * haoda-cloud
 *
 * @Author : Seven
 * @Description:
 * @Date: Created in 23:05 2020/2/29
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig
{
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.haoda.merchant.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("平台名称")
                        .description("文档说明-接口清单")
                        .version("1.0")
                        .build());
    }
}
