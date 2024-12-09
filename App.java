


package com.PS.JFSD_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
        {

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sess = cfg.buildSessionFactory();
        
        Session s = sess.openSession();
        
        Transaction txn = s.beginTransaction();
        
        Student_details sd = new Student_details();
        sd.setSid(5);
        sd.setSname("lucky");
        sd.setGender("female");
        sd.setDept("cs&it");
        sd.setPgm("b.tech");
        sd.setDob("sep15th");
        sd.setPhno(123456789);
        sd.setGs("yes");
        sd.setCgpa(7);
        sd.setNblogs(0);
        
        s.save(sd);
        
        txn.commit();
        
        
        }catch(Exception e) {
            e.printStackTrace();
          }
    }    
      }
