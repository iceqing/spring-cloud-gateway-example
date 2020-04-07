package me.ice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 示例route
 */
@Slf4j
@Configuration
public class RouteConfiguration {

    /**
     * 测试房访问豆瓣电影排行250
     * 访问localhost:8080/a/top250转到https://douban.uieee.com/v2/movie/top250
     */
    @Bean
    public RouteLocator helloRoute(RouteLocatorBuilder builder) {
        log.info("helloRoute, build RouteLocator bean");

        return builder.routes()
                .route(r -> r.path("/api/**")
                        .filters(f -> f.stripPrefix(1)
                                .prefixPath("/v2/movie/")
                        )
                        .uri("https://douban.uieee.com")
                )
                .build();
    }
}
