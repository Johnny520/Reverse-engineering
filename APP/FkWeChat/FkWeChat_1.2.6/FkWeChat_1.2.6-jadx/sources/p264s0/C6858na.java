package p264s0;

import p024b9.AbstractC1043k;
import p376zd.C10010p0;

/* JADX INFO: renamed from: s0.na */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6858na {

    /* JADX INFO: renamed from: b */
    public static final a f22267b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f22268c = AbstractC6778ia.m26882D(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f22269a;

    public /* synthetic */ C6858na(long j10) {
        this.f22269a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C6858na m27249b(long j10) {
        return new C6858na(j10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m27251d(long j10, Object obj) {
        return (obj instanceof C6858na) && j10 == ((C6858na) obj).m27257j();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m27252e(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: f */
    public static final float m27253f(long j10) {
        if (j10 != f22268c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        C10010p0.m38820a("SliderRange is unspecified");
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public static final float m27254g(long j10) {
        if (j10 != f22268c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        C10010p0.m38820a("SliderRange is unspecified");
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public static int m27255h(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: i */
    public static String m27256i(long j10) {
        if (!AbstractC6778ia.m26897S(j10)) {
            return "FloatRange.Unspecified";
        }
        return m27254g(j10) + ".." + m27253f(j10);
    }

    public boolean equals(Object obj) {
        return m27251d(this.f22269a, obj);
    }

    public int hashCode() {
        return m27255h(this.f22269a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m27257j() {
        return this.f22269a;
    }

    public String toString() {
        return m27256i(this.f22269a);
    }

    /* JADX INFO: renamed from: s0.na$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m27258a() {
            return C6858na.f22268c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m27250c(long j10) {
        return j10;
    }
}
