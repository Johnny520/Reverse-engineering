package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f13 {

    /* JADX INFO: renamed from: b */
    public static final long f2737b = fg1.m1636i(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f2738c = 0;

    /* JADX INFO: renamed from: a */
    public final long f2739a;

    public /* synthetic */ f13(long j) {
        this.f2739a = j;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1492a(long j, Object obj) {
        return (obj instanceof f13) && j == ((f13) obj).f2739a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1493b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1494c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final int m1495d(long j) {
        return m1496e(j) - m1497f(j);
    }

    /* JADX INFO: renamed from: e */
    public static final int m1496e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final int m1497f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m1498g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m1499h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vi0.m5694m(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return m1492a(this.f2739a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2739a);
    }

    public final String toString() {
        return m1499h(this.f2739a);
    }
}
