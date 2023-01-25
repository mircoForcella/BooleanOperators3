public class booleanOperator3 {
    /**
     * [A]: !(!(!(false ^ false) || (true && true)))
     * [B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1)
     *
     * [A] false xor false = false with !not becomes true || true && true = true ,      true || true = true * 2 times NOT (!) > false > ending as (true) after last !
     * [B]!((3 * 2) <= 6) && (3 - 2 != 1) , 3x2 = 6 <= 6 è true after !not it becomes (false) && 3-2 = 1 and !not equal to 1 is (false) = false || false = false
     *
     * riassunto
     * [A] true
     * [B] false || false = false
     */

    public static void main(String[] args) {
        boolean a = !(!(!(false ^ false) || (true && true)));
        boolean b = !((3 * 2) <= 6) && (3 - 2 != 1);

        System.out.println(a);
        System.out.println(b);
    }
}
