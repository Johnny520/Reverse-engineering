package p006D;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p028P.C0273a;

/* JADX INFO: renamed from: D.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0088Z extends AbstractC0094c0 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f234e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C0273a f235f = new C0273a(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f236g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public static void m306e(View view) {
        C0099f c0099fM311j = m311j(view);
        if (c0099fM311j != null) {
            ((View) c0099fM311j.f261e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m306e(viewGroup.getChildAt(i2));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m307f(View view, WindowInsets windowInsets, boolean z2) {
        C0099f c0099fM311j = m311j(view);
        if (c0099fM311j != null) {
            c0099fM311j.f258b = windowInsets;
            if (!z2) {
                View view2 = (View) c0099fM311j.f261e;
                int[] iArr = (int[]) c0099fM311j.f262f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                c0099fM311j.f259c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m307f(viewGroup.getChildAt(i2), windowInsets, z2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m308g(View view, C0122q0 c0122q0, List list) {
        C0099f c0099fM311j = m311j(view);
        if (c0099fM311j != null) {
            c0099fM311j.m360a(c0122q0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m308g(viewGroup.getChildAt(i2), c0122q0, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m309h(View view, C0002c c0002c) {
        C0099f c0099fM311j = m311j(view);
        if (c0099fM311j != null) {
            View view2 = (View) c0099fM311j.f261e;
            int[] iArr = (int[]) c0099fM311j.f262f;
            view2.getLocationOnScreen(iArr);
            int i2 = c0099fM311j.f259c - iArr[1];
            c0099fM311j.f260d = i2;
            view2.setTranslationY(i2);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m309h(viewGroup.getChildAt(i3), c0002c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m310i(View view, WindowInsets windowInsets) {
        return view.getTag(C1031R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static C0099f m311j(View view) {
        Object tag = view.getTag(C1031R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0087Y) {
            return ((ViewOnApplyWindowInsetsListenerC0087Y) tag).f232a;
        }
        return null;
    }
}
