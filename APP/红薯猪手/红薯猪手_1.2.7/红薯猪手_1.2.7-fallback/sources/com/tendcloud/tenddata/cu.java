package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cu extends com.tendcloud.tenddata.cy {
    private java.lang.String a;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;

    public cu() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "type"
            r1.a = r0
            java.lang.String r0 = "name"
            r1.c = r0
            java.lang.String r0 = "extra1"
            r1.d = r0
            java.lang.String r0 = "extra2"
            r1.e = r0
            java.lang.String r0 = "targetApp"
            r1.f = r0
            return
    }

    public void setExtra1(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.d
            r1.a(r2, r0)
            return
    }

    public void setExtra2(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.e
            r1.a(r2, r0)
            return
    }

    public void setName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.c
            r1.a(r2, r0)
            return
    }

    public void setTargetApp(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.f
            r1.a(r2, r0)
            return
    }

    public void setType(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.a
            r1.a(r2, r0)
            return
    }
}
