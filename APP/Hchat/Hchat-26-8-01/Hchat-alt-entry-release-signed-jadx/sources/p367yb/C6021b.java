package p367yb;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p293u2.C4236f;
import p293u2.C4237g;

/* JADX INFO: renamed from: yb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6021b {

    /* JADX INFO: renamed from: a */
    public final float f24456a;

    /* JADX INFO: renamed from: b */
    public final long f24457b;

    /* JADX INFO: renamed from: c */
    public final long f24458c;

    /* JADX INFO: renamed from: d */
    public final float f24459d;

    /* JADX INFO: renamed from: e */
    public final int f24460e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C6021b(0.0f, 0.0f, 31, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6021b(float f3, float f10, int i9, long j3) {
        f3 = (i9 & 1) != 0 ? 24 : f3;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        j3 = (i9 & 4) != 0 ? C1034w.m2634b(C1034w.f3258b, 0.15f) : j3;
        f10 = (i9 & 8) != 0 ? 1.0f : f10;
        this.f24456a = f3;
        this.f24457b = jFloatToRawIntBits;
        this.f24458c = j3;
        this.f24459d = f10;
        this.f24460e = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6021b) {
            C6021b c6021b = (C6021b) obj;
            if (C4236f.m8520b(this.f24456a, c6021b.f24456a) && this.f24457b == c6021b.f24457b && C1034w.m2635c(this.f24458c, c6021b.f24458c) && Float.compare(this.f24459d, c6021b.f24459d) == 0 && this.f24460e == c6021b.f24460e) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2243f = AbstractC0921a.m2243f(Float.hashCode(this.f24456a) * 31, 31, this.f24457b);
        int i9 = C1034w.f3264h;
        return Integer.hashCode(this.f24460e) + AbstractC0921a.m2241d(this.f24459d, AbstractC0921a.m2243f(iM2243f, 31, this.f24458c), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM8521c = C4236f.m8521c(this.f24456a);
        String strM8522a = C4237g.m8522a(this.f24457b);
        String strM2641i = C1034w.m2641i(this.f24458c);
        String strM2503A = AbstractC0996c0.m2503A(this.f24460e);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("InnerShadow(radius=", strM8521c, ", offset=", strM8522a, ", color=");
        sbM1027p.append(strM2641i);
        sbM1027p.append(", alpha=");
        sbM1027p.append(this.f24459d);
        sbM1027p.append(", blendMode=");
        return AbstractC0921a.m2255r(sbM1027p, strM2503A, ")");
    }
}
