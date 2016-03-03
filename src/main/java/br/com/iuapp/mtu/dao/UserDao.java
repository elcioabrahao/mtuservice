package br.com.iuapp.mtu.dao;

import br.com.iuapp.mtu.model.User;
import br.com.iuapp.mtu.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by elcio on 03/03/16.
 */
public class UserDao {

    private  Session session;
    private  Transaction tx;

    public  UserDao() {

        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();


    }

//    // insert records to db
//    public void hbInsert() {
//
//        try {
//            User user = new User();
//            user.setId(10L);
//            user.setUsername("Jack");
//            user.setCreatedBy("System");
//            user.setCreatedDate("Datadehoje");
//
//            session.save(user);
//            tx.commit();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//            tx.rollback(); // rolling back to save the test data
//        }
//    }


    public  List<User> getAllUsers() {

        List<User> results = null;
        try {
            Query query = session.createQuery("FROM User");
            results = query.list();


        } catch (Exception e) {

            e.printStackTrace();
            tx.rollback();
        } finally {

            session.close();
        }
        HibernateUtil.getSessionFactory().close();
        return results;
    }

}
