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

    public C0575NF(Window window, C1517hw c1517hw) {
        this.f1870f = window.getInsetsController();
        this.f1871g = window;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: S */
    public final void mo1027S(boolean z) {
        Window window = this.f1871g;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1870f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1870f.setSystemBarsAppearance(0, 16);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: T */
    public final void mo1028T(boolean z) {
        Window window = this.f1871g;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1870f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1870f.setSystemBarsAppearance(0, 8);
    }
}
