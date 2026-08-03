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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p018J0.C0234d;
import p056f0.AbstractC0805P;
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

    public C0015A(TextInputLayout r11, C0234d r12) {
        super(r11.getContext());
        this.f42a = r11;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton r1 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1031R.layout.design_text_input_start_icon, this, false);
        this.f45d = r1;
        CharSequence r6 = null;
        C0868K r4 = new C0868K(getContext(), null);
        this.f43b = r4;
        if (AbstractC0805P.m2031E(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r1.getLayoutParams()).setMarginEnd(0);
    L5:
        View.OnLongClickListener r5 = this.f50i;
        r1.setOnClickListener(null);
        AbstractC0040p.m89T(r1, r5);
        this.f50i = null;
        r1.setOnLongClickListener(null);
        AbstractC0040p.m89T(r1, null);
        TypedArray r52 = (TypedArray) r12.f475c;
        if (r52.hasValue(69) == false) goto L9;
        this.f46e = AbstractC0805P.m2050q(getContext(), r12, 69);
    L9:
        if (r52.hasValue(70) == false) goto L12;
        this.f47f = AbstractC1077k.m2558f(r52.getInt(70, -1), null);
    L12:
        if (r52.hasValue(66) == false) goto L19;
        m20b(r12.m646i(66));
        if (r52.hasValue(65) == false) goto L18;
        CharSequence r7 = r52.getText(65);
        if (r1.getContentDescription() == r7) goto L18;
        r1.setContentDescription(r7);
    L18:
        r1.setCheckable(r52.getBoolean(64, true));
    L19:
        int r72 = r52.getDimensionPixelSize(67, getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size));
        if (r72 < 0) goto L37;
        if (r72 == this.f48g) goto L25;
        this.f48g = r72;
        r1.setMinimumWidth(r72);
        r1.setMinimumHeight(r72);
    L25:
        if (r52.hasValue(68) == false) goto L27;
        ImageView.ScaleType r3 = AbstractC0040p.m113r(r52.getInt(68, -1));
        this.f49h = r3;
        r1.setScaleType(r3);
    L27:
        r4.setVisibility(8);
        r4.setId(C1031R.id.textinput_prefix_text);
        r4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field r112 = AbstractC0080Q.f219a;
        r4.setAccessibilityLiveRegion(1);
        r4.setTextAppearance(r52.getResourceId(60, 0));
        if (r52.hasValue(61) == false) goto L30;
        r4.setTextColor(r12.m645h(61));
    L30:
        CharSequence r113 = r52.getText(59);
        if (TextUtils.isEmpty(r113) == true) goto L34;
        r6 = r113;
    L34:
        this.f44c = r6;
        r4.setText(r113);
        m23e();
        addView(r1);
        addView(r4);
        return;
    L37:
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* JADX INFO: renamed from: a */
    public final int m19a() {
        CheckableImageButton r02 = this.f45d;
        if (r02.getVisibility() != 0) goto L5;
        int r1 = r02.getMeasuredWidth();
        int r03 = ((ViewGroup.MarginLayoutParams) r02.getLayoutParams()).getMarginEnd() + r1;
    L6:
        Field r12 = AbstractC0080Q.f219a;
        int r13 = getPaddingStart();
        return (this.f43b.getPaddingStart() + r13) + r03;
    L5:
        r03 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m20b(Drawable r4) {
        CheckableImageButton r02 = this.f45d;
        r02.setImageDrawable(r4);
        if (r4 == null) goto L5;
        ColorStateList r42 = this.f46e;
        PorterDuff.Mode r1 = this.f47f;
        TextInputLayout r2 = this.f42a;
        AbstractC0040p.m98c(r2, r02, r42, r1);
        m21c(true);
        AbstractC0040p.m86O(r2, r02, this.f46e);
        return;
    L5:
        m21c(false);
        View.OnLongClickListener r43 = this.f50i;
        r02.setOnClickListener(null);
        AbstractC0040p.m89T(r02, r43);
        this.f50i = null;
        r02.setOnLongClickListener(null);
        AbstractC0040p.m89T(r02, null);
        if (r02.getContentDescription() == null) goto L10;
        r02.setContentDescription(null);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m21c(boolean r4) {
        CheckableImageButton r02 = this.f45d;
        int r2 = 0;
        if (r02.getVisibility() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == r4) goto L12;
        if (r4 == true) goto L10;
        r2 = 8;
    L10:
        r02.setVisibility(r2);
        m22d();
        m23e();
        return;
    L12:
        return;
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m22d() {
        EditText r02 = this.f42a.f2469d;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f45d.getVisibility() != 0) goto L8;
        int r1 = 0;
    L9:
        int r2 = r02.getCompoundPaddingTop();
        int r3 = getContext().getResources().getDimensionPixelSize(C1031R.dimen.material_input_text_to_prefix_suffix_padding);
        int r03 = r02.getCompoundPaddingBottom();
        Field r4 = AbstractC0080Q.f219a;
        this.f43b.setPaddingRelative(r1, r2, r3, r03);
        return;
    L8:
        Field r12 = AbstractC0080Q.f219a;
        r1 = r02.getPaddingStart();
        goto L9
    }

    /* JADX INFO: renamed from: e */
    public final void m23e() {
        int r1 = 8;
        if (this.f44c != null) goto L5;
    L7:
        int r02 = 8;
    L9:
        if (this.f45d.getVisibility() == 0) goto L11;
        if (r02 == 0) goto L11;
    L12:
        setVisibility(r1);
        this.f43b.setVisibility(r02);
        this.f42a.m1903q();
        return;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (this.f51j == true) goto L7;
        r02 = 0;
        goto L9
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        m22d();
    }
}
