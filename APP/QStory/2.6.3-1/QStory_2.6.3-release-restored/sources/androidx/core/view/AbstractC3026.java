package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3026 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m4564(View view, InterfaceC3038 interfaceC3038) {
        ViewOnApplyWindowInsetsListenerC3027 viewOnApplyWindowInsetsListenerC3027 = interfaceC3038 != null ? new ViewOnApplyWindowInsetsListenerC3027(view, interfaceC3038) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(C0328R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC3027);
        }
        if (view.getTag(C0328R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC3027 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3027);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0328R.id.tag_window_insets_animation_callback));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3058 m4565(View view, C3058 c3058, Rect rect) {
        WindowInsets windowInsetsM4629 = c3058.m4629();
        if (windowInsetsM4629 != null) {
            return C3058.m4623(view, view.computeSystemWindowInsets(windowInsetsM4629, rect));
        }
        rect.setEmpty();
        return c3058;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4566(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0328R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
