package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b9 extends r70 {
    public static final x8 A = null;
    public static final x8 B = null;
    public static final String[] w = null;
    public static final x8 x = null;
    public static final x8 y = null;
    public static final x8 z = null;

    static {
        w = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        w8 r0 = new w8(PointF.class, "boundsOrigin");
        r0.a = new Rect();
        x = new x8(PointF.class, "topLeft", 0);
        y = new x8(PointF.class, "bottomRight", 1);
        z = new x8(PointF.class, "bottomRight", 2);
        A = new x8(PointF.class, "topLeft", 3);
        B = new x8(PointF.class, "position", 4);
    }

    public static void F(x70 r6) {
        View r0 = r6.b;
        HashMap r62 = r6.a;
        WeakHashMap r1 = ja0.a;
        if (v90.c(r0) == false) goto L5;
    L10:
        r62.put("android:changeBounds:bounds", new Rect(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom()));
        r62.put("android:changeBounds:parent", r0.getParent());
        return;
    L5:
        if (r0.getWidth() != 0) goto L10;
        if (r0.getHeight() != 0) goto L10;
    }

    @Override // defpackage.r70
    public final void c(x70 r1) {
        F(r1);
    }

    @Override // defpackage.r70
    public final void f(x70 r1) {
        F(r1);
    }

    @Override // defpackage.r70
    public final Animator j(ViewGroup r19, x70 r20, x70 r21) {
        if (r20 == null) goto L49;
        HashMap r1 = r20.a;
        if (r21 == null) goto L49;
        HashMap r4 = r21.a;
        ViewGroup r6 = (ViewGroup) r1.get("android:changeBounds:parent");
        ViewGroup r5 = (ViewGroup) r4.get("android:changeBounds:parent");
        if (r6 == null) goto L49;
        if (r5 == null) goto L49;
        View r2 = r21.b;
        Rect r62 = (Rect) r1.get("android:changeBounds:bounds");
        Rect r52 = (Rect) r4.get("android:changeBounds:bounds");
        int r7 = r62.left;
        int r8 = r52.left;
        int r9 = r62.top;
        int r10 = r52.top;
        int r11 = r62.right;
        int r12 = r52.right;
        int r63 = r62.bottom;
        int r53 = r52.bottom;
        int r13 = r11 - r7;
        int r14 = r63 - r9;
        int r15 = r12 - r8;
        int r3 = r53 - r10;
        Rect r16 = (Rect) r1.get("android:changeBounds:clip");
        Rect r0 = (Rect) r4.get("android:changeBounds:clip");
        if (r13 == 0) goto L14;
        if (r14 == 0) goto L14;
    L16:
        if (r7 != r8) goto L20;
        if (r9 != r10) goto L20;
        int r162 = 0;
    L21:
        if (r11 != r12) goto L23;
        if (r63 != r53) goto L23;
    L25:
        if (r16 != null) goto L27;
    L28:
        if (r16 != null) goto L31;
        if (r0 == null) goto L31;
    L30:
        r162 = r162 + 1;
    L31:
        int r02 = r162;
        if (r02 <= 0) goto L49;
        bb0.a(r2, r7, r9, r11, r63);
        if (r02 != 2) goto L39;
        if (r13 != r15) goto L38;
        if (r14 != r3) goto L38;
        b9 r03 = this;
        r03.s.getClass();
        Animator r17 = ObjectAnimator.ofObject(r2, B, null, iy.a(r7, r9, r8, r10));
    L46:
        if ((r2.getParent() instanceof ViewGroup) == false) goto L48;
        ViewGroup r22 = (ViewGroup) r2.getParent();
        zt.Q(r22, true);
        r03.a(new z8(r22));
    L48:
        return r17;
    L38:
        r03 = this;
        a9 r32 = new a9();
        r32.e = r2;
        r03.s.getClass();
        ObjectAnimator r72 = ObjectAnimator.ofObject(r32, x, null, iy.a(r7, r9, r8, r10));
        r03.s.getClass();
        ObjectAnimator r54 = ObjectAnimator.ofObject(r32, y, null, iy.a(r11, r63, r12, r53));
        AnimatorSet r64 = new AnimatorSet();
        r64.playTogether(new Animator[]{r72, r54});
        r64.addListener(new y8(r32));
        r17 = r64;
        goto L46
    L39:
        r03 = this;
        if (r7 != r8) goto L44;
        if (r9 != r10) goto L44;
        r03.s.getClass();
        r17 = ObjectAnimator.ofObject(r2, z, null, iy.a(r11, r63, r12, r53));
    L44:
        r03.s.getClass();
        r17 = ObjectAnimator.ofObject(r2, A, null, iy.a(r7, r9, r8, r10));
        goto L46
    L27:
        if (r16.equals(r0) == false) goto L30;
    L23:
        r162 = r162 + 1;
    L20:
        r162 = 1;
    L14:
        if (r15 == 0) goto L24;
        if (r3 != 0) goto L16;
    L24:
        r162 = 0;
    L49:
        return null;
    }

    @Override // defpackage.r70
    public final String[] o() {
        return w;
    }
}
