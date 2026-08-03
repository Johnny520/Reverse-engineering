package p305uh;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.C1034w;

/* JADX INFO: renamed from: uh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4355d {

    /* JADX INFO: renamed from: a */
    public final C4354c f14548a;

    /* JADX INFO: renamed from: b */
    public final long f14549b;

    /* JADX INFO: renamed from: c */
    public final float f14550c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4355d(C4354c c4354c, long j3, float f3) {
        this.f14548a = c4354c;
        this.f14549b = j3;
        this.f14550c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4355d)) {
            return false;
        }
        C4355d c4355d = (C4355d) obj;
        return AbstractC1416l.m3825a(this.f14548a, c4355d.f14548a) && C1034w.m2635c(this.f14549b, c4355d.f14549b) && Float.compare(this.f14550c, c4355d.f14550c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f14548a.hashCode() * 31;
        int i9 = C1034w.f3264h;
        return Float.hashCode(this.f14550c) + AbstractC0921a.m2243f(iHashCode, 31, this.f14549b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LightSource(position=" + this.f14548a + ", color=" + C1034w.m2641i(this.f14549b) + ", intensity=" + this.f14550c + ")";
    }

    public C4355d(C4354c c4354c, float f3) {
        this(c4354c, C1034w.f3259c, f3);
    }
}
