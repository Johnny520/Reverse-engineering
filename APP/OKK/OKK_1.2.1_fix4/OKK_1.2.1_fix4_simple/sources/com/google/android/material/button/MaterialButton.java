package com.google.android.material.button;

import android.R;
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
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p056f0.AbstractC0805P;
import p057g.AbstractC0918o;
import p058g0.AbstractC0942a;
import p070m0.C0992b;
import p070m0.C0993c;
import p070m0.InterfaceC0991a;
import p081s0.AbstractC1077k;
import p086v0.AbstractC1110a;
import p087w.AbstractC1111a;
import p089x0.C1117a;
import p089x0.C1126j;
import p089x0.C1127k;
import p089x0.InterfaceC1138v;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AbstractC0918o implements Checkable, InterfaceC1138v {

    /* JADX INFO: renamed from: r */
    public static final int[] f2337r = null;

    /* JADX INFO: renamed from: s */
    public static final int[] f2338s = null;

    /* JADX INFO: renamed from: d */
    public final C0993c f2339d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f2340e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0991a f2341f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2342g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f2343h;

    /* JADX INFO: renamed from: i */
    public Drawable f2344i;

    /* JADX INFO: renamed from: j */
    public String f2345j;

    /* JADX INFO: renamed from: k */
    public int f2346k;

    /* JADX INFO: renamed from: l */
    public int f2347l;

    /* JADX INFO: renamed from: m */
    public int f2348m;

    /* JADX INFO: renamed from: n */
    public int f2349n;

    /* JADX INFO: renamed from: o */
    public boolean f2350o;

    /* JADX INFO: renamed from: p */
    public boolean f2351p;

    /* JADX INFO: renamed from: q */
    public int f2352q;

    static {
        f2337r = new int[]{R.attr.state_checkable};
        f2338s = new int[]{R.attr.state_checked};
    }

    public MaterialButton(Context r12, AttributeSet r13) {
        super(AbstractC0059a.m197a(r12, r13, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button), r13);
        this.f2340e = new LinkedHashSet();
        boolean r122 = false;
        this.f2350o = false;
        this.f2351p = false;
        Context r8 = getContext();
        int[] r9 = AbstractC0942a.f3337i;
        AbstractC1077k.m2553a(r8, r13, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button);
        AbstractC1077k.m2554b(r8, r13, r9, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray r02 = r8.obtainStyledAttributes(r13, r9, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button);
        this.f2349n = r02.getDimensionPixelSize(12, 0);
        int r1 = r02.getInt(15, -1);
        PorterDuff.Mode r3 = PorterDuff.Mode.SRC_IN;
        this.f2342g = AbstractC1077k.m2558f(r1, r3);
        this.f2343h = AbstractC0805P.m2051r(getContext(), r02, 14);
        this.f2344i = AbstractC0805P.m2052t(getContext(), r02, 10);
        this.f2352q = r02.getInteger(11, 1);
        this.f2346k = r02.getDimensionPixelSize(13, 0);
        C0993c r14 = new C0993c(this, C1127k.m2657a(r8, r13, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button).m2656a());
        this.f2339d = r14;
        r14.f3532c = r02.getDimensionPixelOffset(1, 0);
        r14.f3533d = r02.getDimensionPixelOffset(2, 0);
        r14.f3534e = r02.getDimensionPixelOffset(3, 0);
        r14.f3535f = r02.getDimensionPixelOffset(4, 0);
        if (r02.hasValue(8) == false) goto L5;
        int r132 = r02.getDimensionPixelSize(8, -1);
        r14.f3536g = r132;
        float r133 = r132;
        C1126j r5 = r14.f3531b.m2660d();
        r5.f4339e = new C1117a(r133);
        r5.f4340f = new C1117a(r133);
        r5.f4341g = new C1117a(r133);
        r5.f4342h = new C1117a(r133);
        r14.m2382c(r5.m2656a());
        r14.f3545p = true;
    L5:
        r14.f3537h = r02.getDimensionPixelSize(20, 0);
        r14.f3538i = AbstractC1077k.m2558f(r02.getInt(7, -1), r3);
        r14.f3539j = AbstractC0805P.m2051r(getContext(), r02, 6);
        r14.f3540k = AbstractC0805P.m2051r(getContext(), r02, 19);
        r14.f3541l = AbstractC0805P.m2051r(getContext(), r02, 16);
        r14.f3546q = r02.getBoolean(5, false);
        r14.f3549t = r02.getDimensionPixelSize(9, 0);
        r14.f3547r = r02.getBoolean(21, true);
        Field r134 = AbstractC0080Q.f219a;
        int r135 = getPaddingStart();
        int r2 = getPaddingTop();
        int r32 = getPaddingEnd();
        int r52 = getPaddingBottom();
        if (r02.hasValue(0) == false) goto L8;
        r14.f3544o = true;
        setSupportBackgroundTintList(r14.f3539j);
        setSupportBackgroundTintMode(r14.f3538i);
    L9:
        setPaddingRelative(r135 + r14.f3532c, r2 + r14.f3534e, r32 + r14.f3533d, r52 + r14.f3535f);
        r02.recycle();
        setCompoundDrawablePadding(this.f2349n);
        if (this.f2344i == null) goto L12;
        r122 = true;
    L12:
        m1856d(r122);
        return;
    L8:
        r14.m2384e();
        goto L9
    }

    private Layout.Alignment getActualTextAlignment() {
        int r02 = getTextAlignment();
        if (r02 == 1) goto L17;
        if (r02 == 6) goto L15;
        if (r02 == 3) goto L15;
        if (r02 == 4) goto L13;
        return Layout.Alignment.ALIGN_NORMAL;
    L13:
        return Layout.Alignment.ALIGN_CENTER;
    L15:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L17:
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int r02 = getGravity() & 8388615;
        if (r02 == 1) goto L13;
        if (r02 == 5) goto L11;
        if (r02 == 8388613) goto L11;
        return Layout.Alignment.ALIGN_NORMAL;
    L11:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L13:
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) goto L5;
        TextPaint r02 = getPaint();
        String r1 = getText().toString();
        if (getTransformationMethod() == null) goto L9;
        r1 = getTransformationMethod().getTransformation(r1, this).toString();
    L9:
        Rect r2 = new Rect();
        r02.getTextBounds(r1, 0, r1.length(), r2);
        return Math.min(r2.height(), getLayout().getHeight());
    L5:
        return getLayout().getHeight();
    }

    private int getTextLayoutWidth() {
        int r02 = getLineCount();
        float r1 = 0.0f;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L6;
        r1 = Math.max(r1, getLayout().getLineWidth(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return (int) Math.ceil(r1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1853a() {
        C0993c r02 = this.f2339d;
        if (r02 != null) goto L5;
    L7:
        return false;
    L5:
        if (r02.f3546q == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1854b() {
        C0993c r02 = this.f2339d;
        if (r02 != null) goto L5;
    L7:
        return false;
    L5:
        if (r02.f3544o == true) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1855c() {
        int r02 = this.f2352q;
        boolean r1 = true;
        if (r02 == 1) goto L9;
        if (r02 == 2) goto L9;
        r1 = false;
    L9:
        if (r1 == false) goto L12;
        setCompoundDrawablesRelative(this.f2344i, null, null, null);
        return;
    L12:
        if (r02 != 3) goto L14;
    L21:
        setCompoundDrawablesRelative(null, null, this.f2344i, null);
        return;
    L14:
        if (r02 == 4) goto L21;
        if (r02 != 16) goto L19;
    L20:
        setCompoundDrawablesRelative(null, this.f2344i, null, null);
        return;
    L19:
        if (r02 == 32) goto L20;
    }

    /* JADX INFO: renamed from: d */
    public final void m1856d(boolean r7) {
        Drawable r02 = this.f2344i;
        if (r02 == null) goto L16;
        Drawable r03 = r02.mutate();
        this.f2344i = r03;
        AbstractC1111a.m2626h(r03, this.f2343h);
        PorterDuff.Mode r04 = this.f2342g;
        if (r04 == null) goto L7;
        AbstractC1111a.m2627i(this.f2344i, r04);
    L7:
        int r05 = this.f2346k;
        if (r05 != 0) goto L11;
        r05 = this.f2344i.getIntrinsicWidth();
    L11:
        int r2 = this.f2346k;
        if (r2 != 0) goto L15;
        r2 = this.f2344i.getIntrinsicHeight();
    L15:
        Drawable r3 = this.f2344i;
        int r4 = this.f2347l;
        int r5 = this.f2348m;
        r3.setBounds(r4, r5, r05 + r4, r2 + r5);
        this.f2344i.setVisible(true, r7);
    L16:
        if (r7 == false) goto L19;
        m1855c();
        return;
    L19:
        Drawable[] r72 = getCompoundDrawablesRelative();
        Drawable r06 = r72[0];
        Drawable r22 = r72[1];
        Drawable r73 = r72[2];
        int r42 = this.f2352q;
        if (r42 == 1) goto L23;
        if (r42 == 2) goto L23;
    L25:
        if (r42 == 3) goto L29;
        if (r42 == 4) goto L29;
    L31:
        if (r42 == 16) goto L35;
        if (r42 == 32) goto L35;
        return;
    L35:
        if (r22 == this.f2344i) goto L39;
    L36:
        m1855c();
        return;
    L39:
        return;
    L29:
        if (r73 != this.f2344i) goto L36;
    L23:
        if (r06 != this.f2344i) goto L36;
        goto L36
    }

    /* JADX INFO: renamed from: e */
    public final void m1857e(int r8, int r9) {
        if (this.f2344i != null) goto L5;
        return;
    L5:
        if (getLayout() == null) goto L69;
        int r1 = this.f2352q;
        boolean r3 = true;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L12;
        boolean r4 = false;
    L14:
        if (r4 == true) goto L32;
        if (r1 == 3) goto L32;
        if (r1 == 4) goto L32;
        if (r1 != 16) goto L21;
    L22:
        this.f2347l = 0;
        if (r1 != 16) goto L26;
        this.f2348m = 0;
        m1856d(false);
        return;
    L26:
        int r82 = this.f2346k;
        if (r82 != 0) goto L29;
        r82 = this.f2344i.getIntrinsicHeight();
    L29:
        int r83 = Math.max(0, (((((r9 - getTextHeight()) - getPaddingTop()) - r82) - this.f2349n) - getPaddingBottom()) / 2);
        if (this.f2348m == r83) goto L65;
        this.f2348m = r83;
        m1856d(false);
        return;
    L65:
        return;
    L21:
        if (r1 == 32) goto L22;
        return;
    L32:
        this.f2348m = 0;
        Layout.Alignment r92 = getActualTextAlignment();
        int r12 = this.f2352q;
        if (r12 == 1) goto L62;
        if (r12 == 3) goto L62;
        if (r12 == 2) goto L37;
    L38:
        if (r12 == 4) goto L40;
    L42:
        int r13 = this.f2346k;
        if (r13 != 0) goto L45;
        r13 = this.f2344i.getIntrinsicWidth();
    L45:
        int r84 = r8 - getTextLayoutWidth();
        Field r42 = AbstractC0080Q.f219a;
        int r85 = (((r84 - getPaddingEnd()) - r13) - this.f2349n) - getPaddingStart();
        if (r92 != Layout.Alignment.ALIGN_CENTER) goto L49;
        r85 = r85 / 2;
    L49:
        if (getLayoutDirection() != 1) goto L51;
        boolean r93 = true;
    L53:
        if (this.f2352q == 4) goto L56;
        r3 = false;
    L56:
        if (r93 == r3) goto L59;
        r85 = -r85;
    L59:
        if (this.f2347l == r85) goto L67;
        this.f2347l = r85;
        m1856d(false);
        return;
    L67:
        return;
    L51:
        r93 = false;
        goto L53
    L40:
        if (r92 != Layout.Alignment.ALIGN_OPPOSITE) goto L42;
    L37:
        if (r92 != Layout.Alignment.ALIGN_NORMAL) goto L38;
    L62:
        this.f2347l = 0;
        m1856d(false);
        return;
    L12:
        r4 = true;
        goto L14
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2345j) == true) goto L7;
        return this.f2345j;
    L7:
        if (m1853a() == false) goto L9;
        Class r02 = CompoundButton.class;
    L11:
        return r02.getName();
    L9:
        r02 = Button.class;
        goto L11
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
        if (m1854b() == true) goto L7;
        return 0;
    L7:
        return this.f2339d.f3536g;
    }

    public Drawable getIcon() {
        return this.f2344i;
    }

    public int getIconGravity() {
        return this.f2352q;
    }

    public int getIconPadding() {
        return this.f2349n;
    }

    public int getIconSize() {
        return this.f2346k;
    }

    public ColorStateList getIconTint() {
        return this.f2343h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2342g;
    }

    public int getInsetBottom() {
        return this.f2339d.f3535f;
    }

    public int getInsetTop() {
        return this.f2339d.f3534e;
    }

    public ColorStateList getRippleColor() {
        if (m1854b() == true) goto L7;
        return null;
    L7:
        return this.f2339d.f3541l;
    }

    public C1127k getShapeAppearanceModel() {
        if (m1854b() == false) goto L7;
        return this.f2339d.f3531b;
    L7:
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1854b() == true) goto L7;
        return null;
    L7:
        return this.f2339d.f3540k;
    }

    public int getStrokeWidth() {
        if (m1854b() == true) goto L7;
        return 0;
    L7:
        return this.f2339d.f3537h;
    }

    @Override // p057g.AbstractC0918o
    public ColorStateList getSupportBackgroundTintList() {
        if (m1854b() == false) goto L7;
        return this.f2339d.f3539j;
    L7:
        return super.getSupportBackgroundTintList();
    }

    @Override // p057g.AbstractC0918o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m1854b() == false) goto L7;
        return this.f2339d.f3538i;
    L7:
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2350o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1854b() == false) goto L6;
        AbstractC0805P.m2042V(this, this.f2339d.m2381b(false));
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (m1853a() == false) goto L6;
        View.mergeDrawableStates(r22, f2337r);
    L6:
        if (this.f2350o == false) goto L8;
        View.mergeDrawableStates(r22, f2338s);
    L8:
        return r22;
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(getA11yClassName());
        r2.setChecked(this.f2350o);
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(getA11yClassName());
        r2.setCheckable(m1853a());
        r2.setChecked(this.f2350o);
        r2.setClickable(isClickable());
    }

    @Override // p057g.AbstractC0918o, android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0992b) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0992b r22 = (C0992b) r2;
        super.onRestoreInstanceState(r22.f481a);
        setChecked(r22.f3529c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0992b r1 = new C0992b(super.onSaveInstanceState());
        r1.f3529c = this.f2350o;
        return r1;
    }

    @Override // p057g.AbstractC0918o, android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2339d.f3547r == false) goto L6;
        toggle();
    L6:
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2344i == null) goto L8;
        int[] r02 = getDrawableState();
        if (this.f2344i.setState(r02) == false) goto L9;
        invalidate();
        return;
    L9:
        return;
    }

    public void setA11yClassName(String r1) {
        this.f2345j = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundColor(int r4) {
        if (m1854b() == false) goto L7;
        C0993c r02 = this.f2339d;
        if (r02.m2381b(false) == null) goto L9;
        r02.m2381b(false).setTint(r4);
        return;
    L9:
        return;
    L7:
        super.setBackgroundColor(r4);
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public void setBackgroundDrawable(Drawable r4) {
        if (m1854b() == true) goto L5;
        super.setBackgroundDrawable(r4);
        return;
    L5:
        if (r4 == getBackground()) goto L7;
        C0993c r1 = this.f2339d;
        r1.f3544o = true;
        ColorStateList r02 = r1.f3539j;
        MaterialButton r2 = r1.f3530a;
        r2.setSupportBackgroundTintList(r02);
        r2.setSupportBackgroundTintMode(r1.f3538i);
        super.setBackgroundDrawable(r4);
        return;
    L7:
        getBackground().setState(r4.getState());
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public void setBackgroundResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC0358S.m916w(getContext(), r2);
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
        if (m1854b() == false) goto L6;
        this.f2339d.f3546q = r2;
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
        if (m1853a() == true) goto L5;
        return;
    L5:
        if (isEnabled() == true) goto L7;
        return;
    L7:
        if (this.f2350o == r3) goto L24;
        this.f2350o = r3;
        refreshDrawableState();
        if ((getParent() instanceof MaterialButtonToggleGroup) == false) goto L15;
        MaterialButtonToggleGroup r32 = (MaterialButtonToggleGroup) getParent();
        boolean r02 = this.f2350o;
        if (r32.f2359f == true) goto L15;
        r32.m1859b(getId(), r02);
    L15:
        if (this.f2351p == false) goto L17;
        return;
    L17:
        this.f2351p = true;
        Iterator r33 = this.f2340e.iterator();
        if (r33.hasNext() == true) goto L20;
        this.f2351p = false;
        return;
    L20:
        AbstractC0324d.m726i(r33.next());
        throw null;
    }

    public void setCornerRadius(int r4) {
        if (m1854b() == false) goto L10;
        C0993c r02 = this.f2339d;
        if (r02.f3545p == true) goto L7;
    L8:
        r02.f3536g = r4;
        r02.f3545p = true;
        float r42 = r4;
        C1126j r1 = r02.f3531b.m2660d();
        r1.f4339e = new C1117a(r42);
        r1.f4340f = new C1117a(r42);
        r1.f4341g = new C1117a(r42);
        r1.f4342h = new C1117a(r42);
        r02.m2382c(r1.m2656a());
        return;
    L7:
        if (r02.f3536g != r4) goto L8;
        return;
    }

    public void setCornerRadiusResource(int r2) {
        if (m1854b() == false) goto L6;
        setCornerRadius(getResources().getDimensionPixelSize(r2));
        return;
    }

    @Override // android.view.View
    public void setElevation(float r3) {
        super.setElevation(r3);
        if (m1854b() == false) goto L6;
        this.f2339d.m2381b(false).m2650j(r3);
        return;
    }

    public void setIcon(Drawable r2) {
        if (this.f2344i == r2) goto L6;
        this.f2344i = r2;
        m1856d(true);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconGravity(int r2) {
        if (this.f2352q == r2) goto L6;
        this.f2352q = r2;
        m1857e(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconPadding(int r2) {
        if (this.f2349n == r2) goto L6;
        this.f2349n = r2;
        setCompoundDrawablePadding(r2);
        return;
    }

    public void setIconResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC0358S.m916w(getContext(), r2);
    L5:
        setIcon(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setIconSize(int r2) {
        if (r2 < 0) goto L8;
        if (this.f2346k == r2) goto L9;
        this.f2346k = r2;
        m1856d(true);
        return;
    L9:
        return;
    L8:
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList r2) {
        if (this.f2343h == r2) goto L6;
        this.f2343h = r2;
        m1856d(false);
        return;
    }

    public void setIconTintMode(PorterDuff.Mode r2) {
        if (this.f2342g == r2) goto L6;
        this.f2342g = r2;
        m1856d(false);
        return;
    }

    public void setIconTintResource(int r2) {
        setIconTint(AbstractC0805P.m2049p(getContext(), r2));
    }

    public void setInsetBottom(int r3) {
        C0993c r02 = this.f2339d;
        r02.m2383d(r02.f3534e, r3);
    }

    public void setInsetTop(int r3) {
        C0993c r02 = this.f2339d;
        r02.m2383d(r3, r02.f3535f);
    }

    public void setInternalBackground(Drawable r1) {
        super.setBackgroundDrawable(r1);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0991a r1) {
        this.f2341f = r1;
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        InterfaceC0991a r02 = this.f2341f;
        if (r02 == null) goto L5;
        ((MaterialButtonToggleGroup) ((C0095d) r02).f251b).invalidate();
    L5:
        super.setPressed(r2);
    }

    public void setRippleColor(ColorStateList r3) {
        if (m1854b() == false) goto L10;
        C0993c r02 = this.f2339d;
        if (r02.f3541l == r3) goto L11;
        r02.f3541l = r3;
        MaterialButton r03 = r02.f3530a;
        if ((r03.getBackground() instanceof RippleDrawable) == false) goto L12;
        ((RippleDrawable) r03.getBackground()).setColor(AbstractC1110a.m2618a(r3));
        return;
    L12:
        return;
    L11:
        return;
    }

    public void setRippleColorResource(int r2) {
        if (m1854b() == false) goto L6;
        setRippleColor(AbstractC0805P.m2049p(getContext(), r2));
        return;
    }

    @Override // p089x0.InterfaceC1138v
    public void setShapeAppearanceModel(C1127k r2) {
        if (m1854b() == false) goto L7;
        this.f2339d.m2382c(r2);
        return;
    L7:
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
        if (m1854b() == false) goto L6;
        C0993c r02 = this.f2339d;
        r02.f3543n = r2;
        r02.m2385f();
        return;
    }

    public void setStrokeColor(ColorStateList r3) {
        if (m1854b() == false) goto L8;
        C0993c r02 = this.f2339d;
        if (r02.f3540k == r3) goto L9;
        r02.f3540k = r3;
        r02.m2385f();
        return;
    L9:
        return;
    }

    public void setStrokeColorResource(int r2) {
        if (m1854b() == false) goto L6;
        setStrokeColor(AbstractC0805P.m2049p(getContext(), r2));
        return;
    }

    public void setStrokeWidth(int r3) {
        if (m1854b() == false) goto L8;
        C0993c r02 = this.f2339d;
        if (r02.f3537h == r3) goto L9;
        r02.f3537h = r3;
        r02.m2385f();
        return;
    L9:
        return;
    }

    public void setStrokeWidthResource(int r2) {
        if (m1854b() == false) goto L6;
        setStrokeWidth(getResources().getDimensionPixelSize(r2));
        return;
    }

    @Override // p057g.AbstractC0918o
    public void setSupportBackgroundTintList(ColorStateList r3) {
        if (m1854b() == false) goto L9;
        C0993c r02 = this.f2339d;
        if (r02.f3539j == r3) goto L11;
        r02.f3539j = r3;
        if (r02.m2381b(false) == null) goto L12;
        AbstractC1111a.m2626h(r02.m2381b(false), r02.f3539j);
        return;
    L12:
        return;
    L11:
        return;
    L9:
        super.setSupportBackgroundTintList(r3);
    }

    @Override // p057g.AbstractC0918o
    public void setSupportBackgroundTintMode(PorterDuff.Mode r3) {
        if (m1854b() == false) goto L11;
        C0993c r02 = this.f2339d;
        if (r02.f3538i == r3) goto L13;
        r02.f3538i = r3;
        if (r02.m2381b(false) != null) goto L9;
        return;
    L9:
        if (r02.f3538i == null) goto L15;
        AbstractC1111a.m2627i(r02.m2381b(false), r02.f3538i);
        return;
    L15:
        return;
    L13:
        return;
    L11:
        super.setSupportBackgroundTintMode(r3);
    }

    @Override // android.view.View
    public void setTextAlignment(int r2) {
        super.setTextAlignment(r2);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean r2) {
        this.f2339d.f3547r = r2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2350o);
    }
}
