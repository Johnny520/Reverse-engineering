package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rh(kf2 kf2Var, boolean z, in0 in0Var) {
        this.h = 5;
        this.k = kf2Var;
        this.i = z;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        long j;
        int i = this.h;
        boolean z = this.i;
        a83 a83Var = a83.a;
        Object obj3 = this.j;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s11.p((s62) obj4, z, (in0) obj3, (px) obj, pp0.N(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t11.f((g33) obj4, z, (in0) obj3, (px) obj, pp0.N(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ci0.i((String) obj4, (in0) obj3, z, (px) obj, pp0.N(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                s11.k((xt0) obj4, z, (xm0) obj3, (px) obj, pp0.N(1));
                break;
            case 4:
                String str = (String) obj4;
                ju juVar = (ju) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    rh1 rh1Var = rh1.a;
                    uh1 uh1VarM = tl.M(go0Var, rh1Var);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.k(jyVar);
                    } else {
                        go0Var.i0();
                    }
                    yf3.c(go0Var, gx.e, ob2VarA);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    if (str != null) {
                        go0Var.W(1387271795);
                        if (juVar == null) {
                            go0Var.W(44756268);
                            j = ((lp1) go0Var.j(ur1.a)).f;
                            go0Var.p(false);
                        } else {
                            go0Var.W(44755276);
                            go0Var.p(false);
                            j = juVar.a;
                        }
                        eu.a(str, null, new m13(j, rg3.D(14), im0.j, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1018);
                        rp0.O(go0Var, te.q0(rh1Var, 8.0f));
                        go0Var.p(false);
                    } else {
                        go0Var.W(1387686947);
                        go0Var.p(false);
                    }
                    qp0.g(null, ju.b(z ? 0.62f : 0.36f, ((lp1) go0Var.j(ur1.a)).f), go0Var, 0);
                    go0Var.p(true);
                }
                break;
            case 5:
                kf2 kf2Var = (kf2) obj4;
                in0 in0Var = (in0) obj3;
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    wf2 wf2Var = kf2Var.s.a;
                    wf2 wf2Var2 = wf2.k;
                    boolean z2 = this.i;
                    eb ebVar = nx.a;
                    if (wf2Var != wf2Var2) {
                        go0Var2.W(-2087069697);
                        boolean zF = go0Var2.f(in0Var);
                        Object objL = go0Var2.L();
                        if (zF || objL == ebVar) {
                            objL = new wo0(in0Var, 2);
                            go0Var2.f0(objL);
                        }
                        sp0.i(z2, (in0) objL, null, false, 0, go0Var2, 0, 60);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(-2087291812);
                        boolean zF2 = go0Var2.f(in0Var);
                        Object objL2 = go0Var2.L();
                        if (zF2 || objL2 == ebVar) {
                            objL2 = new wo0(in0Var, 1);
                            go0Var2.f0(objL2);
                        }
                        te.g(z2, (in0) objL2, null, false, go0Var2, 0);
                        go0Var2.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                se.j((jc3) obj4, z, (in0) obj3, (px) obj, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ rh(Object obj, boolean z, un0 un0Var, int i, int i2) {
        this.h = i2;
        this.k = obj;
        this.i = z;
        this.j = un0Var;
    }

    public /* synthetic */ rh(String str, ju juVar, boolean z) {
        this.h = 4;
        this.k = str;
        this.j = juVar;
        this.i = z;
    }

    public /* synthetic */ rh(String str, in0 in0Var, boolean z, int i) {
        this.h = 2;
        this.k = str;
        this.j = in0Var;
        this.i = z;
    }
}
