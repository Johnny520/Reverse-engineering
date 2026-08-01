package p229r1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.dartcv.nuke.R;
import p154e2.C2023b;
import p274z1.InterpolatorC3514a;

/* JADX INFO: renamed from: r1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C3042C extends AbstractC3045F {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f9728e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final InterpolatorC3514a f9729f = new InterpolatorC3514a(InterpolatorC3514a.f10956c);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f9730g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f9731h = new AccelerateInterpolator(1.5f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m5309f(View view, C3046G c3046g) {
        AbstractC3094x abstractC3094xM5314k = m5314k(view);
        if (abstractC3094xM5314k != null) {
            abstractC3094xM5314k.mo681b(c3046g);
            if (abstractC3094xM5314k.f9813d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                m5309f(viewGroup.getChildAt(i5), c3046g);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m5310g(View view, C3046G c3046g, C3070c0 c3070c0, boolean z5) {
        AbstractC3094x abstractC3094xM5314k = m5314k(view);
        if (abstractC3094xM5314k != null) {
            abstractC3094xM5314k.f9814e = c3070c0;
            if (!z5) {
                abstractC3094xM5314k.mo682c(c3046g);
                z5 = abstractC3094xM5314k.f9813d == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                m5310g(viewGroup.getChildAt(i5), c3046g, c3070c0, z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m5311h(View view, C3070c0 c3070c0, List list) {
        AbstractC3094x abstractC3094xM5314k = m5314k(view);
        if (abstractC3094xM5314k != null) {
            c3070c0 = abstractC3094xM5314k.mo683d(c3070c0, list);
            if (abstractC3094xM5314k.f9813d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                m5311h(viewGroup.getChildAt(i5), c3070c0, list);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m5312i(View view, C3046G c3046g, C2023b c2023b) {
        AbstractC3094x abstractC3094xM5314k = m5314k(view);
        if (abstractC3094xM5314k != null) {
            abstractC3094xM5314k.mo684e(c3046g, c2023b);
            if (abstractC3094xM5314k.f9813d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                m5312i(viewGroup.getChildAt(i5), c3046g, c2023b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static WindowInsets m5313j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static AbstractC3094x m5314k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC3041B) {
            return ((ViewOnApplyWindowInsetsListenerC3041B) tag).f9726a;
        }
        return null;
    }
}
