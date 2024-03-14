import User.AdminUser;
import User.NoramlUser;
import User.User;
import book.bookList;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {

    public static User login(){
        System.out.println("请输入你的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份   1.管理员      2. 普通用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            //管理员
            return new AdminUser(name);
        }else{
            //普通
           return new NoramlUser(name);
        }

    }

    public static void main(String[] args) {
        //调用对象是谁取决于选项子类被赋值给父类（向上转）
        bookList bookList = new bookList();
        while(true){
            User user =  login();
            int choice = user.menu();
            System.out.println("choice:"+choice);
            user.doOperation(choice,bookList);//传booklist
        }


    }



}
