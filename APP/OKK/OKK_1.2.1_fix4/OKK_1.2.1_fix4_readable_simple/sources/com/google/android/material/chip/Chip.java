package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import org.luckypray.dexkit.C1031R;
import p002B.C0052b;
import p002B.C0057g;
import p003B0.AbstractC0059a;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p037U.AbstractC0358S;
import p057g.AbstractC0920p;
import p058g0.AbstractC0942a;
import p060h0.C0946b;
import p074o0.C1025a;
import p074o0.C1026b;
import p074o0.C1027c;
import p074o0.C1028d;
import p074o0.C1030f;
import p074o0.InterfaceC1029e;
import p081s0.AbstractC1077k;
import p081s0.C1075i;
import p081s0.InterfaceC1071e;
import p084u0.C1099d;
import p086v0.AbstractC1110a;
import p087w.AbstractC1112b;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;
import p089x0.C1127k;
import p089x0.InterfaceC1138v;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AbstractC0920p implements InterfaceC1029e, InterfaceC1138v, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f2367w = null;

    /* JADX INFO: renamed from: x */
    public static final int[] f2368x = null;

    /* JADX INFO: renamed from: y */
    public static final int[] f2369y = null;

    /* JADX INFO: renamed from: e */
    public C1030f f2370e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f2371f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f2372g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f2373h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2374i;

    /* JADX INFO: renamed from: j */
    public boolean f2375j;

    /* JADX INFO: renamed from: k */
    public boolean f2376k;

    /* JADX INFO: renamed from: l */
    public boolean f2377l;

    /* JADX INFO: renamed from: m */
    public boolean f2378m;

    /* JADX INFO: renamed from: n */
    public boolean f2379n;

    /* JADX INFO: renamed from: o */
    public int f2380o;

    /* JADX INFO: renamed from: p */
    public int f2381p;

    /* JADX INFO: renamed from: q */
    public CharSequence f2382q;

    /* JADX INFO: renamed from: r */
    public final C1028d f2383r;

    /* JADX INFO: renamed from: s */
    public boolean f2384s;

    /* JADX INFO: renamed from: t */
    public final Rect f2385t;

    /* JADX INFO: renamed from: u */
    public final RectF f2386u;

    /* JADX INFO: renamed from: v */
    public final C1026b f2387v;

    static {
        f2367w = new Rect();
        f2368x = new int[]{R.attr.state_selected};
        f2369y = new int[]{R.attr.state_checkable};
    }

    public Chip(Context r17, AttributeSet r18) {
        super(AbstractC0059a.m197a(r17, r18, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action), r18);
        this.f2385t = new Rect();
        this.f2386u = new RectF();
        this.f2387v = new C1026b(0, this);
        Context r9 = getContext();
        if (r18 == null) goto L22;
        r18.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) goto L126;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) goto L124;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) goto L122;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) goto L120;
        if (r18.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) == false) goto L118;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1) goto L118;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1) goto L118;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) goto L118;
        r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    L118:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    L120:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L122:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L124:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    L126:
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    L22:
        C1030f r12 = new C1030f(r9, r18);
        int[] r13 = AbstractC0942a.f3331c;
        Context r15 = r12.f3815e0;
        AbstractC1077k.m2553a(r15, r18, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(r15, r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r1 = r15.obtainStyledAttributes(r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        r12.f3790F0 = r1.hasValue(37);
        ColorStateList r2 = AbstractC0805P.m2051r(r15, r1, 24);
        if (r12.f3834x == r2) goto L25;
        r12.f3834x = r2;
        r12.onStateChange(r12.getState());
    L25:
        ColorStateList r22 = AbstractC0805P.m2051r(r15, r1, 11);
        if (r12.f3836y == r22) goto L28;
        r12.f3836y = r22;
        r12.onStateChange(r12.getState());
    L28:
        float r23 = r1.getDimension(19, 0.0f);
        if (r12.f3838z == r23) goto L32;
        r12.f3838z = r23;
        r12.invalidateSelf();
        r12.m2506v();
    L32:
        if (r1.hasValue(12) == false) goto L34;
        r12.m2481B(r1.getDimension(12, 0.0f));
    L34:
        r12.m2486G(AbstractC0805P.m2051r(r15, r1, 22));
        r12.m2487H(r1.getDimension(23, 0.0f));
        r12.m2496Q(AbstractC0805P.m2051r(r15, r1, 36));
        CharSequence r24 = r1.getText(5);
        if (r24 != null) goto L38;
        r24 = "";
    L38:
        if (TextUtils.equals(r12.f3787E, r24) == true) goto L41;
        r12.f3787E = r24;
        r12.f3821k0.f4175d = true;
        r12.invalidateSelf();
        r12.m2506v();
    L41:
        if (r1.hasValue(0) == false) goto L45;
        int r25 = r1.getResourceId(0, 0);
        if (r25 == 0) goto L45;
        C1099d r5 = new C1099d(r15, r25);
    L46:
        r5.f4243k = r1.getDimension(1, r5.f4243k);
        r12.m2497R(r5);
        int r52 = r1.getInt(3, 0);
        if (r52 != 1) goto L49;
        r12.f3784C0 = TextUtils.TruncateAt.START;
    L55:
        r12.m2485F(r1.getBoolean(18, false));
        if (r18 != null) goto L58;
    L62:
        r12.m2482C(AbstractC0805P.m2052t(r15, r1, 14));
        if (r1.hasValue(17) == false) goto L65;
        r12.m2484E(AbstractC0805P.m2051r(r15, r1, 17));
    L65:
        r12.m2483D(r1.getDimension(16, -1.0f));
        r12.m2493N(r1.getBoolean(31, false));
        if (r18 != null) goto L68;
    L72:
        r12.m2488I(AbstractC0805P.m2052t(r15, r1, 25));
        r12.m2492M(AbstractC0805P.m2051r(r15, r1, 30));
        r12.m2490K(r1.getDimension(28, 0.0f));
        r12.m2508x(r1.getBoolean(6, false));
        r12.m2480A(r1.getBoolean(10, false));
        if (r18 != null) goto L75;
    L79:
        r12.m2509y(AbstractC0805P.m2052t(r15, r1, 7));
        if (r1.hasValue(9) == false) goto L83;
        r12.m2510z(AbstractC0805P.m2051r(r15, r1, 9));
    L83:
        if (r1.hasValue(39) == false) goto L87;
        int r26 = r1.getResourceId(39, 0);
        if (r26 == 0) goto L87;
        C0946b r27 = C0946b.m2278a(r15, r26);
    L88:
        r12.f3805U = r27;
        if (r1.hasValue(33) == false) goto L93;
        int r28 = r1.getResourceId(33, 0);
        if (r28 == 0) goto L93;
        C0946b r4 = C0946b.m2278a(r15, r28);
    L94:
        r12.f3806V = r4;
        float r29 = r1.getDimension(21, 0.0f);
        if (r12.f3807W == r29) goto L97;
        r12.f3807W = r29;
        r12.invalidateSelf();
        r12.m2506v();
    L97:
        r12.m2495P(r1.getDimension(35, 0.0f));
        r12.m2494O(r1.getDimension(34, 0.0f));
        float r210 = r1.getDimension(41, 0.0f);
        if (r12.f3810Z == r210) goto L100;
        r12.f3810Z = r210;
        r12.invalidateSelf();
        r12.m2506v();
    L100:
        float r211 = r1.getDimension(40, 0.0f);
        if (r12.f3811a0 == r211) goto L103;
        r12.f3811a0 = r211;
        r12.invalidateSelf();
        r12.m2506v();
    L103:
        r12.m2491L(r1.getDimension(29, 0.0f));
        r12.m2489J(r1.getDimension(27, 0.0f));
        float r212 = r1.getDimension(13, 0.0f);
        if (r12.f3814d0 == r212) goto L106;
        r12.f3814d0 = r212;
        r12.invalidateSelf();
        r12.m2506v();
    L106:
        r12.f3788E0 = r1.getDimensionPixelSize(4, Integer.MAX_VALUE);
        r1.recycle();
        AbstractC1077k.m2553a(r9, r18, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(r9, r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r14 = r9.obtainStyledAttributes(r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        this.f2379n = r14.getBoolean(32, false);
        this.f2381p = (int) Math.ceil(r14.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        r14.recycle();
        setChipDrawable(r12);
        r12.m2650j(AbstractC0070G.m219i(this));
        AbstractC1077k.m2553a(r9, r18, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1077k.m2554b(r9, r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r16 = r9.obtainStyledAttributes(r18, r13, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action);
        boolean r213 = r16.hasValue(37);
        r16.recycle();
        this.f2383r = new C1028d(this, this);
        m1872e();
        if (r213 == true) goto L109;
        setOutlineProvider(new C1027c(this));
    L109:
        setChecked(this.f2375j);
        setText(r12.f3787E);
        setEllipsize(r12.f3784C0);
        m1875h();
        if (this.f2370e.f3786D0 == true) goto L112;
        setLines(1);
        setHorizontallyScrolling(true);
    L112:
        setGravity(8388627);
        m1874g();
        if (this.f2379n == false) goto L115;
        setMinHeight(this.f2381p);
    L115:
        this.f2380o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C1025a(this));
        return;
    L93:
        r4 = null;
    L87:
        r27 = null;
        goto L88
    L75:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null) goto L79;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null) goto L79;
        r12.m2480A(r1.getBoolean(8, false));
        goto L79
    L68:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null) goto L72;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null) goto L72;
        r12.m2493N(r1.getBoolean(26, false));
        goto L72
    L58:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null) goto L62;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null) goto L62;
        r12.m2485F(r1.getBoolean(15, false));
        goto L62
    L49:
        if (r52 == 2) goto L53;
        if (r52 != 3) goto L55;
        r12.f3784C0 = TextUtils.TruncateAt.END;
        goto L55
    L53:
        r12.f3784C0 = TextUtils.TruncateAt.MIDDLE;
    L45:
        r5 = null;
        goto L46
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Rect m1868a(Chip r02) {
        return r02.getCloseIconTouchBoundsInt();
    }

    private RectF getCloseIconTouchBounds() {
        RectF r02 = this.f2386u;
        r02.setEmpty();
        if (m1870c() == true) goto L5;
    L13:
        return r02;
    L5:
        if (this.f2373h == null) goto L13;
        C1030f r1 = this.f2370e;
        Rect r2 = r1.getBounds();
        r02.setEmpty();
        if (r1.m2500U() == false) goto L13;
        float r3 = (((r1.f3814d0 + r1.f3813c0) + r1.f3799O) + r1.f3812b0) + r1.f3811a0;
        if (AbstractC1112b.m2628a(r1) != 0) goto L11;
        float r12 = r2.right;
        r02.right = r12;
        r02.left = r12 - r3;
    L12:
        r02.top = r2.top;
        r02.bottom = r2.bottom;
        goto L13
    L11:
        float r13 = r2.left;
        r02.left = r13;
        r02.right = r13 + r3;
        goto L12
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF r02 = getCloseIconTouchBounds();
        int r1 = (int) r02.left;
        int r2 = (int) r02.top;
        int r3 = (int) r02.right;
        int r03 = (int) r02.bottom;
        Rect r4 = this.f2385t;
        r4.set(r1, r2, r3, r03);
        return r4;
    }

    private C1099d getTextAppearance() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3821k0.f4177f;
    }

    private void setCloseIconHovered(boolean r2) {
        if (this.f2377l == r2) goto L6;
        this.f2377l = r2;
        refreshDrawableState();
        return;
    }

    private void setCloseIconPressed(boolean r2) {
        if (this.f2376k == r2) goto L6;
        this.f2376k = r2;
        refreshDrawableState();
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m1869b(int r11) {
        this.f2381p = r11;
        int r2 = 0;
        if (this.f2379n == true) goto L10;
        InsetDrawable r112 = this.f2371f;
        if (r112 == null) goto L8;
        if (r112 == null) goto L44;
        this.f2371f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        m1873f();
        return;
    L44:
        return;
    L8:
        m1873f();
        return;
    L10:
        int r02 = Math.max(0, r11 - ((int) this.f2370e.f3838z));
        int r3 = Math.max(0, r11 - this.f2370e.getIntrinsicWidth());
        if (r3 > 0) goto L19;
        if (r02 > 0) goto L19;
        InsetDrawable r113 = this.f2371f;
        if (r113 == null) goto L17;
        if (r113 == null) goto L46;
        this.f2371f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        m1873f();
        return;
    L46:
        return;
    L17:
        m1873f();
        return;
    L19:
        if (r3 <= 0) goto L21;
        int r8 = r3 / 2;
    L22:
        if (r02 <= 0) goto L24;
        r2 = r02 / 2;
    L24:
        int r9 = r2;
        if (this.f2371f == null) goto L37;
        Rect r03 = new Rect();
        this.f2371f.getPadding(r03);
        if (r03.top != r9) goto L37;
        if (r03.bottom != r9) goto L37;
        if (r03.left != r8) goto L37;
        if (r03.right != r8) goto L37;
        m1873f();
        return;
    L37:
        if (getMinHeight() == r11) goto L40;
        setMinHeight(r11);
    L40:
        if (getMinWidth() == r11) goto L42;
        setMinWidth(r11);
    L42:
        this.f2371f = new InsetDrawable(this.f2370e, r8, r9, r8, r9);
        m1873f();
        return;
    L21:
        r8 = 0;
        goto L22
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1870c() {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L12;
        Object r03 = r02.f3796L;
        if (r03 != null) goto L7;
        r03 = null;
    L10:
        if (r03 == null) goto L12;
        return true;
    L7:
        if ((r03 instanceof InterfaceC1114d) == false) goto L10;
        ((AbstractC1115e) ((InterfaceC1114d) r03)).getClass();
        r03 = null;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1871d() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
    L7:
        return false;
    L5:
        if (r02.f3801Q == false) goto L7;
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent r10) {
        if (this.f2384s == false) goto L5;
        C1028d r02 = this.f2383r;
        AccessibilityManager r1 = r02.f491h;
        if (r1.isEnabled() == false) goto L36;
        if (r1.isTouchExplorationEnabled() == false) goto L36;
        int r12 = r10.getAction();
        if (r12 != 7) goto L14;
    L23:
        float r13 = r10.getX();
        float r5 = r10.getY();
        Chip r7 = r02.f3776q;
        if (r7.m1870c() == true) goto L26;
    L28:
        int r14 = 0;
    L29:
        int r52 = r02.f496m;
        if (r52 == r14) goto L33;
        r02.f496m = r14;
        r02.m668q(r14, 128);
        r02.m668q(r52, 256);
    L33:
        if (r14 == Integer.MIN_VALUE) goto L36;
        return true;
    L26:
        if (r7.getCloseIconTouchBounds().contains(r13, r5) == false) goto L28;
        r14 = 1;
        goto L29
    L14:
        if (r12 == 9) goto L23;
        if (r12 != 10) goto L36;
        int r15 = r02.f496m;
        if (r15 == Integer.MIN_VALUE) goto L36;
        if (r15 == Integer.MIN_VALUE) goto L41;
        r02.f496m = Integer.MIN_VALUE;
        r02.m668q(r15, 256);
        return true;
    L41:
        return true;
    L36:
        if (super.dispatchHoverEvent(r10) == false) goto L39;
        return true;
    L39:
        return false;
    L5:
        return super.dispatchHoverEvent(r10);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r10) {
        if (this.f2384s == false) goto L5;
        C1028d r02 = this.f2383r;
        r02.getClass();
        boolean r2 = false;
        int r22 = 0;
        r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        if (r10.getAction() == 1) goto L54;
        int r1 = r10.getKeyCode();
        if (r1 == 61) goto L49;
        int r5 = 66;
        if (r1 == 66) goto L32;
        switch(r1) {
            case 19: goto L15;
            case 20: goto L15;
            case 21: goto L15;
            case 22: goto L15;
            case 23: goto L32;
            default: goto L54;
        };
    L15:
        if (r10.hasNoModifiers() == false) goto L54;
        if (r1 != 19) goto L19;
        r5 = 33;
    L25:
        int r12 = r10.getRepeatCount() + 1;
        boolean r7 = false;
    L26:
        if (r22 >= r12) goto L30;
        if (r02.m664m(r5, null) == false) goto L30;
        r22 = r22 + 1;
        r7 = true;
    L30:
        r2 = r7;
        goto L54
    L19:
        if (r1 != 21) goto L21;
        r5 = 17;
        goto L25
    L21:
        if (r1 == 22) goto L25;
        r5 = 130;
    L32:
        if (r10.hasNoModifiers() == false) goto L54;
        if (r10.getRepeatCount() != 0) goto L54;
        int r13 = r02.f495l;
        if (r13 == Integer.MIN_VALUE) goto L47;
        Chip r52 = r02.f3776q;
        if (r13 != 0) goto L40;
        r52.performClick();
        goto L47
    L40:
        if (r13 != 1) goto L47;
        r52.playSoundEffect(0);
        View.OnClickListener r14 = r52.f2373h;
        if (r14 == null) goto L45;
        r14.onClick(r52);
    L45:
        if (r52.f2384s == false) goto L47;
        r52.f2383r.m668q(1, 1);
    L47:
        r2 = true;
        goto L54
    L49:
        if (r10.hasNoModifiers() == false) goto L52;
        r2 = r02.m664m(2, null);
        goto L54
    L52:
        if (r10.hasModifiers(1) == false) goto L54;
        r2 = r02.m664m(1, null);
    L54:
        if (r2 == false) goto L59;
        if (r02.f495l == Integer.MIN_VALUE) goto L59;
        return true;
    L59:
        return super.dispatchKeyEvent(r10);
    L5:
        return super.dispatchKeyEvent(r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p057g.AbstractC0920p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1030f r02 = this.f2370e;
        boolean r1 = false;
        if (r02 != null) goto L5;
    L39:
        if (r1 == false) goto L42;
        invalidate();
        return;
    L42:
        return;
    L5:
        if (C1030f.m2479u(r02.f3796L) == false) goto L39;
        C1030f r03 = this.f2370e;
        ?? r2 = isEnabled();
        int r22 = r2;
        if (this.f2378m == false) goto L9;
        r22 = r2 + 1;
    L9:
        int r23 = r22;
        if (this.f2377l == false) goto L12;
        r23 = r22 + 1;
    L12:
        int r24 = r23;
        if (this.f2376k == false) goto L15;
        r24 = r23 + 1;
    L15:
        int r25 = r24;
        if (isChecked() == false) goto L18;
        r25 = r24 + 1;
    L18:
        int[] r26 = new int[r25];
        if (isEnabled() == false) goto L21;
        r26[0] = 16842910;
        int r3 = 1;
    L23:
        if (this.f2378m == false) goto L26;
        r26[r3] = 16842908;
        r3 = r3 + 1;
    L26:
        if (this.f2377l == false) goto L29;
        r26[r3] = 16843623;
        r3 = r3 + 1;
    L29:
        if (this.f2376k == false) goto L32;
        r26[r3] = 16842919;
        r3 = r3 + 1;
    L32:
        if (isChecked() == false) goto L35;
        r26[r3] = 16842913;
    L35:
        if (Arrays.equals(r03.f3837y0, r26) == true) goto L39;
        r03.f3837y0 = r26;
        if (r03.m2500U() == false) goto L39;
        r1 = r03.m2507w(r03.getState(), r26);
        goto L39
    L21:
        r3 = 0;
        goto L23
    }

    /* JADX INFO: renamed from: e */
    public final void m1872e() {
        if (m1870c() == false) goto L11;
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L11;
        if (r02.f3795K == false) goto L11;
        if (this.f2373h == null) goto L11;
        AbstractC0080Q.m291j(this, this.f2383r);
        this.f2384s = true;
        return;
    L11:
        AbstractC0080Q.m291j(this, null);
        this.f2384s = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m1873f() {
        this.f2372g = new RippleDrawable(AbstractC1110a.m2618a(this.f2370e.f3785D), getBackgroundDrawable(), null);
        C1030f r02 = this.f2370e;
        if (r02.f3839z0 == false) goto L5;
        r02.f3839z0 = false;
        r02.f3780A0 = null;
        r02.onStateChange(r02.getState());
    L5:
        RippleDrawable r03 = this.f2372g;
        Field r1 = AbstractC0080Q.f219a;
        setBackground(r03);
        m1874g();
    }

    /* JADX INFO: renamed from: g */
    public final void m1874g() {
        if (TextUtils.isEmpty(getText()) == true) goto L12;
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L13;
        float r1 = r02.f3814d0 + r02.f3811a0;
        int r03 = (int) (r02.m2504r() + r1);
        C1030f r12 = this.f2370e;
        float r2 = r12.f3807W + r12.f3810Z;
        int r13 = (int) (r12.m2503q() + r2);
        if (this.f2371f == null) goto L10;
        Rect r22 = new Rect();
        this.f2371f.getPadding(r22);
        r13 = r13 + r22.left;
        r03 = r03 + r22.right;
    L10:
        int r23 = getPaddingTop();
        int r3 = getPaddingBottom();
        Field r4 = AbstractC0080Q.f219a;
        setPaddingRelative(r13, r23, r03, r3);
        return;
    L13:
        return;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (TextUtils.isEmpty(this.f2382q) == true) goto L7;
        return this.f2382q;
    L7:
        if (m1871d() == false) goto L11;
        getParent();
        return "android.widget.Button";
    L11:
        if (isClickable() == false) goto L13;
        return "android.widget.Button";
    L13:
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable r02 = this.f2371f;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return this.f2370e;
    }

    public Drawable getCheckedIcon() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3803S;
    }

    public ColorStateList getCheckedIconTint() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3804T;
    }

    public ColorStateList getChipBackgroundColor() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3836y;
    }

    public float getChipCornerRadius() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return 0.0f;
    L5:
        return Math.max(0.0f, r02.m2505s());
    }

    public Drawable getChipDrawable() {
        return this.f2370e;
    }

    public float getChipEndPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3814d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L11;
        Drawable r03 = r02.f3791G;
        if (r03 != 0) goto L7;
        return null;
    L7:
        if ((r03 instanceof InterfaceC1114d) == false) goto L10;
        ((AbstractC1115e) ((InterfaceC1114d) r03)).getClass();
        return null;
    L10:
        return r03;
    L11:
        return null;
    }

    public float getChipIconSize() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3793I;
    }

    public ColorStateList getChipIconTint() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3792H;
    }

    public float getChipMinHeight() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3838z;
    }

    public float getChipStartPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3807W;
    }

    public ColorStateList getChipStrokeColor() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3781B;
    }

    public float getChipStrokeWidth() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3783C;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L11;
        Drawable r03 = r02.f3796L;
        if (r03 != 0) goto L7;
        return null;
    L7:
        if ((r03 instanceof InterfaceC1114d) == false) goto L10;
        ((AbstractC1115e) ((InterfaceC1114d) r03)).getClass();
        return null;
    L10:
        return r03;
    L11:
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3800P;
    }

    public float getCloseIconEndPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3813c0;
    }

    public float getCloseIconSize() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3799O;
    }

    public float getCloseIconStartPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3812b0;
    }

    public ColorStateList getCloseIconTint() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3798N;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3784C0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect r4) {
        if (this.f2384s == false) goto L9;
        C1028d r02 = this.f2383r;
        if (r02.f495l != 1) goto L7;
    L8:
        r4.set(getCloseIconTouchBoundsInt());
        return;
    L7:
        if (r02.f494k == 1) goto L8;
    L9:
        super.getFocusedRect(r4);
    }

    public C0946b getHideMotionSpec() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3806V;
    }

    public float getIconEndPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3809Y;
    }

    public float getIconStartPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3808X;
    }

    public ColorStateList getRippleColor() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3785D;
    }

    public C1127k getShapeAppearanceModel() {
        return this.f2370e.f4312a.f4290a;
    }

    public C0946b getShowMotionSpec() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3805U;
    }

    public float getTextEndPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3811a0;
    }

    public float getTextStartPadding() {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        return r02.f3810Z;
    }

    /* JADX INFO: renamed from: h */
    public final void m1875h() {
        TextPaint r02 = getPaint();
        C1030f r1 = this.f2370e;
        if (r1 == null) goto L5;
        r02.drawableState = r1.getState();
    L5:
        C1099d r12 = getTextAppearance();
        if (r12 == null) goto L9;
        r12.m2589e(getContext(), r02, this.f2387v);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0805P.m2042V(this, this.f2370e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (isChecked() == false) goto L6;
        View.mergeDrawableStates(r22, f2368x);
    L6:
        if (m1871d() == false) goto L8;
        View.mergeDrawableStates(r22, f2369y);
    L8:
        return r22;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r4, int r5, Rect r6) {
        super.onFocusChanged(r4, r5, r6);
        if (this.f2384s == false) goto L10;
        C1028d r02 = this.f2383r;
        int r1 = r02.f495l;
        if (r1 == Integer.MIN_VALUE) goto L7;
        r02.m661j(r1);
    L7:
        if (r4 == false) goto L11;
        r02.m664m(r5, r6);
        return;
    L11:
        return;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r4) {
        int r02 = r4.getActionMasked();
        if (r02 != 7) goto L5;
        setCloseIconHovered(getCloseIconTouchBounds().contains(r4.getX(), r4.getY()));
    L10:
        return super.onHoverEvent(r4);
    L5:
        if (r02 != 10) goto L10;
        setCloseIconHovered(false);
        goto L10
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(getAccessibilityClassName());
        r2.setCheckable(m1871d());
        r2.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent r4, int r5) {
        if (getCloseIconTouchBounds().contains(r4.getX(), r4.getY()) == false) goto L9;
        if (isEnabled() == false) goto L9;
        return PointerIcon.getSystemIcon(getContext(), 1002);
    L9:
        return super.onResolvePointerIcon(r4, r5);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int r2) {
        super.onRtlPropertiesChanged(r2);
        if (this.f2380o == r2) goto L6;
        this.f2380o = r2;
        m1874g();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r6) {
        int r02 = r6.getActionMasked();
        boolean r1 = getCloseIconTouchBounds().contains(r6.getX(), r6.getY());
        if (r02 == 0) goto L26;
        if (r02 == 1) goto L16;
        if (r02 == 2) goto L11;
        if (r02 != 3) goto L28;
    L24:
        boolean r03 = false;
    L25:
        setCloseIconPressed(false);
    L29:
        if (r03 == true) goto L33;
        if (super.onTouchEvent(r6) == true) goto L33;
        return false;
    L33:
        return true;
    L28:
        r03 = false;
        goto L29
    L11:
        if (this.f2376k == false) goto L28;
        if (r1 == true) goto L14;
        setCloseIconPressed(false);
    L14:
        r03 = true;
        goto L29
    L16:
        if (this.f2376k == false) goto L24;
        playSoundEffect(0);
        View.OnClickListener r04 = this.f2373h;
        if (r04 == null) goto L21;
        r04.onClick(this);
    L21:
        if (this.f2384s == false) goto L23;
        this.f2383r.m668q(1, 1);
    L23:
        r03 = true;
        goto L25
    L26:
        if (r1 == false) goto L28;
        setCloseIconPressed(true);
        goto L14
    }

    public void setAccessibilityClassName(CharSequence r1) {
        this.f2382q = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L7:
        super.setBackground(r2);
        return;
    L5:
        if (r2 == this.f2372g) goto L7;
    }

    @Override // android.view.View
    public void setBackgroundColor(int r1) {
    }

    @Override // p057g.AbstractC0920p, android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L7:
        super.setBackgroundDrawable(r2);
        return;
    L5:
        if (r2 == this.f2372g) goto L7;
    }

    @Override // p057g.AbstractC0920p, android.view.View
    public void setBackgroundResource(int r1) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r1) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r1) {
    }

    public void setCheckable(boolean r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2508x(r2);
        return;
    }

    public void setCheckableResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2508x(r02.f3815e0.getResources().getBoolean(r3));
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L6;
        this.f2375j = r2;
        return;
    L6:
        if (r02.f3801Q == false) goto L10;
        super.setChecked(r2);
        return;
    }

    public void setCheckedIcon(Drawable r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2509y(r2);
        return;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean r1) {
        setCheckedIconVisible(r1);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int r1) {
        setCheckedIconVisible(r1);
    }

    public void setCheckedIconResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2509y(AbstractC0358S.m916w(r02.f3815e0, r3));
        return;
    }

    public void setCheckedIconTint(ColorStateList r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2510z(r2);
        return;
    }

    public void setCheckedIconTintResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2510z(AbstractC0805P.m2049p(r02.f3815e0, r3));
        return;
    }

    public void setCheckedIconVisible(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2480A(r02.f3815e0.getResources().getBoolean(r3));
        return;
    }

    public void setChipBackgroundColor(ColorStateList r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3836y == r3) goto L9;
        r02.f3836y = r3;
        r02.onStateChange(r02.getState());
        return;
    }

    public void setChipBackgroundColorResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        ColorStateList r32 = AbstractC0805P.m2049p(r02.f3815e0, r3);
        if (r02.f3836y == r32) goto L9;
        r02.f3836y = r32;
        r02.onStateChange(r02.getState());
        return;
    L9:
        return;
    }

    @Deprecated
    public void setChipCornerRadius(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2481B(r2);
        return;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2481B(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setChipDrawable(C1030f r4) {
        C1030f r02 = this.f2370e;
        if (r02 == r4) goto L8;
        if (r02 == null) goto L6;
        r02.f3782B0 = new WeakReference(null);
    L6:
        this.f2370e = r4;
        r4.f3786D0 = false;
        r4.f3782B0 = new WeakReference(this);
        m1869b(this.f2381p);
        return;
    }

    public void setChipEndPadding(float r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3814d0 == r3) goto L9;
        r02.f3814d0 = r3;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    }

    public void setChipEndPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        float r32 = r02.f3815e0.getResources().getDimension(r3);
        if (r02.f3814d0 == r32) goto L9;
        r02.f3814d0 = r32;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    L9:
        return;
    }

    public void setChipIcon(Drawable r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2482C(r2);
        return;
    }

    @Deprecated
    public void setChipIconEnabled(boolean r1) {
        setChipIconVisible(r1);
    }

    @Deprecated
    public void setChipIconEnabledResource(int r1) {
        setChipIconVisible(r1);
    }

    public void setChipIconResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2482C(AbstractC0358S.m916w(r02.f3815e0, r3));
        return;
    }

    public void setChipIconSize(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2483D(r2);
        return;
    }

    public void setChipIconSizeResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2483D(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setChipIconTint(ColorStateList r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2484E(r2);
        return;
    }

    public void setChipIconTintResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2484E(AbstractC0805P.m2049p(r02.f3815e0, r3));
        return;
    }

    public void setChipIconVisible(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2485F(r02.f3815e0.getResources().getBoolean(r3));
        return;
    }

    public void setChipMinHeight(float r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3838z == r3) goto L9;
        r02.f3838z = r3;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    }

    public void setChipMinHeightResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        float r32 = r02.f3815e0.getResources().getDimension(r3);
        if (r02.f3838z == r32) goto L9;
        r02.f3838z = r32;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    L9:
        return;
    }

    public void setChipStartPadding(float r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3807W == r3) goto L9;
        r02.f3807W = r3;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    }

    public void setChipStartPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        float r32 = r02.f3815e0.getResources().getDimension(r3);
        if (r02.f3807W == r32) goto L9;
        r02.f3807W = r32;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    L9:
        return;
    }

    public void setChipStrokeColor(ColorStateList r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2486G(r2);
        return;
    }

    public void setChipStrokeColorResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2486G(AbstractC0805P.m2049p(r02.f3815e0, r3));
        return;
    }

    public void setChipStrokeWidth(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2487H(r2);
        return;
    }

    public void setChipStrokeWidthResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2487H(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    @Deprecated
    public void setChipText(CharSequence r1) {
        setText(r1);
    }

    @Deprecated
    public void setChipTextResource(int r2) {
        setText(getResources().getString(r2));
    }

    public void setCloseIcon(Drawable r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L5;
        r02.m2488I(r2);
    L5:
        m1872e();
    }

    public void setCloseIconContentDescription(CharSequence r4) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3800P == r4) goto L13;
        String r1 = C0052b.f185d;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) goto L9;
        C0052b r12 = C0052b.f188g;
    L10:
        C0057g r2 = r12.f191c;
        r02.f3800P = r12.m169c(r4);
        r02.invalidateSelf();
        return;
    L9:
        r12 = C0052b.f187f;
        goto L10
    }

    @Deprecated
    public void setCloseIconEnabled(boolean r1) {
        setCloseIconVisible(r1);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int r1) {
        setCloseIconVisible(r1);
    }

    public void setCloseIconEndPadding(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2489J(r2);
        return;
    }

    public void setCloseIconEndPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2489J(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L5;
        r02.m2488I(AbstractC0358S.m916w(r02.f3815e0, r3));
    L5:
        m1872e();
    }

    public void setCloseIconSize(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2490K(r2);
        return;
    }

    public void setCloseIconSizeResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2490K(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconStartPadding(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2491L(r2);
        return;
    }

    public void setCloseIconStartPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2491L(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconTint(ColorStateList r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2492M(r2);
        return;
    }

    public void setCloseIconTintResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2492M(AbstractC0805P.m2049p(r02.f3815e0, r3));
        return;
    }

    public void setCloseIconVisible(int r2) {
        setCloseIconVisible(getResources().getBoolean(r2));
    }

    @Override // p057g.AbstractC0920p, android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        if (r1 != null) goto L9;
        if (r3 != null) goto L7;
        super.setCompoundDrawables(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // p057g.AbstractC0920p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        if (r1 != null) goto L9;
        if (r3 != null) goto L7;
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r3 != 0) goto L7;
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r3 != 0) goto L7;
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float r2) {
        super.setElevation(r2);
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2650j(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt r2) {
        if (this.f2370e != null) goto L6;
        return;
    L6:
        if (r2 == TextUtils.TruncateAt.MARQUEE) goto L12;
        super.setEllipsize(r2);
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L13;
        r02.f3784C0 = r2;
        return;
    L13:
        return;
    L12:
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
        this.f2379n = r1;
        m1869b(this.f2381p);
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
        if (r2 != 8388627) goto L7;
        super.setGravity(r2);
        return;
    }

    public void setHideMotionSpec(C0946b r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.f3806V = r2;
        return;
    }

    public void setHideMotionSpecResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.f3806V = C0946b.m2278a(r02.f3815e0, r3);
        return;
    }

    public void setIconEndPadding(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2494O(r2);
        return;
    }

    public void setIconEndPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2494O(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setIconStartPadding(float r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2495P(r2);
        return;
    }

    public void setIconStartPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2495P(r02.f3815e0.getResources().getDimension(r3));
        return;
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1071e r1) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
        if (this.f2370e != null) goto L5;
        return;
    L5:
        super.setLayoutDirection(r2);
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
        if (r2 > 1) goto L7;
        super.setLines(r2);
        return;
    L7:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
        if (r2 > 1) goto L7;
        super.setMaxLines(r2);
        return;
    L7:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r2) {
        super.setMaxWidth(r2);
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.f3788E0 = r2;
        return;
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
        if (r2 > 1) goto L7;
        super.setMinLines(r2);
        return;
    L7:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener r1) {
        this.f2374i = r1;
    }

    public void setOnCloseIconClickListener(View.OnClickListener r1) {
        this.f2373h = r1;
        m1872e();
    }

    public void setRippleColor(ColorStateList r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2496Q(r2);
    L6:
        if (this.f2370e.f3839z0 == true) goto L9;
        m1873f();
        return;
    }

    public void setRippleColorResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        r02.m2496Q(AbstractC0805P.m2049p(r02.f3815e0, r3));
        if (this.f2370e.f3839z0 == true) goto L9;
        m1873f();
        return;
    L9:
        return;
    }

    @Override // p089x0.InterfaceC1138v
    public void setShapeAppearanceModel(C1127k r2) {
        this.f2370e.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(C0946b r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.f3805U = r2;
        return;
    }

    public void setShowMotionSpecResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.f3805U = C0946b.m2278a(r02.f3815e0, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean r2) {
        if (r2 == false) goto L6;
        super.setSingleLine(r2);
        return;
    L6:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence r2, TextView.BufferType r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r2 != null) goto L8;
        r2 = "";
    L8:
        if (r02.f3786D0 == false) goto L10;
        CharSequence r03 = null;
    L11:
        super.setText(r03, r3);
        C1030f r32 = this.f2370e;
        if (r32 != null) goto L14;
        return;
    L14:
        if (TextUtils.equals(r32.f3787E, r2) == true) goto L18;
        r32.f3787E = r2;
        r32.f3821k0.f4175d = true;
        r32.invalidateSelf();
        r32.m2506v();
        return;
    L18:
        return;
    L10:
        r03 = r2;
        goto L11
    }

    public void setTextAppearance(C1099d r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L5;
        r02.m2497R(r2);
    L5:
        m1875h();
    }

    public void setTextAppearanceResource(int r2) {
        setTextAppearance(getContext(), r2);
    }

    public void setTextEndPadding(float r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3811a0 == r3) goto L9;
        r02.f3811a0 = r3;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    }

    public void setTextEndPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        float r32 = r02.f3815e0.getResources().getDimension(r3);
        if (r02.f3811a0 == r32) goto L9;
        r02.f3811a0 = r32;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    L9:
        return;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        super.setTextSize(r3, r4);
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L7;
        float r32 = TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics());
        C1075i r42 = r02.f3821k0;
        C1099d r1 = r42.f4177f;
        if (r1 == null) goto L7;
        r1.f4243k = r32;
        r42.f4172a.setTextSize(r32);
        r02.m2506v();
        r02.invalidateSelf();
    L7:
        m1875h();
    }

    public void setTextStartPadding(float r3) {
        C1030f r02 = this.f2370e;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.f3810Z == r3) goto L9;
        r02.f3810Z = r3;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    }

    public void setTextStartPaddingResource(int r3) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L8;
        float r32 = r02.f3815e0.getResources().getDimension(r3);
        if (r02.f3810Z == r32) goto L9;
        r02.f3810Z = r32;
        r02.invalidateSelf();
        r02.m2506v();
        return;
    L9:
        return;
    }

    public void setCloseIconVisible(boolean r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L5;
        r02.m2493N(r2);
    L5:
        m1872e();
    }

    public void setCheckedIconVisible(boolean r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2480A(r2);
        return;
    }

    public void setChipIconVisible(boolean r2) {
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L6;
        r02.m2485F(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        if (r1 != null) goto L9;
        if (r3 != null) goto L7;
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        if (r1 != null) goto L9;
        if (r3 != null) goto L7;
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        return;
    L7:
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    L9:
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r3, int r4) {
        super.setTextAppearance(r3, r4);
        C1030f r32 = this.f2370e;
        if (r32 == null) goto L5;
        r32.m2497R(new C1099d(r32.f3815e0, r4));
    L5:
        m1875h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
        super.setTextAppearance(r4);
        C1030f r02 = this.f2370e;
        if (r02 == null) goto L5;
        r02.m2497R(new C1099d(r02.f3815e0, r4));
    L5:
        m1875h();
    }
}
