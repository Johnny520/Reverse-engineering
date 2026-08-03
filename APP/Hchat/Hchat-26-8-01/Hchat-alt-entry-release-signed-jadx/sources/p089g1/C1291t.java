package p089g1;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: g1.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1291t {

    /* JADX INFO: renamed from: a */
    public final float f4309a;

    /* JADX INFO: renamed from: b */
    public final float f4310b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1291t(float f3, float f10) {
        this.f4309a = f3;
        this.f4310b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float[] m3430a() {
        float f3 = this.f4309a;
        float f10 = this.f4310b;
        return new float[]{f3 / f10, 1.0f, ((1.0f - f3) - f10) / f10};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1291t)) {
            return false;
        }
        C1291t c1291t = (C1291t) obj;
        return Float.compare(this.f4309a, c1291t.f4309a) == 0 && Float.compare(this.f4310b, c1291t.f4310b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4310b) + (Float.hashCode(this.f4309a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f4309a);
        sb2.append(", y=");
        return AbstractC0921a.m2252o(sb2, this.f4310b, ')');
    }
}
