package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j23 extends e30 {

    /* JADX INFO: renamed from: m */
    public final d63 f4884m;

    public j23(za2 za2Var, kt2 kt2Var, s72 s72Var, d63 d63Var, AbstractC0147dz abstractC0147dz) {
        super(za2Var, kt2Var, null, s72Var, abstractC0147dz);
        int i = za2Var.f13815e;
        if (i != 6) {
            C0676s.m4651j(vi0.m5688g("opcode with invalid branchingness: ", i));
            throw null;
        }
        if (d63Var != null) {
            this.f4884m = d63Var;
        } else {
            um2.m5516f("catches == null");
            throw null;
        }
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: d */
    public final void mo2239d(h01 h01Var) {
        h01Var.mo176c(this);
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: e */
    public final d63 mo2240e() {
        return this.f4884m;
    }

    @Override // p000.e30, p000.i01
    /* JADX INFO: renamed from: f */
    public final String mo1217f() {
        AbstractC0147dz abstractC0147dz = this.f2301l;
        String strMo23b = abstractC0147dz.mo23b();
        if (abstractC0147dz instanceof q30) {
            strMo23b = ((q30) abstractC0147dz).m4048g();
        }
        return strMo23b + " " + k23.m2600g(this.f4884m);
    }
}
