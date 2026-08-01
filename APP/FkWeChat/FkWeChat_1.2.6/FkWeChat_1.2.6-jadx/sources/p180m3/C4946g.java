package p180m3;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: renamed from: m3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4946g {

    /* JADX INFO: renamed from: a */
    public static final C4946g f15022a = new C4946g();

    /* JADX INFO: renamed from: a */
    public final int m19990a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    /* JADX INFO: renamed from: b */
    public final void m19991b(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsSides(i10);
    }

    /* JADX INFO: renamed from: c */
    public final void m19992c(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.setFitInsetsTypes(i10);
    }
}
