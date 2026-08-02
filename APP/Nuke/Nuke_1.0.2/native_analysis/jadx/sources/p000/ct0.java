package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1720h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1721i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f1722j;

    public /* synthetic */ ct0(int i, String str, String str2) {
        this.f1721i = str;
        this.f1722j = str2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f1720h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    uh1 uh1VarM1612D = fg1.m1612D(AbstractC0731te.f10693e, 18.0f, 18.0f);
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    tu2 tu2Var = ur1.f11452a;
                    AbstractC0179eu.m1446a(this.f1721i, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(15), im0.f4682l, 0L, 0, rg3.m4450D(20), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
                    AbstractC0179eu.m1446a(this.f1722j, fg1.m1615G(rh1.f9587a, 0.0f, 5.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(13), im0.f4680j, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 48, 1016);
                    go0Var.m1994p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ci0.m814o(this.f1721i, this.f1722j, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ ct0(String str, String str2) {
        this.f1721i = str;
        this.f1722j = str2;
    }
}
