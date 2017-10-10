import javax.persistence.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    static EntityManagerFactory emf;
    static EntityManager em;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // create connection
            emf = Persistence.createEntityManagerFactory("JPATest");
            em = emf.createEntityManager();
            try {
                while (true) {
                    System.out.println("Params:");
                    System.out.println("1: Address");
                    System.out.println("2: Rooms");
                    System.out.println("3: Region");
                    System.out.println("4: Square");
                    System.out.println("5: Price");
                    System.out.print("-> ");
                    String s = sc.nextLine();
                    switch (s) {
                        case "1":
                            selectWhereAddress(sc);
                            break;
                        case "2":
                            selectWhereRooms(sc);
                            break;
                        case "3":
                            selectWhereRegion(sc);
                            break;
                        case "4":
                            selectWhereSquare(sc);
                            break;
                        case "5":
                            selectWherePrice(sc);
                            break;

                        default:
                            return;
                    }
                }
            } finally {
                sc.close();
                em.close();
                emf.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }

    private static void selectWherePrice(Scanner sc) {
        System.out.print("Enter price: ");
        String price = sc.nextLine();

        Apartament c = null;
        try {
            Query query = em.createQuery("SELECT c FROM Apartament c WHERE c.price = :price", Apartament.class);
            query.setParameter("price",price);
            List<Apartament> list = (List<Apartament>) query.getResultList();
            for (Apartament cl : list)
                System.out.println(cl);
        } catch (NoResultException ex) {
            System.out.println("Client not found!");
            return;
        } catch (NonUniqueResultException ex) {
            System.out.println("Non unique result!");
            return;
        }
    }

    private static void selectWhereSquare(Scanner sc) {
        System.out.print("Enter square: ");
        String square = sc.nextLine();

        Apartament c = null;
        try {
            Query query = em.createQuery("SELECT c FROM Apartament c WHERE c.square = :square", Apartament.class);
            query.setParameter("square",square);
            List<Apartament> list = (List<Apartament>) query.getResultList();

            for (Apartament cl : list)
                System.out.println(cl);
        } catch (NoResultException ex) {
            System.out.println("Client not found!");
            return;
        } catch (NonUniqueResultException ex) {
            System.out.println("Non unique result!");
            return;
        }
    }

    private static void selectWhereRegion(Scanner sc) {
        System.out.print("Enter region: ");
        String region = sc.nextLine();
        Apartament c = null;
        try {
            Query query = em.createQuery("SELECT c FROM Apartament c WHERE c.region = :region", Apartament.class);
            query.setParameter("region",region);
            List<Apartament> list = (List<Apartament>) query.getResultList();
            for (Apartament cl : list)
                System.out.println(cl);
        } catch (NoResultException ex) {
            System.out.println("Client not found!");
            return;
        } catch (NonUniqueResultException ex) {
            System.out.println("Non unique result!");
            return;
        }
    }

    private static void selectWhereRooms(Scanner sc) {
        System.out.print("Enter rooms(ONE,TWO,THREE,FOUR): ");
        String rooms = sc.nextLine();
        Apartament c = null;
        try {
            Query query = em.createQuery("SELECT c FROM Apartament c WHERE c.rooms = :rooms", Apartament.class);
            query.setParameter("rooms",rooms);
            List<Apartament> list = (List<Apartament>) query.getResultList();
            for (Apartament cl : list)
                System.out.println(cl);
        } catch (NoResultException ex) {
            System.out.println("Client not found!");
            return;
        } catch (NonUniqueResultException ex) {
            System.out.println("Non unique result!");
            return;
        }
    }

    private static void selectWhereAddress(Scanner sc) {
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        Apartament c = null;
        try {
            Query query = em.createQuery("SELECT c FROM Apartament c WHERE c.address = :address", Apartament.class);
            query.setParameter("address",address);
            List<Apartament> list = (List<Apartament>) query.getResultList();
            for (Apartament cl : list)
                System.out.println(cl);
        } catch (NoResultException ex) {
            System.out.println("Client not found!");
            return;
        } catch (NonUniqueResultException ex) {
            System.out.println("Non unique result!");
            return;
        }
    }


}


