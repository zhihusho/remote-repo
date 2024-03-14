package operation;

import book.Book;
import book.bookList;

import java.util.Scanner;

public class AddOperation implements IOPeration{

    @Override
    public void work(bookList bookList) {//为什么要传入 Booklist
        System.out.println("新增图书");

        System.out.println("请输入名字");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入作者");
        String author = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入类型");
        String type = scanner.nextLine();
        System.out.println("请输入价格");
        Scanner scanner3 = new Scanner(System.in);
        int price = scanner.nextInt();
        Book book = new Book(name,author,type,price);
        int current = bookList.getUsedSize();
        for (int i = 0; i < current; i++) {
            Book book1 = bookList.getbook(i);
            if (book1.getName() .equals(name) ) {
                System.out.println("有这本书，不进行存放了");

            }
            if(current == bookList.getBooks().length){
                System.out.println("书架满了");
            }else {
                bookList.setBook(current,book1);
                bookList.setUsedSize(current+1);
            }

        }
        bookList.setBook(current+1,book);//

    }
}
