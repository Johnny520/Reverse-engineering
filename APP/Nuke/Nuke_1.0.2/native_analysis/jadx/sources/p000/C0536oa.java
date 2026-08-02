package p000;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536oa extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7595i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ d22 f7596j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f7597k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0536oa(d22 d22Var, xk1 xk1Var, int i) {
        super(2);
        this.f7595i = i;
        this.f7596j = d22Var;
        this.f7597k = xk1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f7595i;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f7597k;
        d22 d22Var = this.f7596j;
        int i2 = 0;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    Object objM1956L = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (objM1956L == c0160eb) {
                        objM1956L = C0799v6.f11768q;
                        go0Var.m1981f0(objM1956L);
                    }
                    uh1 uh1VarM3321a = nn2.m3321a(rh1.f9587a, false, (in0) objM1956L);
                    boolean zM1984h = go0Var.m1984h(d22Var);
                    Object objM1956L2 = go0Var.m1956L();
                    if (zM1984h || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0417la(d22Var, 1);
                        go0Var.m1981f0(objM1956L2);
                    }
                    uh1 uh1VarM1859G = gf1.m1859G(uh1VarM3321a, (in0) objM1956L2);
                    float f = d22Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        uh1VarM1859G = AbstractC0731te.m5185N(uh1VarM1859G, 0.0f, 0.0f, f, null, 520187);
                    }
                    C0478my c0478my = AbstractC0573pa.f8061a;
                    mn0 mn0Var = (mn0) xk1Var.getValue();
                    Object objM1956L3 = go0Var.m1956L();
                    if (objM1956L3 == c0160eb) {
                        objM1956L3 = C0378k8.f5381c;
                        go0Var.m1981f0(objM1956L3);
                    }
                    nf1 nf1Var = (nf1) objM1956L3;
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1859G);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, nf1Var);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    mn0Var.mo12g(go0Var, 0);
                    go0Var.m1994p(true);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    ci0.m800a(AbstractC0573pa.f8062b.mo1251a(Boolean.TRUE), xe1.m6126i0(1022273628, new C0536oa(d22Var, xk1Var, i2), go0Var2), go0Var2, 56);
                }
                break;
        }
        return a83Var;
    }
}
