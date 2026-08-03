package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: MF */
/* JADX INFO: loaded from: classes.dex */
public final class C0532MF extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final Window f1735f;

    public C0532MF(Window window, C1517hw c1517hw) {
        this.f1735f = window;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: S */
    public final void mo1027S(boolean z) {
        if (!z) {
            m1029X(16);
            return;
        }
        Window window = this.f1735f;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: T */
    public final void mo1028T(boolean z) {
        if (!z) {
            m1029X(8192);
            return;
        }
        Window window = this.f1735f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: X */
    public final void m1029X(int i) {
        View decorView = this.f1735f.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
