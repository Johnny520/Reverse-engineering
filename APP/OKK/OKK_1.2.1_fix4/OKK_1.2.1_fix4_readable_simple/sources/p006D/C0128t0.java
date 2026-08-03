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

    public C0128t0(WindowInsetsController r3) {
        this.f317a = new C0126s0(r3, new C0095d(r3));
    }

    public C0128t0(Window r3, View r4) {
        C0095d r02 = new C0095d(r4);
        if (Build.VERSION.SDK_INT < 30) goto L5;
        this.f317a = new C0126s0(AbstractC0130v.m448m(r3), r02);
        return;
    L5:
        this.f317a = new C0124r0(r3, r02);
    }
}
