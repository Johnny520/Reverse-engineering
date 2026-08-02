package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o81 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7580h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ q81 f7581i;

    public /* synthetic */ o81(q81 q81Var, int i) {
        this.f7580h = i;
        this.f7581i = q81Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f7580h;
        q81 q81Var = this.f7581i;
        switch (i) {
            case 0:
                d91 d91Var = q81Var.f8822w.f5985b;
                return Float.valueOf((((kx1) d91Var.f1920e.f7821b).m2759g() * 500) + ((kx1) d91Var.f1920e.f7822c).m2759g());
            case 1:
                d91 d91Var2 = q81Var.f8822w.f5985b;
                int iM2759g = ((kx1) d91Var2.f1920e.f7821b).m2759g();
                int iM2759g2 = ((kx1) d91Var2.f1920e.f7822c).m2759g();
                return Float.valueOf(d91Var2.mo569c() ? (iM2759g * 500) + iM2759g2 + 100.0f : (iM2759g * 500) + iM2759g2);
            default:
                d91 d91Var3 = q81Var.f8822w.f5985b;
                int iM6047g = (int) (d91Var3.m973g().f12888o == qv1.f9205h ? d91Var3.m973g().m6047g() & 4294967295L : d91Var3.m973g().m6047g() >> 32);
                d91 d91Var4 = q81Var.f8822w.f5985b;
                return Float.valueOf(iM6047g - ((-d91Var4.m973g().f12885l) + d91Var4.m973g().f12889p));
        }
    }
}
