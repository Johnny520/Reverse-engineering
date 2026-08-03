package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: MF */
/* JADX INFO: loaded from: classes.dex */
public final class C0532MF extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final Window f1735f;

    public C0532MF(Window r1, C1517hw r2) {
        this.f1735f = r1;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: S */
    public final void mo1027S(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.f1735f;
        r1.clearFlags(134217728);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(16 | r32.getSystemUiVisibility());
        return;
    L6:
        m1029X(16);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: T */
    public final void mo1028T(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.f1735f;
        r1.clearFlags(67108864);
        r1.addFlags(Integer.MIN_VALUE);
        View r32 = r1.getDecorView();
        r32.setSystemUiVisibility(8192 | r32.getSystemUiVisibility());
        return;
    L6:
        m1029X(8192);
    }

    /* JADX INFO: renamed from: X */
    public final void m1029X(int r3) {
        View r0 = this.f1735f.getDecorView();
        int r1 = r0.getSystemUiVisibility();
        r0.setSystemUiVisibility((~r3) & r1);
    }
}
