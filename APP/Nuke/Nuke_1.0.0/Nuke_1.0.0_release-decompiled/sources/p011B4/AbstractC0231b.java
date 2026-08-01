package p011B4;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.dartcv.nuke.BuildConfig;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p092S0.C1260M;
import p117X2.AbstractC1665j;
import p211o0.C2762u;

/* JADX INFO: renamed from: B4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0231b {
    /* JADX INFO: renamed from: a */
    public static int m390a(float f2, int i5, int i6) {
        return (Float.hashCode(f2) + i5) * i6;
    }

    /* JADX INFO: renamed from: b */
    public static int m391b(int i5, int i6, int i7) {
        return (Integer.hashCode(i5) + i6) * i7;
    }

    /* JADX INFO: renamed from: c */
    public static int m392c(int i5, int i6, long j5) {
        return (Long.hashCode(j5) + i5) * i6;
    }

    /* JADX INFO: renamed from: d */
    public static int m393d(int i5, int i6, C1260M c1260m) {
        return (c1260m.hashCode() + i5) * i6;
    }

    /* JADX INFO: renamed from: e */
    public static int m394e(int i5, int i6, String str) {
        return (str.hashCode() + i5) * i6;
    }

    /* JADX INFO: renamed from: f */
    public static int m395f(int i5, int i6, boolean z5) {
        return (Boolean.hashCode(z5) + i5) * i6;
    }

    /* JADX INFO: renamed from: g */
    public static C0330q m396g(String str) {
        AbstractC0277a.m484c(str);
        return new C0330q();
    }

    /* JADX INFO: renamed from: h */
    public static String m397h(int i5, String str, String str2) {
        return str + i5 + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m398i(String str, int i5) {
        return str + i5;
    }

    /* JADX INFO: renamed from: j */
    public static String m399j(String str, int i5, String str2, int i6) {
        return str + i5 + str2 + i6;
    }

    /* JADX INFO: renamed from: k */
    public static String m400k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m401l(StringBuilder sb, float f2, char c5) {
        sb.append(f2);
        sb.append(c5);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m402m(StringBuilder sb, String str, char c5) {
        sb.append(str);
        sb.append(c5);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m403n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m404o(int i5, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i5);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m405p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: q */
    public static void m406q(long j5, StringBuilder sb, String str) {
        sb.append((Object) C2762u.m4927i(j5));
        sb.append(str);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m407r(AutoCloseable autoCloseable) throws Exception {
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
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    executorService.shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m408s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m409t(String str, int i5) {
        if (i5 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1665j.class.getName();
            int i6 = 0;
            while (!stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            while (stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            StringBuilder sbM405p = m405p("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbM405p.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbM405p.toString());
            AbstractC1665j.m2989i(nullPointerException, AbstractC1665j.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m410u(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m411v(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
