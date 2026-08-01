package p049d9;

import p376zd.C9987e;

/* JADX INFO: renamed from: d9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1927c extends AbstractC1926b {
    /* JADX INFO: renamed from: a */
    public static int m6977a(int i10) {
        return Integer.signum(i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m6978b(long j10) {
        return Long.signum(j10);
    }

    /* JADX INFO: renamed from: c */
    public static int m6979c(double d10) {
        if (Double.isNaN(d10)) {
            C9987e.m38645a("Cannot round NaN value.");
            return 0;
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    /* JADX INFO: renamed from: d */
    public static int m6980d(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        C9987e.m38645a("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static long m6981e(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        C9987e.m38645a("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public static long m6982f(float f10) {
        return m6981e(f10);
    }
}
