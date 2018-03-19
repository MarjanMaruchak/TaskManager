package net.marjan.service;

import net.marjan.dao.TaskDao;
import net.marjan.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    public TaskDao taskDao;

    public List<Task> findAll() {
        return taskDao.findAll();
    }


    public void save(Task task) throws Exception {
        if (task.getTask().length() < 2) {
            throw new Exception();
        }
        taskDao.save(task);
    }

}
