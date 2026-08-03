package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: NF */
/* JADX INFO: loaded from: classes.dex */
public class C0575NF extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final WindowInsetsController f1870f;

    /* JADX INFO: renamed from: g */
    public final Window f1871g;

    public C0575NF(Window r1, C1517hw r2) {
        this.f1870f = AbstractC0360IF.m799b(r1);
        this.f1871g = r1;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: S */
    public final void mo1027S(boolean r2) {
        Window r0 = this.f1871g;
        if (r2 == false) goto L8;
        if (r0 == null) goto L6;
        View r22 = r0.getDecorView();
        r22.setSystemUiVisibility(r22.getSystemUiVisibility() | 16);
    L6:
        AbstractC0360IF.m802e(this.f1870f);
        return;
    L8:
        if (r0 == null) goto L10;
        View r23 = r0.getDecorView();
        r23.setSystemUiVisibility(r23.getSystemUiVisibility() & (-17));
    L10:
        AbstractC0360IF.m803f(this.f1870f);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: T */
    public final void mo1028T(boolean r2) {
        Window r0 = this.f1871g;
        if (r2 == false) goto L8;
        if (r0 == null) goto L6;
        View r22 = r0.getDecorView();
        r22.setSystemUiVisibility(r22.getSystemUiVisibility() | 8192);
    L6:
        AbstractC0360IF.m800c(this.f1870f);
        return;
    L8:
        if (r0 == null) goto L10;
        View r23 = r0.getDecorView();
        r23.setSystemUiVisibility(r23.getSystemUiVisibility() & (-8193));
    L10:
        AbstractC0360IF.m801d(this.f1870f);
    }
}
