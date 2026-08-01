package p018b3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b3.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0989z {

    /* JADX INFO: renamed from: b */
    public static final a f3042b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f3043c = m3661l(0);

    /* JADX INFO: renamed from: d */
    public static final int f3044d = m3661l(1);

    /* JADX INFO: renamed from: e */
    public static final int f3045e = m3661l(2);

    /* JADX INFO: renamed from: f */
    public static final int f3046f = m3661l(3);

    /* JADX INFO: renamed from: g */
    public static final int f3047g = m3661l(4);

    /* JADX INFO: renamed from: h */
    public static final int f3048h = m3661l(5);

    /* JADX INFO: renamed from: i */
    public static final int f3049i = m3661l(6);

    /* JADX INFO: renamed from: j */
    public static final int f3050j = m3661l(7);

    /* JADX INFO: renamed from: k */
    public static final int f3051k = m3661l(8);

    /* JADX INFO: renamed from: l */
    public static final int f3052l = m3661l(9);

    /* JADX INFO: renamed from: a */
    public final int f3053a;

    public /* synthetic */ C0989z(int i10) {
        this.f3053a = i10;
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ C0989z m3660k(int i10) {
        return new C0989z(i10);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3662m(int i10, Object obj) {
        return (obj instanceof C0989z) && i10 == ((C0989z) obj).m3666q();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m3663n(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: o */
    public static int m3664o(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: p */
    public static String m3665p(int i10) {
        return m3663n(i10, f3043c) ? "Unspecified" : m3663n(i10, f3044d) ? "Text" : m3663n(i10, f3045e) ? "Ascii" : m3663n(i10, f3046f) ? "Number" : m3663n(i10, f3047g) ? "Phone" : m3663n(i10, f3048h) ? "Uri" : m3663n(i10, f3049i) ? "Email" : m3663n(i10, f3050j) ? "Password" : m3663n(i10, f3051k) ? "NumberPassword" : m3663n(i10, f3052l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3662m(this.f3053a, obj);
    }

    public int hashCode() {
        return m3664o(this.f3053a);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int m3666q() {
        return this.f3053a;
    }

    public String toString() {
        return m3665p(this.f3053a);
    }

    /* JADX INFO: renamed from: b3.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m3667a() {
            return C0989z.f3045e;
        }

        /* JADX INFO: renamed from: b */
        public final int m3668b() {
            return C0989z.f3052l;
        }

        /* JADX INFO: renamed from: c */
        public final int m3669c() {
            return C0989z.f3049i;
        }

        /* JADX INFO: renamed from: d */
        public final int m3670d() {
            return C0989z.f3046f;
        }

        /* JADX INFO: renamed from: e */
        public final int m3671e() {
            return C0989z.f3051k;
        }

        /* JADX INFO: renamed from: f */
        public final int m3672f() {
            return C0989z.f3050j;
        }

        /* JADX INFO: renamed from: g */
        public final int m3673g() {
            return C0989z.f3047g;
        }

        /* JADX INFO: renamed from: h */
        public final int m3674h() {
            return C0989z.f3044d;
        }

        /* JADX INFO: renamed from: i */
        public final int m3675i() {
            return C0989z.f3043c;
        }

        /* JADX INFO: renamed from: j */
        public final int m3676j() {
            return C0989z.f3048h;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m3661l(int i10) {
        return i10;
    }
}
