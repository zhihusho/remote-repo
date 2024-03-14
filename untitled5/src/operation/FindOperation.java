package operation;

import book.Book;
import book.bookList;

import java.util.Scanner;

public class FindOperation implements IOPeration{

    @Override
    public void work(bookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int current = bookList.getUsedSize();
        for (int i = 0; i < current; i++) {
            Book book = bookList.getbook(i);
            if(book.getName().equals(name)){
                System.out.println("找到书");
                System.out.println(book);
            }
        }
        System.out.println("没有找到这本书");
    }
}