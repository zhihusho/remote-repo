package book;
//书架
public class bookList {
    private Book[] books;

    private int usedSize = 0;//记录书架上存放书的数量
    private static  final  int DEFAULT_CAPACITY = 10;
    public bookList(){

        this.books = new Book[DEFAULT_CAPACITY];
        this.books[0] = new Book("三国演艺","罗贯中","小说",10);
        this.books[1] = new Book("西游记","das","小说",20);
        this.books[2] = new Book("认识","sad","小说",40);
        this.usedSize = 3;
    }

    public Book getbook(int pos) {//获取书架上书的内容?这个方法是要得到一个Pos位置上的书所以最后返回Book类型
        return books[pos];
    }
    public void setBook(int pos,Book book){
        books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book[] getBooks(){
        return  books;
    }
}
