package com.google.android.material.textview;

import Yue.C3343;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7662;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends C3343 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialTextView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void applyLineHeightFromViewAppearance(@InterfaceC6391 Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, C1980R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, C1980R.styleable.MaterialTextAppearance_android_lineHeight, C1980R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, C1980R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int findViewAppearanceResourceId(@InterfaceC6391 Resources.Theme theme, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1980R.styleable.MaterialTextView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void initialize(@InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i, i2) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
        }
    }

    private static int readFirstAvailableDimension(@InterfaceC6391 Context context, @InterfaceC6391 TypedArray typedArray, @InterfaceC6391 @InterfaceC7662 int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i], -1);
        }
        return dimensionPixelSize;
    }

    private static boolean viewAttrsHasLineHeight(@InterfaceC6391 Context context, @InterfaceC6391 Resources.Theme theme, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1980R.styleable.MaterialTextView, i, i2);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialTextView_android_lineHeight, C1980R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    @Override // Yue.C3343, android.widget.TextView
    public void setTextAppearance(@InterfaceC6391 Context context, int i) {
        super.setTextAppearance(context, i);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        initialize(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        initialize(attributeSet, i, i2);
    }
}
