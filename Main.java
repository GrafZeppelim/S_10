


/**
 *
 * @author THAYCACAC
 */
public class Main {

    int[] a;

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        Manager obj = new Manager();
        //loop until user want to exit
        while (true) {
            int choice = obj.menu();
            switch (choice) {
                case 1:
                    obj.inputValueOfArray();
                    break;
                case 2:
                    obj.sortArrayAscending();
                    break;
                case 3:
                    obj.sortArrayDescending();
                    break;
                case 4:
                    return;
            }
        }
    }

}
