package p250r1;

/* JADX INFO: renamed from: r1.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6460j {
    /* JADX INFO: renamed from: a */
    public static final C6459i m25608a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jM25527b = AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
        return new C6459i(f10, f11, f12, f13, jM25527b, jM25527b, jM25527b, jM25527b, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C6459i m25609b(C6457g c6457g, long j10, long j11, long j12, long j13) {
        return new C6459i(c6457g.m25583l(), c6457g.m25586o(), c6457g.m25584m(), c6457g.m25580i(), j10, j11, j12, j13, null);
    }

    /* JADX INFO: renamed from: c */
    public static final C6459i m25610c(float f10, float f11, float f12, float f13, long j10) {
        return m25608a(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: d */
    public static final C6457g m25611d(C6459i c6459i) {
        return new C6457g(c6459i.m25602e(), c6459i.m25604g(), c6459i.m25603f(), c6459i.m25598a());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m25612e(C6459i c6459i) {
        long jM25605h = c6459i.m25605h();
        return (jM25605h >>> 32) == (jM25605h & 4294967295L) && c6459i.m25605h() == c6459i.m25606i() && c6459i.m25605h() == c6459i.m25600c() && c6459i.m25605h() == c6459i.m25599b();
    }
}
