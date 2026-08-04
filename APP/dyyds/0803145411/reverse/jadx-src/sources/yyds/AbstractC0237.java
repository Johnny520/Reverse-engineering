package yyds;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: yyds.ᛱᲇᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0237 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m887(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static OnBackInvokedCallback m888(Object obj, LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181) {
        C2642 c2642 = new C2642(0, layoutInflaterFactory2C2181);
        AbstractC0858.m1933(obj).registerOnBackInvokedCallback(1000000, c2642);
        return c2642;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m889(Object obj, Object obj2) {
        AbstractC0858.m1933(obj).unregisterOnBackInvokedCallback(AbstractC0858.m1944(obj2));
    }
}
