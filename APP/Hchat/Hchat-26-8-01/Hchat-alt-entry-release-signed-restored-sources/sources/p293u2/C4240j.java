package p293u2;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: u2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4240j {

    /* JADX INFO: renamed from: a */
    public final long f13912a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b0.t.invoke(java.lang.Object, java.lang.Object):java.lang.Object, ig.a.a(boolean, s0.d, sh.y, sh.g0, fg.a, fg.a, float, s0.d, i0.h0, int):void] */
    public /* synthetic */ C4240j(long j3) {
        this.f13912a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m8527a(int i9, int i10, long j3, int i11) {
        if ((i11 & 1) != 0) {
            i9 = (int) (j3 >> 32);
        }
        if ((i11 & 2) != 0) {
            i10 = (int) (j3 & 4294967295L);
        }
        return (((long) i10) & 4294967295L) | (((long) i9) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8528b(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m8529c(long j3, long j4) {
        return (((long) (((int) (j3 >> 32)) - ((int) (j4 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m8530d(long j3, long j4) {
        return (((long) (((int) (j3 >> 32)) + ((int) (j4 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m8531e(long j3) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j3 >> 32));
        sb2.append(", ");
        return AbstractC3199a.m6841n(sb2, (int) (j3 & 4294967295L), ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4240j) {
            return this.f13912a == ((C4240j) obj).f13912a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13912a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8531e(this.f13912a);
    }
}
