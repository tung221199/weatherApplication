package models;

import javax.persistence.*;

@Entity

public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double temp;
    private Double tempMin;
    private Double tempMax;
    private Long tempTypeId;
    private Long cityID;

    public Weather() {
    }

    public Weather(Long id, Double temp, Double tempMin, Double tempMax, Long tempTypeId, Long cityID) {
        this.id = id;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempTypeId = tempTypeId;
        this.cityID = cityID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Long getTempTypeId() {
        return tempTypeId;
    }

    public void setTempTypeId(Long tempTypeId) {
        this.tempTypeId = tempTypeId;
    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", temp=" + temp +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", tempTypeId=" + tempTypeId +
                ", cityID=" + cityID +
                '}';
    }

}
