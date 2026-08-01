package defpackage;

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
    public final TextInputLayout a;
    public final g5 b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;
    public boolean j;

    public r40(TextInputLayout r11, r5 r12) {
        super(r11.getContext());
        this.a = r11;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton r1 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.d = r1;
        CharSequence r6 = null;
        g5 r2 = new g5(getContext(), null);
        this.b = r2;
        if (ct.s(getContext()) == false) goto L5;
        et.g((ViewGroup.MarginLayoutParams) r1.getLayoutParams(), 0);
    L5:
        View.OnLongClickListener r5 = this.i;
        r1.setOnClickListener(null);
        ff.M(r1, r5);
        this.i = null;
        r1.setOnLongClickListener(null);
        ff.M(r1, null);
        TypedArray r52 = (TypedArray) r12.b;
        if (r52.hasValue(69) == false) goto L9;
        this.e = ct.m(getContext(), r12, 69);
    L9:
        if (r52.hasValue(70) == false) goto L12;
        this.f = gt.v(r52.getInt(70, -1), null);
    L12:
        if (r52.hasValue(66) == false) goto L19;
        b(r12.m(66));
        if (r52.hasValue(65) == false) goto L18;
        CharSequence r7 = r52.getText(65);
        if (r1.getContentDescription() == r7) goto L18;
        r1.setContentDescription(r7);
    L18:
        r1.setCheckable(r52.getBoolean(64, true));
    L19:
        int r72 = r52.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r72 < 0) goto L37;
        if (r72 == this.g) goto L25;
        this.g = r72;
        r1.setMinimumWidth(r72);
        r1.setMinimumHeight(r72);
    L25:
        if (r52.hasValue(68) == false) goto L27;
        ImageView.ScaleType r4 = ff.l(r52.getInt(68, -1));
        this.h = r4;
        r1.setScaleType(r4);
    L27:
        r2.setVisibility(8);
        r2.setId(R.id.textinput_prefix_text);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap r112 = ja0.a;
        v90.f(r2, 1);
        r2.setTextAppearance(r52.getResourceId(60, 0));
        if (r52.hasValue(61) == false) goto L30;
        r2.setTextColor(r12.l(61));
    L30:
        CharSequence r113 = r52.getText(59);
        if (TextUtils.isEmpty(r113) == true) goto L34;
        r6 = r113;
    L34:
        this.c = r6;
        r2.setText(r113);
        e();
        addView(r1);
        addView(r2);
        return;
    L37:
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        CheckableImageButton r0 = this.d;
        if (r0.getVisibility() != 0) goto L5;
        int r1 = r0.getMeasuredWidth();
        int r02 = et.b((ViewGroup.MarginLayoutParams) r0.getLayoutParams()) + r1;
    L6:
        WeakHashMap r12 = ja0.a;
        int r13 = t90.f(this);
        return (t90.f(this.b) + r13) + r02;
    L5:
        r02 = 0;
        goto L6
    }

    public final void b(Drawable r4) {
        CheckableImageButton r0 = this.d;
        r0.setImageDrawable(r4);
        if (r4 == null) goto L6;
        ColorStateList r42 = this.e;
        PorterDuff.Mode r1 = this.f;
        TextInputLayout r2 = this.a;
        ff.a(r2, r0, r42, r1);
        c(true);
        ff.K(r2, r0, this.e);
        return;
    L6:
        c(false);
        View.OnLongClickListener r43 = this.i;
        r0.setOnClickListener(null);
        ff.M(r0, r43);
        this.i = null;
        r0.setOnLongClickListener(null);
        ff.M(r0, null);
        if (r0.getContentDescription() == null) goto L10;
        r0.setContentDescription(null);
        return;
    }

    public final void c(boolean r4) {
        CheckableImageButton r0 = this.d;
        int r2 = 0;
        if (r0.getVisibility() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == r4) goto L12;
        if (r4 == true) goto L10;
        r2 = 8;
    L10:
        r0.setVisibility(r2);
        d();
        e();
        return;
    L12:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void d() {
        EditText r0 = this.a.d;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.d.getVisibility() != 0) goto L8;
        int r1 = 0;
    L9:
        int r2 = r0.getCompoundPaddingTop();
        int r3 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r02 = r0.getCompoundPaddingBottom();
        WeakHashMap r4 = ja0.a;
        t90.k(this.b, r1, r2, r3, r02);
        return;
    L8:
        WeakHashMap r12 = ja0.a;
        r1 = t90.f(r0);
        goto L9
    }

    public final void e() {
        int r1 = 8;
        if (this.c != null) goto L5;
    L7:
        int r0 = 8;
    L9:
        if (this.d.getVisibility() == 0) goto L11;
        if (r0 == 0) goto L11;
    L12:
        setVisibility(r1);
        this.b.setVisibility(r0);
        this.a.q();
        return;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (this.j == true) goto L7;
        r0 = 0;
        goto L9
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        d();
    }
}
