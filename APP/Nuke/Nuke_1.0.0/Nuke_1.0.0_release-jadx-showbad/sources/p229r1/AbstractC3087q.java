package p229r1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: r1.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3087q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5399a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5400b(View view, InterfaceC3081k interfaceC3081k) {
        ViewOnApplyWindowInsetsListenerC3086p viewOnApplyWindowInsetsListenerC3086p = interfaceC3081k != null ? new ViewOnApplyWindowInsetsListenerC3086p(view, interfaceC3081k) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC3086p);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC3086p != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3086p);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
