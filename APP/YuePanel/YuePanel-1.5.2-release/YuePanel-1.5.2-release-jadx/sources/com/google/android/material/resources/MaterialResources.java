package com.google.android.material.resources;

import Yue.C3323;
import Yue.C7837;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC7662;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public static ColorStateList getColorStateList(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i) {
        int resourceId;
        ColorStateList colorStateListM395;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM395 = C3323.m395(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM395;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @InterfaceC6490
    public static Drawable getDrawable(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i) {
        int resourceId;
        Drawable drawableM396;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM396 = C3323.m396(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM396;
    }

    public static float getFontScale(@InterfaceC6391 Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @InterfaceC7662
    public static int getIndexWithValue(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @InterfaceC6490
    public static TextAppearance getTextAppearance(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledTextSize(@InterfaceC6391 Context context, @InterfaceC7651 int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1980R.styleable.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(C1980R.styleable.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return !value ? i2 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(@InterfaceC6391 Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(@InterfaceC6391 Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_2_0;
    }

    @InterfaceC6490
    public static ColorStateList getColorStateList(@InterfaceC6391 Context context, @InterfaceC6391 C7837 c7837, @InterfaceC7662 int i) {
        int iM24888;
        ColorStateList colorStateListM395;
        return (!c7837.m24896(i) || (iM24888 = c7837.m24888(i, 0)) == 0 || (colorStateListM395 = C3323.m395(context, iM24888)) == null) ? c7837.m24871(i) : colorStateListM395;
    }
}
