package p250r1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: r1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6461k {

    /* JADX INFO: renamed from: b */
    public static final a f20335b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f20336c = m25616d(0);

    /* JADX INFO: renamed from: d */
    public static final long f20337d = m25616d(9205357640488583168L);

    /* JADX INFO: renamed from: a */
    public final long f20338a;

    public /* synthetic */ C6461k(long j10) {
        this.f20338a = j10;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C6461k m25615c(long j10) {
        return new C6461k(j10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25617e(long j10, Object obj) {
        return (obj instanceof C6461k) && j10 == ((C6461k) obj).m25625m();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m25618f(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: g */
    public static final float m25619g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static final float m25620h(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    /* JADX INFO: renamed from: i */
    public static final float m25621i(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: j */
    public static int m25622j(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m25623k(long j10) {
        return (j10 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j10 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j10 & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: l */
    public static String m25624l(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC6452b.m25532a(Float.intBitsToFloat((int) (j10 >> 32)), 1) + ", " + AbstractC6452b.m25532a(Float.intBitsToFloat((int) (j10 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m25617e(this.f20338a, obj);
    }

    public int hashCode() {
        return m25622j(this.f20338a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long m25625m() {
        return this.f20338a;
    }

    public String toString() {
        return m25624l(this.f20338a);
    }

    /* JADX INFO: renamed from: r1.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m25626a() {
            return C6461k.f20337d;
        }

        /* JADX INFO: renamed from: b */
        public final long m25627b() {
            return C6461k.f20336c;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m25616d(long j10) {
        return j10;
    }
}
