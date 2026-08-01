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
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p000.AbstractC0126ct;
import p000.AbstractC0151dh;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0346ip;
import p000.AbstractC0873wy;
import p000.C0083bw;
import p000.C0250g6;
import p000.C0291ha;
import p000.C0328ia;
import p000.C0404ka;
import p000.C0475m7;
import p000.C0661r7;
import p000.C0915y2;
import p000.InterfaceC0367ja;
import p000.InterfaceC0942yt;
import p000.a60;
import p000.a80;
import p000.ad0;
import p000.b60;
import p000.d60;
import p000.f30;
import p000.g10;
import p000.h60;
import p000.i60;
import p000.ja0;
import p000.q30;
import p000.s90;
import p000.t90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0915y2 implements InterfaceC0367ja, q30, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f1098w = new Rect();

    /* JADX INFO: renamed from: x */
    public static final int[] f1099x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y */
    public static final int[] f1100y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C0404ka f1101e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f1102f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f1103g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f1104h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f1105i;

    /* JADX INFO: renamed from: j */
    public boolean f1106j;

    /* JADX INFO: renamed from: k */
    public boolean f1107k;

    /* JADX INFO: renamed from: l */
    public boolean f1108l;

    /* JADX INFO: renamed from: m */
    public boolean f1109m;

    /* JADX INFO: renamed from: n */
    public boolean f1110n;

    /* JADX INFO: renamed from: o */
    public int f1111o;

    /* JADX INFO: renamed from: p */
    public int f1112p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1113q;

    /* JADX INFO: renamed from: r */
    public final C0328ia f1114r;

    /* JADX INFO: renamed from: s */
    public boolean f1115s;

    /* JADX INFO: renamed from: t */
    public final Rect f1116t;

    /* JADX INFO: renamed from: u */
    public final RectF f1117u;

    /* JADX INFO: renamed from: v */
    public final C0291ha f1118v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0222ff.m1177W(context, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.ljx.wechatmod.R.attr.chipStyle);
        this.f1116t = new Rect();
        this.f1117u = new RectF();
        this.f1118v = new C0291ha(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C0404ka c0404ka = new C0404ka(context2, attributeSet);
        Context context3 = c0404ka.f2783e0;
        int[] iArr = AbstractC0873wy.f5044c;
        TypedArray typedArrayM56u = a80.m56u(context3, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0404ka.f2757E0 = typedArrayM56u.hasValue(37);
        Context context4 = c0404ka.f2783e0;
        ColorStateList colorStateListM816n = AbstractC0126ct.m816n(context4, typedArrayM56u, 24);
        if (c0404ka.f2802x != colorStateListM816n) {
            c0404ka.f2802x = colorStateListM816n;
            c0404ka.onStateChange(c0404ka.getState());
        }
        ColorStateList colorStateListM816n2 = AbstractC0126ct.m816n(context4, typedArrayM56u, 11);
        if (c0404ka.f2804y != colorStateListM816n2) {
            c0404ka.f2804y = colorStateListM816n2;
            c0404ka.onStateChange(c0404ka.getState());
        }
        float dimension = typedArrayM56u.getDimension(19, 0.0f);
        if (c0404ka.f2806z != dimension) {
            c0404ka.f2806z = dimension;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        if (typedArrayM56u.hasValue(12)) {
            c0404ka.m1656A(typedArrayM56u.getDimension(12, 0.0f));
        }
        c0404ka.m1661F(AbstractC0126ct.m816n(context4, typedArrayM56u, 22));
        c0404ka.m1662G(typedArrayM56u.getDimension(23, 0.0f));
        c0404ka.m1671P(AbstractC0126ct.m816n(context4, typedArrayM56u, 36));
        String text = typedArrayM56u.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0404ka.f2756E, text)) {
            c0404ka.f2756E = text;
            c0404ka.f2789k0.f1392d = true;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        a60 a60Var = (!typedArrayM56u.hasValue(0) || (resourceId3 = typedArrayM56u.getResourceId(0, 0)) == 0) ? null : new a60(context4, resourceId3);
        a60Var.f56k = typedArrayM56u.getDimension(1, a60Var.f56k);
        c0404ka.m1672Q(a60Var);
        int i = typedArrayM56u.getInt(3, 0);
        if (i == 1) {
            c0404ka.f2751B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0404ka.f2751B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0404ka.f2751B0 = TextUtils.TruncateAt.END;
        }
        c0404ka.m1660E(typedArrayM56u.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0404ka.m1660E(typedArrayM56u.getBoolean(15, false));
        }
        c0404ka.m1657B(AbstractC0126ct.m817o(context4, typedArrayM56u, 14));
        if (typedArrayM56u.hasValue(17)) {
            c0404ka.m1659D(AbstractC0126ct.m816n(context4, typedArrayM56u, 17));
        }
        c0404ka.m1658C(typedArrayM56u.getDimension(16, -1.0f));
        c0404ka.m1668M(typedArrayM56u.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0404ka.m1668M(typedArrayM56u.getBoolean(26, false));
        }
        c0404ka.m1663H(AbstractC0126ct.m817o(context4, typedArrayM56u, 25));
        c0404ka.m1667L(AbstractC0126ct.m816n(context4, typedArrayM56u, 30));
        c0404ka.m1665J(typedArrayM56u.getDimension(28, 0.0f));
        c0404ka.m1683w(typedArrayM56u.getBoolean(6, false));
        c0404ka.m1686z(typedArrayM56u.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0404ka.m1686z(typedArrayM56u.getBoolean(8, false));
        }
        c0404ka.m1684x(AbstractC0126ct.m817o(context4, typedArrayM56u, 7));
        if (typedArrayM56u.hasValue(9)) {
            c0404ka.m1685y(AbstractC0126ct.m816n(context4, typedArrayM56u, 9));
        }
        c0404ka.f2773U = (!typedArrayM56u.hasValue(39) || (resourceId2 = typedArrayM56u.getResourceId(39, 0)) == 0) ? null : C0083bw.m582a(context4, resourceId2);
        c0404ka.f2774V = (!typedArrayM56u.hasValue(33) || (resourceId = typedArrayM56u.getResourceId(33, 0)) == 0) ? null : C0083bw.m582a(context4, resourceId);
        float dimension2 = typedArrayM56u.getDimension(21, 0.0f);
        if (c0404ka.f2775W != dimension2) {
            c0404ka.f2775W = dimension2;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        c0404ka.m1670O(typedArrayM56u.getDimension(35, 0.0f));
        c0404ka.m1669N(typedArrayM56u.getDimension(34, 0.0f));
        float dimension3 = typedArrayM56u.getDimension(41, 0.0f);
        if (c0404ka.f2778Z != dimension3) {
            c0404ka.f2778Z = dimension3;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        float dimension4 = typedArrayM56u.getDimension(40, 0.0f);
        if (c0404ka.f2779a0 != dimension4) {
            c0404ka.f2779a0 = dimension4;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        c0404ka.m1666K(typedArrayM56u.getDimension(29, 0.0f));
        c0404ka.m1664I(typedArrayM56u.getDimension(27, 0.0f));
        float dimension5 = typedArrayM56u.getDimension(13, 0.0f);
        if (c0404ka.f2782d0 != dimension5) {
            c0404ka.f2782d0 = dimension5;
            c0404ka.invalidateSelf();
            c0404ka.m1681u();
        }
        c0404ka.f2755D0 = typedArrayM56u.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM56u.recycle();
        a80.m39c(context2, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        a80.m41e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1110n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f1112p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0404ka);
        c0404ka.m1084i(y90.m2663i(this));
        a80.m39c(context2, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        a80.m41e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f1114r = new C0328ia(this, this);
        m752d();
        if (!zHasValue) {
            setOutlineProvider(new C0250g6(7, this));
        }
        setChecked(this.f1106j);
        setText(c0404ka.f2756E);
        setEllipsize(c0404ka.f2751B0);
        m755g();
        if (!this.f1101e.f2753C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m754f();
        if (this.f1110n) {
            setMinHeight(this.f1112p);
        }
        this.f1111o = t90.m2367d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ga
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f2047a.f1105i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1117u;
        rectF.setEmpty();
        if (m751c() && this.f1104h != null) {
            C0404ka c0404ka = this.f1101e;
            Rect bounds = c0404ka.getBounds();
            rectF.setEmpty();
            if (c0404ka.m1675T()) {
                float f = c0404ka.f2782d0 + c0404ka.f2781c0 + c0404ka.f2767O + c0404ka.f2780b0 + c0404ka.f2779a0;
                if (AbstractC0151dh.m941a(c0404ka) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1116t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private a60 getTextAppearance() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2789k0.f1394f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f1108l != z) {
            this.f1108l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f1107k != z) {
            this.f1107k = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m750b(int i) {
        this.f1112p = i;
        if (!this.f1110n) {
            InsetDrawable insetDrawable = this.f1102f;
            if (insetDrawable == null) {
                int[] iArr = g10.f2002a;
                m753e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1102f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = g10.f2002a;
                    m753e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f1101e.f2806z));
        int iMax2 = Math.max(0, i - this.f1101e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f1102f;
            if (insetDrawable2 == null) {
                int[] iArr3 = g10.f2002a;
                m753e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1102f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = g10.f2002a;
                    m753e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f1102f != null) {
            Rect rect = new Rect();
            this.f1102f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = g10.f2002a;
                m753e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f1102f = new InsetDrawable((Drawable) this.f1101e, i2, i3, i2, i3);
        int[] iArr6 = g10.f2002a;
        m753e();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m751c() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null) {
            return false;
        }
        Object obj = c0404ka.f2764L;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof ad0) {
            obj = null;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m752d() {
        C0404ka c0404ka;
        if (!m751c() || (c0404ka = this.f1101e) == null || !c0404ka.f2763K || this.f1104h == null) {
            ja0.m1575l(this, null);
            this.f1115s = false;
        } else {
            ja0.m1575l(this, this.f1114r);
            this.f1115s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f1115s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            ia r0 = r8.f1114r
            android.view.accessibility.AccessibilityManager r1 = r0.f2394h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.f2399m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f2399m = r2
            r0.m1423p(r2, r6)
            r0.m1423p(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.f2400n
            boolean r7 = r2.m751c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.f2399m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.f2399m = r3
            r0.m1423p(r3, r6)
            r0.m1423p(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f1115s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            ia r0 = r9.f1114r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m1420m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f2398l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f2400n
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f1104h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f1115s
            if (r1 == 0) goto L85
            ia r1 = r5.f1114r
            r1.m1423p(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m1420m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m1420m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f2398l
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.C0915y2, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0404ka c0404ka = this.f1101e;
        boolean zM1682v = false;
        if (c0404ka != null && C0404ka.m1655t(c0404ka.f2764L)) {
            C0404ka c0404ka2 = this.f1101e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f1109m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f1108l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1107k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f1109m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1108l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1107k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0404ka2.f2805y0, iArr)) {
                c0404ka2.f2805y0 = iArr;
                if (c0404ka2.m1675T()) {
                    zM1682v = c0404ka2.m1682v(c0404ka2.getState(), iArr);
                }
            }
        }
        if (zM1682v) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m753e() {
        this.f1103g = new RippleDrawable(g10.m1247a(this.f1101e.f2754D), getBackgroundDrawable(), null);
        this.f1101e.getClass();
        RippleDrawable rippleDrawable = this.f1103g;
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(this, rippleDrawable);
        m754f();
    }

    /* JADX INFO: renamed from: f */
    public final void m754f() {
        C0404ka c0404ka;
        if (TextUtils.isEmpty(getText()) || (c0404ka = this.f1101e) == null) {
            return;
        }
        int iM1679q = (int) (c0404ka.m1679q() + c0404ka.f2782d0 + c0404ka.f2779a0);
        C0404ka c0404ka2 = this.f1101e;
        int iM1678p = (int) (c0404ka2.m1678p() + c0404ka2.f2775W + c0404ka2.f2778Z);
        if (this.f1102f != null) {
            Rect rect = new Rect();
            this.f1102f.getPadding(rect);
            iM1678p += rect.left;
            iM1679q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = ja0.f2600a;
        t90.m2374k(this, iM1678p, paddingTop, iM1679q, paddingBottom);
    }

    /* JADX INFO: renamed from: g */
    public final void m755g() {
        TextPaint paint = getPaint();
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            paint.drawableState = c0404ka.getState();
        }
        a60 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m22e(getContext(), paint, this.f1118v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1113q)) {
            return this.f1113q;
        }
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || !c0404ka.f2769Q) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1102f;
        return insetDrawable == null ? this.f1101e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2771S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2772T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2804y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return Math.max(0.0f, c0404ka.m1680r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1101e;
    }

    public float getChipEndPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2782d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || (drawable = c0404ka.f2759G) == 0) {
            return null;
        }
        if (!(drawable instanceof ad0)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2761I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2760H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2806z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2775W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2750B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2752C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || (drawable = c0404ka.f2764L) == 0) {
            return null;
        }
        if (!(drawable instanceof ad0)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2768P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2781c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2767O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2780b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2766N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2751B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1115s) {
            C0328ia c0328ia = this.f1114r;
            if (c0328ia.f2398l == 1 || c0328ia.f2397k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0083bw getHideMotionSpec() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2774V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2777Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2776X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2754D;
        }
        return null;
    }

    public f30 getShapeAppearanceModel() {
        return this.f1101e.f1842a.f1633a;
    }

    public C0083bw getShowMotionSpec() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2773U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2779a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            return c0404ka.f2778Z;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0273gt.m1298D(this, this.f1101e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1099x);
        }
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null && c0404ka.f2769Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1100y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f1115s) {
            C0328ia c0328ia = this.f1114r;
            int i2 = c0328ia.f2398l;
            if (i2 != Integer.MIN_VALUE) {
                c0328ia.m1417j(i2);
            }
            if (z) {
                c0328ia.m1420m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0404ka c0404ka = this.f1101e;
        accessibilityNodeInfo.setCheckable(c0404ka != null && c0404ka.f2769Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1111o != i) {
            this.f1111o = i;
            m754f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f1107k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f1107k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f1104h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f1115s
            if (r0 == 0) goto L43
            ia r0 = r5.f1114r
            r0.m1423p(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1113q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1103g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000.C0915y2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1103g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000.C0915y2, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1683w(z);
        }
    }

    public void setCheckableResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1683w(c0404ka.f2783e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null) {
            this.f1106j = z;
        } else if (c0404ka.f2769Q) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1684x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1684x(AbstractC0222ff.m1196r(c0404ka.f2783e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1685y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1685y(AbstractC0346ip.m1510v(c0404ka.f2783e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1686z(c0404ka.f2783e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2804y == colorStateList) {
            return;
        }
        c0404ka.f2804y = colorStateList;
        c0404ka.onStateChange(c0404ka.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM1510v;
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2804y == (colorStateListM1510v = AbstractC0346ip.m1510v(c0404ka.f2783e0, i))) {
            return;
        }
        c0404ka.f2804y = colorStateListM1510v;
        c0404ka.onStateChange(c0404ka.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1656A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1656A(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0404ka c0404ka) {
        C0404ka c0404ka2 = this.f1101e;
        if (c0404ka2 != c0404ka) {
            if (c0404ka2 != null) {
                c0404ka2.f2749A0 = new WeakReference(null);
            }
            this.f1101e = c0404ka;
            c0404ka.f2753C0 = false;
            c0404ka.f2749A0 = new WeakReference(this);
            m750b(this.f1112p);
        }
    }

    public void setChipEndPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2782d0 == f) {
            return;
        }
        c0404ka.f2782d0 = f;
        c0404ka.invalidateSelf();
        c0404ka.m1681u();
    }

    public void setChipEndPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float dimension = c0404ka.f2783e0.getResources().getDimension(i);
            if (c0404ka.f2782d0 != dimension) {
                c0404ka.f2782d0 = dimension;
                c0404ka.invalidateSelf();
                c0404ka.m1681u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1657B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1657B(AbstractC0222ff.m1196r(c0404ka.f2783e0, i));
        }
    }

    public void setChipIconSize(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1658C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1658C(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1659D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1659D(AbstractC0346ip.m1510v(c0404ka.f2783e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1660E(c0404ka.f2783e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2806z == f) {
            return;
        }
        c0404ka.f2806z = f;
        c0404ka.invalidateSelf();
        c0404ka.m1681u();
    }

    public void setChipMinHeightResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float dimension = c0404ka.f2783e0.getResources().getDimension(i);
            if (c0404ka.f2806z != dimension) {
                c0404ka.f2806z = dimension;
                c0404ka.invalidateSelf();
                c0404ka.m1681u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2775W == f) {
            return;
        }
        c0404ka.f2775W = f;
        c0404ka.invalidateSelf();
        c0404ka.m1681u();
    }

    public void setChipStartPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float dimension = c0404ka.f2783e0.getResources().getDimension(i);
            if (c0404ka.f2775W != dimension) {
                c0404ka.f2775W = dimension;
                c0404ka.invalidateSelf();
                c0404ka.m1681u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1661F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1661F(AbstractC0346ip.m1510v(c0404ka.f2783e0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1662G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1662G(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1663H(drawable);
        }
        m752d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2768P == charSequence) {
            return;
        }
        String str = C0475m7.f3151b;
        Locale locale = Locale.getDefault();
        int i = i60.f2359a;
        C0475m7 c0475m7 = h60.m1349a(locale) == 1 ? C0475m7.f3154e : C0475m7.f3153d;
        c0475m7.getClass();
        C0661r7 c0661r7 = b60.f752a;
        c0404ka.f2768P = c0475m7.m1797c(charSequence);
        c0404ka.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1664I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1664I(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1663H(AbstractC0222ff.m1196r(c0404ka.f2783e0, i));
        }
        m752d();
    }

    public void setCloseIconSize(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1665J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1665J(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1666K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1666K(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1667L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1667L(AbstractC0346ip.m1510v(c0404ka.f2783e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.C0915y2, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.C0915y2, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1084i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1101e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2751B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f1110n = z;
        m750b(this.f1112p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0083bw c0083bw) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2774V = c0083bw;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2774V = C0083bw.m582a(c0404ka.f2783e0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1669N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1669N(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1670O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1670O(c0404ka.f2783e0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1101e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2755D0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1105i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1104h = onClickListener;
        m752d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1671P(colorStateList);
        }
        this.f1101e.getClass();
        m753e();
    }

    public void setRippleColorResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1671P(AbstractC0346ip.m1510v(c0404ka.f2783e0, i));
            this.f1101e.getClass();
            m753e();
        }
    }

    @Override // p000.q30
    public void setShapeAppearanceModel(f30 f30Var) {
        this.f1101e.setShapeAppearanceModel(f30Var);
    }

    public void setShowMotionSpec(C0083bw c0083bw) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2773U = c0083bw;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.f2773U = C0083bw.m582a(c0404ka.f2783e0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0404ka.f2753C0 ? null : charSequence, bufferType);
        C0404ka c0404ka2 = this.f1101e;
        if (c0404ka2 == null || TextUtils.equals(c0404ka2.f2756E, charSequence)) {
            return;
        }
        c0404ka2.f2756E = charSequence;
        c0404ka2.f2789k0.f1392d = true;
        c0404ka2.invalidateSelf();
        c0404ka2.m1681u();
    }

    public void setTextAppearance(a60 a60Var) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1672Q(a60Var);
        }
        m755g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2779a0 == f) {
            return;
        }
        c0404ka.f2779a0 = f;
        c0404ka.invalidateSelf();
        c0404ka.m1681u();
    }

    public void setTextEndPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float dimension = c0404ka.f2783e0.getResources().getDimension(i);
            if (c0404ka.f2779a0 != dimension) {
                c0404ka.f2779a0 = dimension;
                c0404ka.invalidateSelf();
                c0404ka.m1681u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            d60 d60Var = c0404ka.f2789k0;
            a60 a60Var = d60Var.f1394f;
            if (a60Var != null) {
                a60Var.f56k = fApplyDimension;
                d60Var.f1389a.setTextSize(fApplyDimension);
                c0404ka.m1681u();
                c0404ka.invalidateSelf();
            }
        }
        m755g();
    }

    public void setTextStartPadding(float f) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka == null || c0404ka.f2778Z == f) {
            return;
        }
        c0404ka.f2778Z = f;
        c0404ka.invalidateSelf();
        c0404ka.m1681u();
    }

    public void setTextStartPaddingResource(int i) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            float dimension = c0404ka.f2783e0.getResources().getDimension(i);
            if (c0404ka.f2778Z != dimension) {
                c0404ka.f2778Z = dimension;
                c0404ka.invalidateSelf();
                c0404ka.m1681u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1668M(z);
        }
        m752d();
    }

    public void setCheckedIconVisible(boolean z) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1686z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1660E(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1672Q(new a60(c0404ka.f2783e0, i));
        }
        m755g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0404ka c0404ka = this.f1101e;
        if (c0404ka != null) {
            c0404ka.m1672Q(new a60(c0404ka.f2783e0, i));
        }
        m755g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0942yt interfaceC0942yt) {
    }
}
