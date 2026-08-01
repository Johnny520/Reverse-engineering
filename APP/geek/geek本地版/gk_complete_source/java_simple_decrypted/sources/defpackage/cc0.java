package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.ljx.wechatmod.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends fc0 {
    public static void e(View r2) {
        ad r0 = j(r2);
        if (r0 == null) goto L7;
        ((View) r0.e).setTranslationY(0.0f);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r22.getChildCount()) goto L14;
        e(r22.getChildAt(r02));
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    public static void f(View r2, WindowInsets r3, boolean r4) {
        ad r0 = j(r2);
        if (r0 == null) goto L8;
        r0.b = r3;
        if (r4 == true) goto L8;
        View r42 = (View) r0.e;
        int[] r1 = (int[]) r0.f;
        r42.getLocationOnScreen(r1);
        r4 = true;
        r0.c = r1[1];
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L11:
        if (r02 >= r22.getChildCount()) goto L15;
        f(r22.getChildAt(r02), r3, r4);
        r02 = r02 + 1;
        goto L11
    L15:
        return;
    }

    public static void g(View r2, wc0 r3, List r4) {
        ad r0 = j(r2);
        if (r0 == null) goto L7;
        r0.a(r3, r4);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r22.getChildCount()) goto L14;
        g(r22.getChildAt(r02), r3, r4);
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    public static void h(View r2, d4 r3) {
        ad r0 = j(r2);
        if (r0 == null) goto L7;
        View r22 = (View) r0.e;
        int[] r32 = (int[]) r0.f;
        r22.getLocationOnScreen(r32);
        int r1 = r0.c - r32[1];
        r0.d = r1;
        r22.setTranslationY(r1);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r23 = (ViewGroup) r2;
        int r02 = 0;
    L10:
        if (r02 >= r23.getChildCount()) goto L14;
        h(r23.getChildAt(r02), r3);
        r02 = r02 + 1;
        goto L10
    L14:
        return;
    }

    public static WindowInsets i(View r1, WindowInsets r2) {
        if (r1.getTag(R.id.tag_on_apply_window_listener) == null) goto L6;
        return r2;
    L6:
        return r1.onApplyWindowInsets(r2);
    }

    public static ad j(View r1) {
        Object r12 = r1.getTag(R.id.tag_window_insets_animation_callback);
        if ((r12 instanceof bc0) == true) goto L5;
        return null;
    L5:
        return ((bc0) r12).a;
    }
}
