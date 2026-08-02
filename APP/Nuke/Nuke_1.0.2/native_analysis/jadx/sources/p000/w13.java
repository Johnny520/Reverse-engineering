package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w13 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xk1 f12271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xk1 f12272c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f12273d;

    public w13(j20 j20Var, xk1 xk1Var, xk1 xk1Var2) {
        this.f12270a = 2;
        this.f12273d = j20Var;
        this.f12271b = xk1Var;
        this.f12272c = xk1Var2;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.f12270a;
        Object obj = this.f12273d;
        switch (i) {
            case 0:
                return sp0.m4958p(s12Var, new v13(this.f12271b, this.f12272c, (xk1) obj, (t00) null, 0), t00Var);
            case 1:
                return sp0.m4958p(s12Var, new v13(this.f12271b, this.f12272c, (xk1) obj, (t00) null, 1), t00Var);
            default:
                qz2 qz2Var = new qz2((j20) obj, this.f12271b, null);
                C0590pr c0590pr = new C0590pr(this.f12272c, 24);
                rx2 rx2Var = ay2.f444a;
                Object objM5238u = AbstractC0731te.m5238u(new C0793v0(s12Var, qz2Var, c0590pr, new x22(s12Var), (t00) null, 7), t00Var);
                a83 a83Var = a83.f116a;
                k20 k20Var = k20.f5323h;
                if (objM5238u != k20Var) {
                    objM5238u = a83Var;
                }
                return objM5238u == k20Var ? objM5238u : a83Var;
        }
    }

    public /* synthetic */ w13(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, int i) {
        this.f12270a = i;
        this.f12271b = xk1Var;
        this.f12272c = xk1Var2;
        this.f12273d = xk1Var3;
    }
}
