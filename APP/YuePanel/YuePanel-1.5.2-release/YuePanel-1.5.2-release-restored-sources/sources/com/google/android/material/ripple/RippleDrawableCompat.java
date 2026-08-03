package com.google.android.material.ripple;

import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7833;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements Shapeable, InterfaceC7833 {
    private RippleDrawableCompatState drawableState;

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        @InterfaceC6391
        MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.delegate = materialShapeDrawable;
            this.shouldDrawDelegate = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newDrawable()Landroid/graphics/drawable/Drawable; */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(@InterfaceC6391 RippleDrawableCompatState rippleDrawableCompatState) {
            this.delegate = (MaterialShapeDrawable) rippleDrawableCompatState.delegate.getConstantState().newDrawable();
            this.shouldDrawDelegate = rippleDrawableCompatState.shouldDrawDelegate;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate) {
            rippleDrawableCompatState.delegate.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6490
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @InterfaceC6391
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@InterfaceC6391 Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@InterfaceC6391 int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.drawableState.delegate.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.shouldDrawDelegate = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawableState.delegate.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.delegate.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTint(@InterfaceC3897 int i) {
        this.drawableState.delegate.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: mutate()Landroid/graphics/drawable/Drawable; */
    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public RippleDrawableCompat mutate() {
        this.drawableState = new RippleDrawableCompatState(this.drawableState);
        return this;
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompatState;
    }
}
