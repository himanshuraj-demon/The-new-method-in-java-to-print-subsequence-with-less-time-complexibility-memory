import java.util.Scanner;

public class subseqence {
    static void subseq(String old, int i, String mynew) {
    if (i == old.length()) {
        System.out.println(mynew);
        return;
    }
    char current = old.charAt(i);
    subseq(old, i + 1, mynew + current);
    if (mynew.indexOf(current) == -1) {
        subseq(old, i + 1, mynew);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myold=sc.next();
        String mynew="";
        subseq(myold, 0,mynew);
        sc.close();
    }
}
