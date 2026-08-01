package p177m0;

import p024b9.AbstractC1043k;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: m0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4759a {

    /* JADX INFO: renamed from: a */
    public static final a f14091a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final long f14092b = m19030b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static long m19030b(float f10, float f11) {
        return m19031c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* JADX INFO: renamed from: d */
    public static long m19032d(InterfaceC3175e interfaceC3175e) {
        return m19030b(interfaceC3175e.getDensity(), interfaceC3175e.mo1231c1());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m19033e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static final float m19034f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: g */
    public static final float m19035g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m19036h(long j10) {
        return "InlineDensity(density=" + m19034f(j10) + ", fontScale=" + m19035g(j10) + ')';
    }

    /* JADX INFO: renamed from: m0.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m19037a() {
            return AbstractC4759a.f14092b;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m19031c(long j10) {
        return j10;
    }
}
