package com.google.android.material.button;

import Yue.C4520;
import Yue.C8273;
import Yue.InterfaceC3811;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
class MaterialButtonHelper {

    @InterfaceC6490
    private ColorStateList backgroundTint;

    @InterfaceC6490
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;

    @InterfaceC6490
    private Drawable maskDrawable;
    private final MaterialButton materialButton;

    @InterfaceC6490
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;

    @InterfaceC6391
    private ShapeAppearanceModel shapeAppearanceModel;

    @InterfaceC6490
    private ColorStateList strokeColor;
    private int strokeWidth;

    @InterfaceC3811(api = 21)
    private static final boolean IS_MIN_LOLLIPOP = true;
    private static final boolean IS_LOLLIPOP = false;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;
    private boolean toggleCheckedStateOnClick = true;

    public MaterialButtonHelper(MaterialButton materialButton, @InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = materialButton;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable.initializeElevationOverlay(this.materialButton.getContext());
        C4520.m13236(materialShapeDrawable, this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            C4520.m13237(materialShapeDrawable, mode);
        }
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, C1980R.attr.colorSurface) : 0);
        if (IS_MIN_LOLLIPOP) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.maskDrawable = materialShapeDrawable3;
            C4520.m13235(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.maskDrawable);
            this.rippleDrawable = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.shapeAppearanceModel);
        this.maskDrawable = rippleDrawableCompat;
        C4520.m13236(rippleDrawableCompat, RippleUtils.sanitizeRippleDrawableColor(this.rippleColor));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.maskDrawable});
        this.rippleDrawable = layerDrawable;
        return wrapDrawableWithInset(layerDrawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return IS_MIN_LOLLIPOP ? (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (MaterialShapeDrawable) this.rippleDrawable.getDrawable(!z ? 1 : 0);
    }

    @InterfaceC6490
    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void setVerticalInsets(@InterfaceC4399 int i, @InterfaceC4399 int i2) {
        int iM27367 = C8273.m27367(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int iM27366 = C8273.m27366(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        int i3 = this.insetTop;
        int i4 = this.insetBottom;
        this.insetBottom = i2;
        this.insetTop = i;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        C8273.m27471(this.materialButton, iM27367, (paddingTop + i) - i3, iM27366, (paddingBottom + i2) - i4);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
    }

    private void updateButtonShape(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        if (IS_LOLLIPOP && !this.backgroundOverwritten) {
            int iM27367 = C8273.m27367(this.materialButton);
            int paddingTop = this.materialButton.getPaddingTop();
            int iM27366 = C8273.m27366(this.materialButton);
            int paddingBottom = this.materialButton.getPaddingBottom();
            updateBackground();
            C8273.m27471(this.materialButton, iM27367, paddingTop, iM27366, paddingBottom);
            return;
        }
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getSurfaceColorStrokeDrawable() != null) {
            getSurfaceColorStrokeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getMaskDrawable() != null) {
            getMaskDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateStroke() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, C1980R.attr.colorSurface) : 0);
            }
        }
    }

    @InterfaceC6391
    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public int getInsetTop() {
        return this.insetTop;
    }

    @InterfaceC6490
    public Shapeable getMaskDrawable() {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.rippleDrawable.getNumberOfLayers() > 2 ? (Shapeable) this.rippleDrawable.getDrawable(2) : (Shapeable) this.rippleDrawable.getDrawable(1);
    }

    @InterfaceC6490
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @InterfaceC6391
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @InterfaceC6490
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    public void loadFromAttributes(@InterfaceC6391 TypedArray typedArray) {
        this.insetLeft = typedArray.getDimensionPixelOffset(C1980R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(C1980R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(C1980R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(C1980R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C1980R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C1980R.styleable.MaterialButton_cornerRadius, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(C1980R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArray.getInt(C1980R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C1980R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C1980R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C1980R.styleable.MaterialButton_rippleColor);
        this.checkable = typedArray.getBoolean(C1980R.styleable.MaterialButton_android_checkable, false);
        this.elevation = typedArray.getDimensionPixelSize(C1980R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = typedArray.getBoolean(C1980R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int iM27367 = C8273.m27367(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int iM27366 = C8273.m27366(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (typedArray.hasValue(C1980R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        C8273.m27471(this.materialButton, iM27367 + this.insetLeft, paddingTop + this.insetTop, iM27366 + this.insetRight, paddingBottom + this.insetBottom);
    }

    public void setBackgroundColor(int i) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(i);
        }
    }

    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public void setCornerRadius(int i) {
        if (this.cornerRadiusSet && this.cornerRadius == i) {
            return;
        }
        this.cornerRadius = i;
        this.cornerRadiusSet = true;
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(i));
    }

    public void setInsetBottom(@InterfaceC4399 int i) {
        setVerticalInsets(this.insetTop, i);
    }

    public void setInsetTop(@InterfaceC4399 int i) {
        setVerticalInsets(i, this.insetBottom);
    }

    public void setRippleColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            boolean z = IS_MIN_LOLLIPOP;
            if (z && (this.materialButton.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            } else {
                if (z || !(this.materialButton.getBackground() instanceof RippleDrawableCompat)) {
                    return;
                }
                ((RippleDrawableCompat) this.materialButton.getBackground()).setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    public void setShapeAppearanceModel(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateButtonShape(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        this.shouldDrawSurfaceColorStroke = z;
        updateStroke();
    }

    public void setStrokeColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            updateStroke();
        }
    }

    public void setStrokeWidth(int i) {
        if (this.strokeWidth != i) {
            this.strokeWidth = i;
            updateStroke();
        }
    }

    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (getMaterialShapeDrawable() != null) {
                C4520.m13236(getMaterialShapeDrawable(), this.backgroundTint);
            }
        }
    }

    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() == null || this.backgroundTintMode == null) {
                return;
            }
            C4520.m13237(getMaterialShapeDrawable(), this.backgroundTintMode);
        }
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.toggleCheckedStateOnClick = z;
    }

    public void updateMaskBounds(int i, int i2) {
        Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, i2 - this.insetRight, i - this.insetBottom);
        }
    }

    @InterfaceC6490
    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }
}
