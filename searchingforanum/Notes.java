
public class Notes {

    int A2, B2, H2, I2;

    public void Check(){
        
        if (A2 == H2 && B2 == I2) {
            System.out.println("active relationship");
        } else if (A2 != H2 && B2 != I2) {
            System.out.println("inactive relation");
        } else if (A2 == H2 && B2 != I2) {
            System.out.println("active mentee");
        } else if (A2 != H2 && B2 == I2) {
            System.out.println("active mentor");
        } else {
            System.out.println("NOT VALID");
        }
    }
}
