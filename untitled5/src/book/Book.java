package book;
//书
public class Book {
    private  String name;//名称
    private  String author;//作者
    private  String type;//类型
    private  int price;//价格

    private boolean isBorrowed;//借阅状态fasle代表借出 true代表存在

    public Book(String name,String author,String type,int price) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void isBorrowed(boolean state){
        this.isBorrowed = state;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ( (isBorrowed ==true)?"已经借出":"未被借出")+

                '}';
    }
}
