import book.Book;
import book.ComicBook;
import book.Novel;

public class JavaClass06 {

    public static void main(String[] args) {

        Book book = new ComicBook("만화책01","홍길동");
        Book book2 = new Novel("소설책", "abbb"); // book.printType -> 소설책?

        book.printType();
        book2.printType();

    }

    //abstract - abstract class 혹은 interface 에만 선언가능
    //[접근제어자] 리턴타입 이름(매개변수) { 코드; }

}
