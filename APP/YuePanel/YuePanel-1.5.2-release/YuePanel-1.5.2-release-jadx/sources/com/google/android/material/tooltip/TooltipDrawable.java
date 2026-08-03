package com.google.android.material.tooltip;

import Yue.C3913;
import Yue.InterfaceC3451;
import Yue.InterfaceC4885;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    @InterfaceC7651
    private static final int DEFAULT_STYLE = C1980R.style.Widget_MaterialComponents_Tooltip;

    @InterfaceC3451
    private static final int DEFAULT_THEME_ATTR = C1980R.attr.tooltipStyle;
    private int arrowSize;

    @InterfaceC6391
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;

    @InterfaceC6391
    private final Context context;

    @InterfaceC6391
    private final Rect displayFrame;

    @InterfaceC6490
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;

    @InterfaceC6490
    private CharSequence text;

    @InterfaceC6391
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    private TooltipDrawable(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(context, attributeSet, i, i2);
        this.fontMetrics = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                TooltipDrawable.this.updateLocationOnScreen(view);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                return 0.0f;
            }
            i = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(@InterfaceC6391 Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    @InterfaceC6391
    public static TooltipDrawable create(@InterfaceC6391 Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static TooltipDrawable createFromAttributes(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.loadFromAttributes(attributeSet, i, i2);
        return tooltipDrawable;
    }

    private EdgeTreatment createMarkerEdge() {
        float f = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.arrowSize) * Math.sqrt(2.0d)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.arrowSize), Math.min(Math.max(f, -fWidth), fWidth));
    }

    private void drawText(@InterfaceC6391 Canvas canvas) {
        if (this.text == null) {
            return;
        }
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(getBounds());
        if (this.textDrawableHelper.getTextAppearance() != null) {
            this.textDrawableHelper.getTextPaint().drawableState = getState();
            this.textDrawableHelper.updateTextPaintDrawState(this.context);
            this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iCalculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.getTextWidth(charSequence.toString());
    }

    private void loadFromAttributes(@InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, C1980R.styleable.Tooltip, i, i2, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_tooltip_arrowSize);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Tooltip_showMarker, true);
        this.showMarker = z;
        if (z) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        } else {
            this.arrowSize = 0;
        }
        setText(typedArrayObtainStyledAttributes.getText(C1980R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null && typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.Tooltip_android_textColor)) {
            textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C1980R.styleable.Tooltip_android_textColor));
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(C1980R.styleable.Tooltip_backgroundTint, MaterialColors.layer(C3913.m11173(MaterialColors.getColor(this.context, R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), C3913.m11173(MaterialColors.getColor(this.context, C1980R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.context, C1980R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.Tooltip_android_padding, 0);
        this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.Tooltip_android_minWidth, 0);
        this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.Tooltip_android_minHeight, 0);
        this.layoutMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(@InterfaceC6391 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(@InterfaceC6490 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f = (float) (-((((double) this.arrowSize) * Math.sqrt(2.0d)) - ((double) this.arrowSize)));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.tooltipPivotY));
        canvas.translate(fCalculatePointerOffset, f);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @InterfaceC6490
    public CharSequence getText() {
        return this.text;
    }

    @InterfaceC6490
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public int getTextPadding() {
        return this.padding;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.showMarker) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@InterfaceC6844 int i) {
        this.layoutMargin = i;
        invalidateSelf();
    }

    public void setMinHeight(@InterfaceC6844 int i) {
        this.minHeight = i;
        invalidateSelf();
    }

    public void setMinWidth(@InterfaceC6844 int i) {
        this.minWidth = i;
        invalidateSelf();
    }

    public void setRelativeToView(@InterfaceC6490 View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void setRevealFraction(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f;
        this.tooltipScaleY = f;
        this.labelOpacity = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setText(@InterfaceC6490 CharSequence charSequence) {
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(@InterfaceC6490 TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@InterfaceC7651 int i) {
        setTextAppearance(new TextAppearance(this.context, i));
    }

    public void setTextPadding(@InterfaceC6844 int i) {
        this.padding = i;
        invalidateSelf();
    }

    public void setTextResource(@InterfaceC7613 int i) {
        setText(this.context.getResources().getString(i));
    }

    @InterfaceC6391
    public static TooltipDrawable createFromAttributes(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }
}
