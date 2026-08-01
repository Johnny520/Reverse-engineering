package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class dd0 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public final WindowInsetsController f1386a;

    /* JADX INFO: renamed from: b */
    public Window f1387b;

    public dd0(WindowInsetsController windowInsetsController) {
        this.f1386a = windowInsetsController;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: E */
    public final void mo629E(boolean z) {
        Window window = this.f1387b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1386a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1386a.setSystemBarsAppearance(0, 16);
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: F */
    public final void mo630F(boolean z) {
        Window window = this.f1387b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1386a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1386a.setSystemBarsAppearance(0, 8);
    }
}
