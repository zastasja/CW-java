public class countingSheep {
    public static String countingSheep(int num) {
        //Add your code here
        String res = "";
        for(int i = 1;i <= num; i++ ){
            res += i + " sheep...";
        }
        return res;
    }
}
