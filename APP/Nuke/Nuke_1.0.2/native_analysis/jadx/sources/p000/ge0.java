package p000;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3454h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3455i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f3456j;

    public /* synthetic */ ge0(int i, int i2, in0 in0Var) {
        this.f3455i = i;
        this.f3456j = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3454h;
        in0 in0Var = this.f3456j;
        a83 a83Var = a83.f116a;
        int i2 = this.f3455i;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    yi0 yi0Var = AbstractC0731te.f10695g;
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, yi0Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    C0419lc c0419lc = C0256gx.f3730e;
                    yf3.m6268c(go0Var, c0419lc, c0032avM6346a);
                    C0419lc c0419lc2 = C0256gx.f3729d;
                    yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C0419lc c0419lc3 = C0256gx.f3731f;
                    yf3.m6268c(go0Var, c0419lc3, numValueOf);
                    C0799v6 c0799v6 = C0256gx.f3732g;
                    yf3.m6267b(go0Var, c0799v6);
                    C0419lc c0419lc4 = C0256gx.f3728c;
                    yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
                    tp0.m5358c(rg3.m4462P(i2, go0Var), null, null, this.f3456j, go0Var, 0, 30);
                    uh1 uh1VarM1612D = fg1.m1612D(yi0Var, 18.0f, 14.0f);
                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
                    int iHashCode2 = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l2 = go0Var.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, c0419lc, nf1VarM1060d);
                    yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
                    vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
                    yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
                    ci0.m806g(null, rg3.m4462P(i2, go0Var), rg3.m4462P(R.string.home_settings_empty_page_message, go0Var), go0Var, 0, 1);
                    go0Var.m1994p(true);
                    go0Var.m1994p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                up0.m5537b(i2, in0Var, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.m5359d(in0Var, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ ge0(int i, in0 in0Var) {
        this.f3455i = i;
        this.f3456j = in0Var;
    }

    public /* synthetic */ ge0(in0 in0Var, int i) {
        this.f3456j = in0Var;
        this.f3455i = i;
    }
}
