package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.transition.i {

    public static class a extends android.animation.AnimatorListenerAdapter implements androidx.transition.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f1023a;
        public boolean b;

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.b = r0
                r1.f1023a = r2
                return
        }

        @Override // androidx.transition.e.f
        public final void a(androidx.transition.e r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.e.f
        public final void c() {
                r3 = this;
                android.view.View r0 = r3.f1023a
                int r1 = r0.getVisibility()
                if (r1 != 0) goto Lf
                a.Vg r1 = a.Qg.f234a
                float r1 = r1.a(r0)
                goto L10
            Lf:
                r1 = 0
            L10:
                int r2 = androidx.transition.R.id.transition_pause_alpha
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r0.setTag(r2, r1)
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
                return
        }

        @Override // androidx.transition.e.f
        public final void g() {
                r3 = this;
                int r0 = androidx.transition.R.id.transition_pause_alpha
                r1 = 0
                android.view.View r2 = r3.f1023a
                r2.setTag(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(android.animation.Animator r3) {
                r2 = this;
                a.Vg r3 = a.Qg.f234a
                android.view.View r0 = r2.f1023a
                r1 = 1065353216(0x3f800000, float:1.0)
                r3.b(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                r0 = 0
                r1.onAnimationEnd(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r3, boolean r4) {
                r2 = this;
                boolean r3 = r2.b
                android.view.View r0 = r2.f1023a
                if (r3 == 0) goto Lb
                r3 = 0
                r1 = 0
                r0.setLayerType(r3, r1)
            Lb:
                if (r4 != 0) goto L17
                a.Vg r3 = a.Qg.f234a
                r4 = 1065353216(0x3f800000, float:1.0)
                r3.b(r0, r4)
                r3.getClass()
            L17:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f1023a
                boolean r0 = r3.hasOverlappingRendering()
                if (r0 == 0) goto L16
                int r0 = r3.getLayerType()
                if (r0 != 0) goto L16
                r0 = 1
                r2.b = r0
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
            L16:
                return
        }
    }

    public c(int r1) {
            r0 = this;
            r0.<init>()
            r0.C = r1
            return
    }

    public static float N(a.Ff r1, float r2) {
            if (r1 == 0) goto L13
            java.util.HashMap r1 = r1.f91a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L13
            float r1 = r1.floatValue()
            return r1
        L13:
            return r2
    }

    public final android.animation.ObjectAnimator M(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            a.Vg r0 = a.Qg.f234a
            r0.b(r3, r4)
            a.Qg$a r4 = a.Qg.b
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            androidx.transition.c$a r5 = new androidx.transition.c$a
            r5.<init>(r3)
            r4.addListener(r5)
            androidx.transition.e r3 = r2.o()
            r3.a(r5)
            return r4
    }

    @Override // androidx.transition.e
    public final void g(a.Ff r3) {
            r2 = this;
            androidx.transition.i.K(r3)
            int r0 = androidx.transition.R.id.transition_pause_alpha
            android.view.View r1 = r3.b
            java.lang.Object r0 = r1.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 != 0) goto L25
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L20
            a.Vg r0 = a.Qg.f234a
            float r0 = r0.a(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L25
        L20:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L25:
            java.util.HashMap r3 = r3.f91a
            java.lang.String r1 = "android:fade:transitionAlpha"
            r3.put(r1, r0)
            return
    }
}
