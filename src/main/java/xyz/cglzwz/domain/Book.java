package xyz.cglzwz.domain;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Book书本pojo
 *
 * @author chgl16
 * @date 2018-10-28 16:28
 * @version 1.0
 */

@Component
public class Book {
    private int id;
    private String isbn;
    private String title;
    private String publicationHouse;
    private Date publicationDate;
    private double price;
    private String introduction;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationHouse() {
        return publicationHouse;
    }

    public void setPublicationHouse(String publicationHouse) {
        this.publicationHouse = publicationHouse;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        // 换行注意： 逗号是在当前行， 加号在下一行
        return "book: [id: " + id + ", isbn: " + isbn + ", title: " + title + ", publicationHouse: "
                + publicationHouse + ", publicationDate: " + publicationDate + ", price: " + price
                + ", introduction: " + introduction + ", status: " + status + "]";
    }
}
