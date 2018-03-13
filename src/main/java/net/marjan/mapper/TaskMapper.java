package net.marjan.mapper;

import net.marjan.model.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {

    public Task mapRow(ResultSet resultSet, int i) throws SQLException {
        Task task = new Task();
        task.setUser_id(resultSet.getInt("user_id"));
        task.setTask(resultSet.getString("task"));
        task.setStatus(resultSet.getBoolean("status"));
        return task;
    }
}
