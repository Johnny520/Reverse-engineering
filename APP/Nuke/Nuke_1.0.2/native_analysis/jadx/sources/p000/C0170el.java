package p000;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0170el extends th1 implements j61, on2 {

    /* JADX INFO: renamed from: v */
    public in0 f2483v;

    public C0170el(in0 in0Var) {
        this.f2483v = in0Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0196fa(6, sz1VarMo2340e, this));
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: i */
    public final boolean mo1364i() {
        return false;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        eq2 eq2Var;
        boolean z;
        zn1 zn1VarM4927Z = sp0.m4927Z(this, 2);
        if (zn1VarM4927Z.f13978M) {
            eq2Var = zn1VarM4927Z.f13976K;
            z = zn1VarM4927Z.f13977L;
        } else {
            ca2 ca2Var = AbstractC0731te.f10690b;
            if (ca2Var == null) {
                AbstractC0731te.f10690b = new ca2();
            } else {
                ca2Var.m718a();
            }
            ca2 ca2Var2 = AbstractC0731te.f10690b;
            ca2Var2.getClass();
            ca2Var2.f1277x = zn1VarM4927Z.f13985v.f9365F;
            ca2Var2.f1276w = s11.m4715q0(zn1VarM4927Z.f10440j);
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                this.f2483v.mo5j(ca2Var2);
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                eq2Var = ca2Var2.f1274u;
                z = ca2Var2.f1275v;
            } catch (Throwable th) {
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                throw th;
            }
        }
        if (z) {
            xn2.m6163c(zn2Var, eq2Var);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f2483v + ')';
    }
}
