package com.bloodika.reporting.datasource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bloodika.reporting.AppTest;

public class DatasourceTest extends AppTest {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Test
    void ensureTestEnvironment() throws SQLException {
        assertNotNull(jdbcTemplate.getJdbcTemplate().getDataSource());
        assertEquals("jdbc:h2:mem:db",jdbcTemplate.getJdbcTemplate().getDataSource().getConnection().getMetaData().getURL());
    }

}