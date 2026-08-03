package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2746p extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8953c;

    /* JADX INFO: renamed from: d */
    public final float f8954d;

    /* JADX INFO: renamed from: e */
    public final float f8955e;

    /* JADX INFO: renamed from: f */
    public final float f8956f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2746p(float f3, float f10, float f11, float f12) {
        super(2);
        this.f8953c = f3;
        this.f8954d = f10;
        this.f8955e = f11;
        this.f8956f = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2746p)) {
            return false;
        }
        C2746p c2746p = (C2746p) obj;
        return Float.compare(this.f8953c, c2746p.f8953c) == 0 && Float.compare(this.f8954d, c2746p.f8954d) == 0 && Float.compare(this.f8955e, c2746p.f8955e) == 0 && Float.compare(this.f8956f, c2746p.f8956f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8956f) + AbstractC0921a.m2241d(this.f8955e, AbstractC0921a.m2241d(this.f8954d, Float.hashCode(this.f8953c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f8953c);
        sb2.append(", y1=");
        sb2.append(this.f8954d);
        sb2.append(", x2=");
        sb2.append(this.f8955e);
        sb2.append(", y2=");
        return AbstractC0921a.m2252o(sb2, this.f8956f, ')');
    }
}
