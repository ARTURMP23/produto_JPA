package produto_jpa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        
        SessionFactory factory = configuration.buildSessionFactory();

        
        if (factory != null) {
            System.out.println("SessionFactory criada com sucesso!");
        } else {
            System.out.println("Falha ao criar a SessionFactory.");
        }

        factory.close();
    }
}
