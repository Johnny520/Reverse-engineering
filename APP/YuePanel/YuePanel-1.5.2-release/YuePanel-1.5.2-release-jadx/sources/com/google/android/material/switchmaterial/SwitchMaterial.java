package com.google.android.material.switchmaterial;

import Yue.C7692;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends C7692 {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @InterfaceC6391
    private final ElevationOverlayProvider elevationOverlayProvider;

    @InterfaceC6490
    private ColorStateList materialThemeColorsThumbTintList;

    @InterfaceC6490
    private ColorStateList materialThemeColorsTrackTintList;
    private boolean useMaterialThemeColors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SwitchMaterial(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.materialThemeColorsThumbTintList == null) {
            int color = MaterialColors.getColor(this, C1980R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, C1980R.attr.colorControlActivated);
            float dimension = getResources().getDimension(C1980R.dimen.mtrl_switch_thumb_elevation);
            if (this.elevationOverlayProvider.isThemeElevationOverlayEnabled()) {
                dimension += ViewUtils.getParentAbsoluteElevation(this);
            }
            int iCompositeOverlayIfNeeded = this.elevationOverlayProvider.compositeOverlayIfNeeded(color, dimension);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color, color2, 1.0f);
            iArr2[1] = iCompositeOverlayIfNeeded;
            iArr2[2] = MaterialColors.layer(color, color2, 0.38f);
            iArr2[3] = iCompositeOverlayIfNeeded;
            this.materialThemeColorsThumbTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsThumbTintList;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.materialThemeColorsTrackTintList == null) {
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C1980R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, C1980R.attr.colorControlActivated);
            int color3 = MaterialColors.getColor(this, C1980R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color, color2, 0.54f);
            iArr2[1] = MaterialColors.layer(color, color3, 0.32f);
            iArr2[2] = MaterialColors.layer(color, color2, 0.12f);
            iArr2[3] = MaterialColors.layer(color, color3, 0.12f);
            this.materialThemeColorsTrackTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTrackTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.useMaterialThemeColors && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SwitchMaterial(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.SwitchMaterial, i, i2, new int[0]);
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
