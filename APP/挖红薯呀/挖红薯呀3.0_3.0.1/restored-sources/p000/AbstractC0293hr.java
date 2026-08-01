package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: hr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0293hr {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo1499a(y51 y51Var, y51 y51Var2, Window window, View view, boolean z, boolean z2) {
        y51Var.getClass();
        y51Var2.getClass();
        window.getClass();
        view.getClass();
        w60.m4889K(window, false);
        window.setStatusBarColor(z ? y51Var.f7545b : y51Var.f7544a);
        window.setNavigationBarColor(z2 ? y51Var2.f7545b : y51Var2.f7544a);
        C0111d ce1Var = Build.VERSION.SDK_INT >= 35 ? new ce1(window) : new C0111d(window);
        ce1Var.mo511r(!z);
        ce1Var.mo510q(!z2);
    }
}
