package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2736i extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8910c;

    /* JADX INFO: renamed from: d */
    public final float f8911d;

    /* JADX INFO: renamed from: e */
    public final float f8912e;

    /* JADX INFO: renamed from: f */
    public final boolean f8913f;

    /* JADX INFO: renamed from: g */
    public final boolean f8914g;

    /* JADX INFO: renamed from: h */
    public final float f8915h;

    /* JADX INFO: renamed from: i */
    public final float f8916i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2736i(float f3, float f10, float f11, boolean z9, boolean z10, float f12, float f13) {
        super(3);
        this.f8910c = f3;
        this.f8911d = f10;
        this.f8912e = f11;
        this.f8913f = z9;
        this.f8914g = z10;
        this.f8915h = f12;
        this.f8916i = f13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2736i)) {
            return false;
        }
        C2736i c2736i = (C2736i) obj;
        return Float.compare(this.f8910c, c2736i.f8910c) == 0 && Float.compare(this.f8911d, c2736i.f8911d) == 0 && Float.compare(this.f8912e, c2736i.f8912e) == 0 && this.f8913f == c2736i.f8913f && this.f8914g == c2736i.f8914g && Float.compare(this.f8915h, c2736i.f8915h) == 0 && Float.compare(this.f8916i, c2736i.f8916i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8916i) + AbstractC0921a.m2241d(this.f8915h, AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2241d(this.f8912e, AbstractC0921a.m2241d(this.f8911d, Float.hashCode(this.f8910c) * 31, 31), 31), 31, this.f8913f), 31, this.f8914g), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f8910c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f8911d);
        sb2.append(", theta=");
        sb2.append(this.f8912e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f8913f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f8914g);
        sb2.append(", arcStartX=");
        sb2.append(this.f8915h);
        sb2.append(", arcStartY=");
        return AbstractC0921a.m2252o(sb2, this.f8916i, ')');
    }
}
