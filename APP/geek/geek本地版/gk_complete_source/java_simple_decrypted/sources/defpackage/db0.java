package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class db0 extends zt {
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    @Override // defpackage.zt
    public void O(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L7;
        super.O(r3, r4);
        return;
    L7:
        if (h == false) goto L14;
        f0.l(r3, r4);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        h = false;
        return;
    }

    public void T(View r2, int r3, int r4, int r5, int r6) {
        if (g == false) goto L10;
        f0.m(r2, r3, r4, r5, r6);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        g = false;
        return;
    }

    public void U(View r2, Matrix r3) {
        if (e == false) goto L10;
        f0.n(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        e = false;
        return;
    }

    public void V(View r2, Matrix r3) {
        if (f == false) goto L10;
        f0.x(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f = false;
        return;
    }
}
