package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2698x3 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m5276a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m5277b(Object obj, LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3) {
        Objects.requireNonNull(layoutInflaterFactory2C0176E3);
        C2655w3 c2655w3 = new C2655w3(0, layoutInflaterFactory2C0176E3);
        AbstractC0859U.m1696f(obj).registerOnBackInvokedCallback(1000000, c2655w3);
        return c2655w3;
    }

    /* JADX INFO: renamed from: c */
    public static void m5278c(Object obj, Object obj2) {
        AbstractC0859U.m1696f(obj).unregisterOnBackInvokedCallback(AbstractC0859U.m1693c(obj2));
    }
}
