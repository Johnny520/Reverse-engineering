package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.q3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7130q3 {

    /* JADX INFO: renamed from: b */
    public static final a f23659b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f23660c = AbstractC7135r3.m28193a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a */
    public final long f23661a;

    public /* synthetic */ C7130q3(long j10) {
        this.f23661a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C7130q3 m28159b(long j10) {
        return new C7130q3(j10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m28161d(long j10, Object obj) {
        return (obj instanceof C7130q3) && j10 == ((C7130q3) obj).m28167j();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m28162e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static final float m28163f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: g */
    public static final float m28164g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static int m28165h(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: i */
    public static String m28166i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m28161d(this.f23661a, obj);
    }

    public int hashCode() {
        return m28165h(this.f23661a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m28167j() {
        return this.f23661a;
    }

    public String toString() {
        return m28166i(this.f23661a);
    }

    /* JADX INFO: renamed from: s1.q3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m28168a() {
            return C7130q3.f23660c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m28160c(long j10) {
        return j10;
    }
}
