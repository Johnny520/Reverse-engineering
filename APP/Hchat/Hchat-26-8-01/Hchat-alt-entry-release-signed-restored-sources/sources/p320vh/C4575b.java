package p320vh;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: vh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4575b {

    /* JADX INFO: renamed from: a */
    public final int f15067a;

    /* JADX INFO: renamed from: b */
    public final int f15068b;

    /* JADX INFO: renamed from: c */
    public final float f15069c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4575b(float f3, int i9, int i10) {
        this.f15067a = i9;
        this.f15068b = i10;
        this.f15069c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4575b)) {
            return false;
        }
        C4575b c4575b = (C4575b) obj;
        return this.f15067a == c4575b.f15067a && this.f15068b == c4575b.f15068b && Float.compare(this.f15069c, c4575b.f15069c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15069c) + AbstractC0921a.m2242e(this.f15068b, Integer.hashCode(this.f15067a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2256s = AbstractC0921a.m2256s(this.f15067a, this.f15068b, "DownScaleBlend(expLo=", ", expHi=", ", blend=");
        sbM2256s.append(this.f15069c);
        sbM2256s.append(")");
        return sbM2256s.toString();
    }
}
