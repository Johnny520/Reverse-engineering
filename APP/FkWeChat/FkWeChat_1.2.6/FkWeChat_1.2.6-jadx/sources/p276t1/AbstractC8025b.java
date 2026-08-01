package p276t1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8025b {

    /* JADX INFO: renamed from: a */
    public static final a f26749a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final long f26750b;

    /* JADX INFO: renamed from: c */
    public static final long f26751c;

    /* JADX INFO: renamed from: d */
    public static final long f26752d;

    /* JADX INFO: renamed from: e */
    public static final long f26753e;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f26750b = m30840d((((long) 0) & 4294967295L) | j11);
        f26751c = m30840d((((long) 1) & 4294967295L) | j11);
        f26752d = m30840d(j11 | (((long) 2) & 4294967295L));
        f26753e = m30840d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m30841e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static final int m30842f(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: g */
    public static int m30843g(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: h */
    public static String m30844h(long j10) {
        return m30841e(j10, f26750b) ? "Rgb" : m30841e(j10, f26751c) ? "Xyz" : m30841e(j10, f26752d) ? "Lab" : m30841e(j10, f26753e) ? "Cmyk" : "Unknown";
    }

    /* JADX INFO: renamed from: t1.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m30845a() {
            return AbstractC8025b.f26752d;
        }

        /* JADX INFO: renamed from: b */
        public final long m30846b() {
            return AbstractC8025b.f26750b;
        }

        /* JADX INFO: renamed from: c */
        public final long m30847c() {
            return AbstractC8025b.f26751c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m30840d(long j10) {
        return j10;
    }
}
