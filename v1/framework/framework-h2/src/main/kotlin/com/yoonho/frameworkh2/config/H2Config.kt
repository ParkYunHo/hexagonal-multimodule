package com.yoonho.frameworkh2.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class H2Config {

    @Bean
    fun h2Datasource(): DataSource {

        val hikariConfig = HikariConfig().apply {
            driverClassName = "org.h2.Driver"
            jdbcUrl = "jdbc:h2:mem:testdb"
            username = "sa"
            password = ""
        }

        return HikariDataSource(hikariConfig)
    }
}