package com.example.demo.Service;

import com.example.demo.Exception.PlayerNotFoundException;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface IService {

    public AbstractEntity create(AbstractEntity entity) throws PlayerNotFoundException;

    public AbstractEntity update(AbstractEntity entity);

    public boolean delete(long id) throws EntityNotFoundException;

    public AbstractEntity findById(long id) throws EntityNotFoundException;

    public List<AbstractEntity> readall();

}
