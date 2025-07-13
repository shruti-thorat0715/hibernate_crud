package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Country;
import model.Region;
import util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {

        // Create region
        Region region = new Region();
        region.setRegionName("Asia");

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(region);
            tx.commit();
        }

        // Create country
        Country country = new Country();
        country.setCountryId("IN");
        country.setCountryName("India");
        country.setRegion(region);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(country);
            tx.commit();
        }

        // Fetch and print all countries
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Country> countries = session.createQuery("from Country", Country.class).list();
            for (Country c : countries) {
                System.out.println("Country ID: " + c.getCountryId());
                System.out.println("Country Name: " + c.getCountryName());
                System.out.println("Region: " + c.getRegion().getRegionName());
            }
        }
    
    }
}
