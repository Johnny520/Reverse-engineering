package com.tendcloud.tenddata;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dg */
/* JADX INFO: loaded from: classes.dex */
public class C0106dg extends AbstractC0097cy {
    public C0106dg() {
        m473a("bootTime", Long.valueOf(m497c()));
        m473a("activeTime", Long.valueOf(SystemClock.elapsedRealtime()));
        m473a("freeDiskSpace", Integer.valueOf(m496a()));
        m473a("batteryLevel", Integer.valueOf(C0118k.m604f(C0020ab.f132g)));
        m473a("batteryState", Integer.valueOf(C0118k.m606g(C0020ab.f132g)));
    }

    /* JADX INFO: renamed from: a */
    public static int m496a() {
        try {
            int[] iArrM635u = C0118k.m635u();
            if (iArrM635u != null) {
                return iArrM635u[1];
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m497c() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
