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
import p000.AbstractC0168dz;
import p000.AbstractC0224fh;
import p000.AbstractC0259gf;
import p000.AbstractC0274gu;
import p000.AbstractC0387ju;
import p000.AbstractC0493mp;
import p000.C0059b8;
import p000.C0250g6;
import p000.C0352iw;
import p000.C0589pa;
import p000.C0626qa;
import p000.C0700sa;
import p000.C0846w7;
import p000.C0915y2;
import p000.InterfaceC0127cu;
import p000.InterfaceC0663ra;
import p000.da0;
import p000.fd0;
import p000.g60;
import p000.g80;
import p000.h60;
import p000.j60;
import p000.m30;
import p000.n10;
import p000.n60;
import p000.o60;
import p000.oa0;
import p000.x30;
import p000.x90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0915y2 implements InterfaceC0663ra, x30, Checkable {

    /* JADX INFO: renamed from: w */
    public static final Rect f1023w = new Rect();

    /* JADX INFO: renamed from: x */
    public static final int[] f1024x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y */
    public static final int[] f1025y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e */
    public C0700sa f1026e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f1027f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f1028g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f1029h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f1030i;

    /* JADX INFO: renamed from: j */
    public boolean f1031j;

    /* JADX INFO: renamed from: k */
    public boolean f1032k;

    /* JADX INFO: renamed from: l */
    public boolean f1033l;

    /* JADX INFO: renamed from: m */
    public boolean f1034m;

    /* JADX INFO: renamed from: n */
    public boolean f1035n;

    /* JADX INFO: renamed from: o */
    public int f1036o;

    /* JADX INFO: renamed from: p */
    public int f1037p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1038q;

    /* JADX INFO: renamed from: r */
    public final C0626qa f1039r;

    /* JADX INFO: renamed from: s */
    public boolean f1040s;

    /* JADX INFO: renamed from: t */
    public final Rect f1041t;

    /* JADX INFO: renamed from: u */
    public final RectF f1042u;

    /* JADX INFO: renamed from: v */
    public final C0589pa f1043v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0259gf.m1245c0(context, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.ljx.wechatmod.R.attr.chipStyle);
        this.f1041t = new Rect();
        this.f1042u = new RectF();
        this.f1043v = new C0589pa(0, this);
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
        C0700sa c0700sa = new C0700sa(context2, attributeSet);
        Context context3 = c0700sa.f4262e0;
        int[] iArr = AbstractC0168dz.f1440c;
        TypedArray typedArrayM1170A = g80.m1170A(context3, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0700sa.f4236E0 = typedArrayM1170A.hasValue(37);
        Context context4 = c0700sa.f4262e0;
        ColorStateList colorStateListM1315i = AbstractC0274gu.m1315i(context4, typedArrayM1170A, 24);
        if (c0700sa.f4281x != colorStateListM1315i) {
            c0700sa.f4281x = colorStateListM1315i;
            c0700sa.onStateChange(c0700sa.getState());
        }
        ColorStateList colorStateListM1315i2 = AbstractC0274gu.m1315i(context4, typedArrayM1170A, 11);
        if (c0700sa.f4283y != colorStateListM1315i2) {
            c0700sa.f4283y = colorStateListM1315i2;
            c0700sa.onStateChange(c0700sa.getState());
        }
        float dimension = typedArrayM1170A.getDimension(19, 0.0f);
        if (c0700sa.f4285z != dimension) {
            c0700sa.f4285z = dimension;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        if (typedArrayM1170A.hasValue(12)) {
            c0700sa.m2330A(typedArrayM1170A.getDimension(12, 0.0f));
        }
        c0700sa.m2335F(AbstractC0274gu.m1315i(context4, typedArrayM1170A, 22));
        c0700sa.m2336G(typedArrayM1170A.getDimension(23, 0.0f));
        c0700sa.m2345P(AbstractC0274gu.m1315i(context4, typedArrayM1170A, 36));
        String text = typedArrayM1170A.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0700sa.f4235E, text)) {
            c0700sa.f4235E = text;
            c0700sa.f4268k0.f2667d = true;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        g60 g60Var = (!typedArrayM1170A.hasValue(0) || (resourceId3 = typedArrayM1170A.getResourceId(0, 0)) == 0) ? null : new g60(context4, resourceId3);
        g60Var.f1892k = typedArrayM1170A.getDimension(1, g60Var.f1892k);
        c0700sa.m2346Q(g60Var);
        int i = typedArrayM1170A.getInt(3, 0);
        if (i == 1) {
            c0700sa.f4230B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0700sa.f4230B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0700sa.f4230B0 = TextUtils.TruncateAt.END;
        }
        c0700sa.m2334E(typedArrayM1170A.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0700sa.m2334E(typedArrayM1170A.getBoolean(15, false));
        }
        c0700sa.m2331B(AbstractC0274gu.m1316j(context4, typedArrayM1170A, 14));
        if (typedArrayM1170A.hasValue(17)) {
            c0700sa.m2333D(AbstractC0274gu.m1315i(context4, typedArrayM1170A, 17));
        }
        c0700sa.m2332C(typedArrayM1170A.getDimension(16, -1.0f));
        c0700sa.m2342M(typedArrayM1170A.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0700sa.m2342M(typedArrayM1170A.getBoolean(26, false));
        }
        c0700sa.m2337H(AbstractC0274gu.m1316j(context4, typedArrayM1170A, 25));
        c0700sa.m2341L(AbstractC0274gu.m1315i(context4, typedArrayM1170A, 30));
        c0700sa.m2339J(typedArrayM1170A.getDimension(28, 0.0f));
        c0700sa.m2357w(typedArrayM1170A.getBoolean(6, false));
        c0700sa.m2360z(typedArrayM1170A.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0700sa.m2360z(typedArrayM1170A.getBoolean(8, false));
        }
        c0700sa.m2358x(AbstractC0274gu.m1316j(context4, typedArrayM1170A, 7));
        if (typedArrayM1170A.hasValue(9)) {
            c0700sa.m2359y(AbstractC0274gu.m1315i(context4, typedArrayM1170A, 9));
        }
        c0700sa.f4252U = (!typedArrayM1170A.hasValue(39) || (resourceId2 = typedArrayM1170A.getResourceId(39, 0)) == 0) ? null : C0352iw.m1541a(context4, resourceId2);
        c0700sa.f4253V = (!typedArrayM1170A.hasValue(33) || (resourceId = typedArrayM1170A.getResourceId(33, 0)) == 0) ? null : C0352iw.m1541a(context4, resourceId);
        float dimension2 = typedArrayM1170A.getDimension(21, 0.0f);
        if (c0700sa.f4254W != dimension2) {
            c0700sa.f4254W = dimension2;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        c0700sa.m2344O(typedArrayM1170A.getDimension(35, 0.0f));
        c0700sa.m2343N(typedArrayM1170A.getDimension(34, 0.0f));
        float dimension3 = typedArrayM1170A.getDimension(41, 0.0f);
        if (c0700sa.f4257Z != dimension3) {
            c0700sa.f4257Z = dimension3;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        float dimension4 = typedArrayM1170A.getDimension(40, 0.0f);
        if (c0700sa.f4258a0 != dimension4) {
            c0700sa.f4258a0 = dimension4;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        c0700sa.m2340K(typedArrayM1170A.getDimension(29, 0.0f));
        c0700sa.m2338I(typedArrayM1170A.getDimension(27, 0.0f));
        float dimension5 = typedArrayM1170A.getDimension(13, 0.0f);
        if (c0700sa.f4261d0 != dimension5) {
            c0700sa.f4261d0 = dimension5;
            c0700sa.invalidateSelf();
            c0700sa.m2355u();
        }
        c0700sa.f4234D0 = typedArrayM1170A.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM1170A.recycle();
        g80.m1188c(context2, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        g80.m1190e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1035n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f1037p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0700sa);
        c0700sa.m1536i(da0.m891i(this));
        g80.m1188c(context2, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        g80.m1190e(context2, attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f1039r = new C0626qa(this, this);
        m710d();
        if (!zHasValue) {
            setOutlineProvider(new C0250g6(7, this));
        }
        setChecked(this.f1031j);
        setText(c0700sa.f4235E);
        setEllipsize(c0700sa.f4230B0);
        m713g();
        if (!this.f1026e.f4232C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m712f();
        if (this.f1035n) {
            setMinHeight(this.f1037p);
        }
        this.f1036o = y90.m2732d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oa
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f3425a.f1030i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1042u;
        rectF.setEmpty();
        if (m709c() && this.f1029h != null) {
            C0700sa c0700sa = this.f1026e;
            Rect bounds = c0700sa.getBounds();
            rectF.setEmpty();
            if (c0700sa.m2349T()) {
                float f = c0700sa.f4261d0 + c0700sa.f4260c0 + c0700sa.f4246O + c0700sa.f4259b0 + c0700sa.f4258a0;
                if (AbstractC0224fh.m1100a(c0700sa) == 0) {
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
        Rect rect = this.f1041t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private g60 getTextAppearance() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4268k0.f2669f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f1033l != z) {
            this.f1033l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f1032k != z) {
            this.f1032k = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m708b(int i) {
        this.f1037p = i;
        if (!this.f1035n) {
            InsetDrawable insetDrawable = this.f1027f;
            if (insetDrawable == null) {
                int[] iArr = n10.f3204a;
                m711e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1027f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = n10.f3204a;
                    m711e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f1026e.f4285z));
        int iMax2 = Math.max(0, i - this.f1026e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f1027f;
            if (insetDrawable2 == null) {
                int[] iArr3 = n10.f3204a;
                m711e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1027f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = n10.f3204a;
                    m711e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f1027f != null) {
            Rect rect = new Rect();
            this.f1027f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = n10.f3204a;
                m711e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f1027f = new InsetDrawable((Drawable) this.f1026e, i2, i3, i2, i3);
        int[] iArr6 = n10.f3204a;
        m711e();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m709c() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null) {
            return false;
        }
        Object obj = c0700sa.f4243L;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof fd0) {
            obj = null;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m710d() {
        C0700sa c0700sa;
        if (!m709c() || (c0700sa = this.f1026e) == null || !c0700sa.f4242K || this.f1029h == null) {
            oa0.m2012l(this, null);
            this.f1040s = false;
        } else {
            oa0.m2012l(this, this.f1039r);
            this.f1040s = true;
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
            boolean r0 = r8.f1040s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            qa r0 = r8.f1039r
            android.view.accessibility.AccessibilityManager r1 = r0.f3882h
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
            int r1 = r0.f3887m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f3887m = r2
            r0.m2138p(r2, r6)
            r0.m2138p(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.f3888n
            boolean r7 = r2.m709c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.f3887m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.f3887m = r3
            r0.m2138p(r3, r6)
            r0.m2138p(r9, r5)
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
            boolean r0 = r9.f1040s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            qa r0 = r9.f1039r
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
            boolean r8 = r0.m2135m(r5, r6)
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
            int r1 = r0.f3886l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f3888n
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f1029h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f1040s
            if (r1 == 0) goto L85
            qa r1 = r5.f1039r
            r1.m2138p(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m2135m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m2135m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f3886l
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
        C0700sa c0700sa = this.f1026e;
        boolean zM2356v = false;
        if (c0700sa != null && C0700sa.m2329t(c0700sa.f4243L)) {
            C0700sa c0700sa2 = this.f1026e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f1034m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f1033l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1032k) {
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
            if (this.f1034m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1033l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1032k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0700sa2.f4284y0, iArr)) {
                c0700sa2.f4284y0 = iArr;
                if (c0700sa2.m2349T()) {
                    zM2356v = c0700sa2.m2356v(c0700sa2.getState(), iArr);
                }
            }
        }
        if (zM2356v) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m711e() {
        this.f1028g = new RippleDrawable(n10.m1909a(this.f1026e.f4233D), getBackgroundDrawable(), null);
        this.f1026e.getClass();
        RippleDrawable rippleDrawable = this.f1028g;
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(this, rippleDrawable);
        m712f();
    }

    /* JADX INFO: renamed from: f */
    public final void m712f() {
        C0700sa c0700sa;
        if (TextUtils.isEmpty(getText()) || (c0700sa = this.f1026e) == null) {
            return;
        }
        int iM2353q = (int) (c0700sa.m2353q() + c0700sa.f4261d0 + c0700sa.f4258a0);
        C0700sa c0700sa2 = this.f1026e;
        int iM2352p = (int) (c0700sa2.m2352p() + c0700sa2.f4254W + c0700sa2.f4257Z);
        if (this.f1027f != null) {
            Rect rect = new Rect();
            this.f1027f.getPadding(rect);
            iM2352p += rect.left;
            iM2353q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = oa0.f3426a;
        y90.m2739k(this, iM2352p, paddingTop, iM2353q, paddingBottom);
    }

    /* JADX INFO: renamed from: g */
    public final void m713g() {
        TextPaint paint = getPaint();
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            paint.drawableState = c0700sa.getState();
        }
        g60 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1167e(getContext(), paint, this.f1043v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1038q)) {
            return this.f1038q;
        }
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || !c0700sa.f4248Q) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1027f;
        return insetDrawable == null ? this.f1026e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4250S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4251T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4283y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return Math.max(0.0f, c0700sa.m2354r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1026e;
    }

    public float getChipEndPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4261d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || (drawable = c0700sa.f4238G) == 0) {
            return null;
        }
        if (!(drawable instanceof fd0)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4240I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4239H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4285z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4254W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4229B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4231C;
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || (drawable = c0700sa.f4243L) == 0) {
            return null;
        }
        if (!(drawable instanceof fd0)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4247P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4260c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4246O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4259b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4245N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4230B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1040s) {
            C0626qa c0626qa = this.f1039r;
            if (c0626qa.f3886l == 1 || c0626qa.f3885k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0352iw getHideMotionSpec() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4253V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4256Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4255X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4233D;
        }
        return null;
    }

    public m30 getShapeAppearanceModel() {
        return this.f1026e.f2585a.f2266a;
    }

    public C0352iw getShowMotionSpec() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4252U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4258a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            return c0700sa.f4257Z;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0387ju.m1631v(this, this.f1026e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1024x);
        }
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null && c0700sa.f4248Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1025y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f1040s) {
            C0626qa c0626qa = this.f1039r;
            int i2 = c0626qa.f3886l;
            if (i2 != Integer.MIN_VALUE) {
                c0626qa.m2132j(i2);
            }
            if (z) {
                c0626qa.m2135m(i, rect);
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
        C0700sa c0700sa = this.f1026e;
        accessibilityNodeInfo.setCheckable(c0700sa != null && c0700sa.f4248Q);
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
        if (this.f1036o != i) {
            this.f1036o = i;
            m712f();
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
            boolean r0 = r5.f1032k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f1032k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f1029h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f1040s
            if (r0 == 0) goto L43
            qa r0 = r5.f1039r
            r0.m2138p(r2, r2)
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
        this.f1038q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1028g) {
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
        if (drawable == getBackgroundDrawable() || drawable == this.f1028g) {
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2357w(z);
        }
    }

    public void setCheckableResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2357w(c0700sa.f4262e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null) {
            this.f1031j = z;
        } else if (c0700sa.f4248Q) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2358x(drawable);
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2358x(AbstractC0259gf.m1261w(c0700sa.f4262e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2359y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2359y(AbstractC0493mp.m1864n(c0700sa.f4262e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2360z(c0700sa.f4262e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4283y == colorStateList) {
            return;
        }
        c0700sa.f4283y = colorStateList;
        c0700sa.onStateChange(c0700sa.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM1864n;
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4283y == (colorStateListM1864n = AbstractC0493mp.m1864n(c0700sa.f4262e0, i))) {
            return;
        }
        c0700sa.f4283y = colorStateListM1864n;
        c0700sa.onStateChange(c0700sa.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2330A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2330A(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0700sa c0700sa) {
        C0700sa c0700sa2 = this.f1026e;
        if (c0700sa2 != c0700sa) {
            if (c0700sa2 != null) {
                c0700sa2.f4228A0 = new WeakReference(null);
            }
            this.f1026e = c0700sa;
            c0700sa.f4232C0 = false;
            c0700sa.f4228A0 = new WeakReference(this);
            m708b(this.f1037p);
        }
    }

    public void setChipEndPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4261d0 == f) {
            return;
        }
        c0700sa.f4261d0 = f;
        c0700sa.invalidateSelf();
        c0700sa.m2355u();
    }

    public void setChipEndPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float dimension = c0700sa.f4262e0.getResources().getDimension(i);
            if (c0700sa.f4261d0 != dimension) {
                c0700sa.f4261d0 = dimension;
                c0700sa.invalidateSelf();
                c0700sa.m2355u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2331B(drawable);
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2331B(AbstractC0259gf.m1261w(c0700sa.f4262e0, i));
        }
    }

    public void setChipIconSize(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2332C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2332C(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2333D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2333D(AbstractC0493mp.m1864n(c0700sa.f4262e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2334E(c0700sa.f4262e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4285z == f) {
            return;
        }
        c0700sa.f4285z = f;
        c0700sa.invalidateSelf();
        c0700sa.m2355u();
    }

    public void setChipMinHeightResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float dimension = c0700sa.f4262e0.getResources().getDimension(i);
            if (c0700sa.f4285z != dimension) {
                c0700sa.f4285z = dimension;
                c0700sa.invalidateSelf();
                c0700sa.m2355u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4254W == f) {
            return;
        }
        c0700sa.f4254W = f;
        c0700sa.invalidateSelf();
        c0700sa.m2355u();
    }

    public void setChipStartPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float dimension = c0700sa.f4262e0.getResources().getDimension(i);
            if (c0700sa.f4254W != dimension) {
                c0700sa.f4254W = dimension;
                c0700sa.invalidateSelf();
                c0700sa.m2355u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2335F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2335F(AbstractC0493mp.m1864n(c0700sa.f4262e0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2336G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2336G(c0700sa.f4262e0.getResources().getDimension(i));
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2337H(drawable);
        }
        m710d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4247P == charSequence) {
            return;
        }
        String str = C0846w7.f5067b;
        Locale locale = Locale.getDefault();
        int i = o60.f3407a;
        C0846w7 c0846w7 = n60.m1927a(locale) == 1 ? C0846w7.f5070e : C0846w7.f5069d;
        c0846w7.getClass();
        C0059b8 c0059b8 = h60.f2117a;
        c0700sa.f4247P = c0846w7.m2601c(charSequence);
        c0700sa.invalidateSelf();
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2338I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2338I(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2337H(AbstractC0259gf.m1261w(c0700sa.f4262e0, i));
        }
        m710d();
    }

    public void setCloseIconSize(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2339J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2339J(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2340K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2340K(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2341L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2341L(AbstractC0493mp.m1864n(c0700sa.f4262e0, i));
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m1536i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1026e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4230B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f1035n = z;
        m708b(this.f1037p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0352iw c0352iw) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4253V = c0352iw;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4253V = C0352iw.m1541a(c0700sa.f4262e0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2343N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2343N(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2344O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2344O(c0700sa.f4262e0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1026e == null) {
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4234D0 = i;
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
        this.f1030i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1029h = onClickListener;
        m710d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2345P(colorStateList);
        }
        this.f1026e.getClass();
        m711e();
    }

    public void setRippleColorResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2345P(AbstractC0493mp.m1864n(c0700sa.f4262e0, i));
            this.f1026e.getClass();
            m711e();
        }
    }

    @Override // p000.x30
    public void setShapeAppearanceModel(m30 m30Var) {
        this.f1026e.setShapeAppearanceModel(m30Var);
    }

    public void setShowMotionSpec(C0352iw c0352iw) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4252U = c0352iw;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.f4252U = C0352iw.m1541a(c0700sa.f4262e0, i);
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0700sa.f4232C0 ? null : charSequence, bufferType);
        C0700sa c0700sa2 = this.f1026e;
        if (c0700sa2 == null || TextUtils.equals(c0700sa2.f4235E, charSequence)) {
            return;
        }
        c0700sa2.f4235E = charSequence;
        c0700sa2.f4268k0.f2667d = true;
        c0700sa2.invalidateSelf();
        c0700sa2.m2355u();
    }

    public void setTextAppearance(g60 g60Var) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2346Q(g60Var);
        }
        m713g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4258a0 == f) {
            return;
        }
        c0700sa.f4258a0 = f;
        c0700sa.invalidateSelf();
        c0700sa.m2355u();
    }

    public void setTextEndPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float dimension = c0700sa.f4262e0.getResources().getDimension(i);
            if (c0700sa.f4258a0 != dimension) {
                c0700sa.f4258a0 = dimension;
                c0700sa.invalidateSelf();
                c0700sa.m2355u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            j60 j60Var = c0700sa.f4268k0;
            g60 g60Var = j60Var.f2669f;
            if (g60Var != null) {
                g60Var.f1892k = fApplyDimension;
                j60Var.f2664a.setTextSize(fApplyDimension);
                c0700sa.m2355u();
                c0700sa.invalidateSelf();
            }
        }
        m713g();
    }

    public void setTextStartPadding(float f) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa == null || c0700sa.f4257Z == f) {
            return;
        }
        c0700sa.f4257Z = f;
        c0700sa.invalidateSelf();
        c0700sa.m2355u();
    }

    public void setTextStartPaddingResource(int i) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            float dimension = c0700sa.f4262e0.getResources().getDimension(i);
            if (c0700sa.f4257Z != dimension) {
                c0700sa.f4257Z = dimension;
                c0700sa.invalidateSelf();
                c0700sa.m2355u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2342M(z);
        }
        m710d();
    }

    public void setCheckedIconVisible(boolean z) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2360z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2334E(z);
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
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2346Q(new g60(c0700sa.f4262e0, i));
        }
        m713g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0700sa c0700sa = this.f1026e;
        if (c0700sa != null) {
            c0700sa.m2346Q(new g60(c0700sa.f4262e0, i));
        }
        m713g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0127cu interfaceC0127cu) {
    }
}
