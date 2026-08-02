package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class md0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(lx2 lx2Var, lx2 lx2Var2, Window window, View view, boolean z, boolean z2) {
        lx2Var.getClass();
        lx2Var2.getClass();
        window.getClass();
        view.getClass();
        rd3.a(window, false);
        window.setStatusBarColor(z ? lx2Var.b : lx2Var.a);
        window.setNavigationBarColor(z2 ? lx2Var2.b : lx2Var2.a);
        hh1 hh1Var = new hh1(view);
        int i = Build.VERSION.SDK_INT;
        df3 ef3Var = i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0);
        ef3Var.c(!z);
        ef3Var.b(!z2);
    }

    public void a(Window window) {
    }
}
