package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w13 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk1 b;
    public final /* synthetic */ xk1 c;
    public final /* synthetic */ Object d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w13(j20 j20Var, xk1 xk1Var, xk1 xk1Var2) {
        this.a = 2;
        this.d = j20Var;
        this.b = xk1Var;
        this.c = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return sp0.p(s12Var, new v13(this.b, this.c, (xk1) obj, (t00) null, 0), t00Var);
            case 1:
                return sp0.p(s12Var, new v13(this.b, this.c, (xk1) obj, (t00) null, 1), t00Var);
            default:
                qz2 qz2Var = new qz2((j20) obj, this.b, null);
                pr prVar = new pr(this.c, 24);
                rx2 rx2Var = ay2.a;
                Object objU = te.u(new v0(s12Var, qz2Var, prVar, new x22(s12Var), (t00) null, 7), t00Var);
                a83 a83Var = a83.a;
                k20 k20Var = k20.h;
                if (objU != k20Var) {
                    objU = a83Var;
                }
                return objU == k20Var ? objU : a83Var;
        }
    }

    public /* synthetic */ w13(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, int i) {
        this.a = i;
        this.b = xk1Var;
        this.c = xk1Var2;
        this.d = xk1Var3;
    }
}
