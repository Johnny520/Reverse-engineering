package p031c4;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import p019b4.C0177a;

/* JADX INFO: renamed from: c4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394d implements InterfaceC0392b, InterfaceC0397g {

    /* JADX INFO: renamed from: b */
    public static final C0394d f1092b = new C0394d();

    /* JADX INFO: renamed from: c */
    public static final C0394d f1093c = new C0394d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0392b
    /* JADX INFO: renamed from: a */
    public Rect mo1361a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031c4.InterfaceC0397g
    /* JADX INFO: renamed from: c */
    public C0177a mo1363c(ContextWrapper contextWrapper, InterfaceC0395e interfaceC0395e) {
        interfaceC0395e.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f3 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new C0177a(bounds, f3);
    }
}
