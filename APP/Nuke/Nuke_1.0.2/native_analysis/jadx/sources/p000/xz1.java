package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends i01 {
    public xz1(za2 za2Var, kt2 kt2Var, r72 r72Var, s72 s72Var) {
        super(za2Var, kt2Var, r72Var, s72Var);
        int i = za2Var.f13815e;
        if (i == 5 || i == 6) {
            C0676s.m4651j(vi0.m5688g("opcode with invalid branchingness: ", i));
            throw null;
        }
        if (r72Var == null || i == 1) {
            return;
        }
        C0676s.m4651j("can't mix branchingness with result");
        throw null;
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: d */
    public final void mo2239d(h01 h01Var) {
        h01Var.mo177d(this);
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: e */
    public final d63 mo2240e() {
        return wu2.f12672j;
    }
}
