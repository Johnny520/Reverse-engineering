package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.m3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7110m3 {

    /* JADX INFO: renamed from: a */
    public static final a f23617a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f23618b = m28005d(0);

    /* JADX INFO: renamed from: c */
    public static final int f23619c = m28005d(1);

    /* JADX INFO: renamed from: d */
    public static final int f23620d = m28005d(2);

    /* JADX INFO: renamed from: e */
    public static final boolean m28006e(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: f */
    public static int m28007f(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: g */
    public static String m28008g(int i10) {
        return m28006e(i10, f23618b) ? "Miter" : m28006e(i10, f23619c) ? "Round" : m28006e(i10, f23620d) ? "Bevel" : "Unknown";
    }

    /* JADX INFO: renamed from: s1.m3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m28009a() {
            return AbstractC7110m3.f23620d;
        }

        /* JADX INFO: renamed from: b */
        public final int m28010b() {
            return AbstractC7110m3.f23618b;
        }

        /* JADX INFO: renamed from: c */
        public final int m28011c() {
            return AbstractC7110m3.f23619c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m28005d(int i10) {
        return i10;
    }
}
