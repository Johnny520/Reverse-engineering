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
public final class y40 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f5345a;

    /* JADX INFO: renamed from: b */
    public final C0249g5 f5346b;

    /* JADX INFO: renamed from: c */
    public CharSequence f5347c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f5348d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f5349e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f5350f;

    /* JADX INFO: renamed from: g */
    public int f5351g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f5352h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f5353i;

    /* JADX INFO: renamed from: j */
    public boolean f5354j;

    public y40(TextInputLayout textInputLayout, C0658r5 c0658r5) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f5345a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f5348d = checkableImageButton;
        C0249g5 c0249g5 = new C0249g5(getContext(), null);
        this.f5346b = c0249g5;
        if (AbstractC0274gu.m1321x(getContext())) {
            AbstractC0423kt.m1714g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f5353i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
        this.f5353i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0259gf.m1236T(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0658r5.f4064b;
        if (typedArray.hasValue(69)) {
            this.f5349e = AbstractC0274gu.m1314h(getContext(), c0658r5, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f5350f = AbstractC0498mu.m1881C(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m2724b(c0658r5.m2241m(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f5351g) {
            this.f5351g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM1258s = AbstractC0259gf.m1258s(typedArray.getInt(68, -1));
            this.f5352h = scaleTypeM1258s;
            checkableImageButton.setScaleType(scaleTypeM1258s);
        }
        c0249g5.setVisibility(8);
        c0249g5.setId(R.id.textinput_prefix_text);
        c0249g5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = oa0.f3426a;
        aa0.m43f(c0249g5, 1);
        c0249g5.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0249g5.setTextColor(c0658r5.m2240l(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f5347c = TextUtils.isEmpty(text2) ? null : text2;
        c0249g5.setText(text2);
        m2727e();
        addView(checkableImageButton);
        addView(c0249g5);
    }

    /* JADX INFO: renamed from: a */
    public final int m2723a() {
        int iM1709b;
        CheckableImageButton checkableImageButton = this.f5348d;
        if (checkableImageButton.getVisibility() == 0) {
            iM1709b = AbstractC0423kt.m1709b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM1709b = 0;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2734f(this.f5346b) + y90.m2734f(this) + iM1709b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2724b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5348d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f5349e;
            PorterDuff.Mode mode = this.f5350f;
            TextInputLayout textInputLayout = this.f5345a;
            AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, colorStateList, mode);
            m2725c(true);
            AbstractC0259gf.m1233Q(textInputLayout, checkableImageButton, this.f5349e);
            return;
        }
        m2725c(false);
        View.OnLongClickListener onLongClickListener = this.f5353i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
        this.f5353i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0259gf.m1236T(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2725c(boolean z) {
        CheckableImageButton checkableImageButton = this.f5348d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m2726d();
            m2727e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2726d() {
        int iM2734f;
        EditText editText = this.f5345a.f1129d;
        if (editText == null) {
            return;
        }
        if (this.f5348d.getVisibility() == 0) {
            iM2734f = 0;
        } else {
            WeakHashMap weakHashMap = oa0.f3426a;
            iM2734f = y90.m2734f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = oa0.f3426a;
        y90.m2739k(this.f5346b, iM2734f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m2727e() {
        int i = (this.f5347c == null || this.f5354j) ? 8 : 0;
        setVisibility((this.f5348d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f5346b.setVisibility(i);
        this.f5345a.m741q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2726d();
    }
}
