import java.io.Serializable;

public class Producto implements Serializable {

    String cod;
    String desc;
    int prezo;

    public Producto(String cod, String desc, int prezo) {
        this.cod = cod;
        this.desc = desc;
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "cod='" + cod + '\'' +
                ", desc='" + desc + '\'' +
                ", prezo=" + prezo +
                '}';
    }
}
