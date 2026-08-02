package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w6 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ b7 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(b7 b7Var, int i) {
        super(1);
        this.i = i;
        this.j = b7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        b7 b7Var = this.j;
        switch (i) {
            case 0:
                ((bl0) b7Var.getFocusOwner()).g(((ok0) obj).a, false);
                return a83Var;
            case 1:
                xm0 xm0Var = (xm0) obj;
                b7Var.getUncaughtExceptionHandler$ui();
                Handler handler = b7Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    xm0Var.a();
                } else {
                    Handler handler2 = b7Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l6(xm0Var, 1));
                    }
                }
                return a83Var;
            default:
                return new ga(b7Var, b7Var.getTextInputService(), (j20) obj);
        }
    }
}
