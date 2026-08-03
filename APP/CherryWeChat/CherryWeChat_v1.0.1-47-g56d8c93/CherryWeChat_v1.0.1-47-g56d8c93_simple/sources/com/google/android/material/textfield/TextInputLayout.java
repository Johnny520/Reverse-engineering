package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import p000.AbstractC0107Ce;
import p000.AbstractC0148Dc;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0528MB;
import p000.AbstractC0688Q;
import p000.AbstractC0714Qj;
import p000.AbstractC0776S2;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.AbstractC2447rA;
import p000.AbstractC2671wd;
import p000.AbstractC2797za;
import p000.C0076Bq;
import p000.C0132D2;
import p000.C0262G3;
import p000.C0264G5;
import p000.C0377Iq;
import p000.C0437K6;
import p000.C0494Le;
import p000.C0684Pw;
import p000.C0685Px;
import p000.C0728Qx;
import p000.C0935Vq;
import p000.C0994X5;
import p000.C1021Xq;
import p000.C1037Y5;
import p000.C1053Yf;
import p000.C1072Yy;
import p000.C1141ag;
import p000.C1222bh;
import p000.C1456gf;
import p000.C1520hz;
import p000.C2198ll;
import p000.C2241ml;
import p000.C2304o4;
import p000.C2318oc;
import p000.C2359pa;
import p000.C2369pc;
import p000.C2404qA;
import p000.C2436r;
import p000.C2438r1;
import p000.C2464rl;
import p000.C2576uA;
import p000.C2619vA;
import p000.C2656w4;
import p000.C2705xA;
import p000.InterfaceC1006Xb;
import p000.InterfaceC2662wA;
import p000.RunnableC0431K0;
import p000.RunnableC0562N2;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: D0 */
    public static final int[][] f4590D0 = null;

    /* JADX INFO: renamed from: A */
    public ColorStateList f4591A;

    /* JADX INFO: renamed from: A0 */
    public boolean f4592A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f4593B;

    /* JADX INFO: renamed from: B0 */
    public boolean f4594B0;

    /* JADX INFO: renamed from: C */
    public ColorStateList f4595C;

    /* JADX INFO: renamed from: C0 */
    public boolean f4596C0;

    /* JADX INFO: renamed from: D */
    public boolean f4597D;

    /* JADX INFO: renamed from: E */
    public CharSequence f4598E;

    /* JADX INFO: renamed from: F */
    public boolean f4599F;

    /* JADX INFO: renamed from: G */
    public C1021Xq f4600G;

    /* JADX INFO: renamed from: H */
    public C1021Xq f4601H;

    /* JADX INFO: renamed from: I */
    public StateListDrawable f4602I;

    /* JADX INFO: renamed from: J */
    public boolean f4603J;

    /* JADX INFO: renamed from: K */
    public C1021Xq f4604K;

    /* JADX INFO: renamed from: L */
    public C1021Xq f4605L;

    /* JADX INFO: renamed from: M */
    public C0728Qx f4606M;

    /* JADX INFO: renamed from: N */
    public boolean f4607N;

    /* JADX INFO: renamed from: O */
    public final int f4608O;

    /* JADX INFO: renamed from: P */
    public int f4609P;

    /* JADX INFO: renamed from: Q */
    public int f4610Q;

    /* JADX INFO: renamed from: R */
    public int f4611R;

    /* JADX INFO: renamed from: S */
    public int f4612S;

    /* JADX INFO: renamed from: T */
    public int f4613T;

    /* JADX INFO: renamed from: U */
    public int f4614U;

    /* JADX INFO: renamed from: V */
    public int f4615V;

    /* JADX INFO: renamed from: W */
    public final Rect f4616W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f4617a;

    /* JADX INFO: renamed from: a0 */
    public final Rect f4618a0;

    /* JADX INFO: renamed from: b */
    public final C1072Yy f4619b;

    /* JADX INFO: renamed from: b0 */
    public final RectF f4620b0;

    /* JADX INFO: renamed from: c */
    public final C1141ag f4621c;

    /* JADX INFO: renamed from: c0 */
    public Typeface f4622c0;

    /* JADX INFO: renamed from: d */
    public final int f4623d;

    /* JADX INFO: renamed from: d0 */
    public ColorDrawable f4624d0;

    /* JADX INFO: renamed from: e */
    public EditText f4625e;

    /* JADX INFO: renamed from: e0 */
    public int f4626e0;

    /* JADX INFO: renamed from: f */
    public CharSequence f4627f;

    /* JADX INFO: renamed from: f0 */
    public final LinkedHashSet f4628f0;

    /* JADX INFO: renamed from: g */
    public int f4629g;

    /* JADX INFO: renamed from: g0 */
    public ColorDrawable f4630g0;

    /* JADX INFO: renamed from: h */
    public int f4631h;

    /* JADX INFO: renamed from: h0 */
    public int f4632h0;

    /* JADX INFO: renamed from: i */
    public int f4633i;

    /* JADX INFO: renamed from: i0 */
    public Drawable f4634i0;

    /* JADX INFO: renamed from: j */
    public int f4635j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f4636j0;

    /* JADX INFO: renamed from: k */
    public final C2241ml f4637k;

    /* JADX INFO: renamed from: k0 */
    public ColorStateList f4638k0;

    /* JADX INFO: renamed from: l */
    public boolean f4639l;

    /* JADX INFO: renamed from: l0 */
    public int f4640l0;

    /* JADX INFO: renamed from: m */
    public int f4641m;

    /* JADX INFO: renamed from: m0 */
    public int f4642m0;

    /* JADX INFO: renamed from: n */
    public boolean f4643n;

    /* JADX INFO: renamed from: n0 */
    public int f4644n0;

    /* JADX INFO: renamed from: o */
    public InterfaceC2662wA f4645o;

    /* JADX INFO: renamed from: o0 */
    public ColorStateList f4646o0;

    /* JADX INFO: renamed from: p */
    public C2304o4 f4647p;

    /* JADX INFO: renamed from: p0 */
    public int f4648p0;

    /* JADX INFO: renamed from: q */
    public int f4649q;

    /* JADX INFO: renamed from: q0 */
    public int f4650q0;

    /* JADX INFO: renamed from: r */
    public int f4651r;

    /* JADX INFO: renamed from: r0 */
    public int f4652r0;

    /* JADX INFO: renamed from: s */
    public CharSequence f4653s;

    /* JADX INFO: renamed from: s0 */
    public int f4654s0;

    /* JADX INFO: renamed from: t */
    public boolean f4655t;

    /* JADX INFO: renamed from: t0 */
    public int f4656t0;

    /* JADX INFO: renamed from: u */
    public C2304o4 f4657u;

    /* JADX INFO: renamed from: u0 */
    public int f4658u0;

    /* JADX INFO: renamed from: v */
    public ColorStateList f4659v;

    /* JADX INFO: renamed from: v0 */
    public boolean f4660v0;

    /* JADX INFO: renamed from: w */
    public int f4661w;

    /* JADX INFO: renamed from: w0 */
    public final C2359pa f4662w0;

    /* JADX INFO: renamed from: x */
    public C1222bh f4663x;

    /* JADX INFO: renamed from: x0 */
    public boolean f4664x0;

    /* JADX INFO: renamed from: y */
    public C1222bh f4665y;

    /* JADX INFO: renamed from: y0 */
    public boolean f4666y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f4667z;

    /* JADX INFO: renamed from: z0 */
    public ValueAnimator f4668z0;

    static {
        f4590D0 = new int[][]{new int[]{R.attr.state_pressed}, new int[0]};
    }

    public TextInputLayout(Context r21, AttributeSet r22) {
        super(AbstractC0148Dc.m291y(r21, r22, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout), r22, io.github.cherrywechat.R.attr.textInputStyle);
        this.f4629g = -1;
        this.f4631h = -1;
        this.f4633i = -1;
        this.f4635j = -1;
        this.f4637k = new C2241ml(this);
        this.f4645o = new C2438r1(11);
        this.f4616W = new Rect();
        this.f4618a0 = new Rect();
        this.f4620b0 = new RectF();
        this.f4628f0 = new LinkedHashSet();
        C2359pa r1 = new C2359pa(this);
        this.f4662w0 = r1;
        this.f4596C0 = false;
        Context r3 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout r11 = new FrameLayout(r3);
        this.f4617a = r11;
        r11.setAddStatesFromChildren(true);
        LinearInterpolator r5 = AbstractC0776S2.f2453a;
        r1.f8266R = r5;
        r1.m4789j(false);
        r1.f8265Q = r5;
        r1.m4789j(false);
        if (r1.f8287g == 8388659) goto L5;
        r1.f8287g = 8388659;
        r1.m4789j(false);
    L5:
        AbstractC1293cr.m2547f(r3, r22, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout);
        int[] r32 = AbstractC0939Vu.f2930D;
        AbstractC1293cr.m2549h(r3, r22, r32, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout, new int[]{22, 20, 40, 45, 50});
        TypedArray r33 = r3.obtainStyledAttributes(r22, r32, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout);
        C2656w4 r6 = new C2656w4(r3, r33);
        C1072Yy r52 = new C1072Yy(this, r6);
        this.f4619b = r52;
        this.f4597D = r33.getBoolean(48, true);
        setHint(r33.getText(4));
        this.f4666y0 = r33.getBoolean(47, true);
        this.f4664x0 = r33.getBoolean(42, true);
        if (r33.hasValue(6) == false) goto L9;
        setMinEms(r33.getInt(6, -1));
    L12:
        if (r33.hasValue(5) == false) goto L15;
        setMaxEms(r33.getInt(5, -1));
    L17:
        this.f4606M = C0728Qx.m1512b(r3, r22, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout).m1383a();
        this.f4608O = r3.getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f4610Q = r33.getDimensionPixelOffset(9, 0);
        this.f4623d = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f4612S = r33.getDimensionPixelSize(16, r3.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f4613T = r33.getDimensionPixelSize(17, r3.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f4611R = this.f4612S;
        float r2 = r33.getDimension(13, -1.0f);
        float r7 = r33.getDimension(12, -1.0f);
        float r12 = r33.getDimension(10, -1.0f);
        float r4 = r33.getDimension(11, -1.0f);
        C0685Px r15 = this.f4606M.m1516f();
        if (r2 < 0.0f) goto L21;
        r15.f2196e = new C2436r(r2);
    L21:
        if (r7 < 0.0f) goto L24;
        r15.f2197f = new C2436r(r7);
    L24:
        if (r12 < 0.0f) goto L27;
        r15.f2198g = new C2436r(r12);
    L27:
        if (r4 < 0.0f) goto L29;
        r15.f2199h = new C2436r(r4);
    L29:
        this.f4606M = r15.m1383a();
        ColorStateList r23 = AbstractC0828TB.m1642i(r3, r6, 7);
        if (r23 == null) goto L35;
        int r42 = r23.getDefaultColor();
        this.f4648p0 = r42;
        this.f4615V = r42;
        if (r23.isStateful() == false) goto L34;
        this.f4650q0 = r23.getColorForState(new int[]{-16842910}, -1);
        this.f4652r0 = r23.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4654s0 = r23.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
    L37:
        if (r33.hasValue(1) == false) goto L39;
        ColorStateList r24 = r6.m5209p(1);
        this.f4638k0 = r24;
        this.f4636j0 = r24;
    L39:
        ColorStateList r43 = AbstractC0828TB.m1642i(r3, r6, 14);
        this.f4644n0 = r33.getColor(14, 0);
        this.f4640l0 = r3.getColor(io.github.cherrywechat.R.color.mtrl_textinput_default_box_stroke_color);
        this.f4656t0 = r3.getColor(io.github.cherrywechat.R.color.mtrl_textinput_disabled_color);
        this.f4642m0 = r3.getColor(io.github.cherrywechat.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (r43 == null) goto L43;
        setBoxStrokeColorStateList(r43);
    L43:
        if (r33.hasValue(15) == false) goto L46;
        setBoxStrokeErrorColor(AbstractC0828TB.m1642i(r3, r6, 15));
    L46:
        if (r33.getResourceId(50, -1) == (-1)) goto L48;
        setHintTextAppearance(r33.getResourceId(50, 0));
    L48:
        this.f4593B = r6.m5209p(24);
        this.f4595C = r6.m5209p(25);
        int r13 = r33.getResourceId(40, 0);
        CharSequence r25 = r33.getText(35);
        int r44 = r33.getInt(34, 1);
        boolean r72 = r33.getBoolean(36, false);
        int r122 = r33.getResourceId(45, 0);
        boolean r132 = r33.getBoolean(44, false);
        CharSequence r14 = r33.getText(43);
        int r152 = r33.getResourceId(58, 0);
        CharSequence r10 = r33.getText(57);
        boolean r8 = r33.getBoolean(18, false);
        setCounterMaxLength(r33.getInt(19, -1));
        this.f4651r = r33.getResourceId(22, 0);
        this.f4649q = r33.getResourceId(20, 0);
        setBoxBackgroundMode(r33.getInt(8, 0));
        setErrorContentDescription(r25);
        setErrorAccessibilityLiveRegion(r44);
        setCounterOverflowTextAppearance(this.f4649q);
        setHelperTextTextAppearance(r122);
        setErrorTextAppearance(r13);
        setCounterTextAppearance(this.f4651r);
        setPlaceholderText(r10);
        setPlaceholderTextAppearance(r152);
        if (r33.hasValue(41) == false) goto L52;
        setErrorTextColor(r6.m5209p(41));
    L52:
        if (r33.hasValue(46) == false) goto L55;
        setHelperTextColor(r6.m5209p(46));
    L55:
        if (r33.hasValue(51) == false) goto L58;
        setHintTextColor(r6.m5209p(51));
    L58:
        if (r33.hasValue(23) == false) goto L61;
        setCounterTextColor(r6.m5209p(23));
    L61:
        if (r33.hasValue(21) == false) goto L64;
        setCounterOverflowTextColor(r6.m5209p(21));
    L64:
        if (r33.hasValue(59) == false) goto L66;
        setPlaceholderTextColor(r6.m5209p(59));
    L66:
        C1141ag r16 = new C1141ag(this, r6);
        this.f4621c = r16;
        boolean r45 = r33.getBoolean(0, true);
        setHintMaxLines(r33.getInt(49, 1));
        r6.m5195E();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        r11.addView(r52);
        r11.addView(r16);
        addView(r11);
        setEnabled(r45);
        setHelperTextEnabled(r132);
        setErrorEnabled(r72);
        setCounterEnabled(r8);
        setHelperText(r14);
        return;
    L34:
        this.f4652r0 = this.f4648p0;
        ColorStateList r26 = AbstractC0295Gu.m622o(r3, io.github.cherrywechat.R.color.mtrl_filled_background_color);
        this.f4650q0 = r26.getColorForState(new int[]{-16842910}, -1);
        this.f4654s0 = r26.getColorForState(new int[]{R.attr.state_hovered}, -1);
        goto L37
    L35:
        this.f4615V = 0;
        this.f4648p0 = 0;
        this.f4650q0 = 0;
        this.f4652r0 = 0;
        this.f4654s0 = 0;
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
        EditText r0 = this.f4625e;
        if ((r0 instanceof AutoCompleteTextView) == false) goto L21;
        if (r0.getInputType() != 0) goto L21;
        int r02 = AbstractC0295Gu.m621n(this.f4625e, io.github.cherrywechat.R.attr.colorControlHighlight);
        int r1 = this.f4609P;
        int[][] r5 = f4590D0;
        if (r1 != 2) goto L15;
        Context r12 = getContext();
        C1021Xq r6 = this.f4600G;
        TypedValue r7 = AbstractC1293cr.m2539R(r12, io.github.cherrywechat.R.attr.colorSurface, "TextInputLayout");
        int r8 = r7.resourceId;
        if (r8 == 0) goto L12;
        int r13 = r12.getColor(r8);
    L13:
        C1021Xq r72 = new C1021Xq(r6.f3241b.f2902a);
        int r03 = AbstractC0295Gu.m629v(r02, r13, 0.1f);
        r72.m1928n(new ColorStateList(r5, new int[]{r03, 0}));
        r72.setTint(r13);
        ColorStateList r14 = new ColorStateList(r5, new int[]{r03, r13});
        C1021Xq r04 = new C1021Xq(r6.f3241b.f2902a);
        r04.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(r14, r72, r04), r6});
    L12:
        r13 = r7.data;
        goto L13
    L15:
        if (r1 != 1) goto L18;
        C1021Xq r15 = this.f4600G;
        int r2 = this.f4615V;
        return new RippleDrawable(new ColorStateList(r5, new int[]{AbstractC0295Gu.m629v(r02, r2, 0.1f), r2}), r15, r15);
    L18:
        return null;
    L21:
        return this.f4600G;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f4602I != null) goto L6;
        StateListDrawable r0 = new StateListDrawable();
        this.f4602I = r0;
        r0.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
        this.f4602I.addState(new int[0], m2481h(false));
    L6:
        return this.f4602I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f4601H != null) goto L6;
        this.f4601H = m2481h(true);
    L6:
        return this.f4601H;
    }

    /* JADX INFO: renamed from: m */
    public static void m2473m(ViewGroup r4, boolean r5) {
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        View r2 = r4.getChildAt(r1);
        r2.setEnabled(r5);
        if ((r2 instanceof ViewGroup) == false) goto L7;
        m2473m((ViewGroup) r2, r5);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    private void setEditText(EditText r6) {
        if (this.f4625e != null) goto L49;
        getEndIconMode();
        this.f4625e = r6;
        int r0 = this.f4629g;
        if (r0 == (-1)) goto L7;
        setMinEms(r0);
    L8:
        int r02 = this.f4631h;
        if (r02 == (-1)) goto L11;
        setMaxEms(r02);
    L12:
        this.f4603J = false;
        m2484k();
        setTextInputAccessibilityDelegate(new C2619vA(this));
        Typeface r1 = this.f4625e.getTypeface();
        C2359pa r2 = this.f4662w0;
        r2.m4793n(r1);
        float r12 = this.f4625e.getTextSize();
        if (r2.f8289h == r12) goto L15;
        r2.f8289h = r12;
        r2.m4789j(false);
    L15:
        float r13 = this.f4625e.getLetterSpacing();
        if (r2.f8272X == r13) goto L18;
        r2.f8272X = r13;
        r2.m4789j(false);
    L18:
        int r14 = this.f4625e.getGravity();
        int r3 = (r14 & (-113)) | 48;
        if (r2.f8287g == r3) goto L22;
        r2.f8287g = r3;
        r2.m4789j(false);
    L22:
        if (r2.f8285f == r14) goto L24;
        r2.f8285f = r14;
        r2.m4789j(false);
    L24:
        this.f4658u0 = r6.getMinimumHeight();
        this.f4625e.addTextChangedListener(new C2576uA(this, r6));
        if (this.f4636j0 != null) goto L28;
        this.f4636j0 = this.f4625e.getHintTextColors();
    L28:
        if (this.f4597D == false) goto L34;
        if (TextUtils.isEmpty(this.f4598E) == false) goto L32;
        CharSequence r15 = this.f4625e.getHint();
        this.f4627f = r15;
        setHint(r15);
        this.f4625e.setHint(null);
    L32:
        this.f4599F = true;
    L34:
        if (Build.VERSION.SDK_INT < 29) goto L37;
        m2490r();
    L37:
        if (this.f4647p == null) goto L39;
        m2488p(this.f4625e.getText());
    L39:
        m2492t();
        this.f4637k.m4542b();
        this.f4619b.bringToFront();
        C1141ag r16 = this.f4621c;
        r16.bringToFront();
        Iterator r32 = this.f4628f0.iterator();
    L41:
        if (r32.hasNext() == false) goto L43;
        ((C1053Yf) r32.next()).m1999a(this);
        goto L41
    L43:
        r16.m2070m();
        if (isEnabled() == true) goto L46;
        r6.setEnabled(false);
    L46:
        m2495w(false, true);
        return;
    L11:
        setMaxWidth(this.f4635j);
        goto L12
    L7:
        setMinWidth(this.f4633i);
        goto L8
    L49:
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence r3) {
        if (TextUtils.equals(r3, this.f4598E) == true) goto L13;
        this.f4598E = r3;
        C2359pa r0 = this.f4662w0;
        if (r3 != null) goto L7;
    L8:
        r0.f8250B = r3;
        r0.f8251C = null;
        r0.m4789j(false);
    L10:
        if (this.f4660v0 == true) goto L14;
        m2485l();
        return;
    L14:
        return;
    L7:
        if (TextUtils.equals(r0.f8250B, r3) == true) goto L10;
    }

    private void setPlaceholderTextEnabled(boolean r3) {
        if (this.f4655t != r3) goto L5;
        return;
    L5:
        if (r3 == false) goto L9;
        C2304o4 r0 = this.f4657u;
        if (r0 == null) goto L13;
        this.f4617a.addView(r0);
        this.f4657u.setVisibility(0);
    L13:
        this.f4655t = r3;
        return;
    L9:
        C2304o4 r02 = this.f4657u;
        if (r02 == null) goto L12;
        r02.setVisibility(8);
    L12:
        this.f4657u = null;
        goto L13
    }

    /* JADX INFO: renamed from: a */
    public final void m2474a() {
        if (this.f4625e != null) goto L5;
        return;
    L5:
        if (this.f4609P == 1) goto L8;
        return;
    L8:
        if (getHintMaxLines() == 1) goto L10;
        EditText r0 = this.f4625e;
        r0.setPaddingRelative(r0.getPaddingStart(), (int) (this.f4662w0.m4786f() + this.f4623d), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        return;
    L10:
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L14;
        EditText r02 = this.f4625e;
        r02.setPaddingRelative(r02.getPaddingStart(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        return;
    L14:
        if (AbstractC0828TB.m1650t(getContext()) == false) goto L20;
        EditText r03 = this.f4625e;
        r03.setPaddingRelative(r03.getPaddingStart(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        return;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if ((r2 instanceof EditText) == false) goto L6;
        FrameLayout.LayoutParams r32 = new FrameLayout.LayoutParams(r4);
        r32.gravity = (r32.gravity & (-113)) | 16;
        FrameLayout r0 = this.f4617a;
        r0.addView(r2, r32);
        r0.setLayoutParams(r4);
        m2494v();
        setEditText((EditText) r2);
        return;
    L6:
        super.addView(r2, r3, r4);
    }

    /* JADX INFO: renamed from: b */
    public final void m2475b(float r6) {
        C2359pa r0 = this.f4662w0;
        if (r0.f8277b != r6) goto L6;
        return;
    L6:
        if (this.f4668z0 != null) goto L8;
        ValueAnimator r1 = new ValueAnimator();
        this.f4668z0 = r1;
        r1.setInterpolator(AbstractC0714Qj.m1474E(getContext(), io.github.cherrywechat.R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b));
        this.f4668z0.setDuration(AbstractC0714Qj.m1473D(getContext(), io.github.cherrywechat.R.attr.motionDurationMedium4, 167));
        this.f4668z0.addUpdateListener(new C0994X5(3, this));
    L8:
        this.f4668z0.setFloatValues(new float[]{r0.f8277b, r6});
        this.f4668z0.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m2476c() {
        C1021Xq r0 = this.f4600G;
        if (r0 != null) goto L5;
        return;
    L5:
        C0728Qx r1 = r0.f3241b.f2902a;
        C0728Qx r2 = this.f4606M;
        if (r1 == r2) goto L9;
        r0.setShapeAppearanceModel(r2);
    L9:
        if (this.f4609P != 2) goto L17;
        int r02 = this.f4611R;
        if (r02 <= (-1)) goto L17;
        int r12 = this.f4614U;
        if (r12 == 0) goto L17;
        C1021Xq r3 = this.f4600G;
        r3.f3241b.f2912k = r02;
        r3.invalidateSelf();
        ColorStateList r03 = ColorStateList.valueOf(r12);
        C0935Vq r13 = r3.f3241b;
        if (r13.f2906e == r03) goto L17;
        r13.f2906e = r03;
        r3.onStateChange(r3.getState());
    L17:
        int r04 = this.f4615V;
        if (this.f4609P != 1) goto L20;
        r04 = AbstractC2797za.m5365c(this.f4615V, AbstractC0295Gu.m620m(getContext(), io.github.cherrywechat.R.attr.colorSurface, 0));
    L20:
        this.f4615V = r04;
        this.f4600G.m1928n(ColorStateList.valueOf(r04));
        C1021Xq r05 = this.f4604K;
        if (r05 != null) goto L23;
    L35:
        m2493u();
        return;
    L23:
        if (this.f4605L == null) goto L35;
        if (this.f4611R > (-1)) goto L28;
    L34:
        invalidate();
        goto L35
    L28:
        if (this.f4614U == 0) goto L34;
        if (this.f4625e.isFocused() == false) goto L32;
        ColorStateList r14 = ColorStateList.valueOf(this.f4640l0);
    L33:
        r05.m1928n(r14);
        this.f4605L.m1928n(ColorStateList.valueOf(this.f4614U));
        goto L34
    L32:
        r14 = ColorStateList.valueOf(this.f4614U);
        goto L33
    }

    /* JADX INFO: renamed from: d */
    public final Rect m2477d(Rect r5) {
        if (this.f4625e == null) goto L19;
        if (getLayoutDirection() != 1) goto L7;
        boolean r0 = true;
    L8:
        int r2 = r5.bottom;
        Rect r3 = this.f4618a0;
        r3.bottom = r2;
        int r22 = this.f4609P;
        if (r22 != 1) goto L11;
        r3.left = m2482i(r5.left, r0);
        r3.top = r5.top + this.f4610Q;
        r3.right = m2483j(r5.right, r0);
        return r3;
    L11:
        if (r22 == 2) goto L14;
        r3.left = m2482i(r5.left, r0);
        r3.top = getPaddingTop();
        r3.right = m2483j(r5.right, r0);
        return r3;
    L14:
        r3.left = this.f4625e.getPaddingLeft() + r5.left;
        r3.top = r5.top - m2478e();
        r3.right = r5.right - this.f4625e.getPaddingRight();
        return r3;
    L7:
        r0 = false;
        goto L8
    L19:
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure r6, int r7) {
        EditText r0 = this.f4625e;
        if (r0 != null) goto L6;
        super.dispatchProvideAutofillStructure(r6, r7);
        return;
    L6:
        int r2 = 0;
        if (this.f4627f == null) goto L15;
        boolean r1 = this.f4599F;
        this.f4599F = false;
        CharSequence r02 = r0.getHint();
        this.f4625e.setHint(this.f4627f);
        super.dispatchProvideAutofillStructure(r6, r7);     // Catch: Throwable -> L12
        this.f4625e.setHint(r02);
        this.f4599F = r1;
        return;
    L12:
        th = move-exception;
        this.f4625e.setHint(r02);
        this.f4599F = r1;
        throw th;
    L15:
        r6.setAutofillId(getAutofillId());
        onProvideAutofillStructure(r6, r7);
        onProvideAutofillVirtualStructure(r6, r7);
        FrameLayout r03 = this.f4617a;
        r6.setChildCount(r03.getChildCount());
    L17:
        if (r2 >= r03.getChildCount()) goto L22;
        View r12 = r03.getChildAt(r2);
        ViewStructure r3 = r6.newChild(r2);
        r12.dispatchProvideAutofillStructure(r3, r7);
        if (r12 != this.f4625e) goto L21;
        r3.setHint(getHint());
    L21:
        r2 = r2 + 1;
        goto L17
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray r2) {
        this.f4594B0 = true;
        super.dispatchRestoreInstanceState(r2);
        this.f4594B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas r18) {
        Canvas r1 = r18;
        super.draw(r18);
        boolean r2 = this.f4597D;
        C2359pa r8 = this.f4662w0;
        if (r2 == false) goto L38;
        TextPaint r7 = r8.f8263O;
        RectF r22 = r8.f8283e;
        int r9 = r1.save();
        if (r8.f8251C == null) goto L38;
        if (r22.width() <= 0.0f) goto L38;
        if (r22.height() <= 0.0f) goto L38;
        r7.setTextSize(r8.f8255G);
        float r23 = r8.f8302q;
        float r3 = r8.f8303r;
        float r4 = r8.f8254F;
        if (r4 == 1.0f) goto L14;
        r1.scale(r4, r4, r23, r3);
    L14:
        if (r8.f8284e0 > 1) goto L18;
        if (r8.f8286f0 > 1) goto L18;
    L35:
        r1.translate(r23, r3);
        r8.f8274Z.draw(r1);
    L36:
        r1.restoreToCount(r9);
    L18:
        if (r8.f8252D == true) goto L35;
        if (r8.m4794o() == false) goto L35;
        float r24 = r8.f8302q - r8.f8274Z.getLineStart(0);
        int r12 = r7.getAlpha();
        r1.translate(r24, r3);
        float r32 = r12;
        r7.setAlpha((int) (r8.f8280c0 * r32));
        int r13 = Build.VERSION.SDK_INT;
        if (r13 < 31) goto L25;
        float r25 = r8.f8256H;
        float r42 = r8.f8257I;
        float r5 = r8.f8258J;
        int r6 = r8.f8259K;
        r7.setShadowLayer(r25, r42, r5, AbstractC2797za.m5367e(r6, (r7.getAlpha() * Color.alpha(r6)) / 255));
    L25:
        r8.f8274Z.draw(r1);
        r7.setAlpha((int) (r8.f8278b0 * r32));
        if (r13 < 31) goto L28;
        float r26 = r8.f8256H;
        float r33 = r8.f8257I;
        float r43 = r8.f8258J;
        int r52 = r8.f8259K;
        r7.setShadowLayer(r26, r33, r43, AbstractC2797za.m5367e(r52, (Color.alpha(r52) * r7.getAlpha()) / 255));
    L28:
        int r27 = r8.f8274Z.getLineBaseline(0);
        CharSequence r34 = r8.f8282d0;
        float r62 = r27;
        r1.drawText(r34, 0, r34.length(), 0.0f, r62, r7);
        if (r13 < 31) goto L31;
        r7.setShadowLayer(r8.f8256H, r8.f8257I, r8.f8258J, r8.f8259K);
    L31:
        String r14 = r8.f8282d0.toString().trim();
        if (r14.endsWith("…") == false) goto L34;
        r14 = r14.substring(0, r14.length() - 1);
    L34:
        String r28 = r14;
        r7.setAlpha(r12);
        r1 = r18;
        r1.drawText(r28, 0, Math.min(r8.f8274Z.getLineEnd(0), r28.length()), 0.0f, r62, r7);
    L38:
        if (this.f4605L == null) goto L45;
        C1021Xq r29 = this.f4604K;
        if (r29 == null) goto L46;
        r29.draw(r1);
        if (this.f4625e.isFocused() == false) goto L47;
        Rect r210 = this.f4605L.getBounds();
        Rect r35 = this.f4604K.getBounds();
        float r44 = r8.f8277b;
        int r53 = r35.centerX();
        r210.left = AbstractC0776S2.m1598c(r53, r35.left, r44);
        r210.right = AbstractC0776S2.m1598c(r53, r35.right, r44);
        this.f4605L.draw(r1);
        return;
    L47:
        return;
    L46:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4592A0 == false) goto L5;
        return;
    L5:
        boolean r0 = true;
        this.f4592A0 = true;
        super.drawableStateChanged();
        int[] r1 = getDrawableState();
        C2359pa r3 = this.f4662w0;
        if (r3 == null) goto L16;
        r3.f8261M = r1;
        ColorStateList r12 = r3.f8295k;
        if (r12 != null) goto L10;
    L11:
        ColorStateList r13 = r3.f8293j;
        if (r13 == null) goto L16;
        if (r13.isStateful() == false) goto L16;
    L15:
        r3.m4789j(false);
        boolean r14 = true;
    L18:
        if (this.f4625e != null) goto L20;
    L26:
        m2492t();
        m2498z();
        if (r14 == false) goto L29;
        invalidate();
    L29:
        this.f4592A0 = false;
        return;
    L20:
        if (isLaidOut() == true) goto L22;
    L24:
        r0 = false;
    L25:
        m2495w(r0, false);
        goto L26
    L22:
        if (isEnabled() == false) goto L24;
    L10:
        if (r12.isStateful() == true) goto L15;
    L16:
        r14 = false;
        goto L18
    }

    /* JADX INFO: renamed from: e */
    public final int m2478e() {
        if (this.f4597D == false) goto L9;
        int r0 = this.f4609P;
        C2359pa r2 = this.f4662w0;
        if (r0 == 0) goto L17;
        if (r0 != 2) goto L9;
        if (getHintMaxLines() == 1) goto L13;
        float r02 = r2.m4786f();
        TextPaint r3 = r2.f8264P;
        r3.setTextSize(r2.f8291i);
        r3.setTypeface(r2.f8304s);
        r3.setLetterSpacing(r2.f8271W);
        return Math.max(0, (int) (r02 - ((-r3.ascent()) / 2.0f)));
    L13:
        return (int) (r2.m4786f() / 2.0f);
    L17:
        return (int) r2.m4786f();
    L9:
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final C1222bh m2479f() {
        C1222bh r0 = new C1222bh();
        r0.f1198c = AbstractC0714Qj.m1473D(getContext(), io.github.cherrywechat.R.attr.motionDurationShort2, 87);
        r0.f1199d = AbstractC0714Qj.m1474E(getContext(), io.github.cherrywechat.R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2480g() {
        if (this.f4597D == true) goto L5;
        return false;
    L5:
        if (TextUtils.isEmpty(this.f4598E) == false) goto L7;
        return false;
    L7:
        if ((this.f4600G instanceof C2369pc) == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText r0 = this.f4625e;
        if (r0 == null) goto L7;
        int r02 = r0.getBaseline();
        int r1 = getPaddingTop() + r02;
        return m2478e() + r1;
    L7:
        return super.getBaseline();
    }

    public C1021Xq getBoxBackground() {
        int r0 = this.f4609P;
        if (r0 == 1) goto L10;
        if (r0 == 2) goto L10;
        throw new IllegalStateException();
    L10:
        return this.f4600G;
    }

    public int getBoxBackgroundColor() {
        return this.f4615V;
    }

    public int getBoxBackgroundMode() {
        return this.f4609P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f4610Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int r0 = getLayoutDirection();
        RectF r2 = this.f4620b0;
        if (r0 != 1) goto L7;
        return this.f4606M.f2331h.mo1563a(r2);
    L7:
        return this.f4606M.f2330g.mo1563a(r2);
    }

    public float getBoxCornerRadiusBottomStart() {
        int r0 = getLayoutDirection();
        RectF r2 = this.f4620b0;
        if (r0 != 1) goto L7;
        return this.f4606M.f2330g.mo1563a(r2);
    L7:
        return this.f4606M.f2331h.mo1563a(r2);
    }

    public float getBoxCornerRadiusTopEnd() {
        int r0 = getLayoutDirection();
        RectF r2 = this.f4620b0;
        if (r0 != 1) goto L7;
        return this.f4606M.f2328e.mo1563a(r2);
    L7:
        return this.f4606M.f2329f.mo1563a(r2);
    }

    public float getBoxCornerRadiusTopStart() {
        int r0 = getLayoutDirection();
        RectF r2 = this.f4620b0;
        if (r0 != 1) goto L7;
        return this.f4606M.f2329f.mo1563a(r2);
    L7:
        return this.f4606M.f2328e.mo1563a(r2);
    }

    public int getBoxStrokeColor() {
        return this.f4644n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f4646o0;
    }

    public int getBoxStrokeWidth() {
        return this.f4612S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4613T;
    }

    public int getCounterMaxLength() {
        return this.f4641m;
    }

    public CharSequence getCounterOverflowDescription() {
        if (this.f4639l == true) goto L5;
        return null;
    L5:
        if (this.f4643n == false) goto L12;
        C2304o4 r0 = this.f4647p;
        if (r0 != null) goto L9;
        return null;
    L9:
        return r0.getContentDescription();
    L12:
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f4591A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f4667z;
    }

    public ColorStateList getCursorColor() {
        return this.f4593B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f4595C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f4636j0;
    }

    public EditText getEditText() {
        return this.f4625e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f4621c.f3612g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f4621c.f3612g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f4621c.f3618m;
    }

    public int getEndIconMode() {
        return this.f4621c.f3614i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f4621c.f3619n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f4621c.f3612g;
    }

    public CharSequence getError() {
        C2241ml r0 = this.f4637k;
        if (r0.f7911q == true) goto L5;
        return null;
    L5:
        return r0.f7910p;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f4637k.f7914t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f4637k.f7913s;
    }

    public int getErrorCurrentTextColors() {
        C2304o4 r0 = this.f4637k.f7912r;
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.getCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.f4621c.f3608c.getDrawable();
    }

    public CharSequence getHelperText() {
        C2241ml r0 = this.f4637k;
        if (r0.f7918x == true) goto L5;
        return null;
    L5:
        return r0.f7917w;
    }

    public int getHelperTextCurrentTextColor() {
        C2304o4 r0 = this.f4637k.f7919y;
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.getCurrentTextColor();
    }

    public CharSequence getHint() {
        if (this.f4597D == true) goto L5;
        return null;
    L5:
        return this.f4598E;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4662w0.m4786f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2359pa r0 = this.f4662w0;
        return r0.m4787g(r0.f8295k);
    }

    public int getHintMaxLines() {
        return this.f4662w0.f8284e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f4638k0;
    }

    public InterfaceC2662wA getLengthCounter() {
        return this.f4645o;
    }

    public int getMaxEms() {
        return this.f4631h;
    }

    public int getMaxWidth() {
        return this.f4635j;
    }

    public int getMinEms() {
        return this.f4629g;
    }

    public int getMinWidth() {
        return this.f4633i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f4621c.f3612g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f4621c.f3612g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f4655t == true) goto L5;
        return null;
    L5:
        return this.f4653s;
    }

    public int getPlaceholderTextAppearance() {
        return this.f4661w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f4659v;
    }

    public CharSequence getPrefixText() {
        return this.f4619b.f3386c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f4619b.f3385b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f4619b.f3385b;
    }

    public C0728Qx getShapeAppearanceModel() {
        return this.f4606M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f4619b.f3387d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f4619b.f3387d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f4619b.f3390g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f4619b.f3391h;
    }

    public CharSequence getSuffixText() {
        return this.f4621c.f3621p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f4621c.f3622q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f4621c.f3622q;
    }

    public Typeface getTypeface() {
        return this.f4622c0;
    }

    /* JADX INFO: renamed from: h */
    public final C1021Xq m2481h(boolean r17) {
        float r1 = getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_shape_corner_size_small_component);
        if (r17 == false) goto L5;
        float r2 = r1;
    L6:
        EditText r3 = this.f4625e;
        if ((r3 instanceof C0076Bq) == false) goto L9;
        float r32 = ((C0076Bq) r3).getPopupElevation();
    L10:
        int r4 = getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0684Pw r5 = new C0684Pw();
        C0684Pw r6 = new C0684Pw();
        C0684Pw r7 = new C0684Pw();
        C0684Pw r8 = new C0684Pw();
        int r10 = 0;
        C1456gf r9 = new C1456gf(r10);
        C1456gf r11 = new C1456gf(r10);
        C1456gf r12 = new C1456gf(r10);
        C1456gf r13 = new C1456gf(r10);
        C2436r r14 = new C2436r(r2);
        C2436r r15 = new C2436r(r2);
        C2436r r22 = new C2436r(r1);
        C2436r r102 = new C2436r(r1);
        C0728Qx r16 = new C0728Qx();
        r16.f2324a = r5;
        r16.f2325b = r6;
        r16.f2326c = r7;
        r16.f2327d = r8;
        r16.f2328e = r14;
        r16.f2329f = r15;
        r16.f2330g = r102;
        r16.f2331h = r22;
        r16.f2332i = r9;
        r16.f2333j = r11;
        r16.f2334k = r12;
        r16.f2335l = r13;
        EditText r23 = this.f4625e;
        if ((r23 instanceof C0076Bq) == false) goto L13;
        ColorStateList r24 = ((C0076Bq) r23).getDropDownBackgroundTintList();
    L14:
        Context r52 = getContext();
        if (r24 != null) goto L21;
        Paint r25 = C1021Xq.f3234E;
        TypedValue r26 = AbstractC1293cr.m2539R(r52, io.github.cherrywechat.R.attr.colorSurface, C1021Xq.class.getSimpleName());
        int r62 = r26.resourceId;
        if (r62 == 0) goto L19;
        int r27 = r52.getColor(r62);
    L20:
        r24 = ColorStateList.valueOf(r27);
        goto L21
    L19:
        r27 = r26.data;
    L21:
        C1021Xq r63 = new C1021Xq();
        r63.m1925k(r52);
        r63.m1928n(r24);
        r63.m1927m(r32);
        r63.setShapeAppearanceModel(r16);
        C0935Vq r18 = r63.f3241b;
        if (r18.f2909h != null) goto L24;
        r18.f2909h = new Rect();
    L24:
        r63.f3241b.f2909h.set(0, r4, 0, r4);
        r63.invalidateSelf();
        return r63;
    L13:
        r24 = null;
        goto L14
    L9:
        r32 = getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        goto L10
    L5:
        r2 = 0.0f;
        goto L6
    }

    /* JADX INFO: renamed from: i */
    public final int m2482i(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.f4625e.getCompoundPaddingLeft();
    L7:
        return r32 + r2;
    L10:
        if (getSuffixText() == null) goto L12;
        r32 = this.f4621c.m2060c();
        goto L7
    L4:
        if (getPrefixText() == null) goto L8;
        r32 = this.f4619b.m2004a();
        goto L7
    }

    /* JADX INFO: renamed from: j */
    public final int m2483j(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.f4625e.getCompoundPaddingRight();
    L7:
        return r2 - r32;
    L10:
        if (getPrefixText() == null) goto L12;
        r32 = this.f4619b.m2004a();
        goto L7
    L4:
        if (getSuffixText() == null) goto L8;
        r32 = this.f4621c.m2060c();
        goto L7
    }

    /* JADX INFO: renamed from: k */
    public final void m2484k() {
        int r0 = this.f4609P;
        if (r0 == 0) goto L20;
        if (r0 == 1) goto L19;
        if (r0 != 2) goto L18;
        if (this.f4597D == true) goto L9;
    L15:
        this.f4600G = new C1021Xq(this.f4606M);
    L16:
        this.f4604K = null;
        this.f4605L = null;
    L21:
        m2493u();
        m2498z();
        if (this.f4609P == 1) goto L24;
    L29:
        m2474a();
        if (this.f4609P == 0) goto L32;
        m2494v();
    L32:
        EditText r02 = this.f4625e;
        if ((r02 instanceof AutoCompleteTextView) == false) goto L46;
        AutoCompleteTextView r03 = (AutoCompleteTextView) r02;
        if (r03.getDropDownBackground() != null) goto L44;
        int r3 = this.f4609P;
        if (r3 != 2) goto L41;
        r03.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
        return;
    L41:
        if (r3 != 1) goto L45;
        r03.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
        return;
    L45:
        return;
    L44:
        return;
    L46:
        return;
    L24:
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L27;
        this.f4610Q = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_font_2_0_box_collapsed_padding_top);
        goto L29
    L27:
        if (AbstractC0828TB.m1650t(getContext()) == false) goto L29;
        this.f4610Q = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_font_1_3_box_collapsed_padding_top);
        goto L29
    L9:
        if ((this.f4600G instanceof C2369pc) == true) goto L15;
        C0728Qx r04 = this.f4606M;
        int r4 = C2369pc.f8334H;
        if (r04 != null) goto L14;
        r04 = new C0728Qx();
    L14:
        C2318oc r42 = new C2318oc(r04, new RectF());
        C2369pc r05 = new C2369pc(r42);
        r05.f8335G = r42;
        this.f4600G = r05;
        goto L16
    L18:
        throw new IllegalArgumentException(AbstractC0213Ey.m409g(new StringBuilder(), this.f4609P, " is illegal; only @BoxBackgroundMode constants are supported."));
    L19:
        this.f4600G = new C1021Xq(this.f4606M);
        this.f4604K = new C1021Xq();
        this.f4605L = new C1021Xq();
        goto L21
    L20:
        this.f4600G = null;
        this.f4604K = null;
        this.f4605L = null;
        goto L21
    }

    /* JADX INFO: renamed from: l */
    public final void m2485l() {
        if (m2480g() == false) goto L61;
        int r0 = this.f4625e.getWidth();
        int r1 = this.f4625e.getGravity();
        C2359pa r2 = this.f4662w0;
        boolean r3 = r2.m4783c(r2.f8250B);
        r2.f8252D = r3;
        Rect r4 = r2.f8281d;
        if (r1 != 17) goto L8;
    L23:
        float r32 = r0 / 2.0f;
        float r10 = r2.f8276a0 / 2.0f;
    L17:
        float r33 = r32 - r10;
    L24:
        float r34 = Math.max(r33, r4.left);
        RectF r102 = this.f4620b0;
        r102.left = r34;
        r102.top = r4.top;
        if (r1 != 17) goto L27;
    L44:
        float r02 = (r0 / 2.0f) + (r2.f8276a0 / 2.0f);
    L45:
        r102.right = Math.min(r02, r4.right);
        r102.bottom = r2.m4786f() + r4.top;
        if (r2.f8274Z == null) goto L54;
        if (r2.m4794o() == true) goto L54;
        StaticLayout r03 = r2.f8274Z;
        float r12 = (r2.f8291i / r2.f8289h) * r03.getLineWidth(r03.getLineCount() - 1);
        if (r2.f8252D == false) goto L52;
        r102.left = r102.right - r12;
        goto L54
    L52:
        r102.right = r102.left + r12;
    L54:
        if (r102.width() > 0.0f) goto L56;
        return;
    L56:
        if (r102.height() <= 0.0f) goto L62;
        float r04 = r102.left;
        float r22 = this.f4608O;
        r102.left = r04 - r22;
        r102.right += r22;
        r102.offset(-getPaddingLeft(), ((-getPaddingTop()) - (r102.height() / 2.0f)) + this.f4611R);
        r102.top = 0.0f;
        C2369pc r05 = (C2369pc) this.f4600G;
        r05.getClass();
        r05.m4797t(r102.left, r102.top, r102.right, r102.bottom);
        return;
    L62:
        return;
    L27:
        if ((r1 & 7) == 1) goto L44;
        if ((r1 & 8388613) == 8388613) goto L41;
        if ((r1 & 5) == 5) goto L41;
        if (r2.f8252D == false) goto L38;
        int r06 = r4.right;
    L37:
        r02 = r06;
        goto L45
    L38:
        float r07 = r2.f8276a0;
    L39:
        r02 = r07 + r34;
    L41:
        if (r2.f8252D == false) goto L43;
        r07 = r2.f8276a0;
        goto L39
    L43:
        r06 = r4.right;
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
        r10 = r2.f8276a0;
        goto L17
    L13:
        if ((r1 & 5) == 5) goto L20;
        if (r3 == false) goto L18;
        r32 = r4.right;
        r10 = r2.f8276a0;
        goto L17
    L18:
        r35 = r4.left;
        goto L19
    }

    /* JADX INFO: renamed from: n */
    public final void m2486n(C2304o4 r2, int r3) {
        r2.setTextAppearance(r3);     // Catch: Exception -> L9
        if (r2.getTextColors().getDefaultColor() == (-65281)) goto L7;
        return;
    L7:
        r2.setTextAppearance(io.github.cherrywechat.R.style.TextAppearance_AppCompat_Caption);
        r2.setTextColor(getContext().getColor(io.github.cherrywechat.R.color.design_error));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2487o() {
        C2241ml r0 = this.f4637k;
        if (r0.f7909o == 1) goto L5;
        return false;
    L5:
        if (r0.f7912r != null) goto L7;
        return false;
    L7:
        if (TextUtils.isEmpty(r0.f7910p) == true) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r2) {
        super.onConfigurationChanged(r2);
        this.f4662w0.m4788i(r2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1141ag r0 = this.f4621c;
        r0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean r1 = false;
        this.f4596C0 = false;
        if (this.f4625e == null) goto L8;
        int r02 = Math.max(r0.getMeasuredHeight(), this.f4619b.getMeasuredHeight());
        if (this.f4625e.getMeasuredHeight() >= r02) goto L8;
        this.f4625e.setMinimumHeight(r02);
        r1 = true;
    L8:
        boolean r03 = m2491s();
        if (r1 == true) goto L13;
        if (r03 == true) goto L13;
        return;
    L13:
        this.f4625e.post(new RunnableC0562N2(26, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        super.onLayout(r8, r9, r10, r11, r12);
        EditText r92 = this.f4625e;
        if (r92 == null) goto L75;
        Rect r102 = this.f4616W;
        AbstractC2671wd.m5235a(this, r92, r102);
        C1021Xq r93 = this.f4604K;
        if (r93 == null) goto L7;
        int r112 = r102.bottom;
        r93.setBounds(r102.left, r112 - this.f4612S, r102.right, r112);
    L7:
        C1021Xq r94 = this.f4605L;
        if (r94 == null) goto L11;
        int r113 = r102.bottom;
        r94.setBounds(r102.left, r113 - this.f4613T, r102.right, r113);
    L11:
        if (this.f4597D == false) goto L76;
        float r95 = this.f4625e.getTextSize();
        C2359pa r114 = this.f4662w0;
        float r122 = r114.f8289h;
        TextPaint r0 = r114.f8264P;
        if (r122 == r95) goto L15;
        r114.f8289h = r95;
        r114.m4789j(false);
    L15:
        int r96 = this.f4625e.getGravity();
        int r123 = (r96 & (-113)) | 48;
        if (r114.f8287g == r123) goto L19;
        r114.f8287g = r123;
        r114.m4789j(false);
    L19:
        if (r114.f8285f == r96) goto L21;
        r114.f8285f = r96;
        r114.m4789j(false);
    L21:
        Rect r97 = m2477d(r102);
        int r124 = r97.left;
        int r2 = r97.top;
        int r3 = r97.right;
        int r98 = r97.bottom;
        Rect r4 = r114.f8281d;
        if (r4.left == r124) goto L24;
    L30:
        r4.set(r124, r2, r3, r98);
        r114.f8262N = true;
    L32:
        if (this.f4625e == null) goto L74;
        if (getHintMaxLines() != 1) goto L36;
        r0.setTextSize(r114.f8289h);
        r0.setTypeface(r114.f8307v);
        r0.setLetterSpacing(r114.f8272X);
        float r99 = -r0.ascent();
    L37:
        int r22 = this.f4625e.getCompoundPaddingLeft() + r102.left;
        Rect r125 = this.f4618a0;
        r125.left = r22;
        if (this.f4609P != 1) goto L43;
        if (this.f4625e.getMinLines() > 1) goto L43;
        int r02 = (int) (r102.centerY() - (r99 / 2.0f));
    L50:
        r125.top = r02;
        r125.right = r102.right - this.f4625e.getCompoundPaddingRight();
        if (this.f4609P == 1) goto L53;
    L55:
        int r910 = r102.bottom - this.f4625e.getCompoundPaddingBottom();
    L56:
        r125.bottom = r910;
        int r103 = r125.left;
        int r03 = r125.top;
        int r126 = r125.right;
        Rect r23 = r114.f8279c;
        if (r23.left == r103) goto L59;
    L66:
        r23.set(r103, r03, r126, r910);
        r114.f8262N = true;
        r114.f8296k0 = true;
    L67:
        r114.m4789j(false);
        if (m2480g() == true) goto L70;
        return;
    L70:
        if (this.f4660v0 == true) goto L78;
        m2485l();
        return;
    L78:
        return;
    L59:
        if (r23.top != r03) goto L66;
        if (r23.right != r126) goto L66;
        if (r23.bottom != r910) goto L66;
        if (true == r114.f8296k0) goto L67;
    L53:
        if (this.f4625e.getMinLines() > 1) goto L55;
        r910 = (int) (r125.top + r99);
    L43:
        if (this.f4609P == 0) goto L45;
    L48:
        int r04 = 0;
    L49:
        r02 = (this.f4625e.getCompoundPaddingTop() + r102.top) - r04;
        goto L50
    L45:
        if (getHintMaxLines() == 1) goto L48;
        r0.setTextSize(r114.f8289h);
        r0.setTypeface(r114.f8307v);
        r0.setLetterSpacing(r114.f8272X);
        r04 = (int) ((-r0.ascent()) / 2.0f);
        goto L49
    L36:
        r0.setTextSize(r114.f8289h);
        r0.setTypeface(r114.f8307v);
        r0.setLetterSpacing(r114.f8272X);
        r99 = r114.f8297l * (r0.descent() + (-r0.ascent()));
        goto L37
    L74:
        throw new IllegalStateException();
    L24:
        if (r4.top != r2) goto L30;
        if (r4.right != r3) goto L30;
        if (r4.bottom != r98) goto L30;
    L76:
        return;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        boolean r82 = this.f4596C0;
        C1141ag r0 = this.f4621c;
        if (r82 == true) goto L6;
        r0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f4596C0 = true;
    L6:
        if (this.f4657u == null) goto L10;
        EditText r83 = this.f4625e;
        if (r83 == null) goto L10;
        this.f4657u.setGravity(r83.getGravity());
        this.f4657u.setPadding(this.f4625e.getCompoundPaddingLeft(), this.f4625e.getCompoundPaddingTop(), this.f4625e.getCompoundPaddingRight(), this.f4625e.getCompoundPaddingBottom());
    L10:
        r0.m2070m();
        if (getHintMaxLines() == 1) goto L45;
        int r84 = (this.f4625e.getMeasuredWidth() - this.f4625e.getCompoundPaddingLeft()) - this.f4625e.getCompoundPaddingRight();
        C2359pa r02 = this.f4662w0;
        TextPaint r2 = r02.f8264P;
        r2.setTextSize(r02.f8291i);
        r2.setTypeface(r02.f8304s);
        r2.setLetterSpacing(r02.f8271W);
        float r6 = r84;
        r02.f8292i0 = r02.m4785e(r02.f8286f0, r2, r02.f8250B, (r02.f8291i / r02.f8289h) * r6, r02.f8252D).getHeight();
        r2.setTextSize(r02.f8289h);
        r2.setTypeface(r02.f8307v);
        r2.setLetterSpacing(r02.f8272X);
        r02.f8294j0 = r02.m4785e(r02.f8284e0, r2, r02.f8250B, r6, r02.f8252D).getHeight();
        EditText r1 = this.f4625e;
        Rect r22 = this.f4616W;
        AbstractC2671wd.m5235a(this, r1, r22);
        Rect r12 = m2477d(r22);
        int r23 = r12.left;
        int r3 = r12.top;
        int r4 = r12.right;
        int r13 = r12.bottom;
        Rect r5 = r02.f8281d;
        if (r5.left == r23) goto L16;
    L22:
        r5.set(r23, r3, r4, r13);
        r02.f8262N = true;
    L23:
        m2494v();
        m2474a();
        if (this.f4625e == null) goto L46;
        int r14 = r02.f8294j0;
        if (r14 == (-1)) goto L29;
        float r15 = r14;
    L30:
        float r32 = 0.0f;
        if (this.f4653s == null) goto L40;
        TextPaint r24 = new TextPaint(129);
        r24.set(this.f4657u.getPaint());
        r24.setTextSize(this.f4657u.getTextSize());
        r24.setTypeface(this.f4657u.getTypeface());
        r24.setLetterSpacing(this.f4657u.getLetterSpacing());
        C1520hz r52 = new C1520hz(this.f4653s, r24, r84);
        if (getLayoutDirection() != 1) goto L35;
        boolean r85 = true;
    L36:
        r52.f5387k = r85;
        r52.f5386j = true;
        float r86 = this.f4657u.getLineSpacingExtra();
        float r25 = this.f4657u.getLineSpacingMultiplier();
        r52.f5383g = r86;
        r52.f5384h = r25;
        r52.f5389m = new C2464rl(4, this);
        StaticLayout r87 = r52.m2900a();
        if (this.f4609P != 1) goto L39;
        r32 = (r02.m4786f() + this.f4610Q) + this.f4623d;
    L39:
        r32 = r32 + r87.getHeight();
        goto L40
    L35:
        r85 = false;
    L40:
        float r88 = Math.max(r15, r32);
        if (this.f4625e.getMeasuredHeight() >= r88) goto L44;
        this.f4625e.setMinimumHeight(Math.round(r88));
        return;
    L44:
        return;
    L29:
        TextPaint r16 = r02.f8264P;
        r16.setTextSize(r02.f8289h);
        r16.setTypeface(r02.f8307v);
        r16.setLetterSpacing(r02.f8272X);
        r15 = -r16.ascent();
        goto L30
    L46:
        return;
    L16:
        if (r5.top != r3) goto L22;
        if (r5.right != r4) goto L22;
        if (r5.bottom != r13) goto L22;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C2705xA) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C2705xA r22 = (C2705xA) r2;
        super.onRestoreInstanceState(r22.f8397a);
        setError(r22.f9280c);
        if (r22.f9281d == false) goto L9;
        post(new RunnableC0431K0(15, this));
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
        if (r0 == this.f4607N) goto L10;
        InterfaceC1006Xb r142 = this.f4606M.f2328e;
        RectF r1 = this.f4620b0;
        float r143 = r142.mo1563a(r1);
        float r2 = this.f4606M.f2329f.mo1563a(r1);
        float r3 = this.f4606M.f2331h.mo1563a(r1);
        float r12 = this.f4606M.f2330g.mo1563a(r1);
        C0728Qx r4 = this.f4606M;
        AbstractC0828TB r5 = r4.f2324a;
        AbstractC0828TB r6 = r4.f2325b;
        AbstractC0828TB r7 = r4.f2327d;
        AbstractC0828TB r42 = r4.f2326c;
        C1456gf r8 = new C1456gf(0);
        C1456gf r9 = new C1456gf(0);
        C1456gf r10 = new C1456gf(0);
        C1456gf r11 = new C1456gf(0);
        C2436r r122 = new C2436r(r2);
        C2436r r22 = new C2436r(r143);
        C2436r r144 = new C2436r(r12);
        C2436r r13 = new C2436r(r3);
        C0728Qx r32 = new C0728Qx();
        r32.f2324a = r6;
        r32.f2325b = r5;
        r32.f2326c = r7;
        r32.f2327d = r42;
        r32.f2328e = r122;
        r32.f2329f = r22;
        r32.f2330g = r13;
        r32.f2331h = r144;
        r32.f2332i = r8;
        r32.f2333j = r9;
        r32.f2334k = r10;
        r32.f2335l = r11;
        this.f4607N = r0;
        setShapeAppearanceModel(r32);
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2705xA r1 = new C2705xA(super.onSaveInstanceState());
        if (m2487o() == false) goto L5;
        r1.f9280c = getError();
    L5:
        C1141ag r0 = this.f4621c;
        if (r0.f3614i != 0) goto L8;
    L10:
        boolean r02 = false;
    L11:
        r1.f9281d = r02;
        return r1;
    L8:
        if (r0.f3612g.f4545d == false) goto L10;
        r02 = true;
        goto L11
    }

    /* JADX INFO: renamed from: p */
    public final void m2488p(Editable r10) {
        ((C2438r1) this.f4645o).getClass();
        if (r10 == null) goto L5;
        int r102 = r10.length();
    L6:
        boolean r1 = this.f4643n;
        int r2 = this.f4641m;
        String r4 = null;
        if (r2 != (-1)) goto L10;
        this.f4647p.setText(String.valueOf(r102));
        this.f4647p.setContentDescription(null);
        this.f4643n = false;
    L30:
        if (this.f4625e != null) goto L32;
        return;
    L32:
        if (r1 == this.f4643n) goto L36;
        m2495w(false, false);
        m2498z();
        m2492t();
        return;
    L36:
        return;
    L10:
        if (r102 <= r2) goto L12;
        boolean r22 = true;
    L13:
        this.f4643n = r22;
        Context r23 = getContext();
        C2304o4 r5 = this.f4647p;
        int r6 = this.f4641m;
        if (this.f4643n == false) goto L16;
        int r7 = io.github.cherrywechat.R.string.character_counter_overflowed_content_description;
    L17:
        r5.setContentDescription(r23.getString(r7, new Object[]{Integer.valueOf(r102), Integer.valueOf(r6)}));
        if (r1 == this.f4643n) goto L20;
        m2489q();
    L20:
        String r24 = C0264G5.f846b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) goto L23;
        C0264G5 r25 = C0264G5.f849e;
    L24:
        C2304o4 r3 = this.f4647p;
        String r103 = getContext().getString(io.github.cherrywechat.R.string.character_counter_pattern, new Object[]{Integer.valueOf(r102), Integer.valueOf(this.f4641m)});
        r25.getClass();
        C1037Y5 r52 = AbstractC2447rA.f8572a;
        if (r103 == null) goto L28;
        r4 = r25.m550c(r103).toString();
    L28:
        r3.setText(r4);
        goto L30
    L23:
        r25 = C0264G5.f848d;
        goto L24
    L16:
        r7 = io.github.cherrywechat.R.string.character_counter_content_description;
        goto L17
    L12:
        r22 = false;
        goto L13
    L5:
        r102 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: q */
    public final void m2489q() {
        C2304o4 r0 = this.f4647p;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f4643n == false) goto L7;
        int r1 = this.f4649q;
    L8:
        m2486n(r0, r1);
        if (this.f4643n == true) goto L14;
        ColorStateList r02 = this.f4667z;
        if (r02 == null) goto L14;
        this.f4647p.setTextColor(r02);
    L14:
        if (this.f4643n == false) goto L20;
        ColorStateList r03 = this.f4591A;
        if (r03 == null) goto L21;
        this.f4647p.setTextColor(r03);
        return;
    L21:
        return;
    L20:
        return;
    L7:
        r1 = this.f4651r;
        goto L8
    }

    /* JADX INFO: renamed from: r */
    public final void m2490r() {
        ColorStateList r0 = this.f4593B;
        if (r0 != null) goto L14;
        Context r02 = getContext();
        TypedValue r1 = AbstractC1293cr.m2537P(r02, io.github.cherrywechat.R.attr.colorControlActivated);
        if (r1 != null) goto L8;
    L7:
        r0 = null;
        goto L14
    L8:
        int r3 = r1.resourceId;
        if (r3 == 0) goto L11;
        r0 = AbstractC0295Gu.m622o(r02, r3);
        goto L14
    L11:
        int r03 = r1.data;
        if (r03 == 0) goto L7;
        r0 = ColorStateList.valueOf(r03);
    L14:
        EditText r12 = this.f4625e;
        if (r12 != null) goto L17;
        return;
    L17:
        if (AbstractC0688Q.m1402f(r12) == null) goto L31;
        Drawable r13 = AbstractC0688Q.m1402f(this.f4625e).mutate();
        if (m2487o() == false) goto L22;
    L25:
        ColorStateList r2 = this.f4595C;
        if (r2 == null) goto L28;
        r0 = r2;
    L28:
        r13.setTintList(r0);
        return;
    L22:
        if (this.f4647p == null) goto L28;
        if (this.f4643n == false) goto L28;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2491s() {
        if (this.f4625e != null) goto L5;
        return false;
    L5:
        CheckableImageButton r2 = null;
        boolean r5 = true;
        if (getStartIconDrawable() == null) goto L8;
    L11:
        C1072Yy r0 = this.f4619b;
        if (r0.getMeasuredWidth() <= 0) goto L22;
        int r02 = r0.getMeasuredWidth() - this.f4625e.getPaddingLeft();
        if (this.f4624d0 != null) goto L16;
    L17:
        ColorDrawable r6 = new ColorDrawable();
        this.f4624d0 = r6;
        this.f4626e0 = r02;
        r6.setBounds(0, 0, r02, 1);
    L18:
        Drawable[] r03 = this.f4625e.getCompoundDrawablesRelative();
        Drawable r62 = r03[0];
        ColorDrawable r7 = this.f4624d0;
        if (r62 == r7) goto L25;
        this.f4625e.setCompoundDrawablesRelative(r7, r03[1], r03[2], r03[3]);
    L24:
        boolean r04 = true;
    L26:
        C1141ag r63 = this.f4621c;
        if (r63.m2062e() == true) goto L35;
        if (r63.f3614i == 0) goto L33;
        if (r63.m2061d() == true) goto L35;
    L33:
        if (r63.f3621p != null) goto L35;
    L59:
        if (this.f4630g0 == null) goto L66;
        Drawable[] r64 = this.f4625e.getCompoundDrawablesRelative();
        if (r64[2] != this.f4630g0) goto L63;
        this.f4625e.setCompoundDrawablesRelative(r64[0], r64[1], this.f4634i0, r64[3]);
    L64:
        this.f4630g0 = null;
        return r5;
    L63:
        r5 = r04;
    L66:
        return r04;
    L35:
        if (r63.getMeasuredWidth() <= 0) goto L59;
        int r72 = r63.f3622q.getMeasuredWidth() - this.f4625e.getPaddingRight();
        if (r63.m2062e() == false) goto L40;
        r2 = r63.f3608c;
    L44:
        if (r2 == null) goto L46;
        r72 = ((ViewGroup.MarginLayoutParams) r2.getLayoutParams()).getMarginStart() + (r2.getMeasuredWidth() + r72);
    L46:
        Drawable[] r22 = this.f4625e.getCompoundDrawablesRelative();
        ColorDrawable r65 = this.f4630g0;
        if (r65 != null) goto L49;
    L52:
        if (r65 != null) goto L54;
        ColorDrawable r66 = new ColorDrawable();
        this.f4630g0 = r66;
        this.f4632h0 = r72;
        r66.setBounds(0, 0, r72, 1);
    L54:
        Drawable r3 = r22[2];
        ColorDrawable r67 = this.f4630g0;
        if (r3 == r67) goto L66;
        this.f4634i0 = r3;
        this.f4625e.setCompoundDrawablesRelative(r22[0], r22[1], r67, r22[3]);
        return true;
    L49:
        if (this.f4632h0 == r72) goto L52;
        this.f4632h0 = r72;
        r65.setBounds(0, 0, r72, 1);
        this.f4625e.setCompoundDrawablesRelative(r22[0], r22[1], this.f4630g0, r22[3]);
        return true;
    L40:
        if (r63.f3614i == 0) goto L44;
        if (r63.m2061d() == false) goto L44;
        r2 = r63.f3612g;
    L25:
        r04 = false;
        goto L26
    L16:
        if (this.f4626e0 == r02) goto L18;
    L22:
        if (this.f4624d0 == null) goto L25;
        Drawable[] r05 = this.f4625e.getCompoundDrawablesRelative();
        this.f4625e.setCompoundDrawablesRelative(null, r05[1], r05[2], r05[3]);
        this.f4624d0 = null;
        goto L24
    L8:
        if (getPrefixText() == null) goto L22;
        if (getPrefixTextView().getVisibility() != 0) goto L22;
        goto L11
    }

    public void setBoxBackgroundColor(int r2) {
        if (this.f4615V == r2) goto L6;
        this.f4615V = r2;
        this.f4648p0 = r2;
        this.f4652r0 = r2;
        this.f4654s0 = r2;
        m2476c();
        return;
    }

    public void setBoxBackgroundColorResource(int r2) {
        setBoxBackgroundColor(getContext().getColor(r2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList r4) {
        int r0 = r4.getDefaultColor();
        this.f4648p0 = r0;
        this.f4615V = r0;
        this.f4650q0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.f4652r0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4654s0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2476c();
    }

    public void setBoxBackgroundMode(int r2) {
        if (r2 == this.f4609P) goto L10;
        this.f4609P = r2;
        if (this.f4625e == null) goto L9;
        m2484k();
        return;
    L9:
        return;
    }

    public void setBoxCollapsedPaddingTop(int r1) {
        this.f4610Q = r1;
    }

    public void setBoxCornerFamily(int r4) {
        C0685Px r0 = this.f4606M.m1516f();
        InterfaceC1006Xb r1 = this.f4606M.f2328e;
        r0.f2192a = AbstractC1406fG.m2687L(r4);
        r0.f2196e = r1;
        InterfaceC1006Xb r12 = this.f4606M.f2329f;
        r0.f2193b = AbstractC1406fG.m2687L(r4);
        r0.f2197f = r12;
        InterfaceC1006Xb r13 = this.f4606M.f2331h;
        r0.f2195d = AbstractC1406fG.m2687L(r4);
        r0.f2199h = r13;
        InterfaceC1006Xb r14 = this.f4606M.f2330g;
        r0.f2194c = AbstractC1406fG.m2687L(r4);
        r0.f2198g = r14;
        this.f4606M = r0.m1383a();
        m2476c();
    }

    public void setBoxStrokeColor(int r2) {
        if (this.f4644n0 == r2) goto L6;
        this.f4644n0 = r2;
        m2498z();
        return;
    }

    public void setBoxStrokeColorStateList(ColorStateList r4) {
        if (r4.isStateful() == false) goto L6;
        this.f4640l0 = r4.getDefaultColor();
        this.f4656t0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.f4642m0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        this.f4644n0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
    L8:
        m2498z();
        return;
    L6:
        if (this.f4644n0 == r4.getDefaultColor()) goto L8;
        this.f4644n0 = r4.getDefaultColor();
        goto L8
    }

    public void setBoxStrokeErrorColor(ColorStateList r2) {
        if (this.f4646o0 == r2) goto L6;
        this.f4646o0 = r2;
        m2498z();
        return;
    }

    public void setBoxStrokeWidth(int r1) {
        this.f4612S = r1;
        m2498z();
    }

    public void setBoxStrokeWidthFocused(int r1) {
        this.f4613T = r1;
        m2498z();
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(r2));
    }

    public void setBoxStrokeWidthResource(int r2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(r2));
    }

    public void setCounterEnabled(boolean r6) {
        if (this.f4639l == r6) goto L19;
        C2241ml r1 = this.f4637k;
        Editable r2 = null;
        if (r6 == false) goto L16;
        C2304o4 r3 = new C2304o4(getContext(), null);
        this.f4647p = r3;
        r3.setId(io.github.cherrywechat.R.id.textinput_counter);
        Typeface r32 = this.f4622c0;
        if (r32 == null) goto L9;
        this.f4647p.setTypeface(r32);
    L9:
        this.f4647p.setMaxLines(1);
        r1.m4541a(this.f4647p, 2);
        ((ViewGroup.MarginLayoutParams) this.f4647p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_textinput_counter_margin_start));
        m2489q();
        if (this.f4647p == null) goto L17;
        EditText r0 = this.f4625e;
        if (r0 == null) goto L15;
        r2 = r0.getText();
    L15:
        m2488p(r2);
    L17:
        this.f4639l = r6;
        return;
    L16:
        r1.m4547g(this.f4647p, 2);
        this.f4647p = null;
        goto L17
    }

    public void setCounterMaxLength(int r2) {
        if (this.f4641m == r2) goto L17;
        if (r2 <= 0) goto L6;
        this.f4641m = r2;
    L8:
        if (this.f4639l == true) goto L10;
        return;
    L10:
        if (this.f4647p == null) goto L19;
        EditText r22 = this.f4625e;
        if (r22 != null) goto L14;
        Editable r23 = null;
    L15:
        m2488p(r23);
        return;
    L14:
        r23 = r22.getText();
        goto L15
    L19:
        return;
    L6:
        this.f4641m = -1;
        goto L8
    }

    public void setCounterOverflowTextAppearance(int r2) {
        if (this.f4649q == r2) goto L6;
        this.f4649q = r2;
        m2489q();
        return;
    }

    public void setCounterOverflowTextColor(ColorStateList r2) {
        if (this.f4591A == r2) goto L6;
        this.f4591A = r2;
        m2489q();
        return;
    }

    public void setCounterTextAppearance(int r2) {
        if (this.f4651r == r2) goto L6;
        this.f4651r = r2;
        m2489q();
        return;
    }

    public void setCounterTextColor(ColorStateList r2) {
        if (this.f4667z == r2) goto L6;
        this.f4667z = r2;
        m2489q();
        return;
    }

    public void setCursorColor(ColorStateList r2) {
        if (this.f4593B == r2) goto L6;
        this.f4593B = r2;
        m2490r();
        return;
    }

    public void setCursorErrorColor(ColorStateList r2) {
        if (this.f4595C == r2) goto L15;
        this.f4595C = r2;
        if (m2487o() == false) goto L7;
    L12:
        m2490r();
        return;
    L7:
        if (this.f4647p != null) goto L9;
        return;
    L9:
        if (this.f4643n == true) goto L12;
        return;
    }

    public void setDefaultHintTextColor(ColorStateList r1) {
        this.f4636j0 = r1;
        this.f4638k0 = r1;
        if (this.f4625e == null) goto L6;
        m2495w(false, false);
        return;
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
        m2473m(this, r1);
        super.setEnabled(r1);
    }

    public void setEndIconActivated(boolean r2) {
        this.f4621c.f3612g.setActivated(r2);
    }

    public void setEndIconCheckable(boolean r2) {
        this.f4621c.f3612g.setCheckable(r2);
    }

    public void setEndIconContentDescription(int r3) {
        C1141ag r0 = this.f4621c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r0.getResources().getText(r3);
    L6:
        CheckableImageButton r02 = r0.f3612g;
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
        C1141ag r0 = this.f4621c;
        if (r5 == 0) goto L5;
        Drawable r52 = AbstractC1406fG.m2695U(r0.getContext(), r5);
    L6:
        TextInputLayout r1 = r0.f3606a;
        CheckableImageButton r2 = r0.f3612g;
        r2.setImageDrawable(r52);
        if (r52 == null) goto L10;
        AbstractC0295Gu.m608a(r1, r2, r0.f3616k, r0.f3617l);
        AbstractC0295Gu.m600A(r1, r2, r0.f3616k);
        return;
    L10:
        return;
    L5:
        r52 = null;
        goto L6
    }

    public void setEndIconMinSize(int r3) {
        C1141ag r0 = this.f4621c;
        if (r3 >= 0) goto L5;
        r0.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L5:
        if (r3 == r0.f3618m) goto L10;
        r0.f3618m = r3;
        CheckableImageButton r1 = r0.f3612g;
        r1.setMinimumWidth(r3);
        r1.setMinimumHeight(r3);
        CheckableImageButton r02 = r0.f3608c;
        r02.setMinimumWidth(r3);
        r02.setMinimumHeight(r3);
        return;
    }

    public void setEndIconMode(int r2) {
        this.f4621c.m2064g(r2);
    }

    public void setEndIconOnClickListener(View.OnClickListener r3) {
        C1141ag r0 = this.f4621c;
        CheckableImageButton r1 = r0.f3612g;
        View.OnLongClickListener r02 = r0.f3620o;
        r1.setOnClickListener(r3);
        AbstractC0295Gu.m602C(r1, r02);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener r2) {
        C1141ag r0 = this.f4621c;
        r0.f3620o = r2;
        CheckableImageButton r02 = r0.f3612g;
        r02.setOnLongClickListener(r2);
        AbstractC0295Gu.m602C(r02, r2);
    }

    public void setEndIconScaleType(ImageView.ScaleType r3) {
        C1141ag r0 = this.f4621c;
        r0.f3619n = r3;
        r0.f3612g.setScaleType(r3);
        r0.f3608c.setScaleType(r3);
    }

    public void setEndIconTintList(ColorStateList r4) {
        C1141ag r0 = this.f4621c;
        if (r0.f3616k == r4) goto L6;
        r0.f3616k = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3612g, r4, r0.f3617l);
        return;
    }

    public void setEndIconTintMode(PorterDuff.Mode r4) {
        C1141ag r0 = this.f4621c;
        if (r0.f3617l == r4) goto L6;
        r0.f3617l = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3612g, r0.f3616k, r4);
        return;
    }

    public void setEndIconVisible(boolean r2) {
        this.f4621c.m2065h(r2);
    }

    public void setError(CharSequence r5) {
        C2241ml r0 = this.f4637k;
        if (r0.f7911q == true) goto L9;
        if (TextUtils.isEmpty(r5) == false) goto L7;
        return;
    L7:
        setErrorEnabled(true);
    L9:
        if (TextUtils.isEmpty(r5) == true) goto L15;
        r0.m4543c();
        r0.f7910p = r5;
        r0.f7912r.setText(r5);
        int r1 = r0.f7908n;
        if (r1 == 1) goto L13;
        r0.f7909o = 1;
    L13:
        r0.m4549i(r1, r0.f7909o, r0.m4548h(r0.f7912r, r5));
        return;
    L15:
        r0.m4546f();
    }

    public void setErrorAccessibilityLiveRegion(int r2) {
        C2241ml r0 = this.f4637k;
        r0.f7914t = r2;
        C2304o4 r02 = r0.f7912r;
        if (r02 == null) goto L6;
        r02.setAccessibilityLiveRegion(r2);
        return;
    }

    public void setErrorContentDescription(CharSequence r2) {
        C2241ml r0 = this.f4637k;
        r0.f7913s = r2;
        C2304o4 r02 = r0.f7912r;
        if (r02 == null) goto L6;
        r02.setContentDescription(r2);
        return;
    }

    public void setErrorEnabled(boolean r6) {
        C2241ml r0 = this.f4637k;
        TextInputLayout r1 = r0.f7902h;
        if (r0.f7911q != r6) goto L5;
        return;
    L5:
        r0.m4543c();
        if (r6 == false) goto L24;
        C2304o4 r12 = new C2304o4(r0.f7901g, null);
        r0.f7912r = r12;
        r12.setId(io.github.cherrywechat.R.id.textinput_error);
        r0.f7912r.setTextAlignment(5);
        Typeface r13 = r0.f7894B;
        if (r13 == null) goto L10;
        r0.f7912r.setTypeface(r13);
    L10:
        int r14 = r0.f7915u;
        r0.f7915u = r14;
        C2304o4 r3 = r0.f7912r;
        if (r3 == null) goto L13;
        r0.f7902h.m2486n(r3, r14);
    L13:
        ColorStateList r15 = r0.f7916v;
        r0.f7916v = r15;
        C2304o4 r32 = r0.f7912r;
        if (r32 == null) goto L17;
        if (r15 == null) goto L17;
        r32.setTextColor(r15);
    L17:
        CharSequence r16 = r0.f7913s;
        r0.f7913s = r16;
        C2304o4 r33 = r0.f7912r;
        if (r33 == null) goto L20;
        r33.setContentDescription(r16);
    L20:
        int r17 = r0.f7914t;
        r0.f7914t = r17;
        C2304o4 r34 = r0.f7912r;
        if (r34 == null) goto L23;
        r34.setAccessibilityLiveRegion(r17);
    L23:
        r0.f7912r.setVisibility(4);
        r0.m4541a(r0.f7912r, 0);
    L25:
        r0.f7911q = r6;
        return;
    L24:
        r0.m4546f();
        r0.m4547g(r0.f7912r, 0);
        r0.f7912r = null;
        r1.m2492t();
        r1.m2498z();
        goto L25
    }

    public void setErrorIconDrawable(int r3) {
        C1141ag r0 = this.f4621c;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC1406fG.m2695U(r0.getContext(), r3);
    L6:
        r0.m2066i(r32);
        AbstractC0295Gu.m600A(r0.f3606a, r0.f3608c, r0.f3609d);
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setErrorIconOnClickListener(View.OnClickListener r3) {
        C1141ag r0 = this.f4621c;
        CheckableImageButton r1 = r0.f3608c;
        View.OnLongClickListener r02 = r0.f3611f;
        r1.setOnClickListener(r3);
        AbstractC0295Gu.m602C(r1, r02);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener r2) {
        C1141ag r0 = this.f4621c;
        r0.f3611f = r2;
        CheckableImageButton r02 = r0.f3608c;
        r02.setOnLongClickListener(r2);
        AbstractC0295Gu.m602C(r02, r2);
    }

    public void setErrorIconTintList(ColorStateList r4) {
        C1141ag r0 = this.f4621c;
        if (r0.f3609d == r4) goto L6;
        r0.f3609d = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3608c, r4, r0.f3610e);
        return;
    }

    public void setErrorIconTintMode(PorterDuff.Mode r4) {
        C1141ag r0 = this.f4621c;
        if (r0.f3610e == r4) goto L6;
        r0.f3610e = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3608c, r0.f3609d, r4);
        return;
    }

    public void setErrorTextAppearance(int r3) {
        C2241ml r0 = this.f4637k;
        r0.f7915u = r3;
        C2304o4 r1 = r0.f7912r;
        if (r1 == null) goto L6;
        r0.f7902h.m2486n(r1, r3);
        return;
    }

    public void setErrorTextColor(ColorStateList r2) {
        C2241ml r0 = this.f4637k;
        r0.f7916v = r2;
        C2304o4 r02 = r0.f7912r;
        if (r02 == null) goto L7;
        if (r2 == null) goto L8;
        r02.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setExpandedHintEnabled(boolean r2) {
        if (this.f4664x0 == r2) goto L6;
        this.f4664x0 = r2;
        m2495w(false, false);
        return;
    }

    public void setHelperText(CharSequence r5) {
        boolean r0 = TextUtils.isEmpty(r5);
        C2241ml r1 = this.f4637k;
        if (r0 == false) goto L9;
        if (r1.f7918x == false) goto L16;
        setHelperTextEnabled(false);
        return;
    L16:
        return;
    L9:
        if (r1.f7918x == true) goto L11;
        setHelperTextEnabled(true);
    L11:
        r1.m4543c();
        r1.f7917w = r5;
        r1.f7919y.setText(r5);
        int r02 = r1.f7908n;
        if (r02 == 2) goto L14;
        r1.f7909o = 2;
    L14:
        r1.m4549i(r02, r1.f7909o, r1.m4548h(r1.f7919y, r5));
    }

    public void setHelperTextColor(ColorStateList r2) {
        C2241ml r0 = this.f4637k;
        r0.f7893A = r2;
        C2304o4 r02 = r0.f7919y;
        if (r02 == null) goto L7;
        if (r2 == null) goto L8;
        r02.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setHelperTextEnabled(boolean r9) {
        C2241ml r0 = this.f4637k;
        TextInputLayout r1 = r0.f7902h;
        if (r0.f7918x != r9) goto L5;
        return;
    L5:
        r0.m4543c();
        if (r9 == false) goto L18;
        C2304o4 r12 = new C2304o4(r0.f7901g, null);
        r0.f7919y = r12;
        r12.setId(io.github.cherrywechat.R.id.textinput_helper_text);
        r0.f7919y.setTextAlignment(5);
        Typeface r13 = r0.f7894B;
        if (r13 == null) goto L10;
        r0.f7919y.setTypeface(r13);
    L10:
        r0.f7919y.setVisibility(4);
        r0.f7919y.setAccessibilityLiveRegion(1);
        int r14 = r0.f7920z;
        r0.f7920z = r14;
        C2304o4 r2 = r0.f7919y;
        if (r2 == null) goto L13;
        r2.setTextAppearance(r14);
    L13:
        ColorStateList r15 = r0.f7893A;
        r0.f7893A = r15;
        C2304o4 r22 = r0.f7919y;
        if (r22 == null) goto L17;
        if (r15 == null) goto L17;
        r22.setTextColor(r15);
    L17:
        r0.m4541a(r0.f7919y, 1);
        r0.f7919y.setAccessibilityDelegate(new C2198ll(r0));
    L22:
        r0.f7918x = r9;
        return;
    L18:
        r0.m4543c();
        int r4 = r0.f7908n;
        if (r4 != 2) goto L21;
        r0.f7909o = 0;
    L21:
        r0.m4549i(r4, r0.f7909o, r0.m4548h(r0.f7919y, ""));
        r0.m4547g(r0.f7919y, 1);
        r0.f7919y = null;
        r1.m2492t();
        r1.m2498z();
        goto L22
    }

    public void setHelperTextTextAppearance(int r2) {
        C2241ml r0 = this.f4637k;
        r0.f7920z = r2;
        C2304o4 r02 = r0.f7919y;
        if (r02 == null) goto L6;
        r02.setTextAppearance(r2);
        return;
    }

    public void setHint(CharSequence r2) {
        if (this.f4597D == false) goto L6;
        setHintInternal(r2);
        sendAccessibilityEvent(2048);
        return;
    }

    public void setHintAnimationEnabled(boolean r1) {
        this.f4666y0 = r1;
    }

    public void setHintEnabled(boolean r3) {
        if (r3 == this.f4597D) goto L23;
        this.f4597D = r3;
        if (r3 == true) goto L12;
        this.f4599F = false;
        if (TextUtils.isEmpty(this.f4598E) == false) goto L9;
    L11:
        setHintInternal(null);
    L20:
        if (this.f4625e == null) goto L24;
        m2494v();
        return;
    L24:
        return;
    L9:
        if (TextUtils.isEmpty(this.f4625e.getHint()) == false) goto L11;
        this.f4625e.setHint(this.f4598E);
        goto L11
    L12:
        CharSequence r32 = this.f4625e.getHint();
        if (TextUtils.isEmpty(r32) == false) goto L15;
    L18:
        this.f4599F = true;
        goto L20
    L15:
        if (TextUtils.isEmpty(this.f4598E) == false) goto L17;
        setHint(r32);
    L17:
        this.f4625e.setHint(null);
        goto L18
    }

    public void setHintMaxLines(int r4) {
        C2359pa r0 = this.f4662w0;
        if (r4 == r0.f8286f0) goto L6;
        r0.f8286f0 = r4;
        r0.m4789j(false);
    L6:
        if (r4 == r0.f8284e0) goto L8;
        r0.f8284e0 = r4;
        r0.m4789j(false);
    L8:
        requestLayout();
    }

    public void setHintTextAppearance(int r6) {
        C2359pa r1 = this.f4662w0;
        TextInputLayout r2 = r1.f8275a;
        C2404qA r0 = new C2404qA(r2.getContext(), r6);
        ColorStateList r62 = r0.f8432k;
        if (r62 == null) goto L5;
        r1.f8295k = r62;
    L5:
        float r63 = r0.f8433l;
        if (r63 == 0.0f) goto L8;
        r1.f8291i = r63;
    L8:
        ColorStateList r64 = r0.f8422a;
        if (r64 == null) goto L11;
        r1.f8270V = r64;
    L11:
        r1.f8268T = r0.f8427f;
        r1.f8269U = r0.f8428g;
        r1.f8267S = r0.f8429h;
        r1.f8271W = r0.f8431j;
        C0437K6 r65 = r1.f8311z;
        if (r65 == null) goto L14;
        r65.f1436p = true;
    L14:
        C0132D2 r3 = new C0132D2(10, r1);
        r0.m4837a();
        r1.f8311z = new C0437K6(r3, r0.f8437p);
        r0.m4838b(r2.getContext(), r1.f8311z);
        r1.m4789j(false);
        this.f4638k0 = r1.f8295k;
        if (this.f4625e == null) goto L18;
        m2495w(false, false);
        m2494v();
        return;
    }

    public void setHintTextColor(ColorStateList r4) {
        if (this.f4638k0 != r4) goto L5;
        return;
    L5:
        if (this.f4636j0 != null) goto L9;
        C2359pa r0 = this.f4662w0;
        if (r0.f8295k == r4) goto L9;
        r0.f8295k = r4;
        r0.m4789j(false);
    L9:
        this.f4638k0 = r4;
        if (this.f4625e == null) goto L14;
        m2495w(false, false);
        return;
    }

    public void setLengthCounter(InterfaceC2662wA r1) {
        this.f4645o = r1;
    }

    public void setMaxEms(int r3) {
        this.f4631h = r3;
        EditText r0 = this.f4625e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMaxEms(r3);
        return;
    }

    public void setMaxWidth(int r3) {
        this.f4635j = r3;
        EditText r0 = this.f4625e;
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
        this.f4629g = r3;
        EditText r0 = this.f4625e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r0.setMinEms(r3);
        return;
    }

    public void setMinWidth(int r3) {
        this.f4633i = r3;
        EditText r0 = this.f4625e;
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
        C1141ag r0 = this.f4621c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r0.getResources().getText(r3);
    L6:
        r0.f3612g.setContentDescription(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
        C1141ag r0 = this.f4621c;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC1406fG.m2695U(r0.getContext(), r3);
    L6:
        r0.f3612g.setImageDrawable(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r4) {
        C1141ag r0 = this.f4621c;
        if (r4 == true) goto L5;
    L8:
        if (r4 == true) goto L11;
        r0.m2064g(0);
        return;
    L11:
        r0.getClass();
        return;
    L5:
        if (r0.f3614i == 1) goto L8;
        r0.m2064g(1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList r4) {
        C1141ag r0 = this.f4621c;
        r0.f3616k = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3612g, r4, r0.f3617l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode r4) {
        C1141ag r0 = this.f4621c;
        r0.f3617l = r4;
        AbstractC0295Gu.m608a(r0.f3606a, r0.f3612g, r0.f3616k, r4);
    }

    public void setPlaceholderText(CharSequence r6) {
        Editable r1 = null;
        if (this.f4657u != null) goto L6;
        C2304o4 r0 = new C2304o4(getContext(), null);
        this.f4657u = r0;
        r0.setId(io.github.cherrywechat.R.id.textinput_placeholder);
        this.f4657u.setImportantForAccessibility(1);
        this.f4657u.setAccessibilityLiveRegion(1);
        C1222bh r02 = m2479f();
        this.f4663x = r02;
        r02.f1197b = 67;
        this.f4665y = m2479f();
        setPlaceholderTextAppearance(this.f4661w);
        setPlaceholderTextColor(this.f4659v);
        AbstractC2185lE.m4399l(this.f4657u, new C0377Iq(4));
    L6:
        if (TextUtils.isEmpty(r6) == false) goto L9;
        setPlaceholderTextEnabled(false);
    L12:
        EditText r62 = this.f4625e;
        if (r62 == null) goto L16;
        r1 = r62.getText();
    L16:
        m2496x(r1);
        return;
    L9:
        if (this.f4655t == true) goto L11;
        setPlaceholderTextEnabled(true);
    L11:
        this.f4653s = r6;
        goto L12
    }

    public void setPlaceholderTextAppearance(int r2) {
        this.f4661w = r2;
        C2304o4 r0 = this.f4657u;
        if (r0 == null) goto L6;
        r0.setTextAppearance(r2);
        return;
    }

    public void setPlaceholderTextColor(ColorStateList r2) {
        if (this.f4659v == r2) goto L9;
        this.f4659v = r2;
        C2304o4 r0 = this.f4657u;
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
        C1072Yy r0 = this.f4619b;
        r0.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r0.f3386c = r1;
        r0.f3385b.setText(r3);
        r0.m2008e();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setPrefixTextAppearance(int r2) {
        this.f4619b.f3385b.setTextAppearance(r2);
    }

    public void setPrefixTextColor(ColorStateList r2) {
        this.f4619b.f3385b.setTextColor(r2);
    }

    public void setShapeAppearanceModel(C0728Qx r2) {
        C1021Xq r0 = this.f4600G;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f3241b.f2902a == r2) goto L9;
        this.f4606M = r2;
        m2476c();
        return;
    }

    public void setStartIconCheckable(boolean r2) {
        this.f4619b.f3387d.setCheckable(r2);
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
        Drawable r22 = AbstractC1406fG.m2695U(getContext(), r2);
    L5:
        setStartIconDrawable(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setStartIconMinSize(int r3) {
        C1072Yy r0 = this.f4619b;
        if (r3 >= 0) goto L5;
        r0.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    L5:
        if (r3 == r0.f3390g) goto L10;
        r0.f3390g = r3;
        CheckableImageButton r02 = r0.f3387d;
        r02.setMinimumWidth(r3);
        r02.setMinimumHeight(r3);
        return;
    }

    public void setStartIconOnClickListener(View.OnClickListener r3) {
        C1072Yy r0 = this.f4619b;
        CheckableImageButton r1 = r0.f3387d;
        View.OnLongClickListener r02 = r0.f3392i;
        r1.setOnClickListener(r3);
        AbstractC0295Gu.m602C(r1, r02);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener r2) {
        C1072Yy r0 = this.f4619b;
        r0.f3392i = r2;
        CheckableImageButton r02 = r0.f3387d;
        r02.setOnLongClickListener(r2);
        AbstractC0295Gu.m602C(r02, r2);
    }

    public void setStartIconScaleType(ImageView.ScaleType r2) {
        C1072Yy r0 = this.f4619b;
        r0.f3391h = r2;
        r0.f3387d.setScaleType(r2);
    }

    public void setStartIconTintList(ColorStateList r4) {
        C1072Yy r0 = this.f4619b;
        if (r0.f3388e == r4) goto L6;
        r0.f3388e = r4;
        AbstractC0295Gu.m608a(r0.f3384a, r0.f3387d, r4, r0.f3389f);
        return;
    }

    public void setStartIconTintMode(PorterDuff.Mode r4) {
        C1072Yy r0 = this.f4619b;
        if (r0.f3389f == r4) goto L6;
        r0.f3389f = r4;
        AbstractC0295Gu.m608a(r0.f3384a, r0.f3387d, r0.f3388e, r4);
        return;
    }

    public void setStartIconVisible(boolean r2) {
        this.f4619b.m2006c(r2);
    }

    public void setSuffixText(CharSequence r3) {
        C1141ag r0 = this.f4621c;
        r0.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r0.f3621p = r1;
        r0.f3622q.setText(r3);
        r0.m2071n();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setSuffixTextAppearance(int r2) {
        this.f4621c.f3622q.setTextAppearance(r2);
    }

    public void setSuffixTextColor(ColorStateList r2) {
        this.f4621c.f3622q.setTextColor(r2);
    }

    public void setTextInputAccessibilityDelegate(C2619vA r2) {
        EditText r0 = this.f4625e;
        if (r0 == null) goto L6;
        AbstractC2185lE.m4399l(r0, r2);
        return;
    }

    public void setTypeface(Typeface r3) {
        if (r3 == this.f4622c0) goto L16;
        this.f4622c0 = r3;
        this.f4662w0.m4793n(r3);
        C2241ml r0 = this.f4637k;
        if (r3 == r0.f7894B) goto L12;
        r0.f7894B = r3;
        C2304o4 r1 = r0.f7912r;
        if (r1 == null) goto L9;
        r1.setTypeface(r3);
    L9:
        C2304o4 r02 = r0.f7919y;
        if (r02 == null) goto L12;
        r02.setTypeface(r3);
    L12:
        C2304o4 r03 = this.f4647p;
        if (r03 == null) goto L17;
        r03.setTypeface(r3);
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m2492t() {
        EditText r0 = this.f4625e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f4609P != 0) goto L23;
        Drawable r02 = r0.getBackground();
        if (r02 == null) goto L24;
        int[] r1 = AbstractC0107Ce.f250a;
        Drawable r03 = r02.mutate();
        if (m2487o() == false) goto L15;
        r03.setColorFilter(C0262G3.m540c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        return;
    L15:
        if (this.f4643n == false) goto L20;
        C2304o4 r12 = this.f4647p;
        if (r12 == null) goto L20;
        r03.setColorFilter(C0262G3.m540c(r12.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        return;
    L20:
        r03.clearColorFilter();
        this.f4625e.refreshDrawableState();
        return;
    L24:
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m2493u() {
        EditText r0 = this.f4625e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f4600G != null) goto L7;
        return;
    L7:
        if (this.f4603J == true) goto L11;
        if (r0.getBackground() == null) goto L11;
        return;
    L11:
        if (this.f4609P == 0) goto L18;
        Drawable r02 = getEditTextBoxBackground();
        this.f4625e.setBackground(r02);
        this.f4603J = true;
        return;
    }

    /* JADX INFO: renamed from: v */
    public final void m2494v() {
        if (this.f4609P == 1) goto L8;
        FrameLayout r0 = this.f4617a;
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) r0.getLayoutParams();
        int r2 = m2478e();
        if (r2 == r1.topMargin) goto L9;
        r1.topMargin = r2;
        r0.requestLayout();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: w */
    public final void m2495w(boolean r10, boolean r11) {
        boolean r0 = isEnabled();
        EditText r1 = this.f4625e;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        EditText r4 = this.f4625e;
        if (r4 != null) goto L11;
    L13:
        boolean r42 = false;
    L14:
        ColorStateList r5 = this.f4636j0;
        C2359pa r6 = this.f4662w0;
        if (r5 == null) goto L17;
        r6.m4790k(r5);
    L17:
        Editable r52 = null;
        if (r0 == true) goto L25;
        ColorStateList r02 = this.f4636j0;
        if (r02 == null) goto L22;
        int r03 = r02.getColorForState(new int[]{-16842910}, this.f4656t0);
    L23:
        r6.m4790k(ColorStateList.valueOf(r03));
    L42:
        C1141ag r04 = this.f4621c;
        C1072Yy r7 = this.f4619b;
        if (r12 == false) goto L45;
    L78:
        if (r11 == false) goto L80;
    L83:
        ValueAnimator r112 = this.f4668z0;
        if (r112 == null) goto L89;
        if (r112.isRunning() == false) goto L89;
        this.f4668z0.cancel();
    L89:
        if (r10 == true) goto L91;
    L93:
        r6.m4792m(1.0f);
    L94:
        this.f4660v0 = false;
        if (m2480g() == false) goto L97;
        m2485l();
    L97:
        EditText r102 = this.f4625e;
        if (r102 == null) goto L101;
        r52 = r102.getText();
    L101:
        m2496x(r52);
        r7.f3393j = false;
        r7.m2008e();
        r04.f3623r = false;
        r04.m2071n();
        return;
    L91:
        if (this.f4666y0 == false) goto L93;
        m2475b(1.0f);
        goto L94
    L80:
        if (this.f4660v0 == true) goto L83;
        return;
    L45:
        if (this.f4664x0 == false) goto L78;
        if (isEnabled() == false) goto L50;
        if (r42 == true) goto L78;
    L50:
        if (r11 == false) goto L52;
    L53:
        ValueAnimator r113 = this.f4668z0;
        if (r113 == null) goto L59;
        if (r113.isRunning() == false) goto L59;
        this.f4668z0.cancel();
    L59:
        if (r10 == true) goto L61;
    L63:
        r6.m4792m(0.0f);
    L65:
        if (m2480g() == true) goto L67;
    L71:
        this.f4660v0 = true;
        C2304o4 r103 = this.f4657u;
        if (r103 != null) goto L74;
    L76:
        r7.f3393j = true;
        r7.m2008e();
        r04.f3623r = true;
        r04.m2071n();
        return;
    L74:
        if (this.f4655t == false) goto L76;
        r103.setText(null);
        AbstractC0528MB.m1023a(this.f4617a, this.f4665y);
        this.f4657u.setVisibility(4);
        goto L76
    L67:
        if (((C2369pc) this.f4600G).f8335G.f8164r.isEmpty() == true) goto L71;
        if (m2480g() == false) goto L71;
        ((C2369pc) this.f4600G).m4797t(0.0f, 0.0f, 0.0f, 0.0f);
        goto L71
    L61:
        if (this.f4666y0 == false) goto L63;
        m2475b(0.0f);
        goto L65
    L52:
        if (this.f4660v0 == false) goto L53;
        return;
    L22:
        r03 = this.f4656t0;
        goto L23
    L25:
        if (m2487o() == false) goto L32;
        C2304o4 r05 = this.f4637k.f7912r;
        if (r05 == null) goto L29;
        ColorStateList r06 = r05.getTextColors();
    L30:
        r6.m4790k(r06);
        goto L42
    L29:
        r06 = null;
        goto L30
    L32:
        if (this.f4643n == false) goto L36;
        C2304o4 r07 = this.f4647p;
        if (r07 == null) goto L36;
        r6.m4790k(r07.getTextColors());
    L36:
        if (r42 == false) goto L42;
        ColorStateList r08 = this.f4638k0;
        if (r08 == null) goto L42;
        if (r6.f8295k == r08) goto L42;
        r6.f8295k = r08;
        r6.m4789j(false);
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

    /* JADX INFO: renamed from: x */
    public final void m2496x(Editable r4) {
        ((C2438r1) this.f4645o).getClass();
        if (r4 == null) goto L5;
        int r42 = r4.length();
    L6:
        FrameLayout r1 = this.f4617a;
        if (r42 == 0) goto L9;
    L18:
        C2304o4 r43 = this.f4657u;
        if (r43 != null) goto L21;
        return;
    L21:
        if (this.f4655t == false) goto L28;
        r43.setText(null);
        AbstractC0528MB.m1023a(r1, this.f4665y);
        this.f4657u.setVisibility(4);
        return;
    L28:
        return;
    L9:
        if (this.f4660v0 == true) goto L18;
        if (this.f4657u != null) goto L13;
        return;
    L13:
        if (this.f4655t == true) goto L15;
        return;
    L15:
        if (TextUtils.isEmpty(this.f4653s) == true) goto L26;
        this.f4657u.setText(this.f4653s);
        AbstractC0528MB.m1023a(r1, this.f4663x);
        this.f4657u.setVisibility(0);
        this.f4657u.bringToFront();
        return;
    L26:
        return;
    L5:
        r42 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: y */
    public final void m2497y(boolean r6, boolean r7) {
        int r0 = this.f4646o0.getDefaultColor();
        int r1 = this.f4646o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, r0);
        int r2 = this.f4646o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, r0);
        if (r6 == false) goto L6;
        this.f4614U = r2;
        return;
    L6:
        if (r7 == false) goto L9;
        this.f4614U = r1;
        return;
    L9:
        this.f4614U = r0;
    }

    /* JADX INFO: renamed from: z */
    public final void m2498z() {
        if (this.f4600G != null) goto L5;
        return;
    L5:
        if (this.f4609P == 0) goto L88;
        boolean r1 = false;
        if (isFocused() == true) goto L15;
        EditText r0 = this.f4625e;
        if (r0 != null) goto L12;
    L14:
        boolean r02 = false;
    L17:
        if (isHovered() == true) goto L22;
        EditText r3 = this.f4625e;
        if (r3 == null) goto L24;
        if (r3.isHovered() == true) goto L22;
    L24:
        if (isEnabled() == true) goto L27;
        this.f4614U = this.f4656t0;
    L46:
        if (Build.VERSION.SDK_INT < 29) goto L48;
        m2490r();
    L48:
        C1141ag r32 = this.f4621c;
        TextInputLayout r4 = r32.f3606a;
        CheckableImageButton r5 = r32.f3612g;
        TextInputLayout r6 = r32.f3606a;
        r32.m2069l();
        AbstractC0295Gu.m600A(r6, r32.f3608c, r32.f3609d);
        AbstractC0295Gu.m600A(r6, r5, r32.f3616k);
        if ((r32.m2059b() instanceof C0494Le) == true) goto L51;
    L56:
        C1072Yy r33 = this.f4619b;
        AbstractC0295Gu.m600A(r33.f3384a, r33.f3387d, r33.f3388e);
        if (this.f4609P != 2) goto L75;
        int r34 = this.f4611R;
        if (r02 == true) goto L61;
    L63:
        this.f4611R = this.f4612S;
    L65:
        if (this.f4611R == r34) goto L75;
        if (m2480g() == false) goto L75;
        if (this.f4660v0 == true) goto L75;
        if (m2480g() == false) goto L73;
        ((C2369pc) this.f4600G).m4797t(0.0f, 0.0f, 0.0f, 0.0f);
    L73:
        m2485l();
        goto L75
    L61:
        if (isEnabled() == false) goto L63;
        this.f4611R = this.f4613T;
    L75:
        if (this.f4609P == 1) goto L77;
    L85:
        m2476c();
        return;
    L77:
        if (isEnabled() == true) goto L79;
        this.f4615V = this.f4650q0;
        goto L85
    L79:
        if (r1 == false) goto L82;
        if (r02 == true) goto L82;
        this.f4615V = this.f4654s0;
    L82:
        if (r02 == false) goto L84;
        this.f4615V = this.f4652r0;
        goto L85
    L84:
        this.f4615V = this.f4648p0;
        goto L85
    L51:
        if (r4.m2487o() == true) goto L53;
    L55:
        AbstractC0295Gu.m608a(r4, r5, r32.f3616k, r32.f3617l);
        goto L56
    L53:
        if (r5.getDrawable() == null) goto L55;
        Drawable r35 = r5.getDrawable().mutate();
        r35.setTint(r4.getErrorCurrentTextColors());
        r5.setImageDrawable(r35);
        goto L56
    L27:
        if (m2487o() == false) goto L33;
        if (this.f4646o0 == null) goto L31;
        m2497y(r02, r1);
        goto L46
    L31:
        this.f4614U = getErrorCurrentTextColors();
        goto L46
    L33:
        if (this.f4643n == false) goto L40;
        C2304o4 r36 = this.f4647p;
        if (r36 == null) goto L40;
        if (this.f4646o0 == null) goto L39;
        m2497y(r02, r1);
        goto L46
    L39:
        this.f4614U = r36.getCurrentTextColor();
    L40:
        if (r02 == false) goto L42;
        this.f4614U = this.f4644n0;
        goto L46
    L42:
        if (r1 == false) goto L44;
        this.f4614U = this.f4642m0;
        goto L46
    L44:
        this.f4614U = this.f4640l0;
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
        CheckableImageButton r0 = this.f4619b.f3387d;
        if (r0.getContentDescription() == r3) goto L6;
        r0.setContentDescription(r3);
        return;
    }

    public void setStartIconDrawable(Drawable r2) {
        this.f4619b.m2005b(r2);
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
        this.f4621c.f3612g.setContentDescription(r2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable r2) {
        this.f4621c.f3612g.setImageDrawable(r2);
    }

    public void setErrorIconDrawable(Drawable r2) {
        this.f4621c.m2066i(r2);
    }

    public void setEndIconContentDescription(CharSequence r3) {
        CheckableImageButton r0 = this.f4621c.f3612g;
        if (r0.getContentDescription() == r3) goto L6;
        r0.setContentDescription(r3);
        return;
    }

    public void setEndIconDrawable(Drawable r5) {
        C1141ag r0 = this.f4621c;
        TextInputLayout r1 = r0.f3606a;
        CheckableImageButton r2 = r0.f3612g;
        r2.setImageDrawable(r5);
        if (r5 == null) goto L6;
        AbstractC0295Gu.m608a(r1, r2, r0.f3616k, r0.f3617l);
        AbstractC0295Gu.m600A(r1, r2, r0.f3616k);
        return;
    }
}
