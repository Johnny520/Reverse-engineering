package p293u2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4234d implements InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public final float f13904g;

    /* JADX INFO: renamed from: h */
    public final float f13905h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4234d(float f3, float f10) {
        this.f13904g = f3;
        this.f13905h = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f13904g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4234d)) {
            return false;
        }
        C4234d c4234d = (C4234d) obj;
        return Float.compare(this.f13904g, c4234d.f13904g) == 0 && Float.compare(this.f13905h, c4234d.f13905h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13905h) + (Float.hashCode(this.f13904g) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f13905h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f13904g);
        sb2.append(", fontScale=");
        return AbstractC0921a.m2252o(sb2, this.f13905h, ')');
    }
}
