package ru.itpark.domain;

public class House {
    private int id;
    private int price;
    private String district;
    private int area;
    private int rooms;

    @Override
    public String toString() {
        return "\n House{" +
                "id=" + id +
                ", price=" + price +
                ", district='" + district + '\'' +
                ", area=" + area +
                ", rooms=" + rooms +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public House(int id, int price, String district, int area, int rooms) {
        this.id = id;
        this.price = price;
        this.district = district;
        this.area = area;
        this.rooms = rooms;
    }
}
