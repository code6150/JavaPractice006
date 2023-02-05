package book;

//extends -> class 가 class 를 상속 받을 때 사용
//        -> interface 가 interface 를 상속받을 때 사용

public class Novel extends Book{

    public Novel(String title, String author) {
        super(title, author);
    }

    @Override
    public void printType() {
        System.out.println("소설책 입니다.");
    }

}
