package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ax */
/* JADX INFO: loaded from: classes.dex */
public class C0042ax {

    /* JADX INFO: renamed from: a */
    private String f224a;

    /* JADX INFO: renamed from: b */
    private String f225b;

    /* JADX INFO: renamed from: c */
    private byte f226c;

    /* JADX INFO: renamed from: d */
    private byte f227d;

    /* JADX INFO: renamed from: e */
    private byte f228e;

    public C0042ax() {
        this.f224a = "";
        this.f225b = "00:00:00:00:00:00";
        this.f226c = (byte) -127;
        this.f227d = (byte) 1;
        this.f228e = (byte) 1;
    }

    public C0042ax(String str, String str2, byte b, byte b2, byte b3) {
        this.f224a = str;
        this.f225b = str2;
        this.f226c = b;
        this.f227d = b2;
        this.f228e = b3;
    }

    /* JADX INFO: renamed from: a */
    public String m244a() {
        return this.f224a;
    }

    /* JADX INFO: renamed from: b */
    public String m245b() {
        return this.f225b;
    }

    /* JADX INFO: renamed from: c */
    public byte m246c() {
        return this.f226c;
    }

    /* JADX INFO: renamed from: d */
    public byte m247d() {
        return this.f227d;
    }

    /* JADX INFO: renamed from: e */
    public byte m248e() {
        return this.f228e;
    }

    /* JADX INFO: renamed from: f */
    public C0042ax m249f() {
        return new C0042ax(this.f224a, this.f225b, this.f226c, this.f227d, this.f228e);
    }

    public void setBand(byte b) {
        this.f227d = b;
    }

    public void setBssid(String str) {
        this.f225b = str;
    }

    public void setChannel(byte b) {
        this.f228e = b;
    }

    public void setRssi(byte b) {
        this.f226c = b;
    }

    public void setSsid(String str) {
        this.f224a = str;
    }
}
