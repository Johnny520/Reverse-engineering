package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] B0 = null;
    public android.content.res.ColorStateList A;
    public boolean A0;
    public android.content.res.ColorStateList B;
    public boolean C;
    public java.lang.CharSequence D;
    public boolean E;
    public defpackage.eu F;
    public defpackage.eu G;
    public android.graphics.drawable.StateListDrawable H;
    public boolean I;
    public defpackage.eu J;
    public defpackage.eu K;
    public defpackage.f30 L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final android.graphics.Rect V;
    public final android.graphics.Rect W;
    public final android.widget.FrameLayout a;
    public final android.graphics.RectF a0;
    public final defpackage.r40 b;
    public android.graphics.Typeface b0;
    public final defpackage.ej c;
    public android.graphics.drawable.ColorDrawable c0;
    public android.widget.EditText d;
    public int d0;
    public java.lang.CharSequence e;
    public final java.util.LinkedHashSet e0;
    public int f;
    public android.graphics.drawable.ColorDrawable f0;
    public int g;
    public int g0;
    public int h;
    public android.graphics.drawable.Drawable h0;
    public int i;
    public android.content.res.ColorStateList i0;
    public final defpackage.zo j;
    public android.content.res.ColorStateList j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public boolean m;
    public int m0;
    public defpackage.f60 n;
    public android.content.res.ColorStateList n0;
    public defpackage.g5 o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public java.lang.CharSequence r;
    public int r0;
    public boolean s;
    public int s0;
    public defpackage.g5 t;
    public boolean t0;
    public android.content.res.ColorStateList u;
    public final defpackage.za u0;
    public int v;
    public boolean v0;
    public defpackage.pj w;
    public boolean w0;
    public defpackage.pj x;
    public android.animation.ValueAnimator x0;
    public android.content.res.ColorStateList y;
    public boolean y0;
    public android.content.res.ColorStateList z;
    public boolean z0;

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            r1 = 0
            int[] r1 = new int[r1]
            int[][] r0 = new int[][]{r0, r1}
            com.google.android.material.textfield.TextInputLayout.B0 = r0
            return
    }

    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22) {
            r20 = this;
            r0 = r20
            r2 = r22
            r4 = 2130969624(0x7f040418, float:1.7547935E38)
            r7 = 2131821368(0x7f110338, float:1.9275477E38)
            r1 = r21
            android.content.Context r1 = defpackage.ff.W(r1, r2, r4, r7)
            r0.<init>(r1, r2, r4)
            r8 = -1
            r0.f = r8
            r0.g = r8
            r0.h = r8
            r0.i = r8
            zo r1 = new zo
            r1.<init>(r0)
            r0.j = r1
            jb r1 = new jb
            r3 = 2
            r1.<init>(r3)
            r0.n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.e0 = r1
            za r1 = new za
            r1.<init>(r0)
            r0.u0 = r1
            r9 = 0
            r0.A0 = r9
            android.content.Context r3 = r0.getContext()
            r10 = 1
            r0.setOrientation(r10)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r10)
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r3)
            r0.a = r11
            r11.setAddStatesFromChildren(r10)
            android.view.animation.LinearInterpolator r5 = defpackage.q2.a
            r1.Q = r5
            r1.h(r9)
            r1.P = r5
            r1.h(r9)
            int r5 = r1.g
            r6 = 8388659(0x800033, float:1.1755015E-38)
            if (r5 == r6) goto L81
            r1.g = r6
            r1.h(r9)
        L81:
            r12 = 22
            r13 = 20
            r14 = 40
            r15 = 45
            r1 = 49
            int[] r6 = new int[]{r12, r13, r14, r15, r1}
            r5 = 2131821368(0x7f110338, float:1.9275477E38)
            defpackage.a80.c(r3, r2, r4, r5)
            r16 = r1
            r1 = r3
            int[] r3 = defpackage.wy.A
            r13 = r16
            defpackage.a80.e(r1, r2, r3, r4, r5, r6)
            r5 r6 = new r5
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.<init>(r1, r3)
            r40 r5 = new r40
            r5.<init>(r0, r6)
            r0.b = r5
            r12 = 48
            boolean r12 = r3.getBoolean(r12, r10)
            r0.C = r12
            r12 = 4
            java.lang.CharSequence r12 = r3.getText(r12)
            r0.setHint(r12)
            r12 = 47
            boolean r12 = r3.getBoolean(r12, r10)
            r0.w0 = r12
            r12 = 42
            boolean r12 = r3.getBoolean(r12, r10)
            r0.v0 = r12
            r12 = 6
            boolean r17 = r3.hasValue(r12)
            if (r17 == 0) goto Lde
            int r12 = r3.getInt(r12, r8)
            r0.setMinEms(r12)
            goto Lec
        Lde:
            r12 = 3
            boolean r17 = r3.hasValue(r12)
            if (r17 == 0) goto Lec
            int r12 = r3.getDimensionPixelSize(r12, r8)
            r0.setMinWidth(r12)
        Lec:
            r12 = 5
            boolean r17 = r3.hasValue(r12)
            r15 = 2
            if (r17 == 0) goto Lfc
            int r12 = r3.getInt(r12, r8)
            r0.setMaxEms(r12)
            goto L109
        Lfc:
            boolean r12 = r3.hasValue(r15)
            if (r12 == 0) goto L109
            int r12 = r3.getDimensionPixelSize(r15, r8)
            r0.setMaxWidth(r12)
        L109:
            e30 r2 = defpackage.f30.b(r1, r2, r4, r7)
            f30 r2 = r2.a()
            r0.L = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131165943(0x7f0702f7, float:1.7946117E38)
            int r2 = r2.getDimensionPixelOffset(r4)
            r0.N = r2
            r2 = 9
            int r2 = r3.getDimensionPixelOffset(r2, r9)
            r0.P = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131165944(0x7f0702f8, float:1.794612E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 16
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.R = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131165945(0x7f0702f9, float:1.7946121E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 17
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.S = r2
            int r2 = r0.R
            r0.Q = r2
            r2 = 13
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r3.getDimension(r2, r4)
            r7 = 12
            float r7 = r3.getDimension(r7, r4)
            r12 = 10
            float r12 = r3.getDimension(r12, r4)
            r15 = 11
            float r4 = r3.getDimension(r15, r4)
            f30 r15 = r0.L
            e30 r15 = r15.e()
            r18 = 0
            int r19 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r19 < 0) goto L17f
            e r14 = new e
            r14.<init>(r2)
            r15.e = r14
        L17f:
            int r2 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r2 < 0) goto L18a
            e r2 = new e
            r2.<init>(r7)
            r15.f = r2
        L18a:
            int r2 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r2 < 0) goto L195
            e r2 = new e
            r2.<init>(r12)
            r15.g = r2
        L195:
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L1a0
            e r2 = new e
            r2.<init>(r4)
            r15.h = r2
        L1a0:
            f30 r2 = r15.a()
            r0.L = r2
            r2 = 7
            android.content.res.ColorStateList r2 = defpackage.ct.m(r1, r6, r2)
            if (r2 == 0) goto L206
            int r4 = r2.getDefaultColor()
            r0.o0 = r4
            r0.U = r4
            boolean r4 = r2.isStateful()
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r12 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L1e6
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.p0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r12 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.q0 = r4
            int[] r4 = new int[]{r7, r12}
            int r2 = r2.getColorForState(r4, r8)
            r0.r0 = r2
            goto L210
        L1e6:
            int r2 = r0.o0
            r0.q0 = r2
            r2 = 2131100360(0x7f0602c8, float:1.78131E38)
            android.content.res.ColorStateList r2 = defpackage.ip.v(r1, r2)
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r8)
            r0.p0 = r4
            int[] r4 = new int[]{r7}
            int r2 = r2.getColorForState(r4, r8)
            r0.r0 = r2
            goto L210
        L206:
            r0.U = r9
            r0.o0 = r9
            r0.p0 = r9
            r0.q0 = r9
            r0.r0 = r9
        L210:
            boolean r2 = r3.hasValue(r10)
            if (r2 == 0) goto L21e
            android.content.res.ColorStateList r2 = r6.l(r10)
            r0.j0 = r2
            r0.i0 = r2
        L21e:
            r2 = 14
            android.content.res.ColorStateList r4 = defpackage.ct.m(r1, r6, r2)
            int r2 = r3.getColor(r2, r9)
            r0.m0 = r2
            r2 = 2131100387(0x7f0602e3, float:1.7813154E38)
            int r2 = defpackage.hd.a(r1, r2)
            r0.k0 = r2
            r2 = 2131100388(0x7f0602e4, float:1.7813156E38)
            int r2 = defpackage.hd.a(r1, r2)
            r0.s0 = r2
            r2 = 2131100391(0x7f0602e7, float:1.7813162E38)
            int r2 = defpackage.hd.a(r1, r2)
            r0.l0 = r2
            if (r4 == 0) goto L24a
            r0.setBoxStrokeColorStateList(r4)
        L24a:
            r2 = 15
            boolean r4 = r3.hasValue(r2)
            if (r4 == 0) goto L259
            android.content.res.ColorStateList r1 = defpackage.ct.m(r1, r6, r2)
            r0.setBoxStrokeErrorColor(r1)
        L259:
            int r1 = r3.getResourceId(r13, r8)
            if (r1 == r8) goto L266
            int r1 = r3.getResourceId(r13, r9)
            r0.setHintTextAppearance(r1)
        L266:
            r1 = 24
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.A = r1
            r1 = 25
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.B = r1
            r1 = 40
            int r1 = r3.getResourceId(r1, r9)
            r2 = 35
            java.lang.CharSequence r2 = r3.getText(r2)
            r4 = 34
            int r4 = r3.getInt(r4, r10)
            r7 = 36
            boolean r7 = r3.getBoolean(r7, r9)
            r12 = 45
            int r12 = r3.getResourceId(r12, r9)
            r13 = 44
            boolean r13 = r3.getBoolean(r13, r9)
            r14 = 43
            java.lang.CharSequence r14 = r3.getText(r14)
            r15 = 57
            int r15 = r3.getResourceId(r15, r9)
            r10 = 56
            java.lang.CharSequence r10 = r3.getText(r10)
            r8 = 18
            boolean r8 = r3.getBoolean(r8, r9)
            r9 = 19
            r22 = r14
            r14 = -1
            int r9 = r3.getInt(r9, r14)
            r0.setCounterMaxLength(r9)
            r9 = 0
            r14 = 22
            int r14 = r3.getResourceId(r14, r9)
            r0.q = r14
            r14 = 20
            int r14 = r3.getResourceId(r14, r9)
            r0.p = r14
            r14 = 8
            int r14 = r3.getInt(r14, r9)
            r0.setBoxBackgroundMode(r14)
            r0.setErrorContentDescription(r2)
            r0.setErrorAccessibilityLiveRegion(r4)
            int r2 = r0.p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r12)
            r0.setErrorTextAppearance(r1)
            int r1 = r0.q
            r0.setCounterTextAppearance(r1)
            r0.setPlaceholderText(r10)
            r0.setPlaceholderTextAppearance(r15)
            r1 = 41
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L303
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setErrorTextColor(r1)
        L303:
            r1 = 46
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L312
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setHelperTextColor(r1)
        L312:
            r1 = 50
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L321
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setHintTextColor(r1)
        L321:
            r1 = 23
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L330
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setCounterTextColor(r1)
        L330:
            r1 = 21
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L33f
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setCounterOverflowTextColor(r1)
        L33f:
            r1 = 58
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L34e
            android.content.res.ColorStateList r1 = r6.l(r1)
            r0.setPlaceholderTextColor(r1)
        L34e:
            ej r1 = new ej
            r1.<init>(r0, r6)
            r0.c = r1
            r2 = 1
            r9 = 0
            boolean r3 = r3.getBoolean(r9, r2)
            r6.z()
            r4 = 2
            defpackage.s90.s(r0, r4)
            defpackage.aa0.l(r0, r2)
            r11.addView(r5)
            r11.addView(r1)
            r0.addView(r11)
            r0.setEnabled(r3)
            r0.setHelperTextEnabled(r13)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r8)
            r1 = r22
            r0.setHelperText(r1)
            return
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
            r10 = this;
            android.widget.EditText r0 = r10.d
            boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
            if (r1 == 0) goto L9b
            int r0 = r0.getInputType()
            if (r0 == 0) goto Le
            goto L9b
        Le:
            android.widget.EditText r0 = r10.d
            r1 = 2130968801(0x7f0400e1, float:1.7546266E38)
            int r0 = defpackage.zt.k(r0, r1)
            int r1 = r10.O
            r2 = 1
            r3 = 2
            r4 = 1036831949(0x3dcccccd, float:0.1)
            int[][] r5 = com.google.android.material.textfield.TextInputLayout.B0
            if (r1 != r3) goto L80
            android.content.Context r1 = r10.getContext()
            eu r6 = r10.F
            java.lang.String r7 = "TextInputLayout"
            r8 = 2130968841(0x7f040109, float:1.7546347E38)
            android.util.TypedValue r7 = defpackage.gt.A(r1, r8, r7)
            int r8 = r7.resourceId
            if (r8 == 0) goto L3a
            int r1 = defpackage.hd.a(r1, r8)
            goto L3c
        L3a:
            int r1 = r7.data
        L3c:
            eu r7 = new eu
            du r8 = r6.a
            f30 r8 = r8.a
            r7.<init>(r8)
            int r0 = defpackage.zt.E(r4, r0, r1)
            r4 = 0
            int[] r8 = new int[]{r0, r4}
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            r9.<init>(r5, r8)
            r7.j(r9)
            r7.setTint(r1)
            int[] r0 = new int[]{r0, r1}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r5, r0)
            eu r0 = new eu
            du r5 = r6.a
            f30 r5 = r5.a
            r0.<init>(r5)
            r5 = -1
            r0.setTint(r5)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            r5.<init>(r1, r7, r0)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r3]
            r0[r4] = r5
            r0[r2] = r6
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
            return r1
        L80:
            if (r1 != r2) goto L99
            eu r1 = r10.F
            int r2 = r10.U
            int r0 = defpackage.zt.E(r4, r0, r2)
            int[] r0 = new int[]{r0, r2}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r5, r0)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r2, r1, r1)
            return r0
        L99:
            r0 = 0
            return r0
        L9b:
            eu r0 = r10.F
            return r0
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
            r3 = this;
            android.graphics.drawable.StateListDrawable r0 = r3.H
            if (r0 != 0) goto L25
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r3.H = r0
            r1 = 16842922(0x10100aa, float:2.3694034E-38)
            int[] r1 = new int[]{r1}
            android.graphics.drawable.Drawable r2 = r3.getOrCreateOutlinedDropDownMenuBackground()
            r0.addState(r1, r2)
            android.graphics.drawable.StateListDrawable r0 = r3.H
            r1 = 0
            int[] r2 = new int[r1]
            eu r1 = r3.f(r1)
            r0.addState(r2, r1)
        L25:
            android.graphics.drawable.StateListDrawable r0 = r3.H
            return r0
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
            r1 = this;
            eu r0 = r1.G
            if (r0 != 0) goto Lb
            r0 = 1
            eu r0 = r1.f(r0)
            r1.G = r0
        Lb:
            eu r0 = r1.G
            return r0
    }

    public static void k(android.view.ViewGroup r4, boolean r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            r2.setEnabled(r5)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            k(r2, r5)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private void setEditText(android.widget.EditText r7) {
            r6 = this;
            android.widget.EditText r0 = r6.d
            if (r0 != 0) goto L10f
            int r0 = r6.getEndIconMode()
            r1 = 3
            if (r0 == r1) goto L16
            boolean r0 = r7 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L16
            java.lang.String r0 = "TextInputLayout"
            java.lang.String r1 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r0, r1)
        L16:
            r6.d = r7
            int r0 = r6.f
            r1 = -1
            if (r0 == r1) goto L21
            r6.setMinEms(r0)
            goto L26
        L21:
            int r0 = r6.h
            r6.setMinWidth(r0)
        L26:
            int r0 = r6.g
            if (r0 == r1) goto L2e
            r6.setMaxEms(r0)
            goto L33
        L2e:
            int r0 = r6.i
            r6.setMaxWidth(r0)
        L33:
            r0 = 0
            r6.I = r0
            r6.i()
            e60 r1 = new e60
            r1.<init>(r6)
            r6.setTextInputAccessibilityDelegate(r1)
            android.widget.EditText r1 = r6.d
            android.graphics.Typeface r1 = r1.getTypeface()
            za r2 = r6.u0
            r2.m(r1)
            android.widget.EditText r1 = r6.d
            float r1 = r1.getTextSize()
            float r3 = r2.h
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L5d
            r2.h = r1
            r2.h(r0)
        L5d:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.widget.EditText r3 = r6.d
            float r3 = r3.getLetterSpacing()
            float r4 = r2.W
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L70
            r2.W = r3
            r2.h(r0)
        L70:
            android.widget.EditText r3 = r6.d
            int r3 = r3.getGravity()
            r4 = r3 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r4 | 48
            int r5 = r2.g
            if (r5 == r4) goto L83
            r2.g = r4
            r2.h(r0)
        L83:
            int r4 = r2.f
            if (r4 == r3) goto L8c
            r2.f = r3
            r2.h(r0)
        L8c:
            android.widget.EditText r2 = r6.d
            z10 r3 = new z10
            r4 = 1
            r3.<init>(r6, r4)
            r2.addTextChangedListener(r3)
            android.content.res.ColorStateList r2 = r6.i0
            if (r2 != 0) goto La3
            android.widget.EditText r2 = r6.d
            android.content.res.ColorStateList r2 = r2.getHintTextColors()
            r6.i0 = r2
        La3:
            boolean r2 = r6.C
            r3 = 1
            if (r2 == 0) goto Lc3
            java.lang.CharSequence r2 = r6.D
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Lc1
            android.widget.EditText r2 = r6.d
            java.lang.CharSequence r2 = r2.getHint()
            r6.e = r2
            r6.setHint(r2)
            android.widget.EditText r2 = r6.d
            r4 = 0
            r2.setHint(r4)
        Lc1:
            r6.E = r3
        Lc3:
            r2 = 29
            if (r1 < r2) goto Lca
            r6.p()
        Lca:
            g5 r1 = r6.o
            if (r1 == 0) goto Ld7
            android.widget.EditText r1 = r6.d
            android.text.Editable r1 = r1.getText()
            r6.n(r1)
        Ld7:
            r6.r()
            zo r1 = r6.j
            r1.b()
            r40 r1 = r6.b
            r1.bringToFront()
            ej r1 = r6.c
            r1.bringToFront()
            java.util.LinkedHashSet r2 = r6.e0
            java.util.Iterator r2 = r2.iterator()
        Lef:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lff
            java.lang.Object r4 = r2.next()
            cj r4 = (defpackage.cj) r4
            r4.a(r6)
            goto Lef
        Lff:
            r1.m()
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L10b
            r7.setEnabled(r0)
        L10b:
            r6.u(r0, r3)
            return
        L10f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "We already have an EditText, can only have one"
            r7.<init>(r0)
            throw r7
    }

    private void setHintInternal(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r0 = r2.D
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L2f
            r2.D = r3
            za r0 = r2.u0
            if (r3 == 0) goto L16
            java.lang.CharSequence r1 = r0.A
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L28
        L16:
            r0.A = r3
            r3 = 0
            r0.B = r3
            android.graphics.Bitmap r1 = r0.E
            if (r1 == 0) goto L24
            r1.recycle()
            r0.E = r3
        L24:
            r3 = 0
            r0.h(r3)
        L28:
            boolean r3 = r2.t0
            if (r3 != 0) goto L2f
            r2.j()
        L2f:
            return
    }

    private void setPlaceholderTextEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.s
            if (r0 != r3) goto L5
            return
        L5:
            if (r3 == 0) goto L17
            g5 r0 = r2.t
            if (r0 == 0) goto L23
            android.widget.FrameLayout r1 = r2.a
            r1.addView(r0)
            g5 r0 = r2.t
            r1 = 0
            r0.setVisibility(r1)
            goto L23
        L17:
            g5 r0 = r2.t
            if (r0 == 0) goto L20
            r1 = 8
            r0.setVisibility(r1)
        L20:
            r0 = 0
            r2.t = r0
        L23:
            r2.s = r3
            return
    }

    public final void a(float r7) {
            r6 = this;
            za r0 = r6.u0
            float r1 = r0.b
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L9
            return
        L9:
            android.animation.ValueAnimator r1 = r6.x0
            r2 = 2
            if (r1 != 0) goto L42
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r6.x0 = r1
            android.content.Context r3 = r6.getContext()
            r4 = 2130969351(0x7f040307, float:1.7547381E38)
            tj r5 = defpackage.q2.b
            android.animation.TimeInterpolator r3 = defpackage.ct.w(r3, r4, r5)
            r1.setInterpolator(r3)
            android.animation.ValueAnimator r1 = r6.x0
            android.content.Context r3 = r6.getContext()
            r4 = 2130969341(0x7f0402fd, float:1.7547361E38)
            r5 = 167(0xa7, float:2.34E-43)
            int r3 = defpackage.ct.v(r3, r4, r5)
            long r3 = (long) r3
            r1.setDuration(r3)
            android.animation.ValueAnimator r1 = r6.x0
            q7 r3 = new q7
            r3.<init>(r2, r6)
            r1.addUpdateListener(r3)
        L42:
            android.animation.ValueAnimator r1 = r6.x0
            float r0 = r0.b
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r7
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r7 = r6.x0
            r7.start()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L22
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4)
            int r0 = r3.gravity
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r0 = r0 | 16
            r3.gravity = r0
            android.widget.FrameLayout r0 = r1.a
            r0.addView(r2, r3)
            r0.setLayoutParams(r4)
            r1.t()
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.setEditText(r2)
            return
        L22:
            super.addView(r2, r3, r4)
            return
    }

    public final void b() {
            r5 = this;
            eu r0 = r5.F
            if (r0 != 0) goto L5
            return
        L5:
            du r1 = r0.a
            f30 r1 = r1.a
            f30 r2 = r5.L
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r5.O
            r1 = 2
            r2 = -1
            if (r0 != r1) goto L3b
            int r0 = r5.Q
            if (r0 <= r2) goto L3b
            int r1 = r5.T
            if (r1 == 0) goto L3b
            eu r3 = r5.F
            float r0 = (float) r0
            du r4 = r3.a
            r4.j = r0
            r3.invalidateSelf()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            du r1 = r3.a
            android.content.res.ColorStateList r4 = r1.d
            if (r4 == r0) goto L3b
            r1.d = r0
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L3b:
            int r0 = r5.U
            int r1 = r5.O
            r3 = 1
            if (r1 != r3) goto L54
            r0 = 0
            android.content.Context r1 = r5.getContext()
            r3 = 2130968841(0x7f040109, float:1.7546347E38)
            int r0 = defpackage.zt.j(r1, r3, r0)
            int r1 = r5.U
            int r0 = defpackage.ib.b(r1, r0)
        L54:
            r5.U = r0
            eu r1 = r5.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            eu r0 = r5.J
            if (r0 == 0) goto L96
            eu r1 = r5.K
            if (r1 != 0) goto L68
            goto L96
        L68:
            int r1 = r5.Q
            if (r1 <= r2) goto L93
            int r1 = r5.T
            if (r1 == 0) goto L93
            android.widget.EditText r1 = r5.d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L7f
            int r1 = r5.k0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L85
        L7f:
            int r1 = r5.T
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L85:
            r0.j(r1)
            eu r0 = r5.K
            int r1 = r5.T
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        L93:
            r5.invalidate()
        L96:
            r5.s()
            return
    }

    public final int c() {
            r4 = this;
            boolean r0 = r4.C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.O
            za r2 = r4.u0
            if (r0 == 0) goto L19
            r3 = 2
            if (r0 == r3) goto L10
            return r1
        L10:
            float r0 = r2.d()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
        L17:
            int r0 = (int) r0
            return r0
        L19:
            float r0 = r2.d()
            goto L17
    }

    public final defpackage.pj d() {
            r4 = this;
            pj r0 = new pj
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            r2 = 2130969343(0x7f0402ff, float:1.7547365E38)
            r3 = 87
            int r1 = defpackage.ct.v(r1, r2, r3)
            long r1 = (long) r1
            r0.c = r1
            android.content.Context r1 = r4.getContext()
            r2 = 2130969353(0x7f040309, float:1.7547385E38)
            android.view.animation.LinearInterpolator r3 = defpackage.q2.a
            android.animation.TimeInterpolator r1 = defpackage.ct.w(r1, r2, r3)
            r0.d = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure r6, int r7) {
            r5 = this;
            android.widget.EditText r0 = r5.d
            if (r0 != 0) goto L8
            super.dispatchProvideAutofillStructure(r6, r7)
            return
        L8:
            java.lang.CharSequence r1 = r5.e
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = r5.E
            r5.E = r2
            java.lang.CharSequence r0 = r0.getHint()
            android.widget.EditText r2 = r5.d
            java.lang.CharSequence r3 = r5.e
            r2.setHint(r3)
            super.dispatchProvideAutofillStructure(r6, r7)     // Catch: java.lang.Throwable -> L27
            android.widget.EditText r6 = r5.d
            r6.setHint(r0)
            r5.E = r1
            return
        L27:
            r6 = move-exception
            android.widget.EditText r7 = r5.d
            r7.setHint(r0)
            r5.E = r1
            throw r6
        L30:
            android.view.autofill.AutofillId r0 = r5.getAutofillId()
            r6.setAutofillId(r0)
            r5.onProvideAutofillStructure(r6, r7)
            r5.onProvideAutofillVirtualStructure(r6, r7)
            android.widget.FrameLayout r0 = r5.a
            int r1 = r0.getChildCount()
            r6.setChildCount(r1)
        L46:
            int r1 = r0.getChildCount()
            if (r2 >= r1) goto L65
            android.view.View r1 = r0.getChildAt(r2)
            android.view.ViewStructure r3 = r6.newChild(r2)
            r1.dispatchProvideAutofillStructure(r3, r7)
            android.widget.EditText r4 = r5.d
            if (r1 != r4) goto L62
            java.lang.CharSequence r1 = r5.getHint()
            r3.setHint(r1)
        L62:
            int r2 = r2 + 1
            goto L46
        L65:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray r2) {
            r1 = this;
            r0 = 1
            r1.z0 = r0
            super.dispatchRestoreInstanceState(r2)
            r2 = 0
            r1.z0 = r2
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            super.draw(r18)
            boolean r2 = r0.C
            za r8 = r0.u0
            if (r2 == 0) goto L10c
            android.text.TextPaint r7 = r8.N
            android.graphics.RectF r2 = r8.e
            int r9 = r1.save()
            java.lang.CharSequence r3 = r8.B
            if (r3 == 0) goto L10c
            float r3 = r2.width()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L10c
            float r2 = r2.height()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L10c
            float r2 = r8.G
            r7.setTextSize(r2)
            float r2 = r8.p
            float r3 = r8.q
            float r4 = r8.F
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L3e
            r1.scale(r4, r4, r2, r3)
        L3e:
            int r4 = r8.d0
            r10 = 1
            if (r4 <= r10) goto L101
            boolean r4 = r8.C
            if (r4 == 0) goto L49
            goto L101
        L49:
            float r2 = r8.p
            android.text.StaticLayout r4 = r8.Y
            r11 = 0
            int r4 = r4.getLineStart(r11)
            float r4 = (float) r4
            float r2 = r2 - r4
            int r12 = r7.getAlpha()
            r1.translate(r2, r3)
            float r2 = r8.b0
            float r3 = (float) r12
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 31
            if (r13 < r14) goto L84
            float r2 = r8.H
            float r4 = r8.I
            float r5 = r8.J
            int r6 = r8.K
            int r15 = r7.getAlpha()
            int r16 = android.graphics.Color.alpha(r6)
            int r15 = r15 * r16
            int r15 = r15 / 255
            int r6 = defpackage.ib.d(r6, r15)
            r7.setShadowLayer(r2, r4, r5, r6)
        L84:
            android.text.StaticLayout r2 = r8.Y
            r2.draw(r1)
            float r2 = r8.a0
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            if (r13 < r14) goto Lac
            float r2 = r8.H
            float r3 = r8.I
            float r4 = r8.J
            int r5 = r8.K
            int r6 = r7.getAlpha()
            int r15 = android.graphics.Color.alpha(r5)
            int r15 = r15 * r6
            int r15 = r15 / 255
            int r5 = defpackage.ib.d(r5, r15)
            r7.setShadowLayer(r2, r3, r4, r5)
        Lac:
            android.text.StaticLayout r2 = r8.Y
            int r2 = r2.getLineBaseline(r11)
            java.lang.CharSequence r3 = r8.c0
            int r4 = r3.length()
            float r6 = (float) r2
            r2 = r3
            r3 = 0
            r5 = 0
            r1.drawText(r2, r3, r4, r5, r6, r7)
            if (r13 < r14) goto Lcc
            float r1 = r8.H
            float r2 = r8.I
            float r3 = r8.J
            int r4 = r8.K
            r7.setShadowLayer(r1, r2, r3, r4)
        Lcc:
            java.lang.CharSequence r1 = r8.c0
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = "…"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto Le7
            int r2 = r1.length()
            int r2 = r2 - r10
            java.lang.String r1 = r1.substring(r11, r2)
        Le7:
            r2 = r1
            r7.setAlpha(r12)
            android.text.StaticLayout r1 = r8.Y
            int r1 = r1.getLineEnd(r11)
            int r3 = r2.length()
            int r4 = java.lang.Math.min(r1, r3)
            r5 = 0
            r3 = 0
            r1 = r18
            r1.drawText(r2, r3, r4, r5, r6, r7)
            goto L109
        L101:
            r1.translate(r2, r3)
            android.text.StaticLayout r2 = r8.Y
            r2.draw(r1)
        L109:
            r1.restoreToCount(r9)
        L10c:
            eu r2 = r0.K
            if (r2 == 0) goto L146
            eu r2 = r0.J
            if (r2 == 0) goto L146
            r2.draw(r1)
            android.widget.EditText r2 = r0.d
            boolean r2 = r2.isFocused()
            if (r2 == 0) goto L146
            eu r2 = r0.K
            android.graphics.Rect r2 = r2.getBounds()
            eu r3 = r0.J
            android.graphics.Rect r3 = r3.getBounds()
            float r4 = r8.b
            int r5 = r3.centerX()
            int r6 = r3.left
            int r6 = defpackage.q2.c(r4, r5, r6)
            r2.left = r6
            int r3 = r3.right
            int r3 = defpackage.q2.c(r4, r5, r3)
            r2.right = r3
            eu r2 = r0.K
            r2.draw(r1)
        L146:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            boolean r0 = r4.y0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.y0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            za r3 = r4.u0
            if (r3 == 0) goto L2f
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = defpackage.ja0.a
            boolean r3 = defpackage.v90.c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.y0 = r2
            return
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r1.D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            eu r0 = r1.F
            boolean r0 = r0 instanceof defpackage.bf
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final defpackage.eu f(boolean r17) {
            r16 = this;
            r0 = r16
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131165918(0x7f0702de, float:1.7946067E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
            if (r17 == 0) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = 0
        L13:
            android.widget.EditText r3 = r0.d
            boolean r4 = r3 instanceof defpackage.jt
            if (r4 == 0) goto L20
            jt r3 = (defpackage.jt) r3
            float r3 = r3.getPopupElevation()
            goto L2c
        L20:
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131165519(0x7f07014f, float:1.7945257E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            float r3 = (float) r3
        L2c:
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131165855(0x7f07029f, float:1.7945939E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            h10 r5 = new h10
            r5.<init>()
            h10 r6 = new h10
            r6.<init>()
            h10 r7 = new h10
            r7.<init>()
            h10 r8 = new h10
            r8.<init>()
            vh r9 = new vh
            r10 = 0
            r9.<init>(r10)
            vh r11 = new vh
            r11.<init>(r10)
            vh r12 = new vh
            r12.<init>(r10)
            vh r13 = new vh
            r13.<init>(r10)
            e r14 = new e
            r14.<init>(r2)
            e r15 = new e
            r15.<init>(r2)
            e r2 = new e
            r2.<init>(r1)
            e r10 = new e
            r10.<init>(r1)
            f30 r1 = new f30
            r1.<init>()
            r1.a = r5
            r1.b = r6
            r1.c = r7
            r1.d = r8
            r1.e = r14
            r1.f = r15
            r1.g = r10
            r1.h = r2
            r1.i = r9
            r1.j = r11
            r1.k = r12
            r1.l = r13
            android.widget.EditText r2 = r0.d
            boolean r5 = r2 instanceof defpackage.jt
            if (r5 == 0) goto L9e
            jt r2 = (defpackage.jt) r2
            android.content.res.ColorStateList r2 = r2.getDropDownBackgroundTintList()
            goto L9f
        L9e:
            r2 = 0
        L9f:
            android.content.Context r5 = r0.getContext()
            if (r2 != 0) goto Lc3
            android.graphics.Paint r2 = defpackage.eu.w
            java.lang.Class<eu> r2 = defpackage.eu.class
            java.lang.String r2 = r2.getSimpleName()
            r6 = 2130968841(0x7f040109, float:1.7546347E38)
            android.util.TypedValue r2 = defpackage.gt.A(r5, r6, r2)
            int r6 = r2.resourceId
            if (r6 == 0) goto Lbd
            int r2 = defpackage.hd.a(r5, r6)
            goto Lbf
        Lbd:
            int r2 = r2.data
        Lbf:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        Lc3:
            eu r6 = new eu
            r6.<init>()
            r6.h(r5)
            r6.j(r2)
            r6.i(r3)
            r6.setShapeAppearanceModel(r1)
            du r1 = r6.a
            android.graphics.Rect r2 = r1.g
            if (r2 != 0) goto Le1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.g = r2
        Le1:
            du r1 = r6.a
            android.graphics.Rect r1 = r1.g
            r2 = 0
            r1.set(r2, r4, r2, r4)
            r6.invalidateSelf()
            return r6
    }

    public final int g(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getPrefixText()
            if (r0 == 0) goto L10
            r40 r3 = r1.b
            int r3 = r3.a()
        Le:
            int r3 = r3 + r2
            return r3
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getSuffixText()
            if (r3 == 0) goto L1f
            ej r3 = r1.c
            int r3 = r3.c()
            goto Le
        L1f:
            android.widget.EditText r3 = r1.d
            int r3 = r3.getCompoundPaddingLeft()
            goto Le
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
            r2 = this;
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto L13
            int r0 = r0.getBaseline()
            int r1 = r2.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r2.c()
            int r0 = r0 + r1
            return r0
        L13:
            int r0 = super.getBaseline()
            return r0
    }

    public defpackage.eu getBoxBackground() {
            r2 = this;
            int r0 = r2.O
            r1 = 1
            if (r0 == r1) goto Lf
            r1 = 2
            if (r0 != r1) goto L9
            goto Lf
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lf:
            eu r0 = r2.F
            return r0
    }

    public int getBoxBackgroundColor() {
            r1 = this;
            int r0 = r1.U
            return r0
    }

    public int getBoxBackgroundMode() {
            r1 = this;
            int r0 = r1.O
            return r0
    }

    public int getBoxCollapsedPaddingTop() {
            r1 = this;
            int r0 = r1.P
            return r0
    }

    public float getBoxCornerRadiusBottomEnd() {
            r2 = this;
            boolean r0 = defpackage.gt.n(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            f30 r0 = r2.L
            de r0 = r0.h
            float r0 = r0.a(r1)
            return r0
        L11:
            f30 r0 = r2.L
            de r0 = r0.g
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusBottomStart() {
            r2 = this;
            boolean r0 = defpackage.gt.n(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            f30 r0 = r2.L
            de r0 = r0.g
            float r0 = r0.a(r1)
            return r0
        L11:
            f30 r0 = r2.L
            de r0 = r0.h
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusTopEnd() {
            r2 = this;
            boolean r0 = defpackage.gt.n(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            f30 r0 = r2.L
            de r0 = r0.e
            float r0 = r0.a(r1)
            return r0
        L11:
            f30 r0 = r2.L
            de r0 = r0.f
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusTopStart() {
            r2 = this;
            boolean r0 = defpackage.gt.n(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            f30 r0 = r2.L
            de r0 = r0.f
            float r0 = r0.a(r1)
            return r0
        L11:
            f30 r0 = r2.L
            de r0 = r0.e
            float r0 = r0.a(r1)
            return r0
    }

    public int getBoxStrokeColor() {
            r1 = this;
            int r0 = r1.m0
            return r0
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            return r0
    }

    public int getBoxStrokeWidth() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    public int getBoxStrokeWidthFocused() {
            r1 = this;
            int r0 = r1.S
            return r0
    }

    public int getCounterMaxLength() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public java.lang.CharSequence getCounterOverflowDescription() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == 0) goto L11
            boolean r0 = r1.m
            if (r0 == 0) goto L11
            g5 r0 = r1.o
            if (r0 == 0) goto L11
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.z
            return r0
    }

    public android.content.res.ColorStateList getCounterTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y
            return r0
    }

    public android.content.res.ColorStateList getCursorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A
            return r0
    }

    public android.content.res.ColorStateList getCursorErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B
            return r0
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.i0
            return r0
    }

    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.d
            return r0
    }

    public java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getEndIconMinSize() {
            r1 = this;
            ej r0 = r1.c
            int r0 = r0.m
            return r0
    }

    public int getEndIconMode() {
            r1 = this;
            ej r0 = r1.c
            int r0 = r0.i
            return r0
    }

    public android.widget.ImageView.ScaleType getEndIconScaleType() {
            r1 = this;
            ej r0 = r1.c
            android.widget.ImageView$ScaleType r0 = r0.n
            return r0
    }

    public com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            return r0
    }

    public java.lang.CharSequence getError() {
            r2 = this;
            zo r0 = r2.j
            boolean r1 = r0.q
            if (r1 == 0) goto L9
            java.lang.CharSequence r0 = r0.p
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getErrorAccessibilityLiveRegion() {
            r1 = this;
            zo r0 = r1.j
            int r0 = r0.t
            return r0
    }

    public java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            zo r0 = r1.j
            java.lang.CharSequence r0 = r0.s
            return r0
    }

    public int getErrorCurrentTextColors() {
            r1 = this;
            zo r0 = r1.j
            g5 r0 = r0.r
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getHelperText() {
            r2 = this;
            zo r0 = r2.j
            boolean r1 = r0.x
            if (r1 == 0) goto L9
            java.lang.CharSequence r0 = r0.w
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getHelperTextCurrentTextColor() {
            r1 = this;
            zo r0 = r1.j
            g5 r0 = r0.y
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.D
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final float getHintCollapsedTextHeight() {
            r1 = this;
            za r0 = r1.u0
            float r0 = r0.d()
            return r0
    }

    public final int getHintCurrentCollapsedTextColor() {
            r2 = this;
            za r0 = r2.u0
            android.content.res.ColorStateList r1 = r0.k
            int r0 = r0.e(r1)
            return r0
    }

    public android.content.res.ColorStateList getHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j0
            return r0
    }

    public defpackage.f60 getLengthCounter() {
            r1 = this;
            f60 r0 = r1.n
            return r0
    }

    public int getMaxEms() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public int getMinEms() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getPlaceholderText() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.r
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getPlaceholderTextAppearance() {
            r1 = this;
            int r0 = r1.v
            return r0
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.u
            return r0
    }

    public java.lang.CharSequence getPrefixText() {
            r1 = this;
            r40 r0 = r1.b
            java.lang.CharSequence r0 = r0.c
            return r0
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
            r1 = this;
            r40 r0 = r1.b
            g5 r0 = r0.b
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getPrefixTextView() {
            r1 = this;
            r40 r0 = r1.b
            g5 r0 = r0.b
            return r0
    }

    public defpackage.f30 getShapeAppearanceModel() {
            r1 = this;
            f30 r0 = r1.L
            return r0
    }

    public java.lang.CharSequence getStartIconContentDescription() {
            r1 = this;
            r40 r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
            r1 = this;
            r40 r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getStartIconMinSize() {
            r1 = this;
            r40 r0 = r1.b
            int r0 = r0.g
            return r0
    }

    public android.widget.ImageView.ScaleType getStartIconScaleType() {
            r1 = this;
            r40 r0 = r1.b
            android.widget.ImageView$ScaleType r0 = r0.h
            return r0
    }

    public java.lang.CharSequence getSuffixText() {
            r1 = this;
            ej r0 = r1.c
            java.lang.CharSequence r0 = r0.p
            return r0
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            ej r0 = r1.c
            g5 r0 = r0.q
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getSuffixTextView() {
            r1 = this;
            ej r0 = r1.c
            g5 r0 = r0.q
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.b0
            return r0
    }

    public final int h(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getSuffixText()
            if (r0 == 0) goto L10
            ej r3 = r1.c
            int r3 = r3.c()
        Le:
            int r2 = r2 - r3
            return r2
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getPrefixText()
            if (r3 == 0) goto L1f
            r40 r3 = r1.b
            int r3 = r3.a()
            goto Le
        L1f:
            android.widget.EditText r3 = r1.d
            int r3 = r3.getCompoundPaddingRight()
            goto Le
    }

    public final void i() {
            r8 = this;
            int r0 = r8.O
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L74
            if (r0 == r2) goto L5c
            if (r0 != r1) goto L43
            boolean r0 = r8.C
            if (r0 == 0) goto L35
            eu r0 = r8.F
            boolean r0 = r0 instanceof defpackage.bf
            if (r0 != 0) goto L35
            f30 r0 = r8.L
            int r4 = defpackage.bf.y
            af r4 = new af
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            f30 r0 = new f30
            r0.<init>()
        L23:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            bf r0 = new bf
            r0.<init>(r4)
            r0.x = r4
            r8.F = r0
            goto L3e
        L35:
            eu r0 = new eu
            f30 r4 = r8.L
            r0.<init>(r4)
            r8.F = r0
        L3e:
            r8.J = r3
            r8.K = r3
            goto L7a
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.O
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            eu r0 = new eu
            f30 r3 = r8.L
            r0.<init>(r3)
            r8.F = r0
            eu r0 = new eu
            r0.<init>()
            r8.J = r0
            eu r0 = new eu
            r0.<init>()
            r8.K = r0
            goto L7a
        L74:
            r8.F = r3
            r8.J = r3
            r8.K = r3
        L7a:
            r8.s()
            r8.x()
            int r0 = r8.O
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto Lbd
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto La6
            android.content.res.Resources r0 = r8.getResources()
            r4 = 2131165750(0x7f070236, float:1.7945726E38)
            int r0 = r0.getDimensionPixelSize(r4)
            r8.P = r0
            goto Lbd
        La6:
            android.content.Context r0 = r8.getContext()
            boolean r0 = defpackage.ct.s(r0)
            if (r0 == 0) goto Lbd
            android.content.res.Resources r0 = r8.getResources()
            r4 = 2131165749(0x7f070235, float:1.7945724E38)
            int r0 = r0.getDimensionPixelSize(r4)
            r8.P = r0
        Lbd:
            android.widget.EditText r0 = r8.d
            if (r0 == 0) goto L131
            int r0 = r8.O
            if (r0 == r2) goto Lc6
            goto L131
        Lc6:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L100
            android.widget.EditText r0 = r8.d
            java.util.WeakHashMap r3 = defpackage.ja0.a
            int r3 = defpackage.t90.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131165748(0x7f070234, float:1.7945722E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.d
            int r5 = defpackage.t90.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131165747(0x7f070233, float:1.794572E38)
            int r6 = r6.getDimensionPixelSize(r7)
            defpackage.t90.k(r0, r3, r4, r5, r6)
            goto L131
        L100:
            android.content.Context r0 = r8.getContext()
            boolean r0 = defpackage.ct.s(r0)
            if (r0 == 0) goto L131
            android.widget.EditText r0 = r8.d
            java.util.WeakHashMap r3 = defpackage.ja0.a
            int r3 = defpackage.t90.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131165746(0x7f070232, float:1.7945718E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.d
            int r5 = defpackage.t90.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131165745(0x7f070231, float:1.7945716E38)
            int r6 = r6.getDimensionPixelSize(r7)
            defpackage.t90.k(r0, r3, r4, r5, r6)
        L131:
            int r0 = r8.O
            if (r0 == 0) goto L138
            r8.t()
        L138:
            android.widget.EditText r0 = r8.d
            boolean r3 = r0 instanceof android.widget.AutoCompleteTextView
            if (r3 != 0) goto L13f
            goto L15c
        L13f:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r3 = r0.getDropDownBackground()
            if (r3 != 0) goto L15c
            int r3 = r8.O
            if (r3 != r1) goto L153
            android.graphics.drawable.Drawable r1 = r8.getOrCreateOutlinedDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
            return
        L153:
            if (r3 != r2) goto L15c
            android.graphics.drawable.Drawable r1 = r8.getOrCreateFilledDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
        L15c:
            return
    }

    public final void j() {
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L8
            goto Lf0
        L8:
            android.widget.EditText r0 = r12.d
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.d
            int r1 = r1.getGravity()
            za r2 = r12.u0
            java.lang.CharSequence r3 = r2.A
            boolean r3 = r2.b(r3)
            r2.C = r3
            android.graphics.Rect r4 = r2.d
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            r7 = 5
            r8 = 8388613(0x800005, float:1.175495E-38)
            r9 = 17
            if (r1 == r9) goto L51
            r10 = r1 & 7
            if (r10 != r6) goto L30
            goto L51
        L30:
            r10 = r1 & r8
            if (r10 == r8) goto L46
            r10 = r1 & 5
            if (r10 != r7) goto L39
            goto L46
        L39:
            if (r3 == 0) goto L42
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.Z
        L40:
            float r3 = r3 - r10
            goto L57
        L42:
            int r3 = r4.left
        L44:
            float r3 = (float) r3
            goto L57
        L46:
            if (r3 == 0) goto L4b
            int r3 = r4.left
            goto L44
        L4b:
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.Z
            goto L40
        L51:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.Z
            float r10 = r10 / r5
            goto L40
        L57:
            int r10 = r4.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.a0
            r10.left = r3
            int r11 = r4.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r9) goto L8d
            r9 = r1 & 7
            if (r9 != r6) goto L6e
            goto L8d
        L6e:
            r0 = r1 & r8
            if (r0 == r8) goto L83
            r0 = r1 & 5
            if (r0 != r7) goto L77
            goto L83
        L77:
            boolean r0 = r2.C
            if (r0 == 0) goto L7f
            int r0 = r4.right
        L7d:
            float r0 = (float) r0
            goto L93
        L7f:
            float r0 = r2.Z
        L81:
            float r0 = r0 + r3
            goto L93
        L83:
            boolean r0 = r2.C
            if (r0 == 0) goto L8a
            float r0 = r2.Z
            goto L81
        L8a:
            int r0 = r4.right
            goto L7d
        L8d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L93:
            int r1 = r4.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r4.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb8
            goto Lf0
        Lb8:
            float r0 = r10.left
            int r1 = r12.N
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.Q
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            eu r0 = r12.F
            bf r0 = (defpackage.bf) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        Lf0:
            return
    }

    public final void l(defpackage.g5 r2, int r3) {
            r1 = this;
            r2.setTextAppearance(r3)     // Catch: java.lang.Exception -> L12
            android.content.res.ColorStateList r3 = r2.getTextColors()     // Catch: java.lang.Exception -> L12
            int r3 = r3.getDefaultColor()     // Catch: java.lang.Exception -> L12
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            if (r3 != r0) goto L11
            goto L12
        L11:
            return
        L12:
            r3 = 2131820951(0x7f110197, float:1.9274631E38)
            r2.setTextAppearance(r3)
            android.content.Context r3 = r1.getContext()
            r0 = 2131099721(0x7f060049, float:1.7811803E38)
            int r3 = defpackage.hd.a(r3, r0)
            r2.setTextColor(r3)
            return
    }

    public final boolean m() {
            r3 = this;
            zo r0 = r3.j
            int r1 = r0.o
            r2 = 1
            if (r1 != r2) goto L14
            g5 r1 = r0.r
            if (r1 == 0) goto L14
            java.lang.CharSequence r0 = r0.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            return r2
        L14:
            r0 = 0
            return r0
    }

    public final void n(android.text.Editable r10) {
            r9 = this;
            f60 r0 = r9.n
            jb r0 = (defpackage.jb) r0
            r0.getClass()
            r0 = 0
            if (r10 == 0) goto Lf
            int r10 = r10.length()
            goto L10
        Lf:
            r10 = r0
        L10:
            boolean r1 = r9.m
            int r2 = r9.l
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L2a
            g5 r2 = r9.o
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.setText(r10)
            g5 r10 = r9.o
            r10.setContentDescription(r4)
            r9.m = r0
            goto La0
        L2a:
            r3 = 1
            if (r10 <= r2) goto L2f
            r2 = r3
            goto L30
        L2f:
            r2 = r0
        L30:
            r9.m = r2
            android.content.Context r2 = r9.getContext()
            g5 r5 = r9.o
            int r6 = r9.l
            boolean r7 = r9.m
            if (r7 == 0) goto L42
            r7 = 2131755045(0x7f100025, float:1.9140958E38)
            goto L45
        L42:
            r7 = 2131755044(0x7f100024, float:1.9140956E38)
        L45:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r2 = r2.getString(r7, r6)
            r5.setContentDescription(r2)
            boolean r2 = r9.m
            if (r1 == r2) goto L5f
            r9.o()
        L5f:
            java.lang.String r2 = defpackage.m7.b
            java.util.Locale r2 = java.util.Locale.getDefault()
            int r5 = defpackage.i60.a
            int r2 = defpackage.h60.a(r2)
            if (r2 != r3) goto L70
            m7 r2 = defpackage.m7.e
            goto L72
        L70:
            m7 r2 = defpackage.m7.d
        L72:
            g5 r3 = r9.o
            android.content.Context r5 = r9.getContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r6 = r9.l
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r6}
            r6 = 2131755046(0x7f100026, float:1.914096E38)
            java.lang.String r10 = r5.getString(r6, r10)
            r2.getClass()
            r7 r5 = defpackage.b60.a
            if (r10 != 0) goto L95
            goto L9d
        L95:
            android.text.SpannableStringBuilder r10 = r2.c(r10)
            java.lang.String r4 = r10.toString()
        L9d:
            r3.setText(r4)
        La0:
            android.widget.EditText r10 = r9.d
            if (r10 == 0) goto Lb1
            boolean r10 = r9.m
            if (r1 == r10) goto Lb1
            r9.u(r0, r0)
            r9.x()
            r9.r()
        Lb1:
            return
    }

    public final void o() {
            r2 = this;
            g5 r0 = r2.o
            if (r0 == 0) goto L2a
            boolean r1 = r2.m
            if (r1 == 0) goto Lb
            int r1 = r2.p
            goto Ld
        Lb:
            int r1 = r2.q
        Ld:
            r2.l(r0, r1)
            boolean r0 = r2.m
            if (r0 != 0) goto L1d
            android.content.res.ColorStateList r0 = r2.y
            if (r0 == 0) goto L1d
            g5 r1 = r2.o
            r1.setTextColor(r0)
        L1d:
            boolean r0 = r2.m
            if (r0 == 0) goto L2a
            android.content.res.ColorStateList r0 = r2.z
            if (r0 == 0) goto L2a
            g5 r1 = r2.o
            r1.setTextColor(r0)
        L2a:
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            za r0 = r1.u0
            r0.g(r2)
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r3 = this;
            ej r0 = r3.c
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r3)
            r1 = 0
            r3.A0 = r1
            android.widget.EditText r2 = r3.d
            if (r2 != 0) goto L11
            goto L2d
        L11:
            int r0 = r0.getMeasuredHeight()
            r40 r2 = r3.b
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.d
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L2d
            android.widget.EditText r1 = r3.d
            r1.setMinimumHeight(r0)
            r1 = 1
        L2d:
            boolean r0 = r3.q()
            if (r1 != 0) goto L37
            if (r0 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            android.widget.EditText r0 = r3.d
            p1 r1 = new p1
            r2 = 13
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            r8 = r7
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L1e2
            java.lang.ThreadLocal r10 = defpackage.kg.a
            int r10 = r9.getWidth()
            int r11 = r9.getHeight()
            android.graphics.Rect r12 = r8.V
            r0 = 0
            r12.set(r0, r0, r10, r11)
            java.lang.ThreadLocal r10 = defpackage.kg.a
            java.lang.Object r11 = r10.get()
            android.graphics.Matrix r11 = (android.graphics.Matrix) r11
            if (r11 != 0) goto L2b
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            r10.set(r11)
            goto L2e
        L2b:
            r11.reset()
        L2e:
            defpackage.kg.a(r7, r9, r11)
            java.lang.ThreadLocal r9 = defpackage.kg.b
            java.lang.Object r10 = r9.get()
            android.graphics.RectF r10 = (android.graphics.RectF) r10
            if (r10 != 0) goto L43
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            r9.set(r10)
        L43:
            r10.set(r12)
            r11.mapRect(r10)
            float r9 = r10.left
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            float r1 = r10.top
            float r1 = r1 + r11
            int r1 = (int) r1
            float r2 = r10.right
            float r2 = r2 + r11
            int r2 = (int) r2
            float r10 = r10.bottom
            float r10 = r10 + r11
            int r10 = (int) r10
            r12.set(r9, r1, r2, r10)
            eu r9 = r8.J
            if (r9 == 0) goto L6f
            int r10 = r12.bottom
            int r11 = r8.R
            int r11 = r10 - r11
            int r1 = r12.left
            int r2 = r12.right
            r9.setBounds(r1, r11, r2, r10)
        L6f:
            eu r9 = r8.K
            if (r9 == 0) goto L80
            int r10 = r12.bottom
            int r11 = r8.S
            int r11 = r10 - r11
            int r1 = r12.left
            int r2 = r12.right
            r9.setBounds(r1, r11, r2, r10)
        L80:
            boolean r9 = r8.C
            if (r9 == 0) goto L1e2
            android.widget.EditText r9 = r8.d
            float r9 = r9.getTextSize()
            za r10 = r8.u0
            float r11 = r10.h
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L97
            r10.h = r9
            r10.h(r0)
        L97:
            android.widget.EditText r9 = r8.d
            int r9 = r9.getGravity()
            r11 = r9 & (-113(0xffffffffffffff8f, float:NaN))
            r11 = r11 | 48
            int r1 = r10.g
            if (r1 == r11) goto Laa
            r10.g = r11
            r10.h(r0)
        Laa:
            int r11 = r10.f
            if (r11 == r9) goto Lb3
            r10.f = r9
            r10.h(r0)
        Lb3:
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L1dc
            boolean r9 = defpackage.gt.n(r7)
            int r11 = r12.bottom
            android.graphics.Rect r1 = r8.W
            r1.bottom = r11
            int r11 = r8.O
            r2 = 1
            if (r11 == r2) goto L100
            r3 = 2
            if (r11 == r3) goto Le0
            int r11 = r12.left
            int r11 = r7.g(r11, r9)
            r1.left = r11
            int r11 = r7.getPaddingTop()
            r1.top = r11
            int r11 = r12.right
            int r9 = r7.h(r11, r9)
            r1.right = r9
            goto L117
        Le0:
            int r9 = r12.left
            android.widget.EditText r11 = r8.d
            int r11 = r11.getPaddingLeft()
            int r11 = r11 + r9
            r1.left = r11
            int r9 = r12.top
            int r11 = r7.c()
            int r9 = r9 - r11
            r1.top = r9
            int r9 = r12.right
            android.widget.EditText r11 = r8.d
            int r11 = r11.getPaddingRight()
            int r9 = r9 - r11
            r1.right = r9
            goto L117
        L100:
            int r11 = r12.left
            int r11 = r7.g(r11, r9)
            r1.left = r11
            int r11 = r12.top
            int r3 = r8.P
            int r11 = r11 + r3
            r1.top = r11
            int r11 = r12.right
            int r9 = r7.h(r11, r9)
            r1.right = r9
        L117:
            int r9 = r1.left
            int r11 = r1.top
            int r3 = r1.right
            int r4 = r1.bottom
            android.graphics.Rect r5 = r10.d
            int r6 = r5.left
            if (r6 != r9) goto L132
            int r6 = r5.top
            if (r6 != r11) goto L132
            int r6 = r5.right
            if (r6 != r3) goto L132
            int r6 = r5.bottom
            if (r6 != r4) goto L132
            goto L137
        L132:
            r5.set(r9, r11, r3, r4)
            r10.M = r2
        L137:
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L1d6
            android.text.TextPaint r9 = r10.O
            float r11 = r10.h
            r9.setTextSize(r11)
            android.graphics.Typeface r11 = r10.u
            r9.setTypeface(r11)
            float r11 = r10.W
            r9.setLetterSpacing(r11)
            float r9 = r9.ascent()
            float r9 = -r9
            int r11 = r12.left
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingLeft()
            int r3 = r3 + r11
            r1.left = r3
            int r11 = r8.O
            if (r11 != r2) goto L174
            android.widget.EditText r11 = r8.d
            int r11 = r11.getMinLines()
            if (r11 > r2) goto L174
            int r11 = r12.centerY()
            float r11 = (float) r11
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r9 / r3
            float r11 = r11 - r3
            int r11 = (int) r11
            goto L17d
        L174:
            int r11 = r12.top
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingTop()
            int r11 = r11 + r3
        L17d:
            r1.top = r11
            int r11 = r12.right
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingRight()
            int r11 = r11 - r3
            r1.right = r11
            int r11 = r8.O
            if (r11 != r2) goto L19c
            android.widget.EditText r11 = r8.d
            int r11 = r11.getMinLines()
            if (r11 > r2) goto L19c
            int r11 = r1.top
            float r11 = (float) r11
            float r11 = r11 + r9
            int r9 = (int) r11
            goto L1a5
        L19c:
            int r9 = r12.bottom
            android.widget.EditText r11 = r8.d
            int r11 = r11.getCompoundPaddingBottom()
            int r9 = r9 - r11
        L1a5:
            r1.bottom = r9
            int r11 = r1.left
            int r12 = r1.top
            int r1 = r1.right
            android.graphics.Rect r3 = r10.c
            int r4 = r3.left
            if (r4 != r11) goto L1c0
            int r4 = r3.top
            if (r4 != r12) goto L1c0
            int r4 = r3.right
            if (r4 != r1) goto L1c0
            int r4 = r3.bottom
            if (r4 != r9) goto L1c0
            goto L1c5
        L1c0:
            r3.set(r11, r12, r1, r9)
            r10.M = r2
        L1c5:
            r10.h(r0)
            boolean r9 = r7.e()
            if (r9 == 0) goto L1e2
            boolean r9 = r8.t0
            if (r9 != 0) goto L1e2
            r7.j()
            return
        L1d6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L1dc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L1e2:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r5 = r4.A0
            ej r6 = r4.c
            if (r5 != 0) goto L13
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            r5.addOnGlobalLayoutListener(r4)
            r5 = 1
            r4.A0 = r5
        L13:
            g5 r5 = r4.t
            if (r5 == 0) goto L41
            android.widget.EditText r5 = r4.d
            if (r5 == 0) goto L41
            int r5 = r5.getGravity()
            g5 r0 = r4.t
            r0.setGravity(r5)
            g5 r5 = r4.t
            android.widget.EditText r0 = r4.d
            int r0 = r0.getCompoundPaddingLeft()
            android.widget.EditText r1 = r4.d
            int r1 = r1.getCompoundPaddingTop()
            android.widget.EditText r2 = r4.d
            int r2 = r2.getCompoundPaddingRight()
            android.widget.EditText r3 = r4.d
            int r3 = r3.getCompoundPaddingBottom()
            r5.setPadding(r0, r1, r2, r3)
        L41:
            r6.m()
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.g60
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            g60 r2 = (defpackage.g60) r2
            android.os.Parcelable r0 = r2.a
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r2.c
            r1.setError(r0)
            boolean r2 = r2.d
            if (r2 == 0) goto L22
            y6 r2 = new y6
            r0 = 10
            r2.<init>(r0, r1)
            r1.post(r2)
        L22:
            r1.requestLayout()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
            r13 = this;
            super.onRtlPropertiesChanged(r14)
            r0 = 1
            if (r14 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r14 = r13.M
            if (r0 == r14) goto L86
            f30 r14 = r13.L
            de r14 = r14.e
            android.graphics.RectF r1 = r13.a0
            float r14 = r14.a(r1)
            f30 r2 = r13.L
            de r2 = r2.f
            float r2 = r2.a(r1)
            f30 r3 = r13.L
            de r3 = r3.h
            float r3 = r3.a(r1)
            f30 r4 = r13.L
            de r4 = r4.g
            float r1 = r4.a(r1)
            f30 r4 = r13.L
            ip r5 = r4.a
            ip r6 = r4.b
            ip r7 = r4.d
            ip r4 = r4.c
            vh r8 = new vh
            r9 = 0
            r8.<init>(r9)
            vh r9 = new vh
            r10 = 0
            r9.<init>(r10)
            vh r10 = new vh
            r11 = 0
            r10.<init>(r11)
            vh r11 = new vh
            r12 = 0
            r11.<init>(r12)
            e r12 = new e
            r12.<init>(r2)
            e r2 = new e
            r2.<init>(r14)
            e r14 = new e
            r14.<init>(r1)
            e r1 = new e
            r1.<init>(r3)
            f30 r3 = new f30
            r3.<init>()
            r3.a = r6
            r3.b = r5
            r3.c = r7
            r3.d = r4
            r3.e = r12
            r3.f = r2
            r3.g = r1
            r3.h = r14
            r3.i = r8
            r3.j = r9
            r3.k = r10
            r3.l = r11
            r13.M = r0
            r13.setShapeAppearanceModel(r3)
        L86:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            g60 r1 = new g60
            r1.<init>(r0)
            boolean r0 = r3.m()
            if (r0 == 0) goto L15
            java.lang.CharSequence r0 = r3.getError()
            r1.c = r0
        L15:
            ej r0 = r3.c
            int r2 = r0.i
            if (r2 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            boolean r0 = r0.d
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r1.d = r0
            return r1
    }

    public final void p() {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.A
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968800(0x7f0400e0, float:1.7546264E38)
            android.util.TypedValue r1 = defpackage.gt.y(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = defpackage.ip.v(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = defpackage.f0.e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.d
            android.graphics.drawable.Drawable r1 = defpackage.f0.e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L49
            g5 r2 = r4.o
            if (r2 == 0) goto L4e
            boolean r2 = r4.m
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.B
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            defpackage.ch.h(r1, r0)
        L51:
            return
    }

    public final boolean q() {
            r10 = this;
            android.widget.EditText r0 = r10.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L20
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L5f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5f
        L20:
            r40 r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L5f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.c0
            if (r6 == 0) goto L3b
            int r6 = r10.d0
            if (r6 == r0) goto L47
        L3b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.c0 = r6
            r10.d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L47:
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = defpackage.k60.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.c0
            if (r6 == r7) goto L78
            android.widget.EditText r6 = r10.d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            defpackage.k60.e(r6, r7, r8, r9, r0)
            goto L76
        L5f:
            android.graphics.drawable.ColorDrawable r0 = r10.c0
            if (r0 == 0) goto L78
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = defpackage.k60.a(r0)
            android.widget.EditText r6 = r10.d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            defpackage.k60.e(r6, r2, r7, r8, r0)
            r10.c0 = r2
        L76:
            r0 = r5
            goto L79
        L78:
            r0 = r1
        L79:
            ej r6 = r10.c
            boolean r7 = r6.e()
            if (r7 != 0) goto L8f
            int r7 = r6.i
            if (r7 == 0) goto L8b
            boolean r7 = r6.d()
            if (r7 != 0) goto L8f
        L8b:
            java.lang.CharSequence r7 = r6.p
            if (r7 == 0) goto L10d
        L8f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L10d
            g5 r7 = r6.q
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.d
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto Lab
            com.google.android.material.internal.CheckableImageButton r2 = r6.c
            goto Lb7
        Lab:
            int r8 = r6.i
            if (r8 == 0) goto Lb7
            boolean r8 = r6.d()
            if (r8 == 0) goto Lb7
            com.google.android.material.internal.CheckableImageButton r2 = r6.g
        Lb7:
            if (r2 == 0) goto Lca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = defpackage.et.c(r2)
            int r7 = r2 + r6
        Lca:
            android.widget.EditText r2 = r10.d
            android.graphics.drawable.Drawable[] r2 = defpackage.k60.a(r2)
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r6 == 0) goto Leb
            int r8 = r10.g0
            if (r8 == r7) goto Leb
            r10.g0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            r2 = r2[r4]
            defpackage.k60.e(r0, r1, r3, r6, r2)
            return r5
        Leb:
            if (r6 != 0) goto Lf9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f0 = r6
            r10.g0 = r7
            r6.setBounds(r1, r1, r7, r5)
        Lf9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r3 == r6) goto L12f
            r10.h0 = r3
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            defpackage.k60.e(r0, r1, r3, r6, r2)
            return r5
        L10d:
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r6 == 0) goto L12f
            android.widget.EditText r6 = r10.d
            android.graphics.drawable.Drawable[] r6 = defpackage.k60.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f0
            if (r3 != r7) goto L12b
            android.widget.EditText r0 = r10.d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.h0
            r4 = r6[r4]
            defpackage.k60.e(r0, r1, r3, r7, r4)
            goto L12c
        L12b:
            r5 = r0
        L12c:
            r10.f0 = r2
            return r5
        L12f:
            return r0
    }

    public final void r() {
            r3 = this;
            android.widget.EditText r0 = r3.d
            if (r0 == 0) goto L48
            int r1 = r3.O
            if (r1 == 0) goto L9
            goto L48
        L9:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L10
            goto L48
        L10:
            int[] r1 = defpackage.eh.a
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r3.m()
            if (r1 == 0) goto L2a
            int r1 = r3.getErrorCurrentTextColors()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = defpackage.u3.c(r1, r2)
            r0.setColorFilter(r1)
            return
        L2a:
            boolean r1 = r3.m
            if (r1 == 0) goto L40
            g5 r1 = r3.o
            if (r1 == 0) goto L40
            int r1 = r1.getCurrentTextColor()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = defpackage.u3.c(r1, r2)
            r0.setColorFilter(r1)
            return
        L40:
            r0.clearColorFilter()
            android.widget.EditText r0 = r3.d
            r0.refreshDrawableState()
        L48:
            return
    }

    public final void s() {
            r3 = this;
            android.widget.EditText r0 = r3.d
            if (r0 == 0) goto L25
            eu r1 = r3.F
            if (r1 == 0) goto L25
            boolean r1 = r3.I
            if (r1 != 0) goto L12
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L25
        L12:
            int r0 = r3.O
            if (r0 != 0) goto L17
            goto L25
        L17:
            android.graphics.drawable.Drawable r0 = r3.getEditTextBoxBackground()
            android.widget.EditText r1 = r3.d
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.s90.q(r1, r0)
            r0 = 1
            r3.I = r0
        L25:
            return
    }

    public void setBoxBackgroundColor(int r2) {
            r1 = this;
            int r0 = r1.U
            if (r0 == r2) goto Lf
            r1.U = r2
            r1.o0 = r2
            r1.q0 = r2
            r1.r0 = r2
            r1.b()
        Lf:
            return
    }

    public void setBoxBackgroundColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = defpackage.hd.a(r0, r2)
            r1.setBoxBackgroundColor(r2)
            return
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            int r0 = r4.getDefaultColor()
            r3.o0 = r0
            r3.U = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.p0 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.q0 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.r0 = r4
            r3.b()
            return
    }

    public void setBoxBackgroundMode(int r2) {
            r1 = this;
            int r0 = r1.O
            if (r2 != r0) goto L5
            goto Le
        L5:
            r1.O = r2
            android.widget.EditText r2 = r1.d
            if (r2 == 0) goto Le
            r1.i()
        Le:
            return
    }

    public void setBoxCollapsedPaddingTop(int r1) {
            r0 = this;
            r0.P = r1
            return
    }

    public void setBoxCornerFamily(int r4) {
            r3 = this;
            f30 r0 = r3.L
            e30 r0 = r0.e()
            f30 r1 = r3.L
            de r1 = r1.e
            ip r2 = defpackage.gt.h(r4)
            r0.a = r2
            r0.e = r1
            f30 r1 = r3.L
            de r1 = r1.f
            ip r2 = defpackage.gt.h(r4)
            r0.b = r2
            r0.f = r1
            f30 r1 = r3.L
            de r1 = r1.h
            ip r2 = defpackage.gt.h(r4)
            r0.d = r2
            r0.h = r1
            f30 r1 = r3.L
            de r1 = r1.g
            ip r4 = defpackage.gt.h(r4)
            r0.c = r4
            r0.g = r1
            f30 r4 = r0.a()
            r3.L = r4
            r3.b()
            return
    }

    public void setBoxStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.m0
            if (r0 == r2) goto L9
            r1.m0 = r2
            r1.x()
        L9:
            return
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r4.isStateful()
            if (r0 == 0) goto L38
            int r0 = r4.getDefaultColor()
            r3.k0 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.s0 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.l0 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.m0 = r4
            goto L46
        L38:
            int r0 = r3.m0
            int r1 = r4.getDefaultColor()
            if (r0 == r1) goto L46
            int r4 = r4.getDefaultColor()
            r3.m0 = r4
        L46:
            r3.x()
            return
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            if (r0 == r2) goto L9
            r1.n0 = r2
            r1.x()
        L9:
            return
    }

    public void setBoxStrokeWidth(int r1) {
            r0 = this;
            r0.R = r1
            r0.x()
            return
    }

    public void setBoxStrokeWidthFocused(int r1) {
            r0 = this;
            r0.S = r1
            r0.x()
            return
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidthFocused(r2)
            return
    }

    public void setBoxStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidth(r2)
            return
    }

    public void setCounterEnabled(boolean r6) {
            r5 = this;
            boolean r0 = r5.k
            if (r0 == r6) goto L62
            r0 = 2
            zo r1 = r5.j
            r2 = 0
            if (r6 == 0) goto L59
            g5 r3 = new g5
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            r5.o = r3
            r4 = 2131296664(0x7f090198, float:1.8211251E38)
            r3.setId(r4)
            android.graphics.Typeface r3 = r5.b0
            if (r3 == 0) goto L24
            g5 r4 = r5.o
            r4.setTypeface(r3)
        L24:
            g5 r3 = r5.o
            r4 = 1
            r3.setMaxLines(r4)
            g5 r3 = r5.o
            r1.a(r3, r0)
            g5 r0 = r5.o
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.res.Resources r1 = r5.getResources()
            r3 = 2131165946(0x7f0702fa, float:1.7946123E38)
            int r1 = r1.getDimensionPixelOffset(r3)
            defpackage.et.h(r0, r1)
            r5.o()
            g5 r0 = r5.o
            if (r0 == 0) goto L60
            android.widget.EditText r0 = r5.d
            if (r0 != 0) goto L51
            goto L55
        L51:
            android.text.Editable r2 = r0.getText()
        L55:
            r5.n(r2)
            goto L60
        L59:
            g5 r3 = r5.o
            r1.g(r3, r0)
            r5.o = r2
        L60:
            r5.k = r6
        L62:
            return
    }

    public void setCounterMaxLength(int r2) {
            r1 = this;
            int r0 = r1.l
            if (r0 == r2) goto L21
            if (r2 <= 0) goto L9
            r1.l = r2
            goto Lc
        L9:
            r2 = -1
            r1.l = r2
        Lc:
            boolean r2 = r1.k
            if (r2 == 0) goto L21
            g5 r2 = r1.o
            if (r2 == 0) goto L21
            android.widget.EditText r2 = r1.d
            if (r2 != 0) goto L1a
            r2 = 0
            goto L1e
        L1a:
            android.text.Editable r2 = r2.getText()
        L1e:
            r1.n(r2)
        L21:
            return
    }

    public void setCounterOverflowTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.p
            if (r0 == r2) goto L9
            r1.p = r2
            r1.o()
        L9:
            return
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.z
            if (r0 == r2) goto L9
            r1.z = r2
            r1.o()
        L9:
            return
    }

    public void setCounterTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.q
            if (r0 == r2) goto L9
            r1.q = r2
            r1.o()
        L9:
            return
    }

    public void setCounterTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y
            if (r0 == r2) goto L9
            r1.y = r2
            r1.o()
        L9:
            return
    }

    public void setCursorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A
            if (r0 == r2) goto L9
            r1.A = r2
            r1.p()
        L9:
            return
    }

    public void setCursorErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B
            if (r0 == r2) goto L19
            r1.B = r2
            boolean r2 = r1.m()
            if (r2 != 0) goto L16
            g5 r2 = r1.o
            if (r2 == 0) goto L15
            boolean r2 = r1.m
            if (r2 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            r1.p()
        L19:
            return
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.i0 = r1
            r0.j0 = r1
            android.widget.EditText r1 = r0.d
            if (r1 == 0) goto Lc
            r1 = 0
            r0.u(r1, r1)
        Lc:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            k(r0, r1)
            super.setEnabled(r1)
            return
    }

    public void setEndIconActivated(boolean r2) {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setActivated(r2)
            return
    }

    public void setEndIconCheckable(boolean r2) {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setCheckable(r2)
            return
    }

    public void setEndIconContentDescription(int r3) {
            r2 = this;
            ej r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.res.Resources r1 = r0.getResources()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto L19
            r0.setContentDescription(r3)
        L19:
            return
    }

    public void setEndIconContentDescription(java.lang.CharSequence r3) {
            r2 = this;
            ej r0 = r2.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto Ld
            r0.setContentDescription(r3)
        Ld:
            return
    }

    public void setEndIconDrawable(int r5) {
            r4 = this;
            ej r0 = r4.c
            if (r5 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r5 = defpackage.ff.r(r1, r5)
            goto Le
        Ld:
            r5 = 0
        Le:
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            r2.setImageDrawable(r5)
            if (r5 == 0) goto L23
            android.content.res.ColorStateList r5 = r0.k
            android.graphics.PorterDuff$Mode r3 = r0.l
            defpackage.ff.a(r1, r2, r5, r3)
            android.content.res.ColorStateList r5 = r0.k
            defpackage.ff.K(r1, r2, r5)
        L23:
            return
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable r5) {
            r4 = this;
            ej r0 = r4.c
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            r2.setImageDrawable(r5)
            if (r5 == 0) goto L17
            android.content.res.ColorStateList r5 = r0.k
            android.graphics.PorterDuff$Mode r3 = r0.l
            defpackage.ff.a(r1, r2, r5, r3)
            android.content.res.ColorStateList r5 = r0.k
            defpackage.ff.K(r1, r2, r5)
        L17:
            return
    }

    public void setEndIconMinSize(int r3) {
            r2 = this;
            ej r0 = r2.c
            if (r3 < 0) goto L1b
            int r1 = r0.m
            if (r3 == r1) goto L1a
            r0.m = r3
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setMinimumWidth(r3)
            r1.setMinimumHeight(r3)
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setMinimumWidth(r3)
            r0.setMinimumHeight(r3)
        L1a:
            return
        L1b:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "endIconSize cannot be less than 0"
            r3.<init>(r0)
            throw r3
    }

    public void setEndIconMode(int r2) {
            r1 = this;
            ej r0 = r1.c
            r0.g(r2)
            return
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            ej r0 = r2.c
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            android.view.View$OnLongClickListener r0 = r0.o
            r1.setOnClickListener(r3)
            defpackage.ff.M(r1, r0)
            return
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            ej r0 = r1.c
            r0.o = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setOnLongClickListener(r2)
            defpackage.ff.M(r0, r2)
            return
    }

    public void setEndIconScaleType(android.widget.ImageView.ScaleType r3) {
            r2 = this;
            ej r0 = r2.c
            r0.n = r3
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setScaleType(r3)
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setScaleType(r3)
            return
    }

    public void setEndIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            ej r0 = r3.c
            android.content.res.ColorStateList r1 = r0.k
            if (r1 == r4) goto L11
            r0.k = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            android.graphics.PorterDuff$Mode r0 = r0.l
            defpackage.ff.a(r1, r2, r4, r0)
        L11:
            return
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            ej r0 = r3.c
            android.graphics.PorterDuff$Mode r1 = r0.l
            if (r1 == r4) goto L11
            r0.l = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            android.content.res.ColorStateList r0 = r0.k
            defpackage.ff.a(r1, r2, r0, r4)
        L11:
            return
    }

    public void setEndIconVisible(boolean r2) {
            r1 = this;
            ej r0 = r1.c
            r0.h(r2)
            return
    }

    public void setError(java.lang.CharSequence r5) {
            r4 = this;
            zo r0 = r4.j
            boolean r1 = r0.q
            r2 = 1
            if (r1 != 0) goto L11
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Le
            return
        Le:
            r4.setErrorEnabled(r2)
        L11:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L33
            r0.c()
            r0.p = r5
            g5 r1 = r0.r
            r1.setText(r5)
            int r1 = r0.n
            if (r1 == r2) goto L27
            r0.o = r2
        L27:
            int r2 = r0.o
            g5 r3 = r0.r
            boolean r5 = r0.h(r3, r5)
            r0.i(r1, r2, r5)
            return
        L33:
            r0.f()
            return
    }

    public void setErrorAccessibilityLiveRegion(int r3) {
            r2 = this;
            zo r0 = r2.j
            r0.t = r3
            g5 r0 = r0.r
            if (r0 == 0) goto Ld
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.v90.f(r0, r3)
        Ld:
            return
    }

    public void setErrorContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            zo r0 = r1.j
            r0.s = r2
            g5 r0 = r0.r
            if (r0 == 0) goto Lb
            r0.setContentDescription(r2)
        Lb:
            return
    }

    public void setErrorEnabled(boolean r6) {
            r5 = this;
            zo r0 = r5.j
            com.google.android.material.textfield.TextInputLayout r1 = r0.h
            boolean r2 = r0.q
            if (r2 != r6) goto L9
            return
        L9:
            r0.c()
            r2 = 0
            r3 = 0
            if (r6 == 0) goto L6c
            g5 r1 = new g5
            android.content.Context r4 = r0.g
            r1.<init>(r4, r3)
            r0.r = r1
            r3 = 2131296665(0x7f090199, float:1.8211253E38)
            r1.setId(r3)
            g5 r1 = r0.r
            r3 = 5
            r1.setTextAlignment(r3)
            android.graphics.Typeface r1 = r0.B
            if (r1 == 0) goto L2e
            g5 r3 = r0.r
            r3.setTypeface(r1)
        L2e:
            int r1 = r0.u
            r0.u = r1
            g5 r3 = r0.r
            if (r3 == 0) goto L3b
            com.google.android.material.textfield.TextInputLayout r4 = r0.h
            r4.l(r3, r1)
        L3b:
            android.content.res.ColorStateList r1 = r0.v
            r0.v = r1
            g5 r3 = r0.r
            if (r3 == 0) goto L48
            if (r1 == 0) goto L48
            r3.setTextColor(r1)
        L48:
            java.lang.CharSequence r1 = r0.s
            r0.s = r1
            g5 r3 = r0.r
            if (r3 == 0) goto L53
            r3.setContentDescription(r1)
        L53:
            int r1 = r0.t
            r0.t = r1
            g5 r3 = r0.r
            if (r3 == 0) goto L60
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.v90.f(r3, r1)
        L60:
            g5 r1 = r0.r
            r3 = 4
            r1.setVisibility(r3)
            g5 r1 = r0.r
            r0.a(r1, r2)
            goto L7c
        L6c:
            r0.f()
            g5 r4 = r0.r
            r0.g(r4, r2)
            r0.r = r3
            r1.r()
            r1.x()
        L7c:
            r0.q = r6
            return
    }

    public void setErrorIconDrawable(int r3) {
            r2 = this;
            ej r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.i(r3)
            com.google.android.material.textfield.TextInputLayout r3 = r0.a
            com.google.android.material.internal.CheckableImageButton r1 = r0.c
            android.content.res.ColorStateList r0 = r0.d
            defpackage.ff.K(r3, r1, r0)
            return
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ej r0 = r1.c
            r0.i(r2)
            return
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            ej r0 = r2.c
            com.google.android.material.internal.CheckableImageButton r1 = r0.c
            android.view.View$OnLongClickListener r0 = r0.f
            r1.setOnClickListener(r3)
            defpackage.ff.M(r1, r0)
            return
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            ej r0 = r1.c
            r0.f = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setOnLongClickListener(r2)
            defpackage.ff.M(r0, r2)
            return
    }

    public void setErrorIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            ej r0 = r3.c
            android.content.res.ColorStateList r1 = r0.d
            if (r1 == r4) goto L11
            r0.d = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.c
            android.graphics.PorterDuff$Mode r0 = r0.e
            defpackage.ff.a(r1, r2, r4, r0)
        L11:
            return
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            ej r0 = r3.c
            android.graphics.PorterDuff$Mode r1 = r0.e
            if (r1 == r4) goto L11
            r0.e = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.c
            android.content.res.ColorStateList r0 = r0.d
            defpackage.ff.a(r1, r2, r0, r4)
        L11:
            return
    }

    public void setErrorTextAppearance(int r3) {
            r2 = this;
            zo r0 = r2.j
            r0.u = r3
            g5 r1 = r0.r
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = r0.h
            r0.l(r1, r3)
        Ld:
            return
    }

    public void setErrorTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            zo r0 = r1.j
            r0.v = r2
            g5 r0 = r0.r
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            r0.setTextColor(r2)
        Ld:
            return
    }

    public void setExpandedHintEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.v0
            if (r0 == r2) goto La
            r1.v0 = r2
            r2 = 0
            r1.u(r2, r2)
        La:
            return
    }

    public void setHelperText(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            zo r1 = r4.j
            if (r0 == 0) goto L11
            boolean r5 = r1.x
            if (r5 == 0) goto L10
            r5 = 0
            r4.setHelperTextEnabled(r5)
        L10:
            return
        L11:
            boolean r0 = r1.x
            if (r0 != 0) goto L19
            r0 = 1
            r4.setHelperTextEnabled(r0)
        L19:
            r1.c()
            r1.w = r5
            g5 r0 = r1.y
            r0.setText(r5)
            int r0 = r1.n
            r2 = 2
            if (r0 == r2) goto L2a
            r1.o = r2
        L2a:
            int r2 = r1.o
            g5 r3 = r1.y
            boolean r5 = r1.h(r3, r5)
            r1.i(r0, r2, r5)
            return
    }

    public void setHelperTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            zo r0 = r1.j
            r0.A = r2
            g5 r0 = r0.y
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            r0.setTextColor(r2)
        Ld:
            return
    }

    public void setHelperTextEnabled(boolean r9) {
            r8 = this;
            zo r0 = r8.j
            com.google.android.material.textfield.TextInputLayout r1 = r0.h
            boolean r2 = r0.x
            if (r2 != r9) goto L9
            return
        L9:
            r0.c()
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L61
            g5 r1 = new g5
            android.content.Context r4 = r0.g
            r1.<init>(r4, r2)
            r0.y = r1
            r2 = 2131296666(0x7f09019a, float:1.8211255E38)
            r1.setId(r2)
            g5 r1 = r0.y
            r2 = 5
            r1.setTextAlignment(r2)
            android.graphics.Typeface r1 = r0.B
            if (r1 == 0) goto L2e
            g5 r2 = r0.y
            r2.setTypeface(r1)
        L2e:
            g5 r1 = r0.y
            r2 = 4
            r1.setVisibility(r2)
            g5 r1 = r0.y
            defpackage.v90.f(r1, r3)
            int r1 = r0.z
            r0.z = r1
            g5 r2 = r0.y
            if (r2 == 0) goto L44
            r2.setTextAppearance(r1)
        L44:
            android.content.res.ColorStateList r1 = r0.A
            r0.A = r1
            g5 r2 = r0.y
            if (r2 == 0) goto L51
            if (r1 == 0) goto L51
            r2.setTextColor(r1)
        L51:
            g5 r1 = r0.y
            r0.a(r1, r3)
            g5 r1 = r0.y
            yo r2 = new yo
            r2.<init>(r0)
            r1.setAccessibilityDelegate(r2)
            goto L86
        L61:
            r0.c()
            int r4 = r0.n
            r5 = 2
            if (r4 != r5) goto L6c
            r5 = 0
            r0.o = r5
        L6c:
            int r5 = r0.o
            g5 r6 = r0.y
            java.lang.String r7 = ""
            boolean r6 = r0.h(r6, r7)
            r0.i(r4, r5, r6)
            g5 r4 = r0.y
            r0.g(r4, r3)
            r0.y = r2
            r1.r()
            r1.x()
        L86:
            r0.x = r9
            return
    }

    public void setHelperTextTextAppearance(int r2) {
            r1 = this;
            zo r0 = r1.j
            r0.z = r2
            g5 r0 = r0.y
            if (r0 == 0) goto Lb
            r0.setTextAppearance(r2)
        Lb:
            return
    }

    public void setHint(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setHint(r2)
            return
    }

    public void setHint(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto Lc
            r1.setHintInternal(r2)
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        Lc:
            return
    }

    public void setHintAnimationEnabled(boolean r1) {
            r0 = this;
            r0.w0 = r1
            return
    }

    public void setHintEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.C
            if (r3 == r0) goto L51
            r2.C = r3
            r0 = 0
            if (r3 != 0) goto L2b
            r3 = 0
            r2.E = r3
            java.lang.CharSequence r3 = r2.D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r3 = r3.getHint()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r1 = r2.D
            r3.setHint(r1)
        L27:
            r2.setHintInternal(r0)
            goto L4a
        L2b:
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r3 = r3.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            java.lang.CharSequence r1 = r2.D
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L42
            r2.setHint(r3)
        L42:
            android.widget.EditText r3 = r2.d
            r3.setHint(r0)
        L47:
            r3 = 1
            r2.E = r3
        L4a:
            android.widget.EditText r3 = r2.d
            if (r3 == 0) goto L51
            r2.t()
        L51:
            return
    }

    public void setHintTextAppearance(int r6) {
            r5 = this;
            a60 r0 = new a60
            za r1 = r5.u0
            com.google.android.material.textfield.TextInputLayout r2 = r1.a
            android.content.Context r3 = r2.getContext()
            r0.<init>(r3, r6)
            android.content.res.ColorStateList r6 = r0.j
            if (r6 == 0) goto L13
            r1.k = r6
        L13:
            float r6 = r0.k
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
            r1.i = r6
        L1c:
            android.content.res.ColorStateList r6 = r0.a
            if (r6 == 0) goto L22
            r1.U = r6
        L22:
            float r6 = r0.e
            r1.S = r6
            float r6 = r0.f
            r1.T = r6
            float r6 = r0.g
            r1.R = r6
            float r6 = r0.i
            r1.V = r6
            g8 r6 = r1.y
            if (r6 == 0) goto L39
            r3 = 1
            r6.c = r3
        L39:
            g8 r6 = new g8
            l0 r3 = new l0
            r4 = 6
            r3.<init>(r4, r1)
            r0.a()
            android.graphics.Typeface r4 = r0.n
            r6.<init>(r3, r4)
            r1.y = r6
            android.content.Context r6 = r2.getContext()
            g8 r2 = r1.y
            r0.c(r6, r2)
            r6 = 0
            r1.h(r6)
            android.content.res.ColorStateList r0 = r1.k
            r5.j0 = r0
            android.widget.EditText r0 = r5.d
            if (r0 == 0) goto L66
            r5.u(r6, r6)
            r5.t()
        L66:
            return
    }

    public void setHintTextColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.j0
            if (r0 == r4) goto L1d
            android.content.res.ColorStateList r0 = r3.i0
            r1 = 0
            if (r0 != 0) goto L14
            za r0 = r3.u0
            android.content.res.ColorStateList r2 = r0.k
            if (r2 == r4) goto L14
            r0.k = r4
            r0.h(r1)
        L14:
            r3.j0 = r4
            android.widget.EditText r4 = r3.d
            if (r4 == 0) goto L1d
            r3.u(r1, r1)
        L1d:
            return
    }

    public void setLengthCounter(defpackage.f60 r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setMaxEms(int r3) {
            r2 = this;
            r2.g = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxEms(r3)
        Lc:
            return
    }

    public void setMaxWidth(int r3) {
            r2 = this;
            r2.i = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxWidth(r3)
        Lc:
            return
    }

    public void setMaxWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMaxWidth(r2)
            return
    }

    public void setMinEms(int r3) {
            r2 = this;
            r2.f = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinEms(r3)
        Lc:
            return
    }

    public void setMinWidth(int r3) {
            r2 = this;
            r2.h = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinWidth(r3)
        Lc:
            return
    }

    public void setMinWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMinWidth(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r3) {
            r2 = this;
            ej r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.res.Resources r1 = r0.getResources()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setContentDescription(r3)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
            r2 = this;
            ej r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setImageDrawable(r3)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ej r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setImageDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r4) {
            r3 = this;
            ej r0 = r3.c
            if (r4 == 0) goto Ld
            int r1 = r0.i
            r2 = 1
            if (r1 == r2) goto Ld
            r0.g(r2)
            return
        Ld:
            if (r4 != 0) goto L14
            r4 = 0
            r0.g(r4)
            return
        L14:
            r0.getClass()
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            ej r0 = r3.c
            r0.k = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            android.graphics.PorterDuff$Mode r0 = r0.l
            defpackage.ff.a(r1, r2, r4, r0)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            ej r0 = r3.c
            r0.l = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.g
            android.content.res.ColorStateList r0 = r0.k
            defpackage.ff.a(r1, r2, r0, r4)
            return
    }

    public void setPlaceholderText(java.lang.CharSequence r5) {
            r4 = this;
            g5 r0 = r4.t
            r1 = 0
            if (r0 != 0) goto L36
            g5 r0 = new g5
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2, r1)
            r4.t = r0
            r2 = 2131296667(0x7f09019b, float:1.8211257E38)
            r0.setId(r2)
            g5 r0 = r4.t
            r2 = 2
            defpackage.s90.s(r0, r2)
            pj r0 = r4.d()
            r4.w = r0
            r2 = 67
            r0.b = r2
            pj r0 = r4.d()
            r4.x = r0
            int r0 = r4.v
            r4.setPlaceholderTextAppearance(r0)
            android.content.res.ColorStateList r0 = r4.u
            r4.setPlaceholderTextColor(r0)
        L36:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L41
            r5 = 0
            r4.setPlaceholderTextEnabled(r5)
            goto L4b
        L41:
            boolean r0 = r4.s
            if (r0 != 0) goto L49
            r0 = 1
            r4.setPlaceholderTextEnabled(r0)
        L49:
            r4.r = r5
        L4b:
            android.widget.EditText r5 = r4.d
            if (r5 != 0) goto L50
            goto L54
        L50:
            android.text.Editable r1 = r5.getText()
        L54:
            r4.v(r1)
            return
    }

    public void setPlaceholderTextAppearance(int r2) {
            r1 = this;
            r1.v = r2
            g5 r0 = r1.t
            if (r0 == 0) goto L9
            r0.setTextAppearance(r2)
        L9:
            return
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.u
            if (r0 == r2) goto Lf
            r1.u = r2
            g5 r0 = r1.t
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.setTextColor(r2)
        Lf:
            return
    }

    public void setPrefixText(java.lang.CharSequence r3) {
            r2 = this;
            r40 r0 = r2.b
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Ld
            r1 = 0
            goto Le
        Ld:
            r1 = r3
        Le:
            r0.c = r1
            g5 r1 = r0.b
            r1.setText(r3)
            r0.e()
            return
    }

    public void setPrefixTextAppearance(int r2) {
            r1 = this;
            r40 r0 = r1.b
            g5 r0 = r0.b
            r0.setTextAppearance(r2)
            return
    }

    public void setPrefixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r40 r0 = r1.b
            g5 r0 = r0.b
            r0.setTextColor(r2)
            return
    }

    public void setShapeAppearanceModel(defpackage.f30 r2) {
            r1 = this;
            eu r0 = r1.F
            if (r0 == 0) goto Lf
            du r0 = r0.a
            f30 r0 = r0.a
            if (r0 == r2) goto Lf
            r1.L = r2
            r1.b()
        Lf:
            return
    }

    public void setStartIconCheckable(boolean r2) {
            r1 = this;
            r40 r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setCheckable(r2)
            return
    }

    public void setStartIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconContentDescription(java.lang.CharSequence r3) {
            r2 = this;
            r40 r0 = r2.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto Ld
            r0.setContentDescription(r3)
        Ld:
            return
    }

    public void setStartIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconDrawable(r2)
            return
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r40 r0 = r1.b
            r0.b(r2)
            return
    }

    public void setStartIconMinSize(int r3) {
            r2 = this;
            r40 r0 = r2.b
            if (r3 < 0) goto L13
            int r1 = r0.g
            if (r3 == r1) goto L12
            r0.g = r3
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setMinimumWidth(r3)
            r0.setMinimumHeight(r3)
        L12:
            return
        L13:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "startIconSize cannot be less than 0"
            r3.<init>(r0)
            throw r3
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            r40 r0 = r2.b
            com.google.android.material.internal.CheckableImageButton r1 = r0.d
            android.view.View$OnLongClickListener r0 = r0.i
            r1.setOnClickListener(r3)
            defpackage.ff.M(r1, r0)
            return
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            r40 r0 = r1.b
            r0.i = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setOnLongClickListener(r2)
            defpackage.ff.M(r0, r2)
            return
    }

    public void setStartIconScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            r40 r0 = r1.b
            r0.h = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setScaleType(r2)
            return
    }

    public void setStartIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            r40 r0 = r3.b
            android.content.res.ColorStateList r1 = r0.e
            if (r1 == r4) goto L11
            r0.e = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.d
            android.graphics.PorterDuff$Mode r0 = r0.f
            defpackage.ff.a(r1, r2, r4, r0)
        L11:
            return
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            r40 r0 = r3.b
            android.graphics.PorterDuff$Mode r1 = r0.f
            if (r1 == r4) goto L11
            r0.f = r4
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            com.google.android.material.internal.CheckableImageButton r2 = r0.d
            android.content.res.ColorStateList r0 = r0.e
            defpackage.ff.a(r1, r2, r0, r4)
        L11:
            return
    }

    public void setStartIconVisible(boolean r2) {
            r1 = this;
            r40 r0 = r1.b
            r0.c(r2)
            return
    }

    public void setSuffixText(java.lang.CharSequence r3) {
            r2 = this;
            ej r0 = r2.c
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Ld
            r1 = 0
            goto Le
        Ld:
            r1 = r3
        Le:
            r0.p = r1
            g5 r1 = r0.q
            r1.setText(r3)
            r0.n()
            return
    }

    public void setSuffixTextAppearance(int r2) {
            r1 = this;
            ej r0 = r1.c
            g5 r0 = r0.q
            r0.setTextAppearance(r2)
            return
    }

    public void setSuffixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            ej r0 = r1.c
            g5 r0 = r0.q
            r0.setTextColor(r2)
            return
    }

    public void setTextInputAccessibilityDelegate(defpackage.e60 r2) {
            r1 = this;
            android.widget.EditText r0 = r1.d
            if (r0 == 0) goto L7
            defpackage.ja0.l(r0, r2)
        L7:
            return
    }

    public void setTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.graphics.Typeface r0 = r2.b0
            if (r3 == r0) goto L28
            r2.b0 = r3
            za r0 = r2.u0
            r0.m(r3)
            zo r0 = r2.j
            android.graphics.Typeface r1 = r0.B
            if (r3 == r1) goto L21
            r0.B = r3
            g5 r1 = r0.r
            if (r1 == 0) goto L1a
            r1.setTypeface(r3)
        L1a:
            g5 r0 = r0.y
            if (r0 == 0) goto L21
            r0.setTypeface(r3)
        L21:
            g5 r0 = r2.o
            if (r0 == 0) goto L28
            r0.setTypeface(r3)
        L28:
            return
    }

    public final void t() {
            r4 = this;
            int r0 = r4.O
            r1 = 1
            if (r0 == r1) goto L1a
            android.widget.FrameLayout r0 = r4.a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r4.c()
            int r3 = r1.topMargin
            if (r2 == r3) goto L1a
            r1.topMargin = r2
            r0.requestLayout()
        L1a:
            return
    }

    public final void u(boolean r10, boolean r11) {
            r9 = this;
            boolean r0 = r9.isEnabled()
            android.widget.EditText r1 = r9.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            android.widget.EditText r4 = r9.d
            if (r4 == 0) goto L23
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            android.content.res.ColorStateList r5 = r9.i0
            za r6 = r9.u0
            if (r5 == 0) goto L2d
            r6.i(r5)
        L2d:
            r5 = 0
            if (r0 != 0) goto L4c
            android.content.res.ColorStateList r0 = r9.i0
            if (r0 == 0) goto L42
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r7 = new int[]{r7}
            int r8 = r9.s0
            int r0 = r0.getColorForState(r7, r8)
            goto L44
        L42:
            int r0 = r9.s0
        L44:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.i(r0)
            goto L81
        L4c:
            boolean r0 = r9.m()
            if (r0 == 0) goto L62
            zo r0 = r9.j
            g5 r0 = r0.r
            if (r0 == 0) goto L5d
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L5e
        L5d:
            r0 = r5
        L5e:
            r6.i(r0)
            goto L81
        L62:
            boolean r0 = r9.m
            if (r0 == 0) goto L72
            g5 r0 = r9.o
            if (r0 == 0) goto L72
            android.content.res.ColorStateList r0 = r0.getTextColors()
            r6.i(r0)
            goto L81
        L72:
            if (r4 == 0) goto L81
            android.content.res.ColorStateList r0 = r9.j0
            if (r0 == 0) goto L81
            android.content.res.ColorStateList r7 = r6.k
            if (r7 == r0) goto L81
            r6.k = r0
            r6.h(r2)
        L81:
            ej r0 = r9.c
            r40 r7 = r9.b
            if (r1 != 0) goto Lfd
            boolean r1 = r9.v0
            if (r1 == 0) goto Lfd
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L94
            if (r4 == 0) goto L94
            goto Lfd
        L94:
            if (r11 != 0) goto L9a
            boolean r11 = r9.t0
            if (r11 != 0) goto L104
        L9a:
            android.animation.ValueAnimator r11 = r9.x0
            if (r11 == 0) goto La9
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto La9
            android.animation.ValueAnimator r11 = r9.x0
            r11.cancel()
        La9:
            r11 = 0
            if (r10 == 0) goto Lb4
            boolean r10 = r9.w0
            if (r10 == 0) goto Lb4
            r9.a(r11)
            goto Lb7
        Lb4:
            r6.k(r11)
        Lb7:
            boolean r10 = r9.e()
            if (r10 == 0) goto Ld8
            eu r10 = r9.F
            bf r10 = (defpackage.bf) r10
            af r10 = r10.x
            android.graphics.RectF r10 = r10.q
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Ld8
            boolean r10 = r9.e()
            if (r10 == 0) goto Ld8
            eu r10 = r9.F
            bf r10 = (defpackage.bf) r10
            r10.n(r11, r11, r11, r11)
        Ld8:
            r9.t0 = r3
            g5 r10 = r9.t
            if (r10 == 0) goto Lf2
            boolean r11 = r9.s
            if (r11 == 0) goto Lf2
            r10.setText(r5)
            android.widget.FrameLayout r10 = r9.a
            pj r11 = r9.x
            defpackage.v70.a(r10, r11)
            g5 r10 = r9.t
            r11 = 4
            r10.setVisibility(r11)
        Lf2:
            r7.j = r3
            r7.e()
            r0.r = r3
            r0.n()
            return
        Lfd:
            if (r11 != 0) goto L105
            boolean r11 = r9.t0
            if (r11 == 0) goto L104
            goto L105
        L104:
            return
        L105:
            android.animation.ValueAnimator r11 = r9.x0
            if (r11 == 0) goto L114
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto L114
            android.animation.ValueAnimator r11 = r9.x0
            r11.cancel()
        L114:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L120
            boolean r10 = r9.w0
            if (r10 == 0) goto L120
            r9.a(r11)
            goto L123
        L120:
            r6.k(r11)
        L123:
            r9.t0 = r2
            boolean r10 = r9.e()
            if (r10 == 0) goto L12e
            r9.j()
        L12e:
            android.widget.EditText r10 = r9.d
            if (r10 != 0) goto L133
            goto L137
        L133:
            android.text.Editable r5 = r10.getText()
        L137:
            r9.v(r5)
            r7.j = r2
            r7.e()
            r0.r = r2
            r0.n()
            return
    }

    public final void v(android.text.Editable r4) {
            r3 = this;
            f60 r0 = r3.n
            jb r0 = (defpackage.jb) r0
            r0.getClass()
            r0 = 0
            if (r4 == 0) goto Lf
            int r4 = r4.length()
            goto L10
        Lf:
            r4 = r0
        L10:
            android.widget.FrameLayout r1 = r3.a
            if (r4 != 0) goto L44
            boolean r4 = r3.t0
            if (r4 != 0) goto L44
            g5 r4 = r3.t
            if (r4 == 0) goto L5b
            boolean r4 = r3.s
            if (r4 == 0) goto L5b
            java.lang.CharSequence r4 = r3.r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L5b
            g5 r4 = r3.t
            java.lang.CharSequence r2 = r3.r
            r4.setText(r2)
            pj r4 = r3.w
            defpackage.v70.a(r1, r4)
            g5 r4 = r3.t
            r4.setVisibility(r0)
            g5 r4 = r3.t
            r4.bringToFront()
            java.lang.CharSequence r4 = r3.r
            r3.announceForAccessibility(r4)
            return
        L44:
            g5 r4 = r3.t
            if (r4 == 0) goto L5b
            boolean r0 = r3.s
            if (r0 == 0) goto L5b
            r0 = 0
            r4.setText(r0)
            pj r4 = r3.x
            defpackage.v70.a(r1, r4)
            g5 r4 = r3.t
            r0 = 4
            r4.setVisibility(r0)
        L5b:
            return
    }

    public final void w(boolean r6, boolean r7) {
            r5 = this;
            android.content.res.ColorStateList r0 = r5.n0
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r1 = r5.n0
            r2 = 16843623(0x1010367, float:2.3696E-38)
            r3 = 16842910(0x101009e, float:2.3694E-38)
            int[] r2 = new int[]{r2, r3}
            int r1 = r1.getColorForState(r2, r0)
            android.content.res.ColorStateList r2 = r5.n0
            r4 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r3 = new int[]{r4, r3}
            int r2 = r2.getColorForState(r3, r0)
            if (r6 == 0) goto L28
            r5.T = r2
            return
        L28:
            if (r7 == 0) goto L2d
            r5.T = r1
            return
        L2d:
            r5.T = r0
            return
    }

    public final void x() {
            r9 = this;
            eu r0 = r9.F
            if (r0 == 0) goto L130
            int r0 = r9.O
            if (r0 != 0) goto La
            goto L130
        La:
            boolean r0 = r9.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r9.d
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r9.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r9.d
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r9.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r9.s0
            r9.T = r3
            goto L7a
        L3c:
            boolean r3 = r9.m()
            if (r3 == 0) goto L51
            android.content.res.ColorStateList r3 = r9.n0
            if (r3 == 0) goto L4a
            r9.w(r0, r1)
            goto L7a
        L4a:
            int r3 = r9.getErrorCurrentTextColors()
            r9.T = r3
            goto L7a
        L51:
            boolean r3 = r9.m
            if (r3 == 0) goto L68
            g5 r3 = r9.o
            if (r3 == 0) goto L68
            android.content.res.ColorStateList r4 = r9.n0
            if (r4 == 0) goto L61
            r9.w(r0, r1)
            goto L7a
        L61:
            int r3 = r3.getCurrentTextColor()
            r9.T = r3
            goto L7a
        L68:
            if (r0 == 0) goto L6f
            int r3 = r9.m0
            r9.T = r3
            goto L7a
        L6f:
            if (r1 == 0) goto L76
            int r3 = r9.l0
            r9.T = r3
            goto L7a
        L76:
            int r3 = r9.k0
            r9.T = r3
        L7a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L83
            r9.p()
        L83:
            ej r3 = r9.c
            com.google.android.material.textfield.TextInputLayout r4 = r3.a
            com.google.android.material.internal.CheckableImageButton r5 = r3.g
            com.google.android.material.textfield.TextInputLayout r6 = r3.a
            r3.l()
            com.google.android.material.internal.CheckableImageButton r7 = r3.c
            android.content.res.ColorStateList r8 = r3.d
            defpackage.ff.K(r6, r7, r8)
            android.content.res.ColorStateList r7 = r3.k
            defpackage.ff.K(r6, r5, r7)
            fj r6 = r3.b()
            boolean r6 = r6 instanceof defpackage.ph
            if (r6 == 0) goto Lc8
            boolean r6 = r4.m()
            if (r6 == 0) goto Lc1
            android.graphics.drawable.Drawable r6 = r5.getDrawable()
            if (r6 == 0) goto Lc1
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r4.getErrorCurrentTextColors()
            defpackage.ch.g(r3, r4)
            r5.setImageDrawable(r3)
            goto Lc8
        Lc1:
            android.content.res.ColorStateList r6 = r3.k
            android.graphics.PorterDuff$Mode r3 = r3.l
            defpackage.ff.a(r4, r5, r6, r3)
        Lc8:
            r40 r3 = r9.b
            com.google.android.material.textfield.TextInputLayout r4 = r3.a
            com.google.android.material.internal.CheckableImageButton r5 = r3.d
            android.content.res.ColorStateList r3 = r3.e
            defpackage.ff.K(r4, r5, r3)
            int r3 = r9.O
            r4 = 2
            if (r3 != r4) goto L10a
            int r3 = r9.Q
            if (r0 == 0) goto Le7
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto Le7
            int r4 = r9.S
            r9.Q = r4
            goto Leb
        Le7:
            int r4 = r9.R
            r9.Q = r4
        Leb:
            int r4 = r9.Q
            if (r4 == r3) goto L10a
            boolean r3 = r9.e()
            if (r3 == 0) goto L10a
            boolean r3 = r9.t0
            if (r3 != 0) goto L10a
            boolean r3 = r9.e()
            if (r3 == 0) goto L107
            eu r3 = r9.F
            bf r3 = (defpackage.bf) r3
            r4 = 0
            r3.n(r4, r4, r4, r4)
        L107:
            r9.j()
        L10a:
            int r3 = r9.O
            if (r3 != r2) goto L12d
            boolean r2 = r9.isEnabled()
            if (r2 != 0) goto L119
            int r0 = r9.p0
            r9.U = r0
            goto L12d
        L119:
            if (r1 == 0) goto L122
            if (r0 != 0) goto L122
            int r0 = r9.r0
            r9.U = r0
            goto L12d
        L122:
            if (r0 == 0) goto L129
            int r0 = r9.q0
            r9.U = r0
            goto L12d
        L129:
            int r0 = r9.o0
            r9.U = r0
        L12d:
            r9.b()
        L130:
            return
    }
}
