package p000;

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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r40 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f4195a;

    /* JADX INFO: renamed from: b */
    public final C0249g5 f4196b;

    /* JADX INFO: renamed from: c */
    public CharSequence f4197c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f4198d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f4199e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f4200f;

    /* JADX INFO: renamed from: g */
    public int f4201g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f4202h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f4203i;

    /* JADX INFO: renamed from: j */
    public boolean f4204j;

    public r40(TextInputLayout textInputLayout, C0659r5 c0659r5) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4195a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4198d = checkableImageButton;
        C0249g5 c0249g5 = new C0249g5(getContext(), null);
        this.f4196b = c0249g5;
        if (AbstractC0126ct.m821s(getContext())) {
            AbstractC0199et.m1075g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f4203i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
        this.f4203i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0222ff.m1167M(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0659r5.f4209b;
        if (typedArray.hasValue(69)) {
            this.f4199e = AbstractC0126ct.m815m(getContext(), c0659r5, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f4200f = AbstractC0273gt.m1313v(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m2214b(c0659r5.m2234m(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4201g) {
            this.f4201g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM1190l = AbstractC0222ff.m1190l(typedArray.getInt(68, -1));
            this.f4202h = scaleTypeM1190l;
            checkableImageButton.setScaleType(scaleTypeM1190l);
        }
        c0249g5.setVisibility(8);
        c0249g5.setId(R.id.textinput_prefix_text);
        c0249g5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = ja0.f2600a;
        v90.m2499f(c0249g5, 1);
        c0249g5.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0249g5.setTextColor(c0659r5.m2233l(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f4197c = TextUtils.isEmpty(text2) ? null : text2;
        c0249g5.setText(text2);
        m2217e();
        addView(checkableImageButton);
        addView(c0249g5);
    }

    /* JADX INFO: renamed from: a */
    public final int m2213a() {
        int iM1070b;
        CheckableImageButton checkableImageButton = this.f4198d;
        if (checkableImageButton.getVisibility() == 0) {
            iM1070b = AbstractC0199et.m1070b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM1070b = 0;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2369f(this.f4196b) + t90.m2369f(this) + iM1070b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2214b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4198d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f4199e;
            PorterDuff.Mode mode = this.f4200f;
            TextInputLayout textInputLayout = this.f4195a;
            AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, colorStateList, mode);
            m2215c(true);
            AbstractC0222ff.m1165K(textInputLayout, checkableImageButton, this.f4199e);
            return;
        }
        m2215c(false);
        View.OnLongClickListener onLongClickListener = this.f4203i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
        this.f4203i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0222ff.m1167M(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2215c(boolean z) {
        CheckableImageButton checkableImageButton = this.f4198d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m2216d();
            m2217e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2216d() {
        int iM2369f;
        EditText editText = this.f4195a.f1204d;
        if (editText == null) {
            return;
        }
        if (this.f4198d.getVisibility() == 0) {
            iM2369f = 0;
        } else {
            WeakHashMap weakHashMap = ja0.f2600a;
            iM2369f = t90.m2369f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = ja0.f2600a;
        t90.m2374k(this.f4196b, iM2369f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m2217e() {
        int i = (this.f4197c == null || this.f4204j) ? 8 : 0;
        setVisibility((this.f4198d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f4196b.setVisibility(i);
        this.f4195a.m783q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2216d();
    }
}
