package com.google.android.material.resources;

import Yue.C7130;
import Yue.C8273;
import Yue.InterfaceC5052;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;

    @InterfaceC6490
    public final String fontFamily;

    @InterfaceC5052
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @InterfaceC6490
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @InterfaceC6490
    private ColorStateList textColor;

    @InterfaceC6490
    public final ColorStateList textColorHint;

    @InterfaceC6490
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(@InterfaceC6391 Context context, @InterfaceC7651 int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1980R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = MaterialResources.getIndexWithValue(typedArrayObtainStyledAttributes, C1980R.styleable.TextAppearance_fontFamily, C1980R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = typedArrayObtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(C1980R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(C1980R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(C1980R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C1980R.styleable.MaterialTextAppearance);
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(C1980R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(C1980R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void createFallbackFont() {
        String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i = this.typeface;
            if (i == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.font = Typeface.SERIF;
            } else if (i != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, this.textStyle);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.fontFamilyResourceId;
        return (i != 0 ? C7130.m22272(context, i) : null) != null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    @InterfaceC6391
    @InterfaceC8392
    public Typeface getFont(@InterfaceC6391 Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM22278 = C7130.m22278(context, this.fontFamilyResourceId);
                this.font = typefaceM22278;
                if (typefaceM22278 != null) {
                    this.font = Typeface.create(typefaceM22278, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d(TAG, "Error loading font " + this.fontFamily, e);
            }
        }
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getFontAsync(@InterfaceC6391 Context context, @InterfaceC6391 final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i = this.fontFamilyResourceId;
        if (i == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            C7130.m22280(context, i, new C7130.AbstractC7134() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // Yue.C7130.AbstractC7134
                /* JADX INFO: renamed from: onFontRetrievalFailed */
                public void m22286(int i2) {
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i2);
                }

                @Override // Yue.C7130.AbstractC7134
                /* JADX INFO: renamed from: onFontRetrieved */
                public void m22287(@InterfaceC6391 Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.font = Typeface.create(typeface, textAppearance.textStyle);
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrieved(TextAppearance.this.font, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e) {
            Log.d(TAG, "Error loading font " + this.fontFamily, e);
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    @InterfaceC6490
    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public void updateDrawState(@InterfaceC6391 Context context, @InterfaceC6391 TextPaint textPaint, @InterfaceC6391 TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : C8273.f24692);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(@InterfaceC6391 Context context, @InterfaceC6391 TextPaint textPaint, @InterfaceC6391 TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@InterfaceC6391 Context context, @InterfaceC6391 TextPaint textPaint, @InterfaceC6391 Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@InterfaceC6391 final Context context, @InterfaceC6391 final TextPaint textPaint, @InterfaceC6391 final TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i) {
                textAppearanceFontCallback.onFontRetrievalFailed(i);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@InterfaceC6391 Typeface typeface, boolean z) {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z);
            }
        });
    }
}
