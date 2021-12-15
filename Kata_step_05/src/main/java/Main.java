import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PaginationHelper ph = new PaginationHelper(Arrays.asList(2,3,4,5,6,9,2),2);
        System.out.println(ph.itemCount());
        System.out.println(ph.pageCount());
        System.out.println(ph.pageItemCount(3));
        System.out.println(ph.pageIndex(4));
        System.out.println(ph.pageIndex(0));
        System.out.println(ph.pageIndex(20));
    }
}
