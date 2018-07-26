
public class WorkshopWithHeart {

    public static void main(String[] args) {
        int start = 9;
        // Line1
        for (int i = 0; i < start; i++) {
            if(i==1 || i==6){
                System.out.print("**");
            }else {
                System.out.print(" ");
            }
        }System.out.println();
        // Line2
        for (int i = 0; i < 9; i++) {
            if(i==start/2 ) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
            
        }
        System.out.println();
        // Line3-7
        for (int round = 0; round < 5; round++) {
            for (int a = 0; a < round; a++) {
                System.out.print(" ");
            }
            for (int i = 0; i < start; i++) {
                System.out.print("*");
            }
            System.out.println();
            start = start - 2;
        }

    }

}
