package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2749s extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8966c;

    /* JADX INFO: renamed from: d */
    public final float f8967d;

    /* JADX INFO: renamed from: e */
    public final float f8968e;

    /* JADX INFO: renamed from: f */
    public final float f8969f;

    /* JADX INFO: renamed from: g */
    public final float f8970g;

    /* JADX INFO: renamed from: h */
    public final float f8971h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2749s(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f8966c = f3;
        this.f8967d = f10;
        this.f8968e = f11;
        this.f8969f = f12;
        this.f8970g = f13;
        this.f8971h = f14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2749s)) {
            return false;
        }
        C2749s c2749s = (C2749s) obj;
        return Float.compare(this.f8966c, c2749s.f8966c) == 0 && Float.compare(this.f8967d, c2749s.f8967d) == 0 && Float.compare(this.f8968e, c2749s.f8968e) == 0 && Float.compare(this.f8969f, c2749s.f8969f) == 0 && Float.compare(this.f8970g, c2749s.f8970g) == 0 && Float.compare(this.f8971h, c2749s.f8971h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8971h) + AbstractC0921a.m2241d(this.f8970g, AbstractC0921a.m2241d(this.f8969f, AbstractC0921a.m2241d(this.f8968e, AbstractC0921a.m2241d(this.f8967d, Float.hashCode(this.f8966c) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f8966c);
        sb2.append(", dy1=");
        sb2.append(this.f8967d);
        sb2.append(", dx2=");
        sb2.append(this.f8968e);
        sb2.append(", dy2=");
        sb2.append(this.f8969f);
        sb2.append(", dx3=");
        sb2.append(this.f8970g);
        sb2.append(", dy3=");
        return AbstractC0921a.m2252o(sb2, this.f8971h, ')');
    }
}
