package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: k3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397k3 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m1641a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m1642b(Object obj, LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3) {
        Objects.requireNonNull(layoutInflaterFactory2C0656r3);
        C0360j3 c0360j3 = new C0360j3(0, layoutInflaterFactory2C0656r3);
        AbstractC0170e0.m948e(obj).registerOnBackInvokedCallback(1000000, c0360j3);
        return c0360j3;
    }

    /* JADX INFO: renamed from: c */
    public static void m1643c(Object obj, Object obj2) {
        AbstractC0170e0.m948e(obj).unregisterOnBackInvokedCallback(AbstractC0170e0.m945b(obj2));
    }
}
