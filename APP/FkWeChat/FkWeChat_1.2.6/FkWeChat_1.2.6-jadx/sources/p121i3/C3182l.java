package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3182l {

    /* JADX INFO: renamed from: b */
    public static final a f8467b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8468c = m12027d(0);

    /* JADX INFO: renamed from: d */
    public static final long f8469d = m12027d(9205357640488583168L);

    /* JADX INFO: renamed from: a */
    public final long f8470a;

    public /* synthetic */ C3182l(long j10) {
        this.f8470a = j10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C3182l m12026c(long j10) {
        return new C3182l(j10);
    }

    /* JADX INFO: renamed from: e */
    public static final long m12028e(long j10, float f10, float f11) {
        return m12027d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m12029f(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m12033j(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m12032i(j10);
        }
        return m12028e(j10, f10, f11);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12030g(long j10, Object obj) {
        return (obj instanceof C3182l) && j10 == ((C3182l) obj).m12036m();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12031h(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: i */
    public static final float m12032i(long j10) {
        return C3179i.m12003k(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: j */
    public static final float m12033j(long j10) {
        return C3179i.m12003k(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    /* JADX INFO: renamed from: k */
    public static int m12034k(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: l */
    public static String m12035l(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C3179i.m12007p(m12033j(j10))) + " x " + ((Object) C3179i.m12007p(m12032i(j10)));
    }

    public boolean equals(Object obj) {
        return m12030g(this.f8470a, obj);
    }

    public int hashCode() {
        return m12034k(this.f8470a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long m12036m() {
        return this.f8470a;
    }

    public String toString() {
        return m12035l(this.f8470a);
    }

    /* JADX INFO: renamed from: i3.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12037a() {
            return C3182l.f8469d;
        }

        /* JADX INFO: renamed from: b */
        public final long m12038b() {
            return C3182l.f8468c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m12027d(long j10) {
        return j10;
    }
}
