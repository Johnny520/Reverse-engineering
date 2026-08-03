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
    public static final PathInterpolator f8245e = null;

    /* JADX INFO: renamed from: f */
    public static final C1370eh f8246f = null;

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f8247g = null;

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f8248h = null;

    static {
        f8245e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        f8246f = new C1370eh(0);
        f8247g = new DecelerateInterpolator(1.5f);
        f8248h = new AccelerateInterpolator(1.5f);
    }

    /* JADX INFO: renamed from: e */
    public static void m4774e(View r2) {
        C2712xb r0 = m4779j(r2);
        if (r0 == null) goto L7;
        ((View) r0.f9289e).setTranslationY(0.0f);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r22.getChildCount()) goto L14;
        m4774e(r22.getChildAt(r02));
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: f */
    public static void m4775f(View r2, C0489LF r3, boolean r4) {
        C2712xb r0 = m4779j(r2);
        if (r0 == null) goto L8;
        r0.f9286b = r3;
        if (r4 == true) goto L8;
        View r42 = (View) r0.f9289e;
        int[] r1 = (int[]) r0.f9290f;
        r42.getLocationOnScreen(r1);
        r4 = true;
        r0.f9287c = r1[1];
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L11:
        if (r02 >= r22.getChildCount()) goto L15;
        m4775f(r22.getChildAt(r02), r3, r4);
        r02 = r02 + 1;
        goto L11
    L15:
        return;
    }

    /* JADX INFO: renamed from: g */
    public static void m4776g(View r2, C0489LF r3, List r4) {
        C2712xb r0 = m4779j(r2);
        if (r0 == null) goto L7;
        r0.m5285b(r3, r4);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r22.getChildCount()) goto L14;
        m4776g(r22.getChildAt(r02), r3, r4);
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: h */
    public static void m4777h(View r2, C0299Gy r3) {
        C2712xb r0 = m4779j(r2);
        if (r0 == null) goto L7;
        View r22 = (View) r0.f9289e;
        int[] r32 = (int[]) r0.f9290f;
        r22.getLocationOnScreen(r32);
        int r1 = r0.f9287c - r32[1];
        r0.f9288d = r1;
        r22.setTranslationY(r1);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r23 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r23.getChildCount()) goto L14;
        m4777h(r23.getChildAt(r02), r3);
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m4778i(View r1, WindowInsets r2) {
        if (r1.getTag(R.id.tag_on_apply_window_listener) == null) goto L6;
        return r2;
    L6:
        return r1.onApplyWindowInsets(r2);
    }

    /* JADX INFO: renamed from: j */
    public static C2712xb m4779j(View r1) {
        Object r12 = r1.getTag(R.id.tag_window_insets_animation_callback);
        if ((r12 instanceof ViewOnApplyWindowInsetsListenerC2315oF) == true) goto L5;
        return null;
    L5:
        return ((ViewOnApplyWindowInsetsListenerC2315oF) r12).f8158a;
    }
}
