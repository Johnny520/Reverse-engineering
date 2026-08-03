package p000a;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: a.th */
/* JADX INFO: loaded from: classes.dex */
public final class C0848th extends C0726n9 {

    /* JADX INFO: renamed from: b */
    public final WindowInsetsController f3326b;

    /* JADX INFO: renamed from: c */
    public Window f3327c;

    public C0848th(WindowInsetsController windowInsetsController, C0674ke c0674ke) {
        new C0598ge();
        this.f3326b = windowInsetsController;
    }

    @Override // p000a.C0726n9
    /* JADX INFO: renamed from: x */
    public final void mo1682x(boolean z) {
        Window window = this.f3327c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3326b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3326b.setSystemBarsAppearance(0, 16);
    }

    @Override // p000a.C0726n9
    /* JADX INFO: renamed from: y */
    public final void mo1683y(boolean z) {
        Window window = this.f3327c;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3326b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3326b.setSystemBarsAppearance(0, 8);
    }
}
