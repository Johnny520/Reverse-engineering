package p250r1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6451a {

    /* JADX INFO: renamed from: a */
    public static final a f20308a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final long f20309b = m25527b(0);

    /* JADX INFO: renamed from: c */
    public static final boolean m25528c(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: d */
    public static int m25529d(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: e */
    public static String m25530e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + AbstractC6452b.m25532a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC6452b.m25532a(Float.intBitsToFloat(i10), 1) + ", " + AbstractC6452b.m25532a(Float.intBitsToFloat(i11), 1) + ')';
    }

    /* JADX INFO: renamed from: r1.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m25531a() {
            return AbstractC6451a.f20309b;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m25527b(long j10) {
        return j10;
    }
}
