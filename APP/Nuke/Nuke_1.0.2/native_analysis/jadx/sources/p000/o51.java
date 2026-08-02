package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o51 {

    /* JADX INFO: renamed from: a */
    public final Float f7527a;

    /* JADX INFO: renamed from: b */
    public gd0 f7528b;

    public o51(Float f, gd0 gd0Var) {
        this.f7527a = f;
        this.f7528b = gd0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o51)) {
            return false;
        }
        o51 o51Var = (o51) obj;
        return o51Var.f7527a.equals(this.f7527a) && t11.m5086l(o51Var.f7528b, this.f7528b);
    }

    public final int hashCode() {
        return this.f7528b.hashCode() + vi0.m5685d(0, this.f7527a.hashCode() * 31, 31);
    }
}
