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
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C1072;
import androidx.fragment.app.C3191;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.internal.CheckableImageButton;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4018 extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f11066;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ColorStateList f11067;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CheckableImageButton f11068;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ImageView.ScaleType f11069;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public View.OnLongClickListener f11070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public PorterDuff.Mode f11071;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f11072;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1072 f11073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CharSequence f11074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextInputLayout f11075;

    public C4018(TextInputLayout textInputLayout, C0955 c0955) {
        super(textInputLayout.getContext());
        this.f11075 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0328R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f11068 = checkableImageButton;
        C1072 c1072 = new C1072(getContext(), null);
        this.f11073 = c1072;
        if (AbstractC8568.m13624(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        TypedArray typedArray = (TypedArray) c0955.f665;
        if (typedArray.hasValue(70)) {
            this.f11067 = AbstractC8568.m13631(getContext(), c0955, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f11071 = AbstractC3992.m7740(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            m7803(c0955.m950(67));
            if (typedArray.hasValue(66)) {
                m7804(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(C0328R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C6755.m11869("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f11072) {
            this.f11072 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeM7300 = AbstractC3889.m7300(typedArray.getInt(69, -1));
            this.f11069 = scaleTypeM7300;
            checkableImageButton.setScaleType(scaleTypeM7300);
        }
        c1072.setVisibility(8);
        c1072.setId(C0328R.id.textinput_prefix_text);
        c1072.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c1072.setAccessibilityLiveRegion(1);
        c1072.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c1072.setTextColor(c0955.m945(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f11074 = TextUtils.isEmpty(text) ? null : text;
        c1072.setText(text);
        m7800();
        addView(checkableImageButton);
        addView(c1072);
        checkableImageButton.setOnFocusableChangedListener(new C3191(this, 3));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7801();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f11070;
        CheckableImageButton checkableImageButton = this.f11068;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11070 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f11068;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3889.m7295(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7800() {
        int i = (this.f11074 == null || this.f11066) ? 8 : 0;
        setVisibility((this.f11068.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f11073.setVisibility(i);
        this.f11075.m7762();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7801() {
        EditText editText = this.f11075.f10979;
        if (editText == null) {
            return;
        }
        this.f11073.setPaddingRelative(this.f11068.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C0328R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7802(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f11068;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f11075.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m7801();
            m7800();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7803(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f11068;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable == null) {
            m7802(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            m7804(null);
            return;
        }
        ColorStateList colorStateList = this.f11067;
        PorterDuff.Mode mode = this.f11071;
        TextInputLayout textInputLayout = this.f11075;
        AbstractC3889.m7302(textInputLayout, checkableImageButton, colorStateList, mode);
        m7802(true);
        AbstractC3889.m7306(textInputLayout, checkableImageButton, this.f11067);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7804(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f11068;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC3889.m7292(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7805() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f11068;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f11073.getPaddingStart() + getPaddingStart() + marginEnd;
    }
}
