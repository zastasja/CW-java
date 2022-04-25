public class areaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        int p;
        if (l == w){
            p = l * w;
        } else {
            p = 2 * (l + w);
        }
        return p;
    }
}
