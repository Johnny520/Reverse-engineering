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
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Yy */
/* JADX INFO: loaded from: classes.dex */
public final class C1072Yy extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f3384a;

    /* JADX INFO: renamed from: b */
    public final C2304o4 f3385b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3386c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f3387d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f3388e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f3389f;

    /* JADX INFO: renamed from: g */
    public int f3390g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f3391h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f3392i;

    /* JADX INFO: renamed from: j */
    public boolean f3393j;

    public C1072Yy(TextInputLayout textInputLayout, C2656w4 c2656w4) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f3384a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3387d = checkableImageButton;
        C2304o4 c2304o4 = new C2304o4(getContext(), null);
        this.f3385b = c2304o4;
        if (AbstractC0828TB.m1650t(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3392i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
        this.f3392i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0295Gu.m602C(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c2656w4.f9196b;
        if (typedArray.hasValue(70)) {
            this.f3388e = AbstractC0828TB.m1642i(getContext(), c2656w4, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f3389f = AbstractC0148Dc.m282p(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            m2005b(c2656w4.m5210q(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3390g) {
            this.f3390g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeM613f = AbstractC0295Gu.m613f(typedArray.getInt(69, -1));
            this.f3391h = scaleTypeM613f;
            checkableImageButton.setScaleType(scaleTypeM613f);
        }
        c2304o4.setVisibility(8);
        c2304o4.setId(R.id.textinput_prefix_text);
        c2304o4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c2304o4.setAccessibilityLiveRegion(1);
        c2304o4.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c2304o4.setTextColor(c2656w4.m5209p(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.f3386c = TextUtils.isEmpty(text2) ? null : text2;
        c2304o4.setText(text2);
        m2008e();
        addView(checkableImageButton);
        addView(c2304o4);
    }

    /* JADX INFO: renamed from: a */
    public final int m2004a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f3387d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f3385b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: b */
    public final void m2005b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3387d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3388e;
            PorterDuff.Mode mode = this.f3389f;
            TextInputLayout textInputLayout = this.f3384a;
            AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, colorStateList, mode);
            m2006c(true);
            AbstractC0295Gu.m600A(textInputLayout, checkableImageButton, this.f3388e);
            return;
        }
        m2006c(false);
        View.OnLongClickListener onLongClickListener = this.f3392i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
        this.f3392i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0295Gu.m602C(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2006c(boolean z) {
        CheckableImageButton checkableImageButton = this.f3387d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m2007d();
            m2008e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2007d() {
        EditText editText = this.f3384a.f4625e;
        if (editText == null) {
            return;
        }
        this.f3385b.setPaddingRelative(this.f3387d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: e */
    public final void m2008e() {
        int i = (this.f3386c == null || this.f3393j) ? 8 : 0;
        setVisibility((this.f3387d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f3385b.setVisibility(i);
        this.f3384a.m2491s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2007d();
    }
}
