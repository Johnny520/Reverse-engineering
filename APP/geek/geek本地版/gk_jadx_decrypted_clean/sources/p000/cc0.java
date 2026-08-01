package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.ljx.wechatmod.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends fc0 {
    /* JADX INFO: renamed from: e */
    public static void m668e(View view) {
        C0014ad c0014adM673j = m673j(view);
        if (c0014adM673j != null) {
            ((View) c0014adM673j.f134e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m668e(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m669f(View view, WindowInsets windowInsets, boolean z) {
        C0014ad c0014adM673j = m673j(view);
        if (c0014adM673j != null) {
            c0014adM673j.f131b = windowInsets;
            if (!z) {
                View view2 = (View) c0014adM673j.f134e;
                int[] iArr = (int[]) c0014adM673j.f135f;
                view2.getLocationOnScreen(iArr);
                z = true;
                c0014adM673j.f132c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m669f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m670g(View view, wc0 wc0Var, List list) {
        C0014ad c0014adM673j = m673j(view);
        if (c0014adM673j != null) {
            c0014adM673j.m87a(wc0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m670g(viewGroup.getChildAt(i), wc0Var, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m671h(View view, C0138d4 c0138d4) {
        C0014ad c0014adM673j = m673j(view);
        if (c0014adM673j != null) {
            View view2 = (View) c0014adM673j.f134e;
            int[] iArr = (int[]) c0014adM673j.f135f;
            view2.getLocationOnScreen(iArr);
            int i = c0014adM673j.f132c - iArr[1];
            c0014adM673j.f133d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m671h(viewGroup.getChildAt(i2), c0138d4);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m672i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static C0014ad m673j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof bc0) {
            return ((bc0) tag).f807a;
        }
        return null;
    }
}
