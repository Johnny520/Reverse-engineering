package p314vb;

import okhttp3.internal.http2.Http2Connection;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8621f0;
import p376zd.C9987e;

/* JADX INFO: renamed from: vb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8895b implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f29484r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final long f29485s = m34116r(0);

    /* JADX INFO: renamed from: t */
    public static final long f29486t = AbstractC8899f.m34150l(4611686018427387903L);

    /* JADX INFO: renamed from: u */
    public static final long f29487u = AbstractC8899f.m34150l(-4611686018427387903L);

    /* JADX INFO: renamed from: v */
    public static final long f29488v = m34116r(9223372036854759646L);

    /* JADX INFO: renamed from: q */
    public final long f29489q;

    public /* synthetic */ C8895b(long j10) {
        this.f29489q = j10;
    }

    /* JADX INFO: renamed from: A */
    public static final long m34087A(long j10) {
        long jM34093G = m34093G(j10);
        if (m34097K(j10)) {
            return jM34093G;
        }
        if (jM34093G > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM34093G < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return AbstractC8899f.m34159u(jM34093G);
    }

    /* JADX INFO: renamed from: B */
    public static final long m34088B(long j10) {
        return m34103Q(j10, EnumC8900g.f29496u);
    }

    /* JADX INFO: renamed from: C */
    public static final int m34089C(long j10) {
        if (m34098L(j10)) {
            return 0;
        }
        return (int) (m34124z(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: D */
    public static final int m34090D(long j10) {
        if (m34098L(j10)) {
            return 0;
        }
        return (int) (m34096J(j10) ? AbstractC8899f.m34159u(m34093G(j10) % ((long) 1000)) : m34093G(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    /* JADX INFO: renamed from: E */
    public static final int m34091E(long j10) {
        if (m34098L(j10)) {
            return 0;
        }
        return (int) (m34088B(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: F */
    public static final EnumC8900g m34092F(long j10) {
        return m34097K(j10) ? EnumC8900g.f29493r : EnumC8900g.f29495t;
    }

    /* JADX INFO: renamed from: G */
    public static final long m34093G(long j10) {
        return j10 >> 1;
    }

    /* JADX INFO: renamed from: H */
    public static int m34094H(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m34095I(long j10) {
        return !m34098L(j10);
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m34096J(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m34097K(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m34098L(long j10) {
        return j10 == f29486t || j10 == f29487u;
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m34099M(long j10) {
        return j10 < 0;
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m34100N(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: renamed from: O */
    public static final long m34101O(long j10, long j11) {
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return m34096J(j10) ? m34112k(j10, m34093G(j10), m34093G(j11)) : m34112k(j10, m34093G(j11), m34093G(j10));
        }
        if (m34097K(j10)) {
            return AbstractC8899f.m34153o(m34093G(j10) + m34093G(j11));
        }
        long jM34147i = AbstractC8899f.m34147i(m34093G(j10), m34093G(j11));
        if (jM34147i != 9223372036854759646L) {
            return (jM34147i == 4611686018427387903L || jM34147i == -4611686018427387903L) ? AbstractC8899f.m34150l(jM34147i) : AbstractC8899f.m34151m(jM34147i);
        }
        C9987e.m38645a("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX INFO: renamed from: P */
    public static final String m34102P(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (m34099M(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM34119u = m34119u(j10);
        long jM34122x = m34122x(jM34119u);
        int iM34089C = m34089C(jM34119u);
        int iM34091E = m34091E(jM34119u);
        int iM34090D = m34090D(jM34119u);
        long j11 = m34098L(j10) ? 9999999999999L : jM34122x;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iM34091E == 0 && iM34090D == 0) ? false : true;
        if (iM34089C != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iM34089C);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            m34113l(j10, sb2, iM34091E, iM34090D, 9, "S", true);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: Q */
    public static final long m34103Q(long j10, EnumC8900g enumC8900g) {
        enumC8900g.getClass();
        if (j10 == f29486t) {
            return Long.MAX_VALUE;
        }
        if (j10 == f29487u) {
            return Long.MIN_VALUE;
        }
        return AbstractC8901h.m34167a(m34093G(j10), m34092F(j10), enumC8900g);
    }

    /* JADX INFO: renamed from: R */
    public static String m34104R(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f29486t) {
            return "Infinity";
        }
        if (j10 == f29487u) {
            return "-Infinity";
        }
        boolean zM34099M = m34099M(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zM34099M) {
            sb2.append('-');
        }
        long jM34119u = m34119u(j10);
        long jM34121w = m34121w(jM34119u);
        int iM34120v = m34120v(jM34119u);
        int iM34089C = m34089C(jM34119u);
        int iM34091E = m34091E(jM34119u);
        int iM34090D = m34090D(jM34119u);
        int i10 = 0;
        boolean z10 = jM34121w != 0;
        boolean z11 = iM34120v != 0;
        boolean z12 = iM34089C != 0;
        boolean z13 = (iM34091E == 0 && iM34090D == 0) ? false : true;
        if (z10) {
            sb2.append(jM34121w);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM34120v);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM34089C);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM34091E != 0 || z10 || z11 || z12) {
                m34113l(j10, sb2, iM34091E, iM34090D, 9, "s", false);
            } else if (iM34090D >= 1000000) {
                m34113l(j10, sb2, iM34090D / 1000000, iM34090D % 1000000, 6, "ms", false);
            } else if (iM34090D >= 1000) {
                m34113l(j10, sb2, iM34090D / 1000, iM34090D % 1000, 3, "us", false);
            } else {
                sb2.append(iM34090D);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM34099M && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: S */
    public static final long m34105S(long j10) {
        return AbstractC8899f.m34149k(-m34093G(j10), ((int) j10) & 1);
    }

    /* JADX INFO: renamed from: k */
    public static final long m34112k(long j10, long j11, long j12) {
        long jM34160v = AbstractC8899f.m34160v(j12);
        long jM34147i = AbstractC8899f.m34147i(j11, jM34160v);
        if (-4611686018426L > jM34147i || jM34147i >= 4611686018427L) {
            return AbstractC8899f.m34150l(jM34147i);
        }
        return AbstractC8899f.m34152n(AbstractC8899f.m34159u(jM34147i) + (j12 - AbstractC8899f.m34159u(jM34160v)));
    }

    /* JADX INFO: renamed from: l */
    public static final void m34113l(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strM33094A0 = AbstractC8621f0.m33094A0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strM33094A0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM33094A0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strM33094A0, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strM33094A0, 0, i15);
            }
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ C8895b m34114m(long j10) {
        return new C8895b(j10);
    }

    /* JADX INFO: renamed from: p */
    public static int m34115p(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return AbstractC1061t.m3844e(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m34099M(j10) ? -i10 : i10;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m34117s(long j10, Object obj) {
        return (obj instanceof C8895b) && j10 == ((C8895b) obj).m34125T();
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m34118t(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: u */
    public static final long m34119u(long j10) {
        return m34099M(j10) ? m34105S(j10) : j10;
    }

    /* JADX INFO: renamed from: v */
    public static final int m34120v(long j10) {
        if (m34098L(j10)) {
            return 0;
        }
        return (int) (m34122x(j10) % ((long) 24));
    }

    /* JADX INFO: renamed from: w */
    public static final long m34121w(long j10) {
        return m34103Q(j10, EnumC8900g.f29499x);
    }

    /* JADX INFO: renamed from: x */
    public static final long m34122x(long j10) {
        return m34103Q(j10, EnumC8900g.f29498w);
    }

    /* JADX INFO: renamed from: y */
    public static final long m34123y(long j10) {
        return (m34096J(j10) && m34095I(j10)) ? m34093G(j10) : m34103Q(j10, EnumC8900g.f29495t);
    }

    /* JADX INFO: renamed from: z */
    public static final long m34124z(long j10) {
        return m34103Q(j10, EnumC8900g.f29497v);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ long m34125T() {
        return this.f29489q;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m34126n(((C8895b) obj).m34125T());
    }

    public boolean equals(Object obj) {
        return m34117s(this.f29489q, obj);
    }

    public int hashCode() {
        return m34094H(this.f29489q);
    }

    /* JADX INFO: renamed from: n */
    public int m34126n(long j10) {
        return m34115p(this.f29489q, j10);
    }

    public String toString() {
        return m34104R(this.f29489q);
    }

    /* JADX INFO: renamed from: vb.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m34127a(long j10) {
            long jM34116r = C8895b.m34116r(j10);
            if (AbstractC8896c.m34133a()) {
                if (C8895b.m34097K(jM34116r)) {
                    long jM34093G = C8895b.m34093G(jM34116r);
                    if (-4611686018426999999L <= jM34093G && jM34093G < 4611686018427000000L) {
                        return jM34116r;
                    }
                    throw new AssertionError(C8895b.m34093G(jM34116r) + " ns is out of nanoseconds range");
                }
                long jM34093G2 = C8895b.m34093G(jM34116r);
                if (-4611686018427387903L >= jM34093G2 || jM34093G2 >= 4611686018427387903L) {
                    long jM34093G3 = C8895b.m34093G(jM34116r);
                    if (jM34093G3 != 4611686018427387903L && jM34093G3 != -4611686018427387903L) {
                        throw new AssertionError(C8895b.m34093G(jM34116r) + " ms is out of milliseconds range");
                    }
                }
                long jM34093G4 = C8895b.m34093G(jM34116r);
                if (-4611686018426L > jM34093G4 || jM34093G4 >= 4611686018427L) {
                    return jM34116r;
                }
                throw new AssertionError(C8895b.m34093G(jM34116r) + " ms is denormalized");
            }
            return jM34116r;
        }

        /* JADX INFO: renamed from: b */
        public final long m34128b() {
            return C8895b.f29486t;
        }

        /* JADX INFO: renamed from: c */
        public final long m34129c() {
            return C8895b.f29488v;
        }

        /* JADX INFO: renamed from: d */
        public final long m34130d() {
            return C8895b.f29487u;
        }

        /* JADX INFO: renamed from: e */
        public final long m34131e() {
            return C8895b.f29485s;
        }

        /* JADX INFO: renamed from: f */
        public final long m34132f(String str) {
            str.getClass();
            try {
                long jM34163y = AbstractC8899f.m34163y(str, true, false, 4, null);
                if (C8895b.m34118t(jM34163y, C8895b.f29484r.m34129c())) {
                    throw new IllegalStateException("invariant failed");
                }
                return jM34163y;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: r */
    public static long m34116r(long j10) {
        return j10;
    }
}
