package p000;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: zl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0966zl implements InterfaceC0927yl, pf3 {

    /* JADX INFO: renamed from: h */
    public static final C0966zl f13940h = new C0966zl();

    /* JADX INFO: renamed from: i */
    public static final C0966zl f13941i = new C0966zl();

    @Override // p000.pf3
    /* JADX INFO: renamed from: d */
    public lf3 mo1810d(ContextWrapper contextWrapper, f70 f70Var) {
        f70Var.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lf3(bounds, f);
    }

    @Override // p000.InterfaceC0927yl
    /* JADX INFO: renamed from: g */
    public Rect mo1845g(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
