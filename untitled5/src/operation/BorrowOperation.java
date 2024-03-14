package operation;

import book.Book;
import book.bookList;

import java.util.Scanner;

public class BorrowOperation  implements IOPeration{

    @Override
    public void work(bookList bookList) {
        System.out.println("借图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书");
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getbook(i);
            if (book.getName().equals(name)) {
                book.isBorrowed(false);
                System.out.println("借阅成功");
                System.out.println(book);
                return;
            }
        }
        System.out.println("借阅的图书不存在");
    }
}