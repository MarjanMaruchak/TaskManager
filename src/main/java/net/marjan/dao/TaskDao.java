package net.marjan.dao;

import net.marjan.model.Task;

import java.util.List;

public interface TaskDao {
    List<Task> findAll();
}
