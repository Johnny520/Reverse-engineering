package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0225;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.internal.CheckableImageButton;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3186 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10721;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f10722;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CheckableImageButton f10723;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ImageView.ScaleType f10724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public View.OnLongClickListener f10725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public PorterDuff.Mode f10726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0225 f10728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CharSequence f10729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10730;

    public C3186(TextInputLayout textInputLayout, C0108 c0108) {
        super(textInputLayout.getContext());
        this.f10730 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f10723 = checkableImageButton;
        C0225 c0225 = new C0225(getContext(), null);
        this.f10728 = c0225;
        if (AbstractC7739.m13065(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        TypedArray typedArray = (TypedArray) c0108.f320;
        if (typedArray.hasValue(70)) {
            this.f10722 = AbstractC7739.m13072(getContext(), c0108, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f10726 = AbstractC3160.m7181(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            m7244(c0108.m390(67));
            if (typedArray.hasValue(66)) {
                m7245(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C5925.m11310("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f10727) {
            this.f10727 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeM6740 = AbstractC3057.m6740(typedArray.getInt(69, -1));
            this.f10724 = scaleTypeM6740;
            checkableImageButton.setScaleType(scaleTypeM6740);
        }
        c0225.setVisibility(8);
        c0225.setId(R.id.textinput_prefix_text);
        c0225.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c0225.setAccessibilityLiveRegion(1);
        c0225.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c0225.setTextColor(c0108.m385(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f10729 = TextUtils.isEmpty(text) ? null : text;
        c0225.setText(text);
        m7241();
        addView(checkableImageButton);
        addView(c0225);
        checkableImageButton.setOnFocusableChangedListener(new C2358(this, 3));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7242();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10725;
        CheckableImageButton checkableImageButton = this.f10723;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10725 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10723;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3057.m6735(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7241() {
        int i = (this.f10729 == null || this.f10721) ? 8 : 0;
        setVisibility((this.f10723.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f10728.setVisibility(i);
        this.f10730.m7203();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7242() {
        EditText editText = this.f10730.f10634;
        if (editText == null) {
            return;
        }
        this.f10728.setPaddingRelative(this.f10723.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7243(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f10723;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f10730.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7242();
            m7241();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7244(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10723;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable == null) {
            m7243(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            m7245(null);
            return;
        }
        ColorStateList colorStateList = this.f10722;
        PorterDuff.Mode mode = this.f10726;
        TextInputLayout textInputLayout = this.f10730;
        AbstractC3057.m6742(textInputLayout, checkableImageButton, colorStateList, mode);
        m7243(true);
        AbstractC3057.m6746(textInputLayout, checkableImageButton, this.f10722);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7245(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10723;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3057.m6732(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7246() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f10723;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f10728.getPaddingStart() + getPaddingStart() + marginEnd;
    }
}
