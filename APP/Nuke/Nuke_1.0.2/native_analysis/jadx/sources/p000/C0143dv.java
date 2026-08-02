package p000;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0143dv implements uh1 {

    /* JADX INFO: renamed from: a */
    public final uh1 f2231a;

    /* JADX INFO: renamed from: b */
    public final uh1 f2232b;

    public C0143dv(uh1 uh1Var, uh1 uh1Var2) {
        this.f2231a = uh1Var;
        this.f2232b = uh1Var2;
    }

    @Override // p000.uh1
    /* JADX INFO: renamed from: a */
    public final Object mo1172a(mn0 mn0Var, Object obj) {
        return this.f2232b.mo1172a(mn0Var, this.f2231a.mo1172a(mn0Var, obj));
    }

    @Override // p000.uh1
    /* JADX INFO: renamed from: b */
    public final boolean mo1173b(in0 in0Var) {
        return this.f2231a.mo1173b(in0Var) && this.f2232b.mo1173b(in0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0143dv)) {
            return false;
        }
        C0143dv c0143dv = (C0143dv) obj;
        return this.f2231a.equals(c0143dv.f2231a) && t11.m5086l(this.f2232b, c0143dv.f2232b);
    }

    public final int hashCode() {
        return (this.f2232b.hashCode() * 31) + this.f2231a.hashCode();
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("["), (String) mo1172a(C0419lc.f6051r, ""), ']');
    }
}
