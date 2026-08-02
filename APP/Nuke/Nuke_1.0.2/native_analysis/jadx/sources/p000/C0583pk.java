package p000;

/* JADX INFO: renamed from: pk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0583pk {

    /* JADX INFO: renamed from: a */
    public final float f8378a;

    public C0583pk(float f) {
        this.f8378a = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m3868a(int i, int i2, d61 d61Var) {
        float f = (i2 - i) / 2.0f;
        d61 d61Var2 = d61.f1885h;
        float f2 = this.f8378a;
        if (d61Var != d61Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0583pk) && Float.compare(this.f8378a, ((C0583pk) obj).f8378a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8378a);
    }

    public final String toString() {
        return vi0.m5693l(new StringBuilder("Horizontal(bias="), this.f8378a, ')');
    }
}
