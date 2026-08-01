package p250r1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6455e {

    /* JADX INFO: renamed from: b */
    public static final a f20314b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f20315c = m25551e(0);

    /* JADX INFO: renamed from: d */
    public static final long f20316d = m25551e(9187343241974906880L);

    /* JADX INFO: renamed from: e */
    public static final long f20317e = m25551e(9205357640488583168L);

    /* JADX INFO: renamed from: a */
    public final long f20318a;

    public /* synthetic */ C6455e(long j10) {
        this.f20318a = j10;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C6455e m25550d(long j10) {
        return new C6455e(j10);
    }

    /* JADX INFO: renamed from: f */
    public static final long m25552f(long j10, float f10, float f11) {
        return m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m25553g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m25552f(j10, f10, f11);
    }

    /* JADX INFO: renamed from: h */
    public static final long m25554h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m25555i(long j10, Object obj) {
        return (obj instanceof C6455e) && j10 == ((C6455e) obj).m25566t();
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m25556j(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: k */
    public static final float m25557k(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    /* JADX INFO: renamed from: l */
    public static final float m25558l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: m */
    public static final float m25559m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: n */
    public static final float m25560n(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: o */
    public static int m25561o(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: p */
    public static final long m25562p(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: q */
    public static final long m25563q(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: r */
    public static final long m25564r(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: s */
    public static String m25565s(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC6452b.m25532a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + AbstractC6452b.m25532a(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m25555i(this.f20318a, obj);
    }

    public int hashCode() {
        return m25561o(this.f20318a);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long m25566t() {
        return this.f20318a;
    }

    public String toString() {
        return m25565s(this.f20318a);
    }

    /* JADX INFO: renamed from: r1.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m25567a() {
            return C6455e.f20316d;
        }

        /* JADX INFO: renamed from: b */
        public final long m25568b() {
            return C6455e.f20317e;
        }

        /* JADX INFO: renamed from: c */
        public final long m25569c() {
            return C6455e.f20315c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m25551e(long j10) {
        return j10;
    }
}
