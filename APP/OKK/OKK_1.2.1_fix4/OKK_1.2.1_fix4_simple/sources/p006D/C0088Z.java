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
    public static final PathInterpolator f234e = null;

    /* JADX INFO: renamed from: f */
    public static final C0273a f235f = null;

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f236g = null;

    static {
        f234e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        f235f = new C0273a(0);
        f236g = new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: e */
    public static void m306e(View r2) {
        C0099f r02 = m311j(r2);
        if (r02 == null) goto L7;
        ((View) r02.f261e).setTranslationY(0.0f);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r03 = 0;
    L10:
        if (r03 >= r22.getChildCount()) goto L14;
        m306e(r22.getChildAt(r03));
        r03 = r03 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: f */
    public static void m307f(View r2, WindowInsets r3, boolean r4) {
        C0099f r02 = m311j(r2);
        if (r02 == null) goto L8;
        r02.f258b = r3;
        if (r4 == true) goto L8;
        View r42 = (View) r02.f261e;
        int[] r1 = (int[]) r02.f262f;
        r42.getLocationOnScreen(r1);
        r4 = true;
        r02.f259c = r1[1];
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r22 = (ViewGroup) r2;
        int r03 = 0;
    L11:
        if (r03 >= r22.getChildCount()) goto L15;
        m307f(r22.getChildAt(r03), r3, r4);
        r03 = r03 + 1;
        goto L11
    L15:
        return;
    }

    /* JADX INFO: renamed from: g */
    public static void m308g(View r2, C0122q0 r3, List r4) {
        C0099f r02 = m311j(r2);
        if (r02 == null) goto L7;
        r02.m360a(r3, r4);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r22 = (ViewGroup) r2;
        int r03 = 0;
    L10:
        if (r03 >= r22.getChildCount()) goto L14;
        m308g(r22.getChildAt(r03), r3, r4);
        r03 = r03 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: h */
    public static void m309h(View r2, C0002c r3) {
        C0099f r02 = m311j(r2);
        if (r02 == null) goto L7;
        View r22 = (View) r02.f261e;
        int[] r32 = (int[]) r02.f262f;
        r22.getLocationOnScreen(r32);
        int r1 = r02.f259c - r32[1];
        r02.f260d = r1;
        r22.setTranslationY(r1);
        return;
    L7:
        if ((r2 instanceof ViewGroup) == false) goto L12;
        ViewGroup r23 = (ViewGroup) r2;
        int r03 = 0;
    L10:
        if (r03 >= r23.getChildCount()) goto L14;
        m309h(r23.getChildAt(r03), r3);
        r03 = r03 + 1;
        goto L10
    L14:
        return;
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m310i(View r1, WindowInsets r2) {
        if (r1.getTag(C1031R.id.tag_on_apply_window_listener) == null) goto L6;
        return r2;
    L6:
        return r1.onApplyWindowInsets(r2);
    }

    /* JADX INFO: renamed from: j */
    public static C0099f m311j(View r1) {
        Object r12 = r1.getTag(C1031R.id.tag_window_insets_animation_callback);
        if ((r12 instanceof ViewOnApplyWindowInsetsListenerC0087Y) == true) goto L7;
        return null;
    L7:
        return ((ViewOnApplyWindowInsetsListenerC0087Y) r12).f232a;
    }
}
