package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends androidx.transition.e {
    public static final java.lang.String[] D = null;
    public int C;

    public static class a extends android.animation.AnimatorListenerAdapter implements androidx.transition.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f1034a;
        public final int b;
        public final android.view.ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f;

        public a(android.view.View r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f = r0
                r1.f1034a = r2
                r1.b = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.c = r2
                r2 = 1
                r1.d = r2
                r1.h(r2)
                return
        }

        @Override // androidx.transition.e.f
        public final void c() {
                r2 = this;
                r0 = 0
                r2.h(r0)
                boolean r0 = r2.f
                if (r0 != 0) goto Lf
                android.view.View r0 = r2.f1034a
                int r1 = r2.b
                a.Qg.b(r0, r1)
            Lf:
                return
        }

        @Override // androidx.transition.e.f
        public final void d(androidx.transition.e r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.e.f
        public final void e(androidx.transition.e r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.e.f
        public final void f(androidx.transition.e r1) {
                r0 = this;
                r1.y(r0)
                return
        }

        @Override // androidx.transition.e.f
        public final void g() {
                r2 = this;
                r0 = 1
                r2.h(r0)
                boolean r0 = r2.f
                if (r0 != 0) goto Le
                android.view.View r0 = r2.f1034a
                r1 = 0
                a.Qg.b(r0, r1)
            Le:
                return
        }

        public final void h(boolean r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L11
                boolean r0 = r1.e
                if (r0 == r2) goto L11
                android.view.ViewGroup r0 = r1.c
                if (r0 == 0) goto L11
                r1.e = r2
                a.Ag.a(r0, r2)
            L11:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f
                if (r2 != 0) goto L12
                android.view.View r2 = r1.f1034a
                int r0 = r1.b
                a.Qg.b(r2, r0)
                android.view.ViewGroup r2 = r1.c
                if (r2 == 0) goto L12
                r2.invalidate()
            L12:
                r2 = 0
                r1.h(r2)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L18
                boolean r1 = r0.f
                if (r1 != 0) goto L14
                android.view.View r1 = r0.f1034a
                int r2 = r0.b
                a.Qg.b(r1, r2)
                android.view.ViewGroup r1 = r0.c
                if (r1 == 0) goto L14
                r1.invalidate()
            L14:
                r1 = 0
                r0.h(r1)
            L18:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto Lf
                android.view.View r1 = r0.f1034a
                r2 = 0
                a.Qg.b(r1, r2)
                android.view.ViewGroup r1 = r0.c
                if (r1 == 0) goto Lf
                r1.invalidate()
            Lf:
                return
        }
    }

    public class b extends android.animation.AnimatorListenerAdapter implements androidx.transition.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.FrameLayout f1035a;
        public final android.view.View b;
        public final android.view.View c;
        public boolean d;
        public final /* synthetic */ androidx.transition.i e;

        public b(androidx.transition.i r1, android.widget.FrameLayout r2, android.view.View r3, android.view.View r4) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r1 = 1
                r0.d = r1
                r0.f1035a = r2
                r0.b = r3
                r0.c = r4
                return
        }

        @Override // androidx.transition.e.f
        public final void c() {
                r0 = this;
                return
        }

        @Override // androidx.transition.e.f
        public final void d(androidx.transition.e r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.e.f
        public final void e(androidx.transition.e r1) {
                r0 = this;
                boolean r1 = r0.d
                if (r1 == 0) goto L7
                r0.h()
            L7:
                return
        }

        @Override // androidx.transition.e.f
        public final void f(androidx.transition.e r1) {
                r0 = this;
                r1.y(r0)
                return
        }

        @Override // androidx.transition.e.f
        public final void g() {
                r0 = this;
                return
        }

        public final void h() {
                r3 = this;
                int r0 = androidx.transition.R.id.save_overlay_view
                r1 = 0
                android.view.View r2 = r3.c
                r2.setTag(r0, r1)
                android.widget.FrameLayout r0 = r3.f1035a
                android.view.ViewGroupOverlay r0 = r0.getOverlay()
                android.view.View r1 = r3.b
                r0.remove(r1)
                r0 = 0
                r3.d = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.h()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L5
                r0.h()
            L5:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                android.widget.FrameLayout r2 = r1.f1035a
                android.view.ViewGroupOverlay r2 = r2.getOverlay()
                android.view.View r0 = r1.b
                r2.remove(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.b
                android.view.ViewParent r0 = r2.getParent()
                if (r0 != 0) goto L12
                android.widget.FrameLayout r0 = r1.f1035a
                android.view.ViewGroupOverlay r0 = r0.getOverlay()
                r0.add(r2)
                return
            L12:
                androidx.transition.i r2 = r1.e
                r2.c()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L17
                int r2 = androidx.transition.R.id.save_overlay_view
                android.view.View r3 = r1.c
                android.view.View r0 = r1.b
                r3.setTag(r2, r0)
                android.widget.FrameLayout r2 = r1.f1035a
                android.view.ViewGroupOverlay r2 = r2.getOverlay()
                r2.add(r0)
                r2 = 1
                r1.d = r2
            L17:
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1036a;
        public boolean b;
        public int c;
        public int d;
        public android.view.ViewGroup e;
        public android.view.ViewGroup f;
    }

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.transition.i.D = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.C = r0
            return
    }

    public static void K(a.Ff r3) {
            android.view.View r0 = r3.b
            int r0 = r0.getVisibility()
            java.util.HashMap r1 = r3.f91a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "android:visibility:visibility"
            r1.put(r2, r0)
            android.view.View r3 = r3.b
            android.view.ViewParent r0 = r3.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r1.put(r2, r0)
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationOnScreen(r0)
            java.lang.String r3 = "android:visibility:screenLocation"
            r1.put(r3, r0)
            return
    }

    public static androidx.transition.i.c L(a.Ff r8, a.Ff r9) {
            androidx.transition.i$c r0 = new androidx.transition.i$c
            r0.<init>()
            r1 = 0
            r0.f1036a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f91a
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
            java.util.HashMap r6 = r9.f91a
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
            r0.f1036a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.f1036a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.f1036a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.f1036a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.f1036a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.f1036a = r2
        L9f:
            return r0
    }

    @Override // androidx.transition.e
    public final void d(a.Ff r1) {
            r0 = this;
            K(r1)
            return
    }

    @Override // androidx.transition.e
    public final android.animation.Animator k(android.widget.FrameLayout r24, a.Ff r25, a.Ff r26) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            androidx.transition.i$c r4 = L(r25, r26)
            boolean r5 = r4.f1036a
            if (r5 == 0) goto L19
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L1e
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L19
            goto L1e
        L19:
            r3 = r0
            r16 = 0
            goto L2cf
        L1e:
            boolean r5 = r4.b
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L5b
            int r1 = r0.C
            r1 = r1 & r10
            if (r1 != r10) goto L19
            if (r3 != 0) goto L2f
            goto L19
        L2f:
            android.view.View r1 = r3.b
            if (r2 != 0) goto L4a
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            a.Ff r4 = r0.n(r3, r9)
            a.Ff r3 = r0.r(r3, r9)
            androidx.transition.i$c r3 = L(r4, r3)
            boolean r3 = r3.f1036a
            if (r3 == 0) goto L4a
            goto L19
        L4a:
            r3 = r0
            androidx.transition.c r3 = (androidx.transition.c) r3
            a.Vg r4 = a.Qg.f234a
            r4.getClass()
            float r2 = androidx.transition.c.N(r2, r7)
            android.animation.ObjectAnimator r1 = r3.M(r1, r2, r8)
            return r1
        L5b:
            int r4 = r4.d
            int r5 = r0.C
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L64
            goto L19
        L64:
            if (r2 != 0) goto L67
            goto L19
        L67:
            if (r3 == 0) goto L6c
            android.view.View r5 = r3.b
            goto L6d
        L6c:
            r5 = 0
        L6d:
            int r12 = androidx.transition.R.id.save_overlay_view
            android.view.View r13 = r2.b
            java.lang.Object r12 = r13.getTag(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L85
            r22 = r4
            r18 = r9
            r9 = r10
            r17 = r9
            r6 = 0
        L81:
            r16 = 0
            goto L20f
        L85:
            if (r5 == 0) goto L9c
            android.view.ViewParent r12 = r5.getParent()
            if (r12 != 0) goto L8e
            goto L9c
        L8e:
            r12 = 4
            if (r4 != r12) goto L92
            goto L94
        L92:
            if (r13 != r5) goto L98
        L94:
            r12 = r5
            r14 = r9
            r5 = 0
            goto La0
        L98:
            r14 = r10
            r5 = 0
        L9a:
            r12 = 0
            goto La0
        L9c:
            if (r5 == 0) goto L98
            r14 = r9
            goto L9a
        La0:
            if (r14 == 0) goto L203
            android.view.ViewParent r14 = r13.getParent()
            if (r14 != 0) goto Lb1
            r22 = r4
            r18 = r9
            r17 = r10
            r6 = r12
            r12 = r13
            goto L81
        Lb1:
            android.view.ViewParent r14 = r13.getParent()
            boolean r14 = r14 instanceof android.view.View
            if (r14 == 0) goto L203
            android.view.ViewParent r14 = r13.getParent()
            android.view.View r14 = (android.view.View) r14
            a.Ff r15 = r0.r(r14, r10)
            r16 = 0
            a.Ff r6 = r0.n(r14, r10)
            androidx.transition.i$c r6 = L(r15, r6)
            boolean r6 = r6.f1036a
            if (r6 != 0) goto L1ea
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r6 = r14.getScrollX()
            int r6 = -r6
            float r6 = (float) r6
            int r14 = r14.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r5.setTranslate(r6, r14)
            a.Vg r6 = a.Qg.f234a
            r6.d(r13, r5)
            r6.e(r1, r5)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r14 = r13.getWidth()
            float r14 = (float) r14
            int r15 = r13.getHeight()
            float r15 = (float) r15
            r6.<init>(r7, r7, r14, r15)
            r5.mapRect(r6)
            float r14 = r6.left
            int r14 = java.lang.Math.round(r14)
            float r15 = r6.top
            int r15 = java.lang.Math.round(r15)
            r17 = r10
            float r10 = r6.right
            int r10 = java.lang.Math.round(r10)
            r18 = r9
            float r9 = r6.bottom
            int r9 = java.lang.Math.round(r9)
            android.widget.ImageView r7 = new android.widget.ImageView
            android.content.Context r11 = r13.getContext()
            r7.<init>(r11)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r11)
            boolean r11 = r13.isAttachedToWindow()
            if (r1 == 0) goto L138
            boolean r19 = r1.isAttachedToWindow()
            if (r19 == 0) goto L138
            r19 = r17
            goto L13a
        L138:
            r19 = r18
        L13a:
            if (r11 != 0) goto L163
            if (r19 != 0) goto L146
            r22 = r4
            r21 = r12
            r0 = r16
            goto L1cb
        L146:
            android.view.ViewParent r19 = r13.getParent()
            r8 = r19
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r19 = r8.indexOfChild(r13)
            r20 = r8
            android.view.ViewGroupOverlay r8 = r1.getOverlay()
            r8.add(r13)
            r8 = r19
            r19 = r11
            r11 = r8
            r8 = r20
            goto L169
        L163:
            r19 = r11
            r8 = r16
            r11 = r18
        L169:
            float r20 = r6.width()
            r21 = r12
            int r12 = java.lang.Math.round(r20)
            float r20 = r6.height()
            r22 = r4
            int r4 = java.lang.Math.round(r20)
            if (r12 <= 0) goto L1bd
            if (r4 <= 0) goto L1bd
            int r0 = r12 * r4
            float r0 = (float) r0
            r20 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r20 / r0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r3, r0)
            float r3 = (float) r12
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r12 = r6.left
            float r12 = -r12
            float r6 = r6.top
            float r6 = -r6
            r5.postTranslate(r12, r6)
            r5.postScale(r0, r0)
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r3 = r0.beginRecording(r3, r4)
            r3.concat(r5)
            r13.draw(r3)
            r0.endRecording()
            android.graphics.Bitmap r0 = a.Ef.a(r0)
            goto L1bf
        L1bd:
            r0 = r16
        L1bf:
            if (r19 != 0) goto L1cb
            android.view.ViewGroupOverlay r3 = r1.getOverlay()
            r3.remove(r13)
            r8.addView(r13, r11)
        L1cb:
            if (r0 == 0) goto L1d0
            r7.setImageBitmap(r0)
        L1d0:
            int r0 = r10 - r14
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r4 = r9 - r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r7.measure(r0, r3)
            r7.layout(r14, r15, r10, r9)
            r12 = r7
        L1e5:
            r9 = r18
            r6 = r21
            goto L20f
        L1ea:
            r22 = r4
            r18 = r9
            r17 = r10
            r21 = r12
            int r0 = r14.getId()
            android.view.ViewParent r3 = r14.getParent()
            if (r3 != 0) goto L20d
            r3 = -1
            if (r0 == r3) goto L20d
            r1.findViewById(r0)
            goto L20d
        L203:
            r22 = r4
            r18 = r9
            r17 = r10
            r21 = r12
            r16 = 0
        L20d:
            r12 = r5
            goto L1e5
        L20f:
            if (r12 == 0) goto L28c
            if (r9 != 0) goto L244
            java.util.HashMap r0 = r2.f91a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            r3 = r0[r18]
            r0 = r0[r17]
            r4 = 2
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r5 = r4[r18]
            int r3 = r3 - r5
            int r5 = r12.getLeft()
            int r3 = r3 - r5
            r12.offsetLeftAndRight(r3)
            r3 = r4[r17]
            int r0 = r0 - r3
            int r3 = r12.getTop()
            int r0 = r0 - r3
            r12.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r12)
        L244:
            r0 = r23
            androidx.transition.c r0 = (androidx.transition.c) r0
            a.Vg r3 = a.Qg.f234a
            r3.getClass()
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = androidx.transition.c.N(r2, r4)
            r5 = 0
            android.animation.ObjectAnimator r0 = r0.M(r12, r2, r5)
            if (r0 != 0) goto L263
            r5 = r26
            float r2 = androidx.transition.c.N(r5, r4)
            r3.b(r12, r2)
        L263:
            if (r9 != 0) goto L289
            if (r0 != 0) goto L26f
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r1.remove(r12)
            return r0
        L26f:
            int r2 = androidx.transition.R.id.save_overlay_view
            r13.setTag(r2, r12)
            androidx.transition.i$b r2 = new androidx.transition.i$b
            r3 = r23
            r2.<init>(r3, r1, r12, r13)
            r0.addListener(r2)
            r0.addPauseListener(r2)
            androidx.transition.e r1 = r3.o()
            r1.a(r2)
            return r0
        L289:
            r3 = r23
            return r0
        L28c:
            r3 = r23
            r5 = r26
            if (r6 == 0) goto L2cf
            int r0 = r6.getVisibility()
            r1 = r18
            a.Qg.b(r6, r1)
            r1 = r3
            androidx.transition.c r1 = (androidx.transition.c) r1
            a.Vg r4 = a.Qg.f234a
            r4.getClass()
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = androidx.transition.c.N(r2, r7)
            r8 = 0
            android.animation.ObjectAnimator r1 = r1.M(r6, r2, r8)
            if (r1 != 0) goto L2b7
            float r2 = androidx.transition.c.N(r5, r7)
            r4.b(r6, r2)
        L2b7:
            if (r1 == 0) goto L2cb
            androidx.transition.i$a r0 = new androidx.transition.i$a
            r2 = r22
            r0.<init>(r6, r2)
            r1.addListener(r0)
            androidx.transition.e r2 = r3.o()
            r2.a(r0)
            return r1
        L2cb:
            a.Qg.b(r6, r0)
            return r1
        L2cf:
            return r16
    }

    @Override // androidx.transition.e
    public final java.lang.String[] q() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.i.D
            return r0
    }

    @Override // androidx.transition.e
    public final boolean t(a.Ff r4, a.Ff r5) {
            r3 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            goto L2c
        L5:
            if (r4 == 0) goto L1a
            if (r5 == 0) goto L1a
            java.util.HashMap r0 = r5.f91a
            java.lang.String r1 = "android:visibility:visibility"
            boolean r0 = r0.containsKey(r1)
            java.util.HashMap r2 = r4.f91a
            boolean r1 = r2.containsKey(r1)
            if (r0 == r1) goto L1a
            goto L2c
        L1a:
            androidx.transition.i$c r4 = L(r4, r5)
            boolean r5 = r4.f1036a
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
