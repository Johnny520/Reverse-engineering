package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.ljx.wechatmod.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 extends kc0 {
    /* JADX INFO: renamed from: e */
    public static void m1386e(View view) {
        C0407kd c0407kdM1391j = m1391j(view);
        if (c0407kdM1391j != null) {
            ((View) c0407kdM1391j.f2822e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1386e(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1387f(View view, WindowInsets windowInsets, boolean z) {
        C0407kd c0407kdM1391j = m1391j(view);
        if (c0407kdM1391j != null) {
            c0407kdM1391j.f2819b = windowInsets;
            if (!z) {
                View view2 = (View) c0407kdM1391j.f2822e;
                int[] iArr = (int[]) c0407kdM1391j.f2823f;
                view2.getLocationOnScreen(iArr);
                z = true;
                c0407kdM1391j.f2820c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1387f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1388g(View view, bd0 bd0Var, List list) {
        C0407kd c0407kdM1391j = m1391j(view);
        if (c0407kdM1391j != null) {
            c0407kdM1391j.m1676a(bd0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1388g(viewGroup.getChildAt(i), bd0Var, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1389h(View view, C0138d4 c0138d4) {
        C0407kd c0407kdM1391j = m1391j(view);
        if (c0407kdM1391j != null) {
            View view2 = (View) c0407kdM1391j.f2822e;
            int[] iArr = (int[]) c0407kdM1391j.f2823f;
            view2.getLocationOnScreen(iArr);
            int i = c0407kdM1391j.f2820c - iArr[1];
            c0407kdM1391j.f2821d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m1389h(viewGroup.getChildAt(i2), c0138d4);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m1390i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static C0407kd m1391j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof gc0) {
            return ((gc0) tag).f1951a;
        }
        return null;
    }
}
