package p018b3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b3.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0975s {

    /* JADX INFO: renamed from: b */
    public static final a f2976b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f2977c = m3552k(-1);

    /* JADX INFO: renamed from: d */
    public static final int f2978d = m3552k(1);

    /* JADX INFO: renamed from: e */
    public static final int f2979e = m3552k(0);

    /* JADX INFO: renamed from: f */
    public static final int f2980f = m3552k(2);

    /* JADX INFO: renamed from: g */
    public static final int f2981g = m3552k(3);

    /* JADX INFO: renamed from: h */
    public static final int f2982h = m3552k(4);

    /* JADX INFO: renamed from: i */
    public static final int f2983i = m3552k(5);

    /* JADX INFO: renamed from: j */
    public static final int f2984j = m3552k(6);

    /* JADX INFO: renamed from: k */
    public static final int f2985k = m3552k(7);

    /* JADX INFO: renamed from: a */
    public final int f2986a;

    public /* synthetic */ C0975s(int i10) {
        this.f2986a = i10;
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ C0975s m3551j(int i10) {
        return new C0975s(i10);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3553l(int i10, Object obj) {
        return (obj instanceof C0975s) && i10 == ((C0975s) obj).m3557p();
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m3554m(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: n */
    public static int m3555n(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: o */
    public static String m3556o(int i10) {
        return m3554m(i10, f2977c) ? "Unspecified" : m3554m(i10, f2979e) ? "None" : m3554m(i10, f2978d) ? "Default" : m3554m(i10, f2980f) ? "Go" : m3554m(i10, f2981g) ? "Search" : m3554m(i10, f2982h) ? "Send" : m3554m(i10, f2983i) ? "Previous" : m3554m(i10, f2984j) ? "Next" : m3554m(i10, f2985k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3553l(this.f2986a, obj);
    }

    public int hashCode() {
        return m3555n(this.f2986a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int m3557p() {
        return this.f2986a;
    }

    public String toString() {
        return m3556o(this.f2986a);
    }

    /* JADX INFO: renamed from: b3.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m3558a() {
            return C0975s.f2978d;
        }

        /* JADX INFO: renamed from: b */
        public final int m3559b() {
            return C0975s.f2985k;
        }

        /* JADX INFO: renamed from: c */
        public final int m3560c() {
            return C0975s.f2980f;
        }

        /* JADX INFO: renamed from: d */
        public final int m3561d() {
            return C0975s.f2984j;
        }

        /* JADX INFO: renamed from: e */
        public final int m3562e() {
            return C0975s.f2979e;
        }

        /* JADX INFO: renamed from: f */
        public final int m3563f() {
            return C0975s.f2983i;
        }

        /* JADX INFO: renamed from: g */
        public final int m3564g() {
            return C0975s.f2981g;
        }

        /* JADX INFO: renamed from: h */
        public final int m3565h() {
            return C0975s.f2982h;
        }

        /* JADX INFO: renamed from: i */
        public final int m3566i() {
            return C0975s.f2977c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m3552k(int i10) {
        return i10;
    }
}
