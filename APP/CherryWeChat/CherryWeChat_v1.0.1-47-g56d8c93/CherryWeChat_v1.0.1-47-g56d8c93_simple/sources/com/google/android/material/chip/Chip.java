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
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.AbstractC0148Dc;
import p000.AbstractC0295Gu;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.AbstractC2447rA;
import p000.C0264G5;
import p000.C0728Qx;
import p000.C1037Y5;
import p000.C1146al;
import p000.C1481h3;
import p000.C2132k9;
import p000.C2162ks;
import p000.C2180l9;
import p000.C2223m9;
import p000.C2309o9;
import p000.C2404qA;
import p000.C2533tA;
import p000.InterfaceC0704QF;
import p000.InterfaceC0721Qq;
import p000.InterfaceC1300cy;
import p000.InterfaceC2266n9;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C1481h3 implements InterfaceC2266n9, InterfaceC1300cy, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f4508w = null;

    /* JADX INFO: renamed from: x */
    public static final int[] f4509x = null;

    /* JADX INFO: renamed from: y */
    public static final int[] f4510y = null;

    /* JADX INFO: renamed from: e */
    public C2309o9 f4511e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f4512f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f4513g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f4514h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f4515i;

    /* JADX INFO: renamed from: j */
    public boolean f4516j;

    /* JADX INFO: renamed from: k */
    public boolean f4517k;

    /* JADX INFO: renamed from: l */
    public boolean f4518l;

    /* JADX INFO: renamed from: m */
    public boolean f4519m;

    /* JADX INFO: renamed from: n */
    public boolean f4520n;

    /* JADX INFO: renamed from: o */
    public int f4521o;

    /* JADX INFO: renamed from: p */
    public int f4522p;

    /* JADX INFO: renamed from: q */
    public CharSequence f4523q;

    /* JADX INFO: renamed from: r */
    public final C2223m9 f4524r;

    /* JADX INFO: renamed from: s */
    public boolean f4525s;

    /* JADX INFO: renamed from: t */
    public final Rect f4526t;

    /* JADX INFO: renamed from: u */
    public final RectF f4527u;

    /* JADX INFO: renamed from: v */
    public final C2180l9 f4528v;

    static {
        f4508w = new Rect();
        f4509x = new int[]{R.attr.state_selected};
        f4510y = new int[]{R.attr.state_checkable};
    }

    public Chip(Context r17, AttributeSet r18) {
        super(AbstractC0148Dc.m291y(r17, r18, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action), r18, io.github.cherrywechat.R.attr.chipStyle);
        this.f4526t = new Rect();
        this.f4527u = new RectF();
        this.f4528v = new C2180l9(0, this);
        Context r7 = getContext();
        if (r18 == null) goto L22;
        r18.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) goto L134;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) goto L132;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) goto L130;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) goto L128;
        if (r18.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) == false) goto L126;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1) goto L126;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1) goto L126;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) goto L126;
        r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    L126:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    L128:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L130:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L132:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    L134:
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    L22:
        C2309o9 r10 = new C2309o9(r7, r18);
        Context r1 = r10.f8139n0;
        int[] r3 = AbstractC0939Vu.f2934c;
        TypedArray r12 = AbstractC1293cr.m2534G(r1, r18, r3, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        r10.f8113N0 = r12.hasValue(37);
        Context r6 = r10.f8139n0;
        ColorStateList r5 = AbstractC0828TB.m1643j(r6, r12, 24);
        if (r10.f8098G == r5) goto L25;
        r10.f8098G = r5;
        r10.onStateChange(r10.getState());
    L25:
        ColorStateList r52 = AbstractC0828TB.m1643j(r6, r12, 11);
        if (r10.f8100H == r52) goto L28;
        r10.f8100H = r52;
        r10.onStateChange(r10.getState());
    L28:
        float r53 = r12.getDimension(19, 0.0f);
        if (r10.f8102I == r53) goto L32;
        r10.f8102I = r53;
        r10.invalidateSelf();
        r10.m4688A();
    L32:
        if (r12.hasValue(12) == false) goto L34;
        r10.m4694G(r12.getDimension(12, 0.0f));
    L34:
        r10.m4699L(AbstractC0828TB.m1643j(r6, r12, 22));
        r10.m4700M(r12.getDimension(23, 0.0f));
        r10.m4710W(AbstractC0828TB.m1643j(r6, r12, 36));
        CharSequence r54 = r12.getText(5);
        if (r54 != null) goto L38;
        r54 = "";
    L38:
        if (TextUtils.equals(r10.f8112N, r54) == true) goto L41;
        r10.f8112N = r54;
        r10.f8145t0.f8836d = true;
        r10.invalidateSelf();
        r10.m4688A();
    L41:
        if (r12.hasValue(0) == false) goto L45;
        int r55 = r12.getResourceId(0, 0);
        if (r55 == 0) goto L45;
        C2404qA r15 = new C2404qA(r6, r55);
    L46:
        r15.f8433l = r12.getDimension(1, r15.f8433l);
        r10.m4711X(r15);
        int r152 = r12.getInt(3, 0);
        if (r152 != 1) goto L49;
        r10.f8107K0 = TextUtils.TruncateAt.START;
    L55:
        r10.m4698K(r12.getBoolean(18, false));
        if (r18 != null) goto L58;
    L62:
        r10.m4695H(AbstractC0828TB.m1644l(r6, r12, 14));
        if (r12.hasValue(17) == false) goto L65;
        r10.m4697J(AbstractC0828TB.m1643j(r6, r12, 17));
    L65:
        r10.m4696I(r12.getDimension(16, -1.0f));
        r10.m4707T(r12.getBoolean(31, false));
        if (r18 != null) goto L68;
    L72:
        r10.m4701N(AbstractC0828TB.m1644l(r6, r12, 25));
        r10.m4706S(AbstractC0828TB.m1643j(r6, r12, 30));
        r10.m4703P(r12.getDimension(28, 0.0f));
        r10.m4690C(r12.getBoolean(6, false));
        r10.m4693F(r12.getBoolean(10, false));
        if (r18 != null) goto L75;
    L79:
        r10.m4691D(AbstractC0828TB.m1644l(r6, r12, 7));
        if (r12.hasValue(9) == false) goto L83;
        r10.m4692E(AbstractC0828TB.m1643j(r6, r12, 9));
    L83:
        if (r12.hasValue(39) == false) goto L87;
        int r56 = r12.getResourceId(39, 0);
        if (r56 == 0) goto L87;
        C2162ks r57 = C2162ks.m4362a(r6, r56);
    L88:
        r10.f8129d0 = r57;
        if (r12.hasValue(33) == false) goto L93;
        int r58 = r12.getResourceId(33, 0);
        if (r58 == 0) goto L93;
        C2162ks r153 = C2162ks.m4362a(r6, r58);
    L94:
        r10.f8130e0 = r153;
        float r59 = r12.getDimension(21, 0.0f);
        if (r10.f8131f0 == r59) goto L97;
        r10.f8131f0 = r59;
        r10.invalidateSelf();
        r10.m4688A();
    L97:
        r10.m4709V(r12.getDimension(35, 0.0f));
        r10.m4708U(r12.getDimension(34, 0.0f));
        float r510 = r12.getDimension(41, 0.0f);
        if (r10.f8134i0 == r510) goto L100;
        r10.f8134i0 = r510;
        r10.invalidateSelf();
        r10.m4688A();
    L100:
        float r511 = r12.getDimension(40, 0.0f);
        if (r10.f8135j0 == r511) goto L103;
        r10.f8135j0 = r511;
        r10.invalidateSelf();
        r10.m4688A();
    L103:
        r10.m4704Q(r12.getDimension(29, 0.0f));
        r10.m4702O(r12.getDimension(27, 0.0f));
        float r512 = r12.getDimension(13, 0.0f);
        if (r10.f8138m0 == r512) goto L106;
        r10.f8138m0 = r512;
        r10.invalidateSelf();
        r10.m4688A();
    L106:
        r10.f8111M0 = r12.getDimensionPixelSize(4, Integer.MAX_VALUE);
        r12.recycle();
        AbstractC1293cr.m2547f(r7, r18, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1293cr.m2549h(r7, r18, r3, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r513 = r7.obtainStyledAttributes(r18, r3, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4520n = r513.getBoolean(32, false);
        TypedValue r62 = AbstractC1293cr.m2537P(r7, io.github.cherrywechat.R.attr.minTouchTargetSize);
        if (r62 != null) goto L109;
    L113:
        float r63 = r7.getResources().getDimension(io.github.cherrywechat.R.dimen.mtrl_min_touch_target_size);
    L114:
        this.f4522p = (int) Math.ceil(r513.getDimension(20, (int) r63));
        r513.recycle();
        setChipDrawable(r10);
        r10.m1927m(getElevation());
        AbstractC1293cr.m2547f(r7, r18, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1293cr.m2549h(r7, r18, r3, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r13 = r7.obtainStyledAttributes(r18, r3, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        boolean r2 = r13.hasValue(37);
        r13.recycle();
        this.f4524r = new C2223m9(this, this);
        m2463d();
        if (r2 == true) goto L117;
        setOutlineProvider(new C1146al(this, 2));
    L117:
        setChecked(this.f4516j);
        setText(r10.f8112N);
        setEllipsize(r10.f8107K0);
        m2466g();
        if (this.f4511e.f8109L0 == true) goto L120;
        setLines(1);
        setHorizontallyScrolling(true);
    L120:
        setGravity(8388627);
        m2465f();
        if (this.f4520n == false) goto L123;
        setMinHeight(this.f4522p);
    L123:
        this.f4521o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C2132k9(this, 0));
        return;
    L109:
        if (r62.type != 5) goto L113;
        r63 = r62.getDimension(r7.getResources().getDisplayMetrics());
    L93:
        r153 = null;
    L87:
        r57 = null;
        goto L88
    L75:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null) goto L79;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null) goto L79;
        r10.m4693F(r12.getBoolean(8, false));
        goto L79
    L68:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null) goto L72;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null) goto L72;
        r10.m4707T(r12.getBoolean(26, false));
        goto L72
    L58:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null) goto L62;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null) goto L62;
        r10.m4698K(r12.getBoolean(15, false));
        goto L62
    L49:
        if (r152 == 2) goto L53;
        if (r152 != 3) goto L55;
        r10.f8107K0 = TextUtils.TruncateAt.END;
        goto L55
    L53:
        r10.f8107K0 = TextUtils.TruncateAt.MIDDLE;
    L45:
        r15 = null;
        goto L46
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Rect m2460a(Chip r0) {
        return r0.getCloseIconTouchBoundsInt();
    }

    private RectF getCloseIconTouchBounds() {
        RectF r0 = this.f4527u;
        r0.setEmpty();
        if (m2462c() == true) goto L5;
    L13:
        return r0;
    L5:
        if (this.f4514h == null) goto L13;
        C2309o9 r1 = this.f4511e;
        Rect r2 = r1.getBounds();
        r0.setEmpty();
        if (r1.m4714a0() == false) goto L13;
        float r3 = (((r1.f8138m0 + r1.f8137l0) + r1.f8123X) + r1.f8136k0) + r1.f8135j0;
        if (r1.getLayoutDirection() != 0) goto L11;
        float r12 = r2.right;
        r0.right = r12;
        r0.left = r12 - r3;
    L12:
        r0.top = r2.top;
        r0.bottom = r2.bottom;
        goto L13
    L11:
        float r13 = r2.left;
        r0.left = r13;
        r0.right = r13 + r3;
        goto L12
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF r0 = getCloseIconTouchBounds();
        int r1 = (int) r0.left;
        int r2 = (int) r0.top;
        int r3 = (int) r0.right;
        int r02 = (int) r0.bottom;
        Rect r4 = this.f4526t;
        r4.set(r1, r2, r3, r02);
        return r4;
    }

    private C2404qA getTextAppearance() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8145t0.f8838f;
    }

    private void setCloseIconHovered(boolean r2) {
        if (this.f4518l == r2) goto L6;
        this.f4518l = r2;
        refreshDrawableState();
        return;
    }

    private void setCloseIconPressed(boolean r2) {
        if (this.f4517k == r2) goto L6;
        this.f4517k = r2;
        refreshDrawableState();
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2461b(int r11) {
        this.f4522p = r11;
        int r2 = 0;
        if (this.f4520n == true) goto L11;
        InsetDrawable r112 = this.f4512f;
        if (r112 == null) goto L9;
        if (r112 == null) goto L46;
        this.f4512f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        m2464e();
        return;
    L46:
        return;
    L9:
        m2464e();
        return;
    L11:
        int r0 = Math.max(0, r11 - ((int) this.f4511e.f8102I));
        int r3 = Math.max(0, r11 - this.f4511e.getIntrinsicWidth());
        if (r3 > 0) goto L21;
        if (r0 > 0) goto L21;
        InsetDrawable r113 = this.f4512f;
        if (r113 == null) goto L19;
        if (r113 == null) goto L47;
        this.f4512f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        m2464e();
        return;
    L47:
        return;
    L19:
        m2464e();
        return;
    L21:
        if (r3 <= 0) goto L23;
        int r6 = r3 / 2;
    L24:
        if (r0 <= 0) goto L26;
        r2 = r0 / 2;
    L26:
        int r7 = r2;
        if (this.f4512f == null) goto L39;
        Rect r02 = new Rect();
        this.f4512f.getPadding(r02);
        if (r02.top != r7) goto L39;
        if (r02.bottom != r7) goto L39;
        if (r02.left != r6) goto L39;
        if (r02.right != r6) goto L39;
        m2464e();
        return;
    L39:
        if (getMinHeight() == r11) goto L42;
        setMinHeight(r11);
    L42:
        if (getMinWidth() == r11) goto L44;
        setMinWidth(r11);
    L44:
        this.f4512f = new InsetDrawable(this.f4511e, r6, r7, r6, r7);
        m2464e();
        return;
    L23:
        r6 = 0;
        goto L24
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2462c() {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L13;
        Object r02 = r0.f8120U;
        if (r02 != null) goto L7;
    L9:
        r02 = null;
    L10:
        if (r02 == null) goto L15;
        return true;
    L15:
        return false;
    L7:
        if ((r02 instanceof InterfaceC0704QF) == false) goto L10;
        InterfaceC0704QF r03 = (InterfaceC0704QF) r02;
        goto L9
    L13:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m2463d() {
        if (m2462c() == false) goto L12;
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L12;
        if (r0.f8119T == false) goto L12;
        if (this.f4514h == null) goto L12;
        AbstractC2185lE.m4399l(this, this.f4524r);
        this.f4525s = true;
        return;
    L12:
        AbstractC2185lE.m4399l(this, null);
        this.f4525s = false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent r9) {
        if (this.f4525s == false) goto L5;
        C2223m9 r0 = this.f4524r;
        AccessibilityManager r1 = r0.f7729h;
        int r3 = 0;
        if (r1.isEnabled() == false) goto L35;
        if (r1.isTouchExplorationEnabled() == false) goto L35;
        int r12 = r9.getAction();
        if (r12 != 7) goto L14;
    L24:
        float r13 = r9.getX();
        float r92 = r9.getY();
        Chip r2 = r0.f7735n;
        if (r2.m2462c() == true) goto L27;
    L29:
        int r93 = r0.f7734m;
        if (r93 == r3) goto L36;
        r0.f7734m = r3;
        r0.m4481q(r3, 128);
        r0.m4481q(r93, 256);
        return true;
    L36:
        return true;
    L27:
        if (r2.getCloseIconTouchBounds().contains(r13, r92) == false) goto L29;
        r3 = 1;
        goto L29
    L14:
        if (r12 == 9) goto L24;
        if (r12 != 10) goto L35;
        int r14 = r0.f7734m;
        if (r14 == Integer.MIN_VALUE) goto L35;
        if (r14 == Integer.MIN_VALUE) goto L36;
        r0.f7734m = Integer.MIN_VALUE;
        r0.m4481q(Integer.MIN_VALUE, 128);
        r0.m4481q(r14, 256);
        return true;
    L35:
        if (super.dispatchHoverEvent(r9) == true) goto L36;
        return false;
    L5:
        return super.dispatchHoverEvent(r9);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r10) {
        if (this.f4525s == false) goto L5;
        C2223m9 r0 = this.f4524r;
        r0.getClass();
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
        if (r0.m4477m(r5, null) == false) goto L30;
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
        int r13 = r0.f7733l;
        if (r13 == Integer.MIN_VALUE) goto L47;
        Chip r52 = r0.f7735n;
        if (r13 != 0) goto L40;
        r52.performClick();
        goto L47
    L40:
        if (r13 != 1) goto L47;
        r52.playSoundEffect(0);
        View.OnClickListener r14 = r52.f4514h;
        if (r14 == null) goto L45;
        r14.onClick(r52);
    L45:
        if (r52.f4525s == false) goto L47;
        r52.f4524r.m4481q(1, 1);
    L47:
        r2 = true;
        goto L54
    L49:
        if (r10.hasNoModifiers() == false) goto L52;
        r2 = r0.m4477m(2, null);
        goto L54
    L52:
        if (r10.hasModifiers(1) == false) goto L54;
        r2 = r0.m4477m(1, null);
    L54:
        if (r2 == false) goto L59;
        if (r0.f7733l == Integer.MIN_VALUE) goto L59;
        return true;
    L59:
        return super.dispatchKeyEvent(r10);
    L5:
        return super.dispatchKeyEvent(r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.C1481h3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2309o9 r0 = this.f4511e;
        boolean r1 = false;
        int r12 = 0;
        r1 = false;
        if (r0 != null) goto L5;
    L34:
        if (r1 == false) goto L37;
        invalidate();
        return;
    L37:
        return;
    L5:
        if (C2309o9.m4687z(r0.f8120U) == false) goto L34;
        C2309o9 r02 = this.f4511e;
        ?? r2 = isEnabled();
        int r22 = r2;
        if (this.f4519m == false) goto L9;
        r22 = r2 + 1;
    L9:
        int r23 = r22;
        if (this.f4518l == false) goto L12;
        r23 = r22 + 1;
    L12:
        int r24 = r23;
        if (this.f4517k == false) goto L15;
        r24 = r23 + 1;
    L15:
        int r25 = r24;
        if (isChecked() == false) goto L18;
        r25 = r24 + 1;
    L18:
        int[] r26 = new int[r25];
        if (isEnabled() == false) goto L22;
        r26[0] = 16842910;
        r12 = 1;
    L22:
        if (this.f4519m == false) goto L25;
        r26[r12] = 16842908;
        r12 = r12 + 1;
    L25:
        if (this.f4518l == false) goto L28;
        r26[r12] = 16843623;
        r12 = r12 + 1;
    L28:
        if (this.f4517k == false) goto L31;
        r26[r12] = 16842919;
        r12 = r12 + 1;
    L31:
        if (isChecked() == false) goto L33;
        r26[r12] = 16842913;
    L33:
        r1 = r02.m4705R(r26);
        goto L34
    }

    /* JADX INFO: renamed from: e */
    public final void m2464e() {
        ColorStateList r1 = this.f4511e.f8110M;
        if (r1 != null) goto L6;
        r1 = ColorStateList.valueOf(0);
    L6:
        this.f4513g = new RippleDrawable(r1, getBackgroundDrawable(), null);
        this.f4511e.getClass();
        setBackground(this.f4513g);
        m2465f();
    }

    /* JADX INFO: renamed from: f */
    public final void m2465f() {
        if (TextUtils.isEmpty(getText()) == true) goto L12;
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L13;
        float r1 = r0.f8138m0 + r0.f8135j0;
        int r02 = (int) (r0.m4718w() + r1);
        C2309o9 r12 = this.f4511e;
        float r2 = r12.f8131f0 + r12.f8134i0;
        int r13 = (int) (r12.m4717v() + r2);
        if (this.f4512f == null) goto L10;
        Rect r22 = new Rect();
        this.f4512f.getPadding(r22);
        r13 = r13 + r22.left;
        r02 = r02 + r22.right;
    L10:
        setPaddingRelative(r13, getPaddingTop(), r02, getPaddingBottom());
        return;
    L13:
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m2466g() {
        TextPaint r0 = getPaint();
        C2309o9 r1 = this.f4511e;
        if (r1 == null) goto L5;
        r0.drawableState = r1.getState();
    L5:
        C2404qA r12 = getTextAppearance();
        if (r12 == null) goto L9;
        r12.m4840d(getContext(), r0, this.f4528v);
        return;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (TextUtils.isEmpty(this.f4523q) == false) goto L5;
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L13;
        if (r0.f8125Z == false) goto L13;
        getParent();
        return "android.widget.Button";
    L13:
        if (isClickable() == false) goto L15;
        return "android.widget.Button";
    L15:
        return "android.view.View";
    L5:
        return this.f4523q;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable r0 = this.f4512f;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.f4511e;
    }

    public Drawable getCheckedIcon() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8127b0;
    }

    public ColorStateList getCheckedIconTint() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8128c0;
    }

    public ColorStateList getChipBackgroundColor() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8100H;
    }

    public float getChipCornerRadius() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return Math.max(0.0f, r0.m4719x());
    }

    public Drawable getChipDrawable() {
        return this.f4511e;
    }

    public float getChipEndPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8138m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L10;
        Drawable r02 = r0.f8115P;
        if (r02 == 0) goto L10;
        if ((r02 instanceof InterfaceC0704QF) == false) goto L11;
        InterfaceC0704QF r03 = (InterfaceC0704QF) r02;
        return null;
    L11:
        return r02;
    L10:
        return null;
    }

    public float getChipIconSize() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8117R;
    }

    public ColorStateList getChipIconTint() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8116Q;
    }

    public float getChipMinHeight() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8102I;
    }

    public float getChipStartPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8131f0;
    }

    public ColorStateList getChipStrokeColor() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8106K;
    }

    public float getChipStrokeWidth() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8108L;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L10;
        Drawable r02 = r0.f8120U;
        if (r02 == 0) goto L10;
        if ((r02 instanceof InterfaceC0704QF) == false) goto L11;
        InterfaceC0704QF r03 = (InterfaceC0704QF) r02;
        return null;
    L11:
        return r02;
    L10:
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8124Y;
    }

    public float getCloseIconEndPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8137l0;
    }

    public float getCloseIconSize() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8123X;
    }

    public float getCloseIconStartPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8136k0;
    }

    public ColorStateList getCloseIconTint() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8122W;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8107K0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect r4) {
        if (this.f4525s == false) goto L10;
        C2223m9 r0 = this.f4524r;
        if (r0.f7733l != 1) goto L7;
    L8:
        r4.set(getCloseIconTouchBoundsInt());
        return;
    L7:
        if (r0.f7732k == 1) goto L8;
    L10:
        super.getFocusedRect(r4);
    }

    public C2162ks getHideMotionSpec() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8130e0;
    }

    public float getIconEndPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8133h0;
    }

    public float getIconStartPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8132g0;
    }

    public ColorStateList getRippleColor() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8110M;
    }

    public C0728Qx getShapeAppearanceModel() {
        return this.f4511e.f3241b.f2902a;
    }

    public C2162ks getShowMotionSpec() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8129d0;
    }

    public float getTextEndPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8135j0;
    }

    public float getTextStartPadding() {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.f8134i0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1406fG.m2714n0(this, this.f4511e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (isChecked() == false) goto L5;
        View.mergeDrawableStates(r22, f4509x);
    L5:
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L8;
    L10:
        return r22;
    L8:
        if (r0.f8125Z == false) goto L10;
        View.mergeDrawableStates(r22, f4510y);
        goto L10
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r4, int r5, Rect r6) {
        super.onFocusChanged(r4, r5, r6);
        if (this.f4525s == false) goto L10;
        C2223m9 r0 = this.f4524r;
        int r1 = r0.f7733l;
        if (r1 == Integer.MIN_VALUE) goto L7;
        r0.m4474j(r1);
    L7:
        if (r4 == false) goto L11;
        r0.m4477m(r5, r6);
        return;
    L11:
        return;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r4) {
        int r0 = r4.getActionMasked();
        if (r0 != 7) goto L5;
        setCloseIconHovered(getCloseIconTouchBounds().contains(r4.getX(), r4.getY()));
    L10:
        return super.onHoverEvent(r4);
    L5:
        if (r0 != 10) goto L10;
        setCloseIconHovered(false);
        goto L10
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(getAccessibilityClassName());
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        r2.setCheckable(r02);
        r2.setClickable(isClickable());
        getParent();
        return;
    L5:
        if (r0.f8125Z == false) goto L7;
        r02 = true;
        goto L8
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
        if (this.f4521o == r2) goto L6;
        this.f4521o = r2;
        m2465f();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        boolean r1 = getCloseIconTouchBounds().contains(r6.getX(), r6.getY());
        if (r0 == 0) goto L26;
        if (r0 == 1) goto L16;
        if (r0 == 2) goto L11;
        if (r0 != 3) goto L28;
    L24:
        boolean r02 = false;
    L25:
        setCloseIconPressed(false);
    L29:
        if (r02 == false) goto L31;
    L34:
        return true;
    L31:
        if (super.onTouchEvent(r6) == true) goto L34;
        return false;
    L28:
        r02 = false;
        goto L29
    L11:
        if (this.f4517k == false) goto L28;
        if (r1 == true) goto L14;
        setCloseIconPressed(false);
    L14:
        r02 = true;
        goto L29
    L16:
        if (this.f4517k == false) goto L24;
        playSoundEffect(0);
        View.OnClickListener r03 = this.f4514h;
        if (r03 == null) goto L21;
        r03.onClick(this);
    L21:
        if (this.f4525s == false) goto L23;
        this.f4524r.m4481q(1, 1);
    L23:
        r02 = true;
        goto L25
    L26:
        if (r1 == false) goto L28;
        setCloseIconPressed(true);
        goto L14
    }

    public void setAccessibilityClassName(CharSequence r1) {
        this.f4523q = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L7:
        super.setBackground(r2);
        return;
    L5:
        if (r2 == this.f4513g) goto L7;
    }

    @Override // android.view.View
    public void setBackgroundColor(int r1) {
    }

    @Override // p000.C1481h3, android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L7:
        super.setBackgroundDrawable(r2);
        return;
    L5:
        if (r2 == this.f4513g) goto L7;
    }

    @Override // p000.C1481h3, android.view.View
    public void setBackgroundResource(int r1) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r1) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r1) {
    }

    public void setCheckable(boolean r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4690C(r2);
        return;
    }

    public void setCheckableResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4690C(r0.f8139n0.getResources().getBoolean(r3));
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L7;
        this.f4516j = r2;
        return;
    L7:
        if (r0.f8125Z == false) goto L10;
        super.setChecked(r2);
        return;
    }

    public void setCheckedIcon(Drawable r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4691D(r2);
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4691D(AbstractC1406fG.m2695U(r0.f8139n0, r3));
        return;
    }

    public void setCheckedIconTint(ColorStateList r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4692E(r2);
        return;
    }

    public void setCheckedIconTintResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4692E(AbstractC0295Gu.m622o(r0.f8139n0, r3));
        return;
    }

    public void setCheckedIconVisible(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4693F(r0.f8139n0.getResources().getBoolean(r3));
        return;
    }

    public void setChipBackgroundColor(ColorStateList r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8100H == r3) goto L9;
        r0.f8100H = r3;
        r0.onStateChange(r0.getState());
        return;
    }

    public void setChipBackgroundColorResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        ColorStateList r32 = AbstractC0295Gu.m622o(r0.f8139n0, r3);
        if (r0.f8100H == r32) goto L9;
        r0.f8100H = r32;
        r0.onStateChange(r0.getState());
        return;
    L9:
        return;
    }

    @Deprecated
    public void setChipCornerRadius(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4694G(r2);
        return;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4694G(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setChipDrawable(C2309o9 r4) {
        C2309o9 r0 = this.f4511e;
        if (r0 == r4) goto L8;
        if (r0 == null) goto L6;
        r0.f8105J0 = new WeakReference(null);
    L6:
        this.f4511e = r4;
        r4.f8109L0 = false;
        r4.f8105J0 = new WeakReference(this);
        m2461b(this.f4522p);
        return;
    }

    public void setChipEndPadding(float r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8138m0 == r3) goto L9;
        r0.f8138m0 = r3;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    }

    public void setChipEndPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        float r32 = r0.f8139n0.getResources().getDimension(r3);
        if (r0.f8138m0 == r32) goto L9;
        r0.f8138m0 = r32;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    L9:
        return;
    }

    public void setChipIcon(Drawable r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4695H(r2);
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4695H(AbstractC1406fG.m2695U(r0.f8139n0, r3));
        return;
    }

    public void setChipIconSize(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4696I(r2);
        return;
    }

    public void setChipIconSizeResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4696I(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setChipIconTint(ColorStateList r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4697J(r2);
        return;
    }

    public void setChipIconTintResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4697J(AbstractC0295Gu.m622o(r0.f8139n0, r3));
        return;
    }

    public void setChipIconVisible(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4698K(r0.f8139n0.getResources().getBoolean(r3));
        return;
    }

    public void setChipMinHeight(float r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8102I == r3) goto L9;
        r0.f8102I = r3;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    }

    public void setChipMinHeightResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        float r32 = r0.f8139n0.getResources().getDimension(r3);
        if (r0.f8102I == r32) goto L9;
        r0.f8102I = r32;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    L9:
        return;
    }

    public void setChipStartPadding(float r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8131f0 == r3) goto L9;
        r0.f8131f0 = r3;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    }

    public void setChipStartPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        float r32 = r0.f8139n0.getResources().getDimension(r3);
        if (r0.f8131f0 == r32) goto L9;
        r0.f8131f0 = r32;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    L9:
        return;
    }

    public void setChipStrokeColor(ColorStateList r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4699L(r2);
        return;
    }

    public void setChipStrokeColorResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4699L(AbstractC0295Gu.m622o(r0.f8139n0, r3));
        return;
    }

    public void setChipStrokeWidth(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4700M(r2);
        return;
    }

    public void setChipStrokeWidthResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4700M(r0.f8139n0.getResources().getDimension(r3));
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4701N(r2);
    L5:
        m2463d();
    }

    public void setCloseIconContentDescription(CharSequence r4) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8124Y == r4) goto L13;
        String r1 = C0264G5.f846b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) goto L9;
        C0264G5 r12 = C0264G5.f849e;
    L10:
        r12.getClass();
        C1037Y5 r2 = AbstractC2447rA.f8572a;
        r0.f8124Y = r12.m550c(r4);
        r0.invalidateSelf();
        return;
    L9:
        r12 = C0264G5.f848d;
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4702O(r2);
        return;
    }

    public void setCloseIconEndPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4702O(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4701N(AbstractC1406fG.m2695U(r0.f8139n0, r3));
    L5:
        m2463d();
    }

    public void setCloseIconSize(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4703P(r2);
        return;
    }

    public void setCloseIconSizeResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4703P(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconStartPadding(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4704Q(r2);
        return;
    }

    public void setCloseIconStartPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4704Q(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconTint(ColorStateList r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4706S(r2);
        return;
    }

    public void setCloseIconTintResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4706S(AbstractC0295Gu.m622o(r0.f8139n0, r3));
        return;
    }

    public void setCloseIconVisible(int r2) {
        setCloseIconVisible(getResources().getBoolean(r2));
    }

    @Override // p000.C1481h3, android.widget.TextView
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

    @Override // p000.C1481h3, android.widget.TextView
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m1927m(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt r2) {
        if (this.f4511e != null) goto L6;
        return;
    L6:
        if (r2 == TextUtils.TruncateAt.MARQUEE) goto L12;
        super.setEllipsize(r2);
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L13;
        r0.f8107K0 = r2;
        return;
    L13:
        return;
    L12:
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
        this.f4520n = r1;
        m2461b(this.f4522p);
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
        if (r2 == 8388627) goto L5;
        return;
    L5:
        super.setGravity(r2);
    }

    public void setHideMotionSpec(C2162ks r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.f8130e0 = r2;
        return;
    }

    public void setHideMotionSpecResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.f8130e0 = C2162ks.m4362a(r0.f8139n0, r3);
        return;
    }

    public void setIconEndPadding(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4708U(r2);
        return;
    }

    public void setIconEndPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4708U(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setIconStartPadding(float r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4709V(r2);
        return;
    }

    public void setIconStartPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4709V(r0.f8139n0.getResources().getDimension(r3));
        return;
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0721Qq r1) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
        if (this.f4511e != null) goto L5;
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.f8111M0 = r2;
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
        this.f4515i = r1;
    }

    public void setOnCloseIconClickListener(View.OnClickListener r1) {
        this.f4514h = r1;
        m2463d();
    }

    public void setRippleColor(ColorStateList r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4710W(r2);
    L5:
        this.f4511e.getClass();
        m2464e();
    }

    public void setRippleColorResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4710W(AbstractC0295Gu.m622o(r0.f8139n0, r3));
        this.f4511e.getClass();
        m2464e();
        return;
    }

    @Override // p000.InterfaceC1300cy
    public void setShapeAppearanceModel(C0728Qx r2) {
        this.f4511e.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(C2162ks r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.f8129d0 = r2;
        return;
    }

    public void setShowMotionSpecResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.f8129d0 = C2162ks.m4362a(r0.f8139n0, r3);
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
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L19;
        if (r2 != null) goto L8;
        r2 = "";
    L8:
        if (r0.f8109L0 == false) goto L10;
        CharSequence r02 = null;
    L11:
        super.setText(r02, r3);
        C2309o9 r32 = this.f4511e;
        if (r32 != null) goto L14;
        return;
    L14:
        if (TextUtils.equals(r32.f8112N, r2) == true) goto L18;
        r32.f8112N = r2;
        r32.f8145t0.f8836d = true;
        r32.invalidateSelf();
        r32.m4688A();
        return;
    L18:
        return;
    L10:
        r02 = r2;
        goto L11
    }

    public void setTextAppearance(C2404qA r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4711X(r2);
    L5:
        m2466g();
    }

    public void setTextAppearanceResource(int r2) {
        setTextAppearance(getContext(), r2);
    }

    public void setTextEndPadding(float r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8135j0 == r3) goto L9;
        r0.f8135j0 = r3;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    }

    public void setTextEndPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        float r32 = r0.f8139n0.getResources().getDimension(r3);
        if (r0.f8135j0 == r32) goto L9;
        r0.f8135j0 = r32;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    L9:
        return;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        super.setTextSize(r3, r4);
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L7;
        float r32 = TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics());
        C2533tA r42 = r0.f8145t0;
        C2404qA r1 = r42.f8838f;
        if (r1 == null) goto L7;
        r1.f8433l = r32;
        r42.f8833a.setTextSize(r32);
        r0.m4688A();
        r0.invalidateSelf();
    L7:
        m2466g();
    }

    public void setTextStartPadding(float r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f8134i0 == r3) goto L9;
        r0.f8134i0 = r3;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    }

    public void setTextStartPaddingResource(int r3) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L8;
        float r32 = r0.f8139n0.getResources().getDimension(r3);
        if (r0.f8134i0 == r32) goto L9;
        r0.f8134i0 = r32;
        r0.invalidateSelf();
        r0.m4688A();
        return;
    L9:
        return;
    }

    public void setCloseIconVisible(boolean r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4707T(r2);
    L5:
        m2463d();
    }

    public void setCheckedIconVisible(boolean r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4693F(r2);
        return;
    }

    public void setChipIconVisible(boolean r2) {
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L6;
        r0.m4698K(r2);
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
        C2309o9 r32 = this.f4511e;
        if (r32 == null) goto L5;
        r32.m4711X(new C2404qA(r32.f8139n0, r4));
    L5:
        m2466g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
        super.setTextAppearance(r4);
        C2309o9 r0 = this.f4511e;
        if (r0 == null) goto L5;
        r0.m4711X(new C2404qA(r0.f8139n0, r4));
    L5:
        m2466g();
    }
}
