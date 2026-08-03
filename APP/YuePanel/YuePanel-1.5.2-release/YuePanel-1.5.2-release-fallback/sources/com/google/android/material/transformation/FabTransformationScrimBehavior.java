package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0;
    public static final long COLLAPSE_DURATION = 150;
    public static final long EXPAND_DELAY = 75;
    public static final long EXPAND_DURATION = 150;
    private final com.google.android.material.animation.MotionTiming collapseTiming;
    private final com.google.android.material.animation.MotionTiming expandTiming;


    public FabTransformationScrimBehavior() {
            r5 = this;
            r5.<init>()
            com.google.android.material.animation.MotionTiming r0 = new com.google.android.material.animation.MotionTiming
            r1 = 75
            r3 = 150(0x96, double:7.4E-322)
            r0.<init>(r1, r3)
            r5.expandTiming = r0
            com.google.android.material.animation.MotionTiming r0 = new com.google.android.material.animation.MotionTiming
            r1 = 0
            r0.<init>(r1, r3)
            r5.collapseTiming = r0
            return
    }

    public FabTransformationScrimBehavior(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            com.google.android.material.animation.MotionTiming r5 = new com.google.android.material.animation.MotionTiming
            r0 = 75
            r2 = 150(0x96, double:7.4E-322)
            r5.<init>(r0, r2)
            r4.expandTiming = r5
            com.google.android.material.animation.MotionTiming r5 = new com.google.android.material.animation.MotionTiming
            r0 = 0
            r5.<init>(r0, r2)
            r4.collapseTiming = r5
            return
    }

    private void createScrimAnimation(@Yue.InterfaceC4410 android.view.View r4, boolean r5, boolean r6, @Yue.InterfaceC4410 java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r3 = this;
            r8 = 0
            r0 = 1
            if (r5 == 0) goto L7
            com.google.android.material.animation.MotionTiming r1 = r3.expandTiming
            goto L9
        L7:
            com.google.android.material.animation.MotionTiming r1 = r3.collapseTiming
        L9:
            r2 = 0
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L11
            r4.setAlpha(r2)
        L11:
            android.util.Property r5 = android.view.View.ALPHA
            float[] r6 = new float[r0]
            r0 = 1065353216(0x3f800000, float:1.0)
            r6[r8] = r0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
            goto L28
        L1e:
            android.util.Property r5 = android.view.View.ALPHA
            float[] r6 = new float[r0]
            r6[r8] = r2
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r6)
        L28:
            r1.apply(r4)
            r7.add(r4)
            return
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493
    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            boolean r1 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            return r1
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @Yue.InterfaceC4410
    public android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(@Yue.InterfaceC4410 android.view.View r7, @Yue.InterfaceC4410 android.view.View r8, boolean r9, boolean r10) {
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r0.createScrimAnimation(r1, r2, r3, r4, r5)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r10, r7)
            com.google.android.material.transformation.FabTransformationScrimBehavior$1 r7 = new com.google.android.material.transformation.FabTransformationScrimBehavior$1
            r7.<init>(r6, r9, r8)
            r10.addListener(r7)
            return r10
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493
    public boolean onTouchEvent(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.MotionEvent r3) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1, r2, r3)
            return r1
    }
}
