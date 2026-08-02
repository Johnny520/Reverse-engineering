package p000;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0952z7 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13747h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ uh1 f13748i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f13749j;

    public /* synthetic */ C0952z7(long j, uh1 uh1Var) {
        this.f13747h = 0;
        this.f13749j = j;
        this.f13748i = uh1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13747h;
        uh1 uh1Var = this.f13748i;
        a83 a83Var = a83.f116a;
        long j = this.f13749j;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    uh1 uh1Var2 = this.f13748i;
                    if (j == 9205357640488583168L) {
                        go0Var.m1966W(-1243644858);
                        AbstractC0157e8.m1290b(uh1Var2, go0Var, 0, 0);
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(-1244013944);
                        uh1 uh1VarM5201b0 = AbstractC0731te.m5201b0(uh1Var2, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), 0.0f, 0.0f, 12);
                        nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10223k, false);
                        int iHashCode = Long.hashCode(go0Var.f3614T);
                        yy1 yy1VarM1990l = go0Var.m1990l();
                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5201b0);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy = C0256gx.f3727b;
                        go0Var.m1969Z();
                        if (go0Var.f3613S) {
                            go0Var.m1989k(c0367jy);
                        } else {
                            go0Var.m1987i0();
                        }
                        yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                        yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                        yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                        yf3.m6267b(go0Var, C0256gx.f3732g);
                        yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                        AbstractC0157e8.m1290b(null, go0Var, 0, 1);
                        go0Var.m1994p(true);
                        go0Var.m1994p(false);
                    }
                }
                break;
            case 1:
                num.getClass();
                qp0.m4252g(uh1Var, j, interfaceC0596px, pp0.m3902N(1));
                break;
            case 2:
                num.getClass();
                AbstractC0179eu.m1461k(uh1Var, j, interfaceC0596px, pp0.m3902N(1));
                break;
            case 3:
                num.getClass();
                AbstractC0179eu.m1462l(uh1Var, j, interfaceC0596px, pp0.m3902N(1));
                break;
            default:
                num.getClass();
                tp0.m5360e(uh1Var, j, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0952z7(uh1 uh1Var, long j, int i, int i2) {
        this.f13747h = i2;
        this.f13748i = uh1Var;
        this.f13749j = j;
    }
}
