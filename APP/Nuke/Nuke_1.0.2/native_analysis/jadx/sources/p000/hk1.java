package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hk1 {
    /* JADX INFO: renamed from: a */
    public static Number m2202a(int i, l41 l41Var) {
        if (i == 1) {
            return Double.valueOf(l41Var.m2836u());
        }
        if (i == 2) {
            return new i71(l41Var.m2812G());
        }
        if (i == 3) {
            String strM2812G = l41Var.m2812G();
            if (strM2812G.indexOf(46) >= 0) {
                return m2203b(strM2812G, l41Var);
            }
            try {
                return Long.valueOf(Long.parseLong(strM2812G));
            } catch (NumberFormatException unused) {
                return m2203b(strM2812G, l41Var);
            }
        }
        String strM2812G2 = l41Var.m2812G();
        try {
            return up0.m5525D(strM2812G2);
        } catch (NumberFormatException e) {
            throw new C0594pv("Cannot parse " + strM2812G2 + "; at path " + l41Var.m2831o(true), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Double m2203b(String str, l41 l41Var) throws ke1 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (l41Var.f5933v != 1) {
                    throw new ke1("JSON forbids NaN and infinities: " + dValueOf + "; at path " + l41Var.m2831o(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            throw new C0594pv("Cannot parse " + str + "; at path " + l41Var.m2831o(true), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2204c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m2205d(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m2206e(m13 m13Var, int i, int i2) {
        return (m13Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m2207f(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static String m2208g(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: h */
    public static String m2209h(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m2210i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m2211j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static StringBuilder m2212k(String str, int i, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: l */
    public static void m2213l(long j, StringBuilder sb, String str) {
        sb.append((Object) C0363ju.m2572i(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m2214m(C0133dk c0133dk, C0133dk c0133dk2, C0133dk c0133dk3, C0133dk c0133dk4, C0133dk c0133dk5) {
        zt1.m6504a(c0133dk);
        zt1.m6504a(c0133dk2);
        zt1.m6504a(c0133dk3);
        zt1.m6504a(c0133dk4);
        zt1.m6504a(c0133dk5);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m2215n(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2216o(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
