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
    public static final int[][] f4590D0 = {new int[]{R.attr.state_pressed}, new int[0]};

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

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout), attributeSet, io.github.cherrywechat.R.attr.textInputStyle);
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
        C2359pa c2359pa = new C2359pa(this);
        this.f4662w0 = c2359pa;
        this.f4596C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f4617a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0776S2.f2453a;
        c2359pa.f8266R = linearInterpolator;
        c2359pa.m4789j(false);
        c2359pa.f8265Q = linearInterpolator;
        c2359pa.m4789j(false);
        if (c2359pa.f8287g != 8388659) {
            c2359pa.f8287g = 8388659;
            c2359pa.m4789j(false);
        }
        AbstractC1293cr.m2547f(context2, attributeSet, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC0939Vu.f2930D;
        AbstractC1293cr.m2549h(context2, attributeSet, iArr, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout);
        C2656w4 c2656w4 = new C2656w4(context2, typedArrayObtainStyledAttributes);
        C1072Yy c1072Yy = new C1072Yy(this, c2656w4);
        this.f4619b = c1072Yy;
        this.f4597D = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f4666y0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f4664x0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f4606M = C0728Qx.m1512b(context2, attributeSet, io.github.cherrywechat.R.attr.textInputStyle, io.github.cherrywechat.R.style.Widget_Design_TextInputLayout).m1383a();
        this.f4608O = context2.getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f4610Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f4623d = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f4612S = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f4613T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f4611R = this.f4612S;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C0685Px c0685PxM1516f = this.f4606M.m1516f();
        if (dimension >= 0.0f) {
            c0685PxM1516f.f2196e = new C2436r(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0685PxM1516f.f2197f = new C2436r(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0685PxM1516f.f2198g = new C2436r(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0685PxM1516f.f2199h = new C2436r(dimension4);
        }
        this.f4606M = c0685PxM1516f.m1383a();
        ColorStateList colorStateListM1642i = AbstractC0828TB.m1642i(context2, c2656w4, 7);
        if (colorStateListM1642i != null) {
            int defaultColor = colorStateListM1642i.getDefaultColor();
            this.f4648p0 = defaultColor;
            this.f4615V = defaultColor;
            if (colorStateListM1642i.isStateful()) {
                this.f4650q0 = colorStateListM1642i.getColorForState(new int[]{-16842910}, -1);
                this.f4652r0 = colorStateListM1642i.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f4654s0 = colorStateListM1642i.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f4652r0 = this.f4648p0;
                ColorStateList colorStateListM622o = AbstractC0295Gu.m622o(context2, io.github.cherrywechat.R.color.mtrl_filled_background_color);
                this.f4650q0 = colorStateListM622o.getColorForState(new int[]{-16842910}, -1);
                this.f4654s0 = colorStateListM622o.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f4615V = 0;
            this.f4648p0 = 0;
            this.f4650q0 = 0;
            this.f4652r0 = 0;
            this.f4654s0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM5209p = c2656w4.m5209p(1);
            this.f4638k0 = colorStateListM5209p;
            this.f4636j0 = colorStateListM5209p;
        }
        ColorStateList colorStateListM1642i2 = AbstractC0828TB.m1642i(context2, c2656w4, 14);
        this.f4644n0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f4640l0 = context2.getColor(io.github.cherrywechat.R.color.mtrl_textinput_default_box_stroke_color);
        this.f4656t0 = context2.getColor(io.github.cherrywechat.R.color.mtrl_textinput_disabled_color);
        this.f4642m0 = context2.getColor(io.github.cherrywechat.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM1642i2 != null) {
            setBoxStrokeColorStateList(colorStateListM1642i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0828TB.m1642i(context2, c2656w4, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f4593B = c2656w4.m5209p(24);
        this.f4595C = c2656w4.m5209p(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f4651r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f4649q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f4649q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f4651r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c2656w4.m5209p(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c2656w4.m5209p(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c2656w4.m5209p(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c2656w4.m5209p(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c2656w4.m5209p(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c2656w4.m5209p(59));
        }
        C1141ag c1141ag = new C1141ag(this, c2656w4);
        this.f4621c = c1141ag;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c2656w4.m5195E();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(c1072Yy);
        frameLayout.addView(c1141ag);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f4625e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f4600G;
        }
        int iM621n = AbstractC0295Gu.m621n(this.f4625e, io.github.cherrywechat.R.attr.colorControlHighlight);
        int i = this.f4609P;
        int[][] iArr = f4590D0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C1021Xq c1021Xq = this.f4600G;
            int i2 = this.f4615V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0295Gu.m629v(iM621n, i2, 0.1f), i2}), c1021Xq, c1021Xq);
        }
        Context context = getContext();
        C1021Xq c1021Xq2 = this.f4600G;
        TypedValue typedValueM2539R = AbstractC1293cr.m2539R(context, io.github.cherrywechat.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM2539R.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueM2539R.data;
        C1021Xq c1021Xq3 = new C1021Xq(c1021Xq2.f3241b.f2902a);
        int iM629v = AbstractC0295Gu.m629v(iM621n, color, 0.1f);
        c1021Xq3.m1928n(new ColorStateList(iArr, new int[]{iM629v, 0}));
        c1021Xq3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM629v, color});
        C1021Xq c1021Xq4 = new C1021Xq(c1021Xq2.f3241b.f2902a);
        c1021Xq4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1021Xq3, c1021Xq4), c1021Xq2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f4602I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f4602I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f4602I.addState(new int[0], m2481h(false));
        }
        return this.f4602I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f4601H == null) {
            this.f4601H = m2481h(true);
        }
        return this.f4601H;
    }

    /* JADX INFO: renamed from: m */
    public static void m2473m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m2473m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f4625e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f4625e = editText;
        int i = this.f4629g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f4633i);
        }
        int i2 = this.f4631h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f4635j);
        }
        this.f4603J = false;
        m2484k();
        setTextInputAccessibilityDelegate(new C2619vA(this));
        Typeface typeface = this.f4625e.getTypeface();
        C2359pa c2359pa = this.f4662w0;
        c2359pa.m4793n(typeface);
        float textSize = this.f4625e.getTextSize();
        if (c2359pa.f8289h != textSize) {
            c2359pa.f8289h = textSize;
            c2359pa.m4789j(false);
        }
        float letterSpacing = this.f4625e.getLetterSpacing();
        if (c2359pa.f8272X != letterSpacing) {
            c2359pa.f8272X = letterSpacing;
            c2359pa.m4789j(false);
        }
        int gravity = this.f4625e.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c2359pa.f8287g != i3) {
            c2359pa.f8287g = i3;
            c2359pa.m4789j(false);
        }
        if (c2359pa.f8285f != gravity) {
            c2359pa.f8285f = gravity;
            c2359pa.m4789j(false);
        }
        this.f4658u0 = editText.getMinimumHeight();
        this.f4625e.addTextChangedListener(new C2576uA(this, editText));
        if (this.f4636j0 == null) {
            this.f4636j0 = this.f4625e.getHintTextColors();
        }
        if (this.f4597D) {
            if (TextUtils.isEmpty(this.f4598E)) {
                CharSequence hint = this.f4625e.getHint();
                this.f4627f = hint;
                setHint(hint);
                this.f4625e.setHint((CharSequence) null);
            }
            this.f4599F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2490r();
        }
        if (this.f4647p != null) {
            m2488p(this.f4625e.getText());
        }
        m2492t();
        this.f4637k.m4542b();
        this.f4619b.bringToFront();
        C1141ag c1141ag = this.f4621c;
        c1141ag.bringToFront();
        Iterator it = this.f4628f0.iterator();
        while (it.hasNext()) {
            ((C1053Yf) it.next()).m1999a(this);
        }
        c1141ag.m2070m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2495w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f4598E)) {
            return;
        }
        this.f4598E = charSequence;
        C2359pa c2359pa = this.f4662w0;
        if (charSequence == null || !TextUtils.equals(c2359pa.f8250B, charSequence)) {
            c2359pa.f8250B = charSequence;
            c2359pa.f8251C = null;
            c2359pa.m4789j(false);
        }
        if (this.f4660v0) {
            return;
        }
        m2485l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f4655t == z) {
            return;
        }
        if (z) {
            C2304o4 c2304o4 = this.f4657u;
            if (c2304o4 != null) {
                this.f4617a.addView(c2304o4);
                this.f4657u.setVisibility(0);
            }
        } else {
            C2304o4 c2304o42 = this.f4657u;
            if (c2304o42 != null) {
                c2304o42.setVisibility(8);
            }
            this.f4657u = null;
        }
        this.f4655t = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m2474a() {
        if (this.f4625e == null || this.f4609P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f4625e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f4662w0.m4786f() + this.f4623d), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f4625e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (AbstractC0828TB.m1650t(getContext())) {
            EditText editText3 = this.f4625e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f4625e.getPaddingEnd(), getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f4617a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2494v();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m2475b(float f) {
        C2359pa c2359pa = this.f4662w0;
        if (c2359pa.f8277b == f) {
            return;
        }
        if (this.f4668z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4668z0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0714Qj.m1474E(getContext(), io.github.cherrywechat.R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b));
            this.f4668z0.setDuration(AbstractC0714Qj.m1473D(getContext(), io.github.cherrywechat.R.attr.motionDurationMedium4, 167));
            this.f4668z0.addUpdateListener(new C0994X5(3, this));
        }
        this.f4668z0.setFloatValues(c2359pa.f8277b, f);
        this.f4668z0.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m2476c() {
        int i;
        int i2;
        C1021Xq c1021Xq = this.f4600G;
        if (c1021Xq == null) {
            return;
        }
        C0728Qx c0728Qx = c1021Xq.f3241b.f2902a;
        C0728Qx c0728Qx2 = this.f4606M;
        if (c0728Qx != c0728Qx2) {
            c1021Xq.setShapeAppearanceModel(c0728Qx2);
        }
        if (this.f4609P == 2 && (i = this.f4611R) > -1 && (i2 = this.f4614U) != 0) {
            C1021Xq c1021Xq2 = this.f4600G;
            c1021Xq2.f3241b.f2912k = i;
            c1021Xq2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0935Vq c0935Vq = c1021Xq2.f3241b;
            if (c0935Vq.f2906e != colorStateListValueOf) {
                c0935Vq.f2906e = colorStateListValueOf;
                c1021Xq2.onStateChange(c1021Xq2.getState());
            }
        }
        int iM5365c = this.f4615V;
        if (this.f4609P == 1) {
            iM5365c = AbstractC2797za.m5365c(this.f4615V, AbstractC0295Gu.m620m(getContext(), io.github.cherrywechat.R.attr.colorSurface, 0));
        }
        this.f4615V = iM5365c;
        this.f4600G.m1928n(ColorStateList.valueOf(iM5365c));
        C1021Xq c1021Xq3 = this.f4604K;
        if (c1021Xq3 != null && this.f4605L != null) {
            if (this.f4611R > -1 && this.f4614U != 0) {
                c1021Xq3.m1928n(this.f4625e.isFocused() ? ColorStateList.valueOf(this.f4640l0) : ColorStateList.valueOf(this.f4614U));
                this.f4605L.m1928n(ColorStateList.valueOf(this.f4614U));
            }
            invalidate();
        }
        m2493u();
    }

    /* JADX INFO: renamed from: d */
    public final Rect m2477d(Rect rect) {
        if (this.f4625e == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f4618a0;
        rect2.bottom = i;
        int i2 = this.f4609P;
        if (i2 == 1) {
            rect2.left = m2482i(rect.left, z);
            rect2.top = rect.top + this.f4610Q;
            rect2.right = m2483j(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = m2482i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = m2483j(rect.right, z);
            return rect2;
        }
        rect2.left = this.f4625e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - m2478e();
        rect2.right = rect.right - this.f4625e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f4625e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f4627f != null) {
            boolean z = this.f4599F;
            this.f4599F = false;
            CharSequence hint = editText.getHint();
            this.f4625e.setHint(this.f4627f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f4625e.setHint(hint);
                this.f4599F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f4617a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f4625e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f4594B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f4594B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1021Xq c1021Xq;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f4597D;
        C2359pa c2359pa = this.f4662w0;
        if (z) {
            TextPaint textPaint = c2359pa.f8263O;
            RectF rectF = c2359pa.f8283e;
            int iSave = canvas2.save();
            if (c2359pa.f8251C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c2359pa.f8255G);
                float f = c2359pa.f8302q;
                float f2 = c2359pa.f8303r;
                float f3 = c2359pa.f8254F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((c2359pa.f8284e0 > 1 || c2359pa.f8286f0 > 1) && !c2359pa.f8252D && c2359pa.m4794o()) {
                    float lineStart = c2359pa.f8302q - c2359pa.f8274Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c2359pa.f8280c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c2359pa.f8256H;
                        float f6 = c2359pa.f8257I;
                        float f7 = c2359pa.f8258J;
                        int i2 = c2359pa.f8259K;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC2797za.m5367e(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c2359pa.f8274Z.draw(canvas2);
                    textPaint.setAlpha((int) (c2359pa.f8278b0 * f4));
                    if (i >= 31) {
                        float f8 = c2359pa.f8256H;
                        float f9 = c2359pa.f8257I;
                        float f10 = c2359pa.f8258J;
                        int i3 = c2359pa.f8259K;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC2797za.m5367e(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c2359pa.f8274Z.getLineBaseline(0);
                    CharSequence charSequence = c2359pa.f8282d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c2359pa.f8256H, c2359pa.f8257I, c2359pa.f8258J, c2359pa.f8259K);
                    }
                    String strTrim = c2359pa.f8282d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c2359pa.f8274Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    c2359pa.f8274Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f4605L == null || (c1021Xq = this.f4604K) == null) {
            return;
        }
        c1021Xq.draw(canvas2);
        if (this.f4625e.isFocused()) {
            Rect bounds = this.f4605L.getBounds();
            Rect bounds2 = this.f4604K.getBounds();
            float f12 = c2359pa.f8277b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0776S2.m1598c(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC0776S2.m1598c(iCenterX, bounds2.right, f12);
            this.f4605L.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f4592A0) {
            return;
        }
        this.f4592A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2359pa c2359pa = this.f4662w0;
        if (c2359pa != null) {
            c2359pa.f8261M = drawableState;
            ColorStateList colorStateList2 = c2359pa.f8295k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c2359pa.f8293j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c2359pa.m4789j(false);
                z = true;
            }
        }
        if (this.f4625e != null) {
            m2495w(isLaidOut() && isEnabled(), false);
        }
        m2492t();
        m2498z();
        if (z) {
            invalidate();
        }
        this.f4592A0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final int m2478e() {
        if (this.f4597D) {
            int i = this.f4609P;
            C2359pa c2359pa = this.f4662w0;
            if (i == 0) {
                return (int) c2359pa.m4786f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c2359pa.m4786f() / 2.0f);
                }
                float fM4786f = c2359pa.m4786f();
                TextPaint textPaint = c2359pa.f8264P;
                textPaint.setTextSize(c2359pa.f8291i);
                textPaint.setTypeface(c2359pa.f8304s);
                textPaint.setLetterSpacing(c2359pa.f8271W);
                return Math.max(0, (int) (fM4786f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final C1222bh m2479f() {
        C1222bh c1222bh = new C1222bh();
        c1222bh.f1198c = AbstractC0714Qj.m1473D(getContext(), io.github.cherrywechat.R.attr.motionDurationShort2, 87);
        c1222bh.f1199d = AbstractC0714Qj.m1474E(getContext(), io.github.cherrywechat.R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
        return c1222bh;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2480g() {
        return this.f4597D && !TextUtils.isEmpty(this.f4598E) && (this.f4600G instanceof C2369pc);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f4625e;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2478e() + getPaddingTop() + editText.getBaseline();
    }

    public C1021Xq getBoxBackground() {
        int i = this.f4609P;
        if (i == 1 || i == 2) {
            return this.f4600G;
        }
        throw new IllegalStateException();
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
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f4620b0;
        return layoutDirection == 1 ? this.f4606M.f2331h.mo1563a(rectF) : this.f4606M.f2330g.mo1563a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f4620b0;
        return layoutDirection == 1 ? this.f4606M.f2330g.mo1563a(rectF) : this.f4606M.f2331h.mo1563a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f4620b0;
        return layoutDirection == 1 ? this.f4606M.f2328e.mo1563a(rectF) : this.f4606M.f2329f.mo1563a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f4620b0;
        return layoutDirection == 1 ? this.f4606M.f2329f.mo1563a(rectF) : this.f4606M.f2328e.mo1563a(rectF);
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
        C2304o4 c2304o4;
        if (this.f4639l && this.f4643n && (c2304o4 = this.f4647p) != null) {
            return c2304o4.getContentDescription();
        }
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
        C2241ml c2241ml = this.f4637k;
        if (c2241ml.f7911q) {
            return c2241ml.f7910p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f4637k.f7914t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f4637k.f7913s;
    }

    public int getErrorCurrentTextColors() {
        C2304o4 c2304o4 = this.f4637k.f7912r;
        if (c2304o4 != null) {
            return c2304o4.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f4621c.f3608c.getDrawable();
    }

    public CharSequence getHelperText() {
        C2241ml c2241ml = this.f4637k;
        if (c2241ml.f7918x) {
            return c2241ml.f7917w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C2304o4 c2304o4 = this.f4637k.f7919y;
        if (c2304o4 != null) {
            return c2304o4.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f4597D) {
            return this.f4598E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4662w0.m4786f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2359pa c2359pa = this.f4662w0;
        return c2359pa.m4787g(c2359pa.f8295k);
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
        if (this.f4655t) {
            return this.f4653s;
        }
        return null;
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
    public final C1021Xq m2481h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f4625e;
        float popupElevation = editText instanceof C0076Bq ? ((C0076Bq) editText).getPopupElevation() : getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0684Pw c0684Pw = new C0684Pw();
        C0684Pw c0684Pw2 = new C0684Pw();
        C0684Pw c0684Pw3 = new C0684Pw();
        C0684Pw c0684Pw4 = new C0684Pw();
        int i = 0;
        C1456gf c1456gf = new C1456gf(i);
        C1456gf c1456gf2 = new C1456gf(i);
        C1456gf c1456gf3 = new C1456gf(i);
        C1456gf c1456gf4 = new C1456gf(i);
        C2436r c2436r = new C2436r(f);
        C2436r c2436r2 = new C2436r(f);
        C2436r c2436r3 = new C2436r(dimensionPixelOffset);
        C2436r c2436r4 = new C2436r(dimensionPixelOffset);
        C0728Qx c0728Qx = new C0728Qx();
        c0728Qx.f2324a = c0684Pw;
        c0728Qx.f2325b = c0684Pw2;
        c0728Qx.f2326c = c0684Pw3;
        c0728Qx.f2327d = c0684Pw4;
        c0728Qx.f2328e = c2436r;
        c0728Qx.f2329f = c2436r2;
        c0728Qx.f2330g = c2436r4;
        c0728Qx.f2331h = c2436r3;
        c0728Qx.f2332i = c1456gf;
        c0728Qx.f2333j = c1456gf2;
        c0728Qx.f2334k = c1456gf3;
        c0728Qx.f2335l = c1456gf4;
        EditText editText2 = this.f4625e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0076Bq ? ((C0076Bq) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C1021Xq.f3234E;
            TypedValue typedValueM2539R = AbstractC1293cr.m2539R(context, io.github.cherrywechat.R.attr.colorSurface, C1021Xq.class.getSimpleName());
            int i2 = typedValueM2539R.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueM2539R.data);
        }
        C1021Xq c1021Xq = new C1021Xq();
        c1021Xq.m1925k(context);
        c1021Xq.m1928n(dropDownBackgroundTintList);
        c1021Xq.m1927m(popupElevation);
        c1021Xq.setShapeAppearanceModel(c0728Qx);
        C0935Vq c0935Vq = c1021Xq.f3241b;
        if (c0935Vq.f2909h == null) {
            c0935Vq.f2909h = new Rect();
        }
        c1021Xq.f3241b.f2909h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c1021Xq.invalidateSelf();
        return c1021Xq;
    }

    /* JADX INFO: renamed from: i */
    public final int m2482i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f4625e.getCompoundPaddingLeft() : this.f4621c.m2060c() : this.f4619b.m2004a()) + i;
    }

    /* JADX INFO: renamed from: j */
    public final int m2483j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f4625e.getCompoundPaddingRight() : this.f4619b.m2004a() : this.f4621c.m2060c());
    }

    /* JADX INFO: renamed from: k */
    public final void m2484k() {
        int i = this.f4609P;
        if (i == 0) {
            this.f4600G = null;
            this.f4604K = null;
            this.f4605L = null;
        } else if (i == 1) {
            this.f4600G = new C1021Xq(this.f4606M);
            this.f4604K = new C1021Xq();
            this.f4605L = new C1021Xq();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC0213Ey.m409g(new StringBuilder(), this.f4609P, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f4597D || (this.f4600G instanceof C2369pc)) {
                this.f4600G = new C1021Xq(this.f4606M);
            } else {
                C0728Qx c0728Qx = this.f4606M;
                int i2 = C2369pc.f8334H;
                if (c0728Qx == null) {
                    c0728Qx = new C0728Qx();
                }
                C2318oc c2318oc = new C2318oc(c0728Qx, new RectF());
                C2369pc c2369pc = new C2369pc(c2318oc);
                c2369pc.f8335G = c2318oc;
                this.f4600G = c2369pc;
            }
            this.f4604K = null;
            this.f4605L = null;
        }
        m2493u();
        m2498z();
        if (this.f4609P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f4610Q = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0828TB.m1650t(getContext())) {
                this.f4610Q = getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m2474a();
        if (this.f4609P != 0) {
            m2494v();
        }
        EditText editText = this.f4625e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f4609P;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2485l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m2480g()) {
            int width = this.f4625e.getWidth();
            int gravity = this.f4625e.getGravity();
            C2359pa c2359pa = this.f4662w0;
            boolean zM4783c = c2359pa.m4783c(c2359pa.f8250B);
            c2359pa.f8252D = zM4783c;
            Rect rect = c2359pa.f8281d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM4783c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c2359pa.f8276a0;
                    }
                } else if (zM4783c) {
                    f = rect.right;
                    f2 = c2359pa.f8276a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f4620b0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c2359pa.f8276a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c2359pa.f8252D) {
                        f5 = c2359pa.f8276a0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c2359pa.f8252D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c2359pa.f8276a0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c2359pa.m4786f() + rect.top;
                if (c2359pa.f8274Z != null && !c2359pa.m4794o()) {
                    StaticLayout staticLayout = c2359pa.f8274Z;
                    float lineWidth = (c2359pa.f8291i / c2359pa.f8289h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (c2359pa.f8252D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f4608O;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f4611R);
                rectF.top = 0.0f;
                C2369pc c2369pc = (C2369pc) this.f4600G;
                c2369pc.getClass();
                c2369pc.m4797t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c2359pa.f8276a0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f4620b0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c2359pa.f8276a0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c2359pa.m4786f() + rect.top;
            if (c2359pa.f8274Z != null) {
                StaticLayout staticLayout2 = c2359pa.f8274Z;
                float lineWidth2 = (c2359pa.f8291i / c2359pa.f8289h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (c2359pa.f8252D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2486n(C2304o4 c2304o4, int i) {
        try {
            c2304o4.setTextAppearance(i);
            if (c2304o4.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c2304o4.setTextAppearance(io.github.cherrywechat.R.style.TextAppearance_AppCompat_Caption);
        c2304o4.setTextColor(getContext().getColor(io.github.cherrywechat.R.color.design_error));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2487o() {
        C2241ml c2241ml = this.f4637k;
        return (c2241ml.f7909o != 1 || c2241ml.f7912r == null || TextUtils.isEmpty(c2241ml.f7910p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4662w0.m4788i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C1141ag c1141ag = this.f4621c;
        c1141ag.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f4596C0 = false;
        if (this.f4625e != null && this.f4625e.getMeasuredHeight() < (iMax = Math.max(c1141ag.getMeasuredHeight(), this.f4619b.getMeasuredHeight()))) {
            this.f4625e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM2491s = m2491s();
        if (z || zM2491s) {
            this.f4625e.post(new RunnableC0562N2(26, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f4625e;
        if (editText != null) {
            Rect rect = this.f4616W;
            AbstractC2671wd.m5235a(this, editText, rect);
            C1021Xq c1021Xq = this.f4604K;
            if (c1021Xq != null) {
                int i6 = rect.bottom;
                c1021Xq.setBounds(rect.left, i6 - this.f4612S, rect.right, i6);
            }
            C1021Xq c1021Xq2 = this.f4605L;
            if (c1021Xq2 != null) {
                int i7 = rect.bottom;
                c1021Xq2.setBounds(rect.left, i7 - this.f4613T, rect.right, i7);
            }
            if (this.f4597D) {
                float textSize = this.f4625e.getTextSize();
                C2359pa c2359pa = this.f4662w0;
                float f = c2359pa.f8289h;
                TextPaint textPaint = c2359pa.f8264P;
                if (f != textSize) {
                    c2359pa.f8289h = textSize;
                    c2359pa.m4789j(false);
                }
                int gravity = this.f4625e.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c2359pa.f8287g != i8) {
                    c2359pa.f8287g = i8;
                    c2359pa.m4789j(false);
                }
                if (c2359pa.f8285f != gravity) {
                    c2359pa.f8285f = gravity;
                    c2359pa.m4789j(false);
                }
                Rect rectM2477d = m2477d(rect);
                int i9 = rectM2477d.left;
                int i10 = rectM2477d.top;
                int i11 = rectM2477d.right;
                int i12 = rectM2477d.bottom;
                Rect rect2 = c2359pa.f8281d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c2359pa.f8262N = true;
                }
                if (this.f4625e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c2359pa.f8289h);
                    textPaint.setTypeface(c2359pa.f8307v);
                    textPaint.setLetterSpacing(c2359pa.f8272X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c2359pa.f8289h);
                    textPaint.setTypeface(c2359pa.f8307v);
                    textPaint.setLetterSpacing(c2359pa.f8272X);
                    fDescent = c2359pa.f8297l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f4625e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f4618a0;
                rect3.left = compoundPaddingLeft;
                if (this.f4609P != 1 || this.f4625e.getMinLines() > 1) {
                    if (this.f4609P != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c2359pa.f8289h);
                        textPaint.setTypeface(c2359pa.f8307v);
                        textPaint.setLetterSpacing(c2359pa.f8272X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f4625e.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f4625e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f4609P != 1 || this.f4625e.getMinLines() > 1) ? rect.bottom - this.f4625e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c2359pa.f8279c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != c2359pa.f8296k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c2359pa.f8262N = true;
                    c2359pa.f8296k0 = true;
                }
                c2359pa.m4789j(false);
                if (!m2480g() || this.f4660v0) {
                    return;
                }
                m2485l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f4596C0;
        C1141ag c1141ag = this.f4621c;
        if (!z) {
            c1141ag.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f4596C0 = true;
        }
        if (this.f4657u != null && (editText = this.f4625e) != null) {
            this.f4657u.setGravity(editText.getGravity());
            this.f4657u.setPadding(this.f4625e.getCompoundPaddingLeft(), this.f4625e.getCompoundPaddingTop(), this.f4625e.getCompoundPaddingRight(), this.f4625e.getCompoundPaddingBottom());
        }
        c1141ag.m2070m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f4625e.getMeasuredWidth() - this.f4625e.getCompoundPaddingLeft()) - this.f4625e.getCompoundPaddingRight();
        C2359pa c2359pa = this.f4662w0;
        TextPaint textPaint = c2359pa.f8264P;
        textPaint.setTextSize(c2359pa.f8291i);
        textPaint.setTypeface(c2359pa.f8304s);
        textPaint.setLetterSpacing(c2359pa.f8271W);
        float f2 = measuredWidth;
        c2359pa.f8292i0 = c2359pa.m4785e(c2359pa.f8286f0, textPaint, c2359pa.f8250B, (c2359pa.f8291i / c2359pa.f8289h) * f2, c2359pa.f8252D).getHeight();
        textPaint.setTextSize(c2359pa.f8289h);
        textPaint.setTypeface(c2359pa.f8307v);
        textPaint.setLetterSpacing(c2359pa.f8272X);
        c2359pa.f8294j0 = c2359pa.m4785e(c2359pa.f8284e0, textPaint, c2359pa.f8250B, f2, c2359pa.f8252D).getHeight();
        EditText editText2 = this.f4625e;
        Rect rect = this.f4616W;
        AbstractC2671wd.m5235a(this, editText2, rect);
        Rect rectM2477d = m2477d(rect);
        int i3 = rectM2477d.left;
        int i4 = rectM2477d.top;
        int i5 = rectM2477d.right;
        int i6 = rectM2477d.bottom;
        Rect rect2 = c2359pa.f8281d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c2359pa.f8262N = true;
        }
        m2494v();
        m2474a();
        if (this.f4625e == null) {
            return;
        }
        int i7 = c2359pa.f8294j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c2359pa.f8264P;
            textPaint2.setTextSize(c2359pa.f8289h);
            textPaint2.setTypeface(c2359pa.f8307v);
            textPaint2.setLetterSpacing(c2359pa.f8272X);
            f = -textPaint2.ascent();
        }
        if (this.f4653s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f4657u.getPaint());
            textPaint3.setTextSize(this.f4657u.getTextSize());
            textPaint3.setTypeface(this.f4657u.getTypeface());
            textPaint3.setLetterSpacing(this.f4657u.getLetterSpacing());
            C1520hz c1520hz = new C1520hz(this.f4653s, textPaint3, measuredWidth);
            c1520hz.f5387k = getLayoutDirection() == 1;
            c1520hz.f5386j = true;
            float lineSpacingExtra = this.f4657u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f4657u.getLineSpacingMultiplier();
            c1520hz.f5383g = lineSpacingExtra;
            c1520hz.f5384h = lineSpacingMultiplier;
            c1520hz.f5389m = new C2464rl(4, this);
            fM4786f = (this.f4609P == 1 ? c2359pa.m4786f() + this.f4610Q + this.f4623d : 0.0f) + c1520hz.m2900a().getHeight();
        }
        float fMax = Math.max(f, fM4786f);
        if (this.f4625e.getMeasuredHeight() < fMax) {
            this.f4625e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2705xA)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2705xA c2705xA = (C2705xA) parcelable;
        super.onRestoreInstanceState(c2705xA.f8397a);
        setError(c2705xA.f9280c);
        if (c2705xA.f9281d) {
            post(new RunnableC0431K0(15, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f4607N) {
            InterfaceC1006Xb interfaceC1006Xb = this.f4606M.f2328e;
            RectF rectF = this.f4620b0;
            float fMo1563a = interfaceC1006Xb.mo1563a(rectF);
            float fMo1563a2 = this.f4606M.f2329f.mo1563a(rectF);
            float fMo1563a3 = this.f4606M.f2331h.mo1563a(rectF);
            float fMo1563a4 = this.f4606M.f2330g.mo1563a(rectF);
            C0728Qx c0728Qx = this.f4606M;
            AbstractC0828TB abstractC0828TB = c0728Qx.f2324a;
            AbstractC0828TB abstractC0828TB2 = c0728Qx.f2325b;
            AbstractC0828TB abstractC0828TB3 = c0728Qx.f2327d;
            AbstractC0828TB abstractC0828TB4 = c0728Qx.f2326c;
            C1456gf c1456gf = new C1456gf(0);
            C1456gf c1456gf2 = new C1456gf(0);
            C1456gf c1456gf3 = new C1456gf(0);
            C1456gf c1456gf4 = new C1456gf(0);
            C2436r c2436r = new C2436r(fMo1563a2);
            C2436r c2436r2 = new C2436r(fMo1563a);
            C2436r c2436r3 = new C2436r(fMo1563a4);
            C2436r c2436r4 = new C2436r(fMo1563a3);
            C0728Qx c0728Qx2 = new C0728Qx();
            c0728Qx2.f2324a = abstractC0828TB2;
            c0728Qx2.f2325b = abstractC0828TB;
            c0728Qx2.f2326c = abstractC0828TB3;
            c0728Qx2.f2327d = abstractC0828TB4;
            c0728Qx2.f2328e = c2436r;
            c0728Qx2.f2329f = c2436r2;
            c0728Qx2.f2330g = c2436r4;
            c0728Qx2.f2331h = c2436r3;
            c0728Qx2.f2332i = c1456gf;
            c0728Qx2.f2333j = c1456gf2;
            c0728Qx2.f2334k = c1456gf3;
            c0728Qx2.f2335l = c1456gf4;
            this.f4607N = z;
            setShapeAppearanceModel(c0728Qx2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2705xA c2705xA = new C2705xA(super.onSaveInstanceState());
        if (m2487o()) {
            c2705xA.f9280c = getError();
        }
        C1141ag c1141ag = this.f4621c;
        c2705xA.f9281d = c1141ag.f3614i != 0 && c1141ag.f3612g.f4545d;
        return c2705xA;
    }

    /* JADX INFO: renamed from: p */
    public final void m2488p(Editable editable) {
        ((C2438r1) this.f4645o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f4643n;
        int i = this.f4641m;
        if (i == -1) {
            this.f4647p.setText(String.valueOf(length));
            this.f4647p.setContentDescription(null);
            this.f4643n = false;
        } else {
            this.f4643n = length > i;
            Context context = getContext();
            this.f4647p.setContentDescription(context.getString(this.f4643n ? io.github.cherrywechat.R.string.character_counter_overflowed_content_description : io.github.cherrywechat.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f4641m)));
            if (z != this.f4643n) {
                m2489q();
            }
            String str = C0264G5.f846b;
            C0264G5 c0264g5 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0264G5.f849e : C0264G5.f848d;
            C2304o4 c2304o4 = this.f4647p;
            String string = getContext().getString(io.github.cherrywechat.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f4641m));
            c0264g5.getClass();
            C1037Y5 c1037y5 = AbstractC2447rA.f8572a;
            c2304o4.setText(string != null ? c0264g5.m550c(string).toString() : null);
        }
        if (this.f4625e == null || z == this.f4643n) {
            return;
        }
        m2495w(false, false);
        m2498z();
        m2492t();
    }

    /* JADX INFO: renamed from: q */
    public final void m2489q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2304o4 c2304o4 = this.f4647p;
        if (c2304o4 != null) {
            m2486n(c2304o4, this.f4643n ? this.f4649q : this.f4651r);
            if (!this.f4643n && (colorStateList2 = this.f4667z) != null) {
                this.f4647p.setTextColor(colorStateList2);
            }
            if (!this.f4643n || (colorStateList = this.f4591A) == null) {
                return;
            }
            this.f4647p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2490r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f4593B;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM2537P = AbstractC1293cr.m2537P(context, io.github.cherrywechat.R.attr.colorControlActivated);
            if (typedValueM2537P != null) {
                int i = typedValueM2537P.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC0295Gu.m622o(context, i);
                } else {
                    int i2 = typedValueM2537P.data;
                    colorStateListValueOf = i2 != 0 ? ColorStateList.valueOf(i2) : null;
                }
            }
        }
        EditText editText = this.f4625e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f4625e.getTextCursorDrawable().mutate();
        if ((m2487o() || (this.f4647p != null && this.f4643n)) && (colorStateList = this.f4595C) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2491s() {
        boolean z;
        if (this.f4625e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C1072Yy c1072Yy = this.f4619b;
            if (c1072Yy.getMeasuredWidth() > 0) {
                int measuredWidth = c1072Yy.getMeasuredWidth() - this.f4625e.getPaddingLeft();
                if (this.f4624d0 == null || this.f4626e0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f4624d0 = colorDrawable;
                    this.f4626e0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f4625e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f4624d0;
                if (drawable != colorDrawable2) {
                    this.f4625e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                }
                z = false;
            } else {
                if (this.f4624d0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f4625e.getCompoundDrawablesRelative();
                    this.f4625e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f4624d0 = null;
                    z = true;
                }
                z = false;
            }
        }
        C1141ag c1141ag = this.f4621c;
        if ((c1141ag.m2062e() || ((c1141ag.f3614i != 0 && c1141ag.m2061d()) || c1141ag.f3621p != null)) && c1141ag.getMeasuredWidth() > 0) {
            int measuredWidth2 = c1141ag.f3622q.getMeasuredWidth() - this.f4625e.getPaddingRight();
            if (c1141ag.m2062e()) {
                checkableImageButton = c1141ag.f3608c;
            } else if (c1141ag.f3614i != 0 && c1141ag.m2061d()) {
                checkableImageButton = c1141ag.f3612g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f4625e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f4630g0;
            if (colorDrawable3 != null && this.f4632h0 != measuredWidth2) {
                this.f4632h0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f4625e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f4630g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f4630g0 = colorDrawable4;
                this.f4632h0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f4630g0;
            if (drawable2 != colorDrawable5) {
                this.f4634i0 = drawable2;
                this.f4625e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f4630g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f4625e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f4630g0) {
                this.f4625e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f4634i0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f4630g0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f4615V != i) {
            this.f4615V = i;
            this.f4648p0 = i;
            this.f4652r0 = i;
            this.f4654s0 = i;
            m2476c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f4648p0 = defaultColor;
        this.f4615V = defaultColor;
        this.f4650q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f4652r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4654s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2476c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f4609P) {
            return;
        }
        this.f4609P = i;
        if (this.f4625e != null) {
            m2484k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f4610Q = i;
    }

    public void setBoxCornerFamily(int i) {
        C0685Px c0685PxM1516f = this.f4606M.m1516f();
        InterfaceC1006Xb interfaceC1006Xb = this.f4606M.f2328e;
        c0685PxM1516f.f2192a = AbstractC1406fG.m2687L(i);
        c0685PxM1516f.f2196e = interfaceC1006Xb;
        InterfaceC1006Xb interfaceC1006Xb2 = this.f4606M.f2329f;
        c0685PxM1516f.f2193b = AbstractC1406fG.m2687L(i);
        c0685PxM1516f.f2197f = interfaceC1006Xb2;
        InterfaceC1006Xb interfaceC1006Xb3 = this.f4606M.f2331h;
        c0685PxM1516f.f2195d = AbstractC1406fG.m2687L(i);
        c0685PxM1516f.f2199h = interfaceC1006Xb3;
        InterfaceC1006Xb interfaceC1006Xb4 = this.f4606M.f2330g;
        c0685PxM1516f.f2194c = AbstractC1406fG.m2687L(i);
        c0685PxM1516f.f2198g = interfaceC1006Xb4;
        this.f4606M = c0685PxM1516f.m1383a();
        m2476c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f4644n0 != i) {
            this.f4644n0 = i;
            m2498z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f4640l0 = colorStateList.getDefaultColor();
            this.f4656t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f4642m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f4644n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f4644n0 != colorStateList.getDefaultColor()) {
            this.f4644n0 = colorStateList.getDefaultColor();
        }
        m2498z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f4646o0 != colorStateList) {
            this.f4646o0 = colorStateList;
            m2498z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f4612S = i;
        m2498z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f4613T = i;
        m2498z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f4639l != z) {
            C2241ml c2241ml = this.f4637k;
            if (z) {
                C2304o4 c2304o4 = new C2304o4(getContext(), null);
                this.f4647p = c2304o4;
                c2304o4.setId(io.github.cherrywechat.R.id.textinput_counter);
                Typeface typeface = this.f4622c0;
                if (typeface != null) {
                    this.f4647p.setTypeface(typeface);
                }
                this.f4647p.setMaxLines(1);
                c2241ml.m4541a(this.f4647p, 2);
                ((ViewGroup.MarginLayoutParams) this.f4647p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_textinput_counter_margin_start));
                m2489q();
                if (this.f4647p != null) {
                    EditText editText = this.f4625e;
                    m2488p(editText != null ? editText.getText() : null);
                }
            } else {
                c2241ml.m4547g(this.f4647p, 2);
                this.f4647p = null;
            }
            this.f4639l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f4641m != i) {
            if (i > 0) {
                this.f4641m = i;
            } else {
                this.f4641m = -1;
            }
            if (!this.f4639l || this.f4647p == null) {
                return;
            }
            EditText editText = this.f4625e;
            m2488p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f4649q != i) {
            this.f4649q = i;
            m2489q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f4591A != colorStateList) {
            this.f4591A = colorStateList;
            m2489q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f4651r != i) {
            this.f4651r = i;
            m2489q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f4667z != colorStateList) {
            this.f4667z = colorStateList;
            m2489q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f4593B != colorStateList) {
            this.f4593B = colorStateList;
            m2490r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f4595C != colorStateList) {
            this.f4595C = colorStateList;
            if (m2487o() || (this.f4647p != null && this.f4643n)) {
                m2490r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f4636j0 = colorStateList;
        this.f4638k0 = colorStateList;
        if (this.f4625e != null) {
            m2495w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m2473m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f4621c.f3612g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f4621c.f3612g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C1141ag c1141ag = this.f4621c;
        CharSequence text = i != 0 ? c1141ag.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C1141ag c1141ag = this.f4621c;
        Drawable drawableM2695U = i != 0 ? AbstractC1406fG.m2695U(c1141ag.getContext(), i) : null;
        TextInputLayout textInputLayout = c1141ag.f3606a;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        checkableImageButton.setImageDrawable(drawableM2695U);
        if (drawableM2695U != null) {
            AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, c1141ag.f3616k, c1141ag.f3617l);
            AbstractC0295Gu.m600A(textInputLayout, checkableImageButton, c1141ag.f3616k);
        }
    }

    public void setEndIconMinSize(int i) {
        C1141ag c1141ag = this.f4621c;
        if (i < 0) {
            c1141ag.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c1141ag.f3618m) {
            c1141ag.f3618m = i;
            CheckableImageButton checkableImageButton = c1141ag.f3612g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c1141ag.f3608c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f4621c.m2064g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C1141ag c1141ag = this.f4621c;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        View.OnLongClickListener onLongClickListener = c1141ag.f3620o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3620o = onLongClickListener;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3619n = scaleType;
        c1141ag.f3612g.setScaleType(scaleType);
        c1141ag.f3608c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C1141ag c1141ag = this.f4621c;
        if (c1141ag.f3616k != colorStateList) {
            c1141ag.f3616k = colorStateList;
            AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3612g, colorStateList, c1141ag.f3617l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C1141ag c1141ag = this.f4621c;
        if (c1141ag.f3617l != mode) {
            c1141ag.f3617l = mode;
            AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3612g, c1141ag.f3616k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f4621c.m2065h(z);
    }

    public void setError(CharSequence charSequence) {
        C2241ml c2241ml = this.f4637k;
        if (!c2241ml.f7911q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c2241ml.m4546f();
            return;
        }
        c2241ml.m4543c();
        c2241ml.f7910p = charSequence;
        c2241ml.f7912r.setText(charSequence);
        int i = c2241ml.f7908n;
        if (i != 1) {
            c2241ml.f7909o = 1;
        }
        c2241ml.m4549i(i, c2241ml.f7909o, c2241ml.m4548h(c2241ml.f7912r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7914t = i;
        C2304o4 c2304o4 = c2241ml.f7912r;
        if (c2304o4 != null) {
            c2304o4.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7913s = charSequence;
        C2304o4 c2304o4 = c2241ml.f7912r;
        if (c2304o4 != null) {
            c2304o4.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C2241ml c2241ml = this.f4637k;
        TextInputLayout textInputLayout = c2241ml.f7902h;
        if (c2241ml.f7911q == z) {
            return;
        }
        c2241ml.m4543c();
        if (z) {
            C2304o4 c2304o4 = new C2304o4(c2241ml.f7901g, null);
            c2241ml.f7912r = c2304o4;
            c2304o4.setId(io.github.cherrywechat.R.id.textinput_error);
            c2241ml.f7912r.setTextAlignment(5);
            Typeface typeface = c2241ml.f7894B;
            if (typeface != null) {
                c2241ml.f7912r.setTypeface(typeface);
            }
            int i = c2241ml.f7915u;
            c2241ml.f7915u = i;
            C2304o4 c2304o42 = c2241ml.f7912r;
            if (c2304o42 != null) {
                c2241ml.f7902h.m2486n(c2304o42, i);
            }
            ColorStateList colorStateList = c2241ml.f7916v;
            c2241ml.f7916v = colorStateList;
            C2304o4 c2304o43 = c2241ml.f7912r;
            if (c2304o43 != null && colorStateList != null) {
                c2304o43.setTextColor(colorStateList);
            }
            CharSequence charSequence = c2241ml.f7913s;
            c2241ml.f7913s = charSequence;
            C2304o4 c2304o44 = c2241ml.f7912r;
            if (c2304o44 != null) {
                c2304o44.setContentDescription(charSequence);
            }
            int i2 = c2241ml.f7914t;
            c2241ml.f7914t = i2;
            C2304o4 c2304o45 = c2241ml.f7912r;
            if (c2304o45 != null) {
                c2304o45.setAccessibilityLiveRegion(i2);
            }
            c2241ml.f7912r.setVisibility(4);
            c2241ml.m4541a(c2241ml.f7912r, 0);
        } else {
            c2241ml.m4546f();
            c2241ml.m4547g(c2241ml.f7912r, 0);
            c2241ml.f7912r = null;
            textInputLayout.m2492t();
            textInputLayout.m2498z();
        }
        c2241ml.f7911q = z;
    }

    public void setErrorIconDrawable(int i) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.m2066i(i != 0 ? AbstractC1406fG.m2695U(c1141ag.getContext(), i) : null);
        AbstractC0295Gu.m600A(c1141ag.f3606a, c1141ag.f3608c, c1141ag.f3609d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C1141ag c1141ag = this.f4621c;
        CheckableImageButton checkableImageButton = c1141ag.f3608c;
        View.OnLongClickListener onLongClickListener = c1141ag.f3611f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3611f = onLongClickListener;
        CheckableImageButton checkableImageButton = c1141ag.f3608c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C1141ag c1141ag = this.f4621c;
        if (c1141ag.f3609d != colorStateList) {
            c1141ag.f3609d = colorStateList;
            AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3608c, colorStateList, c1141ag.f3610e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C1141ag c1141ag = this.f4621c;
        if (c1141ag.f3610e != mode) {
            c1141ag.f3610e = mode;
            AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3608c, c1141ag.f3609d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7915u = i;
        C2304o4 c2304o4 = c2241ml.f7912r;
        if (c2304o4 != null) {
            c2241ml.f7902h.m2486n(c2304o4, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7916v = colorStateList;
        C2304o4 c2304o4 = c2241ml.f7912r;
        if (c2304o4 == null || colorStateList == null) {
            return;
        }
        c2304o4.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f4664x0 != z) {
            this.f4664x0 = z;
            m2495w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C2241ml c2241ml = this.f4637k;
        if (zIsEmpty) {
            if (c2241ml.f7918x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c2241ml.f7918x) {
            setHelperTextEnabled(true);
        }
        c2241ml.m4543c();
        c2241ml.f7917w = charSequence;
        c2241ml.f7919y.setText(charSequence);
        int i = c2241ml.f7908n;
        if (i != 2) {
            c2241ml.f7909o = 2;
        }
        c2241ml.m4549i(i, c2241ml.f7909o, c2241ml.m4548h(c2241ml.f7919y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7893A = colorStateList;
        C2304o4 c2304o4 = c2241ml.f7919y;
        if (c2304o4 == null || colorStateList == null) {
            return;
        }
        c2304o4.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C2241ml c2241ml = this.f4637k;
        TextInputLayout textInputLayout = c2241ml.f7902h;
        if (c2241ml.f7918x == z) {
            return;
        }
        c2241ml.m4543c();
        if (z) {
            C2304o4 c2304o4 = new C2304o4(c2241ml.f7901g, null);
            c2241ml.f7919y = c2304o4;
            c2304o4.setId(io.github.cherrywechat.R.id.textinput_helper_text);
            c2241ml.f7919y.setTextAlignment(5);
            Typeface typeface = c2241ml.f7894B;
            if (typeface != null) {
                c2241ml.f7919y.setTypeface(typeface);
            }
            c2241ml.f7919y.setVisibility(4);
            c2241ml.f7919y.setAccessibilityLiveRegion(1);
            int i = c2241ml.f7920z;
            c2241ml.f7920z = i;
            C2304o4 c2304o42 = c2241ml.f7919y;
            if (c2304o42 != null) {
                c2304o42.setTextAppearance(i);
            }
            ColorStateList colorStateList = c2241ml.f7893A;
            c2241ml.f7893A = colorStateList;
            C2304o4 c2304o43 = c2241ml.f7919y;
            if (c2304o43 != null && colorStateList != null) {
                c2304o43.setTextColor(colorStateList);
            }
            c2241ml.m4541a(c2241ml.f7919y, 1);
            c2241ml.f7919y.setAccessibilityDelegate(new C2198ll(c2241ml));
        } else {
            c2241ml.m4543c();
            int i2 = c2241ml.f7908n;
            if (i2 == 2) {
                c2241ml.f7909o = 0;
            }
            c2241ml.m4549i(i2, c2241ml.f7909o, c2241ml.m4548h(c2241ml.f7919y, ""));
            c2241ml.m4547g(c2241ml.f7919y, 1);
            c2241ml.f7919y = null;
            textInputLayout.m2492t();
            textInputLayout.m2498z();
        }
        c2241ml.f7918x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C2241ml c2241ml = this.f4637k;
        c2241ml.f7920z = i;
        C2304o4 c2304o4 = c2241ml.f7919y;
        if (c2304o4 != null) {
            c2304o4.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f4597D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f4666y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f4597D) {
            this.f4597D = z;
            if (z) {
                CharSequence hint = this.f4625e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f4598E)) {
                        setHint(hint);
                    }
                    this.f4625e.setHint((CharSequence) null);
                }
                this.f4599F = true;
            } else {
                this.f4599F = false;
                if (!TextUtils.isEmpty(this.f4598E) && TextUtils.isEmpty(this.f4625e.getHint())) {
                    this.f4625e.setHint(this.f4598E);
                }
                setHintInternal(null);
            }
            if (this.f4625e != null) {
                m2494v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C2359pa c2359pa = this.f4662w0;
        if (i != c2359pa.f8286f0) {
            c2359pa.f8286f0 = i;
            c2359pa.m4789j(false);
        }
        if (i != c2359pa.f8284e0) {
            c2359pa.f8284e0 = i;
            c2359pa.m4789j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C2359pa c2359pa = this.f4662w0;
        TextInputLayout textInputLayout = c2359pa.f8275a;
        C2404qA c2404qA = new C2404qA(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c2404qA.f8432k;
        if (colorStateList != null) {
            c2359pa.f8295k = colorStateList;
        }
        float f = c2404qA.f8433l;
        if (f != 0.0f) {
            c2359pa.f8291i = f;
        }
        ColorStateList colorStateList2 = c2404qA.f8422a;
        if (colorStateList2 != null) {
            c2359pa.f8270V = colorStateList2;
        }
        c2359pa.f8268T = c2404qA.f8427f;
        c2359pa.f8269U = c2404qA.f8428g;
        c2359pa.f8267S = c2404qA.f8429h;
        c2359pa.f8271W = c2404qA.f8431j;
        C0437K6 c0437k6 = c2359pa.f8311z;
        if (c0437k6 != null) {
            c0437k6.f1436p = true;
        }
        C0132D2 c0132d2 = new C0132D2(10, c2359pa);
        c2404qA.m4837a();
        c2359pa.f8311z = new C0437K6(c0132d2, c2404qA.f8437p);
        c2404qA.m4838b(textInputLayout.getContext(), c2359pa.f8311z);
        c2359pa.m4789j(false);
        this.f4638k0 = c2359pa.f8295k;
        if (this.f4625e != null) {
            m2495w(false, false);
            m2494v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f4638k0 != colorStateList) {
            if (this.f4636j0 == null) {
                C2359pa c2359pa = this.f4662w0;
                if (c2359pa.f8295k != colorStateList) {
                    c2359pa.f8295k = colorStateList;
                    c2359pa.m4789j(false);
                }
            }
            this.f4638k0 = colorStateList;
            if (this.f4625e != null) {
                m2495w(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC2662wA interfaceC2662wA) {
        this.f4645o = interfaceC2662wA;
    }

    public void setMaxEms(int i) {
        this.f4631h = i;
        EditText editText = this.f4625e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f4635j = i;
        EditText editText = this.f4625e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f4629g = i;
        EditText editText = this.f4625e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f4633i = i;
        EditText editText = this.f4625e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3612g.setContentDescription(i != 0 ? c1141ag.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3612g.setImageDrawable(i != 0 ? AbstractC1406fG.m2695U(c1141ag.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C1141ag c1141ag = this.f4621c;
        if (z && c1141ag.f3614i != 1) {
            c1141ag.m2064g(1);
        } else if (z) {
            c1141ag.getClass();
        } else {
            c1141ag.m2064g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3616k = colorStateList;
        AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3612g, colorStateList, c1141ag.f3617l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.f3617l = mode;
        AbstractC0295Gu.m608a(c1141ag.f3606a, c1141ag.f3612g, c1141ag.f3616k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f4657u == null) {
            C2304o4 c2304o4 = new C2304o4(getContext(), null);
            this.f4657u = c2304o4;
            c2304o4.setId(io.github.cherrywechat.R.id.textinput_placeholder);
            this.f4657u.setImportantForAccessibility(1);
            this.f4657u.setAccessibilityLiveRegion(1);
            C1222bh c1222bhM2479f = m2479f();
            this.f4663x = c1222bhM2479f;
            c1222bhM2479f.f1197b = 67L;
            this.f4665y = m2479f();
            setPlaceholderTextAppearance(this.f4661w);
            setPlaceholderTextColor(this.f4659v);
            AbstractC2185lE.m4399l(this.f4657u, new C0377Iq(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f4655t) {
                setPlaceholderTextEnabled(true);
            }
            this.f4653s = charSequence;
        }
        EditText editText = this.f4625e;
        m2496x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f4661w = i;
        C2304o4 c2304o4 = this.f4657u;
        if (c2304o4 != null) {
            c2304o4.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f4659v != colorStateList) {
            this.f4659v = colorStateList;
            C2304o4 c2304o4 = this.f4657u;
            if (c2304o4 == null || colorStateList == null) {
                return;
            }
            c2304o4.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C1072Yy c1072Yy = this.f4619b;
        c1072Yy.getClass();
        c1072Yy.f3386c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1072Yy.f3385b.setText(charSequence);
        c1072Yy.m2008e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f4619b.f3385b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f4619b.f3385b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0728Qx c0728Qx) {
        C1021Xq c1021Xq = this.f4600G;
        if (c1021Xq == null || c1021Xq.f3241b.f2902a == c0728Qx) {
            return;
        }
        this.f4606M = c0728Qx;
        m2476c();
    }

    public void setStartIconCheckable(boolean z) {
        this.f4619b.f3387d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC1406fG.m2695U(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C1072Yy c1072Yy = this.f4619b;
        if (i < 0) {
            c1072Yy.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c1072Yy.f3390g) {
            c1072Yy.f3390g = i;
            CheckableImageButton checkableImageButton = c1072Yy.f3387d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C1072Yy c1072Yy = this.f4619b;
        CheckableImageButton checkableImageButton = c1072Yy.f3387d;
        View.OnLongClickListener onLongClickListener = c1072Yy.f3392i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1072Yy c1072Yy = this.f4619b;
        c1072Yy.f3392i = onLongClickListener;
        CheckableImageButton checkableImageButton = c1072Yy.f3387d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C1072Yy c1072Yy = this.f4619b;
        c1072Yy.f3391h = scaleType;
        c1072Yy.f3387d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C1072Yy c1072Yy = this.f4619b;
        if (c1072Yy.f3388e != colorStateList) {
            c1072Yy.f3388e = colorStateList;
            AbstractC0295Gu.m608a(c1072Yy.f3384a, c1072Yy.f3387d, colorStateList, c1072Yy.f3389f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C1072Yy c1072Yy = this.f4619b;
        if (c1072Yy.f3389f != mode) {
            c1072Yy.f3389f = mode;
            AbstractC0295Gu.m608a(c1072Yy.f3384a, c1072Yy.f3387d, c1072Yy.f3388e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f4619b.m2006c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C1141ag c1141ag = this.f4621c;
        c1141ag.getClass();
        c1141ag.f3621p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1141ag.f3622q.setText(charSequence);
        c1141ag.m2071n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f4621c.f3622q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f4621c.f3622q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2619vA c2619vA) {
        EditText editText = this.f4625e;
        if (editText != null) {
            AbstractC2185lE.m4399l(editText, c2619vA);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f4622c0) {
            this.f4622c0 = typeface;
            this.f4662w0.m4793n(typeface);
            C2241ml c2241ml = this.f4637k;
            if (typeface != c2241ml.f7894B) {
                c2241ml.f7894B = typeface;
                C2304o4 c2304o4 = c2241ml.f7912r;
                if (c2304o4 != null) {
                    c2304o4.setTypeface(typeface);
                }
                C2304o4 c2304o42 = c2241ml.f7919y;
                if (c2304o42 != null) {
                    c2304o42.setTypeface(typeface);
                }
            }
            C2304o4 c2304o43 = this.f4647p;
            if (c2304o43 != null) {
                c2304o43.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2492t() {
        Drawable background;
        C2304o4 c2304o4;
        EditText editText = this.f4625e;
        if (editText == null || this.f4609P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0107Ce.f250a;
        Drawable drawableMutate = background.mutate();
        if (m2487o()) {
            drawableMutate.setColorFilter(C0262G3.m540c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f4643n && (c2304o4 = this.f4647p) != null) {
            drawableMutate.setColorFilter(C0262G3.m540c(c2304o4.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f4625e.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2493u() {
        EditText editText = this.f4625e;
        if (editText == null || this.f4600G == null) {
            return;
        }
        if ((this.f4603J || editText.getBackground() == null) && this.f4609P != 0) {
            this.f4625e.setBackground(getEditTextBoxBackground());
            this.f4603J = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2494v() {
        if (this.f4609P != 1) {
            FrameLayout frameLayout = this.f4617a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM2478e = m2478e();
            if (iM2478e != layoutParams.topMargin) {
                layoutParams.topMargin = iM2478e;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2495w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2304o4 c2304o4;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f4625e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f4625e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f4636j0;
        C2359pa c2359pa = this.f4662w0;
        if (colorStateList2 != null) {
            c2359pa.m4790k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f4636j0;
            c2359pa.m4790k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f4656t0) : this.f4656t0));
        } else if (m2487o()) {
            C2304o4 c2304o42 = this.f4637k.f7912r;
            c2359pa.m4790k(c2304o42 != null ? c2304o42.getTextColors() : null);
        } else if (this.f4643n && (c2304o4 = this.f4647p) != null) {
            c2359pa.m4790k(c2304o4.getTextColors());
        } else if (z4 && (colorStateList = this.f4638k0) != null && c2359pa.f8295k != colorStateList) {
            c2359pa.f8295k = colorStateList;
            c2359pa.m4789j(false);
        }
        C1141ag c1141ag = this.f4621c;
        C1072Yy c1072Yy = this.f4619b;
        if (z3 || !this.f4664x0 || (isEnabled() && z4)) {
            if (z2 || this.f4660v0) {
                ValueAnimator valueAnimator = this.f4668z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f4668z0.cancel();
                }
                if (z && this.f4666y0) {
                    m2475b(1.0f);
                } else {
                    c2359pa.m4792m(1.0f);
                }
                this.f4660v0 = false;
                if (m2480g()) {
                    m2485l();
                }
                EditText editText3 = this.f4625e;
                m2496x(editText3 != null ? editText3.getText() : null);
                c1072Yy.f3393j = false;
                c1072Yy.m2008e();
                c1141ag.f3623r = false;
                c1141ag.m2071n();
                return;
            }
            return;
        }
        if (z2 || !this.f4660v0) {
            ValueAnimator valueAnimator2 = this.f4668z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f4668z0.cancel();
            }
            if (z && this.f4666y0) {
                m2475b(0.0f);
            } else {
                c2359pa.m4792m(0.0f);
            }
            if (m2480g() && !((C2369pc) this.f4600G).f8335G.f8164r.isEmpty() && m2480g()) {
                ((C2369pc) this.f4600G).m4797t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f4660v0 = true;
            C2304o4 c2304o43 = this.f4657u;
            if (c2304o43 != null && this.f4655t) {
                c2304o43.setText((CharSequence) null);
                AbstractC0528MB.m1023a(this.f4617a, this.f4665y);
                this.f4657u.setVisibility(4);
            }
            c1072Yy.f3393j = true;
            c1072Yy.m2008e();
            c1141ag.f3623r = true;
            c1141ag.m2071n();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2496x(Editable editable) {
        ((C2438r1) this.f4645o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f4617a;
        if (length != 0 || this.f4660v0) {
            C2304o4 c2304o4 = this.f4657u;
            if (c2304o4 == null || !this.f4655t) {
                return;
            }
            c2304o4.setText((CharSequence) null);
            AbstractC0528MB.m1023a(frameLayout, this.f4665y);
            this.f4657u.setVisibility(4);
            return;
        }
        if (this.f4657u == null || !this.f4655t || TextUtils.isEmpty(this.f4653s)) {
            return;
        }
        this.f4657u.setText(this.f4653s);
        AbstractC0528MB.m1023a(frameLayout, this.f4663x);
        this.f4657u.setVisibility(0);
        this.f4657u.bringToFront();
    }

    /* JADX INFO: renamed from: y */
    public final void m2497y(boolean z, boolean z2) {
        int defaultColor = this.f4646o0.getDefaultColor();
        int colorForState = this.f4646o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f4646o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f4614U = colorForState2;
        } else if (z2) {
            this.f4614U = colorForState;
        } else {
            this.f4614U = defaultColor;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2498z() {
        C2304o4 c2304o4;
        EditText editText;
        EditText editText2;
        if (this.f4600G == null || this.f4609P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f4625e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f4625e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f4614U = this.f4656t0;
        } else if (m2487o()) {
            if (this.f4646o0 != null) {
                m2497y(z2, z);
            } else {
                this.f4614U = getErrorCurrentTextColors();
            }
        } else if (!this.f4643n || (c2304o4 = this.f4647p) == null) {
            if (z2) {
                this.f4614U = this.f4644n0;
            } else if (z) {
                this.f4614U = this.f4642m0;
            } else {
                this.f4614U = this.f4640l0;
            }
        } else if (this.f4646o0 != null) {
            m2497y(z2, z);
        } else {
            this.f4614U = c2304o4.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2490r();
        }
        C1141ag c1141ag = this.f4621c;
        TextInputLayout textInputLayout = c1141ag.f3606a;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        TextInputLayout textInputLayout2 = c1141ag.f3606a;
        c1141ag.m2069l();
        AbstractC0295Gu.m600A(textInputLayout2, c1141ag.f3608c, c1141ag.f3609d);
        AbstractC0295Gu.m600A(textInputLayout2, checkableImageButton, c1141ag.f3616k);
        if (c1141ag.m2059b() instanceof C0494Le) {
            if (!textInputLayout.m2487o() || checkableImageButton.getDrawable() == null) {
                AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, c1141ag.f3616k, c1141ag.f3617l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C1072Yy c1072Yy = this.f4619b;
        AbstractC0295Gu.m600A(c1072Yy.f3384a, c1072Yy.f3387d, c1072Yy.f3388e);
        if (this.f4609P == 2) {
            int i = this.f4611R;
            if (z2 && isEnabled()) {
                this.f4611R = this.f4613T;
            } else {
                this.f4611R = this.f4612S;
            }
            if (this.f4611R != i && m2480g() && !this.f4660v0) {
                if (m2480g()) {
                    ((C2369pc) this.f4600G).m4797t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m2485l();
            }
        }
        if (this.f4609P == 1) {
            if (!isEnabled()) {
                this.f4615V = this.f4650q0;
            } else if (z && !z2) {
                this.f4615V = this.f4654s0;
            } else if (z2) {
                this.f4615V = this.f4652r0;
            } else {
                this.f4615V = this.f4648p0;
            }
        }
        m2476c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4619b.f3387d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f4619b.m2005b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f4621c.f3612g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f4621c.f3612g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f4621c.m2066i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4621c.f3612g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C1141ag c1141ag = this.f4621c;
        TextInputLayout textInputLayout = c1141ag.f3606a;
        CheckableImageButton checkableImageButton = c1141ag.f3612g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, c1141ag.f3616k, c1141ag.f3617l);
            AbstractC0295Gu.m600A(textInputLayout, checkableImageButton, c1141ag.f3616k);
        }
    }
}
