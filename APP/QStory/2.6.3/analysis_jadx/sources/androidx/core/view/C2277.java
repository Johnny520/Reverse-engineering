package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.app.C0076;
import com.davemorrissey.labs.subscaleview.R;
import java.util.List;
import p157.InterpolatorC7624;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2277 extends AbstractC2275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final PathInterpolator f6612 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterpolatorC7624 f6611 = new InterpolatorC7624(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final DecelerateInterpolator f6614 = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final AccelerateInterpolator f6613 = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4259(View view, C2274 c2274) {
        AbstractC2279 abstractC2279M4262 = m4262(view);
        if (abstractC2279M4262 != null) {
            abstractC2279M4262.mo1468(c2274);
            if (abstractC2279M4262.f6621 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4259(viewGroup.getChildAt(i), c2274);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m4260(View view, C2225 c2225, List list) {
        AbstractC2279 abstractC2279M4262 = m4262(view);
        if (abstractC2279M4262 != null) {
            c2225 = abstractC2279M4262.mo1465(c2225, list);
            if (abstractC2279M4262.f6621 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4260(viewGroup.getChildAt(i), c2225, list);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4261(View view, C2274 c2274, C2225 c2225, boolean z) {
        AbstractC2279 abstractC2279M4262 = m4262(view);
        if (abstractC2279M4262 != null) {
            abstractC2279M4262.f6620 = c2225;
            if (!z) {
                abstractC2279M4262.mo1466(c2274);
                z = abstractC2279M4262.f6621 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4261(viewGroup.getChildAt(i), c2274, c2225, z);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static AbstractC2279 m4262(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2276) {
            return ((ViewOnApplyWindowInsetsListenerC2276) tag).f6610;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4263(View view, C2274 c2274, C0076 c0076) {
        AbstractC2279 abstractC2279M4262 = m4262(view);
        if (abstractC2279M4262 != null) {
            abstractC2279M4262.mo1467(c2274, c0076);
            if (abstractC2279M4262.f6621 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4263(viewGroup.getChildAt(i), c2274, c0076);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static WindowInsets m4264(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }
}
