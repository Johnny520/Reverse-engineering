package com.google.android.material.radiobutton;

import Yue.C3320;
import Yue.C4068;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C3320 {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @InterfaceC6490
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialRadioButton(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int color = MaterialColors.getColor(this, C1980R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C1980R.attr.colorOnSurface);
            int color3 = MaterialColors.getColor(this, C1980R.attr.colorSurface);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = MaterialColors.layer(color3, color2, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && C4068.m1022(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            C4068.m11502(this, getMaterialThemeColorsTintList());
        } else {
            C4068.m11502(this, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialRadioButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialRadioButton_buttonTint)) {
            C4068.m11502(this, MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialRadioButton_buttonTint));
        }
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
