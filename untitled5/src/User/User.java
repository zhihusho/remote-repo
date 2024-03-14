package User;

import book.Book;

import book.bookList;
import operation.IOPeration;

public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;

    }
    //使用抽象类的原因因为main方法里通过向上转型给了user但想要进入用户系统里需要调用menu方法 user中没有并且其不用使以设置了（其恰好满足）抽象方法的定义
    public abstract int  menu(); //什么时候用public static
    public  void  doOperation(int choice, bookList booklist){
        ioPerations[choice].work(booklist);
    }
}
