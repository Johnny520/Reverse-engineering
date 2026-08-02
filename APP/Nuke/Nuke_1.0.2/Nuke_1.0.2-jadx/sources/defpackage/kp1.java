package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xk1 b;
    public final /* synthetic */ xk1 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kp1(boolean z, xk1 xk1Var, xk1 xk1Var2) {
        this.a = z;
        this.b = xk1Var;
        this.c = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        if (this.a) {
            Object objM0 = ((zw2) s12Var).M0(new lm0(this.b, this.c, null, 3), t00Var);
            if (objM0 == k20.h) {
                return objM0;
            }
        }
        return a83.a;
    }
}
