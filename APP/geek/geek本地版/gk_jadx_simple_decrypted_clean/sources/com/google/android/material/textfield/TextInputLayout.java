package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a60;
import defpackage.a80;
import defpackage.aa0;
import defpackage.af;
import defpackage.b60;
import defpackage.bf;
import defpackage.ch;
import defpackage.cj;
import defpackage.ct;
import defpackage.de;
import defpackage.du;
import defpackage.e;
import defpackage.e30;
import defpackage.e60;
import defpackage.eh;
import defpackage.ej;
import defpackage.et;
import defpackage.eu;
import defpackage.f0;
import defpackage.f30;
import defpackage.f60;
import defpackage.ff;
import defpackage.g5;
import defpackage.g60;
import defpackage.g8;
import defpackage.gt;
import defpackage.h10;
import defpackage.h60;
import defpackage.hd;
import defpackage.i60;
import defpackage.ib;
import defpackage.ip;
import defpackage.ja0;
import defpackage.jb;
import defpackage.jt;
import defpackage.k60;
import defpackage.kg;
import defpackage.l0;
import defpackage.m7;
import defpackage.p1;
import defpackage.ph;
import defpackage.pj;
import defpackage.q2;
import defpackage.q7;
import defpackage.r40;
import defpackage.r5;
import defpackage.r7;
import defpackage.s90;
import defpackage.t90;
import defpackage.u3;
import defpackage.v70;
import defpackage.v90;
import defpackage.vh;
import defpackage.wy;
import defpackage.y6;
import defpackage.yo;
import defpackage.z10;
import defpackage.za;
import defpackage.zo;
import defpackage.zt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] B0 = null;
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public eu F;
    public eu G;
    public StateListDrawable H;
    public boolean I;
    public eu J;
    public eu K;
    public f30 L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;
    public final FrameLayout a;
    public final RectF a0;
    public final r40 b;
    public Typeface b0;
    public final ej c;
    public ColorDrawable c0;
    public EditText d;
    public int d0;
    public CharSequence e;
    public final LinkedHashSet e0;
    public int f;
    public ColorDrawable f0;
    public int g;
    public int g0;
    public int h;
    public Drawable h0;
    public int i;
    public ColorStateList i0;
    public final zo j;
    public ColorStateList j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public boolean m;
    public int m0;
    public f60 n;
    public ColorStateList n0;
    public g5 o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public CharSequence r;
    public int r0;
    public boolean s;
    public int s0;
    public g5 t;
    public boolean t0;
    public ColorStateList u;
    public final za u0;
    public int v;
    public boolean v0;
    public pj w;
    public boolean w0;
    public pj x;
    public ValueAnimator x0;
    public ColorStateList y;
    public boolean y0;
    public ColorStateList z;
    public boolean z0;

    static {
        B0 = new int[][]{new int[]{R.attr.state_pressed}, new int[0]};
    }

    public TextInputLayout(Context r21, AttributeSet r22) {
        super(ff.W(r21, r22, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout), r22, com.ljx.wechatmod.R.attr.textInputStyle);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new zo(this);
        this.n = new jb(2);
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new RectF();
        this.e0 = new LinkedHashSet();
        za r1 = new za(this);
        this.u0 = r1;
        this.A0 = false;
        Context r3 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout r11 = new FrameLayout(r3);
        this.a = r11;
        r11.setAddStatesFromChildren(true);
        LinearInterpolator r5 = q2.a;
        r1.Q = r5;
        r1.h(false);
        r1.P = r5;
        r1.h(false);
        if (r1.g == 8388659) goto L5;
        r1.g = 8388659;
        r1.h(false);
    L5:
        a80.c(r3, r22, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        int[] r32 = wy.A;
        a80.e(r3, r22, r32, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout, new int[]{22, 20, 40, 45, 49});
        TypedArray r33 = r3.obtainStyledAttributes(r22, r32, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        r5 r6 = new r5(r3, r33);
        r40 r52 = new r40(this, r6);
        this.b = r52;
        this.C = r33.getBoolean(48, true);
        setHint(r33.getText(4));
        this.w0 = r33.getBoolean(47, true);
        this.v0 = r33.getBoolean(42, true);
        if (r33.hasValue(6) == false) goto L9;
        setMinEms(r33.getInt(6, -1));
    L12:
        if (r33.hasValue(5) == false) goto L15;
        setMaxEms(r33.getInt(5, -1));
    L17:
        this.L = f30.b(r3, r22, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout).a();
        this.N = r3.getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.P = r33.getDimensionPixelOffset(9, 0);
        this.R = r33.getDimensionPixelSize(16, r3.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.S = r33.getDimensionPixelSize(17, r3.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.Q = this.R;
        float r2 = r33.getDimension(13, -1.0f);
        float r7 = r33.getDimension(12, -1.0f);
        float r12 = r33.getDimension(10, -1.0f);
        float r4 = r33.getDimension(11, -1.0f);
        e30 r15 = this.L.e();
        if (r2 < 0.0f) goto L21;
        r15.e = new e(r2);
    L21:
        if (r7 < 0.0f) goto L24;
        r15.f = new e(r7);
    L24:
        if (r12 < 0.0f) goto L27;
        r15.g = new e(r12);
    L27:
        if (r4 < 0.0f) goto L29;
        r15.h = new e(r4);
    L29:
        this.L = r15.a();
        ColorStateList r23 = ct.m(r3, r6, 7);
        if (r23 == null) goto L35;
        int r42 = r23.getDefaultColor();
        this.o0 = r42;
        this.U = r42;
        if (r23.isStateful() == false) goto L34;
        this.p0 = r23.getColorForState(new int[]{-16842910}, -1);
        this.q0 = r23.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = r23.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
    L37:
        if (r33.hasValue(1) == false) goto L39;
        ColorStateList r24 = r6.l(1);
        this.j0 = r24;
        this.i0 = r24;
    L39:
        ColorStateList r43 = ct.m(r3, r6, 14);
        this.m0 = r33.getColor(14, 0);
        this.k0 = hd.a(r3, com.ljx.wechatmod.R.color.mtrl_textinput_default_box_stroke_color);
        this.s0 = hd.a(r3, com.ljx.wechatmod.R.color.mtrl_textinput_disabled_color);
        this.l0 = hd.a(r3, com.ljx.wechatmod.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (r43 == null) goto L43;
        setBoxStrokeColorStateList(r43);
    L43:
        if (r33.hasValue(15) == false) goto L46;
        setBoxStrokeErrorColor(ct.m(r3, r6, 15));
    L46:
        if (r33.getResourceId(49, -1) == (-1)) goto L48;
        setHintTextAppearance(r33.getResourceId(49, 0));
    L48:
        this.A = r6.l(24);
        this.B = r6.l(25);
        int r13 = r33.getResourceId(40, 0);
        CharSequence r25 = r33.getText(35);
        int r44 = r33.getInt(34, 1);
        boolean r72 = r33.getBoolean(36, false);
        int r122 = r33.getResourceId(45, 0);
        boolean r132 = r33.getBoolean(44, false);
        CharSequence r14 = r33.getText(43);
        int r152 = r33.getResourceId(57, 0);
        CharSequence r10 = r33.getText(56);
        boolean r8 = r33.getBoolean(18, false);
        setCounterMaxLength(r33.getInt(19, -1));
        this.q = r33.getResourceId(22, 0);
        this.p = r33.getResourceId(20, 0);
        setBoxBackgroundMode(r33.getInt(8, 0));
        setErrorContentDescription(r25);
        setErrorAccessibilityLiveRegion(r44);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(r122);
        setErrorTextAppearance(r13);
        setCounterTextAppearance(this.q);
        setPlaceholderText(r10);
        setPlaceholderTextAppearance(r152);
        if (r33.hasValue(41) == false) goto L52;
        setErrorTextColor(r6.l(41));
    L52:
        if (r33.hasValue(46) == false) goto L55;
        setHelperTextColor(r6.l(46));
    L55:
        if (r33.hasValue(50) == false) goto L58;
        setHintTextColor(r6.l(50));
    L58:
        if (r33.hasValue(23) == false) goto L61;
        setCounterTextColor(r6.l(23));
    L61:
        if (r33.hasValue(21) == false) goto L64;
        setCounterOverflowTextColor(r6.l(21));
    L64:
        if (r33.hasValue(58) == false) goto L66;
        setPlaceholderTextColor(r6.l(58));
    L66:
        ej r16 = new ej(this, r6);
        this.c = r16;
        boolean r34 = r33.getBoolean(0, true);
        r6.z();
        s90.s(this, 2);
        aa0.l(this, 1);
        r11.addView(r52);
        r11.addView(r16);
        addView(r11);
        setEnabled(r34);
        setHelperTextEnabled(r132);
        setErrorEnabled(r72);
        setCounterEnabled(r8);
        setHelperText(r14);
        return;
    L34:
        this.q0 = this.o0;
        ColorStateList r26 = ip.v(r3, com.ljx.wechatmod.R.color.mtrl_filled_background_color);
        this.p0 = r26.getColorForState(new int[]{-16842910}, -1);
        this.r0 = r26.getColorForState(new int[]{R.attr.state_hovered}, -1);
        goto L37
    L35:
        this.U = 0;
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        goto L37
    L15:
        if (r33.hasValue(2) == false) goto L17;
        setMaxWidth(r33.getDimensionPixelSize(2, -1));
        goto L17
    L9:
        if (r33.hasValue(3) == false) goto L12;
        setMinWidth(r33.getDimensionPixelSize(3, -1));
        goto L12
    }

    private Drawable getEditTextBoxBackground() {
        EditText r0 = this.d;
        if ((r0 instanceof AutoCompleteTextView) == false) goto L21;
        if (r0.getInputType() != 0) goto L21;
        int r02 = zt.k(this.d, com.ljx.wechatmod.R.attr.colorControlHighlight);
        int r1 = this.O;
        int[][] r5 = B0;
        if (r1 != 2) goto L15;
        Context r12 = getContext();
        eu r6 = this.F;
        TypedValue r7 = gt.A(r12, com.ljx.wechatmod.R.attr.colorSurface, "TextInputLayout");
        int r8 = r7.resourceId;
        if (r8 == 0) goto L12;
        int r13 = hd.a(r12, r8);
    L13:
        eu r72 = new eu(r6.a.a);
        int r03 = zt.E(0.1f, r02, r13);
        r72.j(new ColorStateList(r5, new int[]{r03, 0}));
        r72.setTint(r13);
        ColorStateList r14 = new ColorStateList(r5, new int[]{r03, r13});
        eu r04 = new eu(r6.a.a);
        r04.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(r14, r72, r04), r6});
    L12:
        r13 = r7.data;
        goto L13
    L15:
        if (r1 != 1) goto L18;
        eu r15 = this.F;
        int r2 = this.U;
        return new RippleDrawable(new ColorStateList(r5, new int[]{zt.E(0.1f, r02, r2), r2}), r15, r15);
    L18:
        return null;
    L21:
        return this.F;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H != null) goto L6;
        StateListDrawable r0 = new StateListDrawable();
        this.H = r0;
        r0.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
        this.H.addState(new int[0], f(false));
    L6:
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G != null) goto L6;
        this.G = f(true);
    L6:
        return this.G;
    }

    public static void k(ViewGroup r4, boolean r5) {
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        View r2 = r4.getChildAt(r1);
        r2.setEnabled(r5);
        if ((r2 instanceof ViewGroup) == false) goto L7;
        k((ViewGroup) r2, r5);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    private void setEditText(EditText r7) {
        if (this.d != null) goto L54;
        if (getEndIconMode() != 3) goto L7;
    L9:
        this.d = r7;
        int r0 = this.f;
        if (r0 == (-1)) goto L12;
        setMinEms(r0);
    L13:
        int r02 = this.g;
        if (r02 == (-1)) goto L16;
        setMaxEms(r02);
    L17:
        this.I = false;
        i();
        setTextInputAccessibilityDelegate(new e60(this));
        Typeface r1 = this.d.getTypeface();
        za r2 = this.u0;
        r2.m(r1);
        float r12 = this.d.getTextSize();
        if (r2.h == r12) goto L20;
        r2.h = r12;
        r2.h(false);
    L20:
        int r13 = Build.VERSION.SDK_INT;
        float r3 = this.d.getLetterSpacing();
        if (r2.W == r3) goto L23;
        r2.W = r3;
        r2.h(false);
    L23:
        int r32 = this.d.getGravity();
        int r4 = (r32 & (-113)) | 48;
        if (r2.g == r4) goto L27;
        r2.g = r4;
        r2.h(false);
    L27:
        if (r2.f == r32) goto L29;
        r2.f = r32;
        r2.h(false);
    L29:
        this.d.addTextChangedListener(new z10(this, 1));
        if (this.i0 != null) goto L33;
        this.i0 = this.d.getHintTextColors();
    L33:
        if (this.C == false) goto L39;
        if (TextUtils.isEmpty(this.D) == false) goto L37;
        CharSequence r22 = this.d.getHint();
        this.e = r22;
        setHint(r22);
        this.d.setHint(null);
    L37:
        this.E = true;
    L39:
        if (r13 < 29) goto L42;
        p();
    L42:
        if (this.o == null) goto L44;
        n(this.d.getText());
    L44:
        r();
        this.j.b();
        this.b.bringToFront();
        ej r14 = this.c;
        r14.bringToFront();
        Iterator r23 = this.e0.iterator();
    L46:
        if (r23.hasNext() == false) goto L48;
        ((cj) r23.next()).a(this);
        goto L46
    L48:
        r14.m();
        if (isEnabled() == true) goto L51;
        r7.setEnabled(false);
    L51:
        u(false, true);
        return;
    L16:
        setMaxWidth(this.i);
        goto L17
    L12:
        setMinWidth(this.h);
        goto L13
    L7:
        if ((r7 instanceof TextInputEditText) == true) goto L9;
        Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        goto L9
    L54:
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence r3) {
        if (TextUtils.equals(r3, this.D) == true) goto L16;
        this.D = r3;
        za r0 = this.u0;
        if (r3 != null) goto L7;
    L8:
        r0.A = r3;
        r0.B = null;
        Bitmap r1 = r0.E;
        if (r1 == null) goto L11;
        r1.recycle();
        r0.E = null;
    L11:
        r0.h(false);
    L13:
        if (this.t0 == true) goto L17;
        j();
        return;
    L17:
        return;
    L7:
        if (TextUtils.equals(r0.A, r3) == true) goto L13;
    }

    private void setPlaceholderTextEnabled(boolean r3) {
        if (this.s != r3) goto L5;
        return;
    L5:
        if (r3 == false) goto L9;
        g5 r0 = this.t;
        if (r0 == null) goto L13;
        this.a.addView(r0);
        this.t.setVisibility(0);
    L13:
        this.s = r3;
        return;
    L9:
        g5 r02 = this.t;
        if (r02 == null) goto L12;
        r02.setVisibility(8);
    L12:
        this.t = null;
        goto L13
    }

    public final void a(float r7) {
        za r0 = this.u0;
        if (r0.b != r7) goto L5;
        return;
    L5:
        int r2 = 2;
        if (this.x0 != null) goto L8;
        ValueAnimator r1 = new ValueAnimator();
        this.x0 = r1;
        r1.setInterpolator(ct.w(getContext(), com.ljx.wechatmod.R.attr.motionEasingEmphasizedInterpolator, q2.b));
        this.x0.setDuration(ct.v(getContext(), com.ljx.wechatmod.R.attr.motionDurationMedium4, 167));
        this.x0.addUpdateListener(new q7(r2, this));
    L8:
        this.x0.setFloatValues(new float[]{r0.b, r7});
        this.x0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if ((r2 instanceof EditText) == false) goto L6;
        FrameLayout.LayoutParams r32 = new FrameLayout.LayoutParams(r4);
        r32.gravity = (r32.gravity & (-113)) | 16;
        FrameLayout r0 = this.a;
        r0.addView(r2, r32);
        r0.setLayoutParams(r4);
        t();
        setEditText((EditText) r2);
        return;
    L6:
        super.addView(r2, r3, r4);
    }

    public final void b() {
        eu r0 = this.F;
        if (r0 != null) goto L5;
        return;
    L5:
        f30 r1 = r0.a.a;
        f30 r2 = this.L;
        if (r1 == r2) goto L9;
        r0.setShapeAppearanceModel(r2);
    L9:
        if (this.O != 2) goto L17;
        int r02 = this.Q;
        if (r02 <= (-1)) goto L17;
        int r12 = this.T;
        if (r12 == 0) goto L17;
        eu r3 = this.F;
        r3.a.j = r02;
        r3.invalidateSelf();
        ColorStateList r03 = ColorStateList.valueOf(r12);
        du r13 = r3.a;
        if (r13.d == r03) goto L17;
        r13.d = r03;
        r3.onStateChange(r3.getState());
    L17:
        int r04 = this.U;
        if (this.O != 1) goto L20;
        r04 = ib.b(this.U, zt.j(getContext(), com.ljx.wechatmod.R.attr.colorSurface, 0));
    L20:
        this.U = r04;
        this.F.j(ColorStateList.valueOf(r04));
        eu r05 = this.J;
        if (r05 != null) goto L23;
    L35:
        s();
        return;
    L23:
        if (this.K == null) goto L35;
        if (this.Q > (-1)) goto L28;
    L34:
        invalidate();
        goto L35
    L28:
        if (this.T == 0) goto L34;
        if (this.d.isFocused() == false) goto L32;
        ColorStateList r14 = ColorStateList.valueOf(this.k0);
    L33:
        r05.j(r14);
        this.K.j(ColorStateList.valueOf(this.T));
        goto L34
    L32:
        r14 = ColorStateList.valueOf(this.T);
        goto L33
    }

    public final int c() {
        if (this.C == true) goto L5;
        return 0;
    L5:
        int r0 = this.O;
        za r2 = this.u0;
        if (r0 != 0) goto L8;
        float r02 = r2.d();
    L12:
        return (int) r02;
    L8:
        if (r0 == 2) goto L10;
        return 0;
    L10:
        r02 = r2.d() / 2.0f;
        goto L12
    }

    public final pj d() {
        pj r0 = new pj();
        r0.c = ct.v(getContext(), com.ljx.wechatmod.R.attr.motionDurationShort2, 87);
        r0.d = ct.w(getContext(), com.ljx.wechatmod.R.attr.motionEasingLinearInterpolator, q2.a);
        return r0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure r6, int r7) {
        EditText r0 = this.d;
        if (r0 != null) goto L6;
        super.dispatchProvideAutofillStructure(r6, r7);
        return;
    L6:
        int r2 = 0;
        if (this.e == null) goto L15;
        boolean r1 = this.E;
        this.E = false;
        CharSequence r02 = r0.getHint();
        this.d.setHint(this.e);
        super.dispatchProvideAutofillStructure(r6, r7);     // Catch: Throwable -> L12
        this.d.setHint(r02);
        this.E = r1;
        return;
    L12:
        th = move-exception;
        this.d.setHint(r02);
        this.E = r1;
        throw th;
    L15:
        r6.setAutofillId(getAutofillId());
        onProvideAutofillStructure(r6, r7);
        onProvideAutofillVirtualStructure(r6, r7);
        FrameLayout r03 = this.a;
        r6.setChildCount(r03.getChildCount());
    L17:
        if (r2 >= r03.getChildCount()) goto L22;
        View r12 = r03.getChildAt(r2);
        ViewStructure r3 = r6.newChild(r2);
        r12.dispatchProvideAutofillStructure(r3, r7);
        if (r12 != this.d) goto L21;
        r3.setHint(getHint());
    L21:
        r2 = r2 + 1;
        goto L17
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray r2) {
        this.z0 = true;
        super.dispatchRestoreInstanceState(r2);
        this.z0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas r18) {
        Canvas r1 = r18;
        super.draw(r18);
        boolean r2 = this.C;
        za r8 = this.u0;
        if (r2 == false) goto L34;
        TextPaint r7 = r8.N;
        RectF r22 = r8.e;
        int r9 = r1.save();
        if (r8.B == null) goto L34;
        if (r22.width() <= 0.0f) goto L34;
        if (r22.height() <= 0.0f) goto L34;
        r7.setTextSize(r8.G);
        float r23 = r8.p;
        float r3 = r8.q;
        float r4 = r8.F;
        if (r4 == 1.0f) goto L14;
        r1.scale(r4, r4, r23, r3);
    L14:
        if (r8.d0 > 1) goto L16;
    L31:
        r1.translate(r23, r3);
        r8.Y.draw(r1);
    L32:
        r1.restoreToCount(r9);
        goto L34
    L16:
        if (r8.C == true) goto L31;
        float r24 = r8.p - r8.Y.getLineStart(0);
        int r12 = r7.getAlpha();
        r1.translate(r24, r3);
        float r32 = r12;
        r7.setAlpha((int) (r8.b0 * r32));
        int r13 = Build.VERSION.SDK_INT;
        if (r13 < 31) goto L21;
        float r25 = r8.H;
        float r42 = r8.I;
        float r5 = r8.J;
        int r6 = r8.K;
        r7.setShadowLayer(r25, r42, r5, ib.d(r6, (r7.getAlpha() * Color.alpha(r6)) / 255));
    L21:
        r8.Y.draw(r1);
        r7.setAlpha((int) (r8.a0 * r32));
        if (r13 < 31) goto L24;
        float r26 = r8.H;
        float r33 = r8.I;
        float r43 = r8.J;
        int r52 = r8.K;
        r7.setShadowLayer(r26, r33, r43, ib.d(r52, (Color.alpha(r52) * r7.getAlpha()) / 255));
    L24:
        int r27 = r8.Y.getLineBaseline(0);
        CharSequence r34 = r8.c0;
        float r62 = r27;
        r1.drawText(r34, 0, r34.length(), 0.0f, r62, r7);
        if (r13 < 31) goto L27;
        r7.setShadowLayer(r8.H, r8.I, r8.J, r8.K);
    L27:
        String r14 = r8.c0.toString().trim();
        if (r14.endsWith("…") == false) goto L30;
        r14 = r14.substring(0, r14.length() - 1);
    L30:
        String r28 = r14;
        r7.setAlpha(r12);
        r1 = r18;
        r1.drawText(r28, 0, Math.min(r8.Y.getLineEnd(0), r28.length()), 0.0f, r62, r7);
    L34:
        if (this.K == null) goto L41;
        eu r29 = this.J;
        if (r29 == null) goto L42;
        r29.draw(r1);
        if (this.d.isFocused() == false) goto L43;
        Rect r210 = this.K.getBounds();
        Rect r35 = this.J.getBounds();
        float r44 = r8.b;
        int r53 = r35.centerX();
        r210.left = q2.c(r44, r53, r35.left);
        r210.right = q2.c(r44, r53, r35.right);
        this.K.draw(r1);
        return;
    L43:
        return;
    L42:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.y0 == false) goto L5;
        return;
    L5:
        boolean r0 = true;
        this.y0 = true;
        super.drawableStateChanged();
        int[] r1 = getDrawableState();
        za r3 = this.u0;
        if (r3 == null) goto L16;
        r3.L = r1;
        ColorStateList r12 = r3.k;
        if (r12 != null) goto L10;
    L11:
        ColorStateList r13 = r3.j;
        if (r13 == null) goto L16;
        if (r13.isStateful() == false) goto L16;
    L15:
        r3.h(false);
        boolean r14 = true;
    L18:
        if (this.d == null) goto L26;
        WeakHashMap r32 = ja0.a;
        if (v90.c(this) == true) goto L22;
    L24:
        r0 = false;
    L25:
        u(r0, false);
        goto L26
    L22:
        if (isEnabled() == false) goto L24;
    L26:
        r();
        x();
        if (r14 == false) goto L29;
        invalidate();
    L29:
        this.y0 = false;
        return;
    L10:
        if (r12.isStateful() == true) goto L15;
    L16:
        r14 = false;
        goto L18
    }

    public final boolean e() {
        if (this.C == true) goto L5;
        return false;
    L5:
        if (TextUtils.isEmpty(this.D) == false) goto L7;
        return false;
    L7:
        if ((this.F instanceof bf) == false) goto L13;
        return true;
    L13:
        return false;
    }

    public final eu f(boolean r17) {
        float r1 = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_shape_corner_size_small_component);
        if (r17 == false) goto L5;
        float r2 = r1;
    L6:
        EditText r3 = this.d;
        if ((r3 instanceof jt) == false) goto L9;
        float r32 = ((jt) r3).getPopupElevation();
    L10:
        int r4 = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        h10 r5 = new h10();
        h10 r6 = new h10();
        h10 r7 = new h10();
        h10 r8 = new h10();
        int r10 = 0;
        vh r9 = new vh(r10);
        vh r11 = new vh(r10);
        vh r12 = new vh(r10);
        vh r13 = new vh(r10);
        e r14 = new e(r2);
        e r15 = new e(r2);
        e r22 = new e(r1);
        e r102 = new e(r1);
        f30 r16 = new f30();
        r16.a = r5;
        r16.b = r6;
        r16.c = r7;
        r16.d = r8;
        r16.e = r14;
        r16.f = r15;
        r16.g = r102;
        r16.h = r22;
        r16.i = r9;
        r16.j = r11;
        r16.k = r12;
        r16.l = r13;
        EditText r23 = this.d;
        if ((r23 instanceof jt) == false) goto L13;
        ColorStateList r24 = ((jt) r23).getDropDownBackgroundTintList();
    L14:
        Context r52 = getContext();
        if (r24 != null) goto L21;
        Paint r25 = eu.w;
        TypedValue r26 = gt.A(r52, com.ljx.wechatmod.R.attr.colorSurface, eu.class.getSimpleName());
        int r62 = r26.resourceId;
        if (r62 == 0) goto L19;
        int r27 = hd.a(r52, r62);
    L20:
        r24 = ColorStateList.valueOf(r27);
        goto L21
    L19:
        r27 = r26.data;
    L21:
        eu r63 = new eu();
        r63.h(r52);
        r63.j(r24);
        r63.i(r32);
        r63.setShapeAppearanceModel(r16);
        du r18 = r63.a;
        if (r18.g != null) goto L24;
        r18.g = new Rect();
    L24:
        r63.a.g.set(0, r4, 0, r4);
        r63.invalidateSelf();
        return r63;
    L13:
        r24 = null;
        goto L14
    L9:
        r32 = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        goto L10
    L5:
        r2 = 0.0f;
        goto L6
    }

    public final int g(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.d.getCompoundPaddingLeft();
    L7:
        return r32 + r2;
    L10:
        if (getSuffixText() == null) goto L12;
        r32 = this.c.c();
        goto L7
    L4:
        if (getPrefixText() == null) goto L8;
        r32 = this.b.a();
        goto L7
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText r0 = this.d;
        if (r0 == null) goto L7;
        int r02 = r0.getBaseline();
        int r1 = getPaddingTop() + r02;
        return c() + r1;
    L7:
        return super.getBaseline();
    }

    public eu getBoxBackground() {
        int r0 = this.O;
        if (r0 == 1) goto L10;
        if (r0 == 2) goto L10;
        throw new IllegalStateException();
    L10:
        return this.F;
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean r0 = gt.n(this);
        RectF r1 = this.a0;
        if (r0 == false) goto L7;
        return this.L.h.a(r1);
    L7:
        return this.L.g.a(r1);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean r0 = gt.n(this);
        RectF r1 = this.a0;
        if (r0 == false) goto L7;
        return this.L.g.a(r1);
    L7:
        return this.L.h.a(r1);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean r0 = gt.n(this);
        RectF r1 = this.a0;
        if (r0 == false) goto L7;
        return this.L.e.a(r1);
    L7:
        return this.L.f.a(r1);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean r0 = gt.n(this);
        RectF r1 = this.a0;
        if (r0 == false) goto L7;
        return this.L.f.a(r1);
    L7:
        return this.L.e.a(r1);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    public CharSequence getCounterOverflowDescription() {
        if (this.k == true) goto L5;
        return null;
    L5:
        if (this.m == false) goto L12;
        g5 r0 = this.o;
        if (r0 != null) goto L9;
        return null;
    L9:
        return r0.getContentDescription();
    L12:
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.z;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        zo r0 = this.j;
        if (r0.q == true) goto L5;
        return null;
    L5:
        return r0.p;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.s;
    }

    public int getErrorCurrentTextColors() {
        g5 r0 = this.j.r;
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.getCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        zo r0 = this.j;
        if (r0.x == true) goto L5;
        return null;
    L5:
        return r0.w;
    }

    public int getHelperTextCurrentTextColor() {
        g5 r0 = this.j.y;
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.getCurrentTextColor();
    }

    public CharSequence getHint() {
        if (this.C == true) goto L5;
        return null;
    L5:
        return this.D;
    }

    public final float getHintCollapsedTextHeight() {
        return this.u0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        za r0 = this.u0;
        return r0.e(r0.k);
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public f60 getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s == true) goto L5;
        return null;
    L5:
        return this.r;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public f30 getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.b0;
    }

    public final int h(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.d.getCompoundPaddingRight();
    L7:
        return r2 - r32;
    L10:
        if (getPrefixText() == null) goto L12;
        r32 = this.b.a();
        goto L7
    L4:
        if (getSuffixText() == null) goto L8;
        r32 = this.c.c();
        goto L7
    }

    public final void i() {
        int r0 = this.O;
        if (r0 == 0) goto L20;
        if (r0 == 1) goto L19;
        if (r0 != 2) goto L18;
        if (this.C == true) goto L9;
    L15:
        this.F = new eu(this.L);
    L16:
        this.J = null;
        this.K = null;
    L21:
        s();
        x();
        if (this.O != 1) goto L30;
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L27;
        this.P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_2_0_box_collapsed_padding_top);
        goto L30
    L27:
        if (ct.s(getContext()) == false) goto L30;
        this.P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_1_3_box_collapsed_padding_top);
    L30:
        if (this.d == null) goto L41;
        if (this.O != 1) goto L41;
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L38;
        EditText r02 = this.d;
        WeakHashMap r3 = ja0.a;
        t90.k(r02, t90.f(r02), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_top), t90.e(this.d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        goto L41
    L38:
        if (ct.s(getContext()) == false) goto L41;
        EditText r03 = this.d;
        WeakHashMap r32 = ja0.a;
        t90.k(r03, t90.f(r03), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_top), t90.e(this.d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
    L41:
        if (this.O == 0) goto L43;
        t();
    L43:
        EditText r04 = this.d;
        if ((r04 instanceof AutoCompleteTextView) == false) goto L57;
        AutoCompleteTextView r05 = (AutoCompleteTextView) r04;
        if (r05.getDropDownBackground() != null) goto L55;
        int r33 = this.O;
        if (r33 != 2) goto L52;
        r05.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
        return;
    L52:
        if (r33 != 1) goto L56;
        r05.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
        return;
    L56:
        return;
    L55:
        return;
    L57:
        return;
    L9:
        if ((this.F instanceof bf) == true) goto L15;
        f30 r06 = this.L;
        int r4 = bf.y;
        if (r06 != null) goto L14;
        r06 = new f30();
    L14:
        af r42 = new af(r06, new RectF());
        bf r07 = new bf(r42);
        r07.x = r42;
        this.F = r07;
        goto L16
    L18:
        throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
    L19:
        this.F = new eu(this.L);
        this.J = new eu();
        this.K = new eu();
        goto L21
    L20:
        this.F = null;
        this.J = null;
        this.K = null;
        goto L21
    }

    public final void j() {
        if (e() == false) goto L53;
        int r0 = this.d.getWidth();
        int r1 = this.d.getGravity();
        za r2 = this.u0;
        boolean r3 = r2.b(r2.A);
        r2.C = r3;
        Rect r4 = r2.d;
        if (r1 != 17) goto L8;
    L23:
        float r32 = r0 / 2.0f;
        float r10 = r2.Z / 2.0f;
    L17:
        float r33 = r32 - r10;
    L24:
        float r34 = Math.max(r33, r4.left);
        RectF r102 = this.a0;
        r102.left = r34;
        r102.top = r4.top;
        if (r1 != 17) goto L27;
    L44:
        float r02 = (r0 / 2.0f) + (r2.Z / 2.0f);
    L45:
        r102.right = Math.min(r02, r4.right);
        r102.bottom = r2.d() + r4.top;
        if (r102.width() > 0.0f) goto L48;
        return;
    L48:
        if (r102.height() <= 0.0f) goto L54;
        float r03 = r102.left;
        float r12 = this.N;
        r102.left = r03 - r12;
        r102.right += r12;
        r102.offset(-getPaddingLeft(), ((-getPaddingTop()) - (r102.height() / 2.0f)) + this.Q);
        bf r04 = (bf) this.F;
        r04.getClass();
        r04.n(r102.left, r102.top, r102.right, r102.bottom);
        return;
    L54:
        return;
    L27:
        if ((r1 & 7) == 1) goto L44;
        if ((r1 & 8388613) == 8388613) goto L41;
        if ((r1 & 5) == 5) goto L41;
        if (r2.C == false) goto L38;
        int r05 = r4.right;
    L37:
        r02 = r05;
        goto L45
    L38:
        float r06 = r2.Z;
    L39:
        r02 = r06 + r34;
    L41:
        if (r2.C == false) goto L43;
        r06 = r2.Z;
        goto L39
    L43:
        r05 = r4.right;
        goto L37
    L8:
        if ((r1 & 7) == 1) goto L23;
        if ((r1 & 8388613) != 8388613) goto L13;
    L20:
        if (r3 == false) goto L22;
        int r35 = r4.left;
    L19:
        r33 = r35;
        goto L24
    L22:
        r32 = r4.right;
        r10 = r2.Z;
        goto L17
    L13:
        if ((r1 & 5) == 5) goto L20;
        if (r3 == false) goto L18;
        r32 = r4.right;
        r10 = r2.Z;
        goto L17
    L18:
        r35 = r4.left;
        goto L19
    }

    public final void l(g5 r2, int r3) {
        r2.setTextAppearance(r3);     // Catch: Exception -> L9
        if (r2.getTextColors().getDefaultColor() == (-65281)) goto L7;
        return;
    L7:
        r2.setTextAppearance(com.ljx.wechatmod.R.style.TextAppearance_AppCompat_Caption);
        r2.setTextColor(hd.a(getContext(), com.ljx.wechatmod.R.color.design_error));
    }

    public final boolean m() {
        zo r0 = this.j;
        if (r0.o == 1) goto L5;
        return false;
    L5:
        if (r0.r != null) goto L7;
        return false;
    L7:
        if (TextUtils.isEmpty(r0.p) == true) goto L12;
        return true;
    L12:
        return false;
    }

    public final void n(Editable r10) {
        ((jb) this.n).getClass();
        if (r10 == null) goto L5;
        int r102 = r10.length();
    L6:
        boolean r1 = this.m;
        int r2 = this.l;
        String r4 = null;
        if (r2 != (-1)) goto L10;
        this.o.setText(String.valueOf(r102));
        this.o.setContentDescription(null);
        this.m = false;
    L30:
        if (this.d != null) goto L32;
        return;
    L32:
        if (r1 == this.m) goto L36;
        u(false, false);
        x();
        r();
        return;
    L36:
        return;
    L10:
        if (r102 <= r2) goto L12;
        boolean r22 = true;
    L13:
        this.m = r22;
        Context r23 = getContext();
        g5 r5 = this.o;
        int r6 = this.l;
        if (this.m == false) goto L16;
        int r7 = com.ljx.wechatmod.R.string.character_counter_overflowed_content_description;
    L17:
        r5.setContentDescription(r23.getString(r7, new Object[]{Integer.valueOf(r102), Integer.valueOf(r6)}));
        if (r1 == this.m) goto L20;
        o();
    L20:
        String r24 = m7.b;
        Locale r25 = Locale.getDefault();
        int r52 = i60.a;
        if (h60.a(r25) != 1) goto L23;
        m7 r26 = m7.e;
    L24:
        g5 r3 = this.o;
        String r103 = getContext().getString(com.ljx.wechatmod.R.string.character_counter_pattern, new Object[]{Integer.valueOf(r102), Integer.valueOf(this.l)});
        r26.getClass();
        r7 r53 = b60.a;
        if (r103 == null) goto L28;
        r4 = r26.c(r103).toString();
    L28:
        r3.setText(r4);
        goto L30
    L23:
        r26 = m7.d;
        goto L24
    L16:
        r7 = com.ljx.wechatmod.R.string.character_counter_content_description;
        goto L17
    L12:
        r22 = false;
        goto L13
    L5:
        r102 = 0;
        goto L6
    }

    public final void o() {
        g5 r0 = this.o;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.m == false) goto L7;
        int r1 = this.p;
    L8:
        l(r0, r1);
        if (this.m == true) goto L14;
        ColorStateList r02 = this.y;
        if (r02 == null) goto L14;
        this.o.setTextColor(r02);
    L14:
        if (this.m == false) goto L20;
        ColorStateList r03 = this.z;
        if (r03 == null) goto L21;
        this.o.setTextColor(r03);
        return;
    L21:
        return;
    L20:
        return;
    L7:
        r1 = this.q;
        goto L8
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r2) {
        super.onConfigurationChanged(r2);
        this.u0.g(r2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ej r0 = this.c;
        r0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean r1 = false;
        this.A0 = false;
        if (this.d == null) goto L8;
        int r02 = Math.max(r0.getMeasuredHeight(), this.b.getMeasuredHeight());
        if (this.d.getMeasuredHeight() >= r02) goto L8;
        this.d.setMinimumHeight(r02);
        r1 = true;
    L8:
        boolean r03 = q();
        if (r1 == true) goto L13;
        if (r03 == true) goto L13;
        return;
    L13:
        this.d.post(new p1(13, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        super.onLayout(r8, r9, r10, r11, r12);
        EditText r92 = this.d;
        if (r92 == null) goto L81;
        ThreadLocal r102 = kg.a;
        int r103 = r92.getWidth();
        int r112 = r92.getHeight();
        Rect r122 = this.V;
        r122.set(0, 0, r103, r112);
        ThreadLocal r104 = kg.a;
        Matrix r113 = (Matrix) r104.get();
        if (r113 != null) goto L7;
        r113 = new Matrix();
        r104.set(r113);
    L8:
        kg.a(this, r92, r113);
        ThreadLocal r93 = kg.b;
        RectF r105 = (RectF) r93.get();
        if (r105 != null) goto L11;
        r105 = new RectF();
        r93.set(r105);
    L11:
        r105.set(r122);
        r113.mapRect(r105);
        r122.set((int) (r105.left + 0.5f), (int) (r105.top + 0.5f), (int) (r105.right + 0.5f), (int) (r105.bottom + 0.5f));
        eu r94 = this.J;
        if (r94 == null) goto L14;
        int r106 = r122.bottom;
        r94.setBounds(r122.left, r106 - this.R, r122.right, r106);
    L14:
        eu r95 = this.K;
        if (r95 == null) goto L18;
        int r107 = r122.bottom;
        r95.setBounds(r122.left, r107 - this.S, r122.right, r107);
    L18:
        if (this.C == false) goto L82;
        float r96 = this.d.getTextSize();
        za r108 = this.u0;
        if (r108.h == r96) goto L22;
        r108.h = r96;
        r108.h(false);
    L22:
        int r97 = this.d.getGravity();
        int r114 = (r97 & (-113)) | 48;
        if (r108.g == r114) goto L26;
        r108.g = r114;
        r108.h(false);
    L26:
        if (r108.f == r97) goto L29;
        r108.f = r97;
        r108.h(false);
    L29:
        if (this.d == null) goto L80;
        boolean r98 = gt.n(this);
        int r115 = r122.bottom;
        Rect r1 = this.W;
        r1.bottom = r115;
        int r116 = this.O;
        if (r116 != 1) goto L33;
        r1.left = g(r122.left, r98);
        r1.top = r122.top + this.P;
        r1.right = h(r122.right, r98);
    L37:
        int r99 = r1.left;
        int r117 = r1.top;
        int r3 = r1.right;
        int r4 = r1.bottom;
        Rect r5 = r108.d;
        if (r5.left == r99) goto L40;
    L46:
        r5.set(r99, r117, r3, r4);
        r108.M = true;
    L48:
        if (this.d == null) goto L78;
        TextPaint r910 = r108.O;
        r910.setTextSize(r108.h);
        r910.setTypeface(r108.u);
        r910.setLetterSpacing(r108.W);
        float r911 = -r910.ascent();
        r1.left = this.d.getCompoundPaddingLeft() + r122.left;
        if (this.O == 1) goto L52;
    L54:
        int r118 = r122.top + this.d.getCompoundPaddingTop();
    L55:
        r1.top = r118;
        r1.right = r122.right - this.d.getCompoundPaddingRight();
        if (this.O == 1) goto L58;
    L60:
        int r912 = r122.bottom - this.d.getCompoundPaddingBottom();
    L61:
        r1.bottom = r912;
        int r119 = r1.left;
        int r123 = r1.top;
        int r13 = r1.right;
        Rect r32 = r108.c;
        if (r32.left == r119) goto L64;
    L70:
        r32.set(r119, r123, r13, r912);
        r108.M = true;
    L71:
        r108.h(false);
        if (e() == true) goto L74;
        return;
    L74:
        if (this.t0 == true) goto L84;
        j();
        return;
    L84:
        return;
    L64:
        if (r32.top != r123) goto L70;
        if (r32.right != r13) goto L70;
        if (r32.bottom != r912) goto L70;
    L58:
        if (this.d.getMinLines() > 1) goto L60;
        r912 = (int) (r1.top + r911);
        goto L61
    L52:
        if (this.d.getMinLines() > 1) goto L54;
        r118 = (int) (r122.centerY() - (r911 / 2.0f));
        goto L55
    L78:
        throw new IllegalStateException();
    L40:
        if (r5.top != r117) goto L46;
        if (r5.right != r3) goto L46;
        if (r5.bottom != r4) goto L46;
    L33:
        if (r116 == 2) goto L35;
        r1.left = g(r122.left, r98);
        r1.top = getPaddingTop();
        r1.right = h(r122.right, r98);
        goto L37
    L35:
        r1.left = this.d.getPaddingLeft() + r122.left;
        r1.top = r122.top - c();
        r1.right = r122.right - this.d.getPaddingRight();
        goto L37
    L80:
        throw new IllegalStateException();
    L82:
        return;
    L7:
        r113.reset();
        goto L8
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        boolean r52 = this.A0;
        ej r62 = this.c;
        if (r52 == true) goto L6;
        r62.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.A0 = true;
    L6:
        if (this.t == null) goto L10;
        EditText r53 = this.d;
        if (r53 == null) goto L10;
        int r54 = r53.getGravity();
        this.t.setGravity(r54);
        this.t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
    L10:
        r62.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof g60) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        g60 r22 = (g60) r2;
        super.onRestoreInstanceState(r22.a);
        setError(r22.c);
        if (r22.d == false) goto L9;
        post(new y6(10, this));
    L9:
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
        super.onRtlPropertiesChanged(r14);
        boolean r0 = true;
        if (r14 == 1) goto L7;
        r0 = false;
    L7:
        if (r0 == this.M) goto L10;
        de r142 = this.L.e;
        RectF r1 = this.a0;
        float r143 = r142.a(r1);
        float r2 = this.L.f.a(r1);
        float r3 = this.L.h.a(r1);
        float r12 = this.L.g.a(r1);
        f30 r4 = this.L;
        ip r5 = r4.a;
        ip r6 = r4.b;
        ip r7 = r4.d;
        ip r42 = r4.c;
        vh r8 = new vh(0);
        vh r9 = new vh(0);
        vh r10 = new vh(0);
        vh r11 = new vh(0);
        e r122 = new e(r2);
        e r22 = new e(r143);
        e r144 = new e(r12);
        e r13 = new e(r3);
        f30 r32 = new f30();
        r32.a = r6;
        r32.b = r5;
        r32.c = r7;
        r32.d = r42;
        r32.e = r122;
        r32.f = r22;
        r32.g = r13;
        r32.h = r144;
        r32.i = r8;
        r32.j = r9;
        r32.k = r10;
        r32.l = r11;
        this.M = r0;
        setShapeAppearanceModel(r32);
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g60 r1 = new g60(super.onSaveInstanceState());
        if (m() == false) goto L5;
        r1.c = getError();
    L5:
        ej r0 = this.c;
        if (r0.i != 0) goto L8;
    L10:
        boolean r02 = false;
    L11:
        r1.d = r02;
        return r1;
    L8:
        if (r0.g.d == false) goto L10;
        r02 = true;
        goto L11
    }

    public final void p() {
        ColorStateList r0 = this.A;
        if (r0 != null) goto L14;
        Context r02 = getContext();
        TypedValue r1 = gt.y(r02, com.ljx.wechatmod.R.attr.colorControlActivated);
        if (r1 != null) goto L8;
    L7:
        r0 = null;
        goto L14
    L8:
        int r3 = r1.resourceId;
        if (r3 == 0) goto L11;
        r0 = ip.v(r02, r3);
        goto L14
    L11:
        int r03 = r1.data;
        if (r03 == 0) goto L7;
        r0 = ColorStateList.valueOf(r03);
    L14:
        EditText r12 = this.d;
        if (r12 != null) goto L17;
        return;
    L17:
        if (f0.e(r12) == null) goto L31;
        Drawable r13 = f0.e(this.d).mutate();
        if (m() == false) goto L22;
    L25:
        ColorStateList r2 = this.B;
        if (r2 == null) goto L28;
        r0 = r2;
    L28:
        ch.h(r13, r0);
        return;
    L22:
        if (this.o == null) goto L28;
        if (this.m == false) goto L28;
    }

    public final boolean q() {
        if (this.d != null) goto L5;
        return false;
    L5:
        CheckableImageButton r2 = null;
        boolean r5 = true;
        if (getStartIconDrawable() == null) goto L8;
    L11:
        r40 r0 = this.b;
        if (r0.getMeasuredWidth() <= 0) goto L22;
        int r02 = r0.getMeasuredWidth() - this.d.getPaddingLeft();
        if (this.c0 != null) goto L16;
    L17:
        ColorDrawable r6 = new ColorDrawable();
        this.c0 = r6;
        this.d0 = r02;
        r6.setBounds(0, 0, r02, 1);
    L18:
        Drawable[] r03 = k60.a(this.d);
        Drawable r62 = r03[0];
        ColorDrawable r7 = this.c0;
        if (r62 == r7) goto L25;
        k60.e(this.d, r7, r03[1], r03[2], r03[3]);
    L24:
        boolean r04 = true;
    L26:
        ej r63 = this.c;
        if (r63.e() == true) goto L35;
        if (r63.i == 0) goto L33;
        if (r63.d() == true) goto L35;
    L33:
        if (r63.p != null) goto L35;
    L59:
        if (this.f0 == null) goto L66;
        Drawable[] r64 = k60.a(this.d);
        if (r64[2] != this.f0) goto L63;
        k60.e(this.d, r64[0], r64[1], this.h0, r64[3]);
    L64:
        this.f0 = null;
        return r5;
    L63:
        r5 = r04;
    L66:
        return r04;
    L35:
        if (r63.getMeasuredWidth() <= 0) goto L59;
        int r72 = r63.q.getMeasuredWidth() - this.d.getPaddingRight();
        if (r63.e() == false) goto L40;
        r2 = r63.c;
    L44:
        if (r2 == null) goto L46;
        r72 = et.c((ViewGroup.MarginLayoutParams) r2.getLayoutParams()) + (r2.getMeasuredWidth() + r72);
    L46:
        Drawable[] r22 = k60.a(this.d);
        ColorDrawable r65 = this.f0;
        if (r65 != null) goto L49;
    L52:
        if (r65 != null) goto L54;
        ColorDrawable r66 = new ColorDrawable();
        this.f0 = r66;
        this.g0 = r72;
        r66.setBounds(0, 0, r72, 1);
    L54:
        Drawable r3 = r22[2];
        ColorDrawable r67 = this.f0;
        if (r3 == r67) goto L66;
        this.h0 = r3;
        k60.e(this.d, r22[0], r22[1], r67, r22[3]);
        return true;
    L49:
        if (this.g0 == r72) goto L52;
        this.g0 = r72;
        r65.setBounds(0, 0, r72, 1);
        k60.e(this.d, r22[0], r22[1], this.f0, r22[3]);
        return true;
    L40:
        if (r63.i == 0) goto L44;
        if (r63.d() == false) goto L44;
        r2 = r63.g;
    L25:
        r04 = false;
        goto L26
    L16:
        if (this.d0 == r02) goto L18;
    L22:
        if (this.c0 == null) goto L25;
        Drawable[] r05 = k60.a(this.d);
        k60.e(this.d, null, r05[1], r05[2], r05[3]);
        this.c0 = null;
        goto L24
    L8:
        if (getPrefixText() == null) goto L22;
        if (getPrefixTextView().getVisibility() != 0) goto L22;
        goto L11
    }

    public final void r() {
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.O != 0) goto L23;
        Drawable r02 = r0.getBackground();
        if (r02 == null) goto L24;
        int[] r1 = eh.a;
        Drawable r03 = r02.mutate();
        if (m() == false) goto L15;
        r03.setColorFilter(u3.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        return;
    L15:
        if (this.m == false) goto L20;
        g5 r12 = this.o;
        if (r12 == null) goto L20;
        r03.setColorFilter(u3.c(r12.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        return;
    L20:
        r03.clearColorFilter();
        this.d.refreshDrawableState();
        return;
    L24:
        return;
    }

    public final void s() {
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.F != null) goto L7;
        return;
    L7:
        if (this.I == true) goto L11;
        if (r0.getBackground() == null) goto L11;
        return;
    L11:
        if (this.O == 0) goto L18;
        Drawable r02 = getEditTextBoxBackground();
        EditText r1 = this.d;
        WeakHashMap r2 = ja0.a;
        s90.q(r1, r02);
        this.I = true;
        return;
    }

    public void setBoxBackgroundColor(int r2) {
        if (this.U == r2) goto L6;
        this.U = r2;
        this.o0 = r2;
        this.q0 = r2;
        this.r0 = r2;
        b();
        return;
    }

    public void setBoxBackgroundColorResource(int r2) {
        setBoxBackgroundColor(hd.a(getContext(), r2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList r4) {
        int r0 = r4.getDefaultColor();
        this.o0 = r0;
        this.U = r0;
        this.p0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.q0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int r2) {
        if (r2 == this.O) goto L10;
        this.O = r2;
        if (this.d == null) goto L9;
        i();
        return;
    L9:
        return;
    }

    public void setBoxCollapsedPaddingTop(int r1) {
        this.P = r1;
    }

    public void setBoxCornerFamily(int r4) {
        e30 r0 = this.L.e();
        de r1 = this.L.e;
        r0.a = gt.h(r4);
        r0.e = r1;
        de r12 = this.L.f;
        r0.b = gt.h(r4);
        r0.f = r12;
        de r13 = this.L.h;
        r0.d = gt.h(r4);
        r0.h = r13;
        de r14 = this.L.g;
        r0.c = gt.h(r4);
        r0.g = r14;
        this.L = r0.a();
        b();
    }

    public void setBoxStrokeColor(int r2) {
        if (this.m0 == r2) goto L6;
        this.m0 = r2;
        x();
        return;
    }

    public void setBoxStrokeColorStateList(ColorStateList r4) {
        if (r4.isStateful() == false) goto L6;
        this.k0 = r4.getDefaultColor();
        this.s0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.l0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        this.m0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
    L8:
        x();
        return;
    L6:
        if (this.m0 == r4.getDefaultColor()) goto L8;
        this.m0 = r4.getDefaultColor();
        goto L8
    }

    public void setBoxStrokeErrorColor(ColorStateList r2) {
        if (this.n0 == r2) goto L6;
        this.n0 = r2;
        x();
        return;
    }

    public void setBoxStrokeWidth(int r1) {
        this.R = r1;
        x();
    }

    public void setBoxStrokeWidthFocused(int r1) {
        this.S = r1;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(r2));
    }

    public void setBoxStrokeWidthResource(int r2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(r2));
    }

    public void setCounterEnabled(boolean r6) {
        if (this.k == r6) goto L19;
        zo r1 = this.j;
        Editable r2 = null;
        if (r6 == false) goto L16;
        g5 r3 = new g5(getContext(), null);
        this.o = r3;
        r3.setId(com.ljx.wechatmod.R.id.textinput_counter);
        Typeface r32 = this.b0;
        if (r32 == null) goto L9;
        this.o.setTypeface(r32);
    L9:
        this.o.setMaxLines(1);
        r1.a(this.o, 2);
        et.h((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_counter_margin_start));
        o();
        if (this.o == null) goto L17;
        EditText r0 = this.d;
        if (r0 == null) goto L15;
        r2 = r0.getText();
    L15:
        n(r2);
    L17:
        this.k = r6;
        return;
    L16:
        r1.g(this.o, 2);
        this.o = null;
        goto L17
    }

    public void setCounterMaxLength(int r2) {
        if (this.l == r2) goto L17;
        if (r2 <= 0) goto L6;
        this.l = r2;
    L8:
        if (this.k == true) goto L10;
        return;
    L10:
        if (this.o == null) goto L19;
        EditText r22 = this.d;
        if (r22 != null) goto L14;
        Editable r23 = null;
    L15:
        n(r23);
        return;
    L14:
        r23 = r22.getText();
        goto L15
    L19:
        return;
    L6:
        this.l = -1;
        goto L8
    }

    public void setCounterOverflowTextAppearance(int r2) {
        if (this.p == r2) goto L6;
        this.p = r2;
        o();
        return;
    }

    public void setCounterOverflowTextColor(ColorStateList r2) {
        if (this.z == r2) goto L6;
        this.z = r2;
        o();
        return;
    }

    public void setCounterTextAppearance(int r2) {
        if (this.q == r2) goto L6;
        this.q = r2;
        o();
        return;
    }

    public void setCounterTextColor(ColorStateList r2) {
        if (this.y == r2) goto L6;
        this.y = r2;
        o();
        return;
    }

    public void setCursorColor(ColorStateList r2) {
        if (this.A == r2) goto L6;
        this.A = r2;
        p();
        return;
    }

    public void setCursorErrorColor(ColorStateList r2) {
        if (this.B == r2) goto L15;
        this.B = r2;
        if (m() == false) goto L7;
    L12:
        p();
        return;
    L7:
        if (this.o != null) goto L9;
        return;
    L9:
        if (this.m == true) goto L12;
        return;
    }

    public void setDefaultHintTextColor(ColorStateList r1) {
        this.i0 = r1;
        this.j0 = r1;
        if (this.d == null) goto L6;
        u(false, false);
        return;
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
        k(this, r1);
        super.setEnabled(r1);
    }

    public void setEndIconActivated(boolean r2) {
        this.c.g.setActivated(r2);
    }

    public void setEndIconCheckable(boolean r2) {
        this.c.g.setCheckable(r2);
    }

    public void setEndIconContentDescription(int r3) {
        ej r0 = this.c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r0.getResources().getText(r3);
    L6:
        CheckableImageButton r02 = r0.g;
        if (r02.getContentDescription() == r32) goto L10;
        r02.setContentDescription(r32);
        return;
    L10:
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setEndIconDrawable(int r5) {
        ej r0 = this.c;
        if (r5 == 0) goto L5;
        Drawable r52 = ff.r(r0.getContext(), r5);
    L6:
        TextInputLayout r1 = r0.a;
        CheckableImageButton r2 = r0.g;
        r2.setImageDrawable(r52);
        if (r52 == null) goto L10;
        ff.a(r1, r2, r0.k, r0.l);
        ff.K(r1, r2, r0.k);
        return;
    L10:
        return;
    L5:
        r52 = null;
        goto L6
    }

    public void setEndIconMinSize(int r3) {
        ej r0 = this.c;
        if (r3 >= 0) goto L5;
        r0.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L5:
        if (r3 == r0.m) goto L10;
        r0.m = r3;
        CheckableImageButton r1 = r0.g;
        r1.setMinimumWidth(r3);
        r1.setMinimumHeight(r3);
        CheckableImageButton r02 = r0.c;
        r02.setMinimumWidth(r3);
        r02.setMinimumHeight(r3);
        return;
    }

    public void setEndIconMode(int r2) {
        this.c.g(r2);
    }

    public void setEndIconOnClickListener(View.OnClickListener r3) {
        ej r0 = this.c;
        CheckableImageButton r1 = r0.g;
        View.OnLongClickListener r02 = r0.o;
        r1.setOnClickListener(r3);
        ff.M(r1, r02);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener r2) {
        ej r0 = this.c;
        r0.o = r2;
        CheckableImageButton r02 = r0.g;
        r02.setOnLongClickListener(r2);
        ff.M(r02, r2);
    }

    public void setEndIconScaleType(ImageView.ScaleType r3) {
        ej r0 = this.c;
        r0.n = r3;
        r0.g.setScaleType(r3);
        r0.c.setScaleType(r3);
    }

    public void setEndIconTintList(ColorStateList r4) {
        ej r0 = this.c;
        if (r0.k == r4) goto L6;
        r0.k = r4;
        ff.a(r0.a, r0.g, r4, r0.l);
        return;
    }

    public void setEndIconTintMode(PorterDuff.Mode r4) {
        ej r0 = this.c;
        if (r0.l == r4) goto L6;
        r0.l = r4;
        ff.a(r0.a, r0.g, r0.k, r4);
        return;
    }

    public void setEndIconVisible(boolean r2) {
        this.c.h(r2);
    }

    public void setError(CharSequence r5) {
        zo r0 = this.j;
        if (r0.q == true) goto L9;
        if (TextUtils.isEmpty(r5) == false) goto L7;
        return;
    L7:
        setErrorEnabled(true);
    L9:
        if (TextUtils.isEmpty(r5) == true) goto L15;
        r0.c();
        r0.p = r5;
        r0.r.setText(r5);
        int r1 = r0.n;
        if (r1 == 1) goto L13;
        r0.o = 1;
    L13:
        r0.i(r1, r0.o, r0.h(r0.r, r5));
        return;
    L15:
        r0.f();
    }

    public void setErrorAccessibilityLiveRegion(int r3) {
        zo r0 = this.j;
        r0.t = r3;
        g5 r02 = r0.r;
        if (r02 == null) goto L6;
        WeakHashMap r1 = ja0.a;
        v90.f(r02, r3);
        return;
    }

    public void setErrorContentDescription(CharSequence r2) {
        zo r0 = this.j;
        r0.s = r2;
        g5 r02 = r0.r;
        if (r02 == null) goto L6;
        r02.setContentDescription(r2);
        return;
    }

    public void setErrorEnabled(boolean r6) {
        zo r0 = this.j;
        TextInputLayout r1 = r0.h;
        if (r0.q != r6) goto L5;
        return;
    L5:
        r0.c();
        if (r6 == false) goto L24;
        g5 r12 = new g5(r0.g, null);
        r0.r = r12;
        r12.setId(com.ljx.wechatmod.R.id.textinput_error);
        r0.r.setTextAlignment(5);
        Typeface r13 = r0.B;
        if (r13 == null) goto L10;
        r0.r.setTypeface(r13);
    L10:
        int r14 = r0.u;
        r0.u = r14;
        g5 r3 = r0.r;
        if (r3 == null) goto L13;
        r0.h.l(r3, r14);
    L13:
        ColorStateList r15 = r0.v;
        r0.v = r15;
        g5 r32 = r0.r;
        if (r32 == null) goto L17;
        if (r15 == null) goto L17;
        r32.setTextColor(r15);
    L17:
        CharSequence r16 = r0.s;
        r0.s = r16;
        g5 r33 = r0.r;
        if (r33 == null) goto L20;
        r33.setContentDescription(r16);
    L20:
        int r17 = r0.t;
        r0.t = r17;
        g5 r34 = r0.r;
        if (r34 == null) goto L23;
        WeakHashMap r4 = ja0.a;
        v90.f(r34, r17);
    L23:
        r0.r.setVisibility(4);
        r0.a(r0.r, 0);
    L25:
        r0.q = r6;
        return;
    L24:
        r0.f();
        r0.g(r0.r, 0);
        r0.r = null;
        r1.r();
        r1.x();
        goto L25
    }

    public void setErrorIconDrawable(int r3) {
        ej r0 = this.c;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0.getContext(), r3);
    L6:
        r0.i(r32);
        ff.K(r0.a, r0.c, r0.d);
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setErrorIconOnClickListener(View.OnClickListener r3) {
        ej r0 = this.c;
        CheckableImageButton r1 = r0.c;
        View.OnLongClickListener r02 = r0.f;
        r1.setOnClickListener(r3);
        ff.M(r1, r02);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener r2) {
        ej r0 = this.c;
        r0.f = r2;
        CheckableImageButton r02 = r0.c;
        r02.setOnLongClickListener(r2);
        ff.M(r02, r2);
    }

    public void setErrorIconTintList(ColorStateList r4) {
        ej r0 = this.c;
        if (r0.d == r4) goto L6;
        r0.d = r4;
        ff.a(r0.a, r0.c, r4, r0.e);
        return;
    }

    public void setErrorIconTintMode(PorterDuff.Mode r4) {
        ej r0 = this.c;
        if (r0.e == r4) goto L6;
        r0.e = r4;
        ff.a(r0.a, r0.c, r0.d, r4);
        return;
    }

    public void setErrorTextAppearance(int r3) {
        zo r0 = this.j;
        r0.u = r3;
        g5 r1 = r0.r;
        if (r1 == null) goto L6;
        r0.h.l(r1, r3);
        return;
    }

    public void setErrorTextColor(ColorStateList r2) {
        zo r0 = this.j;
        r0.v = r2;
        g5 r02 = r0.r;
        if (r02 == null) goto L7;
        if (r2 == null) goto L8;
        r02.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setExpandedHintEnabled(boolean r2) {
        if (this.v0 == r2) goto L6;
        this.v0 = r2;
        u(false, false);
        return;
    }

    public void setHelperText(CharSequence r5) {
        boolean r0 = TextUtils.isEmpty(r5);
        zo r1 = this.j;
        if (r0 == false) goto L9;
        if (r1.x == false) goto L16;
        setHelperTextEnabled(false);
        return;
    L16:
        return;
    L9:
        if (r1.x == true) goto L11;
        setHelperTextEnabled(true);
    L11:
        r1.c();
        r1.w = r5;
        r1.y.setText(r5);
        int r02 = r1.n;
        if (r02 == 2) goto L14;
        r1.o = 2;
    L14:
        r1.i(r02, r1.o, r1.h(r1.y, r5));
    }

    public void setHelperTextColor(ColorStateList r2) {
        zo r0 = this.j;
        r0.A = r2;
        g5 r02 = r0.y;
        if (r02 == null) goto L7;
        if (r2 == null) goto L8;
        r02.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setHelperTextEnabled(boolean r9) {
        zo r0 = this.j;
        TextInputLayout r1 = r0.h;
        if (r0.x != r9) goto L5;
        return;
    L5:
        r0.c();
        if (r9 == false) goto L18;
        g5 r12 = new g5(r0.g, null);
        r0.y = r12;
        r12.setId(com.ljx.wechatmod.R.id.textinput_helper_text);
        r0.y.setTextAlignment(5);
        Typeface r13 = r0.B;
        if (r13 == null) goto L10;
        r0.y.setTypeface(r13);
    L10:
        r0.y.setVisibility(4);
        v90.f(r0.y, 1);
        int r14 = r0.z;
        r0.z = r14;
        g5 r2 = r0.y;
        if (r2 == null) goto L13;
        r2.setTextAppearance(r14);
    L13:
        ColorStateList r15 = r0.A;
        r0.A = r15;
        g5 r22 = r0.y;
        if (r22 == null) goto L17;
        if (r15 == null) goto L17;
        r22.setTextColor(r15);
    L17:
        r0.a(r0.y, 1);
        r0.y.setAccessibilityDelegate(new yo(r0));
    L22:
        r0.x = r9;
        return;
    L18:
        r0.c();
        int r4 = r0.n;
        if (r4 != 2) goto L21;
        r0.o = 0;
    L21:
        r0.i(r4, r0.o, r0.h(r0.y, ""));
        r0.g(r0.y, 1);
        r0.y = null;
        r1.r();
        r1.x();
        goto L22
    }

    public void setHelperTextTextAppearance(int r2) {
        zo r0 = this.j;
        r0.z = r2;
        g5 r02 = r0.y;
        if (r02 == null) goto L6;
        r02.setTextAppearance(r2);
        return;
    }

    public void setHint(CharSequence r2) {
        if (this.C == false) goto L6;
        setHintInternal(r2);
        sendAccessibilityEvent(2048);
        return;
    }

    public void setHintAnimationEnabled(boolean r1) {
        this.w0 = r1;
    }

    public void setHintEnabled(boolean r3) {
        if (r3 == this.C) goto L23;
        this.C = r3;
        if (r3 == true) goto L12;
        this.E = false;
        if (TextUtils.isEmpty(this.D) == false) goto L9;
    L11:
        setHintInternal(null);
    L20:
        if (this.d == null) goto L24;
        t();
        return;
    L24:
        return;
    L9:
        if (TextUtils.isEmpty(this.d.getHint()) == false) goto L11;
        this.d.setHint(this.D);
        goto L11
    L12:
        CharSequence r32 = this.d.getHint();
        if (TextUtils.isEmpty(r32) == false) goto L15;
    L18:
        this.E = true;
        goto L20
    L15:
        if (TextUtils.isEmpty(this.D) == false) goto L17;
        setHint(r32);
    L17:
        this.d.setHint(null);
        goto L18
    }

    public void setHintTextAppearance(int r6) {
        za r1 = this.u0;
        TextInputLayout r2 = r1.a;
        a60 r0 = new a60(r2.getContext(), r6);
        ColorStateList r62 = r0.j;
        if (r62 == null) goto L5;
        r1.k = r62;
    L5:
        float r63 = r0.k;
        if (r63 == 0.0f) goto L8;
        r1.i = r63;
    L8:
        ColorStateList r64 = r0.a;
        if (r64 == null) goto L11;
        r1.U = r64;
    L11:
        r1.S = r0.e;
        r1.T = r0.f;
        r1.R = r0.g;
        r1.V = r0.i;
        g8 r65 = r1.y;
        if (r65 == null) goto L14;
        r65.c = true;
    L14:
        l0 r3 = new l0(6, r1);
        r0.a();
        r1.y = new g8(r3, r0.n);
        r0.c(r2.getContext(), r1.y);
        r1.h(false);
        this.j0 = r1.k;
        if (this.d == null) goto L18;
        u(false, false);
        t();
        return;
    }

    public void setHintTextColor(ColorStateList r4) {
        if (this.j0 != r4) goto L5;
        return;
    L5:
        if (this.i0 != null) goto L9;
        za r0 = this.u0;
        if (r0.k == r4) goto L9;
        r0.k = r4;
        r0.h(false);
    L9:
        this.j0 = r4;
        if (this.d == null) goto L14;
        u(false, false);
        return;
    }

    public void setLengthCounter(f60 r1) {
        this.n = r1;
    }

    public void setMaxEms(int r3) {
        this.g = r3;
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMaxEms(r3);
        return;
    }

    public void setMaxWidth(int r3) {
        this.i = r3;
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMaxWidth(r3);
        return;
    }

    public void setMaxWidthResource(int r2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    public void setMinEms(int r3) {
        this.f = r3;
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMinEms(r3);
        return;
    }

    public void setMinWidth(int r3) {
        this.h = r3;
        EditText r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMinWidth(r3);
        return;
    }

    public void setMinWidthResource(int r2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r3) {
        ej r0 = this.c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r0.getResources().getText(r3);
    L6:
        r0.g.setContentDescription(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
        ej r0 = this.c;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0.getContext(), r3);
    L6:
        r0.g.setImageDrawable(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r4) {
        ej r0 = this.c;
        if (r4 == true) goto L5;
    L8:
        if (r4 == true) goto L11;
        r0.g(0);
        return;
    L11:
        r0.getClass();
        return;
    L5:
        if (r0.i == 1) goto L8;
        r0.g(1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList r4) {
        ej r0 = this.c;
        r0.k = r4;
        ff.a(r0.a, r0.g, r4, r0.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode r4) {
        ej r0 = this.c;
        r0.l = r4;
        ff.a(r0.a, r0.g, r0.k, r4);
    }

    public void setPlaceholderText(CharSequence r5) {
        Editable r1 = null;
        if (this.t != null) goto L6;
        g5 r0 = new g5(getContext(), null);
        this.t = r0;
        r0.setId(com.ljx.wechatmod.R.id.textinput_placeholder);
        s90.s(this.t, 2);
        pj r02 = d();
        this.w = r02;
        r02.b = 67;
        this.x = d();
        setPlaceholderTextAppearance(this.v);
        setPlaceholderTextColor(this.u);
    L6:
        if (TextUtils.isEmpty(r5) == false) goto L9;
        setPlaceholderTextEnabled(false);
    L12:
        EditText r52 = this.d;
        if (r52 == null) goto L16;
        r1 = r52.getText();
    L16:
        v(r1);
        return;
    L9:
        if (this.s == true) goto L11;
        setPlaceholderTextEnabled(true);
    L11:
        this.r = r5;
        goto L12
    }

    public void setPlaceholderTextAppearance(int r2) {
        this.v = r2;
        g5 r0 = this.t;
        if (r0 == null) goto L6;
        r0.setTextAppearance(r2);
        return;
    }

    public void setPlaceholderTextColor(ColorStateList r2) {
        if (this.u == r2) goto L9;
        this.u = r2;
        g5 r0 = this.t;
        if (r0 == null) goto L10;
        if (r2 == null) goto L11;
        r0.setTextColor(r2);
        return;
    L11:
        return;
    L10:
        return;
    }

    public void setPrefixText(CharSequence r3) {
        r40 r0 = this.b;
        r0.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r0.c = r1;
        r0.b.setText(r3);
        r0.e();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setPrefixTextAppearance(int r2) {
        this.b.b.setTextAppearance(r2);
    }

    public void setPrefixTextColor(ColorStateList r2) {
        this.b.b.setTextColor(r2);
    }

    public void setShapeAppearanceModel(f30 r2) {
        eu r0 = this.F;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.a.a == r2) goto L9;
        this.L = r2;
        b();
        return;
    }

    public void setStartIconCheckable(boolean r2) {
        this.b.d.setCheckable(r2);
    }

    public void setStartIconContentDescription(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r22 = getResources().getText(r2);
    L5:
        setStartIconContentDescription(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setStartIconDrawable(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = ff.r(getContext(), r2);
    L5:
        setStartIconDrawable(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setStartIconMinSize(int r3) {
        r40 r0 = this.b;
        if (r3 >= 0) goto L5;
        r0.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    L5:
        if (r3 == r0.g) goto L10;
        r0.g = r3;
        CheckableImageButton r02 = r0.d;
        r02.setMinimumWidth(r3);
        r02.setMinimumHeight(r3);
        return;
    }

    public void setStartIconOnClickListener(View.OnClickListener r3) {
        r40 r0 = this.b;
        CheckableImageButton r1 = r0.d;
        View.OnLongClickListener r02 = r0.i;
        r1.setOnClickListener(r3);
        ff.M(r1, r02);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener r2) {
        r40 r0 = this.b;
        r0.i = r2;
        CheckableImageButton r02 = r0.d;
        r02.setOnLongClickListener(r2);
        ff.M(r02, r2);
    }

    public void setStartIconScaleType(ImageView.ScaleType r2) {
        r40 r0 = this.b;
        r0.h = r2;
        r0.d.setScaleType(r2);
    }

    public void setStartIconTintList(ColorStateList r4) {
        r40 r0 = this.b;
        if (r0.e == r4) goto L6;
        r0.e = r4;
        ff.a(r0.a, r0.d, r4, r0.f);
        return;
    }

    public void setStartIconTintMode(PorterDuff.Mode r4) {
        r40 r0 = this.b;
        if (r0.f == r4) goto L6;
        r0.f = r4;
        ff.a(r0.a, r0.d, r0.e, r4);
        return;
    }

    public void setStartIconVisible(boolean r2) {
        this.b.c(r2);
    }

    public void setSuffixText(CharSequence r3) {
        ej r0 = this.c;
        r0.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r0.p = r1;
        r0.q.setText(r3);
        r0.n();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setSuffixTextAppearance(int r2) {
        this.c.q.setTextAppearance(r2);
    }

    public void setSuffixTextColor(ColorStateList r2) {
        this.c.q.setTextColor(r2);
    }

    public void setTextInputAccessibilityDelegate(e60 r2) {
        EditText r0 = this.d;
        if (r0 == null) goto L6;
        ja0.l(r0, r2);
        return;
    }

    public void setTypeface(Typeface r3) {
        if (r3 == this.b0) goto L16;
        this.b0 = r3;
        this.u0.m(r3);
        zo r0 = this.j;
        if (r3 == r0.B) goto L12;
        r0.B = r3;
        g5 r1 = r0.r;
        if (r1 == null) goto L9;
        r1.setTypeface(r3);
    L9:
        g5 r02 = r0.y;
        if (r02 == null) goto L12;
        r02.setTypeface(r3);
    L12:
        g5 r03 = this.o;
        if (r03 == null) goto L17;
        r03.setTypeface(r3);
        return;
    L17:
        return;
    }

    public final void t() {
        if (this.O == 1) goto L8;
        FrameLayout r0 = this.a;
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) r0.getLayoutParams();
        int r2 = c();
        if (r2 == r1.topMargin) goto L9;
        r1.topMargin = r2;
        r0.requestLayout();
        return;
    L9:
        return;
    }

    public final void u(boolean r10, boolean r11) {
        boolean r0 = isEnabled();
        EditText r1 = this.d;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        EditText r4 = this.d;
        if (r4 != null) goto L11;
    L13:
        boolean r42 = false;
    L14:
        ColorStateList r5 = this.i0;
        za r6 = this.u0;
        if (r5 == null) goto L17;
        r6.i(r5);
    L17:
        Editable r52 = null;
        if (r0 == true) goto L25;
        ColorStateList r02 = this.i0;
        if (r02 == null) goto L22;
        int r03 = r02.getColorForState(new int[]{-16842910}, this.s0);
    L23:
        r6.i(ColorStateList.valueOf(r03));
    L42:
        ej r04 = this.c;
        r40 r7 = this.b;
        if (r12 == false) goto L45;
    L78:
        if (r11 == false) goto L80;
    L83:
        ValueAnimator r112 = this.x0;
        if (r112 == null) goto L89;
        if (r112.isRunning() == false) goto L89;
        this.x0.cancel();
    L89:
        if (r10 == true) goto L91;
    L93:
        r6.k(1.0f);
    L94:
        this.t0 = false;
        if (e() == false) goto L97;
        j();
    L97:
        EditText r102 = this.d;
        if (r102 == null) goto L101;
        r52 = r102.getText();
    L101:
        v(r52);
        r7.j = false;
        r7.e();
        r04.r = false;
        r04.n();
        return;
    L91:
        if (this.w0 == false) goto L93;
        a(1.0f);
        goto L94
    L80:
        if (this.t0 == true) goto L83;
        return;
    L45:
        if (this.v0 == false) goto L78;
        if (isEnabled() == false) goto L50;
        if (r42 == true) goto L78;
    L50:
        if (r11 == false) goto L52;
    L53:
        ValueAnimator r113 = this.x0;
        if (r113 == null) goto L59;
        if (r113.isRunning() == false) goto L59;
        this.x0.cancel();
    L59:
        if (r10 == true) goto L61;
    L63:
        r6.k(0.0f);
    L65:
        if (e() == true) goto L67;
    L71:
        this.t0 = true;
        g5 r103 = this.t;
        if (r103 != null) goto L74;
    L76:
        r7.j = true;
        r7.e();
        r04.r = true;
        r04.n();
        return;
    L74:
        if (this.s == false) goto L76;
        r103.setText(null);
        v70.a(this.a, this.x);
        this.t.setVisibility(4);
        goto L76
    L67:
        if (((bf) this.F).x.q.isEmpty() == true) goto L71;
        if (e() == false) goto L71;
        ((bf) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
        goto L71
    L61:
        if (this.w0 == false) goto L63;
        a(0.0f);
        goto L65
    L52:
        if (this.t0 == false) goto L53;
        return;
    L22:
        r03 = this.s0;
        goto L23
    L25:
        if (m() == false) goto L32;
        g5 r05 = this.j.r;
        if (r05 == null) goto L29;
        ColorStateList r06 = r05.getTextColors();
    L30:
        r6.i(r06);
        goto L42
    L29:
        r06 = null;
        goto L30
    L32:
        if (this.m == false) goto L36;
        g5 r07 = this.o;
        if (r07 == null) goto L36;
        r6.i(r07.getTextColors());
    L36:
        if (r42 == false) goto L42;
        ColorStateList r08 = this.j0;
        if (r08 == null) goto L42;
        if (r6.k == r08) goto L42;
        r6.k = r08;
        r6.h(false);
        goto L42
    L11:
        if (r4.hasFocus() == false) goto L13;
        r42 = true;
        goto L14
    L5:
        if (TextUtils.isEmpty(r1.getText()) == true) goto L7;
        r12 = true;
        goto L8
    }

    public final void v(Editable r4) {
        ((jb) this.n).getClass();
        if (r4 == null) goto L5;
        int r42 = r4.length();
    L6:
        FrameLayout r1 = this.a;
        if (r42 == 0) goto L9;
    L18:
        g5 r43 = this.t;
        if (r43 != null) goto L21;
        return;
    L21:
        if (this.s == false) goto L28;
        r43.setText(null);
        v70.a(r1, this.x);
        this.t.setVisibility(4);
        return;
    L28:
        return;
    L9:
        if (this.t0 == true) goto L18;
        if (this.t != null) goto L13;
        return;
    L13:
        if (this.s == true) goto L15;
        return;
    L15:
        if (TextUtils.isEmpty(this.r) == true) goto L26;
        this.t.setText(this.r);
        v70.a(r1, this.w);
        this.t.setVisibility(0);
        this.t.bringToFront();
        announceForAccessibility(this.r);
        return;
    L26:
        return;
    L5:
        r42 = 0;
        goto L6
    }

    public final void w(boolean r6, boolean r7) {
        int r0 = this.n0.getDefaultColor();
        int r1 = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, r0);
        int r2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, r0);
        if (r6 == false) goto L6;
        this.T = r2;
        return;
    L6:
        if (r7 == false) goto L9;
        this.T = r1;
        return;
    L9:
        this.T = r0;
    }

    public final void x() {
        if (this.F != null) goto L5;
        return;
    L5:
        if (this.O == 0) goto L88;
        boolean r1 = false;
        if (isFocused() == true) goto L15;
        EditText r0 = this.d;
        if (r0 != null) goto L12;
    L14:
        boolean r02 = false;
    L17:
        if (isHovered() == true) goto L22;
        EditText r3 = this.d;
        if (r3 == null) goto L24;
        if (r3.isHovered() == true) goto L22;
    L24:
        if (isEnabled() == true) goto L27;
        this.T = this.s0;
    L46:
        if (Build.VERSION.SDK_INT < 29) goto L48;
        p();
    L48:
        ej r32 = this.c;
        TextInputLayout r4 = r32.a;
        CheckableImageButton r5 = r32.g;
        TextInputLayout r6 = r32.a;
        r32.l();
        ff.K(r6, r32.c, r32.d);
        ff.K(r6, r5, r32.k);
        if ((r32.b() instanceof ph) == true) goto L51;
    L56:
        r40 r33 = this.b;
        ff.K(r33.a, r33.d, r33.e);
        if (this.O != 2) goto L75;
        int r34 = this.Q;
        if (r02 == true) goto L61;
    L63:
        this.Q = this.R;
    L65:
        if (this.Q == r34) goto L75;
        if (e() == false) goto L75;
        if (this.t0 == true) goto L75;
        if (e() == false) goto L73;
        ((bf) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
    L73:
        j();
        goto L75
    L61:
        if (isEnabled() == false) goto L63;
        this.Q = this.S;
    L75:
        if (this.O == 1) goto L77;
    L85:
        b();
        return;
    L77:
        if (isEnabled() == true) goto L79;
        this.U = this.p0;
        goto L85
    L79:
        if (r1 == false) goto L82;
        if (r02 == true) goto L82;
        this.U = this.r0;
    L82:
        if (r02 == false) goto L84;
        this.U = this.q0;
        goto L85
    L84:
        this.U = this.o0;
        goto L85
    L51:
        if (r4.m() == true) goto L53;
    L55:
        ff.a(r4, r5, r32.k, r32.l);
        goto L56
    L53:
        if (r5.getDrawable() == null) goto L55;
        Drawable r35 = r5.getDrawable().mutate();
        ch.g(r35, r4.getErrorCurrentTextColors());
        r5.setImageDrawable(r35);
        goto L56
    L27:
        if (m() == false) goto L33;
        if (this.n0 == null) goto L31;
        w(r02, r1);
        goto L46
    L31:
        this.T = getErrorCurrentTextColors();
        goto L46
    L33:
        if (this.m == false) goto L40;
        g5 r36 = this.o;
        if (r36 == null) goto L40;
        if (this.n0 == null) goto L39;
        w(r02, r1);
        goto L46
    L39:
        this.T = r36.getCurrentTextColor();
    L40:
        if (r02 == false) goto L42;
        this.T = this.m0;
        goto L46
    L42:
        if (r1 == false) goto L44;
        this.T = this.l0;
        goto L46
    L44:
        this.T = this.k0;
    L22:
        r1 = true;
        goto L24
    L12:
        if (r0.hasFocus() == false) goto L14;
    L15:
        r02 = true;
        goto L17
    }

    public void setStartIconContentDescription(CharSequence r3) {
        CheckableImageButton r0 = this.b.d;
        if (r0.getContentDescription() == r3) goto L6;
        r0.setContentDescription(r3);
        return;
    }

    public void setStartIconDrawable(Drawable r2) {
        this.b.b(r2);
    }

    public void setHint(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r22 = getResources().getText(r2);
    L5:
        setHint(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence r2) {
        this.c.g.setContentDescription(r2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable r2) {
        this.c.g.setImageDrawable(r2);
    }

    public void setErrorIconDrawable(Drawable r2) {
        this.c.i(r2);
    }

    public void setEndIconContentDescription(CharSequence r3) {
        CheckableImageButton r0 = this.c.g;
        if (r0.getContentDescription() == r3) goto L6;
        r0.setContentDescription(r3);
        return;
    }

    public void setEndIconDrawable(Drawable r5) {
        ej r0 = this.c;
        TextInputLayout r1 = r0.a;
        CheckableImageButton r2 = r0.g;
        r2.setImageDrawable(r5);
        if (r5 == null) goto L6;
        ff.a(r1, r2, r0.k, r0.l);
        ff.K(r1, r2, r0.k);
        return;
    }
}
