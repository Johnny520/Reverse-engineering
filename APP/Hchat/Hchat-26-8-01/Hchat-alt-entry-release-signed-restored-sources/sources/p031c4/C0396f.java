package p031c4;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import p019b4.C0177a;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0396f implements InterfaceC0395e, InterfaceC0397g {

    /* JADX INFO: renamed from: b */
    public static final C0396f f1094b = new C0396f();

    /* JADX INFO: renamed from: c */
    public static final C0396f f1095c = new C0396f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0395e
    /* JADX INFO: renamed from: b */
    public float mo1362b(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0397g
    /* JADX INFO: renamed from: c */
    public C0177a mo1363c(ContextWrapper contextWrapper, InterfaceC0395e interfaceC0395e) {
        interfaceC0395e.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C0177a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
