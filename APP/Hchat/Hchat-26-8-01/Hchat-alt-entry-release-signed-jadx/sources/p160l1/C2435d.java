package p160l1;

import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p259r9.AbstractC3754e0;
import p293u2.C4236f;
import p293u2.C4237g;

/* JADX INFO: renamed from: l1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2435d {

    /* JADX INFO: renamed from: a */
    public final float f8016a;

    /* JADX INFO: renamed from: b */
    public final float f8017b;

    /* JADX INFO: renamed from: c */
    public final int f8018c;

    /* JADX INFO: renamed from: d */
    public final long f8019d;

    /* JADX INFO: renamed from: e */
    public final float f8020e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2435d(float f3, float f10, long j3, float f11, int i9) {
        this.f8016a = f3;
        this.f8017b = f10;
        this.f8018c = i9;
        this.f8019d = j3;
        this.f8020e = AbstractC3754e0.m7907q(f11, 0.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2435d)) {
            return false;
        }
        C2435d c2435d = (C2435d) obj;
        return C4236f.m8520b(this.f8016a, c2435d.f8016a) && C4236f.m8520b(this.f8017b, c2435d.f8017b) && this.f8020e == c2435d.f8020e && this.f8018c == c2435d.f8018c && C1034w.m2635c(this.f8019d, c2435d.f8019d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f8018c, AbstractC0921a.m2241d(this.f8020e, AbstractC0921a.m2243f(AbstractC0921a.m2241d(this.f8017b, Float.hashCode(this.f8016a) * 31, 31), 31, 0L), 31), 31);
        int i9 = C1034w.f3264h;
        return AbstractC0921a.m2243f(iM2242e, 31, this.f8019d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Shadow(radius=" + ((Object) C4236f.m8521c(this.f8016a)) + ", spread=" + ((Object) C4236f.m8521c(this.f8017b)) + ", offset=" + ((Object) C4237g.m8522a(0L)) + ", alpha=" + this.f8020e + ", blendMode=" + ((Object) AbstractC0996c0.m2503A(this.f8018c)) + ", color=" + ((Object) C1034w.m2641i(this.f8019d)) + ", brush=null)";
    }

    public C2435d(float f3, float f10, long j3) {
        this(f3, 0, j3 == 16 ? C1034w.f3258b : j3, f10, 3);
    }
}
