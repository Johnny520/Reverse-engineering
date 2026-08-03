package sh;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.C1032u0;
import p136j8.AbstractC2091b;
import p293u2.C4241k;

/* JADX INFO: renamed from: sh.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3999d0 {

    /* JADX INFO: renamed from: a */
    public final C4241k f13087a;

    /* JADX INFO: renamed from: b */
    public final C4241k f13088b;

    /* JADX INFO: renamed from: c */
    public final long f13089c;

    /* JADX INFO: renamed from: d */
    public final long f13090d;

    /* JADX INFO: renamed from: e */
    public final C4007f0 f13091e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3999d0(C4241k c4241k, C4241k c4241k2, long j3, long j4, C4007f0 c4007f0) {
        c4241k.getClass();
        c4241k2.getClass();
        c4007f0.getClass();
        this.f13087a = c4241k;
        this.f13088b = c4241k2;
        this.f13089c = j3;
        this.f13090d = j4;
        this.f13091e = c4007f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3999d0)) {
            return false;
        }
        C3999d0 c3999d0 = (C3999d0) obj;
        return AbstractC1416l.m3825a(this.f13087a, c3999d0.f13087a) && AbstractC1416l.m3825a(this.f13088b, c3999d0.f13088b) && C1032u0.m2631a(this.f13089c, c3999d0.f13089c) && C1032u0.m2631a(this.f13090d, c3999d0.f13090d) && AbstractC1416l.m3825a(this.f13091e, c3999d0.f13091e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f13088b.hashCode() + (this.f13087a.hashCode() * 31)) * 31;
        int i9 = C1032u0.f3255c;
        return this.f13091e.hashCode() + AbstractC0921a.m2243f(AbstractC0921a.m2243f(iHashCode, 31, this.f13089c), 31, this.f13090d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM2632b = C1032u0.m2632b(this.f13089c);
        String strM2632b2 = C1032u0.m2632b(this.f13090d);
        StringBuilder sb2 = new StringBuilder("ListPopupLayoutInfo(windowBounds=");
        sb2.append(this.f13087a);
        sb2.append(", popupMargin=");
        sb2.append(this.f13088b);
        sb2.append(", effectiveTransformOrigin=");
        AbstractC2091b.m5173t(sb2, strM2632b, ", localTransformOrigin=", strM2632b2, ", popupLayoutPosition=");
        sb2.append(this.f13091e);
        sb2.append(")");
        return sb2.toString();
    }
}
