package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f13 {
    public static final long b = fg1.i(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [af.g(java.lang.Object, java.lang.Object):java.lang.Object, b03.a(b03):ow1, b03.c(b03, k03, long, boolean, boolean, vm2, boolean, cs0):long, b03.g(rs1):void, e00.r(java.lang.Object):java.lang.Object, eq1.j(java.lang.Object):java.lang.Object, g03.a():java.lang.Object, gf1.a(k03, in0, uh1, m13, wb3, in0, ft2, boolean, int, int, xx0, k51, boolean, boolean, kw, px, int, int):void, k03.<init>(sd, long, f13):void, p40.O(yw2, er2, e9, h12, rj):java.lang.Object, sd0.h():f13, sz0.q(java.util.List):k03, t91.<init>(iz2, b62, bt2):void, t91.e(long):void, t91.f(long):void, zz2.b(long, vm2):void, zz2.e(long):void] */
    public /* synthetic */ f13(long j) {
        this.a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(long j, Object obj) {
        return (obj instanceof f13) && j == ((f13) obj).a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(long j) {
        return e(j) - f(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vi0.m(sb, (int) (j & 4294967295L), ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return h(this.a);
    }
}
