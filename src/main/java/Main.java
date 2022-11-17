import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {



        String[] codArray={"p1","p2","p3"};
        String[] descArray ={"parafusos","cravos ","tachas"};
        int[] prezoArray ={3,4,5};

        File ficheiro=new File(System.getProperty("user.dir")+"/src/main/java/serial2.txt");

        ObjectOutputStream obxWrite=new ObjectOutputStream(new FileOutputStream(ficheiro));
        ObjectInputStream obxRead=new ObjectInputStream(new FileInputStream(ficheiro));

        for (int i = 0; i < codArray.length; i++) {
            obxWrite.writeObject(new Producto(codArray[i],descArray[i],prezoArray[i]));
        }
        obxWrite.writeObject(null);
        obxWrite.close();

        Producto pro;

        while ((pro=(Producto)obxRead.readObject())!=null){
            System.out.println(pro.toString());
        }
        obxRead.close();

    }
}
