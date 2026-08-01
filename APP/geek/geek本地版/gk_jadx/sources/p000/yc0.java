package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final WindowInsetsController f5331a;

    /* JADX INFO: renamed from: b */
    public Window f5332b;

    public yc0(WindowInsetsController windowInsetsController) {
        this.f5331a = windowInsetsController;
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: B */
    public final void mo1318B(boolean z) {
        Window window = this.f5332b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f5331a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f5331a.setSystemBarsAppearance(0, 16);
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: C */
    public final void mo1319C(boolean z) {
        Window window = this.f5332b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f5331a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f5331a.setSystemBarsAppearance(0, 8);
    }
}
