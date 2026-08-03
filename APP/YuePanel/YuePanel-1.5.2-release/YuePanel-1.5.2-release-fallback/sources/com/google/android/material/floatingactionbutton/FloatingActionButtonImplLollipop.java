package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
class FloatingActionButtonImplLollipop extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl {

    @Yue.InterfaceC4544
    private android.animation.StateListAnimator stateListAnimator;

    public static class AlwaysStatefulMaterialShapeDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
        public AlwaysStatefulMaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public FloatingActionButtonImplLollipop(com.google.android.material.floatingactionbutton.FloatingActionButton r1, com.google.android.material.shadow.ShadowViewDelegate r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4410
    private android.animation.StateListAnimator createDefaultStateListAnimator(float r7, float r8, float r9) {
            r6 = this;
            android.animation.StateListAnimator r0 = new android.animation.StateListAnimator
            r0.<init>()
            int[] r1 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET
            android.animation.Animator r9 = r6.createElevationAnimator(r7, r9)
            r0.addState(r1, r9)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r6.createElevationAnimator(r7, r8)
            r0.addState(r9, r1)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r6.createElevationAnimator(r7, r8)
            r0.addState(r9, r1)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET
            android.animation.Animator r8 = r6.createElevationAnimator(r7, r8)
            r0.addState(r9, r8)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r6.view
            java.lang.String r2 = "elevation"
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            r1 = 0
            android.animation.ObjectAnimator r7 = r7.setDuration(r1)
            r9.add(r7)
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = r6.view
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            r2 = 0
            float[] r3 = new float[r3]
            r3[r5] = r2
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r1, r3)
            r3 = 100
            android.animation.ObjectAnimator r7 = r7.setDuration(r3)
            r9.add(r7)
            android.animation.Animator[] r7 = new android.animation.Animator[r5]
            java.lang.Object[] r7 = r9.toArray(r7)
            android.animation.Animator[] r7 = (android.animation.Animator[]) r7
            r8.playSequentially(r7)
            android.animation.TimeInterpolator r7 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR
            r8.setInterpolator(r7)
            int[] r7 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ENABLED_STATE_SET
            r0.addState(r7, r8)
            int[] r7 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.EMPTY_STATE_SET
            android.animation.Animator r8 = r6.createElevationAnimator(r2, r2)
            r0.addState(r7, r8)
            return r0
    }

    @Yue.InterfaceC4410
    private android.animation.Animator createElevationAnimator(float r7, float r8) {
            r6 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r6.view
            java.lang.String r2 = "elevation"
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            r1 = 0
            android.animation.ObjectAnimator r7 = r7.setDuration(r1)
            android.animation.AnimatorSet$Builder r7 = r0.play(r7)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r6.view
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r3]
            r3[r5] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
            r1 = 100
            android.animation.ObjectAnimator r8 = r8.setDuration(r1)
            r7.with(r8)
            android.animation.TimeInterpolator r7 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR
            r0.setInterpolator(r7)
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.floatingactionbutton.BorderDrawable createBorderDrawable(int r7, android.content.res.ColorStateList r8) {
            r6 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r6.view
            android.content.Context r0 = r0.getContext()
            com.google.android.material.floatingactionbutton.BorderDrawable r1 = new com.google.android.material.floatingactionbutton.BorderDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r6.shapeAppearance
            java.lang.Object r2 = Yue.C4868.m19181(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = (com.google.android.material.shape.ShapeAppearanceModel) r2
            r1.<init>(r2)
            int r2 = com.google.android.material.R.color.design_fab_stroke_top_outer_color
            int r2 = Yue.C1584.m7761(r0, r2)
            int r3 = com.google.android.material.R.color.design_fab_stroke_top_inner_color
            int r3 = Yue.C1584.m7761(r0, r3)
            int r4 = com.google.android.material.R.color.design_fab_stroke_end_inner_color
            int r4 = Yue.C1584.m7761(r0, r4)
            int r5 = com.google.android.material.R.color.design_fab_stroke_end_outer_color
            int r0 = Yue.C1584.m7761(r0, r5)
            r1.setGradientColors(r2, r3, r4, r0)
            float r7 = (float) r7
            r1.setBorderWidth(r7)
            r1.setBorderTint(r8)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    @Yue.InterfaceC4410
    public com.google.android.material.shape.MaterialShapeDrawable createShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearance
            java.lang.Object r0 = Yue.C4868.m19181(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = (com.google.android.material.shape.ShapeAppearanceModel) r0
            com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public float getElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            float r0 = r0.getElevation()
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void getPadding(@Yue.InterfaceC4410 android.graphics.Rect r3) {
            r2 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r2.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 == 0) goto Lc
            super.getPadding(r3)
            goto L25
        Lc:
            boolean r0 = r2.shouldExpandBoundsForA11y()
            if (r0 != 0) goto L21
            int r0 = r2.minTouchTargetSize
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.view
            int r1 = r1.getSizeDimension()
            int r0 = r0 - r1
            int r0 = r0 / 2
            r3.set(r0, r0, r0, r0)
            goto L25
        L21:
            r0 = 0
            r3.set(r0, r0, r0, r0)
        L25:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void initializeBackgroundDrawable(android.content.res.ColorStateList r2, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r3, android.content.res.ColorStateList r4, int r5) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.createShapeDrawable()
            r1.shapeDrawable = r0
            r0.setTintList(r2)
            if (r3 == 0) goto L10
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            r0.setTintMode(r3)
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r3 = r1.shapeDrawable
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            android.content.Context r0 = r0.getContext()
            r3.initializeElevationOverlay(r0)
            r3 = 0
            if (r5 <= 0) goto L3e
            com.google.android.material.floatingactionbutton.BorderDrawable r2 = r1.createBorderDrawable(r5, r2)
            r1.borderDrawable = r2
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            com.google.android.material.floatingactionbutton.BorderDrawable r5 = r1.borderDrawable
            java.lang.Object r5 = Yue.C4868.m19181(r5)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.shapeDrawable
            java.lang.Object r0 = Yue.C4868.m19181(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[]{r5, r0}
            r2.<init>(r5)
            goto L42
        L3e:
            r1.borderDrawable = r3
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.shapeDrawable
        L42:
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r4 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r4)
            r5.<init>(r4, r2, r3)
            r1.rippleDrawable = r5
            r1.contentBackground = r5
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void jumpDrawableToCurrentState() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onCompatShadowChanged() {
            r0 = this;
            r0.updatePadding()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onDrawableStateChanged(int[] r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void onElevationsChanged(float r3, float r4, float r5) {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.animation.StateListAnimator r0 = r0.getStateListAnimator()
            android.animation.StateListAnimator r1 = r2.stateListAnimator
            if (r0 != r1) goto L15
            android.animation.StateListAnimator r3 = r2.createDefaultStateListAnimator(r3, r4, r5)
            r2.stateListAnimator = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r2.view
            r4.setStateListAnimator(r3)
        L15:
            boolean r3 = r2.shouldAddPadding()
            if (r3 == 0) goto L1e
            r2.updatePadding()
        L1e:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public boolean requirePreDrawListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void setRippleColor(@Yue.InterfaceC4544 android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L10
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r3 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r3)
            r0.setColor(r3)
            goto L13
        L10:
            super.setRippleColor(r3)
        L13:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public boolean shouldAddPadding() {
            r1 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r1.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 != 0) goto L11
            boolean r0 = r1.shouldExpandBoundsForA11y()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public void updateFromViewRotation() {
            r0 = this;
            return
    }
}
