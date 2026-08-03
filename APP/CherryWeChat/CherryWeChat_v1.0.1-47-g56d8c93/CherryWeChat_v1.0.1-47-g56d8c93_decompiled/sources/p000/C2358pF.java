package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import io.github.cherrywechat.R;
import java.util.List;

/* JADX INFO: renamed from: pF */
/* JADX INFO: loaded from: classes.dex */
public final class C2358pF extends AbstractC2495sF {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f8245e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C1370eh f8246f = new C1370eh(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f8247g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f8248h = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: e */
    public static void m4774e(View view) {
        C2712xb c2712xbM4779j = m4779j(view);
        if (c2712xbM4779j != null) {
            ((View) c2712xbM4779j.f9289e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4774e(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m4775f(View view, C0489LF c0489lf, boolean z) {
        C2712xb c2712xbM4779j = m4779j(view);
        if (c2712xbM4779j != null) {
            c2712xbM4779j.f9286b = c0489lf;
            if (!z) {
                View view2 = (View) c2712xbM4779j.f9289e;
                int[] iArr = (int[]) c2712xbM4779j.f9290f;
                view2.getLocationOnScreen(iArr);
                z = true;
                c2712xbM4779j.f9287c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4775f(viewGroup.getChildAt(i), c0489lf, z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4776g(View view, C0489LF c0489lf, List list) {
        C2712xb c2712xbM4779j = m4779j(view);
        if (c2712xbM4779j != null) {
            c2712xbM4779j.m5285b(c0489lf, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4776g(viewGroup.getChildAt(i), c0489lf, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m4777h(View view, C0299Gy c0299Gy) {
        C2712xb c2712xbM4779j = m4779j(view);
        if (c2712xbM4779j != null) {
            View view2 = (View) c2712xbM4779j.f9289e;
            int[] iArr = (int[]) c2712xbM4779j.f9290f;
            view2.getLocationOnScreen(iArr);
            int i = c2712xbM4779j.f9287c - iArr[1];
            c2712xbM4779j.f9288d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m4777h(viewGroup.getChildAt(i2), c0299Gy);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m4778i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static C2712xb m4779j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2315oF) {
            return ((ViewOnApplyWindowInsetsListenerC2315oF) tag).f8158a;
        }
        return null;
    }
}
