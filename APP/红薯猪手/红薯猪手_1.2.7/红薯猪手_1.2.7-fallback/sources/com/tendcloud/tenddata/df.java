package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class df extends com.tendcloud.tenddata.cy {
    private static volatile com.tendcloud.tenddata.df j;
    private final java.lang.String a;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private volatile java.lang.String f;
    private volatile java.lang.String g;
    private volatile java.lang.String h;
    private volatile java.lang.String i;

    private df() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "oaid"
            r1.a = r0
            java.lang.String r0 = "vaid"
            r1.c = r0
            java.lang.String r0 = "aaid"
            r1.d = r0
            java.lang.String r0 = "udid"
            r1.e = r0
            java.lang.String r0 = ""
            r1.f = r0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            return
    }

    public static com.tendcloud.tenddata.df a() {
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.j
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.df> r0 = com.tendcloud.tenddata.df.class
            monitor-enter(r0)
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.j     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.df r1 = new com.tendcloud.tenddata.df     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.df.j = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.j
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public void setAAID(java.lang.String r2) {
            r1 = this;
            r1.g = r2
            java.lang.String r0 = "aaid"
            r1.a(r0, r2)
            return
    }

    public void setOAID(java.lang.String r2) {
            r1 = this;
            r1.f = r2
            java.lang.String r0 = "oaid"
            r1.a(r0, r2)
            return
    }

    public void setUDID(java.lang.String r2) {
            r1 = this;
            r1.i = r2
            java.lang.String r0 = "udid"
            r1.a(r0, r2)
            return
    }

    public void setVAID(java.lang.String r2) {
            r1 = this;
            r1.h = r2
            java.lang.String r0 = "vaid"
            r1.a(r0, r2)
            return
    }
}
