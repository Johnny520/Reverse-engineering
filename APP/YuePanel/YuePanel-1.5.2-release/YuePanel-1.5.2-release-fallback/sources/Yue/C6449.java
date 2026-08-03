package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6449 {

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۦ$ۥ, reason: contains not printable characters */
    public static class C6450 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.View f22715;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.view.View f22716;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int[] f22717;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f22718;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f22719;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final float f22720;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final float f22721;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f22722;

        public C6450(android.view.View r1, android.view.View r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.f22716 = r1
                r0.f22715 = r2
                r0.f22720 = r3
                r0.f22721 = r4
                int r1 = Yue.C5102.C5103.f18365
                java.lang.Object r1 = r2.getTag(r1)
                int[] r1 = (int[]) r1
                r0.f22717 = r1
                if (r1 == 0) goto L1d
                int r1 = Yue.C5102.C5103.f18365
                r3 = 0
                r2.setTag(r1, r3)
            L1d:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                r2 = 1
                r1.f22722 = r2
                android.view.View r2 = r1.f22716
                float r0 = r1.f22720
                r2.setTranslationX(r0)
                android.view.View r2 = r1.f22716
                float r0 = r1.f22721
                r2.setTranslationY(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r2) {
                r1 = this;
                r0 = 0
                r1.onAnimationEnd(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L10
                android.view.View r1 = r0.f22716
                float r2 = r0.f22720
                r1.setTranslationX(r2)
                android.view.View r1 = r0.f22716
                float r2 = r0.f22721
                r1.setTranslationY(r2)
            L10:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                r2 = 1
                r1.f22722 = r2
                android.view.View r2 = r1.f22716
                float r0 = r1.f22720
                r2.setTranslationX(r0)
                android.view.View r2 = r1.f22716
                float r0 = r1.f22721
                r2.setTranslationY(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                r0 = 0
                r1.mo23665(r2, r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                r1.m23747()
                android.view.View r2 = r1.f22716
                float r2 = r2.getTranslationX()
                r1.f22718 = r2
                android.view.View r2 = r1.f22716
                float r2 = r2.getTranslationY()
                r1.f22719 = r2
                android.view.View r2 = r1.f22716
                float r0 = r1.f22720
                r2.setTranslationX(r0)
                android.view.View r2 = r1.f22716
                float r0 = r1.f22721
                r2.setTranslationY(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                android.view.View r2 = r1.f22716
                float r0 = r1.f22718
                r2.setTranslationX(r0)
                android.view.View r2 = r1.f22716
                float r0 = r1.f22719
                r2.setTranslationY(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m23747() {
                r3 = this;
                int[] r0 = r3.f22717
                if (r0 != 0) goto L9
                r0 = 2
                int[] r0 = new int[r0]
                r3.f22717 = r0
            L9:
                android.view.View r0 = r3.f22716
                int[] r1 = r3.f22717
                r0.getLocationOnScreen(r1)
                android.view.View r0 = r3.f22715
                int r1 = Yue.C5102.C5103.f18365
                int[] r2 = r3.f22717
                r0.setTag(r1, r2)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo23665(@Yue.InterfaceC4410 Yue.AbstractC6398 r2, boolean r3) {
                r1 = this;
                boolean r2 = r1.f22722
                if (r2 != 0) goto Lc
                android.view.View r2 = r1.f22715
                int r3 = Yue.C5102.C5103.f18365
                r0 = 0
                r2.setTag(r3, r0)
            Lc:
                return
        }
    }

    public C6449() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.animation.Animator m23746(@Yue.InterfaceC4410 android.view.View r11, @Yue.InterfaceC4410 Yue.C6447 r12, int r13, int r14, float r15, float r16, float r17, float r18, @Yue.InterfaceC4544 android.animation.TimeInterpolator r19, @Yue.InterfaceC4410 Yue.AbstractC6398 r20) {
            r0 = r11
            r1 = r12
            r2 = 2
            r3 = 1
            r4 = 0
            float r5 = r11.getTranslationX()
            float r6 = r11.getTranslationY()
            android.view.View r7 = r1.f22709
            int r8 = Yue.C5102.C5103.f18365
            java.lang.Object r7 = r7.getTag(r8)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L24
            r8 = r7[r4]
            int r8 = r8 - r13
            float r8 = (float) r8
            float r8 = r8 + r5
            r7 = r7[r3]
            int r7 = r7 - r14
            float r7 = (float) r7
            float r7 = r7 + r6
            goto L27
        L24:
            r8 = r15
            r7 = r16
        L27:
            r11.setTranslationX(r8)
            r11.setTranslationY(r7)
            int r9 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r9 != 0) goto L37
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 != 0) goto L37
            r0 = 0
            return r0
        L37:
            android.util.Property r9 = android.view.View.TRANSLATION_X
            float[] r10 = new float[r2]
            r10[r4] = r8
            r10[r3] = r17
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r9, r10)
            android.util.Property r9 = android.view.View.TRANSLATION_Y
            float[] r2 = new float[r2]
            r2[r4] = r7
            r2[r3] = r18
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r9, r2)
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[]{r8, r2}
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r11, r2)
            Yue.ۥۢۢۡۦ$ۥ r3 = new Yue.ۥۢۢۡۦ$ۥ
            android.view.View r1 = r1.f22709
            r3.<init>(r11, r1, r5, r6)
            r0 = r20
            r0.addListener(r3)
            r2.addListener(r3)
            r0 = r19
            r2.setInterpolator(r0)
            return r2
    }
}
