package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s70 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ sz0 i;
    public final /* synthetic */ String j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s70(String str, sz0 sz0Var) {
        this.h = 0;
        this.j = str;
        this.i = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        String str = this.j;
        a83 a83Var = a83.a;
        sz0 sz0Var = this.i;
        int i2 = 2;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    uh1 uh1VarD = fg1.D(rh1.a, 24.0f, 22.0f);
                    av avVarA = yu.a(new xf(16.0f, new s(2)), sn.u, go0Var, 6);
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, uh1VarD);
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
                    tu2 tu2Var = ru.a;
                    v03.b(this.j, null, ((pu) go0Var.j(tu2Var)).q, rg3.D(20), im0.l, rg3.D(0), 0L, 0, false, 0, 0, null, go0Var, 102260736, 0, 261802);
                    v03.b((String) ((nx1) sz0Var.i).getValue(), null, ((pu) go0Var.j(tu2Var)).s, rg3.D(14), null, rg3.D(0), rg3.D(22), 0, false, 0, 0, null, go0Var, 100687872, 48, 259818);
                    boolean zF = go0Var.f(sz0Var);
                    Object objL = go0Var.L();
                    if (zF || objL == nx.a) {
                        objL = new ta(7, sz0Var);
                        go0Var.f0(objL);
                    }
                    x32.b((xm0) objL, te.O(te.e, 6.0f), 0L, 0L, 0, 0.0f, null, go0Var, 48);
                    go0Var.p(true);
                }
                break;
            case 1:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    pp0.d(xe1.i0(797002287, new s70(sz0Var, str, i2), go0Var2), go0Var2, 48);
                }
                break;
            default:
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.R();
                } else {
                    tl.a(sz0Var, null, str, go0Var3, 0);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ s70(sz0 sz0Var, String str, int i) {
        this.h = i;
        this.i = sz0Var;
        this.j = str;
    }
}
