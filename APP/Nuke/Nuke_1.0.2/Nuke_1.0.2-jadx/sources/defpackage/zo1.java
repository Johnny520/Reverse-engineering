package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements PointerInputEventHandler {
    public static final zo1 b = new zo1(0);
    public static final zo1 c = new zo1(1);
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [zo1.<clinit>():void] */
    public /* synthetic */ zo1(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.a;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                Object objM0 = ((zw2) s12Var).M0(new yo1(2, null), t00Var);
                return objM0 == k20.h ? objM0 : a83Var;
            default:
                return a83Var;
        }
    }
}
