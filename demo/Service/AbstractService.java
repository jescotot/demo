//package com.example.demo.Service;
//
//import org.dom4j.tree.AbstractEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public abstract class AbstractService implements IService{
//
//    private final JpaRepository repository;
//    protected final Logger logger = loggerFactory.getLogger(getClass());
//
//    public AbstractService(JpaRepository repository){this.repository = repository;}
//
//    @Override
//    public AbstractEntity create(AbstractEntity entity){
//        AbstractEntity saved = null;
//        saved = (AbstractEntity) repository.save(entity);
//        return saved;
//    }
//
//    @Override
//    public AbstractEntity update(AbstractEntity entity){
//        AbstractEntity saved = null;
//        saved = (AbstractEntity) repository.save(entity);
//        return saved;
//    }
//
//
//    public AbstractEntity Delete(AbstractEntity entity{})
//
//}
