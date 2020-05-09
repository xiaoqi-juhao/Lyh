package com.seven.uiles;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * haoda-cloud
 *
 * @Author : Seven
 * @Description:
 * @Date: Created in 19:27 2020/2/29
 */
@Configuration
public class MybatisPlusConfig {
    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
}
