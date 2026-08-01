package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends gt {
    public final WindowInsetsController a;
    public Window b;

    public yc0(WindowInsetsController r1) {
        this.a = r1;
    }

    @Override // defpackage.gt
    public final void B(boolean r2) {
        Window r0 = this.b;
        if (r2 == false) goto L8;
        if (r0 == null) goto L6;
        View r22 = r0.getDecorView();
        r22.setSystemUiVisibility(r22.getSystemUiVisibility() | 16);
    L6:
        uc0.e(this.a);
        return;
    L8:
        if (r0 == null) goto L10;
        View r23 = r0.getDecorView();
        r23.setSystemUiVisibility(r23.getSystemUiVisibility() & (-17));
    L10:
        uc0.f(this.a);
    }

    @Override // defpackage.gt
    public final void C(boolean r2) {
        Window r0 = this.b;
        if (r2 == false) goto L8;
        if (r0 == null) goto L6;
        View r22 = r0.getDecorView();
        r22.setSystemUiVisibility(r22.getSystemUiVisibility() | 8192);
    L6:
        uc0.c(this.a);
        return;
    L8:
        if (r0 == null) goto L10;
        View r23 = r0.getDecorView();
        r23.setSystemUiVisibility(r23.getSystemUiVisibility() & (-8193));
    L10:
        uc0.d(this.a);
    }
}
