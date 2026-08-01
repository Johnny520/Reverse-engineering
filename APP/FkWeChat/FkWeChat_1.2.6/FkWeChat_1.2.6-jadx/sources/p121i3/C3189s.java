package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3189s {

    /* JADX INFO: renamed from: b */
    public static final a f8481b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8482c = m12082c(0);

    /* JADX INFO: renamed from: a */
    public final long f8483a;

    public /* synthetic */ C3189s(long j10) {
        this.f8483a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C3189s m12081b(long j10) {
        return new C3189s(j10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12083d(long j10, Object obj) {
        return (obj instanceof C3189s) && j10 == ((C3189s) obj).m12087h();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12084e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static int m12085f(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: g */
    public static String m12086g(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m12083d(this.f8483a, obj);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long m12087h() {
        return this.f8483a;
    }

    public int hashCode() {
        return m12085f(this.f8483a);
    }

    public String toString() {
        return m12086g(this.f8483a);
    }

    /* JADX INFO: renamed from: i3.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12088a() {
            return C3189s.f8482c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m12082c(long j10) {
        return j10;
    }
}
