package p119i2;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: i2.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939m0 {

    /* JADX INFO: renamed from: b */
    public static final long f6573b = AbstractC1923e0.m4784b(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f6574c = 0;

    /* JADX INFO: renamed from: a */
    public final long f6575a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.a.B0(s1.k0, h0.q0, ac.k, s1.k, yf.a):java.lang.Object, b.e.l(java.util.List):n2.s, i2.q.invoke(java.lang.Object):java.lang.Object, n2.s.<init>(i2.g, long, i2.m0):void] */
    public /* synthetic */ C1939m0(long j3) {
        this.f6575a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m4811a(Object obj, long j3) {
        return (obj instanceof C1939m0) && j3 == ((C1939m0) obj).f6575a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m4812b(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m4813c(long j3) {
        return ((int) (j3 >> 32)) == ((int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m4814d(long j3) {
        return m4815e(j3) - m4816f(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m4815e(long j3) {
        return Math.max((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m4816f(long j3) {
        return Math.min((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m4817g(long j3) {
        return ((int) (j3 >> 32)) > ((int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m4818h(long j3) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j3 >> 32));
        sb2.append(", ");
        return AbstractC3199a.m6841n(sb2, (int) (j3 & 4294967295L), ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return m4811a(obj, this.f6575a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f6575a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m4818h(this.f6575a);
    }
}
