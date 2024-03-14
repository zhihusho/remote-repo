package operation;

import book.bookList;

//定义接口原因操作都需要对书架进行操作所以将其汇聚起来弄一个接口最后由其他重写同时因为其他所有操作都继承于他所以通过他可以控制所以方法（创建一个数组）
public interface IOPeration {

    void work(bookList bookList);//传参调用booklist的原因是在这些功能实现的时候需要对其书架上面进行操作
}
