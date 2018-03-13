package net.marjan.dao;

import net.marjan.model.Task;
import net.marjan.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public List<Task> findAll() {
        String sql = "SELECT * FROM task";
        return jdbcTemplate.query(sql, new TaskMapper());
    }


}
