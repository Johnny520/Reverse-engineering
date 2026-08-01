package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2193 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m4004(View view, InterfaceC2205 interfaceC2205) {
        ViewOnApplyWindowInsetsListenerC2194 viewOnApplyWindowInsetsListenerC2194 = interfaceC2205 != null ? new ViewOnApplyWindowInsetsListenerC2194(view, interfaceC2205) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC2194);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC2194 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2194);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2225 m4005(View view, C2225 c2225, Rect rect) {
        WindowInsets windowInsetsM4069 = c2225.m4069();
        if (windowInsetsM4069 != null) {
            return C2225.m4063(view, view.computeSystemWindowInsets(windowInsetsM4069, rect));
        }
        rect.setEmpty();
        return c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4006(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
