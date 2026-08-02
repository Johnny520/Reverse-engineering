package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class be3 extends fe3 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f824e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final di0 f825f = new di0();

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f826g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f827h = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: f */
    public static void m515f(ge3 ge3Var, View view) {
        wd3 wd3VarM520k = m520k(view);
        if (wd3VarM520k != null) {
            wd3VarM520k.mo332a(ge3Var);
            if (wd3VarM520k.f12472i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m515f(ge3Var, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m516g(View view, ge3 ge3Var, cf3 cf3Var, boolean z) {
        wd3 wd3VarM520k = m520k(view);
        if (wd3VarM520k != null) {
            wd3VarM520k.f12471h = cf3Var;
            if (!z) {
                wd3VarM520k.mo334c(ge3Var);
                z = wd3VarM520k.f12472i == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m516g(viewGroup.getChildAt(i), ge3Var, cf3Var, z);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m517h(View view, cf3 cf3Var, List list) {
        wd3 wd3VarM520k = m520k(view);
        if (wd3VarM520k != null) {
            cf3Var = wd3VarM520k.mo127d(cf3Var, list);
            if (wd3VarM520k.f12472i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m517h(viewGroup.getChildAt(i), cf3Var, list);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m518i(View view, ge3 ge3Var, dq1 dq1Var) {
        wd3 wd3VarM520k = m520k(view);
        if (wd3VarM520k != null) {
            wd3VarM520k.mo128e(ge3Var, dq1Var);
            if (wd3VarM520k.f12472i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m518i(viewGroup.getChildAt(i), ge3Var, dq1Var);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static WindowInsets m519j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: k */
    public static wd3 m520k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ae3) {
            return ((ae3) tag).f177a;
        }
        return null;
    }
}
