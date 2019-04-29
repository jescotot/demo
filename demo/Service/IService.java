package com.example.demo.Service;

import com.example.demo.Exception.PlayerNotFoundException;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface IService {

     AbstractEntity create(AbstractEntity entity) throws PlayerNotFoundException;

    AbstractEntity update(AbstractEntity entity);

    boolean delete(long id) throws EntityNotFoundException;

    AbstractEntity findById(long id) throws EntityNotFoundException;

    List<AbstractEntity> readall();

}
