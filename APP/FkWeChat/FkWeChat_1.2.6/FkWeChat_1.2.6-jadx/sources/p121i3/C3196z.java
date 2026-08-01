package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3196z {

    /* JADX INFO: renamed from: b */
    public static final a f8498b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f8499c = m12132c(0);

    /* JADX INFO: renamed from: a */
    public final long f8500a;

    public /* synthetic */ C3196z(long j10) {
        this.f8500a = j10;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C3196z m12131b(long j10) {
        return new C3196z(j10);
    }

    /* JADX INFO: renamed from: d */
    public static final long m12133d(long j10, float f10, float f11) {
        return m12132c((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m12134e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m12133d(j10, f10, f11);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12135f(long j10, Object obj) {
        return (obj instanceof C3196z) && j10 == ((C3196z) obj).m12144o();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m12136g(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: h */
    public static final float m12137h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: i */
    public static final float m12138i(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: j */
    public static int m12139j(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: k */
    public static final long m12140k(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m12132c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: l */
    public static final long m12141l(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return m12132c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: m */
    public static final long m12142m(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return m12132c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: n */
    public static String m12143n(long j10) {
        return "(" + m12137h(j10) + ", " + m12138i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return m12135f(this.f8500a, obj);
    }

    public int hashCode() {
        return m12139j(this.f8500a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long m12144o() {
        return this.f8500a;
    }

    public String toString() {
        return m12143n(this.f8500a);
    }

    /* JADX INFO: renamed from: i3.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m12145a() {
            return C3196z.f8499c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m12132c(long j10) {
        return j10;
    }
}
