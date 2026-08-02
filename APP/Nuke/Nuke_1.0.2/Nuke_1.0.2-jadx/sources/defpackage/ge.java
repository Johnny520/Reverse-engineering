package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ge(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                xk1 xk1Var = (xk1) obj5;
                xk1 xk1Var2 = (xk1) obj4;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    uh1 uh1VarB0 = gf1.b0(te.e, gf1.P(go0Var));
                    av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, uh1VarB0);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, avVarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    rg3.b(rg3.P(R.string.anti_revoke_pattern_label, go0Var), go0Var, 0);
                    String str = (String) xk1Var.getValue();
                    boolean zF = go0Var.f(xk1Var);
                    Object objL = go0Var.L();
                    eb ebVar = nx.a;
                    if (zF || objL == ebVar) {
                        objL = new h0(xk1Var, 11);
                        go0Var.f0(objL);
                    }
                    tp0.b(str, (in0) objL, null, rg3.P(R.string.anti_revoke_pattern_placeholder, go0Var), null, null, false, 2, 4, false, false, null, null, null, go0Var, 114819072, 0, 15924);
                    rh1 rh1Var = rh1.a;
                    eu.a(rg3.P(R.string.anti_revoke_pattern_help, go0Var), fg1.G(rh1Var, 0.0f, 7.0f, 0.0f, 0.0f, 13), rg3.x(go0Var), 0, false, 0, 0, go0Var, 48, 1016);
                    rg3.b(vi0.f(rh1Var, 16.0f, go0Var, R.string.anti_revoke_time_format_label, go0Var), go0Var, 0);
                    String str2 = (String) xk1Var2.getValue();
                    boolean zF2 = go0Var.f(xk1Var2);
                    Object objL2 = go0Var.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new h0(xk1Var2, 12);
                        go0Var.f0(objL2);
                    }
                    tp0.b(str2, (in0) objL2, null, rg3.P(R.string.anti_revoke_time_format_placeholder, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 0, 0, 16372);
                    if (pv2.s0((String) xk1Var2.getValue()) || this.i) {
                        go0Var.W(900628391);
                        go0Var.p(false);
                    } else {
                        go0Var.W(900359838);
                        eu.a(rg3.P(R.string.anti_revoke_time_format_invalid, go0Var), fg1.G(rh1Var, 0.0f, 7.0f, 0.0f, 0.0f, 13), m13.a(rg3.x(go0Var), ((lp1) go0Var.j(ur1.a)).g, 0L, null, null, 0L, 0L, null, null, 16777214), 0, false, 0, 0, go0Var, 48, 1016);
                        go0Var.p(false);
                    }
                    go0Var.p(true);
                }
                break;
            default:
                xm0 xm0Var = (xm0) obj5;
                xm0 xm0Var2 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    go0Var2.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                    se.q(rg3.P(R.string.home_settings_save, go0Var2), xm0Var2, pb2.a(pb2Var), this.i, 0, go0Var2, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
