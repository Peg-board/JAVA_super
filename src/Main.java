class Book {

    String title ="미입력";
    int price = -1;
    int code = 100;

//    public Book() {  	}                     // 기본생성자

    public Book(String title, int price) {      // 매개변수 2개인 생성자
        this.title = title;
        this.price = price;
    }


    public void showPrice() {
        System.out.println(title + "의 가격은 " + price + "원 입니다");
    }
}

class EnglishBook extends Book {

    int code = 200;

//    public EnglishBook() {    }                       // 기본생성자

    public EnglishBook(String title, int price) {    // 매개변수 2개인 생성자
        //super(title, price);
    }


    public void showPrice() {

        super.showPrice();      // 부모클래스의 메소드 호출

        System.out.println("");
        System.out.println("code       : " + code);
        System.out.println("this.code  : " + this.code);
        System.out.println("super.code : " + super.code);

        System.out.println("");
        System.out.println("price       : " + price);
        System.out.println("this.price  : " + this.price);
        System.out.println("super.price : " + super.price);

    }
}



public class Main {
    public static void main(String[] args) {

        EnglishBook b1 = new EnglishBook("영어책", 1000);
        b1.showPrice();
    }
}

// 컴파일러가 기본 생성자 자동 추가
// 기본 생성자, 사용자 생성자 전부 컴파일러가 super() 메소드 자동 추가, 부모 메소드가 먼저 실행된다.
/** (Book, Main) (기본, 기본) ok / (기본, 수정( )) ok / (수정, 기본) No/ (수정, 수정) No, ( 수정, 수정(super(...) )ok */
