package p319w2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: w2.t3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9137t3 {

    /* JADX INFO: renamed from: b */
    public static final a f31232b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f31233c = AbstractC9142u3.m35529a(0);

    /* JADX INFO: renamed from: a */
    public final long f31234a;

    public /* synthetic */ C9137t3(long j10) {
        this.f31234a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C9137t3 m35511b(long j10) {
        return new C9137t3(j10);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m35513d(long j10, long j11) {
        return (m35521l(j10) <= m35521l(j11)) & (m35520k(j11) <= m35520k(j10));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m35514e(long j10, int i10) {
        return i10 < m35520k(j10) && m35521l(j10) <= i10;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m35515f(long j10, Object obj) {
        return (obj instanceof C9137t3) && j10 == ((C9137t3) obj).m35527r();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m35516g(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m35517h(long j10) {
        return m35523n(j10) == m35518i(j10);
    }

    /* JADX INFO: renamed from: i */
    public static final int m35518i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: j */
    public static final int m35519j(long j10) {
        return m35520k(j10) - m35521l(j10);
    }

    /* JADX INFO: renamed from: k */
    public static final int m35520k(long j10) {
        return Math.max(m35523n(j10), m35518i(j10));
    }

    /* JADX INFO: renamed from: l */
    public static final int m35521l(long j10) {
        return Math.min(m35523n(j10), m35518i(j10));
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m35522m(long j10) {
        return m35523n(j10) > m35518i(j10);
    }

    /* JADX INFO: renamed from: n */
    public static final int m35523n(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: o */
    public static int m35524o(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m35525p(long j10, long j11) {
        return (m35521l(j10) < m35520k(j11)) & (m35521l(j11) < m35520k(j10));
    }

    /* JADX INFO: renamed from: q */
    public static String m35526q(long j10) {
        return "TextRange(" + m35523n(j10) + ", " + m35518i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m35515f(this.f31234a, obj);
    }

    public int hashCode() {
        return m35524o(this.f31234a);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long m35527r() {
        return this.f31234a;
    }

    public String toString() {
        return m35526q(this.f31234a);
    }

    /* JADX INFO: renamed from: w2.t3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m35528a() {
            return C9137t3.f31233c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m35512c(long j10) {
        return j10;
    }
}
