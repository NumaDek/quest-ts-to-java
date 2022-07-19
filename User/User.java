package User;

import java.util.Date;
import java.util.List;

public class User {
    private Date birthday;
    private float size;
    private List<Photo> photos;
    private Address address;

    public User(Date birthday, float size, List<Photo> photos, Address address) {
        this.birthday = birthday;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}