package com.google.android.material.ripple;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class RippleDrawableCompat extends android.graphics.drawable.Drawable implements com.google.android.material.shape.Shapeable, Yue.InterfaceC6260 {
    private com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState drawableState;

    /* JADX INFO: renamed from: com.google.android.material.ripple.RippleDrawableCompat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class RippleDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {

        @Yue.InterfaceC4410
        com.google.android.material.shape.MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(@Yue.InterfaceC4410 com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r2) {
                r1 = this;
                r1.<init>()
                com.google.android.material.shape.MaterialShapeDrawable r0 = r2.delegate
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
                r1.delegate = r0
                boolean r2 = r2.shouldDrawDelegate
                r1.shouldDrawDelegate = r2
                return
        }

        public RippleDrawableCompatState(com.google.android.material.shape.MaterialShapeDrawable r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r1 = 0
                r0.shouldDrawDelegate = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.google.android.material.ripple.RippleDrawableCompat r0 = r1.newDrawable()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public com.google.android.material.ripple.RippleDrawableCompat newDrawable() {
                r3 = this;
                com.google.android.material.ripple.RippleDrawableCompat r0 = new com.google.android.material.ripple.RippleDrawableCompat
                com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
                r1.<init>(r3)
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private RippleDrawableCompat(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r1) {
            r0 = this;
            r0.<init>()
            r0.drawableState = r1
            return
    }

    public /* synthetic */ RippleDrawableCompat(com.google.android.material.ripple.RippleDrawableCompat.RippleDrawableCompatState r1, com.google.android.material.ripple.RippleDrawableCompat.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public RippleDrawableCompat(com.google.android.material.shape.ShapeAppearanceModel r3) {
            r2 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r2.drawableState
            boolean r1 = r0.shouldDrawDelegate
            if (r1 == 0) goto Lb
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.draw(r3)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    @Yue.InterfaceC4410
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable mutate() {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat r0 = r1.mutate()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public com.google.android.material.ripple.RippleDrawableCompat mutate() {
            r2 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = new com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r2.drawableState
            r0.<init>(r1)
            r2.drawableState = r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@Yue.InterfaceC4410 android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setBounds(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@Yue.InterfaceC4410 int[] r5) {
            r4 = this;
            boolean r0 = super.onStateChange(r5)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r4.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r1 = r1.delegate
            boolean r1 = r1.setState(r5)
            r2 = 1
            if (r1 == 0) goto L10
            r0 = r2
        L10:
            boolean r5 = com.google.android.material.ripple.RippleUtils.shouldDrawRippleCompat(r5)
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r1 = r4.drawableState
            boolean r3 = r1.shouldDrawDelegate
            if (r3 == r5) goto L1d
            r1.shouldDrawDelegate = r5
            goto L1e
        L1d:
            r2 = r0
        L1e:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Yue.InterfaceC4544 android.graphics.ColorFilter r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setColorFilter(r2)
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@Yue.InterfaceC4410 com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setShapeAppearanceModel(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTint(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState r0 = r1.drawableState
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.delegate
            r0.setTintMode(r2)
            return
    }
}
