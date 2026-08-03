package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2740k extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8924c;

    /* JADX INFO: renamed from: d */
    public final float f8925d;

    /* JADX INFO: renamed from: e */
    public final float f8926e;

    /* JADX INFO: renamed from: f */
    public final float f8927f;

    /* JADX INFO: renamed from: g */
    public final float f8928g;

    /* JADX INFO: renamed from: h */
    public final float f8929h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2740k(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f8924c = f3;
        this.f8925d = f10;
        this.f8926e = f11;
        this.f8927f = f12;
        this.f8928g = f13;
        this.f8929h = f14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2740k)) {
            return false;
        }
        C2740k c2740k = (C2740k) obj;
        return Float.compare(this.f8924c, c2740k.f8924c) == 0 && Float.compare(this.f8925d, c2740k.f8925d) == 0 && Float.compare(this.f8926e, c2740k.f8926e) == 0 && Float.compare(this.f8927f, c2740k.f8927f) == 0 && Float.compare(this.f8928g, c2740k.f8928g) == 0 && Float.compare(this.f8929h, c2740k.f8929h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8929h) + AbstractC0921a.m2241d(this.f8928g, AbstractC0921a.m2241d(this.f8927f, AbstractC0921a.m2241d(this.f8926e, AbstractC0921a.m2241d(this.f8925d, Float.hashCode(this.f8924c) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f8924c);
        sb2.append(", y1=");
        sb2.append(this.f8925d);
        sb2.append(", x2=");
        sb2.append(this.f8926e);
        sb2.append(", y2=");
        sb2.append(this.f8927f);
        sb2.append(", x3=");
        sb2.append(this.f8928g);
        sb2.append(", y3=");
        return AbstractC0921a.m2252o(sb2, this.f8929h, ')');
    }
}
