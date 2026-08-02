package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sa3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cf3 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        cf3 cf3VarC = cf3.c(null, rootWindowInsets);
        ye3 ye3Var = cf3VarC.a;
        ye3Var.y(cf3VarC);
        View rootView = view.getRootView();
        ye3Var.d(rootView);
        ye3Var.p(rootView);
        ye3Var.q();
        return cf3VarC;
    }
}
