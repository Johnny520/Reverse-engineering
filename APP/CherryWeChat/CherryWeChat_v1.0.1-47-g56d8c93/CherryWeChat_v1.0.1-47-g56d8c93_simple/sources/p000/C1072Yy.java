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

    public C1072Yy(TextInputLayout r11, C2656w4 r12) {
        super(r11.getContext());
        this.f3384a = r11;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton r1 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f3387d = r1;
        CharSequence r6 = null;
        C2304o4 r2 = new C2304o4(getContext(), null);
        this.f3385b = r2;
        if (AbstractC0828TB.m1650t(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r1.getLayoutParams()).setMarginEnd(0);
    L5:
        View.OnLongClickListener r5 = this.f3392i;
        r1.setOnClickListener(null);
        AbstractC0295Gu.m602C(r1, r5);
        this.f3392i = null;
        r1.setOnLongClickListener(null);
        AbstractC0295Gu.m602C(r1, null);
        TypedArray r52 = (TypedArray) r12.f9196b;
        if (r52.hasValue(70) == false) goto L9;
        this.f3388e = AbstractC0828TB.m1642i(getContext(), r12, 70);
    L9:
        if (r52.hasValue(71) == false) goto L12;
        this.f3389f = AbstractC0148Dc.m282p(r52.getInt(71, -1), null);
    L12:
        if (r52.hasValue(67) == false) goto L19;
        m2005b(r12.m5210q(67));
        if (r52.hasValue(66) == false) goto L18;
        CharSequence r7 = r52.getText(66);
        if (r1.getContentDescription() == r7) goto L18;
        r1.setContentDescription(r7);
    L18:
        r1.setCheckable(r52.getBoolean(65, true));
    L19:
        int r72 = r52.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r72 < 0) goto L37;
        if (r72 == this.f3390g) goto L25;
        this.f3390g = r72;
        r1.setMinimumWidth(r72);
        r1.setMinimumHeight(r72);
    L25:
        if (r52.hasValue(69) == false) goto L27;
        ImageView.ScaleType r4 = AbstractC0295Gu.m613f(r52.getInt(69, -1));
        this.f3391h = r4;
        r1.setScaleType(r4);
    L27:
        r2.setVisibility(8);
        r2.setId(R.id.textinput_prefix_text);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r2.setAccessibilityLiveRegion(1);
        r2.setTextAppearance(r52.getResourceId(61, 0));
        if (r52.hasValue(62) == false) goto L30;
        r2.setTextColor(r12.m5209p(62));
    L30:
        CharSequence r112 = r52.getText(60);
        if (TextUtils.isEmpty(r112) == true) goto L34;
        r6 = r112;
    L34:
        this.f3386c = r6;
        r2.setText(r112);
        m2008e();
        addView(r1);
        addView(r2);
        return;
    L37:
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* JADX INFO: renamed from: a */
    public final int m2004a() {
        CheckableImageButton r0 = this.f3387d;
        if (r0.getVisibility() != 0) goto L5;
        int r1 = r0.getMeasuredWidth();
        int r02 = ((ViewGroup.MarginLayoutParams) r0.getLayoutParams()).getMarginEnd() + r1;
    L6:
        int r12 = getPaddingStart();
        return (this.f3385b.getPaddingStart() + r12) + r02;
    L5:
        r02 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2005b(Drawable r4) {
        CheckableImageButton r0 = this.f3387d;
        r0.setImageDrawable(r4);
        if (r4 == null) goto L6;
        ColorStateList r42 = this.f3388e;
        PorterDuff.Mode r1 = this.f3389f;
        TextInputLayout r2 = this.f3384a;
        AbstractC0295Gu.m608a(r2, r0, r42, r1);
        m2006c(true);
        AbstractC0295Gu.m600A(r2, r0, this.f3388e);
        return;
    L6:
        m2006c(false);
        View.OnLongClickListener r43 = this.f3392i;
        r0.setOnClickListener(null);
        AbstractC0295Gu.m602C(r0, r43);
        this.f3392i = null;
        r0.setOnLongClickListener(null);
        AbstractC0295Gu.m602C(r0, null);
        if (r0.getContentDescription() == null) goto L10;
        r0.setContentDescription(null);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m2006c(boolean r4) {
        CheckableImageButton r0 = this.f3387d;
        int r2 = 0;
        if (r0.getVisibility() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == r4) goto L12;
        if (r4 == true) goto L10;
        r2 = 8;
    L10:
        r0.setVisibility(r2);
        m2007d();
        m2008e();
        return;
    L12:
        return;
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m2007d() {
        EditText r0 = this.f3384a.f4625e;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.f3387d.getVisibility() != 0) goto L8;
        int r1 = 0;
    L9:
        int r2 = r0.getCompoundPaddingTop();
        int r3 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r02 = r0.getCompoundPaddingBottom();
        this.f3385b.setPaddingRelative(r1, r2, r3, r02);
        return;
    L8:
        r1 = r0.getPaddingStart();
        goto L9
    }

    /* JADX INFO: renamed from: e */
    public final void m2008e() {
        int r1 = 8;
        if (this.f3386c != null) goto L5;
    L7:
        int r0 = 8;
    L9:
        if (this.f3387d.getVisibility() == 0) goto L11;
        if (r0 == 0) goto L11;
    L12:
        setVisibility(r1);
        this.f3385b.setVisibility(r0);
        this.f3384a.m2491s();
        return;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (this.f3393j == true) goto L7;
        r0 = 0;
        goto L9
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        m2007d();
    }
}
