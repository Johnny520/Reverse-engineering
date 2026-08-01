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
import p000.AbstractC0104ch;
import p000.AbstractC0126ct;
import p000.AbstractC0187eh;
import p000.AbstractC0199et;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0294hd;
import p000.AbstractC0329ib;
import p000.AbstractC0346ip;
import p000.AbstractC0410kg;
import p000.AbstractC0619q2;
import p000.AbstractC0873wy;
import p000.AbstractC0979zt;
import p000.C0016af;
import p000.C0066bf;
import p000.C0106cj;
import p000.C0163du;
import p000.C0169e;
import p000.C0189ej;
import p000.C0200eu;
import p000.C0249g5;
import p000.C0252g8;
import p000.C0368jb;
import p000.C0386jt;
import p000.C0431l0;
import p000.C0475m7;
import p000.C0597ph;
import p000.C0599pj;
import p000.C0624q7;
import p000.C0659r5;
import p000.C0661r7;
import p000.C0768u3;
import p000.C0819vh;
import p000.C0937yo;
import p000.C0960za;
import p000.C0974zo;
import p000.InterfaceC0148de;
import p000.RunnableC0581p1;
import p000.RunnableC0919y6;
import p000.a60;
import p000.a80;
import p000.aa0;
import p000.b60;
import p000.e30;
import p000.e60;
import p000.f30;
import p000.f60;
import p000.g60;
import p000.h10;
import p000.h60;
import p000.i60;
import p000.ja0;
import p000.r40;
import p000.s90;
import p000.t90;
import p000.v70;
import p000.v90;
import p000.z10;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: B0 */
    public static final int[][] f1173B0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    public ColorStateList f1174A;

    /* JADX INFO: renamed from: A0 */
    public boolean f1175A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f1176B;

    /* JADX INFO: renamed from: C */
    public boolean f1177C;

    /* JADX INFO: renamed from: D */
    public CharSequence f1178D;

    /* JADX INFO: renamed from: E */
    public boolean f1179E;

    /* JADX INFO: renamed from: F */
    public C0200eu f1180F;

    /* JADX INFO: renamed from: G */
    public C0200eu f1181G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f1182H;

    /* JADX INFO: renamed from: I */
    public boolean f1183I;

    /* JADX INFO: renamed from: J */
    public C0200eu f1184J;

    /* JADX INFO: renamed from: K */
    public C0200eu f1185K;

    /* JADX INFO: renamed from: L */
    public f30 f1186L;

    /* JADX INFO: renamed from: M */
    public boolean f1187M;

    /* JADX INFO: renamed from: N */
    public final int f1188N;

    /* JADX INFO: renamed from: O */
    public int f1189O;

    /* JADX INFO: renamed from: P */
    public int f1190P;

    /* JADX INFO: renamed from: Q */
    public int f1191Q;

    /* JADX INFO: renamed from: R */
    public int f1192R;

    /* JADX INFO: renamed from: S */
    public int f1193S;

    /* JADX INFO: renamed from: T */
    public int f1194T;

    /* JADX INFO: renamed from: U */
    public int f1195U;

    /* JADX INFO: renamed from: V */
    public final Rect f1196V;

    /* JADX INFO: renamed from: W */
    public final Rect f1197W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f1198a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f1199a0;

    /* JADX INFO: renamed from: b */
    public final r40 f1200b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f1201b0;

    /* JADX INFO: renamed from: c */
    public final C0189ej f1202c;

    /* JADX INFO: renamed from: c0 */
    public ColorDrawable f1203c0;

    /* JADX INFO: renamed from: d */
    public EditText f1204d;

    /* JADX INFO: renamed from: d0 */
    public int f1205d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f1206e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet f1207e0;

    /* JADX INFO: renamed from: f */
    public int f1208f;

    /* JADX INFO: renamed from: f0 */
    public ColorDrawable f1209f0;

    /* JADX INFO: renamed from: g */
    public int f1210g;

    /* JADX INFO: renamed from: g0 */
    public int f1211g0;

    /* JADX INFO: renamed from: h */
    public int f1212h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f1213h0;

    /* JADX INFO: renamed from: i */
    public int f1214i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f1215i0;

    /* JADX INFO: renamed from: j */
    public final C0974zo f1216j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f1217j0;

    /* JADX INFO: renamed from: k */
    public boolean f1218k;

    /* JADX INFO: renamed from: k0 */
    public int f1219k0;

    /* JADX INFO: renamed from: l */
    public int f1220l;

    /* JADX INFO: renamed from: l0 */
    public int f1221l0;

    /* JADX INFO: renamed from: m */
    public boolean f1222m;

    /* JADX INFO: renamed from: m0 */
    public int f1223m0;

    /* JADX INFO: renamed from: n */
    public f60 f1224n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f1225n0;

    /* JADX INFO: renamed from: o */
    public C0249g5 f1226o;

    /* JADX INFO: renamed from: o0 */
    public int f1227o0;

    /* JADX INFO: renamed from: p */
    public int f1228p;

    /* JADX INFO: renamed from: p0 */
    public int f1229p0;

    /* JADX INFO: renamed from: q */
    public int f1230q;

    /* JADX INFO: renamed from: q0 */
    public int f1231q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f1232r;

    /* JADX INFO: renamed from: r0 */
    public int f1233r0;

    /* JADX INFO: renamed from: s */
    public boolean f1234s;

    /* JADX INFO: renamed from: s0 */
    public int f1235s0;

    /* JADX INFO: renamed from: t */
    public C0249g5 f1236t;

    /* JADX INFO: renamed from: t0 */
    public boolean f1237t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f1238u;

    /* JADX INFO: renamed from: u0 */
    public final C0960za f1239u0;

    /* JADX INFO: renamed from: v */
    public int f1240v;

    /* JADX INFO: renamed from: v0 */
    public boolean f1241v0;

    /* JADX INFO: renamed from: w */
    public C0599pj f1242w;

    /* JADX INFO: renamed from: w0 */
    public boolean f1243w0;

    /* JADX INFO: renamed from: x */
    public C0599pj f1244x;

    /* JADX INFO: renamed from: x0 */
    public ValueAnimator f1245x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f1246y;

    /* JADX INFO: renamed from: y0 */
    public boolean f1247y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1248z;

    /* JADX INFO: renamed from: z0 */
    public boolean f1249z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout), attributeSet, com.ljx.wechatmod.R.attr.textInputStyle);
        this.f1208f = -1;
        this.f1210g = -1;
        this.f1212h = -1;
        this.f1214i = -1;
        this.f1216j = new C0974zo(this);
        this.f1224n = new C0368jb(2);
        this.f1196V = new Rect();
        this.f1197W = new Rect();
        this.f1199a0 = new RectF();
        this.f1207e0 = new LinkedHashSet();
        C0960za c0960za = new C0960za(this);
        this.f1239u0 = c0960za;
        this.f1175A0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1198a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0619q2.f3971a;
        c0960za.f5491Q = linearInterpolator;
        c0960za.m2793h(false);
        c0960za.f5490P = linearInterpolator;
        c0960za.m2793h(false);
        if (c0960za.f5513g != 8388659) {
            c0960za.f5513g = 8388659;
            c0960za.m2793h(false);
        }
        a80.m39c(context2, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC0873wy.f5040A;
        a80.m41e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout);
        C0659r5 c0659r5 = new C0659r5(context2, typedArrayObtainStyledAttributes);
        r40 r40Var = new r40(this, c0659r5);
        this.f1200b = r40Var;
        this.f1177C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f1243w0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f1241v0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f1186L = f30.m1136b(context2, attributeSet, com.ljx.wechatmod.R.attr.textInputStyle, com.ljx.wechatmod.R.style.Widget_Design_TextInputLayout).m982a();
        this.f1188N = context2.getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1190P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1192R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1193S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1191Q = this.f1192R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        e30 e30VarM1139e = this.f1186L.m1139e();
        if (dimension >= 0.0f) {
            e30VarM1139e.f1697e = new C0169e(dimension);
        }
        if (dimension2 >= 0.0f) {
            e30VarM1139e.f1698f = new C0169e(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e30VarM1139e.f1699g = new C0169e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e30VarM1139e.f1700h = new C0169e(dimension4);
        }
        this.f1186L = e30VarM1139e.m982a();
        ColorStateList colorStateListM815m = AbstractC0126ct.m815m(context2, c0659r5, 7);
        if (colorStateListM815m != null) {
            int defaultColor = colorStateListM815m.getDefaultColor();
            this.f1227o0 = defaultColor;
            this.f1195U = defaultColor;
            if (colorStateListM815m.isStateful()) {
                this.f1229p0 = colorStateListM815m.getColorForState(new int[]{-16842910}, -1);
                this.f1231q0 = colorStateListM815m.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1233r0 = colorStateListM815m.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1231q0 = this.f1227o0;
                ColorStateList colorStateListM1510v = AbstractC0346ip.m1510v(context2, com.ljx.wechatmod.R.color.mtrl_filled_background_color);
                this.f1229p0 = colorStateListM1510v.getColorForState(new int[]{-16842910}, -1);
                this.f1233r0 = colorStateListM1510v.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1195U = 0;
            this.f1227o0 = 0;
            this.f1229p0 = 0;
            this.f1231q0 = 0;
            this.f1233r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM2233l = c0659r5.m2233l(1);
            this.f1217j0 = colorStateListM2233l;
            this.f1215i0 = colorStateListM2233l;
        }
        ColorStateList colorStateListM815m2 = AbstractC0126ct.m815m(context2, c0659r5, 14);
        this.f1223m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f1219k0 = AbstractC0294hd.m1354a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1235s0 = AbstractC0294hd.m1354a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_disabled_color);
        this.f1221l0 = AbstractC0294hd.m1354a(context2, com.ljx.wechatmod.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM815m2 != null) {
            setBoxStrokeColorStateList(colorStateListM815m2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0126ct.m815m(context2, c0659r5, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1174A = c0659r5.m2233l(24);
        this.f1176B = c0659r5.m2233l(25);
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
        this.f1230q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f1228p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1228p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1230q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0659r5.m2233l(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0659r5.m2233l(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0659r5.m2233l(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0659r5.m2233l(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0659r5.m2233l(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0659r5.m2233l(58));
        }
        C0189ej c0189ej = new C0189ej(this, c0659r5);
        this.f1202c = c0189ej;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0659r5.m2245z();
        s90.m2327s(this, 2);
        aa0.m78l(this, 1);
        frameLayout.addView(r40Var);
        frameLayout.addView(c0189ej);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f1204d;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f1180F;
        }
        int iM2830k = AbstractC0979zt.m2830k(this.f1204d, com.ljx.wechatmod.R.attr.colorControlHighlight);
        int i = this.f1189O;
        int[][] iArr = f1173B0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0200eu c0200eu = this.f1180F;
            int i2 = this.f1195U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0979zt.m2814E(0.1f, iM2830k, i2), i2}), c0200eu, c0200eu);
        }
        Context context = getContext();
        C0200eu c0200eu2 = this.f1180F;
        TypedValue typedValueM1297A = AbstractC0273gt.m1297A(context, com.ljx.wechatmod.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM1297A.resourceId;
        int iM1354a = i3 != 0 ? AbstractC0294hd.m1354a(context, i3) : typedValueM1297A.data;
        C0200eu c0200eu3 = new C0200eu(c0200eu2.f1842a.f1633a);
        int iM2814E = AbstractC0979zt.m2814E(0.1f, iM2830k, iM1354a);
        c0200eu3.m1085j(new ColorStateList(iArr, new int[]{iM2814E, 0}));
        c0200eu3.setTint(iM1354a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM2814E, iM1354a});
        C0200eu c0200eu4 = new C0200eu(c0200eu2.f1842a.f1633a);
        c0200eu4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0200eu3, c0200eu4), c0200eu2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1182H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1182H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1182H.addState(new int[0], m773f(false));
        }
        return this.f1182H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1181G == null) {
            this.f1181G = m773f(true);
        }
        return this.f1181G;
    }

    /* JADX INFO: renamed from: k */
    public static void m767k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m767k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1204d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1204d = editText;
        int i = this.f1208f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f1212h);
        }
        int i2 = this.f1210g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f1214i);
        }
        this.f1183I = false;
        m776i();
        setTextInputAccessibilityDelegate(new e60(this));
        Typeface typeface = this.f1204d.getTypeface();
        C0960za c0960za = this.f1239u0;
        c0960za.m2798m(typeface);
        float textSize = this.f1204d.getTextSize();
        if (c0960za.f5514h != textSize) {
            c0960za.f5514h = textSize;
            c0960za.m2793h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f1204d.getLetterSpacing();
        if (c0960za.f5497W != letterSpacing) {
            c0960za.f5497W = letterSpacing;
            c0960za.m2793h(false);
        }
        int gravity = this.f1204d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0960za.f5513g != i4) {
            c0960za.f5513g = i4;
            c0960za.m2793h(false);
        }
        if (c0960za.f5511f != gravity) {
            c0960za.f5511f = gravity;
            c0960za.m2793h(false);
        }
        this.f1204d.addTextChangedListener(new z10(this, 1));
        if (this.f1215i0 == null) {
            this.f1215i0 = this.f1204d.getHintTextColors();
        }
        if (this.f1177C) {
            if (TextUtils.isEmpty(this.f1178D)) {
                CharSequence hint = this.f1204d.getHint();
                this.f1206e = hint;
                setHint(hint);
                this.f1204d.setHint((CharSequence) null);
            }
            this.f1179E = true;
        }
        if (i3 >= 29) {
            m782p();
        }
        if (this.f1226o != null) {
            m780n(this.f1204d.getText());
        }
        m784r();
        this.f1216j.m2805b();
        this.f1200b.bringToFront();
        C0189ej c0189ej = this.f1202c;
        c0189ej.bringToFront();
        Iterator it = this.f1207e0.iterator();
        while (it.hasNext()) {
            ((C0106cj) it.next()).m691a(this);
        }
        c0189ej.m1047m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m787u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1178D)) {
            return;
        }
        this.f1178D = charSequence;
        C0960za c0960za = this.f1239u0;
        if (charSequence == null || !TextUtils.equals(c0960za.f5475A, charSequence)) {
            c0960za.f5475A = charSequence;
            c0960za.f5476B = null;
            Bitmap bitmap = c0960za.f5479E;
            if (bitmap != null) {
                bitmap.recycle();
                c0960za.f5479E = null;
            }
            c0960za.m2793h(false);
        }
        if (this.f1237t0) {
            return;
        }
        m777j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f1234s == z) {
            return;
        }
        if (z) {
            C0249g5 c0249g5 = this.f1236t;
            if (c0249g5 != null) {
                this.f1198a.addView(c0249g5);
                this.f1236t.setVisibility(0);
            }
        } else {
            C0249g5 c0249g52 = this.f1236t;
            if (c0249g52 != null) {
                c0249g52.setVisibility(8);
            }
            this.f1236t = null;
        }
        this.f1234s = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m768a(float f) {
        C0960za c0960za = this.f1239u0;
        if (c0960za.f5503b == f) {
            return;
        }
        int i = 2;
        if (this.f1245x0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1245x0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0126ct.m825w(getContext(), com.ljx.wechatmod.R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3972b));
            this.f1245x0.setDuration(AbstractC0126ct.m824v(getContext(), com.ljx.wechatmod.R.attr.motionDurationMedium4, 167));
            this.f1245x0.addUpdateListener(new C0624q7(i, this));
        }
        this.f1245x0.setFloatValues(c0960za.f5503b, f);
        this.f1245x0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1198a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m786t();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m769b() {
        int i;
        int i2;
        C0200eu c0200eu = this.f1180F;
        if (c0200eu == null) {
            return;
        }
        f30 f30Var = c0200eu.f1842a.f1633a;
        f30 f30Var2 = this.f1186L;
        if (f30Var != f30Var2) {
            c0200eu.setShapeAppearanceModel(f30Var2);
        }
        if (this.f1189O == 2 && (i = this.f1191Q) > -1 && (i2 = this.f1194T) != 0) {
            C0200eu c0200eu2 = this.f1180F;
            c0200eu2.f1842a.f1642j = i;
            c0200eu2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0163du c0163du = c0200eu2.f1842a;
            if (c0163du.f1636d != colorStateListValueOf) {
                c0163du.f1636d = colorStateListValueOf;
                c0200eu2.onStateChange(c0200eu2.getState());
            }
        }
        int iM1426b = this.f1195U;
        if (this.f1189O == 1) {
            iM1426b = AbstractC0329ib.m1426b(this.f1195U, AbstractC0979zt.m2829j(getContext(), com.ljx.wechatmod.R.attr.colorSurface, 0));
        }
        this.f1195U = iM1426b;
        this.f1180F.m1085j(ColorStateList.valueOf(iM1426b));
        C0200eu c0200eu3 = this.f1184J;
        if (c0200eu3 != null && this.f1185K != null) {
            if (this.f1191Q > -1 && this.f1194T != 0) {
                c0200eu3.m1085j(this.f1204d.isFocused() ? ColorStateList.valueOf(this.f1219k0) : ColorStateList.valueOf(this.f1194T));
                this.f1185K.m1085j(ColorStateList.valueOf(this.f1194T));
            }
            invalidate();
        }
        m785s();
    }

    /* JADX INFO: renamed from: c */
    public final int m770c() {
        float fM2790d;
        if (!this.f1177C) {
            return 0;
        }
        int i = this.f1189O;
        C0960za c0960za = this.f1239u0;
        if (i == 0) {
            fM2790d = c0960za.m2790d();
        } else {
            if (i != 2) {
                return 0;
            }
            fM2790d = c0960za.m2790d() / 2.0f;
        }
        return (int) fM2790d;
    }

    /* JADX INFO: renamed from: d */
    public final C0599pj m771d() {
        C0599pj c0599pj = new C0599pj();
        c0599pj.f4227c = AbstractC0126ct.m824v(getContext(), com.ljx.wechatmod.R.attr.motionDurationShort2, 87);
        c0599pj.f4228d = AbstractC0126ct.m825w(getContext(), com.ljx.wechatmod.R.attr.motionEasingLinearInterpolator, AbstractC0619q2.f3971a);
        return c0599pj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f1204d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1206e != null) {
            boolean z = this.f1179E;
            this.f1179E = false;
            CharSequence hint = editText.getHint();
            this.f1204d.setHint(this.f1206e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f1204d.setHint(hint);
                this.f1179E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1198a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f1204d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1249z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1249z0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0200eu c0200eu;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f1177C;
        C0960za c0960za = this.f1239u0;
        if (z) {
            TextPaint textPaint = c0960za.f5488N;
            RectF rectF = c0960za.f5509e;
            int iSave = canvas2.save();
            if (c0960za.f5476B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c0960za.f5481G);
                float f = c0960za.f5522p;
                float f2 = c0960za.f5523q;
                float f3 = c0960za.f5480F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (c0960za.f5508d0 <= 1 || c0960za.f5477C) {
                    canvas2.translate(f, f2);
                    c0960za.f5499Y.draw(canvas2);
                } else {
                    float lineStart = c0960za.f5522p - c0960za.f5499Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c0960za.f5504b0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c0960za.f5482H;
                        float f6 = c0960za.f5483I;
                        float f7 = c0960za.f5484J;
                        int i2 = c0960za.f5485K;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC0329ib.m1428d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c0960za.f5499Y.draw(canvas2);
                    textPaint.setAlpha((int) (c0960za.f5502a0 * f4));
                    if (i >= 31) {
                        float f8 = c0960za.f5482H;
                        float f9 = c0960za.f5483I;
                        float f10 = c0960za.f5484J;
                        int i3 = c0960za.f5485K;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC0329ib.m1428d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c0960za.f5499Y.getLineBaseline(0);
                    CharSequence charSequence = c0960za.f5506c0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c0960za.f5482H, c0960za.f5483I, c0960za.f5484J, c0960za.f5485K);
                    }
                    String strTrim = c0960za.f5506c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c0960za.f5499Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f1185K == null || (c0200eu = this.f1184J) == null) {
            return;
        }
        c0200eu.draw(canvas2);
        if (this.f1204d.isFocused()) {
            Rect bounds = this.f1185K.getBounds();
            Rect bounds2 = this.f1184J.getBounds();
            float f12 = c0960za.f5503b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0619q2.m2141c(f12, iCenterX, bounds2.left);
            bounds.right = AbstractC0619q2.m2141c(f12, iCenterX, bounds2.right);
            this.f1185K.draw(canvas2);
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
            boolean r0 = r4.f1247y0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f1247y0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            za r3 = r4.f1239u0
            if (r3 == 0) goto L2f
            r3.f5486L = r1
            android.content.res.ColorStateList r1 = r3.f5517k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f5516j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m2793h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f1204d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p000.ja0.f2600a
            boolean r3 = p000.v90.m2496c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m787u(r0, r2)
        L47:
            r4.m784r()
            r4.m790x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f1247y0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m772e() {
        return this.f1177C && !TextUtils.isEmpty(this.f1178D) && (this.f1180F instanceof C0066bf);
    }

    /* JADX INFO: renamed from: f */
    public final C0200eu m773f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f1204d;
        float popupElevation = editText instanceof C0386jt ? ((C0386jt) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        h10 h10Var = new h10();
        h10 h10Var2 = new h10();
        h10 h10Var3 = new h10();
        h10 h10Var4 = new h10();
        int i = 0;
        C0819vh c0819vh = new C0819vh(i);
        C0819vh c0819vh2 = new C0819vh(i);
        C0819vh c0819vh3 = new C0819vh(i);
        C0819vh c0819vh4 = new C0819vh(i);
        C0169e c0169e = new C0169e(f);
        C0169e c0169e2 = new C0169e(f);
        C0169e c0169e3 = new C0169e(dimensionPixelOffset);
        C0169e c0169e4 = new C0169e(dimensionPixelOffset);
        f30 f30Var = new f30();
        f30Var.f1875a = h10Var;
        f30Var.f1876b = h10Var2;
        f30Var.f1877c = h10Var3;
        f30Var.f1878d = h10Var4;
        f30Var.f1879e = c0169e;
        f30Var.f1880f = c0169e2;
        f30Var.f1881g = c0169e4;
        f30Var.f1882h = c0169e3;
        f30Var.f1883i = c0819vh;
        f30Var.f1884j = c0819vh2;
        f30Var.f1885k = c0819vh3;
        f30Var.f1886l = c0819vh4;
        EditText editText2 = this.f1204d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0386jt ? ((C0386jt) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0200eu.f1841w;
            TypedValue typedValueM1297A = AbstractC0273gt.m1297A(context, com.ljx.wechatmod.R.attr.colorSurface, C0200eu.class.getSimpleName());
            int i2 = typedValueM1297A.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? AbstractC0294hd.m1354a(context, i2) : typedValueM1297A.data);
        }
        C0200eu c0200eu = new C0200eu();
        c0200eu.m1083h(context);
        c0200eu.m1085j(dropDownBackgroundTintList);
        c0200eu.m1084i(popupElevation);
        c0200eu.setShapeAppearanceModel(f30Var);
        C0163du c0163du = c0200eu.f1842a;
        if (c0163du.f1639g == null) {
            c0163du.f1639g = new Rect();
        }
        c0200eu.f1842a.f1639g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0200eu.invalidateSelf();
        return c0200eu;
    }

    /* JADX INFO: renamed from: g */
    public final int m774g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f1204d.getCompoundPaddingLeft() : this.f1202c.m1037c() : this.f1200b.m2213a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1204d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m770c() + getPaddingTop() + editText.getBaseline();
    }

    public C0200eu getBoxBackground() {
        int i = this.f1189O;
        if (i == 1 || i == 2) {
            return this.f1180F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1195U;
    }

    public int getBoxBackgroundMode() {
        return this.f1189O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1190P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM1311n = AbstractC0273gt.m1311n(this);
        RectF rectF = this.f1199a0;
        return zM1311n ? this.f1186L.f1882h.mo940a(rectF) : this.f1186L.f1881g.mo940a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM1311n = AbstractC0273gt.m1311n(this);
        RectF rectF = this.f1199a0;
        return zM1311n ? this.f1186L.f1881g.mo940a(rectF) : this.f1186L.f1882h.mo940a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM1311n = AbstractC0273gt.m1311n(this);
        RectF rectF = this.f1199a0;
        return zM1311n ? this.f1186L.f1879e.mo940a(rectF) : this.f1186L.f1880f.mo940a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM1311n = AbstractC0273gt.m1311n(this);
        RectF rectF = this.f1199a0;
        return zM1311n ? this.f1186L.f1880f.mo940a(rectF) : this.f1186L.f1879e.mo940a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1223m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1225n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1192R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1193S;
    }

    public int getCounterMaxLength() {
        return this.f1220l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0249g5 c0249g5;
        if (this.f1218k && this.f1222m && (c0249g5 = this.f1226o) != null) {
            return c0249g5.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1248z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1246y;
    }

    public ColorStateList getCursorColor() {
        return this.f1174A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1176B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1215i0;
    }

    public EditText getEditText() {
        return this.f1204d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1202c.f1792g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1202c.f1792g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1202c.f1798m;
    }

    public int getEndIconMode() {
        return this.f1202c.f1794i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1202c.f1799n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1202c.f1792g;
    }

    public CharSequence getError() {
        C0974zo c0974zo = this.f1216j;
        if (c0974zo.f5594q) {
            return c0974zo.f5593p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1216j.f5597t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1216j.f5596s;
    }

    public int getErrorCurrentTextColors() {
        C0249g5 c0249g5 = this.f1216j.f5595r;
        if (c0249g5 != null) {
            return c0249g5.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1202c.f1788c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0974zo c0974zo = this.f1216j;
        if (c0974zo.f5601x) {
            return c0974zo.f5600w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0249g5 c0249g5 = this.f1216j.f5602y;
        if (c0249g5 != null) {
            return c0249g5.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1177C) {
            return this.f1178D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1239u0.m2790d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0960za c0960za = this.f1239u0;
        return c0960za.m2791e(c0960za.f5517k);
    }

    public ColorStateList getHintTextColor() {
        return this.f1217j0;
    }

    public f60 getLengthCounter() {
        return this.f1224n;
    }

    public int getMaxEms() {
        return this.f1210g;
    }

    public int getMaxWidth() {
        return this.f1214i;
    }

    public int getMinEms() {
        return this.f1208f;
    }

    public int getMinWidth() {
        return this.f1212h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1202c.f1792g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1202c.f1792g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1234s) {
            return this.f1232r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1240v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1238u;
    }

    public CharSequence getPrefixText() {
        return this.f1200b.f4197c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1200b.f4196b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1200b.f4196b;
    }

    public f30 getShapeAppearanceModel() {
        return this.f1186L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1200b.f4198d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1200b.f4198d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1200b.f4201g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1200b.f4202h;
    }

    public CharSequence getSuffixText() {
        return this.f1202c.f1801p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1202c.f1802q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1202c.f1802q;
    }

    public Typeface getTypeface() {
        return this.f1201b0;
    }

    /* JADX INFO: renamed from: h */
    public final int m775h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f1204d.getCompoundPaddingRight() : this.f1200b.m2213a() : this.f1202c.m1037c());
    }

    /* JADX INFO: renamed from: i */
    public final void m776i() {
        int i = this.f1189O;
        if (i == 0) {
            this.f1180F = null;
            this.f1184J = null;
            this.f1185K = null;
        } else if (i == 1) {
            this.f1180F = new C0200eu(this.f1186L);
            this.f1184J = new C0200eu();
            this.f1185K = new C0200eu();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1189O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1177C || (this.f1180F instanceof C0066bf)) {
                this.f1180F = new C0200eu(this.f1186L);
            } else {
                f30 f30Var = this.f1186L;
                int i2 = C0066bf.f810y;
                if (f30Var == null) {
                    f30Var = new f30();
                }
                C0016af c0016af = new C0016af(f30Var, new RectF());
                C0066bf c0066bf = new C0066bf(c0016af);
                c0066bf.f811x = c0016af;
                this.f1180F = c0066bf;
            }
            this.f1184J = null;
            this.f1185K = null;
        }
        m785s();
        m790x();
        if (this.f1189O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1190P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0126ct.m821s(getContext())) {
                this.f1190P = getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f1204d != null && this.f1189O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f1204d;
                WeakHashMap weakHashMap = ja0.f2600a;
                t90.m2374k(editText, t90.m2369f(editText), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_top), t90.m2368e(this.f1204d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0126ct.m821s(getContext())) {
                EditText editText2 = this.f1204d;
                WeakHashMap weakHashMap2 = ja0.f2600a;
                t90.m2374k(editText2, t90.m2369f(editText2), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_top), t90.m2368e(this.f1204d), getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1189O != 0) {
            m786t();
        }
        EditText editText3 = this.f1204d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1189O;
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
    public final void m777j() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m777j():void");
    }

    /* JADX INFO: renamed from: l */
    public final void m778l(C0249g5 c0249g5, int i) {
        try {
            c0249g5.setTextAppearance(i);
            if (c0249g5.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0249g5.setTextAppearance(com.ljx.wechatmod.R.style.TextAppearance_AppCompat_Caption);
        c0249g5.setTextColor(AbstractC0294hd.m1354a(getContext(), com.ljx.wechatmod.R.color.design_error));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m779m() {
        C0974zo c0974zo = this.f1216j;
        return (c0974zo.f5592o != 1 || c0974zo.f5595r == null || TextUtils.isEmpty(c0974zo.f5593p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m780n(Editable editable) {
        ((C0368jb) this.f1224n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f1222m;
        int i = this.f1220l;
        if (i == -1) {
            this.f1226o.setText(String.valueOf(length));
            this.f1226o.setContentDescription(null);
            this.f1222m = false;
        } else {
            this.f1222m = length > i;
            Context context = getContext();
            this.f1226o.setContentDescription(context.getString(this.f1222m ? com.ljx.wechatmod.R.string.character_counter_overflowed_content_description : com.ljx.wechatmod.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1220l)));
            if (z != this.f1222m) {
                m781o();
            }
            String str = C0475m7.f3151b;
            Locale locale = Locale.getDefault();
            int i2 = i60.f2359a;
            C0475m7 c0475m7 = h60.m1349a(locale) == 1 ? C0475m7.f3154e : C0475m7.f3153d;
            C0249g5 c0249g5 = this.f1226o;
            String string = getContext().getString(com.ljx.wechatmod.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1220l));
            c0475m7.getClass();
            C0661r7 c0661r7 = b60.f752a;
            c0249g5.setText(string != null ? c0475m7.m1797c(string).toString() : null);
        }
        if (this.f1204d == null || z == this.f1222m) {
            return;
        }
        m787u(false, false);
        m790x();
        m784r();
    }

    /* JADX INFO: renamed from: o */
    public final void m781o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0249g5 c0249g5 = this.f1226o;
        if (c0249g5 != null) {
            m778l(c0249g5, this.f1222m ? this.f1228p : this.f1230q);
            if (!this.f1222m && (colorStateList2 = this.f1246y) != null) {
                this.f1226o.setTextColor(colorStateList2);
            }
            if (!this.f1222m || (colorStateList = this.f1248z) == null) {
                return;
            }
            this.f1226o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1239u0.m2792g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0189ej c0189ej = this.f1202c;
        c0189ej.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f1175A0 = false;
        if (this.f1204d != null && this.f1204d.getMeasuredHeight() < (iMax = Math.max(c0189ej.getMeasuredHeight(), this.f1200b.getMeasuredHeight()))) {
            this.f1204d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM783q = m783q();
        if (z || zM783q) {
            this.f1204d.post(new RunnableC0581p1(13, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f1204d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0410kg.f2888a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1196V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0410kg.f2888a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0410kg.m1698a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0410kg.f2889b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0200eu c0200eu = this.f1184J;
            if (c0200eu != null) {
                int i5 = rect.bottom;
                c0200eu.setBounds(rect.left, i5 - this.f1192R, rect.right, i5);
            }
            C0200eu c0200eu2 = this.f1185K;
            if (c0200eu2 != null) {
                int i6 = rect.bottom;
                c0200eu2.setBounds(rect.left, i6 - this.f1193S, rect.right, i6);
            }
            if (this.f1177C) {
                float textSize = this.f1204d.getTextSize();
                C0960za c0960za = this.f1239u0;
                if (c0960za.f5514h != textSize) {
                    c0960za.f5514h = textSize;
                    c0960za.m2793h(false);
                }
                int gravity = this.f1204d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0960za.f5513g != i7) {
                    c0960za.f5513g = i7;
                    c0960za.m2793h(false);
                }
                if (c0960za.f5511f != gravity) {
                    c0960za.f5511f = gravity;
                    c0960za.m2793h(false);
                }
                if (this.f1204d == null) {
                    throw new IllegalStateException();
                }
                boolean zM1311n = AbstractC0273gt.m1311n(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1197W;
                rect2.bottom = i8;
                int i9 = this.f1189O;
                if (i9 == 1) {
                    rect2.left = m774g(rect.left, zM1311n);
                    rect2.top = rect.top + this.f1190P;
                    rect2.right = m775h(rect.right, zM1311n);
                } else if (i9 != 2) {
                    rect2.left = m774g(rect.left, zM1311n);
                    rect2.top = getPaddingTop();
                    rect2.right = m775h(rect.right, zM1311n);
                } else {
                    rect2.left = this.f1204d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m770c();
                    rect2.right = rect.right - this.f1204d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0960za.f5507d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0960za.f5487M = true;
                }
                if (this.f1204d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0960za.f5489O;
                textPaint.setTextSize(c0960za.f5514h);
                textPaint.setTypeface(c0960za.f5527u);
                textPaint.setLetterSpacing(c0960za.f5497W);
                float f = -textPaint.ascent();
                rect2.left = this.f1204d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1189O != 1 || this.f1204d.getMinLines() > 1) ? rect.top + this.f1204d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f1204d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1189O != 1 || this.f1204d.getMinLines() > 1) ? rect.bottom - this.f1204d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0960za.f5505c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0960za.f5487M = true;
                }
                c0960za.m2793h(false);
                if (!m772e() || this.f1237t0) {
                    return;
                }
                m777j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f1175A0;
        C0189ej c0189ej = this.f1202c;
        if (!z) {
            c0189ej.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1175A0 = true;
        }
        if (this.f1236t != null && (editText = this.f1204d) != null) {
            this.f1236t.setGravity(editText.getGravity());
            this.f1236t.setPadding(this.f1204d.getCompoundPaddingLeft(), this.f1204d.getCompoundPaddingTop(), this.f1204d.getCompoundPaddingRight(), this.f1204d.getCompoundPaddingBottom());
        }
        c0189ej.m1047m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g60)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g60 g60Var = (g60) parcelable;
        super.onRestoreInstanceState(g60Var.f1344a);
        setError(g60Var.f2031c);
        if (g60Var.f2032d) {
            post(new RunnableC0919y6(10, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f1187M) {
            InterfaceC0148de interfaceC0148de = this.f1186L.f1879e;
            RectF rectF = this.f1199a0;
            float fMo940a = interfaceC0148de.mo940a(rectF);
            float fMo940a2 = this.f1186L.f1880f.mo940a(rectF);
            float fMo940a3 = this.f1186L.f1882h.mo940a(rectF);
            float fMo940a4 = this.f1186L.f1881g.mo940a(rectF);
            f30 f30Var = this.f1186L;
            AbstractC0346ip abstractC0346ip = f30Var.f1875a;
            AbstractC0346ip abstractC0346ip2 = f30Var.f1876b;
            AbstractC0346ip abstractC0346ip3 = f30Var.f1878d;
            AbstractC0346ip abstractC0346ip4 = f30Var.f1877c;
            C0819vh c0819vh = new C0819vh(0);
            C0819vh c0819vh2 = new C0819vh(0);
            C0819vh c0819vh3 = new C0819vh(0);
            C0819vh c0819vh4 = new C0819vh(0);
            C0169e c0169e = new C0169e(fMo940a2);
            C0169e c0169e2 = new C0169e(fMo940a);
            C0169e c0169e3 = new C0169e(fMo940a4);
            C0169e c0169e4 = new C0169e(fMo940a3);
            f30 f30Var2 = new f30();
            f30Var2.f1875a = abstractC0346ip2;
            f30Var2.f1876b = abstractC0346ip;
            f30Var2.f1877c = abstractC0346ip3;
            f30Var2.f1878d = abstractC0346ip4;
            f30Var2.f1879e = c0169e;
            f30Var2.f1880f = c0169e2;
            f30Var2.f1881g = c0169e4;
            f30Var2.f1882h = c0169e3;
            f30Var2.f1883i = c0819vh;
            f30Var2.f1884j = c0819vh2;
            f30Var2.f1885k = c0819vh3;
            f30Var2.f1886l = c0819vh4;
            this.f1187M = z;
            setShapeAppearanceModel(f30Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g60 g60Var = new g60(super.onSaveInstanceState());
        if (m779m()) {
            g60Var.f2031c = getError();
        }
        C0189ej c0189ej = this.f1202c;
        g60Var.f2032d = c0189ej.f1794i != 0 && c0189ej.f1792g.f1129d;
        return g60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m782p() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f1174A
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968800(0x7f0400e0, float:1.7546264E38)
            android.util.TypedValue r1 = p000.AbstractC0273gt.m1316y(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = p000.AbstractC0346ip.m1510v(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f1204d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = p000.AbstractC0207f0.m1109e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f1204d
            android.graphics.drawable.Drawable r1 = p000.AbstractC0207f0.m1109e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m779m()
            if (r2 != 0) goto L49
            g5 r2 = r4.f1226o
            if (r2 == 0) goto L4e
            boolean r2 = r4.f1222m
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f1176B
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            p000.AbstractC0104ch.m688h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m782p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m783q() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m783q():boolean");
    }

    /* JADX INFO: renamed from: r */
    public final void m784r() {
        Drawable background;
        C0249g5 c0249g5;
        EditText editText = this.f1204d;
        if (editText == null || this.f1189O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0187eh.f1774a;
        Drawable drawableMutate = background.mutate();
        if (m779m()) {
            drawableMutate.setColorFilter(C0768u3.m2405c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1222m && (c0249g5 = this.f1226o) != null) {
            drawableMutate.setColorFilter(C0768u3.m2405c(c0249g5.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f1204d.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m785s() {
        EditText editText = this.f1204d;
        if (editText == null || this.f1180F == null) {
            return;
        }
        if ((this.f1183I || editText.getBackground() == null) && this.f1189O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f1204d;
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2325q(editText2, editTextBoxBackground);
            this.f1183I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1195U != i) {
            this.f1195U = i;
            this.f1227o0 = i;
            this.f1231q0 = i;
            this.f1233r0 = i;
            m769b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0294hd.m1354a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1227o0 = defaultColor;
        this.f1195U = defaultColor;
        this.f1229p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1231q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1233r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m769b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1189O) {
            return;
        }
        this.f1189O = i;
        if (this.f1204d != null) {
            m776i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1190P = i;
    }

    public void setBoxCornerFamily(int i) {
        e30 e30VarM1139e = this.f1186L.m1139e();
        InterfaceC0148de interfaceC0148de = this.f1186L.f1879e;
        e30VarM1139e.f1693a = AbstractC0273gt.m1307h(i);
        e30VarM1139e.f1697e = interfaceC0148de;
        InterfaceC0148de interfaceC0148de2 = this.f1186L.f1880f;
        e30VarM1139e.f1694b = AbstractC0273gt.m1307h(i);
        e30VarM1139e.f1698f = interfaceC0148de2;
        InterfaceC0148de interfaceC0148de3 = this.f1186L.f1882h;
        e30VarM1139e.f1696d = AbstractC0273gt.m1307h(i);
        e30VarM1139e.f1700h = interfaceC0148de3;
        InterfaceC0148de interfaceC0148de4 = this.f1186L.f1881g;
        e30VarM1139e.f1695c = AbstractC0273gt.m1307h(i);
        e30VarM1139e.f1699g = interfaceC0148de4;
        this.f1186L = e30VarM1139e.m982a();
        m769b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1223m0 != i) {
            this.f1223m0 = i;
            m790x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1219k0 = colorStateList.getDefaultColor();
            this.f1235s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1221l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1223m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1223m0 != colorStateList.getDefaultColor()) {
            this.f1223m0 = colorStateList.getDefaultColor();
        }
        m790x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1225n0 != colorStateList) {
            this.f1225n0 = colorStateList;
            m790x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1192R = i;
        m790x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1193S = i;
        m790x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f1218k != z) {
            C0974zo c0974zo = this.f1216j;
            if (z) {
                C0249g5 c0249g5 = new C0249g5(getContext(), null);
                this.f1226o = c0249g5;
                c0249g5.setId(com.ljx.wechatmod.R.id.textinput_counter);
                Typeface typeface = this.f1201b0;
                if (typeface != null) {
                    this.f1226o.setTypeface(typeface);
                }
                this.f1226o.setMaxLines(1);
                c0974zo.m2804a(this.f1226o, 2);
                AbstractC0199et.m1076h((ViewGroup.MarginLayoutParams) this.f1226o.getLayoutParams(), getResources().getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_textinput_counter_margin_start));
                m781o();
                if (this.f1226o != null) {
                    EditText editText = this.f1204d;
                    m780n(editText != null ? editText.getText() : null);
                }
            } else {
                c0974zo.m2810g(this.f1226o, 2);
                this.f1226o = null;
            }
            this.f1218k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1220l != i) {
            if (i > 0) {
                this.f1220l = i;
            } else {
                this.f1220l = -1;
            }
            if (!this.f1218k || this.f1226o == null) {
                return;
            }
            EditText editText = this.f1204d;
            m780n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1228p != i) {
            this.f1228p = i;
            m781o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1248z != colorStateList) {
            this.f1248z = colorStateList;
            m781o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1230q != i) {
            this.f1230q = i;
            m781o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1246y != colorStateList) {
            this.f1246y = colorStateList;
            m781o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1174A != colorStateList) {
            this.f1174A = colorStateList;
            m782p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1176B != colorStateList) {
            this.f1176B = colorStateList;
            if (m779m() || (this.f1226o != null && this.f1222m)) {
                m782p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1215i0 = colorStateList;
        this.f1217j0 = colorStateList;
        if (this.f1204d != null) {
            m787u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m767k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f1202c.f1792g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f1202c.f1792g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0189ej c0189ej = this.f1202c;
        CharSequence text = i != 0 ? c0189ej.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0189ej c0189ej = this.f1202c;
        Drawable drawableM1196r = i != 0 ? AbstractC0222ff.m1196r(c0189ej.getContext(), i) : null;
        TextInputLayout textInputLayout = c0189ej.f1786a;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        checkableImageButton.setImageDrawable(drawableM1196r);
        if (drawableM1196r != null) {
            AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, c0189ej.f1796k, c0189ej.f1797l);
            AbstractC0222ff.m1165K(textInputLayout, checkableImageButton, c0189ej.f1796k);
        }
    }

    public void setEndIconMinSize(int i) {
        C0189ej c0189ej = this.f1202c;
        if (i < 0) {
            c0189ej.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0189ej.f1798m) {
            c0189ej.f1798m = i;
            CheckableImageButton checkableImageButton = c0189ej.f1792g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0189ej.f1788c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1202c.m1041g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0189ej c0189ej = this.f1202c;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        View.OnLongClickListener onLongClickListener = c0189ej.f1800o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1800o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1799n = scaleType;
        c0189ej.f1792g.setScaleType(scaleType);
        c0189ej.f1788c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0189ej c0189ej = this.f1202c;
        if (c0189ej.f1796k != colorStateList) {
            c0189ej.f1796k = colorStateList;
            AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1792g, colorStateList, c0189ej.f1797l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0189ej c0189ej = this.f1202c;
        if (c0189ej.f1797l != mode) {
            c0189ej.f1797l = mode;
            AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1792g, c0189ej.f1796k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f1202c.m1042h(z);
    }

    public void setError(CharSequence charSequence) {
        C0974zo c0974zo = this.f1216j;
        if (!c0974zo.f5594q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0974zo.m2809f();
            return;
        }
        c0974zo.m2806c();
        c0974zo.f5593p = charSequence;
        c0974zo.f5595r.setText(charSequence);
        int i = c0974zo.f5591n;
        if (i != 1) {
            c0974zo.f5592o = 1;
        }
        c0974zo.m2812i(i, c0974zo.f5592o, c0974zo.m2811h(c0974zo.f5595r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5597t = i;
        C0249g5 c0249g5 = c0974zo.f5595r;
        if (c0249g5 != null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            v90.m2499f(c0249g5, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5596s = charSequence;
        C0249g5 c0249g5 = c0974zo.f5595r;
        if (c0249g5 != null) {
            c0249g5.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0974zo c0974zo = this.f1216j;
        TextInputLayout textInputLayout = c0974zo.f5585h;
        if (c0974zo.f5594q == z) {
            return;
        }
        c0974zo.m2806c();
        if (z) {
            C0249g5 c0249g5 = new C0249g5(c0974zo.f5584g, null);
            c0974zo.f5595r = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_error);
            c0974zo.f5595r.setTextAlignment(5);
            Typeface typeface = c0974zo.f5577B;
            if (typeface != null) {
                c0974zo.f5595r.setTypeface(typeface);
            }
            int i = c0974zo.f5598u;
            c0974zo.f5598u = i;
            C0249g5 c0249g52 = c0974zo.f5595r;
            if (c0249g52 != null) {
                c0974zo.f5585h.m778l(c0249g52, i);
            }
            ColorStateList colorStateList = c0974zo.f5599v;
            c0974zo.f5599v = colorStateList;
            C0249g5 c0249g53 = c0974zo.f5595r;
            if (c0249g53 != null && colorStateList != null) {
                c0249g53.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0974zo.f5596s;
            c0974zo.f5596s = charSequence;
            C0249g5 c0249g54 = c0974zo.f5595r;
            if (c0249g54 != null) {
                c0249g54.setContentDescription(charSequence);
            }
            int i2 = c0974zo.f5597t;
            c0974zo.f5597t = i2;
            C0249g5 c0249g55 = c0974zo.f5595r;
            if (c0249g55 != null) {
                WeakHashMap weakHashMap = ja0.f2600a;
                v90.m2499f(c0249g55, i2);
            }
            c0974zo.f5595r.setVisibility(4);
            c0974zo.m2804a(c0974zo.f5595r, 0);
        } else {
            c0974zo.m2809f();
            c0974zo.m2810g(c0974zo.f5595r, 0);
            c0974zo.f5595r = null;
            textInputLayout.m784r();
            textInputLayout.m790x();
        }
        c0974zo.f5594q = z;
    }

    public void setErrorIconDrawable(int i) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.m1043i(i != 0 ? AbstractC0222ff.m1196r(c0189ej.getContext(), i) : null);
        AbstractC0222ff.m1165K(c0189ej.f1786a, c0189ej.f1788c, c0189ej.f1789d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0189ej c0189ej = this.f1202c;
        CheckableImageButton checkableImageButton = c0189ej.f1788c;
        View.OnLongClickListener onLongClickListener = c0189ej.f1791f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1791f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0189ej.f1788c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0189ej c0189ej = this.f1202c;
        if (c0189ej.f1789d != colorStateList) {
            c0189ej.f1789d = colorStateList;
            AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1788c, colorStateList, c0189ej.f1790e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0189ej c0189ej = this.f1202c;
        if (c0189ej.f1790e != mode) {
            c0189ej.f1790e = mode;
            AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1788c, c0189ej.f1789d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5598u = i;
        C0249g5 c0249g5 = c0974zo.f5595r;
        if (c0249g5 != null) {
            c0974zo.f5585h.m778l(c0249g5, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5599v = colorStateList;
        C0249g5 c0249g5 = c0974zo.f5595r;
        if (c0249g5 == null || colorStateList == null) {
            return;
        }
        c0249g5.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f1241v0 != z) {
            this.f1241v0 = z;
            m787u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0974zo c0974zo = this.f1216j;
        if (zIsEmpty) {
            if (c0974zo.f5601x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0974zo.f5601x) {
            setHelperTextEnabled(true);
        }
        c0974zo.m2806c();
        c0974zo.f5600w = charSequence;
        c0974zo.f5602y.setText(charSequence);
        int i = c0974zo.f5591n;
        if (i != 2) {
            c0974zo.f5592o = 2;
        }
        c0974zo.m2812i(i, c0974zo.f5592o, c0974zo.m2811h(c0974zo.f5602y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5576A = colorStateList;
        C0249g5 c0249g5 = c0974zo.f5602y;
        if (c0249g5 == null || colorStateList == null) {
            return;
        }
        c0249g5.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0974zo c0974zo = this.f1216j;
        TextInputLayout textInputLayout = c0974zo.f5585h;
        if (c0974zo.f5601x == z) {
            return;
        }
        c0974zo.m2806c();
        if (z) {
            C0249g5 c0249g5 = new C0249g5(c0974zo.f5584g, null);
            c0974zo.f5602y = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_helper_text);
            c0974zo.f5602y.setTextAlignment(5);
            Typeface typeface = c0974zo.f5577B;
            if (typeface != null) {
                c0974zo.f5602y.setTypeface(typeface);
            }
            c0974zo.f5602y.setVisibility(4);
            v90.m2499f(c0974zo.f5602y, 1);
            int i = c0974zo.f5603z;
            c0974zo.f5603z = i;
            C0249g5 c0249g52 = c0974zo.f5602y;
            if (c0249g52 != null) {
                c0249g52.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0974zo.f5576A;
            c0974zo.f5576A = colorStateList;
            C0249g5 c0249g53 = c0974zo.f5602y;
            if (c0249g53 != null && colorStateList != null) {
                c0249g53.setTextColor(colorStateList);
            }
            c0974zo.m2804a(c0974zo.f5602y, 1);
            c0974zo.f5602y.setAccessibilityDelegate(new C0937yo(c0974zo));
        } else {
            c0974zo.m2806c();
            int i2 = c0974zo.f5591n;
            if (i2 == 2) {
                c0974zo.f5592o = 0;
            }
            c0974zo.m2812i(i2, c0974zo.f5592o, c0974zo.m2811h(c0974zo.f5602y, ""));
            c0974zo.m2810g(c0974zo.f5602y, 1);
            c0974zo.f5602y = null;
            textInputLayout.m784r();
            textInputLayout.m790x();
        }
        c0974zo.f5601x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0974zo c0974zo = this.f1216j;
        c0974zo.f5603z = i;
        C0249g5 c0249g5 = c0974zo.f5602y;
        if (c0249g5 != null) {
            c0249g5.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1177C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f1243w0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1177C) {
            this.f1177C = z;
            if (z) {
                CharSequence hint = this.f1204d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1178D)) {
                        setHint(hint);
                    }
                    this.f1204d.setHint((CharSequence) null);
                }
                this.f1179E = true;
            } else {
                this.f1179E = false;
                if (!TextUtils.isEmpty(this.f1178D) && TextUtils.isEmpty(this.f1204d.getHint())) {
                    this.f1204d.setHint(this.f1178D);
                }
                setHintInternal(null);
            }
            if (this.f1204d != null) {
                m786t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0960za c0960za = this.f1239u0;
        TextInputLayout textInputLayout = c0960za.f5501a;
        a60 a60Var = new a60(textInputLayout.getContext(), i);
        ColorStateList colorStateList = a60Var.f55j;
        if (colorStateList != null) {
            c0960za.f5517k = colorStateList;
        }
        float f = a60Var.f56k;
        if (f != 0.0f) {
            c0960za.f5515i = f;
        }
        ColorStateList colorStateList2 = a60Var.f46a;
        if (colorStateList2 != null) {
            c0960za.f5495U = colorStateList2;
        }
        c0960za.f5493S = a60Var.f50e;
        c0960za.f5494T = a60Var.f51f;
        c0960za.f5492R = a60Var.f52g;
        c0960za.f5496V = a60Var.f54i;
        C0252g8 c0252g8 = c0960za.f5531y;
        if (c0252g8 != null) {
            c0252g8.f2037c = true;
        }
        C0431l0 c0431l0 = new C0431l0(6, c0960za);
        a60Var.m18a();
        c0960za.f5531y = new C0252g8(c0431l0, a60Var.f59n);
        a60Var.m20c(textInputLayout.getContext(), c0960za.f5531y);
        c0960za.m2793h(false);
        this.f1217j0 = c0960za.f5517k;
        if (this.f1204d != null) {
            m787u(false, false);
            m786t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f1217j0 != colorStateList) {
            if (this.f1215i0 == null) {
                C0960za c0960za = this.f1239u0;
                if (c0960za.f5517k != colorStateList) {
                    c0960za.f5517k = colorStateList;
                    c0960za.m2793h(false);
                }
            }
            this.f1217j0 = colorStateList;
            if (this.f1204d != null) {
                m787u(false, false);
            }
        }
    }

    public void setLengthCounter(f60 f60Var) {
        this.f1224n = f60Var;
    }

    public void setMaxEms(int i) {
        this.f1210g = i;
        EditText editText = this.f1204d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f1214i = i;
        EditText editText = this.f1204d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f1208f = i;
        EditText editText = this.f1204d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f1212h = i;
        EditText editText = this.f1204d;
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
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1792g.setContentDescription(i != 0 ? c0189ej.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1792g.setImageDrawable(i != 0 ? AbstractC0222ff.m1196r(c0189ej.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0189ej c0189ej = this.f1202c;
        if (z && c0189ej.f1794i != 1) {
            c0189ej.m1041g(1);
        } else if (z) {
            c0189ej.getClass();
        } else {
            c0189ej.m1041g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1796k = colorStateList;
        AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1792g, colorStateList, c0189ej.f1797l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.f1797l = mode;
        AbstractC0222ff.m1181a(c0189ej.f1786a, c0189ej.f1792g, c0189ej.f1796k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1236t == null) {
            C0249g5 c0249g5 = new C0249g5(getContext(), null);
            this.f1236t = c0249g5;
            c0249g5.setId(com.ljx.wechatmod.R.id.textinput_placeholder);
            s90.m2327s(this.f1236t, 2);
            C0599pj c0599pjM771d = m771d();
            this.f1242w = c0599pjM771d;
            c0599pjM771d.f4226b = 67L;
            this.f1244x = m771d();
            setPlaceholderTextAppearance(this.f1240v);
            setPlaceholderTextColor(this.f1238u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1234s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1232r = charSequence;
        }
        EditText editText = this.f1204d;
        m788v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1240v = i;
        C0249g5 c0249g5 = this.f1236t;
        if (c0249g5 != null) {
            c0249g5.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1238u != colorStateList) {
            this.f1238u = colorStateList;
            C0249g5 c0249g5 = this.f1236t;
            if (c0249g5 == null || colorStateList == null) {
                return;
            }
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        r40 r40Var = this.f1200b;
        r40Var.getClass();
        r40Var.f4197c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        r40Var.f4196b.setText(charSequence);
        r40Var.m2217e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1200b.f4196b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1200b.f4196b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(f30 f30Var) {
        C0200eu c0200eu = this.f1180F;
        if (c0200eu == null || c0200eu.f1842a.f1633a == f30Var) {
            return;
        }
        this.f1186L = f30Var;
        m769b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f1200b.f4198d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0222ff.m1196r(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        r40 r40Var = this.f1200b;
        if (i < 0) {
            r40Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != r40Var.f4201g) {
            r40Var.f4201g = i;
            CheckableImageButton checkableImageButton = r40Var.f4198d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        r40 r40Var = this.f1200b;
        CheckableImageButton checkableImageButton = r40Var.f4198d;
        View.OnLongClickListener onLongClickListener = r40Var.f4203i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r40 r40Var = this.f1200b;
        r40Var.f4203i = onLongClickListener;
        CheckableImageButton checkableImageButton = r40Var.f4198d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        r40 r40Var = this.f1200b;
        r40Var.f4202h = scaleType;
        r40Var.f4198d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        r40 r40Var = this.f1200b;
        if (r40Var.f4199e != colorStateList) {
            r40Var.f4199e = colorStateList;
            AbstractC0222ff.m1181a(r40Var.f4195a, r40Var.f4198d, colorStateList, r40Var.f4200f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        r40 r40Var = this.f1200b;
        if (r40Var.f4200f != mode) {
            r40Var.f4200f = mode;
            AbstractC0222ff.m1181a(r40Var.f4195a, r40Var.f4198d, r40Var.f4199e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f1200b.m2215c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0189ej c0189ej = this.f1202c;
        c0189ej.getClass();
        c0189ej.f1801p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0189ej.f1802q.setText(charSequence);
        c0189ej.m1048n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1202c.f1802q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1202c.f1802q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e60 e60Var) {
        EditText editText = this.f1204d;
        if (editText != null) {
            ja0.m1575l(editText, e60Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1201b0) {
            this.f1201b0 = typeface;
            this.f1239u0.m2798m(typeface);
            C0974zo c0974zo = this.f1216j;
            if (typeface != c0974zo.f5577B) {
                c0974zo.f5577B = typeface;
                C0249g5 c0249g5 = c0974zo.f5595r;
                if (c0249g5 != null) {
                    c0249g5.setTypeface(typeface);
                }
                C0249g5 c0249g52 = c0974zo.f5602y;
                if (c0249g52 != null) {
                    c0249g52.setTypeface(typeface);
                }
            }
            C0249g5 c0249g53 = this.f1226o;
            if (c0249g53 != null) {
                c0249g53.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m786t() {
        if (this.f1189O != 1) {
            FrameLayout frameLayout = this.f1198a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM770c = m770c();
            if (iM770c != layoutParams.topMargin) {
                layoutParams.topMargin = iM770c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m787u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0249g5 c0249g5;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f1204d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1204d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1215i0;
        C0960za c0960za = this.f1239u0;
        if (colorStateList2 != null) {
            c0960za.m2794i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f1215i0;
            c0960za.m2794i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1235s0) : this.f1235s0));
        } else if (m779m()) {
            C0249g5 c0249g52 = this.f1216j.f5595r;
            c0960za.m2794i(c0249g52 != null ? c0249g52.getTextColors() : null);
        } else if (this.f1222m && (c0249g5 = this.f1226o) != null) {
            c0960za.m2794i(c0249g5.getTextColors());
        } else if (z4 && (colorStateList = this.f1217j0) != null && c0960za.f5517k != colorStateList) {
            c0960za.f5517k = colorStateList;
            c0960za.m2793h(false);
        }
        C0189ej c0189ej = this.f1202c;
        r40 r40Var = this.f1200b;
        if (z3 || !this.f1241v0 || (isEnabled() && z4)) {
            if (z2 || this.f1237t0) {
                ValueAnimator valueAnimator = this.f1245x0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1245x0.cancel();
                }
                if (z && this.f1243w0) {
                    m768a(1.0f);
                } else {
                    c0960za.m2796k(1.0f);
                }
                this.f1237t0 = false;
                if (m772e()) {
                    m777j();
                }
                EditText editText3 = this.f1204d;
                m788v(editText3 != null ? editText3.getText() : null);
                r40Var.f4204j = false;
                r40Var.m2217e();
                c0189ej.f1803r = false;
                c0189ej.m1048n();
                return;
            }
            return;
        }
        if (z2 || !this.f1237t0) {
            ValueAnimator valueAnimator2 = this.f1245x0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1245x0.cancel();
            }
            if (z && this.f1243w0) {
                m768a(0.0f);
            } else {
                c0960za.m2796k(0.0f);
            }
            if (m772e() && !((C0066bf) this.f1180F).f811x.f137q.isEmpty() && m772e()) {
                ((C0066bf) this.f1180F).m554n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1237t0 = true;
            C0249g5 c0249g53 = this.f1236t;
            if (c0249g53 != null && this.f1234s) {
                c0249g53.setText((CharSequence) null);
                v70.m2490a(this.f1198a, this.f1244x);
                this.f1236t.setVisibility(4);
            }
            r40Var.f4204j = true;
            r40Var.m2217e();
            c0189ej.f1803r = true;
            c0189ej.m1048n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m788v(Editable editable) {
        ((C0368jb) this.f1224n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1198a;
        if (length != 0 || this.f1237t0) {
            C0249g5 c0249g5 = this.f1236t;
            if (c0249g5 == null || !this.f1234s) {
                return;
            }
            c0249g5.setText((CharSequence) null);
            v70.m2490a(frameLayout, this.f1244x);
            this.f1236t.setVisibility(4);
            return;
        }
        if (this.f1236t == null || !this.f1234s || TextUtils.isEmpty(this.f1232r)) {
            return;
        }
        this.f1236t.setText(this.f1232r);
        v70.m2490a(frameLayout, this.f1242w);
        this.f1236t.setVisibility(0);
        this.f1236t.bringToFront();
        announceForAccessibility(this.f1232r);
    }

    /* JADX INFO: renamed from: w */
    public final void m789w(boolean z, boolean z2) {
        int defaultColor = this.f1225n0.getDefaultColor();
        int colorForState = this.f1225n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1225n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f1194T = colorForState2;
        } else if (z2) {
            this.f1194T = colorForState;
        } else {
            this.f1194T = defaultColor;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m790x() {
        C0249g5 c0249g5;
        EditText editText;
        EditText editText2;
        if (this.f1180F == null || this.f1189O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f1204d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1204d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f1194T = this.f1235s0;
        } else if (m779m()) {
            if (this.f1225n0 != null) {
                m789w(z2, z);
            } else {
                this.f1194T = getErrorCurrentTextColors();
            }
        } else if (!this.f1222m || (c0249g5 = this.f1226o) == null) {
            if (z2) {
                this.f1194T = this.f1223m0;
            } else if (z) {
                this.f1194T = this.f1221l0;
            } else {
                this.f1194T = this.f1219k0;
            }
        } else if (this.f1225n0 != null) {
            m789w(z2, z);
        } else {
            this.f1194T = c0249g5.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m782p();
        }
        C0189ej c0189ej = this.f1202c;
        TextInputLayout textInputLayout = c0189ej.f1786a;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        TextInputLayout textInputLayout2 = c0189ej.f1786a;
        c0189ej.m1046l();
        AbstractC0222ff.m1165K(textInputLayout2, c0189ej.f1788c, c0189ej.f1789d);
        AbstractC0222ff.m1165K(textInputLayout2, checkableImageButton, c0189ej.f1796k);
        if (c0189ej.m1036b() instanceof C0597ph) {
            if (!textInputLayout.m779m() || checkableImageButton.getDrawable() == null) {
                AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, c0189ej.f1796k, c0189ej.f1797l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                AbstractC0104ch.m687g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        r40 r40Var = this.f1200b;
        AbstractC0222ff.m1165K(r40Var.f4195a, r40Var.f4198d, r40Var.f4199e);
        if (this.f1189O == 2) {
            int i = this.f1191Q;
            if (z2 && isEnabled()) {
                this.f1191Q = this.f1193S;
            } else {
                this.f1191Q = this.f1192R;
            }
            if (this.f1191Q != i && m772e() && !this.f1237t0) {
                if (m772e()) {
                    ((C0066bf) this.f1180F).m554n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m777j();
            }
        }
        if (this.f1189O == 1) {
            if (!isEnabled()) {
                this.f1195U = this.f1229p0;
            } else if (z && !z2) {
                this.f1195U = this.f1233r0;
            } else if (z2) {
                this.f1195U = this.f1231q0;
            } else {
                this.f1195U = this.f1227o0;
            }
        }
        m769b();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1200b.f4198d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1200b.m2214b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1202c.f1792g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1202c.f1792g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1202c.m1043i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1202c.f1792g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0189ej c0189ej = this.f1202c;
        TextInputLayout textInputLayout = c0189ej.f1786a;
        CheckableImageButton checkableImageButton = c0189ej.f1792g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, c0189ej.f1796k, c0189ej.f1797l);
            AbstractC0222ff.m1165K(textInputLayout, checkableImageButton, c0189ej.f1796k);
        }
    }
}
