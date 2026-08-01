package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.l3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7105l3 {

    /* JADX INFO: renamed from: a */
    public static final a f23607a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f23608b = m27992d(0);

    /* JADX INFO: renamed from: c */
    public static final int f23609c = m27992d(1);

    /* JADX INFO: renamed from: d */
    public static final int f23610d = m27992d(2);

    /* JADX INFO: renamed from: e */
    public static final boolean m27993e(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: f */
    public static int m27994f(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: g */
    public static String m27995g(int i10) {
        return m27993e(i10, f23608b) ? "Butt" : m27993e(i10, f23609c) ? "Round" : m27993e(i10, f23610d) ? "Square" : "Unknown";
    }

    /* JADX INFO: renamed from: s1.l3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m27996a() {
            return AbstractC7105l3.f23608b;
        }

        /* JADX INFO: renamed from: b */
        public final int m27997b() {
            return AbstractC7105l3.f23609c;
        }

        /* JADX INFO: renamed from: c */
        public final int m27998c() {
            return AbstractC7105l3.f23610d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m27992d(int i10) {
        return i10;
    }
}
