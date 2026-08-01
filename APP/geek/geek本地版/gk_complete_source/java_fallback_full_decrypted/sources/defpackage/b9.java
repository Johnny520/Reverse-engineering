package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b9 extends defpackage.r70 {
    public static final defpackage.x8 A = null;
    public static final defpackage.x8 B = null;
    public static final java.lang.String[] w = null;
    public static final defpackage.x8 x = null;
    public static final defpackage.x8 y = null;
    public static final defpackage.x8 z = null;

    static {
            java.lang.String r0 = "android:changeBounds:windowX"
            java.lang.String r1 = "android:changeBounds:windowY"
            java.lang.String r2 = "android:changeBounds:bounds"
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.String r4 = "android:changeBounds:parent"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            defpackage.b9.w = r0
            w8 r0 = new w8
            java.lang.String r1 = "boundsOrigin"
            java.lang.Class<android.graphics.PointF> r2 = android.graphics.PointF.class
            r0.<init>(r2, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.a = r1
            x8 r0 = new x8
            r1 = 0
            java.lang.String r3 = "topLeft"
            r0.<init>(r2, r3, r1)
            defpackage.b9.x = r0
            x8 r0 = new x8
            r1 = 1
            java.lang.String r4 = "bottomRight"
            r0.<init>(r2, r4, r1)
            defpackage.b9.y = r0
            x8 r0 = new x8
            r1 = 2
            r0.<init>(r2, r4, r1)
            defpackage.b9.z = r0
            x8 r0 = new x8
            r1 = 3
            r0.<init>(r2, r3, r1)
            defpackage.b9.A = r0
            x8 r0 = new x8
            java.lang.String r1 = "position"
            r3 = 4
            r0.<init>(r2, r1, r3)
            defpackage.b9.B = r0
            return
    }

    public static void F(defpackage.x70 r6) {
            android.view.View r0 = r6.b
            java.util.HashMap r6 = r6.a
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r1 = defpackage.v90.c(r0)
            if (r1 != 0) goto L1a
            int r1 = r0.getWidth()
            if (r1 != 0) goto L1a
            int r1 = r0.getHeight()
            if (r1 == 0) goto L19
            goto L1a
        L19:
            return
        L1a:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r2 = "android:changeBounds:bounds"
            r6.put(r2, r1)
            java.lang.String r1 = "android:changeBounds:parent"
            android.view.ViewParent r0 = r0.getParent()
            r6.put(r1, r0)
            return
    }

    @Override // defpackage.r70
    public final void c(defpackage.x70 r1) {
            r0 = this;
            F(r1)
            return
    }

    @Override // defpackage.r70
    public final void f(defpackage.x70 r1) {
            r0 = this;
            F(r1)
            return
    }

    @Override // defpackage.r70
    public final android.animation.Animator j(android.view.ViewGroup r19, defpackage.x70 r20, defpackage.x70 r21) {
            r18 = this;
            r1 = r20
            r2 = r21
            if (r1 == 0) goto La
            java.util.HashMap r1 = r1.a
            if (r2 != 0) goto Lf
        La:
            r0 = r18
            r5 = 0
            goto L13e
        Lf:
            java.util.HashMap r4 = r2.a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r6 = r1.get(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r4.get(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r6 == 0) goto La
            if (r5 != 0) goto L24
            goto La
        L24:
            android.view.View r2 = r2.b
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r6 = r1.get(r5)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            java.lang.Object r5 = r4.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.left
            int r8 = r5.left
            int r9 = r6.top
            int r10 = r5.top
            int r11 = r6.right
            int r12 = r5.right
            int r6 = r6.bottom
            int r5 = r5.bottom
            int r13 = r11 - r7
            int r14 = r6 - r9
            int r15 = r12 - r8
            int r3 = r5 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r4.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r20 = 0
            r4 = 1
            if (r13 == 0) goto L61
            if (r14 != 0) goto L65
        L61:
            if (r15 == 0) goto L76
            if (r3 == 0) goto L76
        L65:
            if (r7 != r8) goto L6d
            if (r9 == r10) goto L6a
            goto L6d
        L6a:
            r16 = r20
            goto L6f
        L6d:
            r16 = r4
        L6f:
            if (r11 != r12) goto L73
            if (r6 == r5) goto L78
        L73:
            int r16 = r16 + 1
            goto L78
        L76:
            r16 = r20
        L78:
            if (r1 == 0) goto L80
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L84
        L80:
            if (r1 != 0) goto L86
            if (r0 == 0) goto L86
        L84:
            int r16 = r16 + 1
        L86:
            r0 = r16
            if (r0 <= 0) goto La
            defpackage.bb0.a(r2, r7, r9, r11, r6)
            r1 = 2
            if (r0 != r1) goto Lf4
            if (r13 != r15) goto Lac
            if (r14 != r3) goto Lac
            r0 = r18
            iy r1 = r0.s
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            r1.getClass()
            android.graphics.Path r1 = defpackage.iy.a(r3, r5, r6, r7)
            x8 r3 = defpackage.b9.B
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
            goto L124
        Lac:
            r0 = r18
            a9 r3 = new a9
            r3.<init>()
            r3.e = r2
            iy r13 = r0.s
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            r13.getClass()
            android.graphics.Path r7 = defpackage.iy.a(r7, r9, r8, r10)
            x8 r8 = defpackage.b9.x
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            iy r8 = r0.s
            float r10 = (float) r11
            float r6 = (float) r6
            float r11 = (float) r12
            float r5 = (float) r5
            r8.getClass()
            android.graphics.Path r5 = defpackage.iy.a(r10, r6, r11, r5)
            x8 r6 = defpackage.b9.y
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r20] = r7
            r1[r4] = r5
            r6.playTogether(r1)
            y8 r1 = new y8
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L124
        Lf4:
            r0 = r18
            if (r7 != r8) goto Lfa
            if (r9 == r10) goto Lfc
        Lfa:
            r5 = 0
            goto L111
        Lfc:
            iy r1 = r0.s
            float r3 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r12
            float r5 = (float) r5
            r1.getClass()
            android.graphics.Path r1 = defpackage.iy.a(r3, r6, r7, r5)
            x8 r3 = defpackage.b9.z
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
            goto L124
        L111:
            iy r1 = r0.s
            float r3 = (float) r7
            float r6 = (float) r9
            float r7 = (float) r8
            float r8 = (float) r10
            r1.getClass()
            android.graphics.Path r1 = defpackage.iy.a(r3, r6, r7, r8)
            x8 r3 = defpackage.b9.A
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
        L124:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L13d
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            defpackage.zt.Q(r2, r4)
            z8 r3 = new z8
            r3.<init>(r2)
            r0.a(r3)
        L13d:
            return r1
        L13e:
            return r5
    }

    @Override // defpackage.r70
    public final java.lang.String[] o() {
            r1 = this;
            java.lang.String[] r0 = defpackage.b9.w
            return r0
    }
}
