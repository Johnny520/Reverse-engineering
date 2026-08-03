package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2745o extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8949c;

    /* JADX INFO: renamed from: d */
    public final float f8950d;

    /* JADX INFO: renamed from: e */
    public final float f8951e;

    /* JADX INFO: renamed from: f */
    public final float f8952f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2745o(float f3, float f10, float f11, float f12) {
        super(1);
        this.f8949c = f3;
        this.f8950d = f10;
        this.f8951e = f11;
        this.f8952f = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2745o)) {
            return false;
        }
        C2745o c2745o = (C2745o) obj;
        return Float.compare(this.f8949c, c2745o.f8949c) == 0 && Float.compare(this.f8950d, c2745o.f8950d) == 0 && Float.compare(this.f8951e, c2745o.f8951e) == 0 && Float.compare(this.f8952f, c2745o.f8952f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8952f) + AbstractC0921a.m2241d(this.f8951e, AbstractC0921a.m2241d(this.f8950d, Float.hashCode(this.f8949c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f8949c);
        sb2.append(", y1=");
        sb2.append(this.f8950d);
        sb2.append(", x2=");
        sb2.append(this.f8951e);
        sb2.append(", y2=");
        return AbstractC0921a.m2252o(sb2, this.f8952f, ')');
    }
}
