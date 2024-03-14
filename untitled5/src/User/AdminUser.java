package User;

import operation.*;

import java.awt.*;
import java.util.Scanner;

public class AdminUser extends  User {

    public AdminUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{new ExitOperation(),
                new FindOperation()
                ,new AddOperation()
                ,new DelOperation(),
                new ShowOperation(),
                };
    }
    public  int  menu(){
        System.out.println("*****************");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println(" 0.退出图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的操作");
        int choice = scanner.nextInt();
        return choice ;
    }

}
