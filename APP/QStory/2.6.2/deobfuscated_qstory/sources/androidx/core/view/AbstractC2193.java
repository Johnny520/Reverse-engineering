package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2193 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m3994(View view, InterfaceC2205 interfaceC2205) {
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
    public static C2225 m3995(View view, C2225 c2225, Rect rect) {
        WindowInsets windowInsetsM4059 = c2225.m4059();
        if (windowInsetsM4059 != null) {
            return C2225.m4053(view, view.computeSystemWindowInsets(windowInsetsM4059, rect));
        }
        rect.setEmpty();
        return c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m3996(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
