package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends gt {
    public final Window a;

    public xc0(Window r1, View r2) {
        this.a = r1;
    }

    @Override // defpackage.gt
    public final void B(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.a;
        r1.clearFlags(134217728);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(16 | r32.getSystemUiVisibility());
        return;
    L6:
        I(16);
    }

    @Override // defpackage.gt
    public final void C(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.a;
        r1.clearFlags(67108864);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(8192 | r32.getSystemUiVisibility());
        return;
    L6:
        I(8192);
    }

    public final void I(int r3) {
        View r0 = this.a.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        r0.setSystemUiVisibility((~r3) & r1);
    }
}
