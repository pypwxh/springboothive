package com.dooioo.configuration;

import org.apache.hive.jdbc.HiveDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class ImpalaConfig {
    @Value("${impala.url}")
    private String impalaUrl;
    @Value("${impala.port}")
    private String impalaPort;
    @Value("${impala.schema}")
    private String impalaScheme;
    @Value("${impala.user}")
    private String impalaUser;
    @Value("${impala.password}")
    private String impalaPassword;

    @Bean(name = "impalaJdbcTemplate")
    public JdbcTemplate getImpalaJdbcTemplate() {
        String connUrl = impalaUrl + ":" + impalaPort + "/;auth=noSasl";
        DataSource dataSource = new SimpleDriverDataSource(new HiveDriver(), connUrl, impalaUser, impalaPassword);
        return new JdbcTemplate(dataSource);
    }
}
