package entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table (name ="pumps")
public class Pump   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private double maxHead;
    private double maxFlow;
    private double power;
    private String description;

    @ManyToOne
    @JoinColumn(name ="pump_type_id")
    private PumpType pumpType;

    public Pump(String name, String brand, BigDecimal price, double maxHead, double maxFlow, double power, String description, PumpType pumpType) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.maxHead = maxHead;
        this.maxFlow = maxFlow;
        this.power = power;
        this.description = description;
        this.pumpType = pumpType;
    }



    public Pump() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getMaxHead() {
        return maxHead;
    }

    public double getMaxFlow() {
        return maxFlow;
    }

    public double getPower() {
        return power;
    }

    public String getDescription() {
        return description;
    }

    public PumpType getPumpType() {
        return pumpType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setMaxHead(double maxHead) {
        this.maxHead = maxHead;
    }

    public void setMaxFlow(double maxFlow) {
        this.maxFlow = maxFlow;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPumpType(PumpType pumpType) {
        this.pumpType = pumpType;
    }



}
