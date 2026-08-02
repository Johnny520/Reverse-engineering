package p000;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 implements f70, pf3 {

    /* JADX INFO: renamed from: h */
    public static final g70 f3335h = new g70();

    /* JADX INFO: renamed from: i */
    public static final g70 f3336i = new g70();

    @Override // p000.pf3
    /* JADX INFO: renamed from: d */
    public lf3 mo1810d(ContextWrapper contextWrapper, f70 f70Var) {
        f70Var.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lf3(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: h */
    public float mo1534h(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
