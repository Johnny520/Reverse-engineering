package p000;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699sm extends th1 implements InterfaceC0355jm, a61 {

    /* JADX INFO: renamed from: v */
    public g00 f10188v;

    /* JADX INFO: renamed from: w */
    public boolean f10189w;

    /* JADX INFO: renamed from: M0 */
    public static final o62 m4895M0(C0699sm c0699sm, zn1 zn1Var, C0723t6 c0723t6) {
        o62 o62Var;
        if (c0699sm.f10770u && c0699sm.f10189w) {
            zn1 zn1VarM4931b0 = sp0.m4931b0(c0699sm);
            if (!zn1Var.mo2843S0().f10770u) {
                zn1Var = null;
            }
            if (zn1Var != null && (o62Var = (o62) c0723t6.mo6a()) != null) {
                return o62Var.m3521i(zn1VarM4931b0.mo644J(zn1Var, false).m3516d());
            }
        }
        return null;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.InterfaceC0355jm
    /* JADX INFO: renamed from: f0 */
    public final Object mo2513f0(zn1 zn1Var, C0723t6 c0723t6, u00 u00Var) {
        Object objM5238u = AbstractC0731te.m5238u(new C0661rm(this, zn1Var, c0723t6, new C0678s1(this, zn1Var, c0723t6, 4), null), u00Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }

    @Override // p000.a61
    /* JADX INFO: renamed from: q */
    public final void mo100q(c61 c61Var) {
        this.f10189w = true;
    }
}
