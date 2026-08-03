package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2743m extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8945c;

    /* JADX INFO: renamed from: d */
    public final float f8946d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2743m(float f3, float f10) {
        super(3);
        this.f8945c = f3;
        this.f8946d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2743m)) {
            return false;
        }
        C2743m c2743m = (C2743m) obj;
        return Float.compare(this.f8945c, c2743m.f8945c) == 0 && Float.compare(this.f8946d, c2743m.f8946d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8946d) + (Float.hashCode(this.f8945c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f8945c);
        sb2.append(", y=");
        return AbstractC0921a.m2252o(sb2, this.f8946d, ')');
    }
}
