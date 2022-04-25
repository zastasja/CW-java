public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            int cat = humanYears+14;
            int dog = humanYears+14;
            return new int[]{humanYears, cat, dog};
        } else if (humanYears == 2){
            int cat = (humanYears+9+15)-2;
            int dog = (humanYears+9+15)-2;
            return new int[]{humanYears, cat, dog};
        } else {
            int cat = (humanYears-2)*4+9+15;
            int dog = (humanYears-2)*5+9+15;
            return new int[]{humanYears, cat, dog};
        }
    }
}
