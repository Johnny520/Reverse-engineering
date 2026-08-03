package com.google.android.material.appbar;

import Yue.C4520;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C1980R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    @InterfaceC6490
    private Boolean logoAdjustViewBounds;

    @InterfaceC6490
    private ImageView.ScaleType logoScaleType;

    @InterfaceC6490
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialToolbar(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(@InterfaceC6490 TextView textView, @InterfaceC6490 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void initBackground(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : DrawableUtils.getColorStateListOrNull(background);
        if (colorStateListValueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(C8273.m27347(this));
            C8273.m27447(this, materialShapeDrawable);
        }
    }

    private void layoutTitleCenteredHorizontally(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair<Integer, Integer> pairCalculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, pairCalculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, pairCalculateTitleBoundLimits);
        }
    }

    @InterfaceC6490
    private Drawable maybeTintNavigationIcon(@InterfaceC6490 Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable drawableM13239 = C4520.m13239(drawable.mutate());
        C4520.m13235(drawableM13239, this.navigationIconTint.intValue());
        return drawableM13239;
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            C4520.m13236(C4520.m13239(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    @InterfaceC6490
    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    @InterfaceC3897
    @InterfaceC6490
    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof C8694;
        if (z) {
            ((C8694) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        if (z) {
            ((C8694) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.logoAdjustViewBounds;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z) {
            this.logoAdjustViewBounds = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@InterfaceC6391 ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@InterfaceC6490 Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(@InterfaceC3897 int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.subtitleCentered != z) {
            this.subtitleCentered = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.titleCentered != z) {
            this.titleCentered = z;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialToolbar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(C1980R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.titleCentered = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i3 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i3];
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.logoAdjustViewBounds = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        initBackground(context2);
    }
}
