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
import android.util.Log;
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
import defpackage.a60;
import defpackage.a80;
import defpackage.ad0;
import defpackage.b60;
import defpackage.bw;
import defpackage.ct;
import defpackage.d60;
import defpackage.dh;
import defpackage.f30;
import defpackage.ff;
import defpackage.g10;
import defpackage.g6;
import defpackage.ga;
import defpackage.gt;
import defpackage.h60;
import defpackage.ha;
import defpackage.i60;
import defpackage.ia;
import defpackage.ip;
import defpackage.ja;
import defpackage.ja0;
import defpackage.ka;
import defpackage.m7;
import defpackage.q30;
import defpackage.r7;
import defpackage.s90;
import defpackage.t90;
import defpackage.wy;
import defpackage.y2;
import defpackage.y90;
import defpackage.yt;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends y2 implements ja, q30, Checkable {
    public static final Rect w = null;
    public static final int[] x = null;
    public static final int[] y = null;
    public ka e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final ia r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final ha v;

    static {
        w = new Rect();
        x = new int[]{R.attr.state_selected};
        y = new int[]{R.attr.state_checkable};
    }

    public Chip(Context r17, AttributeSet r18) {
        super(ff.W(r17, r18, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action), r18, com.ljx.wechatmod.R.attr.chipStyle);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new ha(0, this);
        Context r7 = getContext();
        if (r18 != null) goto L6;
    L27:
        ka r10 = new ka(r7, r18);
        Context r1 = r10.e0;
        int[] r3 = wy.c;
        TypedArray r12 = a80.u(r1, r18, r3, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        r10.E0 = r12.hasValue(37);
        Context r6 = r10.e0;
        ColorStateList r5 = ct.n(r6, r12, 24);
        if (r10.x == r5) goto L30;
        r10.x = r5;
        r10.onStateChange(r10.getState());
    L30:
        ColorStateList r52 = ct.n(r6, r12, 11);
        if (r10.y == r52) goto L33;
        r10.y = r52;
        r10.onStateChange(r10.getState());
    L33:
        float r53 = r12.getDimension(19, 0.0f);
        if (r10.z == r53) goto L37;
        r10.z = r53;
        r10.invalidateSelf();
        r10.u();
    L37:
        if (r12.hasValue(12) == false) goto L39;
        r10.A(r12.getDimension(12, 0.0f));
    L39:
        r10.F(ct.n(r6, r12, 22));
        r10.G(r12.getDimension(23, 0.0f));
        r10.P(ct.n(r6, r12, 36));
        CharSequence r54 = r12.getText(5);
        if (r54 != null) goto L43;
        r54 = "";
    L43:
        if (TextUtils.equals(r10.E, r54) == true) goto L46;
        r10.E = r54;
        r10.k0.d = true;
        r10.invalidateSelf();
        r10.u();
    L46:
        if (r12.hasValue(0) == false) goto L50;
        int r55 = r12.getResourceId(0, 0);
        if (r55 == 0) goto L50;
        a60 r15 = new a60(r6, r55);
    L51:
        r15.k = r12.getDimension(1, r15.k);
        r10.Q(r15);
        int r152 = r12.getInt(3, 0);
        if (r152 != 1) goto L54;
        r10.B0 = TextUtils.TruncateAt.START;
    L60:
        r10.E(r12.getBoolean(18, false));
        if (r18 != null) goto L63;
    L67:
        r10.B(ct.o(r6, r12, 14));
        if (r12.hasValue(17) == false) goto L70;
        r10.D(ct.n(r6, r12, 17));
    L70:
        r10.C(r12.getDimension(16, -1.0f));
        r10.M(r12.getBoolean(31, false));
        if (r18 != null) goto L73;
    L77:
        r10.H(ct.o(r6, r12, 25));
        r10.L(ct.n(r6, r12, 30));
        r10.J(r12.getDimension(28, 0.0f));
        r10.w(r12.getBoolean(6, false));
        r10.z(r12.getBoolean(10, false));
        if (r18 != null) goto L80;
    L84:
        r10.x(ct.o(r6, r12, 7));
        if (r12.hasValue(9) == false) goto L88;
        r10.y(ct.n(r6, r12, 9));
    L88:
        if (r12.hasValue(39) == false) goto L92;
        int r56 = r12.getResourceId(39, 0);
        if (r56 == 0) goto L92;
        bw r57 = bw.a(r6, r56);
    L93:
        r10.U = r57;
        if (r12.hasValue(33) == false) goto L98;
        int r58 = r12.getResourceId(33, 0);
        if (r58 == 0) goto L98;
        bw r14 = bw.a(r6, r58);
    L99:
        r10.V = r14;
        float r59 = r12.getDimension(21, 0.0f);
        if (r10.W == r59) goto L102;
        r10.W = r59;
        r10.invalidateSelf();
        r10.u();
    L102:
        r10.O(r12.getDimension(35, 0.0f));
        r10.N(r12.getDimension(34, 0.0f));
        float r510 = r12.getDimension(41, 0.0f);
        if (r10.Z == r510) goto L105;
        r10.Z = r510;
        r10.invalidateSelf();
        r10.u();
    L105:
        float r511 = r12.getDimension(40, 0.0f);
        if (r10.a0 == r511) goto L108;
        r10.a0 = r511;
        r10.invalidateSelf();
        r10.u();
    L108:
        r10.K(r12.getDimension(29, 0.0f));
        r10.I(r12.getDimension(27, 0.0f));
        float r512 = r12.getDimension(13, 0.0f);
        if (r10.d0 == r512) goto L111;
        r10.d0 = r512;
        r10.invalidateSelf();
        r10.u();
    L111:
        r10.D0 = r12.getDimensionPixelSize(4, Integer.MAX_VALUE);
        r12.recycle();
        a80.c(r7, r18, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        a80.e(r7, r18, r3, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r513 = r7.obtainStyledAttributes(r18, r3, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.n = r513.getBoolean(32, false);
        this.p = (int) Math.ceil(r513.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        r513.recycle();
        setChipDrawable(r10);
        r10.i(y90.i(this));
        a80.c(r7, r18, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        a80.e(r7, r18, r3, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray r13 = r7.obtainStyledAttributes(r18, r3, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        boolean r2 = r13.hasValue(37);
        r13.recycle();
        this.r = new ia(this, this);
        d();
        if (r2 == true) goto L114;
        setOutlineProvider(new g6(7, this));
    L114:
        setChecked(this.j);
        setText(r10.E);
        setEllipsize(r10.B0);
        g();
        if (this.e.C0 == true) goto L117;
        setLines(1);
        setHorizontallyScrolling(true);
    L117:
        setGravity(8388627);
        f();
        if (this.n == false) goto L120;
        setMinHeight(this.p);
    L120:
        this.o = t90.d(this);
        super.setOnCheckedChangeListener(new ga(this));
        return;
    L98:
        r14 = null;
    L92:
        r57 = null;
        goto L93
    L80:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null) goto L84;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null) goto L84;
        r10.z(r12.getBoolean(8, false));
        goto L84
    L73:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null) goto L77;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null) goto L77;
        r10.M(r12.getBoolean(26, false));
        goto L77
    L63:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null) goto L67;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null) goto L67;
        r10.E(r12.getBoolean(15, false));
        goto L67
    L54:
        if (r152 == 2) goto L58;
        if (r152 != 3) goto L60;
        r10.B0 = TextUtils.TruncateAt.END;
        goto L60
    L58:
        r10.B0 = TextUtils.TruncateAt.MIDDLE;
    L50:
        r15 = null;
        goto L51
    L6:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "background") == null) goto L9;
        Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
    L9:
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) goto L131;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) goto L129;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) goto L127;
        if (r18.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) goto L125;
        if (r18.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) == false) goto L123;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1) goto L123;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1) goto L123;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) goto L123;
        if (r18.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) == 8388627) goto L27;
        Log.w("Chip", "Chip text must be vertically center and start aligned");
    L123:
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    L125:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L127:
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    L129:
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    L131:
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public static /* synthetic */ Rect a(Chip r0) {
        return r0.getCloseIconTouchBoundsInt();
    }

    private RectF getCloseIconTouchBounds() {
        RectF r0 = this.u;
        r0.setEmpty();
        if (c() == true) goto L5;
    L13:
        return r0;
    L5:
        if (this.h == null) goto L13;
        ka r1 = this.e;
        Rect r2 = r1.getBounds();
        r0.setEmpty();
        if (r1.T() == false) goto L13;
        float r3 = (((r1.d0 + r1.c0) + r1.O) + r1.b0) + r1.a0;
        if (dh.a(r1) != 0) goto L11;
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
        Rect r4 = this.t;
        r4.set(r1, r2, r3, r02);
        return r4;
    }

    private a60 getTextAppearance() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.k0.f;
    }

    private void setCloseIconHovered(boolean r2) {
        if (this.l == r2) goto L6;
        this.l = r2;
        refreshDrawableState();
        return;
    }

    private void setCloseIconPressed(boolean r2) {
        if (this.k == r2) goto L6;
        this.k = r2;
        refreshDrawableState();
        return;
    }

    public final void b(int r11) {
        this.p = r11;
        int r2 = 0;
        if (this.n == true) goto L11;
        InsetDrawable r112 = this.f;
        if (r112 == null) goto L9;
        if (r112 == null) goto L46;
        this.f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        int[] r113 = g10.a;
        e();
        return;
    L46:
        return;
    L9:
        int[] r114 = g10.a;
        e();
        return;
    L11:
        int r0 = Math.max(0, r11 - ((int) this.e.z));
        int r3 = Math.max(0, r11 - this.e.getIntrinsicWidth());
        if (r3 > 0) goto L21;
        if (r0 > 0) goto L21;
        InsetDrawable r115 = this.f;
        if (r115 == null) goto L19;
        if (r115 == null) goto L47;
        this.f = null;
        setMinWidth(0);
        setMinHeight((int) getChipMinHeight());
        int[] r116 = g10.a;
        e();
        return;
    L47:
        return;
    L19:
        int[] r117 = g10.a;
        e();
        return;
    L21:
        if (r3 <= 0) goto L23;
        int r6 = r3 / 2;
    L24:
        if (r0 <= 0) goto L26;
        r2 = r0 / 2;
    L26:
        int r7 = r2;
        if (this.f == null) goto L39;
        Rect r02 = new Rect();
        this.f.getPadding(r02);
        if (r02.top != r7) goto L39;
        if (r02.bottom != r7) goto L39;
        if (r02.left != r6) goto L39;
        if (r02.right != r6) goto L39;
        int[] r118 = g10.a;
        e();
        return;
    L39:
        if (getMinHeight() == r11) goto L42;
        setMinHeight(r11);
    L42:
        if (getMinWidth() == r11) goto L44;
        setMinWidth(r11);
    L44:
        this.f = new InsetDrawable(this.e, r6, r7, r6, r7);
        int[] r119 = g10.a;
        e();
        return;
    L23:
        r6 = 0;
        goto L24
    }

    public final boolean c() {
        ka r0 = this.e;
        if (r0 == null) goto L13;
        Object r02 = r0.L;
        if (r02 != null) goto L7;
    L9:
        r02 = null;
    L10:
        if (r02 == null) goto L15;
        return true;
    L15:
        return false;
    L7:
        if ((r02 instanceof ad0) == false) goto L10;
        ad0 r03 = (ad0) r02;
        goto L9
    L13:
        return false;
    }

    public final void d() {
        if (c() == false) goto L12;
        ka r0 = this.e;
        if (r0 == null) goto L12;
        if (r0.K == false) goto L12;
        if (this.h == null) goto L12;
        ja0.l(this, this.r);
        this.s = true;
        return;
    L12:
        ja0.l(this, null);
        this.s = false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent r9) {
        if (this.s == false) goto L5;
        ia r0 = this.r;
        AccessibilityManager r1 = r0.h;
        int r3 = 0;
        if (r1.isEnabled() == false) goto L35;
        if (r1.isTouchExplorationEnabled() == false) goto L35;
        int r12 = r9.getAction();
        if (r12 != 7) goto L14;
    L24:
        float r13 = r9.getX();
        float r92 = r9.getY();
        Chip r2 = r0.n;
        if (r2.c() == true) goto L27;
    L29:
        int r93 = r0.m;
        if (r93 == r3) goto L36;
        r0.m = r3;
        r0.p(r3, 128);
        r0.p(r93, 256);
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
        int r14 = r0.m;
        if (r14 == Integer.MIN_VALUE) goto L35;
        if (r14 == Integer.MIN_VALUE) goto L36;
        r0.m = Integer.MIN_VALUE;
        r0.p(Integer.MIN_VALUE, 128);
        r0.p(r14, 256);
        return true;
    L35:
        if (super.dispatchHoverEvent(r9) == true) goto L36;
        return false;
    L5:
        return super.dispatchHoverEvent(r9);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r10) {
        if (this.s == false) goto L5;
        ia r0 = this.r;
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
        if (r0.m(r5, null) == false) goto L30;
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
        int r13 = r0.l;
        if (r13 == Integer.MIN_VALUE) goto L47;
        Chip r52 = r0.n;
        if (r13 != 0) goto L40;
        r52.performClick();
        goto L47
    L40:
        if (r13 != 1) goto L47;
        r52.playSoundEffect(0);
        View.OnClickListener r14 = r52.h;
        if (r14 == null) goto L45;
        r14.onClick(r52);
    L45:
        if (r52.s == false) goto L47;
        r52.r.p(1, 1);
    L47:
        r2 = true;
        goto L54
    L49:
        if (r10.hasNoModifiers() == false) goto L52;
        r2 = r0.m(2, null);
        goto L54
    L52:
        if (r10.hasModifiers(1) == false) goto L54;
        r2 = r0.m(1, null);
    L54:
        if (r2 == false) goto L59;
        if (r0.l == Integer.MIN_VALUE) goto L59;
        return true;
    L59:
        return super.dispatchKeyEvent(r10);
    L5:
        return super.dispatchKeyEvent(r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.y2, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ka r0 = this.e;
        boolean r1 = false;
        if (r0 != null) goto L5;
    L39:
        if (r1 == false) goto L42;
        invalidate();
        return;
    L42:
        return;
    L5:
        if (ka.t(r0.L) == false) goto L39;
        ka r02 = this.e;
        ?? r2 = isEnabled();
        int r22 = r2;
        if (this.m == false) goto L9;
        r22 = r2 + 1;
    L9:
        int r23 = r22;
        if (this.l == false) goto L12;
        r23 = r22 + 1;
    L12:
        int r24 = r23;
        if (this.k == false) goto L15;
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
        if (this.m == false) goto L26;
        r26[r3] = 16842908;
        r3 = r3 + 1;
    L26:
        if (this.l == false) goto L29;
        r26[r3] = 16843623;
        r3 = r3 + 1;
    L29:
        if (this.k == false) goto L32;
        r26[r3] = 16842919;
        r3 = r3 + 1;
    L32:
        if (isChecked() == false) goto L35;
        r26[r3] = 16842913;
    L35:
        if (Arrays.equals(r02.y0, r26) == true) goto L39;
        r02.y0 = r26;
        if (r02.T() == false) goto L39;
        r1 = r02.v(r02.getState(), r26);
        goto L39
    L21:
        r3 = 0;
        goto L23
    }

    public final void e() {
        this.g = new RippleDrawable(g10.a(this.e.D), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable r0 = this.g;
        WeakHashMap r1 = ja0.a;
        s90.q(this, r0);
        f();
    }

    public final void f() {
        if (TextUtils.isEmpty(getText()) == true) goto L12;
        ka r0 = this.e;
        if (r0 == null) goto L13;
        float r1 = r0.d0 + r0.a0;
        int r02 = (int) (r0.q() + r1);
        ka r12 = this.e;
        float r2 = r12.W + r12.Z;
        int r13 = (int) (r12.p() + r2);
        if (this.f == null) goto L10;
        Rect r22 = new Rect();
        this.f.getPadding(r22);
        r13 = r13 + r22.left;
        r02 = r02 + r22.right;
    L10:
        int r23 = getPaddingTop();
        int r3 = getPaddingBottom();
        WeakHashMap r4 = ja0.a;
        t90.k(this, r13, r23, r02, r3);
        return;
    L13:
        return;
    }

    public final void g() {
        TextPaint r0 = getPaint();
        ka r1 = this.e;
        if (r1 == null) goto L5;
        r0.drawableState = r1.getState();
    L5:
        a60 r12 = getTextAppearance();
        if (r12 == null) goto L9;
        r12.e(getContext(), r0, this.v);
        return;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (TextUtils.isEmpty(this.q) == false) goto L5;
        ka r0 = this.e;
        if (r0 == null) goto L13;
        if (r0.Q == false) goto L13;
        getParent();
        return "android.widget.Button";
    L13:
        if (isClickable() == false) goto L15;
        return "android.widget.Button";
    L15:
        return "android.view.View";
    L5:
        return this.q;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable r0 = this.f;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.e;
    }

    public Drawable getCheckedIcon() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.S;
    }

    public ColorStateList getCheckedIconTint() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.T;
    }

    public ColorStateList getChipBackgroundColor() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.y;
    }

    public float getChipCornerRadius() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return Math.max(0.0f, r0.r());
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        ka r0 = this.e;
        if (r0 == null) goto L10;
        Drawable r02 = r0.G;
        if (r02 == 0) goto L10;
        if ((r02 instanceof ad0) == false) goto L11;
        ad0 r03 = (ad0) r02;
        return null;
    L11:
        return r02;
    L10:
        return null;
    }

    public float getChipIconSize() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.I;
    }

    public ColorStateList getChipIconTint() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.H;
    }

    public float getChipMinHeight() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.z;
    }

    public float getChipStartPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.W;
    }

    public ColorStateList getChipStrokeColor() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.B;
    }

    public float getChipStrokeWidth() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.C;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        ka r0 = this.e;
        if (r0 == null) goto L10;
        Drawable r02 = r0.L;
        if (r02 == 0) goto L10;
        if ((r02 instanceof ad0) == false) goto L11;
        ad0 r03 = (ad0) r02;
        return null;
    L11:
        return r02;
    L10:
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.P;
    }

    public float getCloseIconEndPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.c0;
    }

    public float getCloseIconSize() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.O;
    }

    public float getCloseIconStartPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.b0;
    }

    public ColorStateList getCloseIconTint() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.N;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.B0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect r4) {
        if (this.s == false) goto L10;
        ia r0 = this.r;
        if (r0.l != 1) goto L7;
    L8:
        r4.set(getCloseIconTouchBoundsInt());
        return;
    L7:
        if (r0.k == 1) goto L8;
    L10:
        super.getFocusedRect(r4);
    }

    public bw getHideMotionSpec() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.V;
    }

    public float getIconEndPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.Y;
    }

    public float getIconStartPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.X;
    }

    public ColorStateList getRippleColor() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.D;
    }

    public f30 getShapeAppearanceModel() {
        return this.e.a.a;
    }

    public bw getShowMotionSpec() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.U;
    }

    public float getTextEndPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.a0;
    }

    public float getTextStartPadding() {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return 0.0f;
    L5:
        return r0.Z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gt.D(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (isChecked() == false) goto L5;
        View.mergeDrawableStates(r22, x);
    L5:
        ka r0 = this.e;
        if (r0 != null) goto L8;
    L10:
        return r22;
    L8:
        if (r0.Q == false) goto L10;
        View.mergeDrawableStates(r22, y);
        goto L10
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r4, int r5, Rect r6) {
        super.onFocusChanged(r4, r5, r6);
        if (this.s == false) goto L10;
        ia r0 = this.r;
        int r1 = r0.l;
        if (r1 == Integer.MIN_VALUE) goto L7;
        r0.j(r1);
    L7:
        if (r4 == false) goto L11;
        r0.m(r5, r6);
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
        ka r0 = this.e;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        r2.setCheckable(r02);
        r2.setClickable(isClickable());
        getParent();
        return;
    L5:
        if (r0.Q == false) goto L7;
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
        if (this.o == r2) goto L6;
        this.o = r2;
        f();
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
        if (this.k == false) goto L28;
        if (r1 == true) goto L14;
        setCloseIconPressed(false);
    L14:
        r02 = true;
        goto L29
    L16:
        if (this.k == false) goto L24;
        playSoundEffect(0);
        View.OnClickListener r03 = this.h;
        if (r03 == null) goto L21;
        r03.onClick(this);
    L21:
        if (this.s == false) goto L23;
        this.r.p(1, 1);
    L23:
        r02 = true;
        goto L25
    L26:
        if (r1 == false) goto L28;
        setCloseIconPressed(true);
        goto L14
    }

    public void setAccessibilityClassName(CharSequence r1) {
        this.q = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L8:
        super.setBackground(r2);
        return;
    L5:
        if (r2 == this.g) goto L8;
        Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.y2, android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != getBackgroundDrawable()) goto L5;
    L8:
        super.setBackgroundDrawable(r2);
        return;
    L5:
        if (r2 == this.g) goto L8;
        Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
    }

    @Override // defpackage.y2, android.view.View
    public void setBackgroundResource(int r2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.w(r2);
        return;
    }

    public void setCheckableResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.w(r0.e0.getResources().getBoolean(r3));
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
        ka r0 = this.e;
        if (r0 != null) goto L7;
        this.j = r2;
        return;
    L7:
        if (r0.Q == false) goto L10;
        super.setChecked(r2);
        return;
    }

    public void setCheckedIcon(Drawable r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.x(r2);
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
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.x(ff.r(r0.e0, r3));
        return;
    }

    public void setCheckedIconTint(ColorStateList r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.y(r2);
        return;
    }

    public void setCheckedIconTintResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.y(ip.v(r0.e0, r3));
        return;
    }

    public void setCheckedIconVisible(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.z(r0.e0.getResources().getBoolean(r3));
        return;
    }

    public void setChipBackgroundColor(ColorStateList r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.y == r3) goto L9;
        r0.y = r3;
        r0.onStateChange(r0.getState());
        return;
    }

    public void setChipBackgroundColorResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        ColorStateList r32 = ip.v(r0.e0, r3);
        if (r0.y == r32) goto L9;
        r0.y = r32;
        r0.onStateChange(r0.getState());
        return;
    L9:
        return;
    }

    @Deprecated
    public void setChipCornerRadius(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.A(r2);
        return;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.A(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setChipDrawable(ka r4) {
        ka r0 = this.e;
        if (r0 == r4) goto L8;
        if (r0 == null) goto L6;
        r0.A0 = new WeakReference(null);
    L6:
        this.e = r4;
        r4.C0 = false;
        r4.A0 = new WeakReference(this);
        b(this.p);
        return;
    }

    public void setChipEndPadding(float r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.d0 == r3) goto L9;
        r0.d0 = r3;
        r0.invalidateSelf();
        r0.u();
        return;
    }

    public void setChipEndPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        float r32 = r0.e0.getResources().getDimension(r3);
        if (r0.d0 == r32) goto L9;
        r0.d0 = r32;
        r0.invalidateSelf();
        r0.u();
        return;
    L9:
        return;
    }

    public void setChipIcon(Drawable r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.B(r2);
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
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.B(ff.r(r0.e0, r3));
        return;
    }

    public void setChipIconSize(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.C(r2);
        return;
    }

    public void setChipIconSizeResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.C(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setChipIconTint(ColorStateList r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.D(r2);
        return;
    }

    public void setChipIconTintResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.D(ip.v(r0.e0, r3));
        return;
    }

    public void setChipIconVisible(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.E(r0.e0.getResources().getBoolean(r3));
        return;
    }

    public void setChipMinHeight(float r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.z == r3) goto L9;
        r0.z = r3;
        r0.invalidateSelf();
        r0.u();
        return;
    }

    public void setChipMinHeightResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        float r32 = r0.e0.getResources().getDimension(r3);
        if (r0.z == r32) goto L9;
        r0.z = r32;
        r0.invalidateSelf();
        r0.u();
        return;
    L9:
        return;
    }

    public void setChipStartPadding(float r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.W == r3) goto L9;
        r0.W = r3;
        r0.invalidateSelf();
        r0.u();
        return;
    }

    public void setChipStartPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        float r32 = r0.e0.getResources().getDimension(r3);
        if (r0.W == r32) goto L9;
        r0.W = r32;
        r0.invalidateSelf();
        r0.u();
        return;
    L9:
        return;
    }

    public void setChipStrokeColor(ColorStateList r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.F(r2);
        return;
    }

    public void setChipStrokeColorResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.F(ip.v(r0.e0, r3));
        return;
    }

    public void setChipStrokeWidth(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.G(r2);
        return;
    }

    public void setChipStrokeWidthResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.G(r0.e0.getResources().getDimension(r3));
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
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.H(r2);
    L5:
        d();
    }

    public void setCloseIconContentDescription(CharSequence r4) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.P == r4) goto L13;
        String r1 = m7.b;
        Locale r12 = Locale.getDefault();
        int r2 = i60.a;
        if (h60.a(r12) != 1) goto L9;
        m7 r13 = m7.e;
    L10:
        r13.getClass();
        r7 r22 = b60.a;
        r0.P = r13.c(r4);
        r0.invalidateSelf();
        return;
    L9:
        r13 = m7.d;
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
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.I(r2);
        return;
    }

    public void setCloseIconEndPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.I(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.H(ff.r(r0.e0, r3));
    L5:
        d();
    }

    public void setCloseIconSize(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.J(r2);
        return;
    }

    public void setCloseIconSizeResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.J(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconStartPadding(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.K(r2);
        return;
    }

    public void setCloseIconStartPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.K(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setCloseIconTint(ColorStateList r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.L(r2);
        return;
    }

    public void setCloseIconTintResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.L(ip.v(r0.e0, r3));
        return;
    }

    public void setCloseIconVisible(int r2) {
        setCloseIconVisible(getResources().getBoolean(r2));
    }

    @Override // defpackage.y2, android.widget.TextView
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

    @Override // defpackage.y2, android.widget.TextView
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
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt r2) {
        if (this.e != null) goto L6;
        return;
    L6:
        if (r2 == TextUtils.TruncateAt.MARQUEE) goto L12;
        super.setEllipsize(r2);
        ka r0 = this.e;
        if (r0 == null) goto L13;
        r0.B0 = r2;
        return;
    L13:
        return;
    L12:
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
        this.n = r1;
        b(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
        if (r2 == 8388627) goto L6;
        Log.w("Chip", "Chip text must be vertically center and start aligned");
        return;
    L6:
        super.setGravity(r2);
    }

    public void setHideMotionSpec(bw r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.V = r2;
        return;
    }

    public void setHideMotionSpecResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.V = bw.a(r0.e0, r3);
        return;
    }

    public void setIconEndPadding(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.N(r2);
        return;
    }

    public void setIconEndPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.N(r0.e0.getResources().getDimension(r3));
        return;
    }

    public void setIconStartPadding(float r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.O(r2);
        return;
    }

    public void setIconStartPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.O(r0.e0.getResources().getDimension(r3));
        return;
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
        if (this.e != null) goto L5;
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
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.D0 = r2;
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
        this.i = r1;
    }

    public void setOnCloseIconClickListener(View.OnClickListener r1) {
        this.h = r1;
        d();
    }

    public void setRippleColor(ColorStateList r2) {
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.P(r2);
    L5:
        this.e.getClass();
        e();
    }

    public void setRippleColorResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.P(ip.v(r0.e0, r3));
        this.e.getClass();
        e();
        return;
    }

    @Override // defpackage.q30
    public void setShapeAppearanceModel(f30 r2) {
        this.e.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(bw r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.U = r2;
        return;
    }

    public void setShowMotionSpecResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.U = bw.a(r0.e0, r3);
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
        ka r0 = this.e;
        if (r0 == null) goto L19;
        if (r2 != null) goto L8;
        r2 = "";
    L8:
        if (r0.C0 == false) goto L10;
        CharSequence r02 = null;
    L11:
        super.setText(r02, r3);
        ka r32 = this.e;
        if (r32 != null) goto L14;
        return;
    L14:
        if (TextUtils.equals(r32.E, r2) == true) goto L18;
        r32.E = r2;
        r32.k0.d = true;
        r32.invalidateSelf();
        r32.u();
        return;
    L18:
        return;
    L10:
        r02 = r2;
        goto L11
    }

    public void setTextAppearance(a60 r2) {
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.Q(r2);
    L5:
        g();
    }

    public void setTextAppearanceResource(int r2) {
        setTextAppearance(getContext(), r2);
    }

    public void setTextEndPadding(float r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.a0 == r3) goto L9;
        r0.a0 = r3;
        r0.invalidateSelf();
        r0.u();
        return;
    }

    public void setTextEndPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        float r32 = r0.e0.getResources().getDimension(r3);
        if (r0.a0 == r32) goto L9;
        r0.a0 = r32;
        r0.invalidateSelf();
        r0.u();
        return;
    L9:
        return;
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        super.setTextSize(r3, r4);
        ka r0 = this.e;
        if (r0 == null) goto L7;
        float r32 = TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics());
        d60 r42 = r0.k0;
        a60 r1 = r42.f;
        if (r1 == null) goto L7;
        r1.k = r32;
        r42.a.setTextSize(r32);
        r0.u();
        r0.invalidateSelf();
    L7:
        g();
    }

    public void setTextStartPadding(float r3) {
        ka r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.Z == r3) goto L9;
        r0.Z = r3;
        r0.invalidateSelf();
        r0.u();
        return;
    }

    public void setTextStartPaddingResource(int r3) {
        ka r0 = this.e;
        if (r0 == null) goto L8;
        float r32 = r0.e0.getResources().getDimension(r3);
        if (r0.Z == r32) goto L9;
        r0.Z = r32;
        r0.invalidateSelf();
        r0.u();
        return;
    L9:
        return;
    }

    public void setCloseIconVisible(boolean r2) {
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.M(r2);
    L5:
        d();
    }

    public void setCheckedIconVisible(boolean r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.z(r2);
        return;
    }

    public void setChipIconVisible(boolean r2) {
        ka r0 = this.e;
        if (r0 == null) goto L6;
        r0.E(r2);
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
        ka r32 = this.e;
        if (r32 == null) goto L5;
        r32.Q(new a60(r32.e0, r4));
    L5:
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
        super.setTextAppearance(r4);
        ka r0 = this.e;
        if (r0 == null) goto L5;
        r0.Q(new a60(r0.e0, r4));
    L5:
        g();
    }

    public void setInternalOnCheckedChangeListener(yt r1) {
    }
}
