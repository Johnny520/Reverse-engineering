package com.google.android.material.elevation;

import Yue.C3913;
import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ElevationOverlayProvider(@InterfaceC6391 Context context) {
        this(MaterialAttributes.resolveBoolean(context, C1980R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, C1980R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, C1980R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, C1980R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@InterfaceC3897 int i) {
        return C3913.m11173(i, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        if (this.displayDensity <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    public int compositeOverlay(@InterfaceC3897 int i, float f, @InterfaceC6391 View view) {
        return compositeOverlay(i, f + getParentAbsoluteElevation(view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    public int compositeOverlayIfNeeded(@InterfaceC3897 int i, float f, @InterfaceC6391 View view) {
        return compositeOverlayIfNeeded(i, f + getParentAbsoluteElevation(view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, @InterfaceC6391 View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@InterfaceC6391 View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @InterfaceC3897
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @InterfaceC3897
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @InterfaceC3897
    public int compositeOverlay(@InterfaceC3897 int i, float f) {
        int i2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iAlpha = Color.alpha(i);
        int iLayer = MaterialColors.layer(C3913.m11173(i, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i2 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, C3913.m11173(i2, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return C3913.m11173(iLayer, iAlpha);
    }

    @InterfaceC3897
    public int compositeOverlayIfNeeded(@InterfaceC3897 int i, float f) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    @InterfaceC3897
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.colorSurface, f);
    }

    public ElevationOverlayProvider(boolean z, @InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC3897 int i3, float f) {
        this.elevationOverlayEnabled = z;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i2;
        this.colorSurface = i3;
        this.displayDensity = f;
    }
}
