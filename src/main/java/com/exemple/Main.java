package com.exemple;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Charger le contexte Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("free.xml");

        // Récupérer le bean SessionFactory
        SessionFactory sessionFactory = context.getBean("sessionFactory", SessionFactory.class);

        // Vérifier que la configuration de la SessionFactory fonctionne
        if (sessionFactory != null) {
            System.out.println("Configuration Hibernate chargée avec succès !");
        } else {
            System.out.println("Erreur lors du chargement de la configuration Hibernate.");
        }

        // Vous pouvez ajouter d'autres tests ou opérations ici pour tester votre configuration Hibernate
    }
}
