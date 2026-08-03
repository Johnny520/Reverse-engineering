package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class dd extends com.tendcloud.tenddata.cy {
    public static com.tendcloud.tenddata.dc a = null;
    private static final java.lang.String c = "type";
    private static final java.lang.String d = "deviceId";
    private static final java.lang.String e = "runtimeConfig";
    private static final java.lang.String f = "hardwareConfig";
    private static final java.lang.String g = "softwareConfig";
    private com.tendcloud.tenddata.de h;
    private com.tendcloud.tenddata.db i;

    public dd() {
            r1 = this;
            r1.<init>()
            com.tendcloud.tenddata.de r0 = new com.tendcloud.tenddata.de
            r0.<init>()
            r1.h = r0
            com.tendcloud.tenddata.db r0 = new com.tendcloud.tenddata.db
            r0.<init>()
            r1.i = r0
            r1.d()
            return
    }

    private void d() {
            r2 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "mobile"
            r2.a(r0, r1)
            com.tendcloud.tenddata.dc r0 = new com.tendcloud.tenddata.dc
            r0.<init>()
            com.tendcloud.tenddata.dd.a = r0
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "deviceId"
            r2.a(r1, r0)
            com.tendcloud.tenddata.dg r0 = new com.tendcloud.tenddata.dg
            r0.<init>()
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "runtimeConfig"
            r2.a(r1, r0)
            com.tendcloud.tenddata.db r0 = r2.i
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "hardwareConfig"
            r2.a(r1, r0)
            com.tendcloud.tenddata.de r0 = r2.h
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "softwareConfig"
            r2.a(r1, r0)
            return
    }

    public com.tendcloud.tenddata.de a() {
            r1 = this;
            com.tendcloud.tenddata.de r0 = r1.h
            return r0
    }

    public com.tendcloud.tenddata.db c() {
            r1 = this;
            com.tendcloud.tenddata.db r0 = r1.i
            return r0
    }
}
