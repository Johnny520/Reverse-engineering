package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f3337a;

    /* JADX INFO: renamed from: b */
    public final boolean f3338b;

    public g71(float f, boolean z) {
        this.f3337a = f;
        this.f3338b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g71 g71Var = obj instanceof g71 ? (g71) obj : null;
        return g71Var != null && this.f3337a == g71Var.f3337a && this.f3338b == g71Var.f3338b;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        h71 h71Var = new h71();
        h71Var.f3882v = this.f3337a;
        h71Var.f3883w = this.f3338b;
        return h71Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        h71 h71Var = (h71) th1Var;
        h71Var.f3882v = this.f3337a;
        h71Var.f3883w = this.f3338b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3338b) + (Float.hashCode(this.f3337a) * 31);
    }
}
