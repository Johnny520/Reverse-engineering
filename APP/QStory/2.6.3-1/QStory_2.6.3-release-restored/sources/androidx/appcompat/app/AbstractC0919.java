package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0887;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0919 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m806(Object obj, Object obj2) {
        AbstractC0887.m653(obj).unregisterOnBackInvokedCallback(AbstractC0887.m657(obj2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static OnBackInvokedCallback m807(Object obj, LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915) {
        Objects.requireNonNull(layoutInflaterFactory2C0915);
        C0920 c0920 = new C0920(layoutInflaterFactory2C0915, 0);
        AbstractC0887.m653(obj).registerOnBackInvokedCallback(1000000, c0920);
        return c0920;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m808(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
