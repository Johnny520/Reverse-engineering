package p018b3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b3.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0987y {

    /* JADX INFO: renamed from: b */
    public static final a f3034b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f3035c = m3639g(-1);

    /* JADX INFO: renamed from: d */
    public static final int f3036d = m3639g(0);

    /* JADX INFO: renamed from: e */
    public static final int f3037e = m3639g(1);

    /* JADX INFO: renamed from: f */
    public static final int f3038f = m3639g(2);

    /* JADX INFO: renamed from: g */
    public static final int f3039g = m3639g(3);

    /* JADX INFO: renamed from: a */
    public final int f3040a;

    public /* synthetic */ C0987y(int i10) {
        this.f3040a = i10;
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C0987y m3638f(int i10) {
        return new C0987y(i10);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3640h(int i10, Object obj) {
        return (obj instanceof C0987y) && i10 == ((C0987y) obj).m3644l();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3641i(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m3642j(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: k */
    public static String m3643k(int i10) {
        return m3641i(i10, f3035c) ? "Unspecified" : m3641i(i10, f3036d) ? "None" : m3641i(i10, f3037e) ? "Characters" : m3641i(i10, f3038f) ? "Words" : m3641i(i10, f3039g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3640h(this.f3040a, obj);
    }

    public int hashCode() {
        return m3642j(this.f3040a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int m3644l() {
        return this.f3040a;
    }

    public String toString() {
        return m3643k(this.f3040a);
    }

    /* JADX INFO: renamed from: b3.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m3645a() {
            return C0987y.f3037e;
        }

        /* JADX INFO: renamed from: b */
        public final int m3646b() {
            return C0987y.f3036d;
        }

        /* JADX INFO: renamed from: c */
        public final int m3647c() {
            return C0987y.f3039g;
        }

        /* JADX INFO: renamed from: d */
        public final int m3648d() {
            return C0987y.f3035c;
        }

        /* JADX INFO: renamed from: e */
        public final int m3649e() {
            return C0987y.f3038f;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m3639g(int i10) {
        return i10;
    }
}
