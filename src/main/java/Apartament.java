import javax.persistence.*;

@Entity
@Table(name="Appartaments")
public class Apartament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private double square;

    @Column(nullable = false)
    private String rooms;

    @Column(nullable = false)
    private double price;


    public Apartament() {}


    @Override
    public String toString() {
        return "Apartament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", region='" + region + '\'' +
                ", square=" + square +
                ", rooms='" + rooms + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
