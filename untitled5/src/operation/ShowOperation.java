package operation;

import book.Book;
import book.bookList;

public class ShowOperation  implements IOPeration{

    @Override
    public void work(bookList bookList) {
        System.out.println("打印图书");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getbook(i);
            System.out.println(book);//本来会打印地址重写toString会使其打印使用的数据

        }
    }
}