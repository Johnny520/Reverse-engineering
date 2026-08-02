package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class la extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ d22 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la(d22 d22Var, int i) {
        super(1);
        this.i = i;
        this.j = d22Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        d22 d22Var = this.j;
        switch (i) {
            case 0:
                c61 c61VarJ = ((c61) obj).j();
                c61VarJ.getClass();
                d22Var.q(c61VarJ);
                break;
            case 1:
                d22Var.m13setPopupContentSizefhxjrPA(new h11(((h11) obj).a));
                d22Var.r();
                break;
            default:
                xm0 xm0Var = (xm0) obj;
                Handler handler = d22Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = d22Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l6(xm0Var, 5));
                    }
                } else {
                    xm0Var.a();
                }
                break;
        }
        return a83Var;
    }
}
