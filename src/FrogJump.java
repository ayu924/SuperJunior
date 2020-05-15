public class FrogJump {
    /*
    n stairs
    a frog can jump 1 or 2 stairs each time
    how many different ways
     */

    public int jump(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            return jump(n - 1) + jump(n - 2);
        }
    }

}
