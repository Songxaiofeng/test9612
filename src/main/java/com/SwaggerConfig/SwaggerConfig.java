/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SwaggerConfig
 * Author:   1
 * Date:     2019/6/6 17:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 宋晓锋          2019/6/6         V.0.0.1            这是swagger的一个
 */
package com.SwaggerConfig;

import org.omg.CORBA.Any;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.w3c.dom.DocumentType;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 1
 * @create 2019/6/6
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){

        return  new  Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.control")).build();
    }
    @Bean
    public ApiInfo apiInfo() {

        //String title, String description, String version,
        // String termsOfServiceUrl, Contact contact,
        // String license, String licenseUrl, Collection<VendorExtension> vendorExtensions)
        Contact contact = new Contact("长高三","www.baidu.com","2832710544@qq.com");
        return  new ApiInfo(
                "Swagger",
                "我的第一个Swagger程序接口 ",
                "v0.0.1",
                "url Service ",
                contact,
                "许可证",
                "许可证",
                new LinkedList<>()
        );
    }


}
