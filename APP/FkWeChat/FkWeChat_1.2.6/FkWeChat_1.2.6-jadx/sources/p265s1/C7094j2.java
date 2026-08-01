package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7094j2 {

    /* JADX INFO: renamed from: b */
    public static final a f23571b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f23572c = m27926g(0);

    /* JADX INFO: renamed from: d */
    public static final int f23573d = m27926g(1);

    /* JADX INFO: renamed from: e */
    public static final int f23574e = m27926g(2);

    /* JADX INFO: renamed from: f */
    public static final int f23575f = m27926g(3);

    /* JADX INFO: renamed from: g */
    public static final int f23576g = m27926g(4);

    /* JADX INFO: renamed from: a */
    public final int f23577a;

    public /* synthetic */ C7094j2(int i10) {
        this.f23577a = i10;
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C7094j2 m27925f(int i10) {
        return new C7094j2(i10);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m27927h(int i10, Object obj) {
        return (obj instanceof C7094j2) && i10 == ((C7094j2) obj).m27931l();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m27928i(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m27929j(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: k */
    public static String m27930k(int i10) {
        return m27928i(i10, f23572c) ? "Argb8888" : m27928i(i10, f23573d) ? "Alpha8" : m27928i(i10, f23574e) ? "Rgb565" : m27928i(i10, f23575f) ? "F16" : m27928i(i10, f23576g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m27927h(this.f23577a, obj);
    }

    public int hashCode() {
        return m27929j(this.f23577a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int m27931l() {
        return this.f23577a;
    }

    public String toString() {
        return m27930k(this.f23577a);
    }

    /* JADX INFO: renamed from: s1.j2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m27932a() {
            return C7094j2.f23573d;
        }

        /* JADX INFO: renamed from: b */
        public final int m27933b() {
            return C7094j2.f23572c;
        }

        /* JADX INFO: renamed from: c */
        public final int m27934c() {
            return C7094j2.f23575f;
        }

        /* JADX INFO: renamed from: d */
        public final int m27935d() {
            return C7094j2.f23576g;
        }

        /* JADX INFO: renamed from: e */
        public final int m27936e() {
            return C7094j2.f23574e;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m27926g(int i10) {
        return i10;
    }
}
