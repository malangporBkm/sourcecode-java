
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Poonsap2018";
        
        while (name.length()>0) {
            System.out.println(name.substring(0, 1));
            name = name.substring(1);
        }
    }

}
