package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0040;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m246(Object obj, Object obj2) {
        AbstractC0040.m93(obj).unregisterOnBackInvokedCallback(AbstractC0040.m97(obj2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static OnBackInvokedCallback m247(Object obj, LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068) {
        Objects.requireNonNull(layoutInflaterFactory2C0068);
        C0073 c0073 = new C0073(layoutInflaterFactory2C0068, 0);
        AbstractC0040.m93(obj).registerOnBackInvokedCallback(1000000, c0073);
        return c0073;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m248(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
