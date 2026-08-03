package com.google.android.material.textfield;

import Yue.C3055;
import Yue.C3343;
import Yue.C5194;
import Yue.C5946;
import Yue.C7759;
import Yue.C7837;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7651;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;

    @InterfaceC6490
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;

    @InterfaceC6391
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, C7837 c7837) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, C5194.f1338));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1980R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        C3343 c3343 = new C3343(getContext());
        this.prefixTextView = c3343;
        initStartIconView(c7837);
        initPrefixTextView(c7837);
        addView(checkableImageButton);
        addView(c3343);
    }

    private void initPrefixTextView(C7837 c7837) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(C1980R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C8273.m27441(this.prefixTextView, 1);
        setPrefixTextAppearance(c7837.m24888(C1980R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (c7837.m24896(C1980R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(c7837.m24871(C1980R.styleable.TextInputLayout_prefixTextColor));
        }
        setPrefixText(c7837.m24891(C1980R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(C7837 c7837) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            C5946.m18703((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (c7837.m24896(C1980R.styleable.TextInputLayout_startIconTint)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), c7837, C1980R.styleable.TextInputLayout_startIconTint);
        }
        if (c7837.m24896(C1980R.styleable.TextInputLayout_startIconTintMode)) {
            this.startIconTintMode = ViewUtils.parseTintMode(c7837.m24882(C1980R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (c7837.m24896(C1980R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(c7837.m24875(C1980R.styleable.TextInputLayout_startIconDrawable));
            if (c7837.m24896(C1980R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(c7837.m24891(C1980R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(c7837.m3933(C1980R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(c7837.m24874(C1980R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(C1980R.dimen.mtrl_min_touch_target_size)));
        if (c7837.m24896(C1980R.styleable.TextInputLayout_startIconScaleType)) {
            setStartIconScaleType(IconHelper.convertScaleType(c7837.m24882(C1980R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void updateVisibility() {
        int i = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    @InterfaceC6490
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    @InterfaceC6490
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public int getPrefixTextStartOffset() {
        return C8273.m27367(this) + C8273.m27367(this.prefixTextView) + (isStartIconVisible() ? this.startIconView.getMeasuredWidth() + C5946.m2609((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()) : 0);
    }

    @InterfaceC6391
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    @InterfaceC6490
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @InterfaceC6490
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    @InterfaceC6391
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(@InterfaceC6490 CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(@InterfaceC7651 int i) {
        C7759.m24676(this.prefixTextView, i);
    }

    public void setPrefixTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(@InterfaceC6490 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public void setStartIconMinSize(@InterfaceC6844 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.startIconMinSize) {
            this.startIconMinSize = i;
            IconHelper.setIconMinSize(this.startIconView, i);
        }
    }

    public void setStartIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(@InterfaceC6391 ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(@InterfaceC6391 C3055 c3055) {
        if (this.prefixTextView.getVisibility() != 0) {
            c3055.m6109(this.startIconView);
        } else {
            c3055.m6077(this.prefixTextView);
            c3055.m6109(this.prefixTextView);
        }
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        C8273.m27471(this.prefixTextView, isStartIconVisible() ? 0 : C8273.m27367(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C1980R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
