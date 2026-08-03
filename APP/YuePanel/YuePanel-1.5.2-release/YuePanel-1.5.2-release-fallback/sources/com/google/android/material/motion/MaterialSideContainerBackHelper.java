package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class MaterialSideContainerBackHelper extends com.google.android.material.motion.MaterialBackAnimationHelper<android.view.View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;


    public MaterialSideContainerBackHelper(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink
            float r0 = r2.getDimension(r0)
            r1.maxScaleXDistanceShrink = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow
            float r0 = r2.getDimension(r0)
            r1.maxScaleXDistanceGrow = r0
            int r0 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_y_distance
            float r2 = r2.getDimension(r0)
            r1.maxScaleYDistance = r2
            return
    }

    private boolean checkAbsoluteGravity(@Yue.InterfaceC2912 int r2, @Yue.InterfaceC2912 int r3) {
            r1 = this;
            V extends android.view.View r0 = r1.view
            int r0 = Yue.C6794.m26140(r0)
            int r2 = Yue.C2911.m12423(r2, r0)
            r2 = r2 & r3
            if (r2 != r3) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private int getEdgeMargin(boolean r3) {
            r2 = this;
            V extends android.view.View r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L14
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r3 == 0) goto L11
            int r3 = r0.leftMargin
            goto L13
        L11:
            int r3 = r0.rightMargin
        L13:
            return r3
        L14:
            r3 = 0
            return r3
    }

    public void cancelBackProgress() {
            r9 = this;
            r0 = 0
            r1 = 1
            Yue.ۥ۟ۢۤۥ r2 = super.onCancelBackProgress()
            if (r2 != 0) goto L9
            return
        L9:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            V extends android.view.View r3 = r9.view
            android.util.Property r4 = android.view.View.SCALE_X
            r5 = 1065353216(0x3f800000, float:1.0)
            float[] r6 = new float[r1]
            r6[r0] = r5
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r4, r6)
            V extends android.view.View r4 = r9.view
            android.util.Property r6 = android.view.View.SCALE_Y
            float[] r7 = new float[r1]
            r7[r0] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r6, r7)
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r0] = r3
            r6[r1] = r4
            r2.playTogether(r6)
            V extends android.view.View r3 = r9.view
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L58
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = r0
        L3b:
            int r6 = r3.getChildCount()
            if (r4 >= r6) goto L58
            android.view.View r6 = r3.getChildAt(r4)
            android.util.Property r7 = android.view.View.SCALE_Y
            float[] r8 = new float[r1]
            r8[r0] = r5
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r7, r8)
            android.animation.Animator[] r7 = new android.animation.Animator[r1]
            r7[r0] = r6
            r2.playTogether(r7)
            int r4 = r4 + r1
            goto L3b
        L58:
            int r0 = r9.cancelDuration
            long r0 = (long) r0
            r2.setDuration(r0)
            r2.start()
            return
    }

    public void finishBackProgress(@Yue.InterfaceC4410 Yue.C0717 r8, @Yue.InterfaceC2912 int r9, @Yue.InterfaceC4544 android.animation.Animator.AnimatorListener r10, @Yue.InterfaceC4544 android.animation.ValueAnimator.AnimatorUpdateListener r11) {
            r7 = this;
            r0 = 0
            r1 = 1
            int r2 = r8.m4459()
            if (r2 != 0) goto La
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            r3 = 3
            boolean r3 = r7.checkAbsoluteGravity(r9, r3)
            V extends android.view.View r4 = r7.view
            int r4 = r4.getWidth()
            float r4 = (float) r4
            V extends android.view.View r5 = r7.view
            float r5 = r5.getScaleX()
            float r4 = r4 * r5
            int r5 = r7.getEdgeMargin(r3)
            float r5 = (float) r5
            float r4 = r4 + r5
            V extends android.view.View r5 = r7.view
            android.util.Property r6 = android.view.View.TRANSLATION_X
            if (r3 == 0) goto L2b
            float r4 = -r4
        L2b:
            float[] r1 = new float[r1]
            r1[r0] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r6, r1)
            if (r11 == 0) goto L38
            r0.addUpdateListener(r11)
        L38:
            Yue.ۥ۠ۡۦۥ r11 = new Yue.ۥ۠ۡۦۥ
            r11.<init>()
            r0.setInterpolator(r11)
            int r11 = r7.hideDurationMax
            int r1 = r7.hideDurationMin
            float r8 = r8.m4458()
            int r8 = com.google.android.material.animation.AnimationUtils.lerp(r11, r1, r8)
            long r3 = (long) r8
            r0.setDuration(r3)
            com.google.android.material.motion.MaterialSideContainerBackHelper$1 r8 = new com.google.android.material.motion.MaterialSideContainerBackHelper$1
            r8.<init>(r7, r2, r9)
            r0.addListener(r8)
            if (r10 == 0) goto L5d
            r0.addListener(r10)
        L5d:
            r0.start()
            return
    }

    public void startBackProgress(@Yue.InterfaceC4410 Yue.C0717 r1) {
            r0 = this;
            super.onStartBackProgress(r1)
            return
    }

    @Yue.InterfaceC6959
    public void updateBackProgress(float r11, boolean r12, @Yue.InterfaceC2912 int r13) {
            r10 = this;
            float r11 = r10.interpolateProgress(r11)
            r0 = 3
            boolean r13 = r10.checkAbsoluteGravity(r13, r0)
            r0 = 0
            if (r12 != r13) goto Le
            r12 = 1
            goto Lf
        Le:
            r12 = r0
        Lf:
            V extends android.view.View r1 = r10.view
            int r1 = r1.getWidth()
            V extends android.view.View r2 = r10.view
            int r2 = r2.getHeight()
            float r3 = (float) r1
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto La0
            float r2 = (float) r2
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L28
            goto La0
        L28:
            float r5 = r10.maxScaleXDistanceShrink
            float r5 = r5 / r3
            float r6 = r10.maxScaleXDistanceGrow
            float r6 = r6 / r3
            float r7 = r10.maxScaleYDistance
            float r7 = r7 / r2
            V extends android.view.View r2 = r10.view
            if (r13 == 0) goto L36
            r3 = r4
        L36:
            r2.setPivotX(r3)
            if (r12 == 0) goto L3c
            goto L3d
        L3c:
            float r6 = -r5
        L3d:
            float r2 = com.google.android.material.animation.AnimationUtils.lerp(r4, r6, r11)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r2 + r3
            V extends android.view.View r6 = r10.view
            r6.setScaleX(r5)
            float r11 = com.google.android.material.animation.AnimationUtils.lerp(r4, r7, r11)
            float r11 = r3 - r11
            V extends android.view.View r6 = r10.view
            r6.setScaleY(r11)
            V extends android.view.View r6 = r10.view
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto La0
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L5d:
            int r7 = r6.getChildCount()
            if (r0 >= r7) goto La0
            android.view.View r7 = r6.getChildAt(r0)
            if (r13 == 0) goto L76
            int r8 = r7.getRight()
            int r8 = r1 - r8
            int r9 = r7.getWidth()
            int r8 = r8 + r9
        L74:
            float r8 = (float) r8
            goto L7c
        L76:
            int r8 = r7.getLeft()
            int r8 = -r8
            goto L74
        L7c:
            r7.setPivotX(r8)
            int r8 = r7.getTop()
            int r8 = -r8
            float r8 = (float) r8
            r7.setPivotY(r8)
            if (r12 == 0) goto L8d
            float r8 = r3 - r2
            goto L8e
        L8d:
            r8 = r3
        L8e:
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 == 0) goto L96
            float r9 = r5 / r11
            float r9 = r9 * r8
            goto L97
        L96:
            r9 = r3
        L97:
            r7.setScaleX(r8)
            r7.setScaleY(r9)
            int r0 = r0 + 1
            goto L5d
        La0:
            return
    }

    public void updateBackProgress(@Yue.InterfaceC4410 Yue.C0717 r2, @Yue.InterfaceC2912 int r3) {
            r1 = this;
            Yue.ۥ۟ۢۤۥ r0 = super.onUpdateBackProgress(r2)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r2.m4459()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            float r2 = r2.m4458()
            r1.updateBackProgress(r2, r0, r3)
            return
    }
}
