package com.google.android.material.materialswitch;

import Yue.C3323;
import Yue.C3913;
import Yue.C4520;
import Yue.C7692;
import Yue.C7837;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends C7692 {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON = {C1980R.attr.state_with_icon};
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;

    @InterfaceC6490
    private Drawable thumbDrawable;

    @InterfaceC6490
    private Drawable thumbIconDrawable;

    @InterfaceC6844
    private int thumbIconSize;

    @InterfaceC6490
    private ColorStateList thumbIconTintList;

    @InterfaceC6391
    private PorterDuff.Mode thumbIconTintMode;

    @InterfaceC6490
    private ColorStateList thumbTintList;

    @InterfaceC6490
    private Drawable trackDecorationDrawable;

    @InterfaceC6490
    private ColorStateList trackDecorationTintList;

    @InterfaceC6391
    private PorterDuff.Mode trackDecorationTintMode;

    @InterfaceC6490
    private Drawable trackDrawable;

    @InterfaceC6490
    private ColorStateList trackTintList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialSwitch(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        Drawable drawable = this.thumbDrawable;
        Drawable drawable2 = this.thumbIconDrawable;
        int i = this.thumbIconSize;
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable layerDrawable = this.trackDrawable;
        if (layerDrawable != null && this.trackDecorationDrawable != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.trackDecorationDrawable;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void setInterpolatedDrawableTintIfPossible(@InterfaceC6490 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6391 int[] iArr, @InterfaceC6391 int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        C4520.m13235(drawable, C3913.m11153(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    private void updateDrawableTints() {
        if (this.thumbTintList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
    }

    @Override // Yue.C7692
    @InterfaceC6490
    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @InterfaceC6490
    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    @InterfaceC6844
    public int getThumbIconSize() {
        return this.thumbIconSize;
    }

    @InterfaceC6490
    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    @InterfaceC6391
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Override // Yue.C7692
    @InterfaceC6490
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @InterfaceC6490
    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    @InterfaceC6490
    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    @InterfaceC6391
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    @Override // Yue.C7692
    @InterfaceC6490
    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Override // Yue.C7692
    @InterfaceC6490
    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    @Override // android.view.View
    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    @Override // Yue.C7692, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // Yue.C7692
    public void setThumbDrawable(@InterfaceC6490 Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconResource(@InterfaceC4525 int i) {
        setThumbIconDrawable(C3323.m396(getContext(), i));
    }

    public void setThumbIconSize(@InterfaceC6844 int i) {
        if (this.thumbIconSize != i) {
            this.thumbIconSize = i;
            refreshThumbDrawable();
        }
    }

    public void setThumbIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbIconTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    @Override // Yue.C7692
    public void setThumbTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    @Override // Yue.C7692
    public void setThumbTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(@InterfaceC6490 Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(@InterfaceC4525 int i) {
        setTrackDecorationDrawable(C3323.m396(getContext(), i));
    }

    public void setTrackDecorationTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    @Override // Yue.C7692
    public void setTrackDrawable(@InterfaceC6490 Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // Yue.C7692
    public void setTrackTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    @Override // Yue.C7692
    public void setTrackTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialSwitch(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.thumbIconSize = -1;
        Context context2 = getContext();
        this.thumbDrawable = super.getThumbDrawable();
        this.thumbTintList = super.getThumbTintList();
        super.setThumbTintList(null);
        this.trackDrawable = super.getTrackDrawable();
        this.trackTintList = super.getTrackTintList();
        super.setTrackTintList(null);
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialSwitch, i, i2, new int[0]);
        this.thumbIconDrawable = c7837ObtainTintedStyledAttributes.m24875(C1980R.styleable.MaterialSwitch_thumbIcon);
        this.thumbIconSize = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.MaterialSwitch_thumbIconSize, -1);
        this.thumbIconTintList = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.MaterialSwitch_thumbIconTint);
        int iM24882 = c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.thumbIconTintMode = ViewUtils.parseTintMode(iM24882, mode);
        this.trackDecorationDrawable = c7837ObtainTintedStyledAttributes.m24875(C1980R.styleable.MaterialSwitch_trackDecoration);
        this.trackDecorationTintList = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.MaterialSwitch_trackDecorationTint);
        this.trackDecorationTintMode = ViewUtils.parseTintMode(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.MaterialSwitch_trackDecorationTintMode, -1), mode);
        c7837ObtainTintedStyledAttributes.m24899();
        setEnforceSwitchWidth(false);
        refreshThumbDrawable();
        refreshTrackDrawable();
    }
}
