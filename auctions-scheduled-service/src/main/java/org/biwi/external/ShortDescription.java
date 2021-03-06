package org.biwi.external;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ShortDescription {
    private String auctionId;
    private String name;
    private double startingPrice;
    private LocalDateTime beginDate;
    private String mainImage;
    private LocalTime duration;
    private List<String> categories;
    private String sellerId;

    public ShortDescription() {
    }

    public ShortDescription(String auctionId, String name, double startingPrice, LocalDateTime beginDate, String mainImage, LocalTime duration, List<String> categories, String sellerId) {
        this.auctionId = auctionId;
        this.name = name;
        this.startingPrice = startingPrice;
        this.beginDate = beginDate;
        this.mainImage = mainImage;
        this.duration = duration;
        this.categories = categories;
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }
}
