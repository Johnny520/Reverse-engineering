package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hc1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static be1 m1298a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        be1 be1VarM352b = be1.m352b(null, rootWindowInsets);
        yd1 yd1Var = be1VarM352b.f503a;
        yd1Var.mo3229t(be1VarM352b);
        View rootView = view.getRootView();
        yd1Var.mo4316d(rootView);
        yd1Var.mo3224l(rootView);
        yd1Var.mo3225m();
        return be1VarM352b;
    }
}
