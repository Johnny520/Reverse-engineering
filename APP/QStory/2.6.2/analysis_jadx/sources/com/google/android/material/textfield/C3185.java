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
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.internal.CheckableImageButton;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3185 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10716;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f10717;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CheckableImageButton f10718;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ImageView.ScaleType f10719;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public View.OnLongClickListener f10720;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public PorterDuff.Mode f10721;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10722;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0225 f10723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CharSequence f10724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f10725;

    public C3185(TextInputLayout textInputLayout, C0108 c0108) {
        super(textInputLayout.getContext());
        this.f10725 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f10718 = checkableImageButton;
        C0225 c0225 = new C0225(getContext(), null);
        this.f10723 = c0225;
        if (AbstractC8189.m13674(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        TypedArray typedArray = (TypedArray) c0108.f320;
        if (typedArray.hasValue(70)) {
            this.f10717 = AbstractC8189.m13682(getContext(), c0108, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f10721 = AbstractC3159.m7194(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            m7257(c0108.m389(67));
            if (typedArray.hasValue(66)) {
                m7258(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C5919.m11249("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f10722) {
            this.f10722 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeM6613 = AbstractC3054.m6613(typedArray.getInt(69, -1));
            this.f10719 = scaleTypeM6613;
            checkableImageButton.setScaleType(scaleTypeM6613);
        }
        c0225.setVisibility(8);
        c0225.setId(R.id.textinput_prefix_text);
        c0225.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c0225.setAccessibilityLiveRegion(1);
        c0225.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c0225.setTextColor(c0108.m384(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f10724 = TextUtils.isEmpty(text) ? null : text;
        c0225.setText(text);
        m7254();
        addView(checkableImageButton);
        addView(c0225);
        checkableImageButton.setOnFocusableChangedListener(new C2358(this, 3));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7255();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f10720;
        CheckableImageButton checkableImageButton = this.f10718;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10720 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f10718;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3054.m6594(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7254() {
        int i = (this.f10724 == null || this.f10716) ? 8 : 0;
        setVisibility((this.f10718.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f10723.setVisibility(i);
        this.f10725.m7216();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7255() {
        EditText editText = this.f10725.f10629;
        if (editText == null) {
            return;
        }
        this.f10723.setPaddingRelative(this.f10718.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7256(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f10718;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f10725.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7255();
            m7254();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7257(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10718;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable == null) {
            m7256(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            m7258(null);
            return;
        }
        ColorStateList colorStateList = this.f10717;
        PorterDuff.Mode mode = this.f10721;
        TextInputLayout textInputLayout = this.f10725;
        AbstractC3054.m6597(textInputLayout, checkableImageButton, colorStateList, mode);
        m7256(true);
        AbstractC3054.m6588(textInputLayout, checkableImageButton, this.f10717);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7258(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f10718;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3054.m6578(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7259() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f10718;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f10723.getPaddingStart() + getPaddingStart() + marginEnd;
    }
}
