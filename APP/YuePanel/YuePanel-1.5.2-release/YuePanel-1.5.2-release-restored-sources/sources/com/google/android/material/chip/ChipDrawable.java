package com.google.android.material.chip;

import Yue.C3323;
import Yue.C3530;
import Yue.C3913;
import Yue.C4520;
import Yue.C8273;
import Yue.InterfaceC3258;
import Yue.InterfaceC3451;
import Yue.InterfaceC3567;
import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC4398;
import Yue.InterfaceC4399;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import Yue.InterfaceC7833;
import Yue.InterfaceC8570;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ChipDrawable extends MaterialShapeDrawable implements InterfaceC7833, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;

    @InterfaceC6490
    private Drawable checkedIcon;

    @InterfaceC6490
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;

    @InterfaceC6490
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;

    @InterfaceC6490
    private Drawable chipIcon;
    private float chipIconSize;

    @InterfaceC6490
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;

    @InterfaceC6490
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;

    @InterfaceC6490
    private ColorStateList chipSurfaceColor;

    @InterfaceC6490
    private Drawable closeIcon;

    @InterfaceC6490
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;

    @InterfaceC6490
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;

    @InterfaceC6490
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;

    @InterfaceC6490
    private ColorFilter colorFilter;

    @InterfaceC6490
    private ColorStateList compatRippleColor;

    @InterfaceC6391
    private final Context context;
    private boolean currentChecked;

    @InterfaceC3897
    private int currentChipBackgroundColor;

    @InterfaceC3897
    private int currentChipStrokeColor;

    @InterfaceC3897
    private int currentChipSurfaceColor;

    @InterfaceC3897
    private int currentCompatRippleColor;

    @InterfaceC3897
    private int currentCompositeSurfaceBackgroundColor;

    @InterfaceC3897
    private int currentTextColor;

    @InterfaceC3897
    private int currentTint;

    @InterfaceC6490
    private final Paint debugPaint;

    @InterfaceC6391
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;

    @InterfaceC6490
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;

    @InterfaceC6490
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;

    @InterfaceC6490
    private MotionSpec showMotionSpec;

    @InterfaceC6490
    private CharSequence text;

    @InterfaceC6391
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;

    @InterfaceC6490
    private ColorStateList tint;

    @InterfaceC6490
    private PorterDuffColorFilter tintFilter;

    @InterfaceC6490
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(context, attributeSet, i, i2);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            closeIconRippleMask.setTint(-1);
        }
    }

    private void applyChildDrawable(@InterfaceC6490 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C4520.m13234(drawable, C4520.m13227(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            C4520.m13236(drawable, this.closeIconTint);
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            C4520.m13236(drawable2, this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void calculateChipIconBounds(@InterfaceC6391 Rect rect, @InterfaceC6391 RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (C4520.m13227(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + currentChipIconWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - currentChipIconWidth;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            float fExactCenterY = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + currentChipIconHeight;
        }
    }

    private void calculateChipTouchBounds(@InterfaceC6391 Rect rect, @InterfaceC6391 RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (C4520.m13227(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private void calculateCloseIconBounds(@InterfaceC6391 Rect rect, @InterfaceC6391 RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding;
            if (C4520.m13227(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.closeIconSize;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.closeIconSize;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.closeIconSize;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void calculateCloseIconTouchBounds(@InterfaceC6391 Rect rect, @InterfaceC6391 RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (C4520.m13227(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(@InterfaceC6391 Rect rect, @InterfaceC6391 RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float fCalculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (C4520.m13227(this) == 0) {
                rectF.left = rect.left + fCalculateChipIconWidth;
                rectF.right = rect.right - fCalculateCloseIconWidth;
            } else {
                rectF.left = rect.left + fCalculateCloseIconWidth;
                rectF.right = rect.right - fCalculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.checkable;
    }

    @InterfaceC6391
    public static ChipDrawable createFromAttributes(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.loadFromAttributes(attributeSet, i, i2);
        return chipDrawable;
    }

    @InterfaceC6391
    public static ChipDrawable createFromResource(@InterfaceC6391 Context context, @InterfaceC8570 int i) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C1980R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, C1980R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void drawChipBackground(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawChipIcon(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void drawChipStroke(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (this.chipStrokeWidth <= 0.0f || this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipStrokeColor);
        this.chipPaint.setStyle(Paint.Style.STROKE);
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColorFilter(getTintColorFilter());
        }
        RectF rectF = this.rectF;
        float f = rect.left;
        float f2 = this.chipStrokeWidth;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
        canvas.drawRoundRect(this.rectF, f3, f3, this.chipPaint);
    }

    private void drawChipSurface(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipSurfaceColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawCloseIcon(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            } else {
                this.closeIcon.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void drawCompatRipple(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(C3913.m11173(C8273.f24692, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(C3913.m11173(-65536, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(C3913.m11173(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(@InterfaceC6391 Canvas canvas, @InterfaceC6391 Rect rect) {
        if (this.text != null) {
            Paint.Align alignCalculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(alignCalculateTextOriginAndAlignment);
            int iSave = 0;
            boolean z = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequenceEllipsize = this.text;
            if (z && this.truncateAt != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.pointF;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.textDrawableHelper.getTextPaint());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float fCeil = this.chipIconSize;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float getCurrentChipIconWidth() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f = this.chipIconSize;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    @InterfaceC6490
    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        return colorFilter != null ? colorFilter : this.tintFilter;
    }

    private static boolean hasState(@InterfaceC6490 int[] iArr, @InterfaceC3451 int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void loadFromAttributes(@InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, C1980R.styleable.Chip, i, i2, new int[0]);
        this.isShapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.Chip_chipCornerRadius)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(C1980R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        setTextAppearance(textAppearance);
        int i3 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_checkedIcon));
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.Chip_checkedIconTint)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_checkedIconTint));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setChipSurfaceColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    private boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    private boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    private void unapplyChildDrawable(@InterfaceC6490 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        this.compatRippleColor = this.useCompatRipple ? RippleUtils.sanitizeRippleDrawableColor(this.rippleColor) : null;
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    public float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
        }
        return 0.0f;
    }

    public float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    @InterfaceC6391
    public Paint.Align calculateTextOriginAndAlignment(@InterfaceC6391 Rect rect, @InterfaceC6391 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (C4520.m13227(this) == 0) {
                pointF.x = rect.left + fCalculateChipIconWidth;
            } else {
                pointF.x = rect.right - fCalculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.alpha;
        int iSaveLayerAlpha = i < 255 ? CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        drawChipSurface(canvas, bounds);
        drawChipBackground(canvas, bounds);
        if (this.isShapeThemingEnabled) {
            super.draw(canvas);
        }
        drawChipStroke(canvas, bounds);
        drawCompatRipple(canvas, bounds);
        drawChipIcon(canvas, bounds);
        drawCheckedIcon(canvas, bounds);
        if (this.shouldDrawText) {
            drawText(canvas, bounds);
        }
        drawCloseIcon(canvas, bounds);
        drawDebug(canvas, bounds);
        if (this.alpha < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @InterfaceC6490
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @InterfaceC6490
    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    @InterfaceC6490
    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    @InterfaceC6490
    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return C4520.m13238(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @InterfaceC6490
    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @InterfaceC6490
    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(@InterfaceC6391 RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    @InterfaceC6490
    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return C4520.m13238(drawable);
        }
        return null;
    }

    @InterfaceC6490
    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @InterfaceC6391
    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @InterfaceC6490
    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(@InterfaceC6391 RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6490
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @InterfaceC6490
    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + this.textDrawableHelper.getTextWidth(getText().toString()) + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    @InterfaceC6844
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@InterfaceC6391 Outline outline) {
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @InterfaceC6490
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @InterfaceC6490
    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @InterfaceC6490
    public CharSequence getText() {
        return this.text;
    }

    @InterfaceC6490
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC6391 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    public boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor) || (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (showsChipIcon()) {
            zOnLayoutDirectionChanged |= C4520.m13234(this.chipIcon, i);
        }
        if (showsCheckedIcon()) {
            zOnLayoutDirectionChanged |= C4520.m13234(this.checkedIcon, i);
        }
        if (showsCloseIcon()) {
            zOnLayoutDirectionChanged |= C4520.m13234(this.closeIcon, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (showsChipIcon()) {
            zOnLevelChange |= this.chipIcon.setLevel(i);
        }
        if (showsCheckedIcon()) {
            zOnLevelChange |= this.checkedIcon.setLevel(i);
        }
        if (showsCloseIcon()) {
            zOnLevelChange |= this.closeIcon.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@InterfaceC6391 int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (!z && this.currentChecked) {
                this.currentChecked = false;
            }
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@InterfaceC3567 int i) {
        setCheckable(this.context.getResources().getBoolean(i));
    }

    public void setCheckedIcon(@InterfaceC6490 Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@InterfaceC3567 int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setCheckedIconResource(@InterfaceC4525 int i) {
        setCheckedIcon(C3323.m396(this.context, i));
    }

    public void setCheckedIconTint(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                C4520.m13236(this.checkedIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@InterfaceC3906 int i) {
        setCheckedIconTint(C3323.m395(this.context, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedIconVisible(@InterfaceC3567 int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setChipBackgroundColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@InterfaceC3906 int i) {
        setChipBackgroundColor(C3323.m395(this.context, i));
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        if (this.chipCornerRadius != f) {
            this.chipCornerRadius = f;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@InterfaceC4398 int i) {
        setChipCornerRadius(this.context.getResources().getDimension(i));
    }

    public void setChipEndPadding(float f) {
        if (this.chipEndPadding != f) {
            this.chipEndPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@InterfaceC4398 int i) {
        setChipEndPadding(this.context.getResources().getDimension(i));
    }

    public void setChipIcon(@InterfaceC6490 Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? C4520.m13239(drawable).mutate() : null;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@InterfaceC3567 int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@InterfaceC4525 int i) {
        setChipIcon(C3323.m396(this.context, i));
    }

    public void setChipIconSize(float f) {
        if (this.chipIconSize != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@InterfaceC4398 int i) {
        setChipIconSize(this.context.getResources().getDimension(i));
    }

    public void setChipIconTint(@InterfaceC6490 ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                C4520.m13236(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@InterfaceC3906 int i) {
        setChipIconTint(C3323.m395(this.context, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChipIconVisible(@InterfaceC3567 int i) {
        setChipIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setChipMinHeight(float f) {
        if (this.chipMinHeight != f) {
            this.chipMinHeight = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@InterfaceC4398 int i) {
        setChipMinHeight(this.context.getResources().getDimension(i));
    }

    public void setChipStartPadding(float f) {
        if (this.chipStartPadding != f) {
            this.chipStartPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@InterfaceC4398 int i) {
        setChipStartPadding(this.context.getResources().getDimension(i));
    }

    public void setChipStrokeColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@InterfaceC3906 int i) {
        setChipStrokeColor(C3323.m395(this.context, i));
    }

    public void setChipStrokeWidth(float f) {
        if (this.chipStrokeWidth != f) {
            this.chipStrokeWidth = f;
            this.chipPaint.setStrokeWidth(f);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@InterfaceC4398 int i) {
        setChipStrokeWidth(this.context.getResources().getDimension(i));
    }

    public void setCloseIcon(@InterfaceC6490 Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fCalculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? C4520.m13239(drawable).mutate() : null;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                updateFrameworkCloseIconRipple();
            }
            float fCalculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (fCalculateCloseIconWidth != fCalculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@InterfaceC6490 CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = C3530.m9457().m9467(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@InterfaceC3567 int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        if (this.closeIconEndPadding != f) {
            this.closeIconEndPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@InterfaceC4398 int i) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setCloseIconResource(@InterfaceC4525 int i) {
        setCloseIcon(C3323.m396(this.context, i));
    }

    public void setCloseIconSize(float f) {
        if (this.closeIconSize != f) {
            this.closeIconSize = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@InterfaceC4398 int i) {
        setCloseIconSize(this.context.getResources().getDimension(i));
    }

    public void setCloseIconStartPadding(float f) {
        if (this.closeIconStartPadding != f) {
            this.closeIconStartPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@InterfaceC4398 int i) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i));
    }

    public boolean setCloseIconState(@InterfaceC6391 int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                C4520.m13236(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@InterfaceC3906 int i) {
        setCloseIconTint(C3323.m395(this.context, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCloseIconVisible(@InterfaceC3567 int i) {
        setCloseIconVisible(this.context.getResources().getBoolean(i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@InterfaceC6490 Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(@InterfaceC6490 TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(@InterfaceC3258 int i) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setIconEndPadding(float f) {
        if (this.iconEndPadding != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@InterfaceC4398 int i) {
        setIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setIconStartPadding(float f) {
        if (this.iconStartPadding != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@InterfaceC4398 int i) {
        setIconStartPadding(this.context.getResources().getDimension(i));
    }

    public void setMaxWidth(@InterfaceC6844 int i) {
        this.maxWidth = i;
    }

    public void setRippleColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@InterfaceC3906 int i) {
        setRippleColor(C3323.m395(this.context, i));
    }

    public void setShouldDrawText(boolean z) {
        this.shouldDrawText = z;
    }

    public void setShowMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(@InterfaceC3258 int i) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setText(@InterfaceC6490 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(@InterfaceC6490 TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@InterfaceC7651 int i) {
        setTextAppearance(new TextAppearance(this.context, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextColor(@InterfaceC3897 int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public void setTextEndPadding(float f) {
        if (this.textEndPadding != f) {
            this.textEndPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@InterfaceC4398 int i) {
        setTextEndPadding(this.context.getResources().getDimension(i));
    }

    public void setTextResource(@InterfaceC7613 int i) {
        setText(this.context.getResources().getString(i));
    }

    public void setTextSize(@InterfaceC4399 float f) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f);
            this.textDrawableHelper.getTextPaint().setTextSize(f);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f) {
        if (this.textStartPadding != f) {
            this.textStartPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@InterfaceC4398 int i) {
        setTextStartPadding(this.context.getResources().getDimension(i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z) {
        if (this.useCompatRipple != z) {
            this.useCompatRipple = z;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z, z2);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z, z2);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCheckedIconVisible(boolean z) {
        if (this.checkedIconVisible != z) {
            boolean zShowsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z;
            boolean zShowsCheckedIcon2 = showsCheckedIcon();
            if (zShowsCheckedIcon != zShowsCheckedIcon2) {
                if (zShowsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setChipIconVisible(boolean z) {
        if (this.chipIconVisible != z) {
            boolean zShowsChipIcon = showsChipIcon();
            this.chipIconVisible = z;
            boolean zShowsChipIcon2 = showsChipIcon();
            if (zShowsChipIcon != zShowsChipIcon2) {
                if (zShowsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCloseIconVisible(boolean z) {
        if (this.closeIconVisible != z) {
            boolean zShowsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z;
            boolean zShowsCloseIcon2 = showsCloseIcon();
            if (zShowsCloseIcon != zShowsCloseIcon2) {
                if (zShowsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }

    private boolean onStateChange(@InterfaceC6391 int[] iArr, @InterfaceC6391 int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        boolean state = true;
        if (this.currentChipSurfaceColor != iCompositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = iCompositeElevationOverlayIfNeeded;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int iCompositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != iCompositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = iCompositeElevationOverlayIfNeeded2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iCompositeElevationOverlayIfNeeded, iCompositeElevationOverlayIfNeeded2);
        if ((this.currentCompositeSurfaceBackgroundColor != iLayer) | (getFillColor() == null)) {
            this.currentCompositeSurfaceBackgroundColor = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState) {
            this.currentChipStrokeColor = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        if (this.currentCompatRippleColor != colorForState2) {
            this.currentCompatRippleColor = colorForState2;
            if (this.useCompatRipple) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : this.textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState3) {
            this.currentTextColor = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = hasState(getState(), R.attr.state_checked) && this.checkable;
        if (this.currentChecked == z2 || this.checkedIcon == null) {
            z = false;
        } else {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z2;
            if (fCalculateChipIconWidth != calculateChipIconWidth()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentTint) : 0;
        if (this.currentTint != colorForState4) {
            this.currentTint = colorForState4;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
        } else {
            state = zOnStateChange;
        }
        if (isStateful(this.chipIcon)) {
            state |= this.chipIcon.setState(iArr);
        }
        if (isStateful(this.checkedIcon)) {
            state |= this.checkedIcon.setState(iArr);
        }
        if (isStateful(this.closeIcon)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.closeIcon.setState(iArr3);
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && isStateful(this.closeIconRipple)) {
            state |= this.closeIconRipple.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            onSizeChange();
        }
        return state;
    }

    private static boolean isStateful(@InterfaceC6490 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(@InterfaceC6490 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(@InterfaceC6490 TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }
}
