package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ge */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0237ge implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3450h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f3451i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3452j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3453k;

    public /* synthetic */ C0237ge(int i, Object obj, Object obj2, boolean z) {
        this.f3450h = i;
        this.f3452j = obj;
        this.f3453k = obj2;
        this.f3451i = z;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f3450h;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f3453k;
        Object obj5 = this.f3452j;
        switch (i) {
            case 0:
                xk1 xk1Var = (xk1) obj5;
                xk1 xk1Var2 = (xk1) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.f10693e, gf1.m1868P(go0Var));
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1882b0);
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
                    rg3.m4466b(rg3.m4462P(R.string.anti_revoke_pattern_label, go0Var), go0Var, 0);
                    String str = (String) xk1Var.getValue();
                    boolean zM1980f = go0Var.m1980f(xk1Var);
                    Object objM1956L = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0260h0(xk1Var, 11);
                        go0Var.m1981f0(objM1956L);
                    }
                    tp0.m5357b(str, (in0) objM1956L, null, rg3.m4462P(R.string.anti_revoke_pattern_placeholder, go0Var), null, null, false, 2, 4, false, false, null, null, null, go0Var, 114819072, 0, 15924);
                    rh1 rh1Var = rh1.f9587a;
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.anti_revoke_pattern_help, go0Var), fg1.m1615G(rh1Var, 0.0f, 7.0f, 0.0f, 0.0f, 13), rg3.m4488x(go0Var), 0, false, 0, 0, go0Var, 48, 1016);
                    rg3.m4466b(vi0.m5687f(rh1Var, 16.0f, go0Var, R.string.anti_revoke_time_format_label, go0Var), go0Var, 0);
                    String str2 = (String) xk1Var2.getValue();
                    boolean zM1980f2 = go0Var.m1980f(xk1Var2);
                    Object objM1956L2 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0260h0(xk1Var2, 12);
                        go0Var.m1981f0(objM1956L2);
                    }
                    tp0.m5357b(str2, (in0) objM1956L2, null, rg3.m4462P(R.string.anti_revoke_time_format_placeholder, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 0, 0, 16372);
                    if (pv2.m4006s0((String) xk1Var2.getValue()) || this.f3451i) {
                        go0Var.m1966W(900628391);
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(900359838);
                        AbstractC0179eu.m1446a(rg3.m4462P(R.string.anti_revoke_time_format_invalid, go0Var), fg1.m1615G(rh1Var, 0.0f, 7.0f, 0.0f, 0.0f, 13), m13.m3023a(rg3.m4488x(go0Var), ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g, 0L, null, null, 0L, 0L, null, null, 16777214), 0, false, 0, 0, go0Var, 48, 1016);
                        go0Var.m1994p(false);
                    }
                    go0Var.m1994p(true);
                }
                break;
            default:
                xm0 xm0Var = (xm0) obj5;
                xm0 xm0Var2 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                    AbstractC0691se.m4846q(rg3.m4462P(R.string.home_settings_save, go0Var2), xm0Var2, pb2.m3843a(pb2Var), this.f3451i, 0, go0Var2, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
