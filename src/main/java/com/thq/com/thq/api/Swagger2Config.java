package com.thq.com.thq.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by THQ
 * 2017/10/18.
 * 文档访问地址：
 * http://localhost:8809/swagger-ui.html
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.thq.com.thq.api"))
                .paths(PathSelectors.any())
                .build();
    }
    //构建api 文档的详细信息函数
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot 测试使用 Swagger2 构建RESTful API")
                //创建人
                .contact(new Contact("THQ", "http://www.baidu.com", "254840681@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
/**
 * 通过@Configuration注解，让Spring来加载该类配置，@EnableSwagger2注解来启用Swagger2。

 再通过createRestApi函数创建Docket的Bean之后，apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore注解的API）。
   查考文档地址：http://blog.csdn.net/top_code/article/details/54023136
 3、编写Controller

 这里开始编写自己的RESTful Controller，跟正常开发没什么区别。主要是接口方法上面新增了几个注解：

 通过@ApiOperation注解来给API增加说明
 通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明
 通过@ApiIgnore来忽略那些不想让生成RESTful API文档的接口
 */


}
