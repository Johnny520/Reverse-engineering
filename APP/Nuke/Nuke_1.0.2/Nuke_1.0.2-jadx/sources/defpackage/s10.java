package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 implements PointerInputEventHandler {
    public final /* synthetic */ kz2 a;
    public final /* synthetic */ b03 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s10(kz2 kz2Var, b03 b03Var) {
        this.a = kz2Var;
        this.b = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        Object objU = te.u(new r10(s12Var, this.a, this.b, null), t00Var);
        return objU == k20.h ? objU : a83.a;
    }
}
