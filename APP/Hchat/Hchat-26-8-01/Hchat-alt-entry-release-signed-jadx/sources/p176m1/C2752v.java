package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2752v extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8975c;

    /* JADX INFO: renamed from: d */
    public final float f8976d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2752v(float f3, float f10) {
        super(3);
        this.f8975c = f3;
        this.f8976d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752v)) {
            return false;
        }
        C2752v c2752v = (C2752v) obj;
        return Float.compare(this.f8975c, c2752v.f8975c) == 0 && Float.compare(this.f8976d, c2752v.f8976d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8976d) + (Float.hashCode(this.f8975c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f8975c);
        sb2.append(", dy=");
        return AbstractC0921a.m2252o(sb2, this.f8976d, ')');
    }
}
