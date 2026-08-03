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
import android.graphics.PorterDuffColorFilter;
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
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0016B;
import p001A0.AbstractC0040p;
import p001A0.C0015A;
import p001A0.C0017C;
import p001A0.C0018D;
import p001A0.C0020F;
import p001A0.C0021G;
import p001A0.C0024J;
import p001A0.C0032h;
import p001A0.C0033i;
import p001A0.C0039o;
import p001A0.C0042r;
import p001A0.C0045u;
import p001A0.C0048x;
import p001A0.C0049y;
import p001A0.InterfaceC0022H;
import p001A0.RunnableC0019E;
import p001A0.RunnableC0028d;
import p002B.C0052b;
import p002B.C0057g;
import p003B0.AbstractC0059a;
import p006D.AbstractC0072I;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p043Y.AbstractC0458q;
import p043Y.C0449h;
import p057g.AbstractC0886W;
import p057g.C0868K;
import p057g.C0926s;
import p057g.C0933v0;
import p058g0.AbstractC0942a;
import p060h0.AbstractC0945a;
import p081s0.AbstractC1069c;
import p081s0.AbstractC1077k;
import p081s0.C1068b;
import p082t.AbstractC1081b;
import p084u0.C1096a;
import p084u0.C1099d;
import p085v.AbstractC1100a;
import p087w.AbstractC1111a;
import p089x0.C1117a;
import p089x0.C1121e;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1125i;
import p089x0.C1126j;
import p089x0.C1127k;
import p089x0.InterfaceC1119c;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: C0 */
    public static final int[][] f2437C0 = null;

    /* JADX INFO: renamed from: A */
    public ColorStateList f2438A;

    /* JADX INFO: renamed from: A0 */
    public boolean f2439A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f2440B;

    /* JADX INFO: renamed from: B0 */
    public boolean f2441B0;

    /* JADX INFO: renamed from: C */
    public boolean f2442C;

    /* JADX INFO: renamed from: D */
    public CharSequence f2443D;

    /* JADX INFO: renamed from: E */
    public boolean f2444E;

    /* JADX INFO: renamed from: F */
    public C1123g f2445F;

    /* JADX INFO: renamed from: G */
    public C1123g f2446G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f2447H;

    /* JADX INFO: renamed from: I */
    public boolean f2448I;

    /* JADX INFO: renamed from: J */
    public C1123g f2449J;

    /* JADX INFO: renamed from: K */
    public C1123g f2450K;

    /* JADX INFO: renamed from: L */
    public C1127k f2451L;

    /* JADX INFO: renamed from: M */
    public boolean f2452M;

    /* JADX INFO: renamed from: N */
    public final int f2453N;

    /* JADX INFO: renamed from: O */
    public int f2454O;

    /* JADX INFO: renamed from: P */
    public int f2455P;

    /* JADX INFO: renamed from: Q */
    public int f2456Q;

    /* JADX INFO: renamed from: R */
    public int f2457R;

    /* JADX INFO: renamed from: S */
    public int f2458S;

    /* JADX INFO: renamed from: T */
    public int f2459T;

    /* JADX INFO: renamed from: U */
    public int f2460U;

    /* JADX INFO: renamed from: V */
    public final Rect f2461V;

    /* JADX INFO: renamed from: W */
    public final Rect f2462W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f2463a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f2464a0;

    /* JADX INFO: renamed from: b */
    public final C0015A f2465b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f2466b0;

    /* JADX INFO: renamed from: c */
    public final C0045u f2467c;

    /* JADX INFO: renamed from: c0 */
    public ColorDrawable f2468c0;

    /* JADX INFO: renamed from: d */
    public EditText f2469d;

    /* JADX INFO: renamed from: d0 */
    public int f2470d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f2471e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f2472e0;

    /* JADX INFO: renamed from: f */
    public int f2473f;

    /* JADX INFO: renamed from: f0 */
    public ColorDrawable f2474f0;

    /* JADX INFO: renamed from: g */
    public int f2475g;

    /* JADX INFO: renamed from: g0 */
    public int f2476g0;

    /* JADX INFO: renamed from: h */
    public int f2477h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f2478h0;

    /* JADX INFO: renamed from: i */
    public int f2479i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f2480i0;

    /* JADX INFO: renamed from: j */
    public final C0049y f2481j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f2482j0;

    /* JADX INFO: renamed from: k */
    public boolean f2483k;

    /* JADX INFO: renamed from: k0 */
    public int f2484k0;

    /* JADX INFO: renamed from: l */
    public int f2485l;

    /* JADX INFO: renamed from: l0 */
    public int f2486l0;

    /* JADX INFO: renamed from: m */
    public boolean f2487m;

    /* JADX INFO: renamed from: m0 */
    public int f2488m0;

    /* JADX INFO: renamed from: n */
    public InterfaceC0022H f2489n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f2490n0;

    /* JADX INFO: renamed from: o */
    public C0868K f2491o;

    /* JADX INFO: renamed from: o0 */
    public int f2492o0;

    /* JADX INFO: renamed from: p */
    public int f2493p;

    /* JADX INFO: renamed from: p0 */
    public int f2494p0;

    /* JADX INFO: renamed from: q */
    public int f2495q;

    /* JADX INFO: renamed from: q0 */
    public int f2496q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f2497r;

    /* JADX INFO: renamed from: r0 */
    public int f2498r0;

    /* JADX INFO: renamed from: s */
    public boolean f2499s;

    /* JADX INFO: renamed from: s0 */
    public int f2500s0;

    /* JADX INFO: renamed from: t */
    public C0868K f2501t;

    /* JADX INFO: renamed from: t0 */
    public int f2502t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f2503u;

    /* JADX INFO: renamed from: u0 */
    public boolean f2504u0;

    /* JADX INFO: renamed from: v */
    public int f2505v;

    /* JADX INFO: renamed from: v0 */
    public final C1068b f2506v0;

    /* JADX INFO: renamed from: w */
    public C0449h f2507w;

    /* JADX INFO: renamed from: w0 */
    public boolean f2508w0;

    /* JADX INFO: renamed from: x */
    public C0449h f2509x;

    /* JADX INFO: renamed from: x0 */
    public boolean f2510x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f2511y;

    /* JADX INFO: renamed from: y0 */
    public ValueAnimator f2512y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f2513z;

    /* JADX INFO: renamed from: z0 */
    public boolean f2514z0;

    static {
        f2437C0 = new int[][]{new int[]{R.attr.state_pressed}, new int[0]};
    }

    public TextInputLayout(Context r18, AttributeSet r19) {
        super(AbstractC0059a.m197a(r18, r19, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout), r19, C1031R.attr.textInputStyle);
        this.f2473f = -1;
        this.f2475g = -1;
        this.f2477h = -1;
        this.f2479i = -1;
        this.f2481j = new C0049y(this);
        this.f2489n = new C0017C(0);
        this.f2461V = new Rect();
        this.f2462W = new Rect();
        this.f2464a0 = new RectF();
        this.f2472e0 = new LinkedHashSet();
        C1068b r1 = new C1068b(this);
        this.f2506v0 = r1;
        this.f2441B0 = false;
        Context r12 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout r14 = new FrameLayout(r12);
        this.f2463a = r14;
        r14.setAddStatesFromChildren(true);
        LinearInterpolator r2 = AbstractC0945a.f3354a;
        r1.f4110Q = r2;
        r1.m2544h(false);
        r1.f4109P = r2;
        r1.m2544h(false);
        if (r1.f4132g == 8388659) goto L5;
        r1.f4132g = 8388659;
        r1.m2544h(false);
    L5:
        int[] r15 = AbstractC0942a.f3349u;
        AbstractC1077k.m2553a(r12, r19, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout);
        AbstractC1077k.m2554b(r12, r19, r15, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout, new int[]{22, 20, 40, 45, 49});
        TypedArray r22 = r12.obtainStyledAttributes(r19, r15, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout);
        C0234d r13 = new C0234d(r12, r22);
        C0015A r3 = new C0015A(this, r13);
        this.f2465b = r3;
        this.f2442C = r22.getBoolean(48, true);
        setHint(r22.getText(4));
        this.f2510x0 = r22.getBoolean(47, true);
        this.f2508w0 = r22.getBoolean(42, true);
        if (r22.hasValue(6) == false) goto L9;
        setMinEms(r22.getInt(6, -1));
    L12:
        if (r22.hasValue(5) == false) goto L15;
        setMaxEms(r22.getInt(5, -1));
    L17:
        this.f2451L = C1127k.m2657a(r12, r19, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout).m2656a();
        this.f2453N = r12.getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2455P = r22.getDimensionPixelOffset(9, 0);
        this.f2457R = r22.getDimensionPixelSize(16, r12.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2458S = r22.getDimensionPixelSize(17, r12.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2456Q = this.f2457R;
        float r4 = r22.getDimension(13, -1.0f);
        float r7 = r22.getDimension(12, -1.0f);
        float r8 = r22.getDimension(10, -1.0f);
        float r5 = r22.getDimension(11, -1.0f);
        C1126j r9 = this.f2451L.m2660d();
        if (r4 < 0.0f) goto L21;
        r9.f4339e = new C1117a(r4);
    L21:
        if (r7 < 0.0f) goto L24;
        r9.f4340f = new C1117a(r7);
    L24:
        if (r8 < 0.0f) goto L27;
        r9.f4341g = new C1117a(r8);
    L27:
        if (r5 < 0.0f) goto L29;
        r9.f4342h = new C1117a(r5);
    L29:
        this.f2451L = r9.m2656a();
        ColorStateList r42 = AbstractC0805P.m2050q(r12, r13, 7);
        if (r42 == null) goto L35;
        int r52 = r42.getDefaultColor();
        this.f2492o0 = r52;
        this.f2460U = r52;
        if (r42.isStateful() == false) goto L34;
        this.f2494p0 = r42.getColorForState(new int[]{-16842910}, -1);
        this.f2496q0 = r42.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2498r0 = r42.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
    L37:
        if (r22.hasValue(1) == false) goto L39;
        ColorStateList r43 = r13.m645h(1);
        this.f2482j0 = r43;
        this.f2480i0 = r43;
    L39:
        ColorStateList r53 = AbstractC0805P.m2050q(r12, r13, 14);
        this.f2488m0 = r22.getColor(14, 0);
        this.f2484k0 = AbstractC1081b.m2562a(r12, C1031R.color.mtrl_textinput_default_box_stroke_color);
        this.f2500s0 = AbstractC1081b.m2562a(r12, C1031R.color.mtrl_textinput_disabled_color);
        this.f2486l0 = AbstractC1081b.m2562a(r12, C1031R.color.mtrl_textinput_hovered_box_stroke_color);
        if (r53 == null) goto L43;
        setBoxStrokeColorStateList(r53);
    L43:
        if (r22.hasValue(15) == false) goto L46;
        setBoxStrokeErrorColor(AbstractC0805P.m2050q(r12, r13, 15));
    L46:
        if (r22.getResourceId(49, -1) == (-1)) goto L48;
        setHintTextAppearance(r22.getResourceId(49, 0));
    L48:
        this.f2438A = r13.m645h(24);
        this.f2440B = r13.m645h(25);
        int r44 = r22.getResourceId(40, 0);
        CharSequence r54 = r22.getText(35);
        int r6 = r22.getInt(34, 1);
        boolean r72 = r22.getBoolean(36, false);
        int r82 = r22.getResourceId(45, 0);
        boolean r92 = r22.getBoolean(44, false);
        CharSequence r122 = r22.getText(43);
        int r152 = r22.getResourceId(57, 0);
        CharSequence r132 = r22.getText(56);
        boolean r10 = r22.getBoolean(18, false);
        setCounterMaxLength(r22.getInt(19, -1));
        this.f2495q = r22.getResourceId(22, 0);
        this.f2493p = r22.getResourceId(20, 0);
        setBoxBackgroundMode(r22.getInt(8, 0));
        setErrorContentDescription(r54);
        setErrorAccessibilityLiveRegion(r6);
        setCounterOverflowTextAppearance(this.f2493p);
        setHelperTextTextAppearance(r82);
        setErrorTextAppearance(r44);
        setCounterTextAppearance(this.f2495q);
        setPlaceholderText(r132);
        setPlaceholderTextAppearance(r152);
        if (r22.hasValue(41) == false) goto L52;
        setErrorTextColor(r13.m645h(41));
    L52:
        if (r22.hasValue(46) == false) goto L55;
        setHelperTextColor(r13.m645h(46));
    L55:
        if (r22.hasValue(50) == false) goto L58;
        setHintTextColor(r13.m645h(50));
    L58:
        if (r22.hasValue(23) == false) goto L61;
        setCounterTextColor(r13.m645h(23));
    L61:
        if (r22.hasValue(21) == false) goto L64;
        setCounterOverflowTextColor(r13.m645h(21));
    L64:
        if (r22.hasValue(58) == false) goto L66;
        setPlaceholderTextColor(r13.m645h(58));
    L66:
        C0045u r45 = new C0045u(this, r13);
        this.f2467c = r45;
        boolean r23 = r22.getBoolean(0, true);
        r13.m657u();
        setImportantForAccessibility(2);
        AbstractC0072I.m253m(this, 1);
        r14.addView(r3);
        r14.addView(r45);
        addView(r14);
        setEnabled(r23);
        setHelperTextEnabled(r92);
        setErrorEnabled(r72);
        setCounterEnabled(r10);
        setHelperText(r122);
        return;
    L34:
        this.f2496q0 = this.f2492o0;
        ColorStateList r46 = AbstractC0805P.m2049p(r12, C1031R.color.mtrl_filled_background_color);
        this.f2494p0 = r46.getColorForState(new int[]{-16842910}, -1);
        this.f2498r0 = r46.getColorForState(new int[]{R.attr.state_hovered}, -1);
        goto L37
    L35:
        this.f2460U = 0;
        this.f2492o0 = 0;
        this.f2494p0 = 0;
        this.f2496q0 = 0;
        this.f2498r0 = 0;
        goto L37
    L15:
        if (r22.hasValue(2) == false) goto L17;
        setMaxWidth(r22.getDimensionPixelSize(2, -1));
        goto L17
    L9:
        if (r22.hasValue(3) == false) goto L12;
        setMinWidth(r22.getDimensionPixelSize(3, -1));
        goto L12
    }

    private Drawable getEditTextBoxBackground() {
        EditText r3 = this.f2469d;
        if ((r3 instanceof AutoCompleteTextView) == false) goto L21;
        if (AbstractC0040p.m80C(r3) == true) goto L21;
        int r32 = AbstractC0805P.m2048o(this.f2469d, C1031R.attr.colorControlHighlight);
        int r4 = this.f2454O;
        int[][] r5 = f2437C0;
        if (r4 != 2) goto L15;
        Context r42 = getContext();
        C1123g r7 = this.f2445F;
        TypedValue r8 = AbstractC0805P.m2040T(r42, C1031R.attr.colorSurface, "TextInputLayout");
        int r9 = r8.resourceId;
        if (r9 == 0) goto L12;
        int r43 = AbstractC1081b.m2562a(r42, r9);
    L13:
        C1123g r82 = new C1123g(r7.f4312a.f4290a);
        int r33 = AbstractC0805P.m2033I(r32, r43, 0.1f);
        r82.m2651k(new ColorStateList(r5, new int[]{r33, 0}));
        r82.setTint(r43);
        ColorStateList r44 = new ColorStateList(r5, new int[]{r33, r43});
        C1123g r34 = new C1123g(r7.f4312a.f4290a);
        r34.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(r44, r82, r34), r7});
    L12:
        r43 = r8.data;
        goto L13
    L15:
        if (r4 != 1) goto L18;
        C1123g r02 = this.f2445F;
        int r1 = this.f2460U;
        return new RippleDrawable(new ColorStateList(r5, new int[]{AbstractC0805P.m2033I(r32, r1, 0.1f), r1}), r02, r02);
    L18:
        return null;
    L21:
        return this.f2445F;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2447H != null) goto L6;
        StateListDrawable r02 = new StateListDrawable();
        this.f2447H = r02;
        r02.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
        this.f2447H.addState(new int[0], m1893f(false));
    L6:
        return this.f2447H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2446G != null) goto L6;
        this.f2446G = m1893f(true);
    L6:
        return this.f2446G;
    }

    /* JADX INFO: renamed from: k */
    public static void m1887k(ViewGroup r4, boolean r5) {
        int r02 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        View r2 = r4.getChildAt(r1);
        r2.setEnabled(r5);
        if ((r2 instanceof ViewGroup) == false) goto L7;
        m1887k((ViewGroup) r2, r5);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    private void setEditText(EditText r7) {
        if (this.f2469d != null) goto L52;
        if (getEndIconMode() == 3) goto L7;
        boolean r02 = r7 instanceof TextInputEditText;
    L7:
        this.f2469d = r7;
        int r03 = this.f2473f;
        if (r03 == (-1)) goto L10;
        setMinEms(r03);
    L11:
        int r04 = this.f2475g;
        if (r04 == (-1)) goto L14;
        setMaxEms(r04);
    L15:
        this.f2448I = false;
        m1896i();
        setTextInputAccessibilityDelegate(new C0021G(this));
        Typeface r1 = this.f2469d.getTypeface();
        C1068b r2 = this.f2506v0;
        r2.m2549m(r1);
        float r12 = this.f2469d.getTextSize();
        if (r2.f4133h == r12) goto L18;
        r2.f4133h = r12;
        r2.m2544h(false);
    L18:
        int r13 = Build.VERSION.SDK_INT;
        float r3 = this.f2469d.getLetterSpacing();
        if (r2.f4116W == r3) goto L21;
        r2.f4116W = r3;
        r2.m2544h(false);
    L21:
        int r32 = this.f2469d.getGravity();
        int r4 = (r32 & (-113)) | 48;
        if (r2.f4132g == r4) goto L25;
        r2.f4132g = r4;
        r2.m2544h(false);
    L25:
        if (r2.f4130f == r32) goto L27;
        r2.f4130f = r32;
        r2.m2544h(false);
    L27:
        Field r22 = AbstractC0080Q.f219a;
        this.f2502t0 = r7.getMinimumHeight();
        this.f2469d.addTextChangedListener(new C0018D(this, r7));
        if (this.f2480i0 != null) goto L31;
        this.f2480i0 = this.f2469d.getHintTextColors();
    L31:
        if (this.f2442C == false) goto L37;
        if (TextUtils.isEmpty(this.f2443D) == false) goto L35;
        CharSequence r23 = this.f2469d.getHint();
        this.f2471e = r23;
        setHint(r23);
        this.f2469d.setHint(null);
    L35:
        this.f2444E = true;
    L37:
        if (r13 < 29) goto L40;
        m1902p();
    L40:
        if (this.f2491o == null) goto L42;
        m1900n(this.f2469d.getText());
    L42:
        m1904r();
        this.f2481j.m158b();
        this.f2465b.bringToFront();
        C0045u r14 = this.f2467c;
        r14.bringToFront();
        Iterator r24 = this.f2472e0.iterator();
    L44:
        if (r24.hasNext() == false) goto L46;
        ((C0042r) r24.next()).m137a(this);
        goto L44
    L46:
        r14.m152m();
        if (isEnabled() == true) goto L49;
        r7.setEnabled(false);
    L49:
        m1907u(false, true);
        return;
    L14:
        setMaxWidth(this.f2479i);
        goto L15
    L10:
        setMinWidth(this.f2477h);
        goto L11
    L52:
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence r3) {
        if (TextUtils.equals(r3, this.f2443D) == true) goto L16;
        this.f2443D = r3;
        C1068b r02 = this.f2506v0;
        if (r3 != null) goto L7;
    L8:
        r02.f4094A = r3;
        r02.f4095B = null;
        Bitmap r1 = r02.f4098E;
        if (r1 == null) goto L11;
        r1.recycle();
        r02.f4098E = null;
    L11:
        r02.m2544h(false);
    L13:
        if (this.f2504u0 == true) goto L17;
        m1897j();
        return;
    L17:
        return;
    L7:
        if (TextUtils.equals(r02.f4094A, r3) == true) goto L13;
    }

    private void setPlaceholderTextEnabled(boolean r3) {
        if (this.f2499s != r3) goto L5;
        return;
    L5:
        if (r3 == false) goto L9;
        C0868K r02 = this.f2501t;
        if (r02 == null) goto L13;
        this.f2463a.addView(r02);
        this.f2501t.setVisibility(0);
    L13:
        this.f2499s = r3;
        return;
    L9:
        C0868K r03 = this.f2501t;
        if (r03 == null) goto L12;
        r03.setVisibility(8);
    L12:
        this.f2501t = null;
        goto L13
    }

    /* JADX INFO: renamed from: a */
    public final void m1888a(float r7) {
        int r02 = 0;
        C1068b r1 = this.f2506v0;
        if (r1.f4122b != r7) goto L6;
        return;
    L6:
        if (this.f2512y0 != null) goto L8;
        ValueAnimator r2 = new ValueAnimator();
        this.f2512y0 = r2;
        r2.setInterpolator(AbstractC0805P.m2039S(getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b));
        this.f2512y0.setDuration(AbstractC0805P.m2038R(getContext(), C1031R.attr.motionDurationMedium4, 167));
        this.f2512y0.addUpdateListener(new C0020F(r02, this));
    L8:
        this.f2512y0.setFloatValues(new float[]{r1.f4122b, r7});
        this.f2512y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if ((r2 instanceof EditText) == false) goto L5;
        FrameLayout.LayoutParams r32 = new FrameLayout.LayoutParams(r4);
        r32.gravity = (r32.gravity & (-113)) | 16;
        FrameLayout r02 = this.f2463a;
        r02.addView(r2, r32);
        r02.setLayoutParams(r4);
        m1906t();
        setEditText((EditText) r2);
        return;
    L5:
        super.addView(r2, r3, r4);
    }

    /* JADX INFO: renamed from: b */
    public final void m1889b() {
        C1123g r02 = this.f2445F;
        if (r02 != null) goto L5;
        return;
    L5:
        C1127k r1 = r02.f4312a.f4290a;
        C1127k r2 = this.f2451L;
        if (r1 == r2) goto L9;
        r02.setShapeAppearanceModel(r2);
    L9:
        if (this.f2454O != 2) goto L17;
        int r03 = this.f2456Q;
        if (r03 <= (-1)) goto L17;
        int r12 = this.f2459T;
        if (r12 == 0) goto L17;
        C1123g r3 = this.f2445F;
        r3.f4312a.f4300k = r03;
        r3.invalidateSelf();
        ColorStateList r04 = ColorStateList.valueOf(r12);
        C1122f r13 = r3.f4312a;
        if (r13.f4293d == r04) goto L17;
        r13.f4293d = r04;
        r3.onStateChange(r3.getState());
    L17:
        int r05 = this.f2460U;
        if (this.f2454O != 1) goto L20;
        r05 = AbstractC1100a.m2593b(this.f2460U, AbstractC0805P.m2047n(getContext(), C1031R.attr.colorSurface, 0));
    L20:
        this.f2460U = r05;
        this.f2445F.m2651k(ColorStateList.valueOf(r05));
        C1123g r06 = this.f2449J;
        if (r06 != null) goto L23;
    L35:
        m1905s();
        return;
    L23:
        if (this.f2450K == null) goto L35;
        if (this.f2456Q > (-1)) goto L28;
    L34:
        invalidate();
        goto L35
    L28:
        if (this.f2459T == 0) goto L34;
        if (this.f2469d.isFocused() == false) goto L32;
        ColorStateList r14 = ColorStateList.valueOf(this.f2484k0);
    L33:
        r06.m2651k(r14);
        this.f2450K.m2651k(ColorStateList.valueOf(this.f2459T));
        goto L34
    L32:
        r14 = ColorStateList.valueOf(this.f2459T);
        goto L33
    }

    /* JADX INFO: renamed from: c */
    public final int m1890c() {
        if (this.f2442C == true) goto L5;
        return 0;
    L5:
        int r02 = this.f2454O;
        C1068b r2 = this.f2506v0;
        if (r02 != 0) goto L8;
        float r03 = r2.m2541d();
    L12:
        return (int) r03;
    L8:
        if (r02 == 2) goto L10;
        return 0;
    L10:
        r03 = r2.m2541d() / 2.0f;
        goto L12
    }

    /* JADX INFO: renamed from: d */
    public final C0449h m1891d() {
        C0449h r02 = new C0449h();
        r02.f1011c = AbstractC0805P.m2038R(getContext(), C1031R.attr.motionDurationShort2, 87);
        r02.f1012d = AbstractC0805P.m2039S(getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
        return r02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure r6, int r7) {
        EditText r02 = this.f2469d;
        if (r02 != null) goto L6;
        super.dispatchProvideAutofillStructure(r6, r7);
        return;
    L6:
        int r2 = 0;
        if (this.f2471e == null) goto L14;
        boolean r1 = this.f2444E;
        this.f2444E = false;
        CharSequence r03 = r02.getHint();
        this.f2469d.setHint(this.f2471e);
        super.dispatchProvideAutofillStructure(r6, r7);     // Catch: Throwable -> L11
        this.f2469d.setHint(r03);
        this.f2444E = r1;
        return;
    L11:
        th = move-exception;
        this.f2469d.setHint(r03);
        this.f2444E = r1;
        throw th;
    L14:
        r6.setAutofillId(getAutofillId());
        onProvideAutofillStructure(r6, r7);
        onProvideAutofillVirtualStructure(r6, r7);
        FrameLayout r04 = this.f2463a;
        r6.setChildCount(r04.getChildCount());
    L16:
        if (r2 >= r04.getChildCount()) goto L27;
        View r12 = r04.getChildAt(r2);
        ViewStructure r3 = r6.newChild(r2);
        r12.dispatchProvideAutofillStructure(r3, r7);
        if (r12 != this.f2469d) goto L20;
        r3.setHint(getHint());
    L20:
        r2 = r2 + 1;
        goto L16
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray r2) {
        this.f2439A0 = true;
        super.dispatchRestoreInstanceState(r2);
        this.f2439A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas r18) {
        super.draw(r18);
        boolean r1 = this.f2442C;
        C1068b r9 = this.f2506v0;
        if (r1 == false) goto L36;
        r9.getClass();
        int r10 = r18.save();
        if (r9.f4095B == null) goto L36;
        RectF r12 = r9.f4128e;
        if (r12.width() <= 0.0f) goto L36;
        if (r12.height() <= 0.0f) goto L36;
        TextPaint r11 = r9.f4107N;
        r11.setTextSize(r9.f4100G);
        float r13 = r9.f4141p;
        float r2 = r9.f4142q;
        float r3 = r9.f4099F;
        if (r3 == 1.0f) goto L14;
        r18.scale(r3, r3, r13, r2);
    L14:
        if (r9.f4127d0 > 1) goto L16;
    L33:
        r18.translate(r13, r2);
        r9.f4118Y.draw(r18);
    L34:
        r18.restoreToCount(r10);
        goto L36
    L16:
        if (r9.f4096C == true) goto L33;
        float r14 = r9.f4141p - r9.f4118Y.getLineStart(0);
        int r142 = r11.getAlpha();
        r18.translate(r14, r2);
        float r22 = r142;
        r11.setAlpha((int) (r9.f4123b0 * r22));
        int r15 = Build.VERSION.SDK_INT;
        if (r15 < 31) goto L21;
        float r16 = r9.f4101H;
        float r32 = r9.f4102I;
        float r4 = r9.f4103J;
        int r5 = r9.f4104K;
        r11.setShadowLayer(r16, r32, r4, AbstractC1100a.m2595d(r5, (r11.getAlpha() * Color.alpha(r5)) / 255));
    L21:
        r9.f4118Y.draw(r18);
        r11.setAlpha((int) (r9.f4121a0 * r22));
        if (r15 < 31) goto L24;
        float r17 = r9.f4101H;
        float r23 = r9.f4102I;
        float r33 = r9.f4103J;
        int r42 = r9.f4104K;
        r11.setShadowLayer(r17, r23, r33, AbstractC1100a.m2595d(r42, (Color.alpha(r42) * r11.getAlpha()) / 255));
    L24:
        int r19 = r9.f4118Y.getLineBaseline(0);
        CharSequence r24 = r9.f4125c0;
        float r6 = r19;
        r18.drawText(r24, 0, r24.length(), 0.0f, r6, r11);
        if (r15 < 31) goto L27;
        r11.setShadowLayer(r9.f4101H, r9.f4102I, r9.f4103J, r9.f4104K);
    L27:
        String r110 = r9.f4125c0.toString().trim();
        if (r110.endsWith("…") == false) goto L31;
        int r34 = 0;
        r110 = r110.substring(0, r110.length() - 1);
    L30:
        String r25 = r110;
        r11.setAlpha(r142);
        r18.drawText(r25, 0, Math.min(r9.f4118Y.getLineEnd(r34), r25.length()), 0.0f, r6, r11);
        goto L34
    L31:
        r34 = 0;
    L36:
        if (this.f2450K == null) goto L43;
        C1123g r111 = this.f2449J;
        if (r111 == null) goto L44;
        r111.draw(r18);
        if (this.f2469d.isFocused() == false) goto L45;
        Rect r112 = this.f2450K.getBounds();
        Rect r26 = this.f2449J.getBounds();
        float r35 = r9.f4122b;
        int r43 = r26.centerX();
        r112.left = AbstractC0945a.m2277c(r43, r26.left, r35);
        r112.right = AbstractC0945a.m2277c(r43, r26.right, r35);
        this.f2450K.draw(r18);
        return;
    L45:
        return;
    L44:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2514z0 == false) goto L5;
        return;
    L5:
        boolean r02 = true;
        this.f2514z0 = true;
        super.drawableStateChanged();
        int[] r1 = getDrawableState();
        C1068b r3 = this.f2506v0;
        if (r3 == null) goto L16;
        r3.f4105L = r1;
        ColorStateList r12 = r3.f4136k;
        if (r12 != null) goto L10;
    L11:
        ColorStateList r13 = r3.f4135j;
        if (r13 == null) goto L16;
        if (r13.isStateful() == false) goto L16;
    L15:
        r3.m2544h(false);
        boolean r14 = true;
    L18:
        if (this.f2469d == null) goto L26;
        Field r32 = AbstractC0080Q.f219a;
        if (isLaidOut() == true) goto L22;
    L24:
        r02 = false;
    L25:
        m1907u(r02, false);
        goto L26
    L22:
        if (isEnabled() == false) goto L24;
    L26:
        m1904r();
        m1910x();
        if (r14 == false) goto L29;
        invalidate();
    L29:
        this.f2514z0 = false;
        return;
    L10:
        if (r12.isStateful() == true) goto L15;
    L16:
        r14 = false;
        goto L18
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1892e() {
        if (this.f2442C == true) goto L5;
    L9:
        return false;
    L5:
        if (TextUtils.isEmpty(this.f2443D) == true) goto L9;
        if ((this.f2445F instanceof C0033i) == false) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final C1123g m1893f(boolean r17) {
        int r02 = 0;
        float r1 = getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_shape_corner_size_small_component);
        if (r17 == false) goto L5;
        float r2 = r1;
    L6:
        float r3 = getResources().getDimensionPixelOffset(C1031R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int r4 = getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1125i r5 = new C1125i();
        C1125i r6 = new C1125i();
        C1125i r7 = new C1125i();
        C1125i r8 = new C1125i();
        C1121e r9 = new C1121e(r02);
        C1121e r10 = new C1121e(r02);
        C1121e r11 = new C1121e(r02);
        C1121e r12 = new C1121e(r02);
        C1117a r13 = new C1117a(r2);
        C1117a r14 = new C1117a(r2);
        C1117a r22 = new C1117a(r1);
        C1117a r15 = new C1117a(r1);
        C1127k r16 = new C1127k();
        r16.f4347a = r5;
        r16.f4348b = r6;
        r16.f4349c = r7;
        r16.f4350d = r8;
        r16.f4351e = r13;
        r16.f4352f = r14;
        r16.f4353g = r15;
        r16.f4354h = r22;
        r16.f4355i = r9;
        r16.f4356j = r10;
        r16.f4357k = r11;
        r16.f4358l = r12;
        Context r23 = getContext();
        Paint r52 = C1123g.f4311w;
        TypedValue r53 = AbstractC0805P.m2040T(r23, C1031R.attr.colorSurface, C1123g.class.getSimpleName());
        int r62 = r53.resourceId;
        if (r62 == 0) goto L9;
        int r54 = AbstractC1081b.m2562a(r23, r62);
    L10:
        ColorStateList r55 = ColorStateList.valueOf(r54);
        C1123g r63 = new C1123g();
        r63.m2649i(r23);
        r63.m2651k(r55);
        r63.m2650j(r3);
        r63.setShapeAppearanceModel(r16);
        C1122f r18 = r63.f4312a;
        if (r18.f4297h != null) goto L13;
        r18.f4297h = new Rect();
    L13:
        r63.f4312a.f4297h.set(0, r4, 0, r4);
        r63.invalidateSelf();
        return r63;
    L9:
        r54 = r53.data;
        goto L10
    L5:
        r2 = 0.0f;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final int m1894g(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.f2469d.getCompoundPaddingLeft();
    L7:
        return r32 + r2;
    L10:
        if (getSuffixText() == null) goto L12;
        r32 = this.f2467c.m142c();
        goto L7
    L4:
        if (getPrefixText() == null) goto L8;
        r32 = this.f2465b.m19a();
        goto L7
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText r02 = this.f2469d;
        if (r02 == null) goto L7;
        int r03 = r02.getBaseline();
        int r1 = getPaddingTop() + r03;
        return m1890c() + r1;
    L7:
        return super.getBaseline();
    }

    public C1123g getBoxBackground() {
        int r02 = this.f2454O;
        if (r02 == 1) goto L10;
        if (r02 == 2) goto L10;
        throw new IllegalStateException();
    L10:
        return this.f2445F;
    }

    public int getBoxBackgroundColor() {
        return this.f2460U;
    }

    public int getBoxBackgroundMode() {
        return this.f2454O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2455P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean r02 = AbstractC1077k.m2557e(this);
        RectF r1 = this.f2464a0;
        if (r02 == false) goto L6;
        return this.f2451L.f4354h.mo2634a(r1);
    L6:
        return this.f2451L.f4353g.mo2634a(r1);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean r02 = AbstractC1077k.m2557e(this);
        RectF r1 = this.f2464a0;
        if (r02 == false) goto L6;
        return this.f2451L.f4353g.mo2634a(r1);
    L6:
        return this.f2451L.f4354h.mo2634a(r1);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean r02 = AbstractC1077k.m2557e(this);
        RectF r1 = this.f2464a0;
        if (r02 == false) goto L6;
        return this.f2451L.f4351e.mo2634a(r1);
    L6:
        return this.f2451L.f4352f.mo2634a(r1);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean r02 = AbstractC1077k.m2557e(this);
        RectF r1 = this.f2464a0;
        if (r02 == false) goto L6;
        return this.f2451L.f4352f.mo2634a(r1);
    L6:
        return this.f2451L.f4351e.mo2634a(r1);
    }

    public int getBoxStrokeColor() {
        return this.f2488m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2490n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2457R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2458S;
    }

    public int getCounterMaxLength() {
        return this.f2485l;
    }

    public CharSequence getCounterOverflowDescription() {
        if (this.f2483k == true) goto L5;
        return null;
    L5:
        if (this.f2487m == false) goto L12;
        C0868K r02 = this.f2491o;
        if (r02 != null) goto L9;
        return null;
    L9:
        return r02.getContentDescription();
    L12:
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2513z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2511y;
    }

    public ColorStateList getCursorColor() {
        return this.f2438A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2440B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2480i0;
    }

    public EditText getEditText() {
        return this.f2469d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2467c.f122g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2467c.f122g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2467c.f128m;
    }

    public int getEndIconMode() {
        return this.f2467c.f124i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2467c.f129n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2467c.f122g;
    }

    public CharSequence getError() {
        C0049y r02 = this.f2481j;
        if (r02.f167q == true) goto L7;
        return null;
    L7:
        return r02.f166p;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2481j.f170t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2481j.f169s;
    }

    public int getErrorCurrentTextColors() {
        C0868K r02 = this.f2481j.f168r;
        if (r02 != null) goto L7;
        return -1;
    L7:
        return r02.getCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.f2467c.f118c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0049y r02 = this.f2481j;
        if (r02.f174x == true) goto L7;
        return null;
    L7:
        return r02.f173w;
    }

    public int getHelperTextCurrentTextColor() {
        C0868K r02 = this.f2481j.f175y;
        if (r02 != null) goto L7;
        return -1;
    L7:
        return r02.getCurrentTextColor();
    }

    public CharSequence getHint() {
        if (this.f2442C == true) goto L7;
        return null;
    L7:
        return this.f2443D;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2506v0.m2541d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C1068b r02 = this.f2506v0;
        return r02.m2542e(r02.f4136k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2482j0;
    }

    public InterfaceC0022H getLengthCounter() {
        return this.f2489n;
    }

    public int getMaxEms() {
        return this.f2475g;
    }

    public int getMaxWidth() {
        return this.f2479i;
    }

    public int getMinEms() {
        return this.f2473f;
    }

    public int getMinWidth() {
        return this.f2477h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2467c.f122g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2467c.f122g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2499s == true) goto L7;
        return null;
    L7:
        return this.f2497r;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2505v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2503u;
    }

    public CharSequence getPrefixText() {
        return this.f2465b.f44c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2465b.f43b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2465b.f43b;
    }

    public C1127k getShapeAppearanceModel() {
        return this.f2451L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2465b.f45d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2465b.f45d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2465b.f48g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2465b.f49h;
    }

    public CharSequence getSuffixText() {
        return this.f2467c.f131p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2467c.f132q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2467c.f132q;
    }

    public Typeface getTypeface() {
        return this.f2466b0;
    }

    /* JADX INFO: renamed from: h */
    public final int m1895h(int r2, boolean r3) {
        if (r3 == false) goto L4;
    L8:
        if (r3 == true) goto L10;
    L12:
        int r32 = this.f2469d.getCompoundPaddingRight();
    L7:
        return r2 - r32;
    L10:
        if (getPrefixText() == null) goto L12;
        r32 = this.f2465b.m19a();
        goto L7
    L4:
        if (getSuffixText() == null) goto L8;
        r32 = this.f2467c.m142c();
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public final void m1896i() {
        int r02 = this.f2454O;
        if (r02 == 0) goto L20;
        if (r02 == 1) goto L19;
        if (r02 != 2) goto L18;
        if (this.f2442C == true) goto L9;
    L15:
        this.f2445F = new C1123g(this.f2451L);
    L16:
        this.f2449J = null;
        this.f2450K = null;
    L21:
        m1905s();
        m1910x();
        if (this.f2454O != 1) goto L30;
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L27;
        this.f2455P = getResources().getDimensionPixelSize(C1031R.dimen.material_font_2_0_box_collapsed_padding_top);
        goto L30
    L27:
        if (AbstractC0805P.m2031E(getContext()) == false) goto L30;
        this.f2455P = getResources().getDimensionPixelSize(C1031R.dimen.material_font_1_3_box_collapsed_padding_top);
    L30:
        if (this.f2469d == null) goto L41;
        if (this.f2454O != 1) goto L41;
        if (getContext().getResources().getConfiguration().fontScale < 2.0f) goto L38;
        EditText r03 = this.f2469d;
        Field r3 = AbstractC0080Q.f219a;
        r03.setPaddingRelative(r03.getPaddingStart(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2469d.getPaddingEnd(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        goto L41
    L38:
        if (AbstractC0805P.m2031E(getContext()) == false) goto L41;
        EditText r04 = this.f2469d;
        Field r32 = AbstractC0080Q.f219a;
        r04.setPaddingRelative(r04.getPaddingStart(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2469d.getPaddingEnd(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_1_3_padding_bottom));
    L41:
        if (this.f2454O == 0) goto L43;
        m1906t();
    L43:
        EditText r05 = this.f2469d;
        if ((r05 instanceof AutoCompleteTextView) == false) goto L57;
        AutoCompleteTextView r06 = (AutoCompleteTextView) r05;
        if (r06.getDropDownBackground() != null) goto L54;
        int r33 = this.f2454O;
        if (r33 != 2) goto L51;
        r06.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
        return;
    L51:
        if (r33 != 1) goto L56;
        r06.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
        return;
    L56:
        return;
    L54:
        return;
    L57:
        return;
    L9:
        if ((this.f2445F instanceof C0033i) == true) goto L15;
        C1127k r07 = this.f2451L;
        int r4 = C0033i.f85y;
        if (r07 != null) goto L14;
        r07 = new C1127k();
    L14:
        this.f2445F = new C0033i(new C0032h(r07, new RectF()));
        goto L16
    L18:
        throw new IllegalArgumentException(this.f2454O + " is illegal; only @BoxBackgroundMode constants are supported.");
    L19:
        this.f2445F = new C1123g(this.f2451L);
        this.f2449J = new C1123g();
        this.f2450K = new C1123g();
        goto L21
    L20:
        this.f2445F = null;
        this.f2449J = null;
        this.f2450K = null;
        goto L21
    }

    /* JADX INFO: renamed from: j */
    public final void m1897j() {
        if (m1892e() == true) goto L5;
        return;
    L5:
        int r02 = this.f2469d.getWidth();
        int r1 = this.f2469d.getGravity();
        C1068b r2 = this.f2506v0;
        boolean r3 = r2.m2539b(r2.f4094A);
        r2.f4096C = r3;
        Rect r9 = r2.f4126d;
        if (r1 != 17) goto L8;
    L22:
        float r32 = r02 / 2.0f;
        float r10 = r2.f4119Z / 2.0f;
    L23:
        float r33 = r32 - r10;
    L24:
        float r34 = Math.max(r33, r9.left);
        RectF r102 = this.f2464a0;
        r102.left = r34;
        r102.top = r9.top;
        if (r1 != 17) goto L27;
    L43:
        float r03 = (r02 / 2.0f) + (r2.f4119Z / 2.0f);
    L44:
        r102.right = Math.min(r03, r9.right);
        r102.bottom = r2.m2541d() + r9.top;
        if (r102.width() > 0.0f) goto L47;
        return;
    L47:
        if (r102.height() <= 0.0f) goto L52;
        float r04 = r102.left;
        float r12 = this.f2453N;
        r102.left = r04 - r12;
        r102.right += r12;
        r102.offset(-getPaddingLeft(), ((-getPaddingTop()) - (r102.height() / 2.0f)) + this.f2456Q);
        C0033i r05 = (C0033i) this.f2445F;
        r05.getClass();
        r05.m70o(r102.left, r102.top, r102.right, r102.bottom);
        return;
    L52:
        return;
    L27:
        if ((r1 & 7) == 1) goto L43;
        if ((r1 & 8388613) == 8388613) goto L40;
        if ((r1 & 5) == 5) goto L40;
        if (r2.f4096C == false) goto L38;
        int r06 = r9.right;
    L37:
        r03 = r06;
        goto L44
    L38:
        r03 = r2.f4119Z + r34;
    L40:
        if (r2.f4096C == false) goto L42;
        r03 = r34 + r2.f4119Z;
        goto L44
    L42:
        r06 = r9.right;
        goto L37
    L8:
        if ((r1 & 7) == 1) goto L22;
        if ((r1 & 8388613) != 8388613) goto L13;
    L19:
        if (r3 == false) goto L21;
        int r35 = r9.left;
    L18:
        r33 = r35;
        goto L24
    L21:
        r32 = r9.right;
        r10 = r2.f4119Z;
        goto L23
    L13:
        if ((r1 & 5) == 5) goto L19;
        if (r3 == false) goto L17;
        r32 = r9.right;
        r10 = r2.f4119Z;
        goto L23
    L17:
        r35 = r9.left;
        goto L18
    }

    /* JADX INFO: renamed from: l */
    public final void m1898l(TextView r2, int r3) {
        r2.setTextAppearance(r3);     // Catch: Exception -> L7
        if (r2.getTextColors().getDefaultColor() == (-65281)) goto L5;
        return;
    L5:
        r2.setTextAppearance(C1031R.style.TextAppearance_AppCompat_Caption);
        r2.setTextColor(AbstractC1081b.m2562a(getContext(), C1031R.color.design_error));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1899m() {
        C0049y r02 = this.f2481j;
        if (r02.f165o == 1) goto L5;
    L9:
        return false;
    L5:
        if (r02.f168r == null) goto L9;
        if (TextUtils.isEmpty(r02.f166p) == true) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1900n(Editable r10) {
        ((C0017C) this.f2489n).getClass();
        if (r10 == null) goto L5;
        int r102 = r10.length();
    L6:
        boolean r1 = this.f2487m;
        int r2 = this.f2485l;
        String r4 = null;
        if (r2 != (-1)) goto L10;
        this.f2491o.setText(String.valueOf(r102));
        this.f2491o.setContentDescription(null);
        this.f2487m = false;
    L30:
        if (this.f2469d != null) goto L32;
        return;
    L32:
        if (r1 == this.f2487m) goto L36;
        m1907u(false, false);
        m1910x();
        m1904r();
        return;
    L36:
        return;
    L10:
        if (r102 <= r2) goto L12;
        boolean r22 = true;
    L13:
        this.f2487m = r22;
        Context r23 = getContext();
        C0868K r5 = this.f2491o;
        int r6 = this.f2485l;
        if (this.f2487m == false) goto L16;
        int r7 = C1031R.string.character_counter_overflowed_content_description;
    L17:
        r5.setContentDescription(r23.getString(r7, new Object[]{Integer.valueOf(r102), Integer.valueOf(r6)}));
        if (r1 == this.f2487m) goto L20;
        m1901o();
    L20:
        String r24 = C0052b.f185d;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) goto L23;
        C0052b r25 = C0052b.f188g;
    L24:
        C0868K r3 = this.f2491o;
        String r103 = getContext().getString(C1031R.string.character_counter_pattern, new Object[]{Integer.valueOf(r102), Integer.valueOf(this.f2485l)});
        if (r103 != null) goto L27;
        r25.getClass();
    L28:
        r3.setText(r4);
        goto L30
    L27:
        C0057g r42 = r25.f191c;
        r4 = r25.m169c(r103).toString();
        goto L28
    L23:
        r25 = C0052b.f187f;
        goto L24
    L16:
        r7 = C1031R.string.character_counter_content_description;
        goto L17
    L12:
        r22 = false;
        goto L13
    L5:
        r102 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: o */
    public final void m1901o() {
        C0868K r02 = this.f2491o;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f2487m == false) goto L7;
        int r1 = this.f2493p;
    L8:
        m1898l(r02, r1);
        if (this.f2487m == true) goto L14;
        ColorStateList r03 = this.f2511y;
        if (r03 == null) goto L14;
        this.f2491o.setTextColor(r03);
    L14:
        if (this.f2487m == false) goto L20;
        ColorStateList r04 = this.f2513z;
        if (r04 == null) goto L21;
        this.f2491o.setTextColor(r04);
        return;
    L21:
        return;
    L20:
        return;
    L7:
        r1 = this.f2495q;
        goto L8
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r2) {
        super.onConfigurationChanged(r2);
        this.f2506v0.m2543g(r2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0045u r02 = this.f2467c;
        r02.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean r1 = false;
        this.f2441B0 = false;
        if (this.f2469d == null) goto L8;
        int r03 = Math.max(r02.getMeasuredHeight(), this.f2465b.getMeasuredHeight());
        if (this.f2469d.getMeasuredHeight() >= r03) goto L8;
        this.f2469d.setMinimumHeight(r03);
        r1 = true;
    L8:
        boolean r04 = m1903q();
        if (r1 == true) goto L11;
        if (r04 == true) goto L11;
        return;
    L11:
        this.f2469d.post(new RunnableC0028d(2, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        super.onLayout(r7, r8, r9, r10, r11);
        EditText r72 = this.f2469d;
        if (r72 == null) goto L80;
        ThreadLocal r82 = AbstractC1069c.f4152a;
        int r83 = r72.getWidth();
        int r92 = r72.getHeight();
        Rect r102 = this.f2461V;
        r102.set(0, 0, r83, r92);
        ThreadLocal r84 = AbstractC1069c.f4152a;
        Matrix r93 = (Matrix) r84.get();
        if (r93 != null) goto L7;
        r93 = new Matrix();
        r84.set(r93);
    L8:
        AbstractC1069c.m2550a(this, r72, r93);
        ThreadLocal r73 = AbstractC1069c.f4153b;
        RectF r85 = (RectF) r73.get();
        if (r85 != null) goto L11;
        r85 = new RectF();
        r73.set(r85);
    L11:
        r85.set(r102);
        r93.mapRect(r85);
        r102.set((int) (r85.left + 0.5f), (int) (r85.top + 0.5f), (int) (r85.right + 0.5f), (int) (r85.bottom + 0.5f));
        C1123g r74 = this.f2449J;
        if (r74 == null) goto L14;
        int r86 = r102.bottom;
        r74.setBounds(r102.left, r86 - this.f2457R, r102.right, r86);
    L14:
        C1123g r75 = this.f2450K;
        if (r75 == null) goto L18;
        int r87 = r102.bottom;
        r75.setBounds(r102.left, r87 - this.f2458S, r102.right, r87);
    L18:
        if (this.f2442C == false) goto L81;
        float r76 = this.f2469d.getTextSize();
        C1068b r88 = this.f2506v0;
        if (r88.f4133h == r76) goto L22;
        r88.f4133h = r76;
        r88.m2544h(false);
    L22:
        int r77 = this.f2469d.getGravity();
        int r94 = (r77 & (-113)) | 48;
        if (r88.f4132g == r94) goto L26;
        r88.f4132g = r94;
        r88.m2544h(false);
    L26:
        if (r88.f4130f == r77) goto L29;
        r88.f4130f = r77;
        r88.m2544h(false);
    L29:
        if (this.f2469d == null) goto L79;
        boolean r78 = AbstractC1077k.m2557e(this);
        int r95 = r102.bottom;
        Rect r02 = this.f2462W;
        r02.bottom = r95;
        int r96 = this.f2454O;
        if (r96 != 1) goto L33;
        r02.left = m1894g(r102.left, r78);
        r02.top = r102.top + this.f2455P;
        r02.right = m1895h(r102.right, r78);
    L37:
        int r79 = r02.left;
        int r97 = r02.top;
        int r2 = r02.right;
        int r3 = r02.bottom;
        Rect r4 = r88.f4126d;
        if (r4.left == r79) goto L40;
    L46:
        r4.set(r79, r97, r2, r3);
        r88.f4106M = true;
    L48:
        if (this.f2469d == null) goto L77;
        TextPaint r710 = r88.f4108O;
        r710.setTextSize(r88.f4133h);
        r710.setTypeface(r88.f4146u);
        r710.setLetterSpacing(r88.f4116W);
        float r711 = -r710.ascent();
        r02.left = this.f2469d.getCompoundPaddingLeft() + r102.left;
        if (this.f2454O == 1) goto L52;
    L54:
        int r98 = r102.top + this.f2469d.getCompoundPaddingTop();
    L55:
        r02.top = r98;
        r02.right = r102.right - this.f2469d.getCompoundPaddingRight();
        if (this.f2454O == 1) goto L58;
    L60:
        int r712 = r102.bottom - this.f2469d.getCompoundPaddingBottom();
    L61:
        r02.bottom = r712;
        int r99 = r02.left;
        int r103 = r02.top;
        int r03 = r02.right;
        Rect r22 = r88.f4124c;
        if (r22.left == r99) goto L64;
    L70:
        r22.set(r99, r103, r03, r712);
        r88.f4106M = true;
    L71:
        r88.m2544h(false);
        if (m1892e() == true) goto L74;
        return;
    L74:
        if (this.f2504u0 == true) goto L83;
        m1897j();
        return;
    L83:
        return;
    L64:
        if (r22.top != r103) goto L70;
        if (r22.right != r03) goto L70;
        if (r22.bottom != r712) goto L70;
    L58:
        if (this.f2469d.getMinLines() > 1) goto L60;
        r712 = (int) (r02.top + r711);
        goto L61
    L52:
        if (this.f2469d.getMinLines() > 1) goto L54;
        r98 = (int) (r102.centerY() - (r711 / 2.0f));
        goto L55
    L77:
        throw new IllegalStateException();
    L40:
        if (r4.top != r97) goto L46;
        if (r4.right != r2) goto L46;
        if (r4.bottom != r3) goto L46;
    L33:
        if (r96 == 2) goto L35;
        r02.left = m1894g(r102.left, r78);
        r02.top = getPaddingTop();
        r02.right = m1895h(r102.right, r78);
        goto L37
    L35:
        r02.left = this.f2469d.getPaddingLeft() + r102.left;
        r02.top = r102.top - m1890c();
        r02.right = r102.right - this.f2469d.getPaddingRight();
        goto L37
    L79:
        throw new IllegalStateException();
    L81:
        return;
    L7:
        r93.reset();
        goto L8
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        boolean r52 = this.f2441B0;
        C0045u r62 = this.f2467c;
        if (r52 == true) goto L6;
        r62.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f2441B0 = true;
    L6:
        if (this.f2501t == null) goto L10;
        EditText r53 = this.f2469d;
        if (r53 == null) goto L10;
        int r54 = r53.getGravity();
        this.f2501t.setGravity(r54);
        this.f2501t.setPadding(this.f2469d.getCompoundPaddingLeft(), this.f2469d.getCompoundPaddingTop(), this.f2469d.getCompoundPaddingRight(), this.f2469d.getCompoundPaddingBottom());
    L10:
        r62.m152m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0024J) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0024J r22 = (C0024J) r2;
        super.onRestoreInstanceState(r22.f481a);
        setError(r22.f62c);
        if (r22.f63d == false) goto L9;
        post(new RunnableC0019E(0, this));
    L9:
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
        super.onRtlPropertiesChanged(r14);
        boolean r02 = true;
        if (r14 == 1) goto L7;
        r02 = false;
    L7:
        if (r02 == this.f2452M) goto L10;
        InterfaceC1119c r142 = this.f2451L.f4351e;
        RectF r1 = this.f2464a0;
        float r143 = r142.mo2634a(r1);
        float r2 = this.f2451L.f4352f.mo2634a(r1);
        float r3 = this.f2451L.f4354h.mo2634a(r1);
        float r12 = this.f2451L.f4353g.mo2634a(r1);
        C1127k r4 = this.f2451L;
        AbstractC0805P r5 = r4.f4347a;
        AbstractC0805P r6 = r4.f4348b;
        AbstractC0805P r7 = r4.f4350d;
        AbstractC0805P r42 = r4.f4349c;
        C1121e r8 = new C1121e(0);
        C1121e r9 = new C1121e(0);
        C1121e r10 = new C1121e(0);
        C1121e r11 = new C1121e(0);
        C1126j.m2655b(r6);
        C1126j.m2655b(r5);
        C1126j.m2655b(r42);
        C1126j.m2655b(r7);
        C1117a r122 = new C1117a(r2);
        C1117a r22 = new C1117a(r143);
        C1117a r144 = new C1117a(r12);
        C1117a r13 = new C1117a(r3);
        C1127k r32 = new C1127k();
        r32.f4347a = r6;
        r32.f4348b = r5;
        r32.f4349c = r7;
        r32.f4350d = r42;
        r32.f4351e = r122;
        r32.f4352f = r22;
        r32.f4353g = r13;
        r32.f4354h = r144;
        r32.f4355i = r8;
        r32.f4356j = r9;
        r32.f4357k = r10;
        r32.f4358l = r11;
        this.f2452M = r02;
        setShapeAppearanceModel(r32);
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0024J r1 = new C0024J(super.onSaveInstanceState());
        if (m1899m() == false) goto L5;
        r1.f62c = getError();
    L5:
        C0045u r02 = this.f2467c;
        if (r02.f124i != 0) goto L8;
    L10:
        boolean r03 = false;
    L11:
        r1.f63d = r03;
        return r1;
    L8:
        if (r02.f122g.f2393d == false) goto L10;
        r03 = true;
        goto L11
    }

    /* JADX INFO: renamed from: p */
    public final void m1902p() {
        ColorStateList r02 = this.f2438A;
        if (r02 != null) goto L14;
        Context r03 = getContext();
        TypedValue r1 = AbstractC0805P.m2037Q(r03, C1031R.attr.colorControlActivated);
        if (r1 != null) goto L8;
    L7:
        r02 = null;
        goto L14
    L8:
        int r3 = r1.resourceId;
        if (r3 == 0) goto L11;
        r02 = AbstractC0805P.m2049p(r03, r3);
        goto L14
    L11:
        int r04 = r1.data;
        if (r04 == 0) goto L7;
        r02 = ColorStateList.valueOf(r04);
    L14:
        EditText r12 = this.f2469d;
        if (r12 != null) goto L17;
        return;
    L17:
        if (AbstractC0016B.m31d(r12) == null) goto L31;
        Drawable r13 = AbstractC0016B.m31d(this.f2469d).mutate();
        if (m1899m() == false) goto L22;
    L25:
        ColorStateList r2 = this.f2440B;
        if (r2 == null) goto L28;
        r02 = r2;
    L28:
        AbstractC1111a.m2626h(r13, r02);
        return;
    L22:
        if (this.f2491o == null) goto L28;
        if (this.f2487m == false) goto L28;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1903q() {
        if (this.f2469d != null) goto L5;
        return false;
    L5:
        CheckableImageButton r2 = null;
        boolean r5 = true;
        if (getStartIconDrawable() == null) goto L8;
    L11:
        C0015A r02 = this.f2465b;
        if (r02.getMeasuredWidth() <= 0) goto L22;
        int r03 = r02.getMeasuredWidth() - this.f2469d.getPaddingLeft();
        if (this.f2468c0 != null) goto L16;
    L17:
        ColorDrawable r6 = new ColorDrawable();
        this.f2468c0 = r6;
        this.f2470d0 = r03;
        r6.setBounds(0, 0, r03, 1);
    L18:
        Drawable[] r04 = this.f2469d.getCompoundDrawablesRelative();
        Drawable r62 = r04[0];
        ColorDrawable r7 = this.f2468c0;
        if (r62 == r7) goto L25;
        this.f2469d.setCompoundDrawablesRelative(r7, r04[1], r04[2], r04[3]);
    L24:
        boolean r05 = true;
    L26:
        C0045u r63 = this.f2467c;
        if (r63.m144e() == true) goto L35;
        if (r63.f124i == 0) goto L33;
        if (r63.m143d() == true) goto L35;
    L33:
        if (r63.f131p != null) goto L35;
    L59:
        if (this.f2474f0 == null) goto L66;
        Drawable[] r64 = this.f2469d.getCompoundDrawablesRelative();
        if (r64[2] != this.f2474f0) goto L63;
        this.f2469d.setCompoundDrawablesRelative(r64[0], r64[1], this.f2478h0, r64[3]);
    L64:
        this.f2474f0 = null;
    L65:
        return r5;
    L63:
        r5 = r05;
        goto L64
    L66:
        return r05;
    L35:
        if (r63.getMeasuredWidth() <= 0) goto L59;
        int r72 = r63.f132q.getMeasuredWidth() - this.f2469d.getPaddingRight();
        if (r63.m144e() == false) goto L40;
        r2 = r63.f118c;
    L44:
        if (r2 == null) goto L46;
        r72 = ((ViewGroup.MarginLayoutParams) r2.getLayoutParams()).getMarginStart() + (r2.getMeasuredWidth() + r72);
    L46:
        Drawable[] r22 = this.f2469d.getCompoundDrawablesRelative();
        ColorDrawable r65 = this.f2474f0;
        if (r65 != null) goto L49;
    L51:
        if (r65 != null) goto L53;
        ColorDrawable r66 = new ColorDrawable();
        this.f2474f0 = r66;
        this.f2476g0 = r72;
        r66.setBounds(0, 0, r72, 1);
    L53:
        Drawable r3 = r22[2];
        ColorDrawable r67 = this.f2474f0;
        if (r3 == r67) goto L56;
        this.f2478h0 = r3;
        this.f2469d.setCompoundDrawablesRelative(r22[0], r22[1], r67, r22[3]);
        goto L65
    L56:
        r5 = r05;
        goto L65
    L49:
        if (this.f2476g0 == r72) goto L51;
        this.f2476g0 = r72;
        r65.setBounds(0, 0, r72, 1);
        this.f2469d.setCompoundDrawablesRelative(r22[0], r22[1], this.f2474f0, r22[3]);
        goto L65
    L40:
        if (r63.f124i == 0) goto L44;
        if (r63.m143d() == false) goto L44;
        r2 = r63.f122g;
    L25:
        r05 = false;
        goto L26
    L16:
        if (this.f2470d0 == r03) goto L18;
    L22:
        if (this.f2468c0 == null) goto L25;
        Drawable[] r06 = this.f2469d.getCompoundDrawablesRelative();
        this.f2469d.setCompoundDrawablesRelative(null, r06[1], r06[2], r06[3]);
        this.f2468c0 = null;
        goto L24
    L8:
        if (getPrefixText() == null) goto L22;
        if (getPrefixTextView().getVisibility() != 0) goto L22;
        goto L11
    }

    /* JADX INFO: renamed from: r */
    public final void m1904r() {
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f2454O != 0) goto L41;
        Drawable r03 = r02.getBackground();
        if (r03 != null) goto L10;
        return;
    L10:
        int[] r1 = AbstractC0886W.f3156a;
        Drawable r04 = r03.mutate();
        if (m1899m() == false) goto L21;
        int r12 = getErrorCurrentTextColors();
        PorterDuff.Mode r2 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode r3 = C0926s.f3289b;
        monitor-enter(C0926s.class);
        PorterDuffColorFilter r13 = C0933v0.m2264g(r12, r2);     // Catch: Throwable -> L17
        monitor-exit(C0926s.class);
        r04.setColorFilter(r13);
        return;
    L17:
        th = move-exception;
        throw th;
    L21:
        if (this.f2487m == false) goto L32;
        C0868K r14 = this.f2491o;
        if (r14 == null) goto L32;
        int r15 = r14.getCurrentTextColor();
        PorterDuff.Mode r22 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode r32 = C0926s.f3289b;
        monitor-enter(C0926s.class);
        PorterDuffColorFilter r16 = C0933v0.m2264g(r15, r22);     // Catch: Throwable -> L29
        monitor-exit(C0926s.class);
        r04.setColorFilter(r16);
        return;
    L29:
        th = move-exception;
        throw th;
    L32:
        r04.clearColorFilter();
        this.f2469d.refreshDrawableState();
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m1905s() {
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f2445F != null) goto L7;
        return;
    L7:
        if (this.f2448I == true) goto L11;
        if (r02.getBackground() == null) goto L11;
        return;
    L11:
        if (this.f2454O == 0) goto L18;
        Drawable r03 = getEditTextBoxBackground();
        EditText r1 = this.f2469d;
        Field r2 = AbstractC0080Q.f219a;
        r1.setBackground(r03);
        this.f2448I = true;
        return;
    }

    public void setBoxBackgroundColor(int r2) {
        if (this.f2460U == r2) goto L6;
        this.f2460U = r2;
        this.f2492o0 = r2;
        this.f2496q0 = r2;
        this.f2498r0 = r2;
        m1889b();
        return;
    }

    public void setBoxBackgroundColorResource(int r2) {
        setBoxBackgroundColor(AbstractC1081b.m2562a(getContext(), r2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList r4) {
        int r02 = r4.getDefaultColor();
        this.f2492o0 = r02;
        this.f2460U = r02;
        this.f2494p0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.f2496q0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2498r0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1889b();
    }

    public void setBoxBackgroundMode(int r2) {
        if (r2 != this.f2454O) goto L5;
        return;
    L5:
        this.f2454O = r2;
        if (this.f2469d == null) goto L9;
        m1896i();
        return;
    }

    public void setBoxCollapsedPaddingTop(int r1) {
        this.f2455P = r1;
    }

    public void setBoxCornerFamily(int r4) {
        C1126j r02 = this.f2451L.m2660d();
        InterfaceC1119c r1 = this.f2451L.f4351e;
        AbstractC0805P r2 = AbstractC0805P.m2046i(r4);
        r02.f4335a = r2;
        C1126j.m2655b(r2);
        r02.f4339e = r1;
        InterfaceC1119c r12 = this.f2451L.f4352f;
        AbstractC0805P r22 = AbstractC0805P.m2046i(r4);
        r02.f4336b = r22;
        C1126j.m2655b(r22);
        r02.f4340f = r12;
        InterfaceC1119c r13 = this.f2451L.f4354h;
        AbstractC0805P r23 = AbstractC0805P.m2046i(r4);
        r02.f4338d = r23;
        C1126j.m2655b(r23);
        r02.f4342h = r13;
        InterfaceC1119c r14 = this.f2451L.f4353g;
        AbstractC0805P r42 = AbstractC0805P.m2046i(r4);
        r02.f4337c = r42;
        C1126j.m2655b(r42);
        r02.f4341g = r14;
        this.f2451L = r02.m2656a();
        m1889b();
    }

    public void setBoxStrokeColor(int r2) {
        if (this.f2488m0 == r2) goto L6;
        this.f2488m0 = r2;
        m1910x();
        return;
    }

    public void setBoxStrokeColorStateList(ColorStateList r4) {
        if (r4.isStateful() == false) goto L6;
        this.f2484k0 = r4.getDefaultColor();
        this.f2500s0 = r4.getColorForState(new int[]{-16842910}, -1);
        this.f2486l0 = r4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        this.f2488m0 = r4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
    L8:
        m1910x();
        return;
    L6:
        if (this.f2488m0 == r4.getDefaultColor()) goto L8;
        this.f2488m0 = r4.getDefaultColor();
        goto L8
    }

    public void setBoxStrokeErrorColor(ColorStateList r2) {
        if (this.f2490n0 == r2) goto L6;
        this.f2490n0 = r2;
        m1910x();
        return;
    }

    public void setBoxStrokeWidth(int r1) {
        this.f2457R = r1;
        m1910x();
    }

    public void setBoxStrokeWidthFocused(int r1) {
        this.f2458S = r1;
        m1910x();
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(r2));
    }

    public void setBoxStrokeWidthResource(int r2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(r2));
    }

    public void setCounterEnabled(boolean r6) {
        if (this.f2483k == r6) goto L19;
        Editable r02 = null;
        C0049y r2 = this.f2481j;
        if (r6 == false) goto L16;
        C0868K r3 = new C0868K(getContext(), null);
        this.f2491o = r3;
        r3.setId(C1031R.id.textinput_counter);
        Typeface r32 = this.f2466b0;
        if (r32 == null) goto L9;
        this.f2491o.setTypeface(r32);
    L9:
        this.f2491o.setMaxLines(1);
        r2.m157a(this.f2491o, 2);
        ((ViewGroup.MarginLayoutParams) this.f2491o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_textinput_counter_margin_start));
        m1901o();
        if (this.f2491o == null) goto L17;
        EditText r1 = this.f2469d;
        if (r1 == null) goto L15;
        r02 = r1.getText();
    L15:
        m1900n(r02);
    L17:
        this.f2483k = r6;
        return;
    L16:
        r2.m163g(this.f2491o, 2);
        this.f2491o = null;
        goto L17
    }

    public void setCounterMaxLength(int r2) {
        if (this.f2485l == r2) goto L17;
        if (r2 <= 0) goto L6;
        this.f2485l = r2;
    L8:
        if (this.f2483k == true) goto L10;
        return;
    L10:
        if (this.f2491o == null) goto L19;
        EditText r22 = this.f2469d;
        if (r22 != null) goto L14;
        Editable r23 = null;
    L15:
        m1900n(r23);
        return;
    L14:
        r23 = r22.getText();
        goto L15
    L19:
        return;
    L6:
        this.f2485l = -1;
        goto L8
    }

    public void setCounterOverflowTextAppearance(int r2) {
        if (this.f2493p == r2) goto L6;
        this.f2493p = r2;
        m1901o();
        return;
    }

    public void setCounterOverflowTextColor(ColorStateList r2) {
        if (this.f2513z == r2) goto L6;
        this.f2513z = r2;
        m1901o();
        return;
    }

    public void setCounterTextAppearance(int r2) {
        if (this.f2495q == r2) goto L6;
        this.f2495q = r2;
        m1901o();
        return;
    }

    public void setCounterTextColor(ColorStateList r2) {
        if (this.f2511y == r2) goto L6;
        this.f2511y = r2;
        m1901o();
        return;
    }

    public void setCursorColor(ColorStateList r2) {
        if (this.f2438A == r2) goto L6;
        this.f2438A = r2;
        m1902p();
        return;
    }

    public void setCursorErrorColor(ColorStateList r2) {
        if (this.f2440B == r2) goto L12;
        this.f2440B = r2;
        if (m1899m() == false) goto L7;
    L10:
        m1902p();
        return;
    L7:
        if (this.f2491o != null) goto L9;
        return;
    L9:
        if (this.f2487m == true) goto L10;
        return;
    }

    public void setDefaultHintTextColor(ColorStateList r1) {
        this.f2480i0 = r1;
        this.f2482j0 = r1;
        if (this.f2469d == null) goto L6;
        m1907u(false, false);
        return;
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
        m1887k(this, r1);
        super.setEnabled(r1);
    }

    public void setEndIconActivated(boolean r2) {
        this.f2467c.f122g.setActivated(r2);
    }

    public void setEndIconCheckable(boolean r2) {
        this.f2467c.f122g.setCheckable(r2);
    }

    public void setEndIconContentDescription(int r3) {
        C0045u r02 = this.f2467c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r02.getResources().getText(r3);
    L6:
        CheckableImageButton r03 = r02.f122g;
        if (r03.getContentDescription() == r32) goto L10;
        r03.setContentDescription(r32);
        return;
    L10:
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setEndIconDrawable(int r5) {
        C0045u r02 = this.f2467c;
        if (r5 == 0) goto L5;
        Drawable r52 = AbstractC0358S.m916w(r02.getContext(), r5);
    L6:
        CheckableImageButton r1 = r02.f122g;
        r1.setImageDrawable(r52);
        if (r52 == null) goto L10;
        ColorStateList r53 = r02.f126k;
        PorterDuff.Mode r2 = r02.f127l;
        TextInputLayout r3 = r02.f116a;
        AbstractC0040p.m98c(r3, r1, r53, r2);
        AbstractC0040p.m86O(r3, r1, r02.f126k);
        return;
    L10:
        return;
    L5:
        r52 = null;
        goto L6
    }

    public void setEndIconMinSize(int r3) {
        C0045u r02 = this.f2467c;
        if (r3 >= 0) goto L5;
        r02.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L5:
        if (r3 == r02.f128m) goto L10;
        r02.f128m = r3;
        CheckableImageButton r1 = r02.f122g;
        r1.setMinimumWidth(r3);
        r1.setMinimumHeight(r3);
        CheckableImageButton r03 = r02.f118c;
        r03.setMinimumWidth(r3);
        r03.setMinimumHeight(r3);
        return;
    }

    public void setEndIconMode(int r2) {
        this.f2467c.m146g(r2);
    }

    public void setEndIconOnClickListener(View.OnClickListener r3) {
        C0045u r02 = this.f2467c;
        View.OnLongClickListener r1 = r02.f130o;
        CheckableImageButton r03 = r02.f122g;
        r03.setOnClickListener(r3);
        AbstractC0040p.m89T(r03, r1);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener r2) {
        C0045u r02 = this.f2467c;
        r02.f130o = r2;
        CheckableImageButton r03 = r02.f122g;
        r03.setOnLongClickListener(r2);
        AbstractC0040p.m89T(r03, r2);
    }

    public void setEndIconScaleType(ImageView.ScaleType r3) {
        C0045u r02 = this.f2467c;
        r02.f129n = r3;
        r02.f122g.setScaleType(r3);
        r02.f118c.setScaleType(r3);
    }

    public void setEndIconTintList(ColorStateList r4) {
        C0045u r02 = this.f2467c;
        if (r02.f126k == r4) goto L6;
        r02.f126k = r4;
        PorterDuff.Mode r1 = r02.f127l;
        AbstractC0040p.m98c(r02.f116a, r02.f122g, r4, r1);
        return;
    }

    public void setEndIconTintMode(PorterDuff.Mode r4) {
        C0045u r02 = this.f2467c;
        if (r02.f127l == r4) goto L6;
        r02.f127l = r4;
        ColorStateList r1 = r02.f126k;
        AbstractC0040p.m98c(r02.f116a, r02.f122g, r1, r4);
        return;
    }

    public void setEndIconVisible(boolean r2) {
        this.f2467c.m147h(r2);
    }

    public void setError(CharSequence r5) {
        C0049y r02 = this.f2481j;
        if (r02.f167q == true) goto L9;
        if (TextUtils.isEmpty(r5) == false) goto L7;
        return;
    L7:
        setErrorEnabled(true);
    L9:
        if (TextUtils.isEmpty(r5) == true) goto L14;
        r02.m159c();
        r02.f166p = r5;
        r02.f168r.setText(r5);
        int r1 = r02.f164n;
        if (r1 == 1) goto L13;
        r02.f165o = 1;
    L13:
        r02.m165i(r1, r02.f165o, r02.m164h(r02.f168r, r5));
        return;
    L14:
        r02.m162f();
    }

    public void setErrorAccessibilityLiveRegion(int r3) {
        C0049y r02 = this.f2481j;
        r02.f170t = r3;
        C0868K r03 = r02.f168r;
        if (r03 == null) goto L6;
        Field r1 = AbstractC0080Q.f219a;
        r03.setAccessibilityLiveRegion(r3);
        return;
    }

    public void setErrorContentDescription(CharSequence r2) {
        C0049y r02 = this.f2481j;
        r02.f169s = r2;
        C0868K r03 = r02.f168r;
        if (r03 == null) goto L6;
        r03.setContentDescription(r2);
        return;
    }

    public void setErrorEnabled(boolean r7) {
        C0049y r02 = this.f2481j;
        if (r02.f167q == r7) goto L27;
        r02.m159c();
        TextInputLayout r1 = r02.f158h;
        if (r7 == false) goto L24;
        C0868K r4 = new C0868K(r02.f157g, null);
        r02.f168r = r4;
        r4.setId(C1031R.id.textinput_error);
        r02.f168r.setTextAlignment(5);
        Typeface r3 = r02.f150B;
        if (r3 == null) goto L10;
        r02.f168r.setTypeface(r3);
    L10:
        int r32 = r02.f171u;
        r02.f171u = r32;
        C0868K r42 = r02.f168r;
        if (r42 == null) goto L13;
        r1.m1898l(r42, r32);
    L13:
        ColorStateList r12 = r02.f172v;
        r02.f172v = r12;
        C0868K r33 = r02.f168r;
        if (r33 == null) goto L17;
        if (r12 == null) goto L17;
        r33.setTextColor(r12);
    L17:
        CharSequence r13 = r02.f169s;
        r02.f169s = r13;
        C0868K r34 = r02.f168r;
        if (r34 == null) goto L20;
        r34.setContentDescription(r13);
    L20:
        int r14 = r02.f170t;
        r02.f170t = r14;
        C0868K r35 = r02.f168r;
        if (r35 == null) goto L23;
        Field r43 = AbstractC0080Q.f219a;
        r35.setAccessibilityLiveRegion(r14);
    L23:
        r02.f168r.setVisibility(4);
        r02.m157a(r02.f168r, 0);
    L25:
        r02.f167q = r7;
        return;
    L24:
        r02.m162f();
        r02.m163g(r02.f168r, 0);
        r02.f168r = null;
        r1.m1904r();
        r1.m1910x();
        goto L25
    }

    public void setErrorIconDrawable(int r3) {
        C0045u r02 = this.f2467c;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02.getContext(), r3);
    L6:
        r02.m148i(r32);
        ColorStateList r33 = r02.f119d;
        AbstractC0040p.m86O(r02.f116a, r02.f118c, r33);
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setErrorIconOnClickListener(View.OnClickListener r3) {
        C0045u r02 = this.f2467c;
        CheckableImageButton r1 = r02.f118c;
        View.OnLongClickListener r03 = r02.f121f;
        r1.setOnClickListener(r3);
        AbstractC0040p.m89T(r1, r03);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener r2) {
        C0045u r02 = this.f2467c;
        r02.f121f = r2;
        CheckableImageButton r03 = r02.f118c;
        r03.setOnLongClickListener(r2);
        AbstractC0040p.m89T(r03, r2);
    }

    public void setErrorIconTintList(ColorStateList r4) {
        C0045u r02 = this.f2467c;
        if (r02.f119d == r4) goto L6;
        r02.f119d = r4;
        PorterDuff.Mode r1 = r02.f120e;
        AbstractC0040p.m98c(r02.f116a, r02.f118c, r4, r1);
        return;
    }

    public void setErrorIconTintMode(PorterDuff.Mode r4) {
        C0045u r02 = this.f2467c;
        if (r02.f120e == r4) goto L6;
        r02.f120e = r4;
        ColorStateList r1 = r02.f119d;
        AbstractC0040p.m98c(r02.f116a, r02.f118c, r1, r4);
        return;
    }

    public void setErrorTextAppearance(int r3) {
        C0049y r02 = this.f2481j;
        r02.f171u = r3;
        C0868K r1 = r02.f168r;
        if (r1 == null) goto L6;
        r02.f158h.m1898l(r1, r3);
        return;
    }

    public void setErrorTextColor(ColorStateList r2) {
        C0049y r02 = this.f2481j;
        r02.f172v = r2;
        C0868K r03 = r02.f168r;
        if (r03 == null) goto L7;
        if (r2 == null) goto L8;
        r03.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setExpandedHintEnabled(boolean r2) {
        if (this.f2508w0 == r2) goto L6;
        this.f2508w0 = r2;
        m1907u(false, false);
        return;
    }

    public void setHelperText(CharSequence r5) {
        boolean r02 = TextUtils.isEmpty(r5);
        C0049y r1 = this.f2481j;
        if (r02 == false) goto L8;
        if (r1.f174x == false) goto L15;
        setHelperTextEnabled(false);
        return;
    L15:
        return;
    L8:
        if (r1.f174x == true) goto L10;
        setHelperTextEnabled(true);
    L10:
        r1.m159c();
        r1.f173w = r5;
        r1.f175y.setText(r5);
        int r03 = r1.f164n;
        if (r03 == 2) goto L13;
        r1.f165o = 2;
    L13:
        r1.m165i(r03, r1.f165o, r1.m164h(r1.f175y, r5));
    }

    public void setHelperTextColor(ColorStateList r2) {
        C0049y r02 = this.f2481j;
        r02.f149A = r2;
        C0868K r03 = r02.f175y;
        if (r03 == null) goto L7;
        if (r2 == null) goto L8;
        r03.setTextColor(r2);
        return;
    L8:
        return;
    }

    public void setHelperTextEnabled(boolean r8) {
        C0049y r02 = this.f2481j;
        if (r02.f174x == r8) goto L24;
        r02.m159c();
        if (r8 == false) goto L18;
        C0868K r3 = new C0868K(r02.f157g, null);
        r02.f175y = r3;
        r3.setId(C1031R.id.textinput_helper_text);
        r02.f175y.setTextAlignment(5);
        Typeface r1 = r02.f150B;
        if (r1 == null) goto L10;
        r02.f175y.setTypeface(r1);
    L10:
        r02.f175y.setVisibility(4);
        r02.f175y.setAccessibilityLiveRegion(1);
        int r12 = r02.f176z;
        r02.f176z = r12;
        C0868K r32 = r02.f175y;
        if (r32 == null) goto L13;
        r32.setTextAppearance(r12);
    L13:
        ColorStateList r13 = r02.f149A;
        r02.f149A = r13;
        C0868K r33 = r02.f175y;
        if (r33 == null) goto L17;
        if (r13 == null) goto L17;
        r33.setTextColor(r13);
    L17:
        r02.m157a(r02.f175y, 1);
        r02.f175y.setAccessibilityDelegate(new C0048x(r02));
    L22:
        r02.f174x = r8;
        return;
    L18:
        r02.m159c();
        int r34 = r02.f164n;
        if (r34 != 2) goto L21;
        r02.f165o = 0;
    L21:
        r02.m165i(r34, r02.f165o, r02.m164h(r02.f175y, ""));
        r02.m163g(r02.f175y, 1);
        r02.f175y = null;
        TextInputLayout r14 = r02.f158h;
        r14.m1904r();
        r14.m1910x();
        goto L22
    }

    public void setHelperTextTextAppearance(int r2) {
        C0049y r02 = this.f2481j;
        r02.f176z = r2;
        C0868K r03 = r02.f175y;
        if (r03 == null) goto L6;
        r03.setTextAppearance(r2);
        return;
    }

    public void setHint(CharSequence r2) {
        if (this.f2442C == false) goto L6;
        setHintInternal(r2);
        sendAccessibilityEvent(2048);
        return;
    }

    public void setHintAnimationEnabled(boolean r1) {
        this.f2510x0 = r1;
    }

    public void setHintEnabled(boolean r3) {
        if (r3 == this.f2442C) goto L23;
        this.f2442C = r3;
        if (r3 == true) goto L12;
        this.f2444E = false;
        if (TextUtils.isEmpty(this.f2443D) == false) goto L9;
    L11:
        setHintInternal(null);
    L20:
        if (this.f2469d == null) goto L24;
        m1906t();
        return;
    L24:
        return;
    L9:
        if (TextUtils.isEmpty(this.f2469d.getHint()) == false) goto L11;
        this.f2469d.setHint(this.f2443D);
        goto L11
    L12:
        CharSequence r32 = this.f2469d.getHint();
        if (TextUtils.isEmpty(r32) == false) goto L15;
    L18:
        this.f2444E = true;
        goto L20
    L15:
        if (TextUtils.isEmpty(this.f2443D) == false) goto L17;
        setHint(r32);
    L17:
        this.f2469d.setHint(null);
        goto L18
    }

    public void setHintTextAppearance(int r6) {
        C1068b r1 = this.f2506v0;
        View r2 = r1.f4120a;
        C1099d r02 = new C1099d(r2.getContext(), r6);
        ColorStateList r62 = r02.f4242j;
        if (r62 == null) goto L5;
        r1.f4136k = r62;
    L5:
        float r63 = r02.f4243k;
        if (r63 == 0.0f) goto L8;
        r1.f4134i = r63;
    L8:
        ColorStateList r64 = r02.f4233a;
        if (r64 == null) goto L11;
        r1.f4114U = r64;
    L11:
        r1.f4112S = r02.f4237e;
        r1.f4113T = r02.f4238f;
        r1.f4111R = r02.f4239g;
        r1.f4115V = r02.f4241i;
        C1096a r65 = r1.f4150y;
        if (r65 == null) goto L14;
        r65.f4226d = true;
    L14:
        C0095d r3 = new C0095d(23, r1);
        r02.m2585a();
        r1.f4150y = new C1096a(r3, r02.f4246n);
        r02.m2587c(r2.getContext(), r1.f4150y);
        r1.m2544h(false);
        this.f2482j0 = r1.f4136k;
        if (this.f2469d == null) goto L18;
        m1907u(false, false);
        m1906t();
        return;
    }

    public void setHintTextColor(ColorStateList r4) {
        if (this.f2482j0 != r4) goto L5;
        return;
    L5:
        if (this.f2480i0 != null) goto L9;
        C1068b r02 = this.f2506v0;
        if (r02.f4136k == r4) goto L9;
        r02.f4136k = r4;
        r02.m2544h(false);
    L9:
        this.f2482j0 = r4;
        if (this.f2469d == null) goto L14;
        m1907u(false, false);
        return;
    }

    public void setLengthCounter(InterfaceC0022H r1) {
        this.f2489n = r1;
    }

    public void setMaxEms(int r3) {
        this.f2475g = r3;
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r02.setMaxEms(r3);
        return;
    }

    public void setMaxWidth(int r3) {
        this.f2479i = r3;
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r02.setMaxWidth(r3);
        return;
    }

    public void setMaxWidthResource(int r2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    public void setMinEms(int r3) {
        this.f2473f = r3;
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r02.setMinEms(r3);
        return;
    }

    public void setMinWidth(int r3) {
        this.f2477h = r3;
        EditText r02 = this.f2469d;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r3 == (-1)) goto L9;
        r02.setMinWidth(r3);
        return;
    }

    public void setMinWidthResource(int r2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(r2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r3) {
        C0045u r02 = this.f2467c;
        if (r3 == 0) goto L5;
        CharSequence r32 = r02.getResources().getText(r3);
    L6:
        r02.f122g.setContentDescription(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
        C0045u r02 = this.f2467c;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02.getContext(), r3);
    L6:
        r02.f122g.setImageDrawable(r32);
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r4) {
        C0045u r02 = this.f2467c;
        if (r4 == true) goto L5;
    L7:
        if (r4 == true) goto L9;
        r02.m146g(0);
        return;
    L9:
        r02.getClass();
        return;
    L5:
        if (r02.f124i == 1) goto L7;
        r02.m146g(1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList r4) {
        C0045u r02 = this.f2467c;
        r02.f126k = r4;
        PorterDuff.Mode r1 = r02.f127l;
        AbstractC0040p.m98c(r02.f116a, r02.f122g, r4, r1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode r4) {
        C0045u r02 = this.f2467c;
        r02.f127l = r4;
        ColorStateList r1 = r02.f126k;
        AbstractC0040p.m98c(r02.f116a, r02.f122g, r1, r4);
    }

    public void setPlaceholderText(CharSequence r5) {
        Editable r1 = null;
        if (this.f2501t != null) goto L6;
        C0868K r02 = new C0868K(getContext(), null);
        this.f2501t = r02;
        r02.setId(C1031R.id.textinput_placeholder);
        this.f2501t.setImportantForAccessibility(2);
        C0449h r03 = m1891d();
        this.f2507w = r03;
        r03.f1010b = 67;
        this.f2509x = m1891d();
        setPlaceholderTextAppearance(this.f2505v);
        setPlaceholderTextColor(this.f2503u);
    L6:
        if (TextUtils.isEmpty(r5) == false) goto L9;
        setPlaceholderTextEnabled(false);
    L12:
        EditText r52 = this.f2469d;
        if (r52 == null) goto L16;
        r1 = r52.getText();
    L16:
        m1908v(r1);
        return;
    L9:
        if (this.f2499s == true) goto L11;
        setPlaceholderTextEnabled(true);
    L11:
        this.f2497r = r5;
        goto L12
    }

    public void setPlaceholderTextAppearance(int r2) {
        this.f2505v = r2;
        C0868K r02 = this.f2501t;
        if (r02 == null) goto L6;
        r02.setTextAppearance(r2);
        return;
    }

    public void setPlaceholderTextColor(ColorStateList r2) {
        if (this.f2503u == r2) goto L9;
        this.f2503u = r2;
        C0868K r02 = this.f2501t;
        if (r02 == null) goto L10;
        if (r2 == null) goto L11;
        r02.setTextColor(r2);
        return;
    L11:
        return;
    L10:
        return;
    }

    public void setPrefixText(CharSequence r3) {
        C0015A r02 = this.f2465b;
        r02.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r02.f44c = r1;
        r02.f43b.setText(r3);
        r02.m23e();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setPrefixTextAppearance(int r2) {
        this.f2465b.f43b.setTextAppearance(r2);
    }

    public void setPrefixTextColor(ColorStateList r2) {
        this.f2465b.f43b.setTextColor(r2);
    }

    public void setShapeAppearanceModel(C1127k r2) {
        C1123g r02 = this.f2445F;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f4312a.f4290a == r2) goto L9;
        this.f2451L = r2;
        m1889b();
        return;
    }

    public void setStartIconCheckable(boolean r2) {
        this.f2465b.f45d.setCheckable(r2);
    }

    public void setStartIconContentDescription(CharSequence r3) {
        CheckableImageButton r02 = this.f2465b.f45d;
        if (r02.getContentDescription() == r3) goto L6;
        r02.setContentDescription(r3);
        return;
    }

    public void setStartIconDrawable(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC0358S.m916w(getContext(), r2);
    L5:
        setStartIconDrawable(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setStartIconMinSize(int r3) {
        C0015A r02 = this.f2465b;
        if (r3 >= 0) goto L5;
        r02.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    L5:
        if (r3 == r02.f48g) goto L10;
        r02.f48g = r3;
        CheckableImageButton r03 = r02.f45d;
        r03.setMinimumWidth(r3);
        r03.setMinimumHeight(r3);
        return;
    }

    public void setStartIconOnClickListener(View.OnClickListener r3) {
        C0015A r02 = this.f2465b;
        View.OnLongClickListener r1 = r02.f50i;
        CheckableImageButton r03 = r02.f45d;
        r03.setOnClickListener(r3);
        AbstractC0040p.m89T(r03, r1);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener r2) {
        C0015A r02 = this.f2465b;
        r02.f50i = r2;
        CheckableImageButton r03 = r02.f45d;
        r03.setOnLongClickListener(r2);
        AbstractC0040p.m89T(r03, r2);
    }

    public void setStartIconScaleType(ImageView.ScaleType r2) {
        C0015A r02 = this.f2465b;
        r02.f49h = r2;
        r02.f45d.setScaleType(r2);
    }

    public void setStartIconTintList(ColorStateList r4) {
        C0015A r02 = this.f2465b;
        if (r02.f46e == r4) goto L6;
        r02.f46e = r4;
        PorterDuff.Mode r1 = r02.f47f;
        AbstractC0040p.m98c(r02.f42a, r02.f45d, r4, r1);
        return;
    }

    public void setStartIconTintMode(PorterDuff.Mode r4) {
        C0015A r02 = this.f2465b;
        if (r02.f47f == r4) goto L6;
        r02.f47f = r4;
        ColorStateList r1 = r02.f46e;
        AbstractC0040p.m98c(r02.f42a, r02.f45d, r1, r4);
        return;
    }

    public void setStartIconVisible(boolean r2) {
        this.f2465b.m21c(r2);
    }

    public void setSuffixText(CharSequence r3) {
        C0045u r02 = this.f2467c;
        r02.getClass();
        if (TextUtils.isEmpty(r3) == false) goto L5;
        CharSequence r1 = null;
    L6:
        r02.f131p = r1;
        r02.f132q.setText(r3);
        r02.m153n();
        return;
    L5:
        r1 = r3;
        goto L6
    }

    public void setSuffixTextAppearance(int r2) {
        this.f2467c.f132q.setTextAppearance(r2);
    }

    public void setSuffixTextColor(ColorStateList r2) {
        this.f2467c.f132q.setTextColor(r2);
    }

    public void setTextInputAccessibilityDelegate(C0021G r2) {
        EditText r02 = this.f2469d;
        if (r02 == null) goto L6;
        AbstractC0080Q.m291j(r02, r2);
        return;
    }

    public void setTypeface(Typeface r3) {
        if (r3 == this.f2466b0) goto L16;
        this.f2466b0 = r3;
        this.f2506v0.m2549m(r3);
        C0049y r02 = this.f2481j;
        if (r3 == r02.f150B) goto L12;
        r02.f150B = r3;
        C0868K r1 = r02.f168r;
        if (r1 == null) goto L9;
        r1.setTypeface(r3);
    L9:
        C0868K r03 = r02.f175y;
        if (r03 == null) goto L12;
        r03.setTypeface(r3);
    L12:
        C0868K r04 = this.f2491o;
        if (r04 == null) goto L17;
        r04.setTypeface(r3);
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m1906t() {
        if (this.f2454O == 1) goto L8;
        FrameLayout r02 = this.f2463a;
        LinearLayout.LayoutParams r1 = (LinearLayout.LayoutParams) r02.getLayoutParams();
        int r2 = m1890c();
        if (r2 == r1.topMargin) goto L9;
        r1.topMargin = r2;
        r02.requestLayout();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m1907u(boolean r10, boolean r11) {
        boolean r02 = isEnabled();
        EditText r1 = this.f2469d;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        EditText r4 = this.f2469d;
        if (r4 != null) goto L11;
    L13:
        boolean r42 = false;
    L14:
        ColorStateList r5 = this.f2480i0;
        C1068b r6 = this.f2506v0;
        if (r5 == null) goto L17;
        r6.m2545i(r5);
    L17:
        Editable r52 = null;
        if (r02 == true) goto L25;
        ColorStateList r03 = this.f2480i0;
        if (r03 == null) goto L22;
        int r04 = r03.getColorForState(new int[]{-16842910}, this.f2500s0);
    L23:
        r6.m2545i(ColorStateList.valueOf(r04));
    L42:
        C0045u r05 = this.f2467c;
        C0015A r7 = this.f2465b;
        if (r12 == false) goto L45;
    L77:
        if (r11 == false) goto L79;
    L80:
        ValueAnimator r112 = this.f2512y0;
        if (r112 == null) goto L86;
        if (r112.isRunning() == false) goto L86;
        this.f2512y0.cancel();
    L86:
        if (r10 == true) goto L88;
    L90:
        r6.m2547k(1.0f);
    L91:
        this.f2504u0 = false;
        if (m1892e() == false) goto L94;
        m1897j();
    L94:
        EditText r102 = this.f2469d;
        if (r102 == null) goto L98;
        r52 = r102.getText();
    L98:
        m1908v(r52);
        r7.f51j = false;
        r7.m23e();
        r05.f133r = false;
        r05.m153n();
        return;
    L88:
        if (this.f2510x0 == false) goto L90;
        m1888a(1.0f);
        goto L91
    L79:
        if (this.f2504u0 == true) goto L80;
        return;
    L45:
        if (this.f2508w0 == false) goto L77;
        if (isEnabled() == false) goto L50;
        if (r42 == true) goto L77;
    L50:
        if (r11 == false) goto L52;
    L53:
        ValueAnimator r113 = this.f2512y0;
        if (r113 == null) goto L59;
        if (r113.isRunning() == false) goto L59;
        this.f2512y0.cancel();
    L59:
        if (r10 == true) goto L61;
    L63:
        r6.m2547k(0.0f);
    L65:
        if (m1892e() == true) goto L67;
    L71:
        this.f2504u0 = true;
        C0868K r103 = this.f2501t;
        if (r103 != null) goto L74;
    L76:
        r7.f51j = true;
        r7.m23e();
        r05.f133r = true;
        r05.m153n();
        return;
    L74:
        if (this.f2499s == false) goto L76;
        r103.setText(null);
        AbstractC0458q.m1089a(this.f2463a, this.f2509x);
        this.f2501t.setVisibility(4);
        goto L76
    L67:
        if ((!((C0033i) this.f2445F).f86x.f84v.isEmpty()) == false) goto L71;
        if (m1892e() == false) goto L71;
        ((C0033i) this.f2445F).m70o(0.0f, 0.0f, 0.0f, 0.0f);
        goto L71
    L61:
        if (this.f2510x0 == false) goto L63;
        m1888a(0.0f);
        goto L65
    L52:
        if (this.f2504u0 == false) goto L53;
        return;
    L22:
        r04 = this.f2500s0;
        goto L23
    L25:
        if (m1899m() == false) goto L32;
        C0868K r06 = this.f2481j.f168r;
        if (r06 == null) goto L29;
        ColorStateList r07 = r06.getTextColors();
    L30:
        r6.m2545i(r07);
        goto L42
    L29:
        r07 = null;
        goto L30
    L32:
        if (this.f2487m == false) goto L36;
        C0868K r08 = this.f2491o;
        if (r08 == null) goto L36;
        r6.m2545i(r08.getTextColors());
    L36:
        if (r42 == false) goto L42;
        ColorStateList r09 = this.f2482j0;
        if (r09 == null) goto L42;
        if (r6.f4136k == r09) goto L42;
        r6.f4136k = r09;
        r6.m2544h(false);
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

    /* JADX INFO: renamed from: v */
    public final void m1908v(Editable r4) {
        ((C0017C) this.f2489n).getClass();
        if (r4 == null) goto L5;
        int r42 = r4.length();
    L6:
        FrameLayout r1 = this.f2463a;
        if (r42 == 0) goto L9;
    L17:
        C0868K r43 = this.f2501t;
        if (r43 != null) goto L20;
        return;
    L20:
        if (this.f2499s == false) goto L28;
        r43.setText(null);
        AbstractC0458q.m1089a(r1, this.f2509x);
        this.f2501t.setVisibility(4);
        return;
    L28:
        return;
    L9:
        if (this.f2504u0 == true) goto L17;
        if (this.f2501t != null) goto L13;
        return;
    L13:
        if (this.f2499s == true) goto L15;
        return;
    L15:
        if (TextUtils.isEmpty(this.f2497r) == true) goto L25;
        this.f2501t.setText(this.f2497r);
        AbstractC0458q.m1089a(r1, this.f2507w);
        this.f2501t.setVisibility(0);
        this.f2501t.bringToFront();
        announceForAccessibility(this.f2497r);
        return;
    L25:
        return;
    L5:
        r42 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: w */
    public final void m1909w(boolean r6, boolean r7) {
        int r02 = this.f2490n0.getDefaultColor();
        int r1 = this.f2490n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, r02);
        int r2 = this.f2490n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, r02);
        if (r6 == false) goto L5;
        this.f2459T = r2;
        return;
    L5:
        if (r7 == false) goto L7;
        this.f2459T = r1;
        return;
    L7:
        this.f2459T = r02;
    }

    /* JADX INFO: renamed from: x */
    public final void m1910x() {
        if (this.f2445F != null) goto L5;
        return;
    L5:
        if (this.f2454O == 0) goto L88;
        boolean r1 = false;
        if (isFocused() == true) goto L15;
        EditText r02 = this.f2469d;
        if (r02 != null) goto L12;
    L14:
        boolean r03 = false;
    L17:
        if (isHovered() == true) goto L22;
        EditText r3 = this.f2469d;
        if (r3 == null) goto L24;
        if (r3.isHovered() == true) goto L22;
    L24:
        if (isEnabled() == true) goto L27;
        this.f2459T = this.f2500s0;
    L46:
        if (Build.VERSION.SDK_INT < 29) goto L48;
        m1902p();
    L48:
        C0045u r32 = this.f2467c;
        r32.m151l();
        CheckableImageButton r4 = r32.f118c;
        ColorStateList r5 = r32.f119d;
        TextInputLayout r6 = r32.f116a;
        AbstractC0040p.m86O(r6, r4, r5);
        ColorStateList r42 = r32.f126k;
        CheckableImageButton r52 = r32.f122g;
        AbstractC0040p.m86O(r6, r52, r42);
        if ((r32.m141b() instanceof C0039o) == true) goto L51;
    L56:
        C0015A r33 = this.f2465b;
        AbstractC0040p.m86O(r33.f42a, r33.f45d, r33.f46e);
        if (this.f2454O != 2) goto L75;
        int r34 = this.f2456Q;
        if (r03 == true) goto L61;
    L63:
        this.f2456Q = this.f2457R;
    L65:
        if (this.f2456Q == r34) goto L75;
        if (m1892e() == false) goto L75;
        if (this.f2504u0 == true) goto L75;
        if (m1892e() == false) goto L73;
        ((C0033i) this.f2445F).m70o(0.0f, 0.0f, 0.0f, 0.0f);
    L73:
        m1897j();
        goto L75
    L61:
        if (isEnabled() == false) goto L63;
        this.f2456Q = this.f2458S;
    L75:
        if (this.f2454O == 1) goto L77;
    L85:
        m1889b();
        return;
    L77:
        if (isEnabled() == true) goto L79;
        this.f2460U = this.f2494p0;
        goto L85
    L79:
        if (r1 == false) goto L82;
        if (r03 == true) goto L82;
        this.f2460U = this.f2498r0;
    L82:
        if (r03 == false) goto L84;
        this.f2460U = this.f2496q0;
        goto L85
    L84:
        this.f2460U = this.f2492o0;
        goto L85
    L51:
        if (r6.m1899m() == true) goto L53;
    L55:
        AbstractC0040p.m98c(r6, r52, r32.f126k, r32.f127l);
        goto L56
    L53:
        if (r52.getDrawable() == null) goto L55;
        Drawable r35 = r52.getDrawable().mutate();
        AbstractC1111a.m2625g(r35, r6.getErrorCurrentTextColors());
        r52.setImageDrawable(r35);
        goto L56
    L27:
        if (m1899m() == false) goto L33;
        if (this.f2490n0 == null) goto L31;
        m1909w(r03, r1);
        goto L46
    L31:
        this.f2459T = getErrorCurrentTextColors();
        goto L46
    L33:
        if (this.f2487m == false) goto L40;
        C0868K r36 = this.f2491o;
        if (r36 == null) goto L40;
        if (this.f2490n0 == null) goto L39;
        m1909w(r03, r1);
        goto L46
    L39:
        this.f2459T = r36.getCurrentTextColor();
    L40:
        if (r03 == false) goto L42;
        this.f2459T = this.f2488m0;
        goto L46
    L42:
        if (r1 == false) goto L44;
        this.f2459T = this.f2486l0;
        goto L46
    L44:
        this.f2459T = this.f2484k0;
    L22:
        r1 = true;
        goto L24
    L12:
        if (r02.hasFocus() == false) goto L14;
    L15:
        r03 = true;
        goto L17
    }

    public void setStartIconDrawable(Drawable r2) {
        this.f2465b.m20b(r2);
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

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence r2) {
        this.f2467c.f122g.setContentDescription(r2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable r2) {
        this.f2467c.f122g.setImageDrawable(r2);
    }

    public void setErrorIconDrawable(Drawable r2) {
        this.f2467c.m148i(r2);
    }

    public void setEndIconContentDescription(CharSequence r3) {
        CheckableImageButton r02 = this.f2467c.f122g;
        if (r02.getContentDescription() == r3) goto L6;
        r02.setContentDescription(r3);
        return;
    }

    public void setEndIconDrawable(Drawable r5) {
        C0045u r02 = this.f2467c;
        CheckableImageButton r1 = r02.f122g;
        r1.setImageDrawable(r5);
        if (r5 == null) goto L6;
        ColorStateList r52 = r02.f126k;
        PorterDuff.Mode r2 = r02.f127l;
        TextInputLayout r3 = r02.f116a;
        AbstractC0040p.m98c(r3, r1, r52, r2);
        AbstractC0040p.m86O(r3, r1, r02.f126k);
        return;
    }
}
