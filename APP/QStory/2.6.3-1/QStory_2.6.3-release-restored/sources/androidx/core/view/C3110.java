package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.app.C0923;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.List;
import p173.InterpolatorC8453;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3110 extends AbstractC3108 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final PathInterpolator f6957 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterpolatorC8453 f6956 = new InterpolatorC8453(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final DecelerateInterpolator f6959 = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AccelerateInterpolator f6958 = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4819(View view, C3107 c3107) {
        AbstractC3112 abstractC3112M4822 = m4822(view);
        if (abstractC3112M4822 != null) {
            abstractC3112M4822.mo2028(c3107);
            if (abstractC3112M4822.f6966 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4819(viewGroup.getChildAt(i), c3107);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4820(View view, C3058 c3058, List list) {
        AbstractC3112 abstractC3112M4822 = m4822(view);
        if (abstractC3112M4822 != null) {
            c3058 = abstractC3112M4822.mo2025(c3058, list);
            if (abstractC3112M4822.f6966 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4820(viewGroup.getChildAt(i), c3058, list);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4821(View view, C3107 c3107, C3058 c3058, boolean z) {
        AbstractC3112 abstractC3112M4822 = m4822(view);
        if (abstractC3112M4822 != null) {
            abstractC3112M4822.f6965 = c3058;
            if (!z) {
                abstractC3112M4822.mo2026(c3107);
                z = abstractC3112M4822.f6966 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4821(viewGroup.getChildAt(i), c3107, c3058, z);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static AbstractC3112 m4822(View view) {
        Object tag = view.getTag(C0328R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC3109) {
            return ((ViewOnApplyWindowInsetsListenerC3109) tag).f6955;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4823(View view, C3107 c3107, C0923 c0923) {
        AbstractC3112 abstractC3112M4822 = m4822(view);
        if (abstractC3112M4822 != null) {
            abstractC3112M4822.mo2027(c3107, c0923);
            if (abstractC3112M4822.f6966 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4823(viewGroup.getChildAt(i), c3107, c0923);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static WindowInsets m4824(View view, WindowInsets windowInsets) {
        return view.getTag(C0328R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
