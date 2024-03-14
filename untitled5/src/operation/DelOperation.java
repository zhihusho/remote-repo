package operation;

import book.Book;
import book.bookList;

import java.util.Scanner;

public class DelOperation  implements IOPeration{

    @Override
    public void work(bookList bookList) {

        System.out.println("删除图书");
        System.out.println("请输入你要删除的图书的名称");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        int target = -1;
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getbook(i);
            if (book.getName().equals(name)){
                target = i;
                break;//优化速率不需要遍历完找到就好直接退
            }
        }
        if(i==currentSize){
            System.out.println("没有要删除的图书");
            return;
        }
        //设置两变量i和j进行区分int
        int j = target;
        for (; j < currentSize-1; j++) {
                Book book1 = bookList.getbook(j+1);
                bookList.setBook(j,book1);//将其放书架不要对书进行直接改变
        }
        bookList.setBook(j,null);//将其最后置为空
        bookList.setUsedSize(currentSize-1);//删除了减去一
    }
}