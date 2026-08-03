package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2754x extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8981c;

    /* JADX INFO: renamed from: d */
    public final float f8982d;

    /* JADX INFO: renamed from: e */
    public final float f8983e;

    /* JADX INFO: renamed from: f */
    public final float f8984f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2754x(float f3, float f10, float f11, float f12) {
        super(2);
        this.f8981c = f3;
        this.f8982d = f10;
        this.f8983e = f11;
        this.f8984f = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2754x)) {
            return false;
        }
        C2754x c2754x = (C2754x) obj;
        return Float.compare(this.f8981c, c2754x.f8981c) == 0 && Float.compare(this.f8982d, c2754x.f8982d) == 0 && Float.compare(this.f8983e, c2754x.f8983e) == 0 && Float.compare(this.f8984f, c2754x.f8984f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8984f) + AbstractC0921a.m2241d(this.f8983e, AbstractC0921a.m2241d(this.f8982d, Float.hashCode(this.f8981c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f8981c);
        sb2.append(", dy1=");
        sb2.append(this.f8982d);
        sb2.append(", dx2=");
        sb2.append(this.f8983e);
        sb2.append(", dy2=");
        return AbstractC0921a.m2252o(sb2, this.f8984f, ')');
    }
}
