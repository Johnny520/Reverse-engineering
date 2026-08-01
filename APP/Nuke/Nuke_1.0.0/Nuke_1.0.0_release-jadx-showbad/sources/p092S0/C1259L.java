package p092S0;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: S0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1259L {

    /* JADX INFO: renamed from: b */
    public static final long f4536b = AbstractC1251D.m2313b(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f4537c = 0;

    /* JADX INFO: renamed from: a */
    public final long f4538a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.T0.t(java.util.List):X0.u, Q.c.h(java.lang.Object):java.lang.Object, X0.h.c():S0.L, X0.u.<init>(S0.g, long, S0.L):void, com.bumptech.glide.h.x(B0.S, e2.h, I2.k, B0.n, Q2.a):java.lang.Object] */
    public /* synthetic */ C1259L(long j5) {
        this.f4538a = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m2333a(long j5, Object obj) {
        return (obj instanceof C1259L) && j5 == ((C1259L) obj).f4538a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m2334b(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m2335c(long j5) {
        return ((int) (j5 >> 32)) == ((int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m2336d(long j5) {
        return m2337e(j5) - m2338f(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m2337e(long j5) {
        return Math.max((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m2338f(long j5) {
        return Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m2339g(long j5) {
        return ((int) (j5 >> 32)) > ((int) (j5 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m2340h(long j5) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j5 >> 32));
        sb.append(", ");
        return AbstractC3202a.m5466a(sb, (int) (j5 & 4294967295L), ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return m2333a(this.f4538a, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4538a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2340h(this.f4538a);
    }
}
