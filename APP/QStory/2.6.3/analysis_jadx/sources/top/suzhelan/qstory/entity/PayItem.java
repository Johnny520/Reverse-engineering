package top.suzhelan.qstory.entity;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PayItem implements Serializable {
    private int durationMonths;
    private String name;
    private String payUrl;
    private double price;

    public int getDurationMonths() {
        return this.durationMonths;
    }

    public String getName() {
        return this.name;
    }

    public String getPayUrl() {
        return this.payUrl;
    }

    public double getPrice() {
        return this.price;
    }

    public void setDurationMonths(int i) {
        this.durationMonths = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayUrl(String str) {
        this.payUrl = str;
    }

    public void setPrice(double d) {
        this.price = d;
    }
}
