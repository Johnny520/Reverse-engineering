package p356y0;

import p068eh.AbstractC0921a;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: y0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5843e {

    /* JADX INFO: renamed from: a */
    public final float f23778a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5843e(float f3) {
        this.f23778a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m10545a(int i9, int i10, EnumC4243m enumC4243m) {
        float f3 = (i10 - i9) / 2.0f;
        EnumC4243m enumC4243m2 = EnumC4243m.f13919g;
        float f10 = this.f23778a;
        if (enumC4243m != enumC4243m2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5843e) && Float.compare(this.f23778a, ((C5843e) obj).f23778a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f23778a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2252o(new StringBuilder("Horizontal(bias="), this.f23778a, ')');
    }
}
