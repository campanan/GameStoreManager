package com.supera.gamestore.product;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public BigDecimal price;

    @Column(nullable = false)
    public short score;

    @Column(nullable = false)
    public String image;

    public Product() {
    }

    public Product(String name, BigDecimal price, short score, String image) {
        this.name = name;
        this.price = price;
        this.score = score;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}