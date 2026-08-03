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
    public static final int[] f4467F = null;

    /* JADX INFO: renamed from: G */
    public static final int[] f4468G = null;

    /* JADX INFO: renamed from: H */
    public static final C0119Cq f4469H = null;

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

    static {
        f4467F = new int[]{R.attr.state_checkable};
        f4468G = new int[]{R.attr.state_checked};
        f4469H = new C0119Cq();
    }

    public MaterialButton(Context r10, AttributeSet r11) {
        super(AbstractC0148Dc.m292z(r10, r11, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button, new int[]{io.github.cherrywechat.R.attr.materialSizeOverlay}), r11, io.github.cherrywechat.R.attr.materialButtonStyle);
        this.f4476e = new LinkedHashSet();
        boolean r102 = false;
        this.f4486o = false;
        this.f4487p = false;
        this.f4489r = -1;
        this.f4490s = -1.0f;
        this.f4491t = -1;
        this.f4492u = -1;
        this.f4497z = -1;
        Context r1 = getContext();
        TypedArray r112 = AbstractC1293cr.m2534G(r1, r11, AbstractC0939Vu.f2941j, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f4485n = r112.getDimensionPixelSize(13, 0);
        int r3 = r112.getInt(16, -1);
        PorterDuff.Mode r5 = PorterDuff.Mode.SRC_IN;
        this.f4478g = AbstractC0148Dc.m282p(r3, r5);
        this.f4479h = AbstractC0828TB.m1643j(getContext(), r112, 15);
        this.f4480i = AbstractC0828TB.m1644l(getContext(), r112, 11);
        this.f4488q = r112.getInteger(12, 1);
        this.f4482k = r112.getDimensionPixelSize(14, 0);
        C1301cz r32 = C1301cz.m2565b(r1, r112, 19);
        if (r32 == null) goto L5;
        C0728Qx r12 = r32.m2566c();
    L6:
        boolean r2 = r112.getBoolean(17, false);
        C0291Gq r4 = new C0291Gq(this, r12);
        this.f4475d = r4;
        r4.f971f = r112.getDimensionPixelOffset(2, 0);
        r4.f972g = r112.getDimensionPixelOffset(3, 0);
        r4.f973h = r112.getDimensionPixelOffset(4, 0);
        r4.f974i = r112.getDimensionPixelOffset(5, 0);
        if (r112.hasValue(9) == false) goto L9;
        int r13 = r112.getDimensionPixelSize(9, -1);
        r4.f975j = r13;
        float r14 = r13;
        C0685Px r7 = r4.f967b.m1516f();
        r7.f2196e = new C2436r(r14);
        r7.f2197f = new C2436r(r14);
        r7.f2198g = new C2436r(r14);
        r7.f2199h = new C2436r(r14);
        r4.f967b = r7.m1383a();
        r4.f968c = null;
        r4.m589d();
        r4.f984s = true;
    L9:
        r4.f976k = r112.getDimensionPixelSize(22, 0);
        r4.f977l = AbstractC0148Dc.m282p(r112.getInt(8, -1), r5);
        r4.f978m = AbstractC0828TB.m1643j(getContext(), r112, 7);
        r4.f979n = AbstractC0828TB.m1643j(getContext(), r112, 21);
        r4.f980o = AbstractC0828TB.m1643j(getContext(), r112, 18);
        r4.f985t = r112.getBoolean(6, false);
        r4.f988w = r112.getDimensionPixelSize(10, 0);
        r4.f986u = r112.getBoolean(23, true);
        int r0 = getPaddingStart();
        int r15 = getPaddingTop();
        int r52 = getPaddingEnd();
        int r72 = getPaddingBottom();
        if (r112.hasValue(0) == false) goto L12;
        r4.f983r = true;
        setSupportBackgroundTintList(r4.f978m);
        setSupportBackgroundTintMode(r4.f977l);
    L13:
        setPaddingRelative(r0 + r4.f971f, r15 + r4.f973h, r52 + r4.f972g, r72 + r4.f974i);
        setCheckedInternal(r112.getBoolean(1, false));
        if (r32 == null) goto L19;
        r4.f969d = m2448d();
        if (r4.f968c == null) goto L18;
        r4.m589d();
    L18:
        r4.f968c = r32;
        r4.m589d();
    L19:
        setOpticalCenterEnabled(r2);
        r112.recycle();
        setCompoundDrawablePadding(this.f4485n);
        if (this.f4480i == null) goto L22;
        r102 = true;
    L22:
        m2452h(r102);
        return;
    L12:
        r4.m588c();
        goto L13
    L5:
        r12 = C0728Qx.m1512b(r1, r11, io.github.cherrywechat.R.attr.materialButtonStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Button).m1383a();
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2445a(MaterialButton r1) {
        r1.f4495x = r1.getOpticalCenterShift();
        r1.m2454j();
        r1.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m2446b(MaterialButton r0) {
        return r0.getDisplayedWidthIncrease();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2447c(MaterialButton r0, float r1) {
        r0.setDisplayedWidthIncrease(r1);
    }

    private Layout.Alignment getActualTextAlignment() {
        int r0 = getTextAlignment();
        if (r0 == 1) goto L17;
        if (r0 == 6) goto L15;
        if (r0 == 3) goto L15;
        if (r0 == 4) goto L13;
        return Layout.Alignment.ALIGN_NORMAL;
    L13:
        return Layout.Alignment.ALIGN_CENTER;
    L15:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L17:
        return getGravityTextAlignment();
    }

    private float getDisplayedWidthIncrease() {
        return this.f4472C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int r0 = getGravity() & 8388615;
        if (r0 == 1) goto L13;
        if (r0 == 5) goto L11;
        if (r0 == 8388613) goto L11;
        return Layout.Alignment.ALIGN_NORMAL;
    L11:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L13:
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        if (this.f4494w == true) goto L5;
    L10:
        return 0;
    L5:
        if (this.f4496y == false) goto L10;
        C1021Xq r0 = this.f4475d.m586a(false);
        if (r0 == null) goto L10;
        return (int) (r0.m1922h() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) goto L5;
        TextPaint r0 = getPaint();
        String r1 = getText().toString();
        if (getTransformationMethod() == null) goto L9;
        r1 = getTransformationMethod().getTransformation(r1, this).toString();
    L9:
        Rect r2 = new Rect();
        r0.getTextBounds(r1, 0, r1.length(), r2);
        return Math.min(r2.height(), getLayout().getHeight());
    L5:
        return getLayout().getHeight();
    }

    private int getTextLayoutWidth() {
        int r0 = getLineCount();
        float r1 = 0.0f;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L6;
        r1 = Math.max(r1, getLayout().getLineWidth(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return (int) Math.ceil(r1);
    }

    private void setCheckedInternal(boolean r3) {
        C0291Gq r0 = this.f4475d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f985t == true) goto L7;
        return;
    L7:
        if (this.f4486o == r3) goto L25;
        this.f4486o = r3;
        refreshDrawableState();
        if ((getParent() instanceof MaterialButtonToggleGroup) == false) goto L15;
        MaterialButtonToggleGroup r32 = (MaterialButtonToggleGroup) getParent();
        boolean r02 = this.f4486o;
        if (r32.f4500l == true) goto L15;
        r32.m2455f(getId(), r02);
    L15:
        if (this.f4487p == true) goto L26;
        this.f4487p = true;
        Iterator r33 = this.f4476e.iterator();
        if (r33.hasNext() == true) goto L21;
        this.f4487p = false;
        return;
    L21:
        r33.next().getClass();
        throw new ClassCastException();
    L26:
        return;
    }

    private void setDisplayedWidthIncrease(float r7) {
        if (this.f4472C == r7) goto L39;
        this.f4472C = r7;
        m2454j();
        invalidate();
        if ((getParent() instanceof AbstractC0248Fq) == false) goto L40;
        AbstractC0248Fq r72 = (AbstractC0248Fq) getParent();
        int r0 = (int) this.f4472C;
        int r1 = r72.indexOfChild(this);
        if (r1 < 0) goto L43;
        int r2 = r1 - 1;
    L10:
        MaterialButton r3 = null;
        if (r2 < 0) goto L16;
        if (r72.m518c(r2) == true) goto L14;
        r2 = r2 - 1;
        goto L10
    L14:
        MaterialButton r22 = (MaterialButton) r72.getChildAt(r2);
    L17:
        int r4 = r72.getChildCount();
    L18:
        r1 = r1 + 1;
        if (r1 >= r4) goto L23;
        if (r72.m518c(r1) == false) goto L18;
        r3 = (MaterialButton) r72.getChildAt(r1);
    L23:
        if (r22 != null) goto L26;
        if (r3 != null) goto L26;
        return;
    L26:
        if (r22 != null) goto L28;
        r3.setDisplayedWidthDecrease(r0);
    L28:
        if (r3 != null) goto L30;
        r22.setDisplayedWidthDecrease(r0);
    L30:
        if (r22 == null) goto L41;
        if (r3 == null) goto L42;
        r22.setDisplayedWidthDecrease(r0 / 2);
        r3.setDisplayedWidthDecrease((r0 + 1) / 2);
        return;
    L42:
        return;
    L41:
        return;
    L16:
        r22 = null;
        goto L17
    L43:
        return;
    L40:
        return;
    }

    /* JADX INFO: renamed from: d */
    public final C0686Py m2448d() {
        Context r0 = getContext();
        TypedValue r1 = AbstractC1293cr.m2537P(r0, io.github.cherrywechat.R.attr.motionSpringFastSpatial);
        int[] r3 = AbstractC0939Vu.f2950s;
        if (r1 != null) goto L5;
        TypedArray r02 = r0.obtainStyledAttributes(null, r3, 0, io.github.cherrywechat.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
    L6:
        C0686Py r12 = new C0686Py();
        float r4 = r02.getFloat(1, Float.MIN_VALUE);     // Catch: Throwable -> L24
        if (r4 == Float.MIN_VALUE) goto L27;
        float r5 = r02.getFloat(0, Float.MIN_VALUE);     // Catch: Throwable -> L24
        if (r5 == Float.MIN_VALUE) goto L23;
        if (r4 <= 0.0f) goto L21;
        r12.f2204a = Math.sqrt(r4);     // Catch: Throwable -> L24
        r12.f2206c = false;     // Catch: Throwable -> L24
        if (r5 < 0.0f) goto L19;
        r12.f2205b = r5;     // Catch: Throwable -> L24
        r12.f2206c = false;     // Catch: Throwable -> L24
        r02.recycle();
        return r12;
    L19:
        throw new IllegalArgumentException("Damping ratio must be non-negative");     // Catch: Throwable -> L24
    L21:
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");     // Catch: Throwable -> L24
    L23:
        throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");     // Catch: Throwable -> L24
    L27:
        throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r02.recycle();
        throw th;
    L5:
        r02 = r0.obtainStyledAttributes(r1.resourceId, r3);
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2449e() {
        C0291Gq r0 = this.f4475d;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.f983r == true) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2450f(boolean r9) {
        if (this.f4470A != null) goto L6;
        return;
    L6:
        if (this.f4474E != null) goto L9;
        C0643Oy r0 = new C0643Oy(this, f4469H);
        this.f4474E = r0;
        r0.f2077j = m2448d();
    L9:
        if (this.f4496y == false) goto L45;
        int r02 = this.f4471B;
        C1388ez r1 = this.f4470A;
        int[] r2 = getDrawableState();
        int[][] r3 = r1.f4938c;
        int r4 = 0;
        int r5 = 0;
    L11:
        int r7 = -1;
        if (r5 >= r1.f4936a) goto L17;
        if (StateSet.stateSetMatches(r3[r5], r2) == true) goto L18;
        r5 = r5 + 1;
    L18:
        if (r5 >= 0) goto L27;
        int[] r22 = StateSet.WILD_CARD;
        int[][] r32 = r1.f4938c;
        int r52 = 0;
    L21:
        if (r52 >= r1.f4936a) goto L26;
        if (StateSet.stateSetMatches(r32[r52], r22) == true) goto L24;
        r52 = r52 + 1;
        goto L21
    L24:
        r7 = r52;
    L26:
        r5 = r7;
    L27:
        if (r5 >= 0) goto L29;
        C1017Xm r12 = r1.f4937b;
    L30:
        C1344dz r13 = (C1344dz) r12.f3226b;
        int r23 = getWidth();
        float r33 = r13.f4838b;
        int r14 = r13.f4837a;
        if (r14 != 1) goto L35;
        r33 = r33 * r23;
    L33:
        r4 = (int) r33;
    L37:
        this.f4474E.m1266a(Math.min(r02, r4));
        if (r9 == false) goto L46;
        this.f4474E.m1268d();
        return;
    L46:
        return;
    L35:
        if (r14 != 2) goto L37;
    L29:
        r12 = r1.f4939d[r5];
        goto L30
    L17:
        r5 = -1;
        goto L18
    }

    /* JADX INFO: renamed from: g */
    public final void m2451g() {
        int r0 = this.f4488q;
        if (r0 != 1) goto L5;
    L22:
        setCompoundDrawablesRelative(this.f4480i, null, null, null);
        return;
    L5:
        if (r0 == 2) goto L22;
        if (r0 != 3) goto L10;
    L20:
        setCompoundDrawablesRelative(null, null, this.f4480i, null);
        return;
    L10:
        if (r0 == 4) goto L20;
        if (r0 != 16) goto L15;
    L18:
        setCompoundDrawablesRelative(null, this.f4480i, null, null);
        return;
    L15:
        if (r0 == 32) goto L18;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f4481j) == false) goto L5;
        C0291Gq r0 = this.f4475d;
        if (r0 != null) goto L9;
    L11:
        Class r02 = Button.class;
    L13:
        return r02.getName();
    L9:
        if (r0.f985t == false) goto L11;
        r02 = CompoundButton.class;
        goto L13
    L5:
        return this.f4481j;
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
        if (m2449e() == true) goto L5;
        return 0;
    L5:
        return this.f4475d.f975j;
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
        if (m2449e() == true) goto L5;
        return null;
    L5:
        return this.f4475d.f980o;
    }

    public C0728Qx getShapeAppearanceModel() {
        if (m2449e() == false) goto L7;
        return this.f4475d.f967b;
    L7:
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C1301cz getStateListShapeAppearanceModel() {
        if (m2449e() == false) goto L7;
        return this.f4475d.f968c;
    L7:
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2449e() == true) goto L5;
        return null;
    L5:
        return this.f4475d.f979n;
    }

    public int getStrokeWidth() {
        if (m2449e() == true) goto L5;
        return 0;
    L5:
        return this.f4475d.f976k;
    }

    @Override // p000.C1393f3
    public ColorStateList getSupportBackgroundTintList() {
        if (m2449e() == false) goto L7;
        return this.f4475d.f978m;
    L7:
        return super.getSupportBackgroundTintList();
    }

    @Override // p000.C1393f3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m2449e() == false) goto L7;
        return this.f4475d.f977l;
    L7:
        return super.getSupportBackgroundTintMode();
    }

    /* JADX INFO: renamed from: h */
    public final void m2452h(boolean r7) {
        Drawable r0 = this.f4480i;
        if (r0 == null) goto L16;
        Drawable r02 = r0.mutate();
        this.f4480i = r02;
        r02.setTintList(this.f4479h);
        PorterDuff.Mode r03 = this.f4478g;
        if (r03 == null) goto L7;
        this.f4480i.setTintMode(r03);
    L7:
        int r04 = this.f4482k;
        if (r04 != 0) goto L11;
        r04 = this.f4480i.getIntrinsicWidth();
    L11:
        int r2 = this.f4482k;
        if (r2 != 0) goto L15;
        r2 = this.f4480i.getIntrinsicHeight();
    L15:
        Drawable r3 = this.f4480i;
        int r4 = this.f4483l;
        int r5 = this.f4484m;
        r3.setBounds(r4, r5, r04 + r4, r2 + r5);
        this.f4480i.setVisible(true, r7);
    L16:
        if (r7 == false) goto L19;
        m2451g();
        return;
    L19:
        Drawable[] r72 = getCompoundDrawablesRelative();
        Drawable r05 = r72[0];
        Drawable r22 = r72[1];
        Drawable r73 = r72[2];
        int r42 = this.f4488q;
        if (r42 == 1) goto L23;
        if (r42 == 2) goto L23;
    L25:
        if (r42 == 3) goto L29;
        if (r42 == 4) goto L29;
    L31:
        if (r42 == 16) goto L37;
        if (r42 == 32) goto L37;
        return;
    L37:
        if (r22 != this.f4480i) goto L40;
        return;
    L40:
        m2451g();
        return;
    L29:
        if (r73 != this.f4480i) goto L40;
    L23:
        if (r05 != this.f4480i) goto L40;
        goto L40
    }

    /* JADX INFO: renamed from: i */
    public final void m2453i(int r7, int r8) {
        if (this.f4480i != null) goto L5;
        return;
    L5:
        if (getLayout() == null) goto L66;
        int r0 = this.f4488q;
        boolean r3 = true;
        if (r0 == 1) goto L31;
        if (r0 == 2) goto L31;
        if (r0 == 3) goto L31;
        if (r0 == 4) goto L31;
        if (r0 != 16) goto L17;
    L20:
        this.f4483l = 0;
        if (r0 != 16) goto L24;
        this.f4484m = 0;
        m2452h(false);
        return;
    L24:
        int r72 = this.f4482k;
        if (r72 != 0) goto L27;
        r72 = this.f4480i.getIntrinsicHeight();
    L27:
        int r73 = Math.max(0, (((((r8 - getTextHeight()) - getPaddingTop()) - r72) - this.f4485n) - getPaddingBottom()) / 2);
        if (this.f4484m == r73) goto L64;
        this.f4484m = r73;
        m2452h(false);
        return;
    L64:
        return;
    L17:
        if (r0 == 32) goto L20;
        return;
    L31:
        this.f4484m = 0;
        Layout.Alignment r82 = getActualTextAlignment();
        int r02 = this.f4488q;
        if (r02 == 1) goto L61;
        if (r02 == 3) goto L61;
        if (r02 == 2) goto L36;
    L37:
        if (r02 == 4) goto L39;
    L41:
        int r03 = this.f4482k;
        if (r03 != 0) goto L44;
        r03 = this.f4480i.getIntrinsicWidth();
    L44:
        int r74 = ((((r7 - getTextLayoutWidth()) - getPaddingEnd()) - r03) - this.f4485n) - getPaddingStart();
        if (r82 != Layout.Alignment.ALIGN_CENTER) goto L48;
        r74 = r74 / 2;
    L48:
        if (getLayoutDirection() != 1) goto L50;
        boolean r83 = true;
    L52:
        if (this.f4488q == 4) goto L55;
        r3 = false;
    L55:
        if (r83 == r3) goto L58;
        r74 = -r74;
    L58:
        if (this.f4483l == r74) goto L65;
        this.f4483l = r74;
        m2452h(false);
        return;
    L65:
        return;
    L50:
        r83 = false;
        goto L52
    L39:
        if (r82 != Layout.Alignment.ALIGN_OPPOSITE) goto L41;
    L36:
        if (r82 != Layout.Alignment.ALIGN_NORMAL) goto L37;
    L61:
        this.f4483l = 0;
        m2452h(false);
        return;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4486o;
    }

    /* JADX INFO: renamed from: j */
    public final void m2454j() {
        int r0 = (int) (this.f4472C - this.f4473D);
        int r1 = (r0 / 2) + this.f4495x;
        getLayoutParams().width = (int) (this.f4490s + r0);
        setPaddingRelative(this.f4491t + r1, getPaddingTop(), (this.f4492u + r0) - r1, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2449e() == false) goto L6;
        AbstractC1406fG.m2714n0(this, this.f4475d.m586a(false));
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        C0291Gq r0 = this.f4475d;
        if (r0 == null) goto L8;
        if (r0.f985t == false) goto L8;
        View.mergeDrawableStates(r22, f4467F);
    L8:
        if (this.f4486o == false) goto L10;
        View.mergeDrawableStates(r22, f4468G);
    L10:
        return r22;
    }

    @Override // p000.C1393f3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(getA11yClassName());
        r2.setChecked(this.f4486o);
    }

    @Override // p000.C1393f3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(getA11yClassName());
        C0291Gq r0 = this.f4475d;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        r2.setCheckable(r02);
        r2.setChecked(this.f4486o);
        r2.setClickable(isClickable());
        return;
    L5:
        if (r0.f985t == false) goto L7;
        r02 = true;
        goto L8
    }

    @Override // p000.C1393f3, android.widget.TextView, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        super.onLayout(r2, r3, r4, r5, r6);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
        int r32 = getResources().getConfiguration().orientation;
        if (this.f4489r == r32) goto L6;
        this.f4489r = r32;
        this.f4490s = -1.0f;
    L6:
        if (this.f4490s != (-1.0f)) goto L14;
        this.f4490s = getMeasuredWidth();
        if (this.f4493v != null) goto L14;
        if ((getParent() instanceof AbstractC0248Fq) == false) goto L14;
        if (((AbstractC0248Fq) getParent()).getButtonSizeChange() == null) goto L14;
        this.f4493v = (LinearLayout.LayoutParams) getLayoutParams();
        LinearLayout.LayoutParams r33 = new LinearLayout.LayoutParams(this.f4493v);
        r33.width = (int) this.f4490s;
        setLayoutParams(r33);
    L14:
        boolean r42 = false;
        if (this.f4497z != (-1)) goto L25;
        if (this.f4480i != null) goto L19;
        int r34 = 0;
    L23:
        this.f4497z = (getMeasuredWidth() - getTextLayoutWidth()) - r34;
        goto L25
    L19:
        int r35 = getIconPadding();
        int r62 = this.f4482k;
        if (r62 != 0) goto L22;
        r62 = this.f4480i.getIntrinsicWidth();
    L22:
        r34 = r35 + r62;
    L25:
        if (this.f4491t != (-1)) goto L28;
        this.f4491t = getPaddingStart();
    L28:
        if (this.f4492u != (-1)) goto L31;
        this.f4492u = getPaddingEnd();
    L31:
        if ((getParent() instanceof AbstractC0248Fq) == true) goto L33;
    L35:
        this.f4496y = r42;
        return;
    L33:
        if (((AbstractC0248Fq) getParent()).getOrientation() != 0) goto L35;
        r42 = true;
        goto L35
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0205Eq) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0205Eq r22 = (C0205Eq) r2;
        super.onRestoreInstanceState(r22.f8397a);
        setChecked(r22.f612c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0205Eq r1 = new C0205Eq(super.onSaveInstanceState());
        r1.f612c = this.f4486o;
        return r1;
    }

    @Override // p000.C1393f3, android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() == false) goto L8;
        if (this.f4475d.f986u == false) goto L8;
        toggle();
    L8:
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4480i == null) goto L8;
        int[] r0 = getDrawableState();
        if (this.f4480i.setState(r0) == false) goto L9;
        invalidate();
        return;
    L9:
        return;
    }

    public void setA11yClassName(String r1) {
        this.f4481j = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundColor(int r4) {
        if (m2449e() == false) goto L8;
        C0291Gq r0 = this.f4475d;
        if (r0.m586a(false) == null) goto L10;
        r0.m586a(false).setTint(r4);
        return;
    L10:
        return;
    L8:
        super.setBackgroundColor(r4);
    }

    @Override // p000.C1393f3, android.view.View
    public void setBackgroundDrawable(Drawable r4) {
        if (m2449e() == true) goto L5;
        super.setBackgroundDrawable(r4);
        return;
    L5:
        if (r4 == getBackground()) goto L8;
        C0291Gq r1 = this.f4475d;
        r1.f983r = true;
        MaterialButton r0 = r1.f966a;
        r0.setSupportBackgroundTintList(r1.f978m);
        r0.setSupportBackgroundTintMode(r1.f977l);
        super.setBackgroundDrawable(r4);
        return;
    L8:
        getBackground().setState(r4.getState());
    }

    @Override // p000.C1393f3, android.view.View
    public void setBackgroundResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC1406fG.m2695U(getContext(), r2);
    L5:
        setBackgroundDrawable(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r1) {
        setSupportBackgroundTintList(r1);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r1) {
        setSupportBackgroundTintMode(r1);
    }

    public void setCheckable(boolean r2) {
        if (m2449e() == false) goto L6;
        this.f4475d.f985t = r2;
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r1) {
        setCheckedInternal(r1);
    }

    public void setCornerRadius(int r4) {
        if (m2449e() == false) goto L10;
        C0291Gq r0 = this.f4475d;
        if (r0.f984s == true) goto L7;
    L8:
        r0.f975j = r4;
        r0.f984s = true;
        float r42 = r4;
        C0685Px r1 = r0.f967b.m1516f();
        r1.f2196e = new C2436r(r42);
        r1.f2197f = new C2436r(r42);
        r1.f2198g = new C2436r(r42);
        r1.f2199h = new C2436r(r42);
        r0.f967b = r1.m1383a();
        r0.f968c = null;
        r0.m589d();
        return;
    L7:
        if (r0.f975j != r4) goto L8;
        return;
    }

    public void setCornerRadiusResource(int r2) {
        if (m2449e() == false) goto L6;
        setCornerRadius(getResources().getDimensionPixelSize(r2));
        return;
    }

    public void setCornerSpringForce(C0686Py r2) {
        C0291Gq r0 = this.f4475d;
        r0.f969d = r2;
        if (r0.f968c == null) goto L6;
        r0.m589d();
        return;
    }

    public void setDisplayedWidthDecrease(int r2) {
        this.f4473D = Math.min(r2, this.f4497z);
        m2454j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float r3) {
        super.setElevation(r3);
        if (m2449e() == false) goto L6;
        this.f4475d.m586a(false).m1927m(r3);
        return;
    }

    public void setIcon(Drawable r2) {
        if (this.f4480i == r2) goto L6;
        this.f4480i = r2;
        m2452h(true);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconGravity(int r2) {
        if (this.f4488q == r2) goto L6;
        this.f4488q = r2;
        m2453i(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconPadding(int r2) {
        if (this.f4485n == r2) goto L6;
        this.f4485n = r2;
        setCompoundDrawablePadding(r2);
        return;
    }

    public void setIconResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC1406fG.m2695U(getContext(), r2);
    L5:
        setIcon(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setIconSize(int r2) {
        if (r2 < 0) goto L8;
        if (this.f4482k == r2) goto L9;
        this.f4482k = r2;
        m2452h(true);
        return;
    L9:
        return;
    L8:
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList r2) {
        if (this.f4479h == r2) goto L6;
        this.f4479h = r2;
        m2452h(false);
        return;
    }

    public void setIconTintMode(PorterDuff.Mode r2) {
        if (this.f4478g == r2) goto L6;
        this.f4478g = r2;
        m2452h(false);
        return;
    }

    public void setIconTintResource(int r2) {
        setIconTint(AbstractC0295Gu.m622o(getContext(), r2));
    }

    public void setInsetBottom(int r3) {
        C0291Gq r0 = this.f4475d;
        r0.m587b(r0.f973h, r3);
    }

    public void setInsetTop(int r3) {
        C0291Gq r0 = this.f4475d;
        r0.m587b(r3, r0.f974i);
    }

    public void setInternalBackground(Drawable r1) {
        super.setBackgroundDrawable(r1);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0162Dq r1) {
        this.f4477f = r1;
    }

    public void setOpticalCenterEnabled(boolean r4) {
        if (this.f4494w == r4) goto L14;
        this.f4494w = r4;
        C0291Gq r1 = this.f4475d;
        if (r4 == false) goto L9;
        C2464rl r42 = new C2464rl(2, this);
        r1.f970e = r42;
        C1021Xq r0 = r1.m586a(false);
        if (r0 == null) goto L12;
        r0.f3239D = r42;
    L12:
        post(new RunnableC0562N2(20, this));
        return;
    L9:
        r1.f970e = null;
        C1021Xq r02 = r1.m586a(false);
        if (r02 == null) goto L12;
        r02.f3239D = null;
        goto L12
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        InterfaceC0162Dq r0 = this.f4477f;
        if (r0 == null) goto L5;
        ((MaterialButtonToggleGroup) ((C1017Xm) r0).f3226b).invalidate();
    L5:
        super.setPressed(r2);
        m2450f(false);
    }

    public void setRippleColor(ColorStateList r4) {
        if (m2449e() == false) goto L14;
        C0291Gq r0 = this.f4475d;
        MaterialButton r1 = r0.f966a;
        if (r0.f980o == r4) goto L15;
        r0.f980o = r4;
        if ((r1.getBackground() instanceof RippleDrawable) == false) goto L16;
        RippleDrawable r02 = (RippleDrawable) r1.getBackground();
        if (r4 != null) goto L12;
        r4 = ColorStateList.valueOf(0);
    L12:
        r02.setColor(r4);
        return;
    L16:
        return;
    L15:
        return;
    }

    public void setRippleColorResource(int r2) {
        if (m2449e() == false) goto L6;
        setRippleColor(AbstractC0295Gu.m622o(getContext(), r2));
        return;
    }

    @Override // p000.InterfaceC1300cy
    public void setShapeAppearanceModel(C0728Qx r2) {
        if (m2449e() == false) goto L7;
        C0291Gq r0 = this.f4475d;
        r0.f967b = r2;
        r0.f968c = null;
        r0.m589d();
        return;
    L7:
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
        if (m2449e() == false) goto L6;
        C0291Gq r0 = this.f4475d;
        r0.f982q = r2;
        r0.m590e();
        return;
    }

    public void setSizeChange(C1388ez r2) {
        if (this.f4470A == r2) goto L6;
        this.f4470A = r2;
        m2450f(true);
        return;
    }

    public void setStateListShapeAppearanceModel(C1301cz r3) {
        if (m2449e() == false) goto L14;
        C0291Gq r0 = this.f4475d;
        if (r0.f969d == null) goto L7;
    L11:
        r0.f968c = r3;
        r0.m589d();
        return;
    L7:
        if (r3.m2567d() == false) goto L11;
        r0.f969d = m2448d();
        if (r0.f968c == null) goto L11;
        r0.m589d();
        goto L11
    L14:
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList r3) {
        if (m2449e() == false) goto L8;
        C0291Gq r0 = this.f4475d;
        if (r0.f979n == r3) goto L9;
        r0.f979n = r3;
        r0.m590e();
        return;
    L9:
        return;
    }

    public void setStrokeColorResource(int r2) {
        if (m2449e() == false) goto L6;
        setStrokeColor(AbstractC0295Gu.m622o(getContext(), r2));
        return;
    }

    public void setStrokeWidth(int r3) {
        if (m2449e() == false) goto L8;
        C0291Gq r0 = this.f4475d;
        if (r0.f976k == r3) goto L9;
        r0.f976k = r3;
        r0.m590e();
        return;
    L9:
        return;
    }

    public void setStrokeWidthResource(int r2) {
        if (m2449e() == false) goto L6;
        setStrokeWidth(getResources().getDimensionPixelSize(r2));
        return;
    }

    @Override // p000.C1393f3
    public void setSupportBackgroundTintList(ColorStateList r3) {
        if (m2449e() == false) goto L10;
        C0291Gq r0 = this.f4475d;
        if (r0.f978m == r3) goto L12;
        r0.f978m = r3;
        if (r0.m586a(false) == null) goto L13;
        r0.m586a(false).setTintList(r0.f978m);
        return;
    L13:
        return;
    L12:
        return;
    L10:
        super.setSupportBackgroundTintList(r3);
    }

    @Override // p000.C1393f3
    public void setSupportBackgroundTintMode(PorterDuff.Mode r3) {
        if (m2449e() == false) goto L12;
        C0291Gq r0 = this.f4475d;
        if (r0.f977l == r3) goto L14;
        r0.f977l = r3;
        if (r0.m586a(false) != null) goto L9;
        return;
    L9:
        if (r0.f977l == null) goto L16;
        r0.m586a(false).setTintMode(r0.f977l);
        return;
    L16:
        return;
    L14:
        return;
    L12:
        super.setSupportBackgroundTintMode(r3);
    }

    @Override // android.view.View
    public void setTextAlignment(int r2) {
        super.setTextAlignment(r2);
        m2453i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean r2) {
        this.f4475d.f986u = r2;
    }

    @Override // android.widget.TextView
    public void setWidth(int r2) {
        this.f4490s = -1.0f;
        super.setWidth(r2);
    }

    public void setWidthChangeMax(int r2) {
        if (this.f4471B == r2) goto L6;
        this.f4471B = r2;
        m2450f(true);
        return;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4486o);
    }
}
