package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h80 implements f80 {

    /* JADX INFO: renamed from: a */
    public final C0135dn f2174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c90 f2175b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h80(c90 c90Var) {
        this.f2175b = c90Var;
        this.f2174a = r60.m3411m(new C0381k6(4, c90Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: a */
    public final int mo1049a() {
        c90 c90Var = this.f2175b;
        return (int) (c90Var.m506g().f6459o == um0.f6264d ? c90Var.m506g().m4421g() & 4294967295L : c90Var.m506g().m4421g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: b */
    public final float mo1050b() {
        c90 c90Var = this.f2175b;
        return (((dp0) c90Var.f743e.f1697b).m720g() * 500) + ((dp0) c90Var.f743e.f1698c).m720g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: c */
    public final C0923xe mo1051c() {
        return new C0923xe(1, ((Number) this.f2174a.getValue()).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: d */
    public final Object mo1052d(int i, l80 l80Var) {
        C0111d c0111d = c90.f738x;
        c90 c90Var = this.f2175b;
        c90Var.getClass();
        Object objMo503d = c90Var.mo503d(vh0.f6718d, new C0091cg(c90Var, i, (InterfaceC0322ik) null), l80Var);
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (objMo503d != enumC1007zk) {
            objMo503d = na1Var;
        }
        return objMo503d == enumC1007zk ? objMo503d : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: e */
    public final int mo1053e() {
        c90 c90Var = this.f2175b;
        return (-c90Var.m506g().f6456l) + c90Var.m506g().f6460p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: f */
    public final float mo1054f() {
        c90 c90Var = this.f2175b;
        int iM720g = ((dp0) c90Var.f743e.f1697b).m720g();
        int iM720g2 = ((dp0) c90Var.f743e.f1698c).m720g();
        return c90Var.mo502c() ? (iM720g * 500) + iM720g2 + 100.0f : (iM720g * 500) + iM720g2;
    }
}
