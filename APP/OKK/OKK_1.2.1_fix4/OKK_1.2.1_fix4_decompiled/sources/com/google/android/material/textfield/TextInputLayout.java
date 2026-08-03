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
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.luckypray.dexkit.C1031R;
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
import p056f0.AbstractC0805P;
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
    public static final int[][] f2437C0 = {new int[]{R.attr.state_pressed}, new int[0]};

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

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0059a.m197a(context, attributeSet, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout), attributeSet, C1031R.attr.textInputStyle);
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
        C1068b c1068b = new C1068b(this);
        this.f2506v0 = c1068b;
        this.f2441B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2463a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0945a.f3354a;
        c1068b.f4110Q = linearInterpolator;
        c1068b.m2544h(false);
        c1068b.f4109P = linearInterpolator;
        c1068b.m2544h(false);
        if (c1068b.f4132g != 8388659) {
            c1068b.f4132g = 8388659;
            c1068b.m2544h(false);
        }
        int[] iArr = AbstractC0942a.f3349u;
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout);
        C0234d c0234d = new C0234d(context2, typedArrayObtainStyledAttributes);
        C0015A c0015a = new C0015A(this, c0234d);
        this.f2465b = c0015a;
        this.f2442C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f2510x0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f2508w0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2451L = C1127k.m2657a(context2, attributeSet, C1031R.attr.textInputStyle, C1031R.style.Widget_Design_TextInputLayout).m2656a();
        this.f2453N = context2.getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2455P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2457R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2458S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2456Q = this.f2457R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C1126j c1126jM2660d = this.f2451L.m2660d();
        if (dimension >= 0.0f) {
            c1126jM2660d.f4339e = new C1117a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c1126jM2660d.f4340f = new C1117a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c1126jM2660d.f4341g = new C1117a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c1126jM2660d.f4342h = new C1117a(dimension4);
        }
        this.f2451L = c1126jM2660d.m2656a();
        ColorStateList colorStateListM2050q = AbstractC0805P.m2050q(context2, c0234d, 7);
        if (colorStateListM2050q != null) {
            int defaultColor = colorStateListM2050q.getDefaultColor();
            this.f2492o0 = defaultColor;
            this.f2460U = defaultColor;
            if (colorStateListM2050q.isStateful()) {
                this.f2494p0 = colorStateListM2050q.getColorForState(new int[]{-16842910}, -1);
                this.f2496q0 = colorStateListM2050q.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2498r0 = colorStateListM2050q.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2496q0 = this.f2492o0;
                ColorStateList colorStateListM2049p = AbstractC0805P.m2049p(context2, C1031R.color.mtrl_filled_background_color);
                this.f2494p0 = colorStateListM2049p.getColorForState(new int[]{-16842910}, -1);
                this.f2498r0 = colorStateListM2049p.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2460U = 0;
            this.f2492o0 = 0;
            this.f2494p0 = 0;
            this.f2496q0 = 0;
            this.f2498r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM645h = c0234d.m645h(1);
            this.f2482j0 = colorStateListM645h;
            this.f2480i0 = colorStateListM645h;
        }
        ColorStateList colorStateListM2050q2 = AbstractC0805P.m2050q(context2, c0234d, 14);
        this.f2488m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f2484k0 = AbstractC1081b.m2562a(context2, C1031R.color.mtrl_textinput_default_box_stroke_color);
        this.f2500s0 = AbstractC1081b.m2562a(context2, C1031R.color.mtrl_textinput_disabled_color);
        this.f2486l0 = AbstractC1081b.m2562a(context2, C1031R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM2050q2 != null) {
            setBoxStrokeColorStateList(colorStateListM2050q2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0805P.m2050q(context2, c0234d, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2438A = c0234d.m645h(24);
        this.f2440B = c0234d.m645h(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f2495q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f2493p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f2493p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2495q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0234d.m645h(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0234d.m645h(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0234d.m645h(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0234d.m645h(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0234d.m645h(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0234d.m645h(58));
        }
        C0045u c0045u = new C0045u(this, c0234d);
        this.f2467c = c0045u;
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0234d.m657u();
        setImportantForAccessibility(2);
        AbstractC0072I.m253m(this, 1);
        frameLayout.addView(c0015a);
        frameLayout.addView(c0045u);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2469d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC0040p.m80C(editText)) {
            return this.f2445F;
        }
        int iM2048o = AbstractC0805P.m2048o(this.f2469d, C1031R.attr.colorControlHighlight);
        int i2 = this.f2454O;
        int[][] iArr = f2437C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            C1123g c1123g = this.f2445F;
            int i3 = this.f2460U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0805P.m2033I(iM2048o, i3, 0.1f), i3}), c1123g, c1123g);
        }
        Context context = getContext();
        C1123g c1123g2 = this.f2445F;
        TypedValue typedValueM2040T = AbstractC0805P.m2040T(context, C1031R.attr.colorSurface, "TextInputLayout");
        int i4 = typedValueM2040T.resourceId;
        int iM2562a = i4 != 0 ? AbstractC1081b.m2562a(context, i4) : typedValueM2040T.data;
        C1123g c1123g3 = new C1123g(c1123g2.f4312a.f4290a);
        int iM2033I = AbstractC0805P.m2033I(iM2048o, iM2562a, 0.1f);
        c1123g3.m2651k(new ColorStateList(iArr, new int[]{iM2033I, 0}));
        c1123g3.setTint(iM2562a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM2033I, iM2562a});
        C1123g c1123g4 = new C1123g(c1123g2.f4312a.f4290a);
        c1123g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1123g3, c1123g4), c1123g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2447H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2447H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2447H.addState(new int[0], m1893f(false));
        }
        return this.f2447H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2446G == null) {
            this.f2446G = m1893f(true);
        }
        return this.f2446G;
    }

    /* JADX INFO: renamed from: k */
    public static void m1887k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m1887k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2469d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z2 = editText instanceof TextInputEditText;
        }
        this.f2469d = editText;
        int i2 = this.f2473f;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f2477h);
        }
        int i3 = this.f2475g;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f2479i);
        }
        this.f2448I = false;
        m1896i();
        setTextInputAccessibilityDelegate(new C0021G(this));
        Typeface typeface = this.f2469d.getTypeface();
        C1068b c1068b = this.f2506v0;
        c1068b.m2549m(typeface);
        float textSize = this.f2469d.getTextSize();
        if (c1068b.f4133h != textSize) {
            c1068b.f4133h = textSize;
            c1068b.m2544h(false);
        }
        int i4 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2469d.getLetterSpacing();
        if (c1068b.f4116W != letterSpacing) {
            c1068b.f4116W = letterSpacing;
            c1068b.m2544h(false);
        }
        int gravity = this.f2469d.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (c1068b.f4132g != i5) {
            c1068b.f4132g = i5;
            c1068b.m2544h(false);
        }
        if (c1068b.f4130f != gravity) {
            c1068b.f4130f = gravity;
            c1068b.m2544h(false);
        }
        Field field = AbstractC0080Q.f219a;
        this.f2502t0 = editText.getMinimumHeight();
        this.f2469d.addTextChangedListener(new C0018D(this, editText));
        if (this.f2480i0 == null) {
            this.f2480i0 = this.f2469d.getHintTextColors();
        }
        if (this.f2442C) {
            if (TextUtils.isEmpty(this.f2443D)) {
                CharSequence hint = this.f2469d.getHint();
                this.f2471e = hint;
                setHint(hint);
                this.f2469d.setHint((CharSequence) null);
            }
            this.f2444E = true;
        }
        if (i4 >= 29) {
            m1902p();
        }
        if (this.f2491o != null) {
            m1900n(this.f2469d.getText());
        }
        m1904r();
        this.f2481j.m158b();
        this.f2465b.bringToFront();
        C0045u c0045u = this.f2467c;
        c0045u.bringToFront();
        Iterator it = this.f2472e0.iterator();
        while (it.hasNext()) {
            ((C0042r) it.next()).m137a(this);
        }
        c0045u.m152m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1907u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2443D)) {
            return;
        }
        this.f2443D = charSequence;
        C1068b c1068b = this.f2506v0;
        if (charSequence == null || !TextUtils.equals(c1068b.f4094A, charSequence)) {
            c1068b.f4094A = charSequence;
            c1068b.f4095B = null;
            Bitmap bitmap = c1068b.f4098E;
            if (bitmap != null) {
                bitmap.recycle();
                c1068b.f4098E = null;
            }
            c1068b.m2544h(false);
        }
        if (this.f2504u0) {
            return;
        }
        m1897j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2499s == z2) {
            return;
        }
        if (z2) {
            C0868K c0868k = this.f2501t;
            if (c0868k != null) {
                this.f2463a.addView(c0868k);
                this.f2501t.setVisibility(0);
            }
        } else {
            C0868K c0868k2 = this.f2501t;
            if (c0868k2 != null) {
                c0868k2.setVisibility(8);
            }
            this.f2501t = null;
        }
        this.f2499s = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1888a(float f2) {
        int i2 = 0;
        C1068b c1068b = this.f2506v0;
        if (c1068b.f4122b == f2) {
            return;
        }
        if (this.f2512y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2512y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0805P.m2039S(getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b));
            this.f2512y0.setDuration(AbstractC0805P.m2038R(getContext(), C1031R.attr.motionDurationMedium4, 167));
            this.f2512y0.addUpdateListener(new C0020F(i2, this));
        }
        this.f2512y0.setFloatValues(c1068b.f4122b, f2);
        this.f2512y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2463a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1906t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m1889b() {
        int i2;
        int i3;
        C1123g c1123g = this.f2445F;
        if (c1123g == null) {
            return;
        }
        C1127k c1127k = c1123g.f4312a.f4290a;
        C1127k c1127k2 = this.f2451L;
        if (c1127k != c1127k2) {
            c1123g.setShapeAppearanceModel(c1127k2);
        }
        if (this.f2454O == 2 && (i2 = this.f2456Q) > -1 && (i3 = this.f2459T) != 0) {
            C1123g c1123g2 = this.f2445F;
            c1123g2.f4312a.f4300k = i2;
            c1123g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            C1122f c1122f = c1123g2.f4312a;
            if (c1122f.f4293d != colorStateListValueOf) {
                c1122f.f4293d = colorStateListValueOf;
                c1123g2.onStateChange(c1123g2.getState());
            }
        }
        int iM2593b = this.f2460U;
        if (this.f2454O == 1) {
            iM2593b = AbstractC1100a.m2593b(this.f2460U, AbstractC0805P.m2047n(getContext(), C1031R.attr.colorSurface, 0));
        }
        this.f2460U = iM2593b;
        this.f2445F.m2651k(ColorStateList.valueOf(iM2593b));
        C1123g c1123g3 = this.f2449J;
        if (c1123g3 != null && this.f2450K != null) {
            if (this.f2456Q > -1 && this.f2459T != 0) {
                c1123g3.m2651k(this.f2469d.isFocused() ? ColorStateList.valueOf(this.f2484k0) : ColorStateList.valueOf(this.f2459T));
                this.f2450K.m2651k(ColorStateList.valueOf(this.f2459T));
            }
            invalidate();
        }
        m1905s();
    }

    /* JADX INFO: renamed from: c */
    public final int m1890c() {
        float fM2541d;
        if (!this.f2442C) {
            return 0;
        }
        int i2 = this.f2454O;
        C1068b c1068b = this.f2506v0;
        if (i2 == 0) {
            fM2541d = c1068b.m2541d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fM2541d = c1068b.m2541d() / 2.0f;
        }
        return (int) fM2541d;
    }

    /* JADX INFO: renamed from: d */
    public final C0449h m1891d() {
        C0449h c0449h = new C0449h();
        c0449h.f1011c = AbstractC0805P.m2038R(getContext(), C1031R.attr.motionDurationShort2, 87);
        c0449h.f1012d = AbstractC0805P.m2039S(getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
        return c0449h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f2469d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2471e != null) {
            boolean z2 = this.f2444E;
            this.f2444E = false;
            CharSequence hint = editText.getHint();
            this.f2469d.setHint(this.f2471e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f2469d.setHint(hint);
                this.f2444E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f2463a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f2469d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2439A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2439A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1123g c1123g;
        int i2;
        super.draw(canvas);
        boolean z2 = this.f2442C;
        C1068b c1068b = this.f2506v0;
        if (z2) {
            c1068b.getClass();
            int iSave = canvas.save();
            if (c1068b.f4095B != null) {
                RectF rectF = c1068b.f4128e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c1068b.f4107N;
                    textPaint.setTextSize(c1068b.f4100G);
                    float f2 = c1068b.f4141p;
                    float f3 = c1068b.f4142q;
                    float f4 = c1068b.f4099F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (c1068b.f4127d0 <= 1 || c1068b.f4096C) {
                        canvas.translate(f2, f3);
                        c1068b.f4118Y.draw(canvas);
                    } else {
                        float lineStart = c1068b.f4141p - c1068b.f4118Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (c1068b.f4123b0 * f5));
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            float f6 = c1068b.f4101H;
                            float f7 = c1068b.f4102I;
                            float f8 = c1068b.f4103J;
                            int i4 = c1068b.f4104K;
                            textPaint.setShadowLayer(f6, f7, f8, AbstractC1100a.m2595d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                        }
                        c1068b.f4118Y.draw(canvas);
                        textPaint.setAlpha((int) (c1068b.f4121a0 * f5));
                        if (i3 >= 31) {
                            float f9 = c1068b.f4101H;
                            float f10 = c1068b.f4102I;
                            float f11 = c1068b.f4103J;
                            int i5 = c1068b.f4104K;
                            textPaint.setShadowLayer(f9, f10, f11, AbstractC1100a.m2595d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c1068b.f4118Y.getLineBaseline(0);
                        CharSequence charSequence = c1068b.f4125c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i3 >= 31) {
                            textPaint.setShadowLayer(c1068b.f4101H, c1068b.f4102I, c1068b.f4103J, c1068b.f4104K);
                        }
                        String strTrim = c1068b.f4125c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i2 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i2 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c1068b.f4118Y.getLineEnd(i2), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f2450K == null || (c1123g = this.f2449J) == null) {
            return;
        }
        c1123g.draw(canvas);
        if (this.f2469d.isFocused()) {
            Rect bounds = this.f2450K.getBounds();
            Rect bounds2 = this.f2449J.getBounds();
            float f13 = c1068b.f4122b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0945a.m2277c(iCenterX, bounds2.left, f13);
            bounds.right = AbstractC0945a.m2277c(iCenterX, bounds2.right, f13);
            this.f2450K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f2514z0) {
            return;
        }
        this.f2514z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1068b c1068b = this.f2506v0;
        if (c1068b != null) {
            c1068b.f4105L = drawableState;
            ColorStateList colorStateList2 = c1068b.f4136k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c1068b.f4135j) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                c1068b.m2544h(false);
                z2 = true;
            }
        }
        if (this.f2469d != null) {
            Field field = AbstractC0080Q.f219a;
            m1907u(isLaidOut() && isEnabled(), false);
        }
        m1904r();
        m1910x();
        if (z2) {
            invalidate();
        }
        this.f2514z0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1892e() {
        return this.f2442C && !TextUtils.isEmpty(this.f2443D) && (this.f2445F instanceof C0033i);
    }

    /* JADX INFO: renamed from: f */
    public final C1123g m1893f(boolean z2) {
        int i2 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C1031R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1125i c1125i = new C1125i();
        C1125i c1125i2 = new C1125i();
        C1125i c1125i3 = new C1125i();
        C1125i c1125i4 = new C1125i();
        C1121e c1121e = new C1121e(i2);
        C1121e c1121e2 = new C1121e(i2);
        C1121e c1121e3 = new C1121e(i2);
        C1121e c1121e4 = new C1121e(i2);
        C1117a c1117a = new C1117a(f2);
        C1117a c1117a2 = new C1117a(f2);
        C1117a c1117a3 = new C1117a(dimensionPixelOffset);
        C1117a c1117a4 = new C1117a(dimensionPixelOffset);
        C1127k c1127k = new C1127k();
        c1127k.f4347a = c1125i;
        c1127k.f4348b = c1125i2;
        c1127k.f4349c = c1125i3;
        c1127k.f4350d = c1125i4;
        c1127k.f4351e = c1117a;
        c1127k.f4352f = c1117a2;
        c1127k.f4353g = c1117a4;
        c1127k.f4354h = c1117a3;
        c1127k.f4355i = c1121e;
        c1127k.f4356j = c1121e2;
        c1127k.f4357k = c1121e3;
        c1127k.f4358l = c1121e4;
        Context context = getContext();
        Paint paint = C1123g.f4311w;
        TypedValue typedValueM2040T = AbstractC0805P.m2040T(context, C1031R.attr.colorSurface, C1123g.class.getSimpleName());
        int i3 = typedValueM2040T.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3 != 0 ? AbstractC1081b.m2562a(context, i3) : typedValueM2040T.data);
        C1123g c1123g = new C1123g();
        c1123g.m2649i(context);
        c1123g.m2651k(colorStateListValueOf);
        c1123g.m2650j(dimensionPixelOffset2);
        c1123g.setShapeAppearanceModel(c1127k);
        C1122f c1122f = c1123g.f4312a;
        if (c1122f.f4297h == null) {
            c1122f.f4297h = new Rect();
        }
        c1123g.f4312a.f4297h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c1123g.invalidateSelf();
        return c1123g;
    }

    /* JADX INFO: renamed from: g */
    public final int m1894g(int i2, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2469d.getCompoundPaddingLeft() : this.f2467c.m142c() : this.f2465b.m19a()) + i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2469d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1890c() + getPaddingTop() + editText.getBaseline();
    }

    public C1123g getBoxBackground() {
        int i2 = this.f2454O;
        if (i2 == 1 || i2 == 2) {
            return this.f2445F;
        }
        throw new IllegalStateException();
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
        boolean zM2557e = AbstractC1077k.m2557e(this);
        RectF rectF = this.f2464a0;
        return zM2557e ? this.f2451L.f4354h.mo2634a(rectF) : this.f2451L.f4353g.mo2634a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM2557e = AbstractC1077k.m2557e(this);
        RectF rectF = this.f2464a0;
        return zM2557e ? this.f2451L.f4353g.mo2634a(rectF) : this.f2451L.f4354h.mo2634a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM2557e = AbstractC1077k.m2557e(this);
        RectF rectF = this.f2464a0;
        return zM2557e ? this.f2451L.f4351e.mo2634a(rectF) : this.f2451L.f4352f.mo2634a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM2557e = AbstractC1077k.m2557e(this);
        RectF rectF = this.f2464a0;
        return zM2557e ? this.f2451L.f4352f.mo2634a(rectF) : this.f2451L.f4351e.mo2634a(rectF);
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
        C0868K c0868k;
        if (this.f2483k && this.f2487m && (c0868k = this.f2491o) != null) {
            return c0868k.getContentDescription();
        }
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
        C0049y c0049y = this.f2481j;
        if (c0049y.f167q) {
            return c0049y.f166p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2481j.f170t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2481j.f169s;
    }

    public int getErrorCurrentTextColors() {
        C0868K c0868k = this.f2481j.f168r;
        if (c0868k != null) {
            return c0868k.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2467c.f118c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0049y c0049y = this.f2481j;
        if (c0049y.f174x) {
            return c0049y.f173w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0868K c0868k = this.f2481j.f175y;
        if (c0868k != null) {
            return c0868k.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2442C) {
            return this.f2443D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2506v0.m2541d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C1068b c1068b = this.f2506v0;
        return c1068b.m2542e(c1068b.f4136k);
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
        if (this.f2499s) {
            return this.f2497r;
        }
        return null;
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
    public final int m1895h(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2469d.getCompoundPaddingRight() : this.f2465b.m19a() : this.f2467c.m142c());
    }

    /* JADX INFO: renamed from: i */
    public final void m1896i() {
        int i2 = this.f2454O;
        if (i2 == 0) {
            this.f2445F = null;
            this.f2449J = null;
            this.f2450K = null;
        } else if (i2 == 1) {
            this.f2445F = new C1123g(this.f2451L);
            this.f2449J = new C1123g();
            this.f2450K = new C1123g();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.f2454O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2442C || (this.f2445F instanceof C0033i)) {
                this.f2445F = new C1123g(this.f2451L);
            } else {
                C1127k c1127k = this.f2451L;
                int i3 = C0033i.f85y;
                if (c1127k == null) {
                    c1127k = new C1127k();
                }
                this.f2445F = new C0033i(new C0032h(c1127k, new RectF()));
            }
            this.f2449J = null;
            this.f2450K = null;
        }
        m1905s();
        m1910x();
        if (this.f2454O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2455P = getResources().getDimensionPixelSize(C1031R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0805P.m2031E(getContext())) {
                this.f2455P = getResources().getDimensionPixelSize(C1031R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2469d != null && this.f2454O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2469d;
                Field field = AbstractC0080Q.f219a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2469d.getPaddingEnd(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0805P.m2031E(getContext())) {
                EditText editText2 = this.f2469d;
                Field field2 = AbstractC0080Q.f219a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2469d.getPaddingEnd(), getResources().getDimensionPixelSize(C1031R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2454O != 0) {
            m1906t();
        }
        EditText editText3 = this.f2469d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f2454O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1897j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i2;
        int i3;
        if (m1892e()) {
            int width = this.f2469d.getWidth();
            int gravity = this.f2469d.getGravity();
            C1068b c1068b = this.f2506v0;
            boolean zM2539b = c1068b.m2539b(c1068b.f4094A);
            c1068b.f4096C = zM2539b;
            Rect rect = c1068b.f4126d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM2539b) {
                        i3 = rect.left;
                        f4 = i3;
                    } else {
                        f2 = rect.right;
                        f3 = c1068b.f4119Z;
                    }
                } else if (zM2539b) {
                    f2 = rect.right;
                    f3 = c1068b.f4119Z;
                } else {
                    i3 = rect.left;
                    f4 = i3;
                }
                float fMax = Math.max(f4, rect.left);
                rectF = this.f2464a0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (c1068b.f4119Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c1068b.f4096C) {
                        f5 = fMax + c1068b.f4119Z;
                    } else {
                        i2 = rect.right;
                        f5 = i2;
                    }
                } else if (c1068b.f4096C) {
                    i2 = rect.right;
                    f5 = i2;
                } else {
                    f5 = c1068b.f4119Z + fMax;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = c1068b.m2541d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f2453N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2456Q);
                C0033i c0033i = (C0033i) this.f2445F;
                c0033i.getClass();
                c0033i.m70o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = c1068b.f4119Z / 2.0f;
            f4 = f2 - f3;
            float fMax2 = Math.max(f4, rect.left);
            rectF = this.f2464a0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f5 = (width / 2.0f) + (c1068b.f4119Z / 2.0f);
            }
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = c1068b.m2541d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1898l(TextView textView, int i2) {
        try {
            textView.setTextAppearance(i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(C1031R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(AbstractC1081b.m2562a(getContext(), C1031R.color.design_error));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1899m() {
        C0049y c0049y = this.f2481j;
        return (c0049y.f165o != 1 || c0049y.f168r == null || TextUtils.isEmpty(c0049y.f166p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1900n(Editable editable) {
        ((C0017C) this.f2489n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2487m;
        int i2 = this.f2485l;
        String string = null;
        if (i2 == -1) {
            this.f2491o.setText(String.valueOf(length));
            this.f2491o.setContentDescription(null);
            this.f2487m = false;
        } else {
            this.f2487m = length > i2;
            Context context = getContext();
            this.f2491o.setContentDescription(context.getString(this.f2487m ? C1031R.string.character_counter_overflowed_content_description : C1031R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2485l)));
            if (z2 != this.f2487m) {
                m1901o();
            }
            String str = C0052b.f185d;
            C0052b c0052b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0052b.f188g : C0052b.f187f;
            C0868K c0868k = this.f2491o;
            String string2 = getContext().getString(C1031R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2485l));
            if (string2 == null) {
                c0052b.getClass();
            } else {
                C0057g c0057g = c0052b.f191c;
                string = c0052b.m169c(string2).toString();
            }
            c0868k.setText(string);
        }
        if (this.f2469d == null || z2 == this.f2487m) {
            return;
        }
        m1907u(false, false);
        m1910x();
        m1904r();
    }

    /* JADX INFO: renamed from: o */
    public final void m1901o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0868K c0868k = this.f2491o;
        if (c0868k != null) {
            m1898l(c0868k, this.f2487m ? this.f2493p : this.f2495q);
            if (!this.f2487m && (colorStateList2 = this.f2511y) != null) {
                this.f2491o.setTextColor(colorStateList2);
            }
            if (!this.f2487m || (colorStateList = this.f2513z) == null) {
                return;
            }
            this.f2491o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2506v0.m2543g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0045u c0045u = this.f2467c;
        c0045u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2441B0 = false;
        if (this.f2469d != null && this.f2469d.getMeasuredHeight() < (iMax = Math.max(c0045u.getMeasuredHeight(), this.f2465b.getMeasuredHeight()))) {
            this.f2469d.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zM1903q = m1903q();
        if (z2 || zM1903q) {
            this.f2469d.post(new RunnableC0028d(2, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f2469d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1069c.f4152a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2461V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC1069c.f4152a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC1069c.m2550a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC1069c.f4153b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C1123g c1123g = this.f2449J;
            if (c1123g != null) {
                int i6 = rect.bottom;
                c1123g.setBounds(rect.left, i6 - this.f2457R, rect.right, i6);
            }
            C1123g c1123g2 = this.f2450K;
            if (c1123g2 != null) {
                int i7 = rect.bottom;
                c1123g2.setBounds(rect.left, i7 - this.f2458S, rect.right, i7);
            }
            if (this.f2442C) {
                float textSize = this.f2469d.getTextSize();
                C1068b c1068b = this.f2506v0;
                if (c1068b.f4133h != textSize) {
                    c1068b.f4133h = textSize;
                    c1068b.m2544h(false);
                }
                int gravity = this.f2469d.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c1068b.f4132g != i8) {
                    c1068b.f4132g = i8;
                    c1068b.m2544h(false);
                }
                if (c1068b.f4130f != gravity) {
                    c1068b.f4130f = gravity;
                    c1068b.m2544h(false);
                }
                if (this.f2469d == null) {
                    throw new IllegalStateException();
                }
                boolean zM2557e = AbstractC1077k.m2557e(this);
                int i9 = rect.bottom;
                Rect rect2 = this.f2462W;
                rect2.bottom = i9;
                int i10 = this.f2454O;
                if (i10 == 1) {
                    rect2.left = m1894g(rect.left, zM2557e);
                    rect2.top = rect.top + this.f2455P;
                    rect2.right = m1895h(rect.right, zM2557e);
                } else if (i10 != 2) {
                    rect2.left = m1894g(rect.left, zM2557e);
                    rect2.top = getPaddingTop();
                    rect2.right = m1895h(rect.right, zM2557e);
                } else {
                    rect2.left = this.f2469d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m1890c();
                    rect2.right = rect.right - this.f2469d.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = c1068b.f4126d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    c1068b.f4106M = true;
                }
                if (this.f2469d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c1068b.f4108O;
                textPaint.setTextSize(c1068b.f4133h);
                textPaint.setTypeface(c1068b.f4146u);
                textPaint.setLetterSpacing(c1068b.f4116W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f2469d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2454O != 1 || this.f2469d.getMinLines() > 1) ? rect.top + this.f2469d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f2469d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2454O != 1 || this.f2469d.getMinLines() > 1) ? rect.bottom - this.f2469d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = c1068b.f4124c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    c1068b.f4106M = true;
                }
                c1068b.m2544h(false);
                if (!m1892e() || this.f2504u0) {
                    return;
                }
                m1897j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f2441B0;
        C0045u c0045u = this.f2467c;
        if (!z2) {
            c0045u.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2441B0 = true;
        }
        if (this.f2501t != null && (editText = this.f2469d) != null) {
            this.f2501t.setGravity(editText.getGravity());
            this.f2501t.setPadding(this.f2469d.getCompoundPaddingLeft(), this.f2469d.getCompoundPaddingTop(), this.f2469d.getCompoundPaddingRight(), this.f2469d.getCompoundPaddingBottom());
        }
        c0045u.m152m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0024J)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0024J c0024j = (C0024J) parcelable;
        super.onRestoreInstanceState(c0024j.f481a);
        setError(c0024j.f62c);
        if (c0024j.f63d) {
            post(new RunnableC0019E(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.f2452M) {
            InterfaceC1119c interfaceC1119c = this.f2451L.f4351e;
            RectF rectF = this.f2464a0;
            float fMo2634a = interfaceC1119c.mo2634a(rectF);
            float fMo2634a2 = this.f2451L.f4352f.mo2634a(rectF);
            float fMo2634a3 = this.f2451L.f4354h.mo2634a(rectF);
            float fMo2634a4 = this.f2451L.f4353g.mo2634a(rectF);
            C1127k c1127k = this.f2451L;
            AbstractC0805P abstractC0805P = c1127k.f4347a;
            AbstractC0805P abstractC0805P2 = c1127k.f4348b;
            AbstractC0805P abstractC0805P3 = c1127k.f4350d;
            AbstractC0805P abstractC0805P4 = c1127k.f4349c;
            C1121e c1121e = new C1121e(0);
            C1121e c1121e2 = new C1121e(0);
            C1121e c1121e3 = new C1121e(0);
            C1121e c1121e4 = new C1121e(0);
            C1126j.m2655b(abstractC0805P2);
            C1126j.m2655b(abstractC0805P);
            C1126j.m2655b(abstractC0805P4);
            C1126j.m2655b(abstractC0805P3);
            C1117a c1117a = new C1117a(fMo2634a2);
            C1117a c1117a2 = new C1117a(fMo2634a);
            C1117a c1117a3 = new C1117a(fMo2634a4);
            C1117a c1117a4 = new C1117a(fMo2634a3);
            C1127k c1127k2 = new C1127k();
            c1127k2.f4347a = abstractC0805P2;
            c1127k2.f4348b = abstractC0805P;
            c1127k2.f4349c = abstractC0805P3;
            c1127k2.f4350d = abstractC0805P4;
            c1127k2.f4351e = c1117a;
            c1127k2.f4352f = c1117a2;
            c1127k2.f4353g = c1117a4;
            c1127k2.f4354h = c1117a3;
            c1127k2.f4355i = c1121e;
            c1127k2.f4356j = c1121e2;
            c1127k2.f4357k = c1121e3;
            c1127k2.f4358l = c1121e4;
            this.f2452M = z2;
            setShapeAppearanceModel(c1127k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0024J c0024j = new C0024J(super.onSaveInstanceState());
        if (m1899m()) {
            c0024j.f62c = getError();
        }
        C0045u c0045u = this.f2467c;
        c0024j.f63d = c0045u.f124i != 0 && c0045u.f122g.f2393d;
        return c0024j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1902p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f2438A;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM2037Q = AbstractC0805P.m2037Q(context, C1031R.attr.colorControlActivated);
            if (typedValueM2037Q != null) {
                int i2 = typedValueM2037Q.resourceId;
                if (i2 != 0) {
                    colorStateListValueOf = AbstractC0805P.m2049p(context, i2);
                } else {
                    int i3 = typedValueM2037Q.data;
                    colorStateListValueOf = i3 != 0 ? ColorStateList.valueOf(i3) : null;
                }
            }
        }
        EditText editText = this.f2469d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f2469d.getTextCursorDrawable().mutate();
        if ((m1899m() || (this.f2491o != null && this.f2487m)) && (colorStateList = this.f2440B) != null) {
            colorStateListValueOf = colorStateList;
        }
        AbstractC1111a.m2626h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1903q() {
        boolean z2;
        if (this.f2469d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0015A c0015a = this.f2465b;
            if (c0015a.getMeasuredWidth() > 0) {
                int measuredWidth = c0015a.getMeasuredWidth() - this.f2469d.getPaddingLeft();
                if (this.f2468c0 == null || this.f2470d0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f2468c0 = colorDrawable;
                    this.f2470d0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f2469d.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f2468c0;
                if (drawable != colorDrawable2) {
                    this.f2469d.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.f2468c0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f2469d.getCompoundDrawablesRelative();
                    this.f2469d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f2468c0 = null;
                    z2 = true;
                }
                z2 = false;
            }
        }
        C0045u c0045u = this.f2467c;
        if ((c0045u.m144e() || ((c0045u.f124i != 0 && c0045u.m143d()) || c0045u.f131p != null)) && c0045u.getMeasuredWidth() > 0) {
            int measuredWidth2 = c0045u.f132q.getMeasuredWidth() - this.f2469d.getPaddingRight();
            if (c0045u.m144e()) {
                checkableImageButton = c0045u.f118c;
            } else if (c0045u.f124i != 0 && c0045u.m143d()) {
                checkableImageButton = c0045u.f122g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f2469d.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f2474f0;
            if (colorDrawable3 == null || this.f2476g0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f2474f0 = colorDrawable4;
                    this.f2476g0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative3[2];
                ColorDrawable colorDrawable5 = this.f2474f0;
                if (drawable2 != colorDrawable5) {
                    this.f2478h0 = drawable2;
                    this.f2469d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                } else {
                    z3 = z2;
                }
            } else {
                this.f2476g0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f2469d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2474f0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f2474f0 == null) {
                return z2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f2469d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f2474f0) {
                this.f2469d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f2478h0, compoundDrawablesRelative4[3]);
            } else {
                z3 = z2;
            }
            this.f2474f0 = null;
        }
        return z3;
    }

    /* JADX INFO: renamed from: r */
    public final void m1904r() {
        Drawable background;
        C0868K c0868k;
        PorterDuffColorFilter porterDuffColorFilterM2264g;
        PorterDuffColorFilter porterDuffColorFilterM2264g2;
        EditText editText = this.f2469d;
        if (editText == null || this.f2454O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0886W.f3156a;
        Drawable drawableMutate = background.mutate();
        if (m1899m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0926s.f3289b;
            synchronized (C0926s.class) {
                porterDuffColorFilterM2264g2 = C0933v0.m2264g(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterM2264g2);
            return;
        }
        if (!this.f2487m || (c0868k = this.f2491o) == null) {
            drawableMutate.clearColorFilter();
            this.f2469d.refreshDrawableState();
            return;
        }
        int currentTextColor = c0868k.getCurrentTextColor();
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode mode4 = C0926s.f3289b;
        synchronized (C0926s.class) {
            porterDuffColorFilterM2264g = C0933v0.m2264g(currentTextColor, mode3);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM2264g);
    }

    /* JADX INFO: renamed from: s */
    public final void m1905s() {
        EditText editText = this.f2469d;
        if (editText == null || this.f2445F == null) {
            return;
        }
        if ((this.f2448I || editText.getBackground() == null) && this.f2454O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2469d;
            Field field = AbstractC0080Q.f219a;
            editText2.setBackground(editTextBoxBackground);
            this.f2448I = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f2460U != i2) {
            this.f2460U = i2;
            this.f2492o0 = i2;
            this.f2496q0 = i2;
            this.f2498r0 = i2;
            m1889b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(AbstractC1081b.m2562a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2492o0 = defaultColor;
        this.f2460U = defaultColor;
        this.f2494p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2496q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2498r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1889b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f2454O) {
            return;
        }
        this.f2454O = i2;
        if (this.f2469d != null) {
            m1896i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f2455P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        C1126j c1126jM2660d = this.f2451L.m2660d();
        InterfaceC1119c interfaceC1119c = this.f2451L.f4351e;
        AbstractC0805P abstractC0805PM2046i = AbstractC0805P.m2046i(i2);
        c1126jM2660d.f4335a = abstractC0805PM2046i;
        C1126j.m2655b(abstractC0805PM2046i);
        c1126jM2660d.f4339e = interfaceC1119c;
        InterfaceC1119c interfaceC1119c2 = this.f2451L.f4352f;
        AbstractC0805P abstractC0805PM2046i2 = AbstractC0805P.m2046i(i2);
        c1126jM2660d.f4336b = abstractC0805PM2046i2;
        C1126j.m2655b(abstractC0805PM2046i2);
        c1126jM2660d.f4340f = interfaceC1119c2;
        InterfaceC1119c interfaceC1119c3 = this.f2451L.f4354h;
        AbstractC0805P abstractC0805PM2046i3 = AbstractC0805P.m2046i(i2);
        c1126jM2660d.f4338d = abstractC0805PM2046i3;
        C1126j.m2655b(abstractC0805PM2046i3);
        c1126jM2660d.f4342h = interfaceC1119c3;
        InterfaceC1119c interfaceC1119c4 = this.f2451L.f4353g;
        AbstractC0805P abstractC0805PM2046i4 = AbstractC0805P.m2046i(i2);
        c1126jM2660d.f4337c = abstractC0805PM2046i4;
        C1126j.m2655b(abstractC0805PM2046i4);
        c1126jM2660d.f4341g = interfaceC1119c4;
        this.f2451L = c1126jM2660d.m2656a();
        m1889b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2488m0 != i2) {
            this.f2488m0 = i2;
            m1910x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2484k0 = colorStateList.getDefaultColor();
            this.f2500s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2486l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2488m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2488m0 != colorStateList.getDefaultColor()) {
            this.f2488m0 = colorStateList.getDefaultColor();
        }
        m1910x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2490n0 != colorStateList) {
            this.f2490n0 = colorStateList;
            m1910x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f2457R = i2;
        m1910x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f2458S = i2;
        m1910x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2483k != z2) {
            C0049y c0049y = this.f2481j;
            if (z2) {
                C0868K c0868k = new C0868K(getContext(), null);
                this.f2491o = c0868k;
                c0868k.setId(C1031R.id.textinput_counter);
                Typeface typeface = this.f2466b0;
                if (typeface != null) {
                    this.f2491o.setTypeface(typeface);
                }
                this.f2491o.setMaxLines(1);
                c0049y.m157a(this.f2491o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2491o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C1031R.dimen.mtrl_textinput_counter_margin_start));
                m1901o();
                if (this.f2491o != null) {
                    EditText editText = this.f2469d;
                    m1900n(editText != null ? editText.getText() : null);
                }
            } else {
                c0049y.m163g(this.f2491o, 2);
                this.f2491o = null;
            }
            this.f2483k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f2485l != i2) {
            if (i2 > 0) {
                this.f2485l = i2;
            } else {
                this.f2485l = -1;
            }
            if (!this.f2483k || this.f2491o == null) {
                return;
            }
            EditText editText = this.f2469d;
            m1900n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2493p != i2) {
            this.f2493p = i2;
            m1901o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2513z != colorStateList) {
            this.f2513z = colorStateList;
            m1901o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2495q != i2) {
            this.f2495q = i2;
            m1901o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2511y != colorStateList) {
            this.f2511y = colorStateList;
            m1901o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2438A != colorStateList) {
            this.f2438A = colorStateList;
            m1902p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2440B != colorStateList) {
            this.f2440B = colorStateList;
            if (m1899m() || (this.f2491o != null && this.f2487m)) {
                m1902p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2480i0 = colorStateList;
        this.f2482j0 = colorStateList;
        if (this.f2469d != null) {
            m1907u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m1887k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2467c.f122g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2467c.f122g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        C0045u c0045u = this.f2467c;
        CharSequence text = i2 != 0 ? c0045u.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = c0045u.f122g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        C0045u c0045u = this.f2467c;
        Drawable drawableM916w = i2 != 0 ? AbstractC0358S.m916w(c0045u.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = c0045u.f122g;
        checkableImageButton.setImageDrawable(drawableM916w);
        if (drawableM916w != null) {
            ColorStateList colorStateList = c0045u.f126k;
            PorterDuff.Mode mode = c0045u.f127l;
            TextInputLayout textInputLayout = c0045u.f116a;
            AbstractC0040p.m98c(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0040p.m86O(textInputLayout, checkableImageButton, c0045u.f126k);
        }
    }

    public void setEndIconMinSize(int i2) {
        C0045u c0045u = this.f2467c;
        if (i2 < 0) {
            c0045u.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != c0045u.f128m) {
            c0045u.f128m = i2;
            CheckableImageButton checkableImageButton = c0045u.f122g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = c0045u.f118c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f2467c.m146g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0045u c0045u = this.f2467c;
        View.OnLongClickListener onLongClickListener = c0045u.f130o;
        CheckableImageButton checkableImageButton = c0045u.f122g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0045u c0045u = this.f2467c;
        c0045u.f130o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0045u.f122g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0045u c0045u = this.f2467c;
        c0045u.f129n = scaleType;
        c0045u.f122g.setScaleType(scaleType);
        c0045u.f118c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0045u c0045u = this.f2467c;
        if (c0045u.f126k != colorStateList) {
            c0045u.f126k = colorStateList;
            AbstractC0040p.m98c(c0045u.f116a, c0045u.f122g, colorStateList, c0045u.f127l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0045u c0045u = this.f2467c;
        if (c0045u.f127l != mode) {
            c0045u.f127l = mode;
            AbstractC0040p.m98c(c0045u.f116a, c0045u.f122g, c0045u.f126k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2467c.m147h(z2);
    }

    public void setError(CharSequence charSequence) {
        C0049y c0049y = this.f2481j;
        if (!c0049y.f167q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0049y.m162f();
            return;
        }
        c0049y.m159c();
        c0049y.f166p = charSequence;
        c0049y.f168r.setText(charSequence);
        int i2 = c0049y.f164n;
        if (i2 != 1) {
            c0049y.f165o = 1;
        }
        c0049y.m165i(i2, c0049y.f165o, c0049y.m164h(c0049y.f168r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        C0049y c0049y = this.f2481j;
        c0049y.f170t = i2;
        C0868K c0868k = c0049y.f168r;
        if (c0868k != null) {
            Field field = AbstractC0080Q.f219a;
            c0868k.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0049y c0049y = this.f2481j;
        c0049y.f169s = charSequence;
        C0868K c0868k = c0049y.f168r;
        if (c0868k != null) {
            c0868k.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        C0049y c0049y = this.f2481j;
        if (c0049y.f167q == z2) {
            return;
        }
        c0049y.m159c();
        TextInputLayout textInputLayout = c0049y.f158h;
        if (z2) {
            C0868K c0868k = new C0868K(c0049y.f157g, null);
            c0049y.f168r = c0868k;
            c0868k.setId(C1031R.id.textinput_error);
            c0049y.f168r.setTextAlignment(5);
            Typeface typeface = c0049y.f150B;
            if (typeface != null) {
                c0049y.f168r.setTypeface(typeface);
            }
            int i2 = c0049y.f171u;
            c0049y.f171u = i2;
            C0868K c0868k2 = c0049y.f168r;
            if (c0868k2 != null) {
                textInputLayout.m1898l(c0868k2, i2);
            }
            ColorStateList colorStateList = c0049y.f172v;
            c0049y.f172v = colorStateList;
            C0868K c0868k3 = c0049y.f168r;
            if (c0868k3 != null && colorStateList != null) {
                c0868k3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0049y.f169s;
            c0049y.f169s = charSequence;
            C0868K c0868k4 = c0049y.f168r;
            if (c0868k4 != null) {
                c0868k4.setContentDescription(charSequence);
            }
            int i3 = c0049y.f170t;
            c0049y.f170t = i3;
            C0868K c0868k5 = c0049y.f168r;
            if (c0868k5 != null) {
                Field field = AbstractC0080Q.f219a;
                c0868k5.setAccessibilityLiveRegion(i3);
            }
            c0049y.f168r.setVisibility(4);
            c0049y.m157a(c0049y.f168r, 0);
        } else {
            c0049y.m162f();
            c0049y.m163g(c0049y.f168r, 0);
            c0049y.f168r = null;
            textInputLayout.m1904r();
            textInputLayout.m1910x();
        }
        c0049y.f167q = z2;
    }

    public void setErrorIconDrawable(int i2) {
        C0045u c0045u = this.f2467c;
        c0045u.m148i(i2 != 0 ? AbstractC0358S.m916w(c0045u.getContext(), i2) : null);
        AbstractC0040p.m86O(c0045u.f116a, c0045u.f118c, c0045u.f119d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0045u c0045u = this.f2467c;
        CheckableImageButton checkableImageButton = c0045u.f118c;
        View.OnLongClickListener onLongClickListener = c0045u.f121f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0045u c0045u = this.f2467c;
        c0045u.f121f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0045u.f118c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0045u c0045u = this.f2467c;
        if (c0045u.f119d != colorStateList) {
            c0045u.f119d = colorStateList;
            AbstractC0040p.m98c(c0045u.f116a, c0045u.f118c, colorStateList, c0045u.f120e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0045u c0045u = this.f2467c;
        if (c0045u.f120e != mode) {
            c0045u.f120e = mode;
            AbstractC0040p.m98c(c0045u.f116a, c0045u.f118c, c0045u.f119d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        C0049y c0049y = this.f2481j;
        c0049y.f171u = i2;
        C0868K c0868k = c0049y.f168r;
        if (c0868k != null) {
            c0049y.f158h.m1898l(c0868k, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0049y c0049y = this.f2481j;
        c0049y.f172v = colorStateList;
        C0868K c0868k = c0049y.f168r;
        if (c0868k == null || colorStateList == null) {
            return;
        }
        c0868k.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2508w0 != z2) {
            this.f2508w0 = z2;
            m1907u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0049y c0049y = this.f2481j;
        if (zIsEmpty) {
            if (c0049y.f174x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0049y.f174x) {
            setHelperTextEnabled(true);
        }
        c0049y.m159c();
        c0049y.f173w = charSequence;
        c0049y.f175y.setText(charSequence);
        int i2 = c0049y.f164n;
        if (i2 != 2) {
            c0049y.f165o = 2;
        }
        c0049y.m165i(i2, c0049y.f165o, c0049y.m164h(c0049y.f175y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0049y c0049y = this.f2481j;
        c0049y.f149A = colorStateList;
        C0868K c0868k = c0049y.f175y;
        if (c0868k == null || colorStateList == null) {
            return;
        }
        c0868k.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        C0049y c0049y = this.f2481j;
        if (c0049y.f174x == z2) {
            return;
        }
        c0049y.m159c();
        if (z2) {
            C0868K c0868k = new C0868K(c0049y.f157g, null);
            c0049y.f175y = c0868k;
            c0868k.setId(C1031R.id.textinput_helper_text);
            c0049y.f175y.setTextAlignment(5);
            Typeface typeface = c0049y.f150B;
            if (typeface != null) {
                c0049y.f175y.setTypeface(typeface);
            }
            c0049y.f175y.setVisibility(4);
            c0049y.f175y.setAccessibilityLiveRegion(1);
            int i2 = c0049y.f176z;
            c0049y.f176z = i2;
            C0868K c0868k2 = c0049y.f175y;
            if (c0868k2 != null) {
                c0868k2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = c0049y.f149A;
            c0049y.f149A = colorStateList;
            C0868K c0868k3 = c0049y.f175y;
            if (c0868k3 != null && colorStateList != null) {
                c0868k3.setTextColor(colorStateList);
            }
            c0049y.m157a(c0049y.f175y, 1);
            c0049y.f175y.setAccessibilityDelegate(new C0048x(c0049y));
        } else {
            c0049y.m159c();
            int i3 = c0049y.f164n;
            if (i3 == 2) {
                c0049y.f165o = 0;
            }
            c0049y.m165i(i3, c0049y.f165o, c0049y.m164h(c0049y.f175y, ""));
            c0049y.m163g(c0049y.f175y, 1);
            c0049y.f175y = null;
            TextInputLayout textInputLayout = c0049y.f158h;
            textInputLayout.m1904r();
            textInputLayout.m1910x();
        }
        c0049y.f174x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        C0049y c0049y = this.f2481j;
        c0049y.f176z = i2;
        C0868K c0868k = c0049y.f175y;
        if (c0868k != null) {
            c0868k.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2442C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2510x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2442C) {
            this.f2442C = z2;
            if (z2) {
                CharSequence hint = this.f2469d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2443D)) {
                        setHint(hint);
                    }
                    this.f2469d.setHint((CharSequence) null);
                }
                this.f2444E = true;
            } else {
                this.f2444E = false;
                if (!TextUtils.isEmpty(this.f2443D) && TextUtils.isEmpty(this.f2469d.getHint())) {
                    this.f2469d.setHint(this.f2443D);
                }
                setHintInternal(null);
            }
            if (this.f2469d != null) {
                m1906t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C1068b c1068b = this.f2506v0;
        View view = c1068b.f4120a;
        C1099d c1099d = new C1099d(view.getContext(), i2);
        ColorStateList colorStateList = c1099d.f4242j;
        if (colorStateList != null) {
            c1068b.f4136k = colorStateList;
        }
        float f2 = c1099d.f4243k;
        if (f2 != 0.0f) {
            c1068b.f4134i = f2;
        }
        ColorStateList colorStateList2 = c1099d.f4233a;
        if (colorStateList2 != null) {
            c1068b.f4114U = colorStateList2;
        }
        c1068b.f4112S = c1099d.f4237e;
        c1068b.f4113T = c1099d.f4238f;
        c1068b.f4111R = c1099d.f4239g;
        c1068b.f4115V = c1099d.f4241i;
        C1096a c1096a = c1068b.f4150y;
        if (c1096a != null) {
            c1096a.f4226d = true;
        }
        C0095d c0095d = new C0095d(23, c1068b);
        c1099d.m2585a();
        c1068b.f4150y = new C1096a(c0095d, c1099d.f4246n);
        c1099d.m2587c(view.getContext(), c1068b.f4150y);
        c1068b.m2544h(false);
        this.f2482j0 = c1068b.f4136k;
        if (this.f2469d != null) {
            m1907u(false, false);
            m1906t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2482j0 != colorStateList) {
            if (this.f2480i0 == null) {
                C1068b c1068b = this.f2506v0;
                if (c1068b.f4136k != colorStateList) {
                    c1068b.f4136k = colorStateList;
                    c1068b.m2544h(false);
                }
            }
            this.f2482j0 = colorStateList;
            if (this.f2469d != null) {
                m1907u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0022H interfaceC0022H) {
        this.f2489n = interfaceC0022H;
    }

    public void setMaxEms(int i2) {
        this.f2475g = i2;
        EditText editText = this.f2469d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2479i = i2;
        EditText editText = this.f2469d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f2473f = i2;
        EditText editText = this.f2469d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f2477h = i2;
        EditText editText = this.f2469d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        C0045u c0045u = this.f2467c;
        c0045u.f122g.setContentDescription(i2 != 0 ? c0045u.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        C0045u c0045u = this.f2467c;
        c0045u.f122g.setImageDrawable(i2 != 0 ? AbstractC0358S.m916w(c0045u.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        C0045u c0045u = this.f2467c;
        if (z2 && c0045u.f124i != 1) {
            c0045u.m146g(1);
        } else if (z2) {
            c0045u.getClass();
        } else {
            c0045u.m146g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0045u c0045u = this.f2467c;
        c0045u.f126k = colorStateList;
        AbstractC0040p.m98c(c0045u.f116a, c0045u.f122g, colorStateList, c0045u.f127l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0045u c0045u = this.f2467c;
        c0045u.f127l = mode;
        AbstractC0040p.m98c(c0045u.f116a, c0045u.f122g, c0045u.f126k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2501t == null) {
            C0868K c0868k = new C0868K(getContext(), null);
            this.f2501t = c0868k;
            c0868k.setId(C1031R.id.textinput_placeholder);
            this.f2501t.setImportantForAccessibility(2);
            C0449h c0449hM1891d = m1891d();
            this.f2507w = c0449hM1891d;
            c0449hM1891d.f1010b = 67L;
            this.f2509x = m1891d();
            setPlaceholderTextAppearance(this.f2505v);
            setPlaceholderTextColor(this.f2503u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2499s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2497r = charSequence;
        }
        EditText editText = this.f2469d;
        m1908v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2505v = i2;
        C0868K c0868k = this.f2501t;
        if (c0868k != null) {
            c0868k.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2503u != colorStateList) {
            this.f2503u = colorStateList;
            C0868K c0868k = this.f2501t;
            if (c0868k == null || colorStateList == null) {
                return;
            }
            c0868k.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0015A c0015a = this.f2465b;
        c0015a.getClass();
        c0015a.f44c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0015a.f43b.setText(charSequence);
        c0015a.m23e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f2465b.f43b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2465b.f43b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C1127k c1127k) {
        C1123g c1123g = this.f2445F;
        if (c1123g == null || c1123g.f4312a.f4290a == c1127k) {
            return;
        }
        this.f2451L = c1127k;
        m1889b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2465b.f45d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2465b.f45d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? AbstractC0358S.m916w(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        C0015A c0015a = this.f2465b;
        if (i2 < 0) {
            c0015a.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != c0015a.f48g) {
            c0015a.f48g = i2;
            CheckableImageButton checkableImageButton = c0015a.f45d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0015A c0015a = this.f2465b;
        View.OnLongClickListener onLongClickListener = c0015a.f50i;
        CheckableImageButton checkableImageButton = c0015a.f45d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0015A c0015a = this.f2465b;
        c0015a.f50i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0015a.f45d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0015A c0015a = this.f2465b;
        c0015a.f49h = scaleType;
        c0015a.f45d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0015A c0015a = this.f2465b;
        if (c0015a.f46e != colorStateList) {
            c0015a.f46e = colorStateList;
            AbstractC0040p.m98c(c0015a.f42a, c0015a.f45d, colorStateList, c0015a.f47f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0015A c0015a = this.f2465b;
        if (c0015a.f47f != mode) {
            c0015a.f47f = mode;
            AbstractC0040p.m98c(c0015a.f42a, c0015a.f45d, c0015a.f46e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2465b.m21c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0045u c0045u = this.f2467c;
        c0045u.getClass();
        c0045u.f131p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0045u.f132q.setText(charSequence);
        c0045u.m153n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f2467c.f132q.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2467c.f132q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0021G c0021g) {
        EditText editText = this.f2469d;
        if (editText != null) {
            AbstractC0080Q.m291j(editText, c0021g);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2466b0) {
            this.f2466b0 = typeface;
            this.f2506v0.m2549m(typeface);
            C0049y c0049y = this.f2481j;
            if (typeface != c0049y.f150B) {
                c0049y.f150B = typeface;
                C0868K c0868k = c0049y.f168r;
                if (c0868k != null) {
                    c0868k.setTypeface(typeface);
                }
                C0868K c0868k2 = c0049y.f175y;
                if (c0868k2 != null) {
                    c0868k2.setTypeface(typeface);
                }
            }
            C0868K c0868k3 = this.f2491o;
            if (c0868k3 != null) {
                c0868k3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1906t() {
        if (this.f2454O != 1) {
            FrameLayout frameLayout = this.f2463a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM1890c = m1890c();
            if (iM1890c != layoutParams.topMargin) {
                layoutParams.topMargin = iM1890c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1907u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0868K c0868k;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2469d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2469d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2480i0;
        C1068b c1068b = this.f2506v0;
        if (colorStateList2 != null) {
            c1068b.m2545i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f2480i0;
            c1068b.m2545i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2500s0) : this.f2500s0));
        } else if (m1899m()) {
            C0868K c0868k2 = this.f2481j.f168r;
            c1068b.m2545i(c0868k2 != null ? c0868k2.getTextColors() : null);
        } else if (this.f2487m && (c0868k = this.f2491o) != null) {
            c1068b.m2545i(c0868k.getTextColors());
        } else if (z5 && (colorStateList = this.f2482j0) != null && c1068b.f4136k != colorStateList) {
            c1068b.f4136k = colorStateList;
            c1068b.m2544h(false);
        }
        C0045u c0045u = this.f2467c;
        C0015A c0015a = this.f2465b;
        if (z4 || !this.f2508w0 || (isEnabled() && z5)) {
            if (z3 || this.f2504u0) {
                ValueAnimator valueAnimator = this.f2512y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2512y0.cancel();
                }
                if (z2 && this.f2510x0) {
                    m1888a(1.0f);
                } else {
                    c1068b.m2547k(1.0f);
                }
                this.f2504u0 = false;
                if (m1892e()) {
                    m1897j();
                }
                EditText editText3 = this.f2469d;
                m1908v(editText3 != null ? editText3.getText() : null);
                c0015a.f51j = false;
                c0015a.m23e();
                c0045u.f133r = false;
                c0045u.m153n();
                return;
            }
            return;
        }
        if (z3 || !this.f2504u0) {
            ValueAnimator valueAnimator2 = this.f2512y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2512y0.cancel();
            }
            if (z2 && this.f2510x0) {
                m1888a(0.0f);
            } else {
                c1068b.m2547k(0.0f);
            }
            if (m1892e() && (!((C0033i) this.f2445F).f86x.f84v.isEmpty()) && m1892e()) {
                ((C0033i) this.f2445F).m70o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2504u0 = true;
            C0868K c0868k3 = this.f2501t;
            if (c0868k3 != null && this.f2499s) {
                c0868k3.setText((CharSequence) null);
                AbstractC0458q.m1089a(this.f2463a, this.f2509x);
                this.f2501t.setVisibility(4);
            }
            c0015a.f51j = true;
            c0015a.m23e();
            c0045u.f133r = true;
            c0045u.m153n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1908v(Editable editable) {
        ((C0017C) this.f2489n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2463a;
        if (length != 0 || this.f2504u0) {
            C0868K c0868k = this.f2501t;
            if (c0868k == null || !this.f2499s) {
                return;
            }
            c0868k.setText((CharSequence) null);
            AbstractC0458q.m1089a(frameLayout, this.f2509x);
            this.f2501t.setVisibility(4);
            return;
        }
        if (this.f2501t == null || !this.f2499s || TextUtils.isEmpty(this.f2497r)) {
            return;
        }
        this.f2501t.setText(this.f2497r);
        AbstractC0458q.m1089a(frameLayout, this.f2507w);
        this.f2501t.setVisibility(0);
        this.f2501t.bringToFront();
        announceForAccessibility(this.f2497r);
    }

    /* JADX INFO: renamed from: w */
    public final void m1909w(boolean z2, boolean z3) {
        int defaultColor = this.f2490n0.getDefaultColor();
        int colorForState = this.f2490n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2490n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2459T = colorForState2;
        } else if (z3) {
            this.f2459T = colorForState;
        } else {
            this.f2459T = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1910x() {
        C0868K c0868k;
        EditText editText;
        EditText editText2;
        if (this.f2445F == null || this.f2454O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2469d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2469d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2459T = this.f2500s0;
        } else if (m1899m()) {
            if (this.f2490n0 != null) {
                m1909w(z3, z2);
            } else {
                this.f2459T = getErrorCurrentTextColors();
            }
        } else if (!this.f2487m || (c0868k = this.f2491o) == null) {
            if (z3) {
                this.f2459T = this.f2488m0;
            } else if (z2) {
                this.f2459T = this.f2486l0;
            } else {
                this.f2459T = this.f2484k0;
            }
        } else if (this.f2490n0 != null) {
            m1909w(z3, z2);
        } else {
            this.f2459T = c0868k.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1902p();
        }
        C0045u c0045u = this.f2467c;
        c0045u.m151l();
        CheckableImageButton checkableImageButton = c0045u.f118c;
        ColorStateList colorStateList = c0045u.f119d;
        TextInputLayout textInputLayout = c0045u.f116a;
        AbstractC0040p.m86O(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0045u.f126k;
        CheckableImageButton checkableImageButton2 = c0045u.f122g;
        AbstractC0040p.m86O(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0045u.m141b() instanceof C0039o) {
            if (!textInputLayout.m1899m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0040p.m98c(textInputLayout, checkableImageButton2, c0045u.f126k, c0045u.f127l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                AbstractC1111a.m2625g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0015A c0015a = this.f2465b;
        AbstractC0040p.m86O(c0015a.f42a, c0015a.f45d, c0015a.f46e);
        if (this.f2454O == 2) {
            int i2 = this.f2456Q;
            if (z3 && isEnabled()) {
                this.f2456Q = this.f2458S;
            } else {
                this.f2456Q = this.f2457R;
            }
            if (this.f2456Q != i2 && m1892e() && !this.f2504u0) {
                if (m1892e()) {
                    ((C0033i) this.f2445F).m70o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m1897j();
            }
        }
        if (this.f2454O == 1) {
            if (!isEnabled()) {
                this.f2460U = this.f2494p0;
            } else if (z2 && !z3) {
                this.f2460U = this.f2498r0;
            } else if (z3) {
                this.f2460U = this.f2496q0;
            } else {
                this.f2460U = this.f2492o0;
            }
        }
        m1889b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2465b.m20b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2467c.f122g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2467c.f122g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2467c.m148i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2467c.f122g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0045u c0045u = this.f2467c;
        CheckableImageButton checkableImageButton = c0045u.f122g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0045u.f126k;
            PorterDuff.Mode mode = c0045u.f127l;
            TextInputLayout textInputLayout = c0045u.f116a;
            AbstractC0040p.m98c(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0040p.m86O(textInputLayout, checkableImageButton, c0045u.f126k);
        }
    }
}
