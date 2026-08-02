package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ nb i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gb(nb nbVar, int i) {
        this.h = i;
        this.i = nbVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        int i2 = 2;
        a83 a83Var = a83.a;
        nb nbVar = this.i;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj;
                View view = nbVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    xm0Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l6(xm0Var, 2));
                    }
                }
                return a83Var;
            case 1:
                ActionMode actionMode = nbVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return a83Var;
            case 2:
                ActionMode actionMode2 = nbVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return a83Var;
            default:
                nbVar.e.d();
                return new f8(i2, nbVar);
        }
    }
}
