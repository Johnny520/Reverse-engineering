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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0187eh;
import p000.AbstractC0259gf;
import p000.AbstractC0261gh;
import p000.AbstractC0274gu;
import p000.AbstractC0387ju;
import p000.AbstractC0423kt;
import p000.AbstractC0447lg;
import p000.AbstractC0493mp;
import p000.AbstractC0498mu;
import p000.AbstractC0618q2;
import p000.AbstractC0627qb;
import p000.AbstractC0666rd;
import p000.C0009a8;
import p000.C0059b8;
import p000.C0066bf;
import p000.C0102cf;
import p000.C0122cp;
import p000.C0158dp;
import p000.C0169e;
import p000.C0189ej;
import p000.C0249g5;
import p000.C0263gj;
import p000.C0292hb;
import p000.C0311hu;
import p000.C0350iu;
import p000.C0431l0;
import p000.C0534nt;
import p000.C0624q8;
import p000.C0658r5;
import p000.C0664rb;
import p000.C0670rh;
import p000.C0672rj;
import p000.C0767u3;
import p000.C0846w7;
import p000.C0893xh;
import p000.InterfaceC0184ee;
import p000.RunnableC0325i7;
import p000.RunnableC0884x8;
import p000.aa0;
import p000.b80;
import p000.fa0;
import p000.g20;
import p000.g60;
import p000.g80;
import p000.h60;
import p000.k60;
import p000.l30;
import p000.l60;
import p000.m30;
import p000.m60;
import p000.n60;
import p000.o10;
import p000.o60;
import p000.oa0;
import p000.x90;
import p000.y40;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: B0 */
    public static final int[][] f1098B0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    public ColorStateList f1099A;

    /* JADX INFO: renamed from: A0 */
    public boolean f1100A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f1101B;

    /* JADX INFO: renamed from: C */
    public boolean f1102C;

    /* JADX INFO: renamed from: D */
    public CharSequence f1103D;

    /* JADX INFO: renamed from: E */
    public boolean f1104E;

    /* JADX INFO: renamed from: F */
    public C0350iu f1105F;

    /* JADX INFO: renamed from: G */
    public C0350iu f1106G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f1107H;

    /* JADX INFO: renamed from: I */
    public boolean f1108I;

    /* JADX INFO: renamed from: J */
    public C0350iu f1109J;

    /* JADX INFO: renamed from: K */
    public C0350iu f1110K;

    /* JADX INFO: renamed from: L */
    public m30 f1111L;

    /* JADX INFO: renamed from: M */
    public boolean f1112M;

    /* JADX INFO: renamed from: N */
    public final int f1113N;

    /* JADX INFO: renamed from: O */
    public int f1114O;

    /* JADX INFO: renamed from: P */
    public int f1115P;

    /* JADX INFO: renamed from: Q */
    public int f1116Q;

    /* JADX INFO: renamed from: R */
    public int f1117R;

    /* JADX INFO: renamed from: S */
    public int f1118S;

    /* JADX INFO: renamed from: T */
    public int f1119T;

    /* JADX INFO: renamed from: U */
    public int f1120U;

    /* JADX INFO: renamed from: V */
    public final Rect f1121V;

    /* JADX INFO: renamed from: W */
    public final Rect f1122W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f1123a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f1124a0;

    /* JADX INFO: renamed from: b */
    public final y40 f1125b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f1126b0;

    /* JADX INFO: renamed from: c */
    public final C0263gj f1127c;

    /* JADX INFO: renamed from: c0 */
    public ColorDrawable f1128c0;

    /* JADX INFO: renamed from: d */
    public EditText f1129d;

    /* JADX INFO: renamed from: d0 */
    public int f1130d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f1131e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f1132e0;

    /* JADX INFO: renamed from: f */
    public int f1133f;

    /* JADX INFO: renamed from: f0 */
    public ColorDrawable f1134f0;

    /* JADX INFO: renamed from: g */
    public int f1135g;

    /* JADX INFO: renamed from: g0 */
    public int f1136g0;

    /* JADX INFO: renamed from: h */
    public int f1137h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f1138h0;

    /* JADX INFO: renamed from: i */
    public int f1139i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f1140i0;

    /* JADX INFO: renamed from: j */
    public final C0158dp f1141j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f1142j0;

    /* JADX INFO: renamed from: k */
    public boolean f1143k;

    /* JADX INFO: renamed from: k0 */
    public int f1144k0;

    /* JADX INFO: renamed from: l */
    public int f1145l;

    /* JADX INFO: renamed from: l0 */
    public int f1146l0;

    /* JADX INFO: renamed from: m */
    public boolean f1147m;

    /* JADX INFO: renamed from: m0 */
    public int f1148m0;

    /* JADX INFO: renamed from: n */
    public l60 f1149n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f1150n0;

    /* JADX INFO: renamed from: o */
    public C0249g5 f1151o;

    /* JADX INFO: renamed from: o0 */
    public int f1152o0;

    /* JADX INFO: renamed from: p */
    public int f1153p;

    /* JADX INFO: renamed from: p0 */
    public int f1154p0;

    /* JADX INFO: renamed from: q */
    public int f1155q;

    /* JADX INFO: renamed from: q0 */
    public int f1156q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f1157r;

    /* JADX INFO: renamed from: r0 */
    public int f1158r0;

    /* JADX INFO: renamed from: s */
    public boolean f1159s;

    /* JADX INFO: renamed from: s0 */
    public int f1160s0;

    /* JADX INFO: renamed from: t */
    public C0249g5 f1161t;

    /* JADX INFO: renamed from: t0 */
    public boolean f1162t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f1163u;

    /* JADX INFO: renamed from: u0 */
    public final C0292hb f1164u0;

    /* JADX INFO: renamed from: v */
    public int f1165v;

    /* JADX INFO: renamed from: v0 */
    public boolean f1166v0;

    /* JADX INFO: renamed from: w */
    public C0672rj f1167w;

    /* JADX INFO: renamed from: w0 */
    public boolean f1168w0;

    /* JADX INFO: renamed from: x */
    public C0672rj f1169x;

    /* JADX INFO: renamed from: x0 */
    public ValueAnimator f1170x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f1171y;

    /* JADX INFO: renamed from: y0 */
    public boolean f1172y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1173z;

    /* JADX INFO: renamed from: z0 */
    public boolean f1174z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout), attributeSet, com.ljx.wechatmod.R.attr.textInputStyle);
        this.f1133f = -1;
        this.f1135g = -1;
        this.f1137h = -1;
        this.f1139i = -1;
        this.f1141j = new C0158dp(this);
        this.f1149n = new C0664rb(2);
        this.f1121V = new Rect();
        this.f1122W = new Rect();
        this.f1124a0 = new RectF();
        this.f1132e0 = new LinkedHashSet();
        C0292hb c0292hb = new C0292hb(this);
        this.f1164u0 = c0292hb;
        this.f1100A0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1123a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0618q2.f3770a;
        c0292hb.f2172Q = linearInterpolator;
        c0292hb.m1379h(false);
        c0292hb.f2171P = linearInterpolator;
        c0292hb.m1379h(false);
        if (c0292hb.f2194g != 8388659) {
            c0292hb.f2194g = 8388659;
            c0292hb.m1379h(false);
        }
        g80.m1188c(context2, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC0168dz.f1436A;
        g80.m1190e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        C0658r5 c0658r5 = new C0658r5(context2, typedArrayObtainStyledAttributes);
        y40 y40Var = new y40(this, c0658r5);
        this.f1125b = y40Var;
        this.f1102C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f1168w0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f1166v0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f1111L = m30.m1799b(context2, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout).m1731a();
        this.f1113N = context2.getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1115P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1117R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1118S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1116Q = this.f1117R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        l30 l30VarM1802e = this.f1111L.m1802e();
        if (dimension >= 0.0f) {
            l30VarM1802e.f2908e = new C0169e(dimension);
        }
        if (dimension2 >= 0.0f) {
            l30VarM1802e.f2909f = new C0169e(dimension2);
        }
        if (dimension3 >= 0.0f) {
            l30VarM1802e.f2910g = new C0169e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            l30VarM1802e.f2911h = new C0169e(dimension4);
        }
        this.f1111L = l30VarM1802e.m1731a();
        ColorStateList colorStateListM1314h = AbstractC0274gu.m1314h(context2, c0658r5, 7);
        if (colorStateListM1314h != null) {
            int defaultColor = colorStateListM1314h.getDefaultColor();
            this.f1152o0 = defaultColor;
            this.f1120U = defaultColor;
            if (colorStateListM1314h.isStateful()) {
                this.f1154p0 = colorStateListM1314h.getColorForState(new int[]{-16842910}, -1);
                this.f1156q0 = colorStateListM1314h.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1158r0 = colorStateListM1314h.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1156q0 = this.f1152o0;
                ColorStateList colorStateListM1864n = AbstractC0493mp.m1864n(context2, com.ljx.wechatmod.R.color.mtrl_filled_background_color);
                this.f1154p0 = colorStateListM1864n.getColorForState(new int[]{-16842910}, -1);
                this.f1158r0 = colorStateListM1864n.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1120U = 0;
            this.f1152o0 = 0;
            this.f1154p0 = 0;
            this.f1156q0 = 0;
            this.f1158r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM2240l = c0658r5.m2240l(1);
            this.f1142j0 = colorStateListM2240l;
            this.f1140i0 = colorStateListM2240l;
        }
        ColorStateList colorStateListM1314h2 = AbstractC0274gu.m1314h(context2, c0658r5, 14);
        this.f1148m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f1144k0 = AbstractC0666rd.m2288a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1160s0 = AbstractC0666rd.m2288a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_disabled_color);
        this.f1146l0 = AbstractC0666rd.m2288a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM1314h2 != null) {
            setBoxStrokeColorStateList(colorStateListM1314h2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0274gu.m1314h(context2, c0658r5, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1099A = c0658r5.m2240l(24);
        this.f1101B = c0658r5.m2240l(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f1155q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f1153p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1153p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1155q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0658r5.m2240l(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0658r5.m2240l(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0658r5.m2240l(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0658r5.m2240l(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0658r5.m2240l(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0658r5.m2240l(58));
        }
        C0263gj c0263gj = new C0263gj(this, c0658r5);
        this.f1127c = c0263gj;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0658r5.m2252z();
        x90.m2671s(this, 2);
        fa0.m1086l(this, 1);
        frameLayout.addView(y40Var);
        frameLayout.addView(c0263gj);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1129d;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f1105F;
        }
        int iM1198m = g80.m1198m(this.f1129d, com.ljx.wechatmod.R.attr.colorControlHighlight);
        int i = this.f1114O;
        int[][] iArr = f1098B0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0350iu c0350iu = this.f1105F;
            int i2 = this.f1120U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g80.m1207v(0.1f, iM1198m, i2), i2}), c0350iu, c0350iu);
        }
        Context context = getContext();
        C0350iu c0350iu2 = this.f1105F;
        TypedValue typedValueM1838L = AbstractC0493mp.m1838L(context, com.ljx.wechatmod.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM1838L.resourceId;
        int iM2288a = i3 != 0 ? AbstractC0666rd.m2288a(context, i3) : typedValueM1838L.data;
        C0350iu c0350iu3 = new C0350iu(c0350iu2.f2585a.f2266a);
        int iM1207v = g80.m1207v(0.1f, iM1198m, iM2288a);
        c0350iu3.m1537j(new ColorStateList(iArr, new int[]{iM1207v, 0}));
        c0350iu3.setTint(iM2288a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM1207v, iM2288a});
        C0350iu c0350iu4 = new C0350iu(c0350iu2.f2585a.f2266a);
        c0350iu4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0350iu3, c0350iu4), c0350iu2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1107H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1107H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1107H.addState(new int[0], m731f(false));
        }
        return this.f1107H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1106G == null) {
            this.f1106G = m731f(true);
        }
        return this.f1106G;
    }

    /* JADX INFO: renamed from: k */
    public static void m725k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m725k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1129d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1129d = editText;
        int i = this.f1133f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f1137h);
        }
        int i2 = this.f1135g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f1139i);
        }
        this.f1108I = false;
        m734i();
        setTextInputAccessibilityDelegate(new k60(this));
        Typeface typeface = this.f1129d.getTypeface();
        C0292hb c0292hb = this.f1164u0;
        c0292hb.m1384m(typeface);
        float textSize = this.f1129d.getTextSize();
        if (c0292hb.f2195h != textSize) {
            c0292hb.f2195h = textSize;
            c0292hb.m1379h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f1129d.getLetterSpacing();
        if (c0292hb.f2178W != letterSpacing) {
            c0292hb.f2178W = letterSpacing;
            c0292hb.m1379h(false);
        }
        int gravity = this.f1129d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0292hb.f2194g != i4) {
            c0292hb.f2194g = i4;
            c0292hb.m1379h(false);
        }
        if (c0292hb.f2192f != gravity) {
            c0292hb.f2192f = gravity;
            c0292hb.m1379h(false);
        }
        this.f1129d.addTextChangedListener(new g20(this, 1));
        if (this.f1140i0 == null) {
            this.f1140i0 = this.f1129d.getHintTextColors();
        }
        if (this.f1102C) {
            if (TextUtils.isEmpty(this.f1103D)) {
                CharSequence hint = this.f1129d.getHint();
                this.f1131e = hint;
                setHint(hint);
                this.f1129d.setHint((CharSequence) null);
            }
            this.f1104E = true;
        }
        if (i3 >= 29) {
            m740p();
        }
        if (this.f1151o != null) {
            m738n(this.f1129d.getText());
        }
        m742r();
        this.f1141j.m932b();
        this.f1125b.bringToFront();
        C0263gj c0263gj = this.f1127c;
        c0263gj.bringToFront();
        Iterator it = this.f1132e0.iterator();
        while (it.hasNext()) {
            ((C0189ej) it.next()).m998a(this);
        }
        c0263gj.m1295m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m745u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1103D)) {
            return;
        }
        this.f1103D = charSequence;
        C0292hb c0292hb = this.f1164u0;
        if (charSequence == null || !TextUtils.equals(c0292hb.f2156A, charSequence)) {
            c0292hb.f2156A = charSequence;
            c0292hb.f2157B = null;
            Bitmap bitmap = c0292hb.f2160E;
            if (bitmap != null) {
                bitmap.recycle();
                c0292hb.f2160E = null;
            }
            c0292hb.m1379h(false);
        }
        if (this.f1162t0) {
            return;
        }
        m735j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f1159s == z) {
            return;
        }
        if (z) {
            C0249g5 c0249g5 = this.f1161t;
            if (c0249g5 != null) {
                this.f1123a.addView(c0249g5);
                this.f1161t.setVisibility(0);
            }
        } else {
            C0249g5 c0249g52 = this.f1161t;
            if (c0249g52 != null) {
                c0249g52.setVisibility(8);
            }
            this.f1161t = null;
        }
        this.f1159s = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m726a(float f) {
        C0292hb c0292hb = this.f1164u0;
        if (c0292hb.f2184b == f) {
            return;
        }
        int i = 2;
        if (this.f1170x0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1170x0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0274gu.m1303F(getContext(), com.ljx.wechatmod.R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3771b));
            this.f1170x0.setDuration(AbstractC0274gu.m1302E(getContext(), com.ljx.wechatmod.R.attr.motionDurationMedium4, 167));
            this.f1170x0.addUpdateListener(new C0009a8(i, this));
        }
        this.f1170x0.setFloatValues(c0292hb.f2184b, f);
        this.f1170x0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1123a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m744t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m727b() {
        int i;
        int i2;
        C0350iu c0350iu = this.f1105F;
        if (c0350iu == null) {
            return;
        }
        m30 m30Var = c0350iu.f2585a.f2266a;
        m30 m30Var2 = this.f1111L;
        if (m30Var != m30Var2) {
            c0350iu.setShapeAppearanceModel(m30Var2);
        }
        if (this.f1114O == 2 && (i = this.f1116Q) > -1 && (i2 = this.f1119T) != 0) {
            C0350iu c0350iu2 = this.f1105F;
            c0350iu2.f2585a.f2275j = i;
            c0350iu2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0311hu c0311hu = c0350iu2.f2585a;
            if (c0311hu.f2269d != colorStateListValueOf) {
                c0311hu.f2269d = colorStateListValueOf;
                c0350iu2.onStateChange(c0350iu2.getState());
            }
        }
        int iM2142b = this.f1120U;
        if (this.f1114O == 1) {
            iM2142b = AbstractC0627qb.m2142b(this.f1120U, g80.m1197l(getContext(), com.ljx.wechatmod.R.attr.colorSurface, 0));
        }
        this.f1120U = iM2142b;
        this.f1105F.m1537j(ColorStateList.valueOf(iM2142b));
        C0350iu c0350iu3 = this.f1109J;
        if (c0350iu3 != null && this.f1110K != null) {
            if (this.f1116Q > -1 && this.f1119T != 0) {
                c0350iu3.m1537j(this.f1129d.isFocused() ? ColorStateList.valueOf(this.f1144k0) : ColorStateList.valueOf(this.f1119T));
                this.f1110K.m1537j(ColorStateList.valueOf(this.f1119T));
            }
            invalidate();
        }
        m743s();
    }

    /* JADX INFO: renamed from: c */
    public final int m728c() {
        float fM1376d;
        if (!this.f1102C) {
            return 0;
        }
        int i = this.f1114O;
        C0292hb c0292hb = this.f1164u0;
        if (i == 0) {
            fM1376d = c0292hb.m1376d();
        } else {
            if (i != 2) {
                return 0;
            }
            fM1376d = c0292hb.m1376d() / 2.0f;
        }
        return (int) fM1376d;
    }

    /* JADX INFO: renamed from: d */
    public final C0672rj m729d() {
        C0672rj c0672rj = new C0672rj();
        c0672rj.f5205c = AbstractC0274gu.m1302E(getContext(), com.ljx.wechatmod.R.attr.motionDurationShort2, 87);
        c0672rj.f5206d = AbstractC0274gu.m1303F(getContext(), com.ljx.wechatmod.R.attr.motionEasingLinearInterpolator, AbstractC0618q2.f3770a);
        return c0672rj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1129d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1131e != null) {
            boolean z = this.f1104E;
            this.f1104E = false;
            CharSequence hint = editText.getHint();
            this.f1129d.setHint(this.f1131e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1129d.setHint(hint);
                this.f1104E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1123a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f1129d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1174z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1174z0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0350iu c0350iu;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f1102C;
        C0292hb c0292hb = this.f1164u0;
        if (z) {
            TextPaint textPaint = c0292hb.f2169N;
            RectF rectF = c0292hb.f2190e;
            int iSave = canvas2.save();
            if (c0292hb.f2157B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c0292hb.f2162G);
                float f = c0292hb.f2203p;
                float f2 = c0292hb.f2204q;
                float f3 = c0292hb.f2161F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (c0292hb.f2189d0 <= 1 || c0292hb.f2158C) {
                    canvas2.translate(f, f2);
                    c0292hb.f2180Y.draw(canvas2);
                } else {
                    float lineStart = c0292hb.f2203p - c0292hb.f2180Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c0292hb.f2185b0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c0292hb.f2163H;
                        float f6 = c0292hb.f2164I;
                        float f7 = c0292hb.f2165J;
                        int i2 = c0292hb.f2166K;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC0627qb.m2144d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c0292hb.f2180Y.draw(canvas2);
                    textPaint.setAlpha((int) (c0292hb.f2183a0 * f4));
                    if (i >= 31) {
                        float f8 = c0292hb.f2163H;
                        float f9 = c0292hb.f2164I;
                        float f10 = c0292hb.f2165J;
                        int i3 = c0292hb.f2166K;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC0627qb.m2144d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c0292hb.f2180Y.getLineBaseline(0);
                    CharSequence charSequence = c0292hb.f2187c0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c0292hb.f2163H, c0292hb.f2164I, c0292hb.f2165J, c0292hb.f2166K);
                    }
                    String strTrim = c0292hb.f2187c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c0292hb.f2180Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f1110K == null || (c0350iu = this.f1109J) == null) {
            return;
        }
        c0350iu.draw(canvas2);
        if (this.f1129d.isFocused()) {
            Rect bounds = this.f1110K.getBounds();
            Rect bounds2 = this.f1109J.getBounds();
            float f12 = c0292hb.f2184b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0618q2.m2110c(f12, iCenterX, bounds2.left);
            bounds.right = AbstractC0618q2.m2110c(f12, iCenterX, bounds2.right);
            this.f1110K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f1172y0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f1172y0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            hb r3 = r4.f1164u0
            if (r3 == 0) goto L2f
            r3.f2167L = r1
            android.content.res.ColorStateList r1 = r3.f2198k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f2197j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m1379h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f1129d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p000.oa0.f3426a
            boolean r3 = p000.aa0.m40c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m745u(r0, r2)
        L47:
            r4.m742r()
            r4.m748x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f1172y0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m730e() {
        return this.f1102C && !TextUtils.isEmpty(this.f1103D) && (this.f1105F instanceof C0102cf);
    }

    /* JADX INFO: renamed from: f */
    public final C0350iu m731f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1129d;
        float popupElevation = editText instanceof C0534nt ? ((C0534nt) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        o10 o10Var = new o10();
        o10 o10Var2 = new o10();
        o10 o10Var3 = new o10();
        o10 o10Var4 = new o10();
        int i = 0;
        C0893xh c0893xh = new C0893xh(i);
        C0893xh c0893xh2 = new C0893xh(i);
        C0893xh c0893xh3 = new C0893xh(i);
        C0893xh c0893xh4 = new C0893xh(i);
        C0169e c0169e = new C0169e(f);
        C0169e c0169e2 = new C0169e(f);
        C0169e c0169e3 = new C0169e(dimensionPixelOffset);
        C0169e c0169e4 = new C0169e(dimensionPixelOffset);
        m30 m30Var = new m30();
        m30Var.f3061a = o10Var;
        m30Var.f3062b = o10Var2;
        m30Var.f3063c = o10Var3;
        m30Var.f3064d = o10Var4;
        m30Var.f3065e = c0169e;
        m30Var.f3066f = c0169e2;
        m30Var.f3067g = c0169e4;
        m30Var.f3068h = c0169e3;
        m30Var.f3069i = c0893xh;
        m30Var.f3070j = c0893xh2;
        m30Var.f3071k = c0893xh3;
        m30Var.f3072l = c0893xh4;
        EditText editText2 = this.f1129d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0534nt ? ((C0534nt) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0350iu.f2584w;
            TypedValue typedValueM1838L = AbstractC0493mp.m1838L(context, com.ljx.wechatmod.R.attr.colorSurface, C0350iu.class.getSimpleName());
            int i2 = typedValueM1838L.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? AbstractC0666rd.m2288a(context, i2) : typedValueM1838L.data);
        }
        C0350iu c0350iu = new C0350iu();
        c0350iu.m1535h(context);
        c0350iu.m1537j(dropDownBackgroundTintList);
        c0350iu.m1536i(popupElevation);
        c0350iu.setShapeAppearanceModel(m30Var);
        C0311hu c0311hu = c0350iu.f2585a;
        if (c0311hu.f2272g == null) {
            c0311hu.f2272g = new Rect();
        }
        c0350iu.f2585a.f2272g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0350iu.invalidateSelf();
        return c0350iu;
    }

    /* JADX INFO: renamed from: g */
    public final int m732g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f1129d.getCompoundPaddingLeft() : this.f1127c.m1285c() : this.f1125b.m2723a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1129d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m728c() + getPaddingTop() + editText.getBaseline();
    }

    public C0350iu getBoxBackground() {
        int i = this.f1114O;
        if (i == 1 || i == 2) {
            return this.f1105F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1120U;
    }

    public int getBoxBackgroundMode() {
        return this.f1114O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1115P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM1899t = AbstractC0498mu.m1899t(this);
        RectF rectF = this.f1124a0;
        return zM1899t ? this.f1111L.f3068h.mo943a(rectF) : this.f1111L.f3067g.mo943a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM1899t = AbstractC0498mu.m1899t(this);
        RectF rectF = this.f1124a0;
        return zM1899t ? this.f1111L.f3067g.mo943a(rectF) : this.f1111L.f3068h.mo943a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM1899t = AbstractC0498mu.m1899t(this);
        RectF rectF = this.f1124a0;
        return zM1899t ? this.f1111L.f3065e.mo943a(rectF) : this.f1111L.f3066f.mo943a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM1899t = AbstractC0498mu.m1899t(this);
        RectF rectF = this.f1124a0;
        return zM1899t ? this.f1111L.f3066f.mo943a(rectF) : this.f1111L.f3065e.mo943a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1148m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1150n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1117R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1118S;
    }

    public int getCounterMaxLength() {
        return this.f1145l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0249g5 c0249g5;
        if (this.f1143k && this.f1147m && (c0249g5 = this.f1151o) != null) {
            return c0249g5.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1173z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1171y;
    }

    public ColorStateList getCursorColor() {
        return this.f1099A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1101B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1140i0;
    }

    public EditText getEditText() {
        return this.f1129d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1127c.f2003g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1127c.f2003g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1127c.f2009m;
    }

    public int getEndIconMode() {
        return this.f1127c.f2005i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1127c.f2010n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1127c.f2003g;
    }

    public CharSequence getError() {
        C0158dp c0158dp = this.f1141j;
        if (c0158dp.f1418q) {
            return c0158dp.f1417p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1141j.f1421t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1141j.f1420s;
    }

    public int getErrorCurrentTextColors() {
        C0249g5 c0249g5 = this.f1141j.f1419r;
        if (c0249g5 != null) {
            return c0249g5.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1127c.f1999c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0158dp c0158dp = this.f1141j;
        if (c0158dp.f1425x) {
            return c0158dp.f1424w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0249g5 c0249g5 = this.f1141j.f1426y;
        if (c0249g5 != null) {
            return c0249g5.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1102C) {
            return this.f1103D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1164u0.m1376d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0292hb c0292hb = this.f1164u0;
        return c0292hb.m1377e(c0292hb.f2198k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1142j0;
    }

    public l60 getLengthCounter() {
        return this.f1149n;
    }

    public int getMaxEms() {
        return this.f1135g;
    }

    public int getMaxWidth() {
        return this.f1139i;
    }

    public int getMinEms() {
        return this.f1133f;
    }

    public int getMinWidth() {
        return this.f1137h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1127c.f2003g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1127c.f2003g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1159s) {
            return this.f1157r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1165v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1163u;
    }

    public CharSequence getPrefixText() {
        return this.f1125b.f5347c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1125b.f5346b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1125b.f5346b;
    }

    public m30 getShapeAppearanceModel() {
        return this.f1111L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1125b.f5348d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1125b.f5348d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1125b.f5351g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1125b.f5352h;
    }

    public CharSequence getSuffixText() {
        return this.f1127c.f2012p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1127c.f2013q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1127c.f2013q;
    }

    public Typeface getTypeface() {
        return this.f1126b0;
    }

    /* JADX INFO: renamed from: h */
    public final int m733h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f1129d.getCompoundPaddingRight() : this.f1125b.m2723a() : this.f1127c.m1285c());
    }

    /* JADX INFO: renamed from: i */
    public final void m734i() {
        int i = this.f1114O;
        if (i == 0) {
            this.f1105F = null;
            this.f1109J = null;
            this.f1110K = null;
        } else if (i == 1) {
            this.f1105F = new C0350iu(this.f1111L);
            this.f1109J = new C0350iu();
            this.f1110K = new C0350iu();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1114O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1102C || (this.f1105F instanceof C0102cf)) {
                this.f1105F = new C0350iu(this.f1111L);
            } else {
                m30 m30Var = this.f1111L;
                int i2 = C0102cf.f892y;
                if (m30Var == null) {
                    m30Var = new m30();
                }
                C0066bf c0066bf = new C0066bf(m30Var, new RectF());
                C0102cf c0102cf = new C0102cf(c0066bf);
                c0102cf.f893x = c0066bf;
                this.f1105F = c0102cf;
            }
            this.f1109J = null;
            this.f1110K = null;
        }
        m743s();
        m748x();
        if (this.f1114O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1115P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0274gu.m1321x(getContext())) {
                this.f1115P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f1129d != null && this.f1114O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f1129d;
                WeakHashMap weakHashMap = oa0.f3426a;
                y90.m2739k(editText, y90.m2734f(editText), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_top), y90.m2733e(this.f1129d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0274gu.m1321x(getContext())) {
                EditText editText2 = this.f1129d;
                WeakHashMap weakHashMap2 = oa0.f3426a;
                y90.m2739k(editText2, y90.m2734f(editText2), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_top), y90.m2733e(this.f1129d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1114O != 0) {
            m744t();
        }
        EditText editText3 = this.f1129d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1114O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m735j() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m735j():void");
    }

    /* JADX INFO: renamed from: l */
    public final void m736l(C0249g5 c0249g5, int i) {
        try {
            c0249g5.setTextAppearance(i);
            if (c0249g5.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0249g5.setTextAppearance(com.ljx.wechatmod.R.style.TextAppearance_AppCompat_Caption);
        c0249g5.setTextColor(AbstractC0666rd.m2288a(getContext(), com.ljx.wechatmod.R.color.design_error));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m737m() {
        C0158dp c0158dp = this.f1141j;
        return (c0158dp.f1416o != 1 || c0158dp.f1419r == null || TextUtils.isEmpty(c0158dp.f1417p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m738n(Editable editable) {
        ((C0664rb) this.f1149n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f1147m;
        int i = this.f1145l;
        if (i == -1) {
            this.f1151o.setText(String.valueOf(length));
            this.f1151o.setContentDescription(null);
            this.f1147m = false;
        } else {
            this.f1147m = length > i;
            Context context = getContext();
            this.f1151o.setContentDescription(context.getString(this.f1147m ? com.ljx.wechatmod.R.string.character_counter_overflowed_content_description : com.ljx.wechatmod.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1145l)));
            if (z != this.f1147m) {
                m739o();
            }
            String str = C0846w7.f5067b;
            Locale locale = Locale.getDefault();
            int i2 = o60.f3407a;
            C0846w7 c0846w7 = n60.m1927a(locale) == 1 ? C0846w7.f5070e : C0846w7.f5069d;
            C0249g5 c0249g5 = this.f1151o;
            String string = getContext().getString(com.ljx.wechatmod.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1145l));
            c0846w7.getClass();
            C0059b8 c0059b8 = h60.f2117a;
            c0249g5.setText(string != null ? c0846w7.m2601c(string).toString() : null);
        }
        if (this.f1129d == null || z == this.f1147m) {
            return;
        }
        m745u(false, false);
        m748x();
        m742r();
    }

    /* JADX INFO: renamed from: o */
    public final void m739o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0249g5 c0249g5 = this.f1151o;
        if (c0249g5 != null) {
            m736l(c0249g5, this.f1147m ? this.f1153p : this.f1155q);
            if (!this.f1147m && (colorStateList2 = this.f1171y) != null) {
                this.f1151o.setTextColor(colorStateList2);
            }
            if (!this.f1147m || (colorStateList = this.f1173z) == null) {
                return;
            }
            this.f1151o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1164u0.m1378g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0263gj c0263gj = this.f1127c;
        c0263gj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f1100A0 = false;
        if (this.f1129d != null && this.f1129d.getMeasuredHeight() < (iMax = Math.max(c0263gj.getMeasuredHeight(), this.f1125b.getMeasuredHeight()))) {
            this.f1129d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM741q = m741q();
        if (z || zM741q) {
            this.f1129d.post(new RunnableC0884x8(13, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f1129d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0447lg.f3001a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1121V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0447lg.f3001a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0447lg.m1765a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0447lg.f3002b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0350iu c0350iu = this.f1109J;
            if (c0350iu != null) {
                int i5 = rect.bottom;
                c0350iu.setBounds(rect.left, i5 - this.f1117R, rect.right, i5);
            }
            C0350iu c0350iu2 = this.f1110K;
            if (c0350iu2 != null) {
                int i6 = rect.bottom;
                c0350iu2.setBounds(rect.left, i6 - this.f1118S, rect.right, i6);
            }
            if (this.f1102C) {
                float textSize = this.f1129d.getTextSize();
                C0292hb c0292hb = this.f1164u0;
                if (c0292hb.f2195h != textSize) {
                    c0292hb.f2195h = textSize;
                    c0292hb.m1379h(false);
                }
                int gravity = this.f1129d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0292hb.f2194g != i7) {
                    c0292hb.f2194g = i7;
                    c0292hb.m1379h(false);
                }
                if (c0292hb.f2192f != gravity) {
                    c0292hb.f2192f = gravity;
                    c0292hb.m1379h(false);
                }
                if (this.f1129d == null) {
                    throw new IllegalStateException();
                }
                boolean zM1899t = AbstractC0498mu.m1899t(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1122W;
                rect2.bottom = i8;
                int i9 = this.f1114O;
                if (i9 == 1) {
                    rect2.left = m732g(rect.left, zM1899t);
                    rect2.top = rect.top + this.f1115P;
                    rect2.right = m733h(rect.right, zM1899t);
                } else if (i9 != 2) {
                    rect2.left = m732g(rect.left, zM1899t);
                    rect2.top = getPaddingTop();
                    rect2.right = m733h(rect.right, zM1899t);
                } else {
                    rect2.left = this.f1129d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m728c();
                    rect2.right = rect.right - this.f1129d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0292hb.f2188d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0292hb.f2168M = true;
                }
                if (this.f1129d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0292hb.f2170O;
                textPaint.setTextSize(c0292hb.f2195h);
                textPaint.setTypeface(c0292hb.f2208u);
                textPaint.setLetterSpacing(c0292hb.f2178W);
                float f = -textPaint.ascent();
                rect2.left = this.f1129d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1114O != 1 || this.f1129d.getMinLines() > 1) ? rect.top + this.f1129d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f1129d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1114O != 1 || this.f1129d.getMinLines() > 1) ? rect.bottom - this.f1129d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0292hb.f2186c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0292hb.f2168M = true;
                }
                c0292hb.m1379h(false);
                if (!m730e() || this.f1162t0) {
                    return;
                }
                m735j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f1100A0;
        C0263gj c0263gj = this.f1127c;
        if (!z) {
            c0263gj.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1100A0 = true;
        }
        if (this.f1161t != null && (editText = this.f1129d) != null) {
            this.f1161t.setGravity(editText.getGravity());
            this.f1161t.setPadding(this.f1129d.getCompoundPaddingLeft(), this.f1129d.getCompoundPaddingTop(), this.f1129d.getCompoundPaddingRight(), this.f1129d.getCompoundPaddingBottom());
        }
        c0263gj.m1295m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m60)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m60 m60Var = (m60) parcelable;
        super.onRestoreInstanceState(m60Var.f1274a);
        setError(m60Var.f3081c);
        if (m60Var.f3082d) {
            post(new RunnableC0325i7(10, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f1112M) {
            InterfaceC0184ee interfaceC0184ee = this.f1111L.f3065e;
            RectF rectF = this.f1124a0;
            float fMo943a = interfaceC0184ee.mo943a(rectF);
            float fMo943a2 = this.f1111L.f3066f.mo943a(rectF);
            float fMo943a3 = this.f1111L.f3068h.mo943a(rectF);
            float fMo943a4 = this.f1111L.f3067g.mo943a(rectF);
            m30 m30Var = this.f1111L;
            AbstractC0259gf abstractC0259gf = m30Var.f3061a;
            AbstractC0259gf abstractC0259gf2 = m30Var.f3062b;
            AbstractC0259gf abstractC0259gf3 = m30Var.f3064d;
            AbstractC0259gf abstractC0259gf4 = m30Var.f3063c;
            C0893xh c0893xh = new C0893xh(0);
            C0893xh c0893xh2 = new C0893xh(0);
            C0893xh c0893xh3 = new C0893xh(0);
            C0893xh c0893xh4 = new C0893xh(0);
            C0169e c0169e = new C0169e(fMo943a2);
            C0169e c0169e2 = new C0169e(fMo943a);
            C0169e c0169e3 = new C0169e(fMo943a4);
            C0169e c0169e4 = new C0169e(fMo943a3);
            m30 m30Var2 = new m30();
            m30Var2.f3061a = abstractC0259gf2;
            m30Var2.f3062b = abstractC0259gf;
            m30Var2.f3063c = abstractC0259gf3;
            m30Var2.f3064d = abstractC0259gf4;
            m30Var2.f3065e = c0169e;
            m30Var2.f3066f = c0169e2;
            m30Var2.f3067g = c0169e4;
            m30Var2.f3068h = c0169e3;
            m30Var2.f3069i = c0893xh;
            m30Var2.f3070j = c0893xh2;
            m30Var2.f3071k = c0893xh3;
            m30Var2.f3072l = c0893xh4;
            this.f1112M = z;
            setShapeAppearanceModel(m30Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m60 m60Var = new m60(super.onSaveInstanceState());
        if (m737m()) {
            m60Var.f3081c = getError();
        }
        C0263gj c0263gj = this.f1127c;
        m60Var.f3082d = c0263gj.f2005i != 0 && c0263gj.f2003g.f1054d;
        return m60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m740p() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f1099A
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968800(0x7f0400e0, float:1.7546264E38)
            android.util.TypedValue r1 = p000.AbstractC0493mp.m1836J(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = p000.AbstractC0493mp.m1864n(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f1129d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = p000.AbstractC0207f0.m1045e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f1129d
            android.graphics.drawable.Drawable r1 = p000.AbstractC0207f0.m1045e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m737m()
            if (r2 != 0) goto L49
            g5 r2 = r4.f1151o
            if (r2 == 0) goto L4e
            boolean r2 = r4.f1147m
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f1101B
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            p000.AbstractC0187eh.m995h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m740p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m741q() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m741q():boolean");
    }

    /* JADX INFO: renamed from: r */
    public final void m742r() {
        Drawable background;
        C0249g5 c0249g5;
        EditText editText = this.f1129d;
        if (editText == null || this.f1114O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0261gh.f1985a;
        Drawable drawableMutate = background.mutate();
        if (m737m()) {
            drawableMutate.setColorFilter(C0767u3.m2426c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1147m && (c0249g5 = this.f1151o) != null) {
            drawableMutate.setColorFilter(C0767u3.m2426c(c0249g5.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f1129d.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m743s() {
        EditText editText = this.f1129d;
        if (editText == null || this.f1105F == null) {
            return;
        }
        if ((this.f1108I || editText.getBackground() == null) && this.f1114O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f1129d;
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2669q(editText2, editTextBoxBackground);
            this.f1108I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1120U != i) {
            this.f1120U = i;
            this.f1152o0 = i;
            this.f1156q0 = i;
            this.f1158r0 = i;
            m727b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0666rd.m2288a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1152o0 = defaultColor;
        this.f1120U = defaultColor;
        this.f1154p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1156q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1158r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m727b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1114O) {
            return;
        }
        this.f1114O = i;
        if (this.f1129d != null) {
            m734i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1115P = i;
    }

    public void setBoxCornerFamily(int i) {
        l30 l30VarM1802e = this.f1111L.m1802e();
        InterfaceC0184ee interfaceC0184ee = this.f1111L.f3065e;
        l30VarM1802e.f2904a = AbstractC0387ju.m1621f(i);
        l30VarM1802e.f2908e = interfaceC0184ee;
        InterfaceC0184ee interfaceC0184ee2 = this.f1111L.f3066f;
        l30VarM1802e.f2905b = AbstractC0387ju.m1621f(i);
        l30VarM1802e.f2909f = interfaceC0184ee2;
        InterfaceC0184ee interfaceC0184ee3 = this.f1111L.f3068h;
        l30VarM1802e.f2907d = AbstractC0387ju.m1621f(i);
        l30VarM1802e.f2911h = interfaceC0184ee3;
        InterfaceC0184ee interfaceC0184ee4 = this.f1111L.f3067g;
        l30VarM1802e.f2906c = AbstractC0387ju.m1621f(i);
        l30VarM1802e.f2910g = interfaceC0184ee4;
        this.f1111L = l30VarM1802e.m1731a();
        m727b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1148m0 != i) {
            this.f1148m0 = i;
            m748x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1144k0 = colorStateList.getDefaultColor();
            this.f1160s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1146l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1148m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1148m0 != colorStateList.getDefaultColor()) {
            this.f1148m0 = colorStateList.getDefaultColor();
        }
        m748x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1150n0 != colorStateList) {
            this.f1150n0 = colorStateList;
            m748x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1117R = i;
        m748x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1118S = i;
        m748x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f1143k != z) {
            C0158dp c0158dp = this.f1141j;
            if (z) {
                C0249g5 c0249g5 = new C0249g5(getContext(), null);
                this.f1151o = c0249g5;
                c0249g5.setId(com.ljx.wechatmod.R.id.textinput_counter);
                Typeface typeface = this.f1126b0;
                if (typeface != null) {
                    this.f1151o.setTypeface(typeface);
                }
                this.f1151o.setMaxLines(1);
                c0158dp.m931a(this.f1151o, 2);
                AbstractC0423kt.m1715h((ViewGroup.MarginLayoutParams) this.f1151o.getLayoutParams(), getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_counter_margin_start));
                m739o();
                if (this.f1151o != null) {
                    EditText editText = this.f1129d;
                    m738n(editText != null ? editText.getText() : null);
                }
            } else {
                c0158dp.m937g(this.f1151o, 2);
                this.f1151o = null;
            }
            this.f1143k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1145l != i) {
            if (i > 0) {
                this.f1145l = i;
            } else {
                this.f1145l = -1;
            }
            if (!this.f1143k || this.f1151o == null) {
                return;
            }
            EditText editText = this.f1129d;
            m738n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1153p != i) {
            this.f1153p = i;
            m739o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1173z != colorStateList) {
            this.f1173z = colorStateList;
            m739o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1155q != i) {
            this.f1155q = i;
            m739o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1171y != colorStateList) {
            this.f1171y = colorStateList;
            m739o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1099A != colorStateList) {
            this.f1099A = colorStateList;
            m740p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1101B != colorStateList) {
            this.f1101B = colorStateList;
            if (m737m() || (this.f1151o != null && this.f1147m)) {
                m740p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1140i0 = colorStateList;
        this.f1142j0 = colorStateList;
        if (this.f1129d != null) {
            m745u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m725k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f1127c.f2003g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f1127c.f2003g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0263gj c0263gj = this.f1127c;
        CharSequence text = i != 0 ? c0263gj.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0263gj c0263gj = this.f1127c;
        Drawable drawableM1261w = i != 0 ? AbstractC0259gf.m1261w(c0263gj.getContext(), i) : null;
        TextInputLayout textInputLayout = c0263gj.f1997a;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        checkableImageButton.setImageDrawable(drawableM1261w);
        if (drawableM1261w != null) {
            AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, c0263gj.f2007k, c0263gj.f2008l);
            AbstractC0259gf.m1233Q(textInputLayout, checkableImageButton, c0263gj.f2007k);
        }
    }

    public void setEndIconMinSize(int i) {
        C0263gj c0263gj = this.f1127c;
        if (i < 0) {
            c0263gj.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0263gj.f2009m) {
            c0263gj.f2009m = i;
            CheckableImageButton checkableImageButton = c0263gj.f2003g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0263gj.f1999c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1127c.m1289g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0263gj c0263gj = this.f1127c;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        View.OnLongClickListener onLongClickListener = c0263gj.f2011o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2011o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2010n = scaleType;
        c0263gj.f2003g.setScaleType(scaleType);
        c0263gj.f1999c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0263gj c0263gj = this.f1127c;
        if (c0263gj.f2007k != colorStateList) {
            c0263gj.f2007k = colorStateList;
            AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f2003g, colorStateList, c0263gj.f2008l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0263gj c0263gj = this.f1127c;
        if (c0263gj.f2008l != mode) {
            c0263gj.f2008l = mode;
            AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f2003g, c0263gj.f2007k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f1127c.m1290h(z);
    }

    public void setError(CharSequence charSequence) {
        C0158dp c0158dp = this.f1141j;
        if (!c0158dp.f1418q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0158dp.m936f();
            return;
        }
        c0158dp.m933c();
        c0158dp.f1417p = charSequence;
        c0158dp.f1419r.setText(charSequence);
        int i = c0158dp.f1415n;
        if (i != 1) {
            c0158dp.f1416o = 1;
        }
        c0158dp.m939i(i, c0158dp.f1416o, c0158dp.m938h(c0158dp.f1419r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1421t = i;
        C0249g5 c0249g5 = c0158dp.f1419r;
        if (c0249g5 != null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            aa0.m43f(c0249g5, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1420s = charSequence;
        C0249g5 c0249g5 = c0158dp.f1419r;
        if (c0249g5 != null) {
            c0249g5.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0158dp c0158dp = this.f1141j;
        TextInputLayout textInputLayout = c0158dp.f1409h;
        if (c0158dp.f1418q == z) {
            return;
        }
        c0158dp.m933c();
        if (z) {
            C0249g5 c0249g5 = new C0249g5(c0158dp.f1408g, null);
            c0158dp.f1419r = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_error);
            c0158dp.f1419r.setTextAlignment(5);
            Typeface typeface = c0158dp.f1401B;
            if (typeface != null) {
                c0158dp.f1419r.setTypeface(typeface);
            }
            int i = c0158dp.f1422u;
            c0158dp.f1422u = i;
            C0249g5 c0249g52 = c0158dp.f1419r;
            if (c0249g52 != null) {
                c0158dp.f1409h.m736l(c0249g52, i);
            }
            ColorStateList colorStateList = c0158dp.f1423v;
            c0158dp.f1423v = colorStateList;
            C0249g5 c0249g53 = c0158dp.f1419r;
            if (c0249g53 != null && colorStateList != null) {
                c0249g53.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0158dp.f1420s;
            c0158dp.f1420s = charSequence;
            C0249g5 c0249g54 = c0158dp.f1419r;
            if (c0249g54 != null) {
                c0249g54.setContentDescription(charSequence);
            }
            int i2 = c0158dp.f1421t;
            c0158dp.f1421t = i2;
            C0249g5 c0249g55 = c0158dp.f1419r;
            if (c0249g55 != null) {
                WeakHashMap weakHashMap = oa0.f3426a;
                aa0.m43f(c0249g55, i2);
            }
            c0158dp.f1419r.setVisibility(4);
            c0158dp.m931a(c0158dp.f1419r, 0);
        } else {
            c0158dp.m936f();
            c0158dp.m937g(c0158dp.f1419r, 0);
            c0158dp.f1419r = null;
            textInputLayout.m742r();
            textInputLayout.m748x();
        }
        c0158dp.f1418q = z;
    }

    public void setErrorIconDrawable(int i) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.m1291i(i != 0 ? AbstractC0259gf.m1261w(c0263gj.getContext(), i) : null);
        AbstractC0259gf.m1233Q(c0263gj.f1997a, c0263gj.f1999c, c0263gj.f2000d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0263gj c0263gj = this.f1127c;
        CheckableImageButton checkableImageButton = c0263gj.f1999c;
        View.OnLongClickListener onLongClickListener = c0263gj.f2002f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2002f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0263gj.f1999c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0263gj c0263gj = this.f1127c;
        if (c0263gj.f2000d != colorStateList) {
            c0263gj.f2000d = colorStateList;
            AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f1999c, colorStateList, c0263gj.f2001e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0263gj c0263gj = this.f1127c;
        if (c0263gj.f2001e != mode) {
            c0263gj.f2001e = mode;
            AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f1999c, c0263gj.f2000d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1422u = i;
        C0249g5 c0249g5 = c0158dp.f1419r;
        if (c0249g5 != null) {
            c0158dp.f1409h.m736l(c0249g5, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1423v = colorStateList;
        C0249g5 c0249g5 = c0158dp.f1419r;
        if (c0249g5 == null || colorStateList == null) {
            return;
        }
        c0249g5.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f1166v0 != z) {
            this.f1166v0 = z;
            m745u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0158dp c0158dp = this.f1141j;
        if (zIsEmpty) {
            if (c0158dp.f1425x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0158dp.f1425x) {
            setHelperTextEnabled(true);
        }
        c0158dp.m933c();
        c0158dp.f1424w = charSequence;
        c0158dp.f1426y.setText(charSequence);
        int i = c0158dp.f1415n;
        if (i != 2) {
            c0158dp.f1416o = 2;
        }
        c0158dp.m939i(i, c0158dp.f1416o, c0158dp.m938h(c0158dp.f1426y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1400A = colorStateList;
        C0249g5 c0249g5 = c0158dp.f1426y;
        if (c0249g5 == null || colorStateList == null) {
            return;
        }
        c0249g5.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0158dp c0158dp = this.f1141j;
        TextInputLayout textInputLayout = c0158dp.f1409h;
        if (c0158dp.f1425x == z) {
            return;
        }
        c0158dp.m933c();
        if (z) {
            C0249g5 c0249g5 = new C0249g5(c0158dp.f1408g, null);
            c0158dp.f1426y = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_helper_text);
            c0158dp.f1426y.setTextAlignment(5);
            Typeface typeface = c0158dp.f1401B;
            if (typeface != null) {
                c0158dp.f1426y.setTypeface(typeface);
            }
            c0158dp.f1426y.setVisibility(4);
            aa0.m43f(c0158dp.f1426y, 1);
            int i = c0158dp.f1427z;
            c0158dp.f1427z = i;
            C0249g5 c0249g52 = c0158dp.f1426y;
            if (c0249g52 != null) {
                c0249g52.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0158dp.f1400A;
            c0158dp.f1400A = colorStateList;
            C0249g5 c0249g53 = c0158dp.f1426y;
            if (c0249g53 != null && colorStateList != null) {
                c0249g53.setTextColor(colorStateList);
            }
            c0158dp.m931a(c0158dp.f1426y, 1);
            c0158dp.f1426y.setAccessibilityDelegate(new C0122cp(c0158dp));
        } else {
            c0158dp.m933c();
            int i2 = c0158dp.f1415n;
            if (i2 == 2) {
                c0158dp.f1416o = 0;
            }
            c0158dp.m939i(i2, c0158dp.f1416o, c0158dp.m938h(c0158dp.f1426y, ""));
            c0158dp.m937g(c0158dp.f1426y, 1);
            c0158dp.f1426y = null;
            textInputLayout.m742r();
            textInputLayout.m748x();
        }
        c0158dp.f1425x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0158dp c0158dp = this.f1141j;
        c0158dp.f1427z = i;
        C0249g5 c0249g5 = c0158dp.f1426y;
        if (c0249g5 != null) {
            c0249g5.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1102C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f1168w0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1102C) {
            this.f1102C = z;
            if (z) {
                CharSequence hint = this.f1129d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1103D)) {
                        setHint(hint);
                    }
                    this.f1129d.setHint((CharSequence) null);
                }
                this.f1104E = true;
            } else {
                this.f1104E = false;
                if (!TextUtils.isEmpty(this.f1103D) && TextUtils.isEmpty(this.f1129d.getHint())) {
                    this.f1129d.setHint(this.f1103D);
                }
                setHintInternal(null);
            }
            if (this.f1129d != null) {
                m744t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0292hb c0292hb = this.f1164u0;
        TextInputLayout textInputLayout = c0292hb.f2182a;
        g60 g60Var = new g60(textInputLayout.getContext(), i);
        ColorStateList colorStateList = g60Var.f1891j;
        if (colorStateList != null) {
            c0292hb.f2198k = colorStateList;
        }
        float f = g60Var.f1892k;
        if (f != 0.0f) {
            c0292hb.f2196i = f;
        }
        ColorStateList colorStateList2 = g60Var.f1882a;
        if (colorStateList2 != null) {
            c0292hb.f2176U = colorStateList2;
        }
        c0292hb.f2174S = g60Var.f1886e;
        c0292hb.f2175T = g60Var.f1887f;
        c0292hb.f2173R = g60Var.f1888g;
        c0292hb.f2177V = g60Var.f1890i;
        C0624q8 c0624q8 = c0292hb.f2212y;
        if (c0624q8 != null) {
            c0624q8.f3866e = true;
        }
        C0431l0 c0431l0 = new C0431l0(6, c0292hb);
        g60Var.m1163a();
        c0292hb.f2212y = new C0624q8(c0431l0, g60Var.f1895n);
        g60Var.m1165c(textInputLayout.getContext(), c0292hb.f2212y);
        c0292hb.m1379h(false);
        this.f1142j0 = c0292hb.f2198k;
        if (this.f1129d != null) {
            m745u(false, false);
            m744t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1142j0 != colorStateList) {
            if (this.f1140i0 == null) {
                C0292hb c0292hb = this.f1164u0;
                if (c0292hb.f2198k != colorStateList) {
                    c0292hb.f2198k = colorStateList;
                    c0292hb.m1379h(false);
                }
            }
            this.f1142j0 = colorStateList;
            if (this.f1129d != null) {
                m745u(false, false);
            }
        }
    }

    public void setLengthCounter(l60 l60Var) {
        this.f1149n = l60Var;
    }

    public void setMaxEms(int i) {
        this.f1135g = i;
        EditText editText = this.f1129d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f1139i = i;
        EditText editText = this.f1129d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1133f = i;
        EditText editText = this.f1129d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f1137h = i;
        EditText editText = this.f1129d;
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
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2003g.setContentDescription(i != 0 ? c0263gj.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2003g.setImageDrawable(i != 0 ? AbstractC0259gf.m1261w(c0263gj.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0263gj c0263gj = this.f1127c;
        if (z && c0263gj.f2005i != 1) {
            c0263gj.m1289g(1);
        } else if (z) {
            c0263gj.getClass();
        } else {
            c0263gj.m1289g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2007k = colorStateList;
        AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f2003g, colorStateList, c0263gj.f2008l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.f2008l = mode;
        AbstractC0259gf.m1249g(c0263gj.f1997a, c0263gj.f2003g, c0263gj.f2007k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1161t == null) {
            C0249g5 c0249g5 = new C0249g5(getContext(), null);
            this.f1161t = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_placeholder);
            x90.m2671s(this.f1161t, 2);
            C0672rj c0672rjM729d = m729d();
            this.f1167w = c0672rjM729d;
            c0672rjM729d.f5204b = 67L;
            this.f1169x = m729d();
            setPlaceholderTextAppearance(this.f1165v);
            setPlaceholderTextColor(this.f1163u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1159s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1157r = charSequence;
        }
        EditText editText = this.f1129d;
        m746v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1165v = i;
        C0249g5 c0249g5 = this.f1161t;
        if (c0249g5 != null) {
            c0249g5.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1163u != colorStateList) {
            this.f1163u = colorStateList;
            C0249g5 c0249g5 = this.f1161t;
            if (c0249g5 == null || colorStateList == null) {
                return;
            }
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y40 y40Var = this.f1125b;
        y40Var.getClass();
        y40Var.f5347c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        y40Var.f5346b.setText(charSequence);
        y40Var.m2727e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1125b.f5346b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1125b.f5346b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m30 m30Var) {
        C0350iu c0350iu = this.f1105F;
        if (c0350iu == null || c0350iu.f2585a.f2266a == m30Var) {
            return;
        }
        this.f1111L = m30Var;
        m727b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f1125b.f5348d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0259gf.m1261w(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y40 y40Var = this.f1125b;
        if (i < 0) {
            y40Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != y40Var.f5351g) {
            y40Var.f5351g = i;
            CheckableImageButton checkableImageButton = y40Var.f5348d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y40 y40Var = this.f1125b;
        CheckableImageButton checkableImageButton = y40Var.f5348d;
        View.OnLongClickListener onLongClickListener = y40Var.f5353i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y40 y40Var = this.f1125b;
        y40Var.f5353i = onLongClickListener;
        CheckableImageButton checkableImageButton = y40Var.f5348d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y40 y40Var = this.f1125b;
        y40Var.f5352h = scaleType;
        y40Var.f5348d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y40 y40Var = this.f1125b;
        if (y40Var.f5349e != colorStateList) {
            y40Var.f5349e = colorStateList;
            AbstractC0259gf.m1249g(y40Var.f5345a, y40Var.f5348d, colorStateList, y40Var.f5350f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y40 y40Var = this.f1125b;
        if (y40Var.f5350f != mode) {
            y40Var.f5350f = mode;
            AbstractC0259gf.m1249g(y40Var.f5345a, y40Var.f5348d, y40Var.f5349e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f1125b.m2725c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0263gj c0263gj = this.f1127c;
        c0263gj.getClass();
        c0263gj.f2012p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0263gj.f2013q.setText(charSequence);
        c0263gj.m1296n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1127c.f2013q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1127c.f2013q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(k60 k60Var) {
        EditText editText = this.f1129d;
        if (editText != null) {
            oa0.m2012l(editText, k60Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1126b0) {
            this.f1126b0 = typeface;
            this.f1164u0.m1384m(typeface);
            C0158dp c0158dp = this.f1141j;
            if (typeface != c0158dp.f1401B) {
                c0158dp.f1401B = typeface;
                C0249g5 c0249g5 = c0158dp.f1419r;
                if (c0249g5 != null) {
                    c0249g5.setTypeface(typeface);
                }
                C0249g5 c0249g52 = c0158dp.f1426y;
                if (c0249g52 != null) {
                    c0249g52.setTypeface(typeface);
                }
            }
            C0249g5 c0249g53 = this.f1151o;
            if (c0249g53 != null) {
                c0249g53.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m744t() {
        if (this.f1114O != 1) {
            FrameLayout frameLayout = this.f1123a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM728c = m728c();
            if (iM728c != layoutParams.topMargin) {
                layoutParams.topMargin = iM728c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m745u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0249g5 c0249g5;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f1129d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1129d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1140i0;
        C0292hb c0292hb = this.f1164u0;
        if (colorStateList2 != null) {
            c0292hb.m1380i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f1140i0;
            c0292hb.m1380i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1160s0) : this.f1160s0));
        } else if (m737m()) {
            C0249g5 c0249g52 = this.f1141j.f1419r;
            c0292hb.m1380i(c0249g52 != null ? c0249g52.getTextColors() : null);
        } else if (this.f1147m && (c0249g5 = this.f1151o) != null) {
            c0292hb.m1380i(c0249g5.getTextColors());
        } else if (z4 && (colorStateList = this.f1142j0) != null && c0292hb.f2198k != colorStateList) {
            c0292hb.f2198k = colorStateList;
            c0292hb.m1379h(false);
        }
        C0263gj c0263gj = this.f1127c;
        y40 y40Var = this.f1125b;
        if (z3 || !this.f1166v0 || (isEnabled() && z4)) {
            if (z2 || this.f1162t0) {
                ValueAnimator valueAnimator = this.f1170x0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1170x0.cancel();
                }
                if (z && this.f1168w0) {
                    m726a(1.0f);
                } else {
                    c0292hb.m1382k(1.0f);
                }
                this.f1162t0 = false;
                if (m730e()) {
                    m735j();
                }
                EditText editText3 = this.f1129d;
                m746v(editText3 != null ? editText3.getText() : null);
                y40Var.f5354j = false;
                y40Var.m2727e();
                c0263gj.f2014r = false;
                c0263gj.m1296n();
                return;
            }
            return;
        }
        if (z2 || !this.f1162t0) {
            ValueAnimator valueAnimator2 = this.f1170x0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1170x0.cancel();
            }
            if (z && this.f1168w0) {
                m726a(0.0f);
            } else {
                c0292hb.m1382k(0.0f);
            }
            if (m730e() && !((C0102cf) this.f1105F).f893x.f726q.isEmpty() && m730e()) {
                ((C0102cf) this.f1105F).m633n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1162t0 = true;
            C0249g5 c0249g53 = this.f1161t;
            if (c0249g53 != null && this.f1159s) {
                c0249g53.setText((CharSequence) null);
                b80.m495a(this.f1123a, this.f1169x);
                this.f1161t.setVisibility(4);
            }
            y40Var.f5354j = true;
            y40Var.m2727e();
            c0263gj.f2014r = true;
            c0263gj.m1296n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m746v(Editable editable) {
        ((C0664rb) this.f1149n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1123a;
        if (length != 0 || this.f1162t0) {
            C0249g5 c0249g5 = this.f1161t;
            if (c0249g5 == null || !this.f1159s) {
                return;
            }
            c0249g5.setText((CharSequence) null);
            b80.m495a(frameLayout, this.f1169x);
            this.f1161t.setVisibility(4);
            return;
        }
        if (this.f1161t == null || !this.f1159s || TextUtils.isEmpty(this.f1157r)) {
            return;
        }
        this.f1161t.setText(this.f1157r);
        b80.m495a(frameLayout, this.f1167w);
        this.f1161t.setVisibility(0);
        this.f1161t.bringToFront();
        announceForAccessibility(this.f1157r);
    }

    /* JADX INFO: renamed from: w */
    public final void m747w(boolean z, boolean z2) {
        int defaultColor = this.f1150n0.getDefaultColor();
        int colorForState = this.f1150n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1150n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f1119T = colorForState2;
        } else if (z2) {
            this.f1119T = colorForState;
        } else {
            this.f1119T = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m748x() {
        C0249g5 c0249g5;
        EditText editText;
        EditText editText2;
        if (this.f1105F == null || this.f1114O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f1129d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1129d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f1119T = this.f1160s0;
        } else if (m737m()) {
            if (this.f1150n0 != null) {
                m747w(z2, z);
            } else {
                this.f1119T = getErrorCurrentTextColors();
            }
        } else if (!this.f1147m || (c0249g5 = this.f1151o) == null) {
            if (z2) {
                this.f1119T = this.f1148m0;
            } else if (z) {
                this.f1119T = this.f1146l0;
            } else {
                this.f1119T = this.f1144k0;
            }
        } else if (this.f1150n0 != null) {
            m747w(z2, z);
        } else {
            this.f1119T = c0249g5.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m740p();
        }
        C0263gj c0263gj = this.f1127c;
        TextInputLayout textInputLayout = c0263gj.f1997a;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        TextInputLayout textInputLayout2 = c0263gj.f1997a;
        c0263gj.m1294l();
        AbstractC0259gf.m1233Q(textInputLayout2, c0263gj.f1999c, c0263gj.f2000d);
        AbstractC0259gf.m1233Q(textInputLayout2, checkableImageButton, c0263gj.f2007k);
        if (c0263gj.m1284b() instanceof C0670rh) {
            if (!textInputLayout.m737m() || checkableImageButton.getDrawable() == null) {
                AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, c0263gj.f2007k, c0263gj.f2008l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                AbstractC0187eh.m994g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        y40 y40Var = this.f1125b;
        AbstractC0259gf.m1233Q(y40Var.f5345a, y40Var.f5348d, y40Var.f5349e);
        if (this.f1114O == 2) {
            int i = this.f1116Q;
            if (z2 && isEnabled()) {
                this.f1116Q = this.f1118S;
            } else {
                this.f1116Q = this.f1117R;
            }
            if (this.f1116Q != i && m730e() && !this.f1162t0) {
                if (m730e()) {
                    ((C0102cf) this.f1105F).m633n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m735j();
            }
        }
        if (this.f1114O == 1) {
            if (!isEnabled()) {
                this.f1120U = this.f1154p0;
            } else if (z && !z2) {
                this.f1120U = this.f1158r0;
            } else if (z2) {
                this.f1120U = this.f1156q0;
            } else {
                this.f1120U = this.f1152o0;
            }
        }
        m727b();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1125b.f5348d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1125b.m2724b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1127c.f2003g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1127c.f2003g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1127c.m1291i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1127c.f2003g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0263gj c0263gj = this.f1127c;
        TextInputLayout textInputLayout = c0263gj.f1997a;
        CheckableImageButton checkableImageButton = c0263gj.f2003g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, c0263gj.f2007k, c0263gj.f2008l);
            AbstractC0259gf.m1233Q(textInputLayout, checkableImageButton, c0263gj.f2007k);
        }
    }
}
