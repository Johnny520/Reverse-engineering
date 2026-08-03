package p144k;

import gg.AbstractC1416l;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p222p.AbstractC3208d;
import p222p.C3272z0;

/* JADX INFO: renamed from: k.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2179i1 {

    /* JADX INFO: renamed from: a */
    public final long f7253a;

    /* JADX INFO: renamed from: b */
    public final C3272z0 f7254b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2179i1() {
        long jM2508d = AbstractC0996c0.m2508d(4284900966L);
        C3272z0 c3272z0M6871a = AbstractC3208d.m6871a(3, 0.0f);
        this.f7253a = jM2508d;
        this.f7254b = c3272z0M6871a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2179i1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C2179i1 c2179i1 = (C2179i1) obj;
        return C1034w.m2635c(this.f7253a, c2179i1.f7253a) && AbstractC1416l.m3825a(this.f7254b, c2179i1.f7254b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return this.f7254b.hashCode() + (Long.hashCode(this.f7253a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C1034w.m2641i(this.f7253a)) + ", drawPadding=" + this.f7254b + ')';
    }
}
