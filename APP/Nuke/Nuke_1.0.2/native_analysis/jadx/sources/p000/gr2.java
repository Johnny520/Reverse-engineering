package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 {

    /* JADX INFO: renamed from: a */
    public final long f3684a;

    public /* synthetic */ gr2(long j) {
        this.f3684a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2019a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m2020b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2021c(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static String m2022d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + t11.m5072X(Float.intBitsToFloat((int) (j >> 32))) + ", " + t11.m5072X(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gr2) {
            return this.f3684a == ((gr2) obj).f3684a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3684a);
    }

    public final String toString() {
        return m2022d(this.f3684a);
    }
}
