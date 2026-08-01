package p000;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0202fa {

    /* JADX INFO: renamed from: a */
    public final float f1639a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0202fa(float f) {
        this.f1639a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1072a(int i, int i2, k50 k50Var) {
        float f = (i2 - i) / 2.0f;
        k50 k50Var2 = k50.f3015d;
        float f2 = this.f1639a;
        if (k50Var != k50Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0202fa) && Float.compare(this.f1639a, ((C0202fa) obj).f1639a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f1639a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0748t1.m4155m(new StringBuilder("Horizontal(bias="), this.f1639a, ')');
    }
}
