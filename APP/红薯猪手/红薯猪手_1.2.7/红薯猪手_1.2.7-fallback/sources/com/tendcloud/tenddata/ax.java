package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ax {
    private java.lang.String a;
    private java.lang.String b;
    private byte c;
    private byte d;
    private byte e;

    public ax() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            java.lang.String r0 = "00:00:00:00:00:00"
            r1.b = r0
            r0 = -127(0xffffffffffffff81, float:NaN)
            r1.c = r0
            r0 = 1
            r1.d = r0
            r1.e = r0
            return
    }

    public ax(java.lang.String r1, java.lang.String r2, byte r3, byte r4, byte r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public byte c() {
            r1 = this;
            byte r0 = r1.c
            return r0
    }

    public byte d() {
            r1 = this;
            byte r0 = r1.d
            return r0
    }

    public byte e() {
            r1 = this;
            byte r0 = r1.e
            return r0
    }

    public com.tendcloud.tenddata.ax f() {
            r7 = this;
            com.tendcloud.tenddata.ax r6 = new com.tendcloud.tenddata.ax
            java.lang.String r1 = r7.a
            java.lang.String r2 = r7.b
            byte r3 = r7.c
            byte r4 = r7.d
            byte r5 = r7.e
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public void setBand(byte r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setBssid(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setChannel(byte r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setRssi(byte r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setSsid(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
