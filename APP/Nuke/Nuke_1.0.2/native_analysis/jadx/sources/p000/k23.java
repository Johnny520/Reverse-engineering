package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k23 extends i01 {

    /* JADX INFO: renamed from: l */
    public final d63 f5327l;

    public k23(za2 za2Var, kt2 kt2Var, s72 s72Var, d63 d63Var) {
        super(za2Var, kt2Var, null, s72Var);
        int i = za2Var.f13815e;
        if (i != 6) {
            C0676s.m4651j(vi0.m5688g("opcode with invalid branchingness: ", i));
            throw null;
        }
        if (d63Var != null) {
            this.f5327l = d63Var;
        } else {
            um2.m5516f("catches == null");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static String m2600g(d63 d63Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int length = ((kj0) d63Var).f5590i.length;
        for (int i = 0; i < length; i++) {
            sb.append(" ");
            sb.append(d63Var.getType(i).mo23b());
        }
        return sb.toString();
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: d */
    public final void mo2239d(h01 h01Var) {
        h01Var.mo180h(this);
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: e */
    public final d63 mo2240e() {
        return this.f5327l;
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: f */
    public final String mo1217f() {
        return m2600g(this.f5327l);
    }
}
