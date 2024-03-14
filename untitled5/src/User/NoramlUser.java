package User;

import operation.*;

import java.util.Scanner;

public class NoramlUser extends User {

    public NoramlUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{
                new ExitOperation(),
                new FindOperation()
                ,new BorrowOperation()
                ,new ReturnOperation()
        };
    }
    public  int menu(){
        System.out.println("*****************");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println(" 0.退出图书");
        System.out.println("************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的操作");
        int choice = scanner.nextInt();
        return choice ;
    }
}
