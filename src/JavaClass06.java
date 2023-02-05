import book.Book;
import book.ComicBook;
import book.Novel;

import java.io.BufferedWriter;
import java.io.File; // io -> input output 준말
import java.io.FileWriter;
import java.io.IOException;

public class JavaClass06 {

    public static void main(String[] args) {

        Book book = new ComicBook("만화책01","홍길동");
        Book book2 = new Novel("소설책", "abbb"); // book.printType -> 소설책?

        book.printType();
        book2.printType();

        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());

        System.out.println("=======================================================");

        // 참조형 변수 file
        //        // 절대 경로 -> root 단위에서 부터 시작하는 경로
        // 상대 경로 -> 현재 이 프로젝트가 실행되는 경로부터 시작되는 경로

        File file = new File("test.txt");

        //IOException -> Input Output Exception
        /*
        try {
            시도 할 코드
        } catch(감지 할 예외) {
            해당 예외가 발생했다면 실행 할 코드
        }
         */
        try {
            if (!file.exists())
                file.createNewFile();

            // try-with-resource (auto close)
            // BufferedWriter ( 조금 더 용량이 큰 파일에 대한 입력 시도 )
            /*try(FileWriter fw = new FileWriter(file, true)) {
                fw.write("ㅎㅇ\n");
                fw.flush();
            }*/
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("\n안뇽하세용!");
                bw.flush();
            }


        } catch (IOException ex) {
            System.out.println("파일을 생성하는데 실패 했습니다.");
            ex.printStackTrace();
        }

    }

    //abstract - abstract class 혹은 interface 에만 선언가능
    //[접근제어자] 리턴타입 이름(매개변수) { 코드; }

}
