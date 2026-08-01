package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pj extends defpackage.r70 {
    public static final java.lang.String[] x = null;
    public final int w;

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            defpackage.pj.x = r0
            return
    }

    public pj() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.w = r0
            return
    }

    public pj(int r1) {
            r0 = this;
            r0.<init>()
            r0.w = r1
            return
    }

    public static void F(defpackage.x70 r3) {
            android.view.View r0 = r3.b
            int r1 = r0.getVisibility()
            java.util.HashMap r3 = r3.a
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r2, r1)
            java.lang.String r1 = "android:visibility:parent"
            android.view.ViewParent r2 = r0.getParent()
            r3.put(r1, r2)
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            java.lang.String r0 = "android:visibility:screenLocation"
            r3.put(r0, r1)
            return
    }

    public static defpackage.kb0 H(defpackage.x70 r8, defpackage.x70 r9) {
            kb0 r0 = new kb0
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
    }

    public final android.animation.ObjectAnimator G(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            db0 r0 = defpackage.bb0.a
            r0.N(r3, r4)
            x8 r4 = defpackage.bb0.b
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            oj r5 = new oj
            r5.<init>(r3)
            r4.addListener(r5)
            nj r5 = new nj
            r5.<init>(r1, r3)
            r2.a(r5)
            return r4
    }

    @Override // defpackage.r70
    public final void c(defpackage.x70 r1) {
            r0 = this;
            F(r1)
            return
    }

    @Override // defpackage.r70
    public final void f(defpackage.x70 r3) {
            r2 = this;
            F(r3)
            java.util.HashMap r0 = r3.a
            android.view.View r3 = r3.b
            db0 r1 = defpackage.bb0.a
            float r3 = r1.x(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r1 = "android:fade:transitionAlpha"
            r0.put(r1, r3)
            return
    }

    @Override // defpackage.r70
    public final android.animation.Animator j(android.view.ViewGroup r24, defpackage.x70 r25, defpackage.x70 r26) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            kb0 r4 = H(r25, r26)
            boolean r5 = r4.a
            if (r5 == 0) goto L19
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L1e
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L19
            goto L1e
        L19:
            r3 = r0
            r16 = 0
            goto L2fb
        L1e:
            boolean r5 = r4.b
            int r7 = r0.w
            java.lang.String r8 = "android:fade:transitionAlpha"
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 1
            r12 = 0
            if (r5 == 0) goto L6a
            r1 = r7 & 1
            if (r1 != r11) goto L19
            if (r3 != 0) goto L32
            goto L19
        L32:
            android.view.View r1 = r3.b
            if (r2 != 0) goto L4d
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            x70 r4 = r0.m(r3, r12)
            x70 r3 = r0.p(r3, r12)
            kb0 r3 = H(r4, r3)
            boolean r3 = r3.a
            if (r3 == 0) goto L4d
            goto L19
        L4d:
            if (r2 == 0) goto L5e
            java.util.HashMap r2 = r2.a
            java.lang.Object r2 = r2.get(r8)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L5e
            float r2 = r2.floatValue()
            goto L5f
        L5e:
            r2 = r10
        L5f:
            int r3 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L65
        L64:
            r10 = r2
        L65:
            android.animation.ObjectAnimator r1 = r0.G(r1, r10, r9)
            return r1
        L6a:
            int r4 = r4.d
            r5 = 2
            r7 = r7 & r5
            if (r7 == r5) goto L71
            goto L19
        L71:
            if (r2 != 0) goto L74
            goto L19
        L74:
            java.util.HashMap r7 = r2.a
            android.view.View r2 = r2.b
            if (r3 == 0) goto L7d
            android.view.View r3 = r3.b
            goto L7e
        L7d:
            r3 = 0
        L7e:
            r13 = 2131296586(0x7f09014a, float:1.8211093E38)
            java.lang.Object r14 = r2.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L98
            r22 = r4
            r19 = r8
            r18 = r11
            r17 = r12
            r6 = 0
            r16 = 0
            r12 = r18
            goto L24f
        L98:
            if (r3 == 0) goto Laf
            android.view.ViewParent r14 = r3.getParent()
            if (r14 != 0) goto La1
            goto Laf
        La1:
            r14 = 4
            if (r4 != r14) goto La5
            goto La7
        La5:
            if (r2 != r3) goto Lab
        La7:
            r14 = r3
            r15 = r12
            r3 = 0
            goto Lb3
        Lab:
            r15 = r11
            r3 = 0
        Lad:
            r14 = 0
            goto Lb3
        Laf:
            if (r3 == 0) goto Lab
            r15 = r12
            goto Lad
        Lb3:
            if (r15 == 0) goto L241
            android.view.ViewParent r15 = r2.getParent()
            if (r15 != 0) goto Lc9
            r22 = r4
            r19 = r8
            r18 = r11
            r17 = r12
            r6 = r14
            r16 = 0
            r14 = r2
            goto L24f
        Lc9:
            android.view.ViewParent r15 = r2.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L241
            android.view.ViewParent r15 = r2.getParent()
            android.view.View r15 = (android.view.View) r15
            r16 = 0
            x70 r6 = r0.p(r15, r11)
            r17 = r12
            x70 r12 = r0.m(r15, r11)
            kb0 r6 = H(r6, r12)
            boolean r6 = r6.a
            if (r6 != 0) goto L228
            boolean r3 = defpackage.w70.a
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r6 = r15.getScrollX()
            int r6 = -r6
            float r6 = (float) r6
            int r12 = r15.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r3.setTranslate(r6, r12)
            db0 r6 = defpackage.bb0.a
            r6.U(r2, r3)
            r6.V(r1, r3)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r12 = r2.getWidth()
            float r12 = (float) r12
            int r15 = r2.getHeight()
            float r15 = (float) r15
            r6.<init>(r10, r10, r12, r15)
            r3.mapRect(r6)
            float r12 = r6.left
            int r12 = java.lang.Math.round(r12)
            float r15 = r6.top
            int r15 = java.lang.Math.round(r15)
            r18 = r11
            float r11 = r6.right
            int r11 = java.lang.Math.round(r11)
            float r13 = r6.bottom
            int r13 = java.lang.Math.round(r13)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r5 = r2.getContext()
            r10.<init>(r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r5)
            boolean r5 = defpackage.w70.a
            if (r5 == 0) goto L157
            boolean r5 = r2.isAttachedToWindow()
            r5 = r5 ^ 1
            if (r1 != 0) goto L152
            r19 = r17
            goto L15b
        L152:
            boolean r19 = r1.isAttachedToWindow()
            goto L15b
        L157:
            r5 = r17
            r19 = r5
        L15b:
            boolean r20 = defpackage.w70.b
            if (r20 == 0) goto L185
            if (r5 == 0) goto L185
            if (r19 != 0) goto L16d
            r22 = r4
            r19 = r8
            r21 = r14
            r0 = r16
            goto L209
        L16d:
            android.view.ViewParent r19 = r2.getParent()
            r9 = r19
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r19 = r9.indexOfChild(r2)
            r26 = r5
            android.view.ViewGroupOverlay r5 = r1.getOverlay()
            r5.add(r2)
            r5 = r19
            goto L18b
        L185:
            r26 = r5
            r9 = r16
            r5 = r17
        L18b:
            float r19 = r6.width()
            r21 = r14
            int r14 = java.lang.Math.round(r19)
            float r19 = r6.height()
            r22 = r4
            int r4 = java.lang.Math.round(r19)
            if (r14 <= 0) goto L1f7
            if (r4 <= 0) goto L1f7
            int r0 = r14 * r4
            float r0 = (float) r0
            r19 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r19 / r0
            r19 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r8, r0)
            float r14 = (float) r14
            float r14 = r14 * r0
            int r14 = java.lang.Math.round(r14)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r8 = r6.left
            float r8 = -r8
            float r6 = r6.top
            float r6 = -r6
            r3.postTranslate(r8, r6)
            r3.postScale(r0, r0)
            boolean r0 = defpackage.w70.c
            if (r0 == 0) goto L1e5
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r4 = r0.beginRecording(r14, r4)
            r4.concat(r3)
            r2.draw(r4)
            r0.endRecording()
            android.graphics.Bitmap r0 = defpackage.c0.d(r0)
            goto L1fb
        L1e5:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r14, r4, r0)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r4.concat(r3)
            r2.draw(r4)
            goto L1fb
        L1f7:
            r19 = r8
            r0 = r16
        L1fb:
            if (r20 == 0) goto L209
            if (r26 == 0) goto L209
            android.view.ViewGroupOverlay r3 = r1.getOverlay()
            r3.remove(r2)
            r9.addView(r2, r5)
        L209:
            if (r0 == 0) goto L20e
            r10.setImageBitmap(r0)
        L20e:
            int r0 = r11 - r12
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r4 = r13 - r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r10.measure(r0, r3)
            r10.layout(r12, r15, r11, r13)
            r14 = r10
        L223:
            r12 = r17
            r6 = r21
            goto L24f
        L228:
            r22 = r4
            r19 = r8
            r18 = r11
            r21 = r14
            int r0 = r15.getId()
            android.view.ViewParent r4 = r15.getParent()
            if (r4 != 0) goto L24d
            r4 = -1
            if (r0 == r4) goto L24d
            r1.findViewById(r0)
            goto L24d
        L241:
            r22 = r4
            r19 = r8
            r18 = r11
            r17 = r12
            r21 = r14
            r16 = 0
        L24d:
            r14 = r3
            goto L223
        L24f:
            if (r14 == 0) goto L2bb
            if (r12 != 0) goto L282
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r7.get(r0)
            int[] r0 = (int[]) r0
            r3 = r0[r17]
            r0 = r0[r18]
            r4 = 2
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r5 = r4[r17]
            int r3 = r3 - r5
            int r5 = r14.getLeft()
            int r3 = r3 - r5
            r14.offsetLeftAndRight(r3)
            r3 = r4[r18]
            int r0 = r0 - r3
            int r3 = r14.getTop()
            int r0 = r0 - r3
            r14.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r14)
        L282:
            db0 r0 = defpackage.bb0.a
            r0.getClass()
            r0 = r19
            java.lang.Object r0 = r7.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L299
            float r9 = r0.floatValue()
        L295:
            r0 = 0
            r3 = r23
            goto L29c
        L299:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L295
        L29c:
            android.animation.ObjectAnimator r0 = r3.G(r14, r9, r0)
            if (r12 != 0) goto L2ba
            if (r0 != 0) goto L2ac
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r1.remove(r14)
            return r0
        L2ac:
            r4 = 2131296586(0x7f09014a, float:1.8211093E38)
            r2.setTag(r4, r14)
            ib0 r4 = new ib0
            r4.<init>(r3, r1, r14, r2)
            r3.a(r4)
        L2ba:
            return r0
        L2bb:
            r3 = r23
            r0 = r19
            if (r6 == 0) goto L2fb
            int r1 = r6.getVisibility()
            db0 r2 = defpackage.bb0.a
            r4 = r17
            r2.O(r6, r4)
            r2.getClass()
            java.lang.Object r0 = r7.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L2dd
            float r9 = r0.floatValue()
        L2db:
            r0 = 0
            goto L2e0
        L2dd:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L2db
        L2e0:
            android.animation.ObjectAnimator r0 = r3.G(r6, r9, r0)
            if (r0 == 0) goto L2f7
            jb0 r1 = new jb0
            r2 = r22
            r1.<init>(r6, r2)
            r0.addListener(r1)
            r0.addPauseListener(r1)
            r3.a(r1)
            return r0
        L2f7:
            r2.O(r6, r1)
            return r0
        L2fb:
            return r16
    }

    @Override // defpackage.r70
    public final java.lang.String[] o() {
            r1 = this;
            java.lang.String[] r0 = defpackage.pj.x
            return r0
    }

    @Override // defpackage.r70
    public final boolean q(defpackage.x70 r4, defpackage.x70 r5) {
            r3 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            goto L2c
        L5:
            if (r4 == 0) goto L1a
            if (r5 == 0) goto L1a
            java.util.HashMap r0 = r5.a
            java.lang.String r1 = "android:visibility:visibility"
            boolean r0 = r0.containsKey(r1)
            java.util.HashMap r2 = r4.a
            boolean r1 = r2.containsKey(r1)
            if (r0 == r1) goto L1a
            goto L2c
        L1a:
            kb0 r4 = H(r4, r5)
            boolean r5 = r4.a
            if (r5 == 0) goto L2c
            int r5 = r4.c
            if (r5 == 0) goto L2a
            int r4 = r4.d
            if (r4 != 0) goto L2c
        L2a:
            r4 = 1
            return r4
        L2c:
            r4 = 0
            return r4
    }
}
