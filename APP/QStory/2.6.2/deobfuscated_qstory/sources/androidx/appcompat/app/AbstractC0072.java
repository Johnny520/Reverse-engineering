package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0040;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m245(Object obj, Object obj2) {
        AbstractC0040.m93(obj).unregisterOnBackInvokedCallback(AbstractC0040.m97(obj2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static OnBackInvokedCallback m246(Object obj, LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068) {
        Objects.requireNonNull(layoutInflaterFactory2C0068);
        C0073 c0073 = new C0073(layoutInflaterFactory2C0068, 0);
        AbstractC0040.m93(obj).registerOnBackInvokedCallback(1000000, c0073);
        return c0073;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m247(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
