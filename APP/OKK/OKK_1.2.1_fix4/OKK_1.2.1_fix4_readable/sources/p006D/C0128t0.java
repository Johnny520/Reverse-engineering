package p006D;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: D.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0128t0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0040p f317a;

    public C0128t0(WindowInsetsController windowInsetsController) {
        this.f317a = new C0126s0(windowInsetsController, new C0095d(windowInsetsController));
    }

    public C0128t0(Window window, View view) {
        C0095d c0095d = new C0095d(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f317a = new C0126s0(window.getInsetsController(), c0095d);
        } else {
            this.f317a = new C0124r0(window, c0095d);
        }
    }
}
