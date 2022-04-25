public class CenturyFromYear {
    public static int century(int number) {
        int sharp = number%100;
        if(sharp == 0){
            return (number/100);
        } else {
            return (number/100)+1;
        }
    }
}
