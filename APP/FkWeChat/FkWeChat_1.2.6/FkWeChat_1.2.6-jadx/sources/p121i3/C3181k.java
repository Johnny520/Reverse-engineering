package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3181k {

    /* JADX INFO: renamed from: b */
    public static final a f8463b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8464c = m12016b(0);

    /* JADX INFO: renamed from: d */
    public static final long f8465d = m12016b(9205357640488583168L);

    /* JADX INFO: renamed from: a */
    public final long f8466a;

    public /* synthetic */ C3181k(long j10) {
        this.f8466a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3181k m12015a(long j10) {
        return new C3181k(j10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12017c(long j10, Object obj) {
        return (obj instanceof C3181k) && j10 == ((C3181k) obj).m12023i();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12018d(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: e */
    public static final float m12019e(long j10) {
        return C3179i.m12003k(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    /* JADX INFO: renamed from: f */
    public static final float m12020f(long j10) {
        return C3179i.m12003k(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: g */
    public static int m12021g(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: h */
    public static String m12022h(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C3179i.m12007p(m12019e(j10))) + ", " + ((Object) C3179i.m12007p(m12020f(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m12017c(this.f8466a, obj);
    }

    public int hashCode() {
        return m12021g(this.f8466a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long m12023i() {
        return this.f8466a;
    }

    public String toString() {
        return m12022h(this.f8466a);
    }

    /* JADX INFO: renamed from: i3.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m12016b(long j10) {
        return j10;
    }
}
