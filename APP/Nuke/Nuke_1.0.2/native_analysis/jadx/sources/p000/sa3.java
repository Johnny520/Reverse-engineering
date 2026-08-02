package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sa3 {
    /* JADX INFO: renamed from: a */
    public static cf3 m4780a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        cf3 cf3VarM769c = cf3.m769c(null, rootWindowInsets);
        ye3 ye3Var = cf3VarM769c.f1518a;
        ye3Var.mo4176y(cf3VarM769c);
        View rootView = view.getRootView();
        ye3Var.mo4161d(rootView);
        ye3Var.mo4168p(rootView);
        ye3Var.mo4169q();
        return cf3VarM769c;
    }
}
