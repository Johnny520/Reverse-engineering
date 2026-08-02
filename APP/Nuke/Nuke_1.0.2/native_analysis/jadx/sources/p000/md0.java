package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class md0 {
    /* JADX INFO: renamed from: b */
    public void mo3060b(lx2 lx2Var, lx2 lx2Var2, Window window, View view, boolean z, boolean z2) {
        lx2Var.getClass();
        lx2Var2.getClass();
        window.getClass();
        view.getClass();
        rd3.m4434a(window, false);
        window.setStatusBarColor(z ? lx2Var.f6373b : lx2Var.f6372a);
        window.setNavigationBarColor(z2 ? lx2Var2.f6373b : lx2Var2.f6372a);
        hh1 hh1Var = new hh1(view);
        int i = Build.VERSION.SDK_INT;
        df3 ef3Var = i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0);
        ef3Var.mo1014c(!z);
        ef3Var.mo1013b(!z2);
    }

    /* JADX INFO: renamed from: a */
    public void mo3059a(Window window) {
    }
}
