package p293u2;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: u2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4231a {

    /* JADX INFO: renamed from: a */
    public final long f13903a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [m.a.v(m.a, int):s.l0, x1.f0.k():void, y1.t.onMeasure(int, int):void] */
    public /* synthetic */ C4231a(long j3) {
        this.f13903a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m8497a(long j3, int i9, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i9 = m8506j(j3);
        }
        if ((i13 & 2) != 0) {
            i10 = m8504h(j3);
        }
        if ((i13 & 4) != 0) {
            i11 = m8505i(j3);
        }
        if ((i13 & 8) != 0) {
            i12 = m8503g(j3);
        }
        if (i10 < i9 || i12 < i11 || i9 < 0 || i11 < 0) {
            AbstractC4239i.m8525a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC4232b.m8515h(i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8498b(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m8499c(long j3) {
        int i9 = (int) (3 & j3);
        int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
        return (((int) (j3 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m8500d(long j3) {
        int i9 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << AbstractC3199a.m6834g((i9 & 2) >> 1, 3, (i9 & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m8501e(long j3) {
        int i9 = (int) (3 & j3);
        int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j3 >> (i10 + 15))) & i11;
        int i13 = ((int) (j3 >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m8502f(long j3) {
        int i9 = (int) (3 & j3);
        int iM6834g = (1 << AbstractC3199a.m6834g((i9 & 2) >> 1, 3, (i9 & 1) << 1, 13)) - 1;
        int i10 = ((int) (j3 >> 2)) & iM6834g;
        int i11 = ((int) (j3 >> 33)) & iM6834g;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m8503g(long j3) {
        int i9 = (int) (3 & j3);
        int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
        int i11 = ((int) (j3 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m8504h(long j3) {
        int i9 = (int) (3 & j3);
        int i10 = (int) (j3 >> 33);
        int iM6834g = i10 & ((1 << AbstractC3199a.m6834g((i9 & 2) >> 1, 3, (i9 & 1) << 1, 13)) - 1);
        if (iM6834g == 0) {
            return Integer.MAX_VALUE;
        }
        return iM6834g - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final int m8505i(long j3) {
        int i9 = (int) (3 & j3);
        int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
        return ((int) (j3 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final int m8506j(long j3) {
        int i9 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << AbstractC3199a.m6834g((i9 & 2) >> 1, 3, (i9 & 1) << 1, 13)) - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m8507k(long j3) {
        int iM8504h = m8504h(j3);
        String strValueOf = iM8504h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM8504h);
        int iM8503g = m8503g(j3);
        String strValueOf2 = iM8503g != Integer.MAX_VALUE ? String.valueOf(iM8503g) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m8506j(j3));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(m8505i(j3));
        sb2.append(", maxHeight = ");
        return AbstractC0921a.m2254q(sb2, strValueOf2, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4231a) {
            return this.f13903a == ((C4231a) obj).f13903a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13903a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8507k(this.f13903a);
    }
}
