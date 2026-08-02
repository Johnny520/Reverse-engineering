package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w72 extends qp0 {

    /* JADX INFO: renamed from: t */
    public final qp0 f12384t;

    /* JADX INFO: renamed from: u */
    public final int f12385u;

    public w72(qp0 qp0Var, int i) {
        this.f12384t = qp0Var;
        this.f12385u = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w72)) {
            return false;
        }
        w72 w72Var = (w72) obj;
        return w72Var.f12384t.equals(this.f12384t) && w72Var.f12385u == this.f12385u;
    }

    public final int hashCode() {
        return this.f12384t.hashCode() + (this.f12385u * 31);
    }
}
