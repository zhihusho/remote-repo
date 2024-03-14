package operation;

import book.bookList;

public class ExitOperation  implements IOPeration{

    @Override
    public void work(bookList bookList) {

        System.out.println("退出图书");
        System.exit(0);//退出
    }
}
