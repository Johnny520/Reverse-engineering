package p001A0;

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
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p018J0.C0234d;
import p057g.C0868K;
import p081s0.AbstractC1077k;

/* JADX INFO: renamed from: A0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0015A extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f42a;

    /* JADX INFO: renamed from: b */
    public final C0868K f43b;

    /* JADX INFO: renamed from: c */
    public CharSequence f44c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f45d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f46e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f47f;

    /* JADX INFO: renamed from: g */
    public int f48g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f49h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f50i;

    /* JADX INFO: renamed from: j */
    public boolean f51j;

    public C0015A(TextInputLayout textInputLayout, C0234d c0234d) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f42a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1031R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f45d = checkableImageButton;
        C0868K c0868k = new C0868K(getContext(), null);
        this.f43b = c0868k;
        if (AbstractC0805P.m2031E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f50i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
        this.f50i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0040p.m89T(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0234d.f475c;
        if (typedArray.hasValue(69)) {
            this.f46e = AbstractC0805P.m2050q(getContext(), c0234d, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f47f = AbstractC1077k.m2558f(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m20b(c0234d.m646i(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f48g) {
            this.f48g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM113r = AbstractC0040p.m113r(typedArray.getInt(68, -1));
            this.f49h = scaleTypeM113r;
            checkableImageButton.setScaleType(scaleTypeM113r);
        }
        c0868k.setVisibility(8);
        c0868k.setId(C1031R.id.textinput_prefix_text);
        c0868k.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = AbstractC0080Q.f219a;
        c0868k.setAccessibilityLiveRegion(1);
        c0868k.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0868k.setTextColor(c0234d.m645h(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f44c = TextUtils.isEmpty(text2) ? null : text2;
        c0868k.setText(text2);
        m23e();
        addView(checkableImageButton);
        addView(c0868k);
    }

    /* JADX INFO: renamed from: a */
    public final int m19a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f45d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        Field field = AbstractC0080Q.f219a;
        return this.f43b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: b */
    public final void m20b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f45d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f46e;
            PorterDuff.Mode mode = this.f47f;
            TextInputLayout textInputLayout = this.f42a;
            AbstractC0040p.m98c(textInputLayout, checkableImageButton, colorStateList, mode);
            m21c(true);
            AbstractC0040p.m86O(textInputLayout, checkableImageButton, this.f46e);
            return;
        }
        m21c(false);
        View.OnLongClickListener onLongClickListener = this.f50i;
        checkableImageButton.setOnClickListener(null);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
        this.f50i = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0040p.m89T(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f45d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m22d();
            m23e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22d() {
        int paddingStart;
        EditText editText = this.f42a.f2469d;
        if (editText == null) {
            return;
        }
        if (this.f45d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = AbstractC0080Q.f219a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C1031R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = AbstractC0080Q.f219a;
        this.f43b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m23e() {
        int i2 = (this.f44c == null || this.f51j) ? 8 : 0;
        setVisibility((this.f45d.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f43b.setVisibility(i2);
        this.f42a.m1903q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        m22d();
    }
}
