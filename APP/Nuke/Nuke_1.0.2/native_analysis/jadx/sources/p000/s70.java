package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s70 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9952h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ sz0 f9953i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f9954j;

    public /* synthetic */ s70(String str, sz0 sz0Var) {
        this.f9952h = 0;
        this.f9954j = str;
        this.f9953i = sz0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f9952h;
        String str = this.f9954j;
        a83 a83Var = a83.f116a;
        sz0 sz0Var = this.f9953i;
        int i2 = 2;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    uh1 uh1VarM1612D = fg1.m1612D(rh1.f9587a, 24.0f, 22.0f);
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(new C0884xf(16.0f, new C0676s(2)), C0700sn.f10233u, go0Var, 6);
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
                    tu2 tu2Var = AbstractC0670ru.f9755a;
                    v03.m5601b(this.f9954j, null, ((C0593pu) go0Var.m1988j(tu2Var)).f8603q, rg3.m4450D(20), im0.f4682l, rg3.m4450D(0), 0L, 0, false, 0, 0, null, go0Var, 102260736, 0, 261802);
                    v03.m5601b((String) ((nx1) sz0Var.f10436i).getValue(), null, ((C0593pu) go0Var.m1988j(tu2Var)).f8605s, rg3.m4450D(14), null, rg3.m4450D(0), rg3.m4450D(22), 0, false, 0, 0, null, go0Var, 100687872, 48, 259818);
                    boolean zM1980f = go0Var.m1980f(sz0Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0727ta(7, sz0Var);
                        go0Var.m1981f0(objM1956L);
                    }
                    x32.m6031b((xm0) objM1956L, AbstractC0731te.m5186O(AbstractC0731te.f10693e, 6.0f), 0L, 0L, 0, 0.0f, null, go0Var, 48);
                    go0Var.m1994p(true);
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    pp0.m3906d(xe1.m6126i0(797002287, new s70(sz0Var, str, i2), go0Var2), go0Var2, 48);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.m1961R();
                } else {
                    AbstractC0738tl.m5298a(sz0Var, null, str, go0Var3, 0);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ s70(sz0 sz0Var, String str, int i) {
        this.f9952h = i;
        this.f9953i = sz0Var;
        this.f9954j = str;
    }
}
