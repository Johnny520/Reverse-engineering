package p176m1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: m1.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2751u extends AbstractC2723b0 {

    /* JADX INFO: renamed from: c */
    public final float f8973c;

    /* JADX INFO: renamed from: d */
    public final float f8974d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2751u(float f3, float f10) {
        super(3);
        this.f8973c = f3;
        this.f8974d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2751u)) {
            return false;
        }
        C2751u c2751u = (C2751u) obj;
        return Float.compare(this.f8973c, c2751u.f8973c) == 0 && Float.compare(this.f8974d, c2751u.f8974d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8974d) + (Float.hashCode(this.f8973c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f8973c);
        sb2.append(", dy=");
        return AbstractC0921a.m2252o(sb2, this.f8974d, ')');
    }
}
