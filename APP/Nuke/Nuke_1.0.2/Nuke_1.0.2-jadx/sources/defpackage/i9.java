package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 implements ak0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i9(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ak0
    public final Object m(Object obj, t00 t00Var) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                sz0 sz0Var = (sz0) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    sz0Var.F().startStylusHandwriting((View) sz0Var.i);
                }
                return a83Var;
            case 1:
                ep1 ep1Var = (ep1) obj2;
                float f = ((dj) obj).c;
                if (ep1Var.f != fp1.j) {
                    return a83Var;
                }
                return ep1Var.b.e(t00Var, new Float(ep1Var.g * (1.0f - ci0.C(f, 0.0f, 1.0f))));
            default:
                ((gi1) obj2).j.h(((Number) obj).floatValue());
                return a83Var;
        }
    }
}
