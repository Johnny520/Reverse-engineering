package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2748r extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8959c;

    /* JADX INFO: renamed from: d */
    public final float f8960d;

    /* JADX INFO: renamed from: e */
    public final float f8961e;

    /* JADX INFO: renamed from: f */
    public final boolean f8962f;

    /* JADX INFO: renamed from: g */
    public final boolean f8963g;

    /* JADX INFO: renamed from: h */
    public final float f8964h;

    /* JADX INFO: renamed from: i */
    public final float f8965i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2748r(float f3, float f10, float f11, boolean z9, boolean z10, float f12, float f13) {
        super(3);
        this.f8959c = f3;
        this.f8960d = f10;
        this.f8961e = f11;
        this.f8962f = z9;
        this.f8963g = z10;
        this.f8964h = f12;
        this.f8965i = f13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2748r)) {
            return false;
        }
        C2748r c2748r = (C2748r) obj;
        return Float.compare(this.f8959c, c2748r.f8959c) == 0 && Float.compare(this.f8960d, c2748r.f8960d) == 0 && Float.compare(this.f8961e, c2748r.f8961e) == 0 && this.f8962f == c2748r.f8962f && this.f8963g == c2748r.f8963g && Float.compare(this.f8964h, c2748r.f8964h) == 0 && Float.compare(this.f8965i, c2748r.f8965i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8965i) + AbstractC0921a.m2241d(this.f8964h, AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2241d(this.f8961e, AbstractC0921a.m2241d(this.f8960d, Float.hashCode(this.f8959c) * 31, 31), 31), 31, this.f8962f), 31, this.f8963g), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f8959c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f8960d);
        sb2.append(", theta=");
        sb2.append(this.f8961e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f8962f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f8963g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f8964h);
        sb2.append(", arcStartDy=");
        return AbstractC0921a.m2252o(sb2, this.f8965i, ')');
    }
}
