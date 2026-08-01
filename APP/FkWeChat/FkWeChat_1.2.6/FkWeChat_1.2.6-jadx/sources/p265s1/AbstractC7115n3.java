package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.n3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7115n3 {

    /* JADX INFO: renamed from: a */
    public static final a f23623a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f23624b = m28041e(0);

    /* JADX INFO: renamed from: c */
    public static final int f23625c = m28041e(1);

    /* JADX INFO: renamed from: d */
    public static final int f23626d = m28041e(2);

    /* JADX INFO: renamed from: e */
    public static final int f23627e = m28041e(3);

    /* JADX INFO: renamed from: f */
    public static final boolean m28042f(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m28043g(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: h */
    public static String m28044h(int i10) {
        return m28042f(i10, f23624b) ? "Clamp" : m28042f(i10, f23625c) ? "Repeated" : m28042f(i10, f23626d) ? "Mirror" : m28042f(i10, f23627e) ? "Decal" : "Unknown";
    }

    /* JADX INFO: renamed from: s1.n3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m28045a() {
            return AbstractC7115n3.f23624b;
        }

        /* JADX INFO: renamed from: b */
        public final int m28046b() {
            return AbstractC7115n3.f23627e;
        }

        /* JADX INFO: renamed from: c */
        public final int m28047c() {
            return AbstractC7115n3.f23626d;
        }

        /* JADX INFO: renamed from: d */
        public final int m28048d() {
            return AbstractC7115n3.f23625c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m28041e(int i10) {
        return i10;
    }
}
