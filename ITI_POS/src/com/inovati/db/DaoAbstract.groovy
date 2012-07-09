package com.inovati.db;

/**
 *
 * @author Carlos A. Cuaya Xinto
 */
class DaoAbstract {

    static protected def session
    static protected def transaction
    static protected def name;

    def save() {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        session.save(this)
        transaction.commit()
    }
    
    def update() {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        session.update(this)
        transaction.commit()
    }

    def saveOrUpdate() {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        session.saveOrUpdate(this)
        transaction.commit()
    }

    def delete() {
        try {
            session = Hibernate.factory.currentSession
            transaction = session.beginTransaction()
            session.delete(this)
            transaction.commit()
            return true
        }catch (Exception e) {
            transaction.rollback()
            return false
        }
    }

    public static def executeSingleResult(hql, params) {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        def query = session.createQuery(hql)
        for (param in params) {
            query.setParameter(param.key, param.value)
        }
        def entity = query.uniqueResult()
        transaction.commit()
        return entity
    }

    public static def executeQuery(hql,params) {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        def query = session.createQuery(hql)
        for (param in params) {
            query.setParameter(param.key, param.value)
        }
        def entityList = query.list()
        transaction.commit()
        return entityList
    }

    public static def get(cl,id) {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        def gotten = session.get(cl , id)
        transaction.commit()
        return gotten
    }

    public static def executeUpdate(hql,params) {
        session = Hibernate.factory.currentSession
        transaction = session.beginTransaction()
        def query = session.createQuery(hql)
        for (param in params) {
            query.setParameter(param.key, param.value)
        }
        def result = query.executeUpdate()
        transaction.commit()
        return result
    }

}