package p169h0;

import p011B4.AbstractC0231b;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2197f {

    /* JADX INFO: renamed from: a */
    public final float f7176a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2197f(float f2) {
        this.f7176a = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m4018a(int i5, int i6, EnumC2017m enumC2017m) {
        float f2 = (i6 - i5) / 2.0f;
        EnumC2017m enumC2017m2 = EnumC2017m.f6742d;
        float f5 = this.f7176a;
        if (enumC2017m != enumC2017m2) {
            f5 *= -1;
        }
        return Math.round((1 + f5) * f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2197f) && Float.compare(this.f7176a, ((C2197f) obj).f7176a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7176a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("Horizontal(bias="), this.f7176a, ')');
    }
}
