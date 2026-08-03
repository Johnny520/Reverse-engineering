package p000a;

import android.annotation.SuppressLint;
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
import com.google.android.material.C1247R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.se */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C0826se extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f3287a;

    /* JADX INFO: renamed from: b */
    public final C0794r1 f3288b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3289c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f3290d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f3291e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f3292f;

    /* JADX INFO: renamed from: g */
    public int f3293g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f3294h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f3295i;

    /* JADX INFO: renamed from: j */
    public boolean f3296j;

    public C0826se(TextInputLayout textInputLayout, C0751of c0751of) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f3287a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1247R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3290d = checkableImageButton;
        C0794r1 c0794r1 = new C0794r1(getContext(), null);
        this.f3288b = c0794r1;
        if (C0336Sa.m927d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3295i;
        checkableImageButton.setOnClickListener(null);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
        this.f3295i = null;
        checkableImageButton.setOnLongClickListener(null);
        C0227M8.m620d(checkableImageButton, null);
        int i = C1247R.styleable.TextInputLayout_startIconTint;
        TypedArray typedArray = c0751of.f2960b;
        if (typedArray.hasValue(i)) {
            this.f3291e = C0336Sa.m924a(getContext(), c0751of, C1247R.styleable.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_startIconTintMode)) {
            this.f3292f = C0324Rg.m896b(typedArray.getInt(C1247R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_startIconDrawable)) {
            m1927b(c0751of.m1770b(C1247R.styleable.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(C1247R.styleable.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(C1247R.styleable.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C1247R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(C1247R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3293g) {
            this.f3293g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeM618b = C0227M8.m618b(typedArray.getInt(C1247R.styleable.TextInputLayout_startIconScaleType, -1));
            this.f3294h = scaleTypeM618b;
            checkableImageButton.setScaleType(scaleTypeM618b);
        }
        c0794r1.setVisibility(8);
        c0794r1.setId(C1247R.id.textinput_prefix_text);
        c0794r1.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        c0794r1.setAccessibilityLiveRegion(1);
        c0794r1.setTextAppearance(typedArray.getResourceId(C1247R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_prefixTextColor)) {
            c0794r1.setTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(C1247R.styleable.TextInputLayout_prefixText);
        this.f3289c = TextUtils.isEmpty(text2) ? null : text2;
        c0794r1.setText(text2);
        m1930e();
        addView(checkableImageButton);
        addView(c0794r1);
    }

    /* JADX INFO: renamed from: a */
    public final int m1926a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f3290d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        return this.f3288b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: b */
    public final void m1927b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3290d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3291e;
            PorterDuff.Mode mode = this.f3292f;
            TextInputLayout textInputLayout = this.f3287a;
            C0227M8.m617a(textInputLayout, checkableImageButton, colorStateList, mode);
            m1928c(true);
            C0227M8.m619c(textInputLayout, checkableImageButton, this.f3291e);
            return;
        }
        m1928c(false);
        View.OnLongClickListener onLongClickListener = this.f3295i;
        checkableImageButton.setOnClickListener(null);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
        this.f3295i = null;
        checkableImageButton.setOnLongClickListener(null);
        C0227M8.m620d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1928c(boolean z) {
        CheckableImageButton checkableImageButton = this.f3290d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m1929d();
            m1930e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1929d() {
        int paddingStart;
        EditText editText = this.f3287a.f5910d;
        if (editText == null) {
            return;
        }
        if (this.f3290d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C1247R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
        this.f3288b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m1930e() {
        int i = (this.f3289c == null || this.f3296j) ? 8 : 0;
        setVisibility((this.f3290d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f3288b.setVisibility(i);
        this.f3287a.m3272q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1929d();
    }
}
