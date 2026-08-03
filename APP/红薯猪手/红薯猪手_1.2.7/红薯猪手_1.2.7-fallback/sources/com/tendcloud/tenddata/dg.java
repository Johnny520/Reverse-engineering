package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class dg extends com.tendcloud.tenddata.cy {
    public dg() {
            r2 = this;
            r2.<init>()
            long r0 = c()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "bootTime"
            r2.a(r1, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "activeTime"
            r2.a(r1, r0)
            int r0 = a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "freeDiskSpace"
            r2.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            int r0 = com.tendcloud.tenddata.k.f(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "batteryLevel"
            r2.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            int r0 = com.tendcloud.tenddata.k.g(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "batteryState"
            r2.a(r1, r0)
            return
    }

    public static int a() {
            int[] r0 = com.tendcloud.tenddata.k.u()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    public static long c() {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La
            long r0 = r0 - r2
            return r0
        La:
            r0 = -1
            return r0
    }
}
