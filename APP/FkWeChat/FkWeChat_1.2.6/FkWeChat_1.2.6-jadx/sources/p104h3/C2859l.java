package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2859l {

    /* JADX INFO: renamed from: b */
    public static final a f7485b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f7486c = m10248h(1);

    /* JADX INFO: renamed from: d */
    public static final int f7487d = m10248h(2);

    /* JADX INFO: renamed from: e */
    public static final int f7488e = m10248h(3);

    /* JADX INFO: renamed from: f */
    public static final int f7489f = m10248h(4);

    /* JADX INFO: renamed from: g */
    public static final int f7490g = m10248h(5);

    /* JADX INFO: renamed from: h */
    public static final int f7491h = m10248h(0);

    /* JADX INFO: renamed from: a */
    public final int f7492a;

    public /* synthetic */ C2859l(int i10) {
        this.f7492a = i10;
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C2859l m10247g(int i10) {
        return new C2859l(i10);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10249i(int i10, Object obj) {
        return (obj instanceof C2859l) && i10 == ((C2859l) obj).m10253m();
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m10250j(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: k */
    public static int m10251k(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: l */
    public static String m10252l(int i10) {
        return m10250j(i10, f7486c) ? "Ltr" : m10250j(i10, f7487d) ? "Rtl" : m10250j(i10, f7488e) ? "Content" : m10250j(i10, f7489f) ? "ContentOrLtr" : m10250j(i10, f7490g) ? "ContentOrRtl" : m10250j(i10, f7491h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10249i(this.f7492a, obj);
    }

    public int hashCode() {
        return m10251k(this.f7492a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int m10253m() {
        return this.f7492a;
    }

    public String toString() {
        return m10252l(this.f7492a);
    }

    /* JADX INFO: renamed from: h3.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10254a() {
            return C2859l.f7488e;
        }

        /* JADX INFO: renamed from: b */
        public final int m10255b() {
            return C2859l.f7489f;
        }

        /* JADX INFO: renamed from: c */
        public final int m10256c() {
            return C2859l.f7490g;
        }

        /* JADX INFO: renamed from: d */
        public final int m10257d() {
            return C2859l.f7486c;
        }

        /* JADX INFO: renamed from: e */
        public final int m10258e() {
            return C2859l.f7487d;
        }

        /* JADX INFO: renamed from: f */
        public final int m10259f() {
            return C2859l.f7491h;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m10248h(int i10) {
        return i10;
    }
}
