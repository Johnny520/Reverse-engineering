package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0148Dc;
import p000.AbstractC0248Fq;
import p000.AbstractC0295Gu;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.C0119Cq;
import p000.C0205Eq;
import p000.C0291Gq;
import p000.C0643Oy;
import p000.C0685Px;
import p000.C0686Py;
import p000.C0728Qx;
import p000.C1017Xm;
import p000.C1021Xq;
import p000.C1301cz;
import p000.C1344dz;
import p000.C1388ez;
import p000.C1393f3;
import p000.C2436r;
import p000.C2464rl;
import p000.InterfaceC0162Dq;
import p000.InterfaceC1300cy;
import p000.RunnableC0562N2;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C1393f3 implements Checkable, InterfaceC1300cy {

    /* JADX INFO: renamed from: F */
    public static final int[] f4467F = {R.attr.state_checkable};

    /* JADX INFO: renamed from: G */
    public static final int[] f4468G = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    public static final C0119Cq f4469H = new C0119Cq();

    /* JADX INFO: renamed from: A */
    public C1388ez f4470A;

    /* JADX INFO: renamed from: B */
    public int f4471B;

    /* JADX INFO: renamed from: C */
    public float f4472C;

    /* JADX INFO: renamed from: D */
    public float f4473D;

    /* JADX INFO: renamed from: E */
    public C0643Oy f4474E;

    /* JADX INFO: renamed from: d */
    public final C0291Gq f4475d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f4476e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0162Dq f4477f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f4478g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f4479h;

    /* JADX INFO: renamed from: i */
    public Drawable f4480i;

    /* JADX INFO: renamed from: j */
    public String f4481j;

    /* JADX INFO: renamed from: k */
    public int f4482k;

    /* JADX INFO: renamed from: l */
    public int f4483l;

    /* JADX INFO: renamed from: m */
    public int f4484m;

    /* JADX INFO: renamed from: n */
    public int f4485n;

    /* JADX INFO: renamed from: o */
    public boolean f4486o;

    /* JADX INFO: renamed from: p */
    public boolean f4487p;

    /* JADX INFO: renamed from: q */
    public int f4488q;

    /* JADX INFO: renamed from: r */
    public int f4489r;

    /* JADX INFO: renamed from: s */
    public float f4490s;

    /* JADX INFO: renamed from: t */
    public int f4491t;

    /* JADX INFO: renamed from: u */
    public int f4492u;

    /* JADX INFO: renamed from: v */
    public LinearLayout.LayoutParams f4493v;

    /* JADX INFO: renamed from: w */
    public boolean f4494w;

    /* JADX INFO: renamed from: x */
    public int f4495x;

    /* JADX INFO: renamed from: y */
    public boolean f4496y;

    /* JADX INFO: renamed from: z */
    public int f4497z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m292z(context, attributeSet, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button, new int[]{io.github.cherrywechat.R.attr.materialSizeOverlay}), attributeSet, io.github.cherrywechat.R.attr.materialButtonStyle);
        this.f4476e = new LinkedHashSet();
        this.f4486o = false;
        this.f4487p = false;
        this.f4489r = -1;
        this.f4490s = -1.0f;
        this.f4491t = -1;
        this.f4492u = -1;
        this.f4497z = -1;
        Context context2 = getContext();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2941j, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f4485n = typedArrayM2534G.getDimensionPixelSize(13, 0);
        int i = typedArrayM2534G.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f4478g = AbstractC0148Dc.m282p(i, mode);
        this.f4479h = AbstractC0828TB.m1643j(getContext(), typedArrayM2534G, 15);
        this.f4480i = AbstractC0828TB.m1644l(getContext(), typedArrayM2534G, 11);
        this.f4488q = typedArrayM2534G.getInteger(12, 1);
        this.f4482k = typedArrayM2534G.getDimensionPixelSize(14, 0);
        C1301cz c1301czM2565b = C1301cz.m2565b(context2, typedArrayM2534G, 19);
        C0728Qx c0728QxM2566c = c1301czM2565b != null ? c1301czM2565b.m2566c() : C0728Qx.m1512b(context2, attributeSet, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button).m1383a();
        boolean z = typedArrayM2534G.getBoolean(17, false);
        C0291Gq c0291Gq = new C0291Gq(this, c0728QxM2566c);
        this.f4475d = c0291Gq;
        c0291Gq.f971f = typedArrayM2534G.getDimensionPixelOffset(2, 0);
        c0291Gq.f972g = typedArrayM2534G.getDimensionPixelOffset(3, 0);
        c0291Gq.f973h = typedArrayM2534G.getDimensionPixelOffset(4, 0);
        c0291Gq.f974i = typedArrayM2534G.getDimensionPixelOffset(5, 0);
        if (typedArrayM2534G.hasValue(9)) {
            int dimensionPixelSize = typedArrayM2534G.getDimensionPixelSize(9, -1);
            c0291Gq.f975j = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0685Px c0685PxM1516f = c0291Gq.f967b.m1516f();
            c0685PxM1516f.f2196e = new C2436r(f);
            c0685PxM1516f.f2197f = new C2436r(f);
            c0685PxM1516f.f2198g = new C2436r(f);
            c0685PxM1516f.f2199h = new C2436r(f);
            c0291Gq.f967b = c0685PxM1516f.m1383a();
            c0291Gq.f968c = null;
            c0291Gq.m589d();
            c0291Gq.f984s = true;
        }
        c0291Gq.f976k = typedArrayM2534G.getDimensionPixelSize(22, 0);
        c0291Gq.f977l = AbstractC0148Dc.m282p(typedArrayM2534G.getInt(8, -1), mode);
        c0291Gq.f978m = AbstractC0828TB.m1643j(getContext(), typedArrayM2534G, 7);
        c0291Gq.f979n = AbstractC0828TB.m1643j(getContext(), typedArrayM2534G, 21);
        c0291Gq.f980o = AbstractC0828TB.m1643j(getContext(), typedArrayM2534G, 18);
        c0291Gq.f985t = typedArrayM2534G.getBoolean(6, false);
        c0291Gq.f988w = typedArrayM2534G.getDimensionPixelSize(10, 0);
        c0291Gq.f986u = typedArrayM2534G.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM2534G.hasValue(0)) {
            c0291Gq.f983r = true;
            setSupportBackgroundTintList(c0291Gq.f978m);
            setSupportBackgroundTintMode(c0291Gq.f977l);
        } else {
            c0291Gq.m588c();
        }
        setPaddingRelative(paddingStart + c0291Gq.f971f, paddingTop + c0291Gq.f973h, paddingEnd + c0291Gq.f972g, paddingBottom + c0291Gq.f974i);
        setCheckedInternal(typedArrayM2534G.getBoolean(1, false));
        if (c1301czM2565b != null) {
            c0291Gq.f969d = m2448d();
            if (c0291Gq.f968c != null) {
                c0291Gq.m589d();
            }
            c0291Gq.f968c = c1301czM2565b;
            c0291Gq.m589d();
        }
        setOpticalCenterEnabled(z);
        typedArrayM2534G.recycle();
        setCompoundDrawablePadding(this.f4485n);
        m2452h(this.f4480i != null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2445a(MaterialButton materialButton) {
        materialButton.f4495x = materialButton.getOpticalCenterShift();
        materialButton.m2454j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f4472C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C1021Xq c1021XqM586a;
        if (this.f4494w && this.f4496y && (c1021XqM586a = this.f4475d.m586a(false)) != null) {
            return (int) (c1021XqM586a.m1922h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq == null || !c0291Gq.f985t || this.f4486o == z) {
            return;
        }
        this.f4486o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f4486o;
            if (!materialButtonToggleGroup.f4500l) {
                materialButtonToggleGroup.m2455f(getId(), z2);
            }
        }
        if (this.f4487p) {
            return;
        }
        this.f4487p = true;
        Iterator it = this.f4476e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f4487p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f4472C != f) {
            this.f4472C = f;
            m2454j();
            invalidate();
            if (getParent() instanceof AbstractC0248Fq) {
                AbstractC0248Fq abstractC0248Fq = (AbstractC0248Fq) getParent();
                int i = (int) this.f4472C;
                int iIndexOfChild = abstractC0248Fq.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (abstractC0248Fq.m518c(i2)) {
                            materialButton2 = (MaterialButton) abstractC0248Fq.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = abstractC0248Fq.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (abstractC0248Fq.m518c(iIndexOfChild)) {
                        materialButton = (MaterialButton) abstractC0248Fq.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C0686Py m2448d() {
        Context context = getContext();
        TypedValue typedValueM2537P = AbstractC1293cr.m2537P(context, io.github.cherrywechat.R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC0939Vu.f2950s;
        TypedArray typedArrayObtainStyledAttributes = typedValueM2537P == null ? context.obtainStyledAttributes(null, iArr, 0, io.github.cherrywechat.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM2537P.resourceId, iArr);
        C0686Py c0686Py = new C0686Py();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c0686Py.f2204a = Math.sqrt(f);
            c0686Py.f2206c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c0686Py.f2205b = f2;
            c0686Py.f2206c = false;
            typedArrayObtainStyledAttributes.recycle();
            return c0686Py;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2449e() {
        C0291Gq c0291Gq = this.f4475d;
        return (c0291Gq == null || c0291Gq.f983r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2450f(boolean z) {
        int i;
        if (this.f4470A == null) {
            return;
        }
        if (this.f4474E == null) {
            C0643Oy c0643Oy = new C0643Oy(this, f4469H);
            this.f4474E = c0643Oy;
            c0643Oy.f2077j = m2448d();
        }
        if (!this.f4496y) {
            return;
        }
        int i2 = this.f4471B;
        C1388ez c1388ez = this.f4470A;
        int[] drawableState = getDrawableState();
        int[][] iArr = c1388ez.f4938c;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= c1388ez.f4936a) {
                i4 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            int[] iArr2 = StateSet.WILD_CARD;
            int[][] iArr3 = c1388ez.f4938c;
            int i5 = 0;
            while (true) {
                if (i5 >= c1388ez.f4936a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            i4 = i;
        }
        C1344dz c1344dz = (C1344dz) (i4 < 0 ? c1388ez.f4937b : c1388ez.f4939d[i4]).f3226b;
        int width = getWidth();
        float f = c1344dz.f4838b;
        int i6 = c1344dz.f4837a;
        if (i6 != 1) {
            if (i6 == 2) {
            }
            this.f4474E.m1266a(Math.min(i2, i3));
            if (z) {
                return;
            }
            this.f4474E.m1268d();
            return;
        }
        f *= width;
        i3 = (int) f;
        this.f4474E.m1266a(Math.min(i2, i3));
        if (z) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2451g() {
        int i = this.f4488q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f4480i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f4480i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f4480i, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f4481j)) {
            return this.f4481j;
        }
        C0291Gq c0291Gq = this.f4475d;
        return ((c0291Gq == null || !c0291Gq.f985t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f4497z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2449e()) {
            return this.f4475d.f975j;
        }
        return 0;
    }

    public C0686Py getCornerSpringForce() {
        return this.f4475d.f969d;
    }

    public Drawable getIcon() {
        return this.f4480i;
    }

    public int getIconGravity() {
        return this.f4488q;
    }

    public int getIconPadding() {
        return this.f4485n;
    }

    public int getIconSize() {
        return this.f4482k;
    }

    public ColorStateList getIconTint() {
        return this.f4479h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4478g;
    }

    public int getInsetBottom() {
        return this.f4475d.f974i;
    }

    public int getInsetTop() {
        return this.f4475d.f973h;
    }

    public ColorStateList getRippleColor() {
        if (m2449e()) {
            return this.f4475d.f980o;
        }
        return null;
    }

    public C0728Qx getShapeAppearanceModel() {
        if (m2449e()) {
            return this.f4475d.f967b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C1301cz getStateListShapeAppearanceModel() {
        if (m2449e()) {
            return this.f4475d.f968c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2449e()) {
            return this.f4475d.f979n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2449e()) {
            return this.f4475d.f976k;
        }
        return 0;
    }

    @Override // p000.C1393f3
    public ColorStateList getSupportBackgroundTintList() {
        return m2449e() ? this.f4475d.f978m : super.getSupportBackgroundTintList();
    }

    @Override // p000.C1393f3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2449e() ? this.f4475d.f977l : super.getSupportBackgroundTintMode();
    }

    /* JADX INFO: renamed from: h */
    public final void m2452h(boolean z) {
        Drawable drawable = this.f4480i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f4480i = drawableMutate;
            drawableMutate.setTintList(this.f4479h);
            PorterDuff.Mode mode = this.f4478g;
            if (mode != null) {
                this.f4480i.setTintMode(mode);
            }
            int intrinsicWidth = this.f4482k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f4480i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f4482k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f4480i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4480i;
            int i = this.f4483l;
            int i2 = this.f4484m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f4480i.setVisible(true, z);
        }
        if (z) {
            m2451g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f4488q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f4480i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f4480i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f4480i))) {
            m2451g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2453i(int i, int i2) {
        if (this.f4480i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f4488q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f4483l = 0;
                if (i3 == 16) {
                    this.f4484m = 0;
                    m2452h(false);
                    return;
                }
                int intrinsicHeight = this.f4482k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f4480i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f4485n) - getPaddingBottom()) / 2);
                if (this.f4484m != iMax) {
                    this.f4484m = iMax;
                    m2452h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f4484m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f4488q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f4483l = 0;
            m2452h(false);
            return;
        }
        int intrinsicWidth = this.f4482k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f4480i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f4485n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f4488q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f4483l != textLayoutWidth) {
            this.f4483l = textLayoutWidth;
            m2452h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4486o;
    }

    /* JADX INFO: renamed from: j */
    public final void m2454j() {
        int i = (int) (this.f4472C - this.f4473D);
        int i2 = (i / 2) + this.f4495x;
        getLayoutParams().width = (int) (this.f4490s + i);
        setPaddingRelative(this.f4491t + i2, getPaddingTop(), (this.f4492u + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2449e()) {
            AbstractC1406fG.m2714n0(this, this.f4475d.m586a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq != null && c0291Gq.f985t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4467F);
        }
        if (this.f4486o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4468G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C1393f3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f4486o);
    }

    @Override // p000.C1393f3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0291Gq c0291Gq = this.f4475d;
        accessibilityNodeInfo.setCheckable(c0291Gq != null && c0291Gq.f985t);
        accessibilityNodeInfo.setChecked(this.f4486o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C1393f3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f4489r != i6) {
            this.f4489r = i6;
            this.f4490s = -1.0f;
        }
        if (this.f4490s == -1.0f) {
            this.f4490s = getMeasuredWidth();
            if (this.f4493v == null && (getParent() instanceof AbstractC0248Fq) && ((AbstractC0248Fq) getParent()).getButtonSizeChange() != null) {
                this.f4493v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4493v);
                layoutParams.width = (int) this.f4490s;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f4497z == -1) {
            if (this.f4480i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f4482k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f4480i.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f4497z = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f4491t == -1) {
            this.f4491t = getPaddingStart();
        }
        if (this.f4492u == -1) {
            this.f4492u = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC0248Fq) && ((AbstractC0248Fq) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f4496y = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0205Eq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0205Eq c0205Eq = (C0205Eq) parcelable;
        super.onRestoreInstanceState(c0205Eq.f8397a);
        setChecked(c0205Eq.f612c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0205Eq c0205Eq = new C0205Eq(super.onSaveInstanceState());
        c0205Eq.f612c = this.f4486o;
        return c0205Eq;
    }

    @Override // p000.C1393f3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f4475d.f986u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4480i != null) {
            if (this.f4480i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f4481j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m2449e()) {
            super.setBackgroundColor(i);
            return;
        }
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq.m586a(false) != null) {
            c0291Gq.m586a(false).setTint(i);
        }
    }

    @Override // p000.C1393f3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m2449e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C0291Gq c0291Gq = this.f4475d;
        c0291Gq.f983r = true;
        MaterialButton materialButton = c0291Gq.f966a;
        materialButton.setSupportBackgroundTintList(c0291Gq.f978m);
        materialButton.setSupportBackgroundTintMode(c0291Gq.f977l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C1393f3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC1406fG.m2695U(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m2449e()) {
            this.f4475d.f985t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (m2449e()) {
            C0291Gq c0291Gq = this.f4475d;
            if (c0291Gq.f984s && c0291Gq.f975j == i) {
                return;
            }
            c0291Gq.f975j = i;
            c0291Gq.f984s = true;
            float f = i;
            C0685Px c0685PxM1516f = c0291Gq.f967b.m1516f();
            c0685PxM1516f.f2196e = new C2436r(f);
            c0685PxM1516f.f2197f = new C2436r(f);
            c0685PxM1516f.f2198g = new C2436r(f);
            c0685PxM1516f.f2199h = new C2436r(f);
            c0291Gq.f967b = c0685PxM1516f.m1383a();
            c0291Gq.f968c = null;
            c0291Gq.m589d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m2449e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C0686Py c0686Py) {
        C0291Gq c0291Gq = this.f4475d;
        c0291Gq.f969d = c0686Py;
        if (c0291Gq.f968c != null) {
            c0291Gq.m589d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f4473D = Math.min(i, this.f4497z);
        m2454j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m2449e()) {
            this.f4475d.m586a(false).m1927m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4480i != drawable) {
            this.f4480i = drawable;
            m2452h(true);
            m2453i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f4488q != i) {
            this.f4488q = i;
            m2453i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f4485n != i) {
            this.f4485n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC1406fG.m2695U(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f4482k != i) {
            this.f4482k = i;
            m2452h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4479h != colorStateList) {
            this.f4479h = colorStateList;
            m2452h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4478g != mode) {
            this.f4478g = mode;
            m2452h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0295Gu.m622o(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0291Gq c0291Gq = this.f4475d;
        c0291Gq.m587b(c0291Gq.f973h, i);
    }

    public void setInsetTop(int i) {
        C0291Gq c0291Gq = this.f4475d;
        c0291Gq.m587b(i, c0291Gq.f974i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0162Dq interfaceC0162Dq) {
        this.f4477f = interfaceC0162Dq;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f4494w != z) {
            this.f4494w = z;
            C0291Gq c0291Gq = this.f4475d;
            if (z) {
                C2464rl c2464rl = new C2464rl(2, this);
                c0291Gq.f970e = c2464rl;
                C1021Xq c1021XqM586a = c0291Gq.m586a(false);
                if (c1021XqM586a != null) {
                    c1021XqM586a.f3239D = c2464rl;
                }
            } else {
                c0291Gq.f970e = null;
                C1021Xq c1021XqM586a2 = c0291Gq.m586a(false);
                if (c1021XqM586a2 != null) {
                    c1021XqM586a2.f3239D = null;
                }
            }
            post(new RunnableC0562N2(20, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0162Dq interfaceC0162Dq = this.f4477f;
        if (interfaceC0162Dq != null) {
            ((MaterialButtonToggleGroup) ((C1017Xm) interfaceC0162Dq).f3226b).invalidate();
        }
        super.setPressed(z);
        m2450f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2449e()) {
            C0291Gq c0291Gq = this.f4475d;
            MaterialButton materialButton = c0291Gq.f966a;
            if (c0291Gq.f980o != colorStateList) {
                c0291Gq.f980o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m2449e()) {
            setRippleColor(AbstractC0295Gu.m622o(getContext(), i));
        }
    }

    @Override // p000.InterfaceC1300cy
    public void setShapeAppearanceModel(C0728Qx c0728Qx) {
        if (!m2449e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C0291Gq c0291Gq = this.f4475d;
        c0291Gq.f967b = c0728Qx;
        c0291Gq.f968c = null;
        c0291Gq.m589d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m2449e()) {
            C0291Gq c0291Gq = this.f4475d;
            c0291Gq.f982q = z;
            c0291Gq.m590e();
        }
    }

    public void setSizeChange(C1388ez c1388ez) {
        if (this.f4470A != c1388ez) {
            this.f4470A = c1388ez;
            m2450f(true);
        }
    }

    public void setStateListShapeAppearanceModel(C1301cz c1301cz) {
        if (!m2449e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq.f969d == null && c1301cz.m2567d()) {
            c0291Gq.f969d = m2448d();
            if (c0291Gq.f968c != null) {
                c0291Gq.m589d();
            }
        }
        c0291Gq.f968c = c1301cz;
        c0291Gq.m589d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2449e()) {
            C0291Gq c0291Gq = this.f4475d;
            if (c0291Gq.f979n != colorStateList) {
                c0291Gq.f979n = colorStateList;
                c0291Gq.m590e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m2449e()) {
            setStrokeColor(AbstractC0295Gu.m622o(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m2449e()) {
            C0291Gq c0291Gq = this.f4475d;
            if (c0291Gq.f976k != i) {
                c0291Gq.f976k = i;
                c0291Gq.m590e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m2449e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C1393f3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2449e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq.f978m != colorStateList) {
            c0291Gq.f978m = colorStateList;
            if (c0291Gq.m586a(false) != null) {
                c0291Gq.m586a(false).setTintList(c0291Gq.f978m);
            }
        }
    }

    @Override // p000.C1393f3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2449e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0291Gq c0291Gq = this.f4475d;
        if (c0291Gq.f977l != mode) {
            c0291Gq.f977l = mode;
            if (c0291Gq.m586a(false) == null || c0291Gq.f977l == null) {
                return;
            }
            c0291Gq.m586a(false).setTintMode(c0291Gq.f977l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f4475d.f986u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f4490s = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.f4471B != i) {
            this.f4471B = i;
            m2450f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4486o);
    }
}
