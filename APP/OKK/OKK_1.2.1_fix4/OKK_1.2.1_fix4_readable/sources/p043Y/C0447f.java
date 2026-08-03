package p043Y;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: Y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0447f extends AbstractC0454m {

    /* JADX INFO: renamed from: A */
    public static final String[] f984A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: B */
    public static final C0443b f985B = new C0443b(PointF.class, "topLeft", 0);

    /* JADX INFO: renamed from: C */
    public static final C0443b f986C = new C0443b(PointF.class, "bottomRight", 1);

    /* JADX INFO: renamed from: D */
    public static final C0443b f987D = new C0443b(PointF.class, "bottomRight", 2);

    /* JADX INFO: renamed from: E */
    public static final C0443b f988E = new C0443b(PointF.class, "topLeft", 3);

    /* JADX INFO: renamed from: F */
    public static final C0443b f989F = new C0443b(PointF.class, "position", 4);

    /* JADX INFO: renamed from: I */
    public static void m1065I(C0462u c0462u) {
        View view = c0462u.f1042b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c0462u.f1041a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c0462u.f1042b.getParent());
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u c0462u) {
        m1065I(c0462u);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u c0462u) {
        m1065I(c0462u);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: k */
    public final Animator mo1066k(ViewGroup viewGroup, C0462u c0462u, C0462u c0462u2) {
        int i2;
        Animator animatorM1074a;
        if (c0462u == null || c0462u2 == null) {
            return null;
        }
        HashMap map = c0462u.f1041a;
        HashMap map2 = c0462u2.f1041a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        View view = c0462u2.f1042b;
        AbstractC0465x.m1095a(view, i3, i5, i7, i9);
        if (i2 == 2) {
            if (i11 == i13 && i12 == i14) {
                this.f1030v.getClass();
                animatorM1074a = AbstractC0450i.m1074a(view, f989F, C1121e.m2636c(i3, i5, i4, i6));
            } else {
                C0446e c0446e = new C0446e(view);
                this.f1030v.getClass();
                ObjectAnimator objectAnimatorM1074a = AbstractC0450i.m1074a(c0446e, f985B, C1121e.m2636c(i3, i5, i4, i6));
                this.f1030v.getClass();
                ObjectAnimator objectAnimatorM1074a2 = AbstractC0450i.m1074a(c0446e, f986C, C1121e.m2636c(i7, i9, i8, i10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM1074a, objectAnimatorM1074a2);
                animatorSet.addListener(new C0444c(c0446e));
                animatorM1074a = animatorSet;
            }
        } else if (i3 == i4 && i5 == i6) {
            this.f1030v.getClass();
            animatorM1074a = AbstractC0450i.m1074a(view, f987D, C1121e.m2636c(i7, i9, i8, i10));
        } else {
            this.f1030v.getClass();
            animatorM1074a = AbstractC0450i.m1074a(view, f988E, C1121e.m2636c(i3, i5, i4, i6));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0358S.m911t0(viewGroup4, true);
            m1085o().m1079a(new C0445d(viewGroup4));
        }
        return animatorM1074a;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: q */
    public final String[] mo1067q() {
        return f984A;
    }
}
