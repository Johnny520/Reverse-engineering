package p099h;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1440a {

    /* JADX INFO: renamed from: a */
    public final float f4784a;

    /* JADX INFO: renamed from: b */
    public final float f4785b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1440a(float f3, float f10) {
        this.f4784a = f3;
        this.f4785b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440a)) {
            return false;
        }
        C1440a c1440a = (C1440a) obj;
        return Float.compare(this.f4784a, c1440a.f4784a) == 0 && Float.compare(this.f4785b, c1440a.f4785b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f4785b) + (Float.hashCode(this.f4784a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f4784a);
        sb2.append(", velocityCoefficient=");
        return AbstractC0921a.m2252o(sb2, this.f4785b, ')');
    }
}
