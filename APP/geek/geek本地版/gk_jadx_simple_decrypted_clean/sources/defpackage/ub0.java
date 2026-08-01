package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub0 {
    public static void a(Window r1, boolean r2) {
        View r12 = r1.getDecorView();
        int r0 = r12.getSystemUiVisibility();
        if (r2 == false) goto L5;
        int r22 = r0 & (-1793);
    L6:
        r12.setSystemUiVisibility(r22);
        return;
    L5:
        r22 = r0 | 1792;
        goto L6
    }
}
