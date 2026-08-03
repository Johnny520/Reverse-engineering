package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2755y extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8985c;

    /* JADX INFO: renamed from: d */
    public final float f8986d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2755y(float f3, float f10) {
        super(1);
        this.f8985c = f3;
        this.f8986d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2755y)) {
            return false;
        }
        C2755y c2755y = (C2755y) obj;
        return Float.compare(this.f8985c, c2755y.f8985c) == 0 && Float.compare(this.f8986d, c2755y.f8986d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8986d) + (Float.hashCode(this.f8985c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f8985c);
        sb2.append(", dy=");
        return AbstractC0921a.m2252o(sb2, this.f8986d, ')');
    }
}
