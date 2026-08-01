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
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.a80;
import defpackage.ch;
import defpackage.ct;
import defpackage.e;
import defpackage.e30;
import defpackage.f30;
import defpackage.ff;
import defpackage.g10;
import defpackage.gt;
import defpackage.ip;
import defpackage.ja0;
import defpackage.k60;
import defpackage.kt;
import defpackage.l0;
import defpackage.lt;
import defpackage.mt;
import defpackage.q30;
import defpackage.t90;
import defpackage.w2;
import defpackage.wy;
import defpackage.z30;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends w2 implements Checkable, q30 {
    public static final int[] r = null;
    public static final int[] s = null;
    public final mt d;
    public final LinkedHashSet e;
    public kt f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    static {
        r = new int[]{R.attr.state_checkable};
        s = new int[]{R.attr.state_checked};
    }

    public MaterialButton(Context r9, AttributeSet r10) {
        super(ff.W(r9, r10, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button), r10, com.ljx.wechatmod.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        boolean r92 = false;
        this.o = false;
        this.p = false;
        Context r0 = getContext();
        TypedArray r102 = a80.u(r0, r10, wy.j, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = r102.getDimensionPixelSize(12, 0);
        int r2 = r102.getInt(15, -1);
        PorterDuff.Mode r5 = PorterDuff.Mode.SRC_IN;
        this.g = gt.v(r2, r5);
        this.h = ct.n(getContext(), r102, 14);
        this.i = ct.o(getContext(), r102, 10);
        this.q = r102.getInteger(11, 1);
        this.k = r102.getDimensionPixelSize(13, 0);
        mt r1 = new mt(this, f30.b(r0, r10, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button).a());
        this.d = r1;
        r1.c = r102.getDimensionPixelOffset(1, 0);
        r1.d = r102.getDimensionPixelOffset(2, 0);
        r1.e = r102.getDimensionPixelOffset(3, 0);
        r1.f = r102.getDimensionPixelOffset(4, 0);
        if (r102.hasValue(8) == false) goto L5;
        int r02 = r102.getDimensionPixelSize(8, -1);
        r1.g = r02;
        float r03 = r02;
        e30 r22 = r1.b.e();
        r22.e = new e(r03);
        r22.f = new e(r03);
        r22.g = new e(r03);
        r22.h = new e(r03);
        r1.c(r22.a());
        r1.p = true;
    L5:
        r1.h = r102.getDimensionPixelSize(20, 0);
        r1.i = gt.v(r102.getInt(7, -1), r5);
        r1.j = ct.n(getContext(), r102, 6);
        r1.k = ct.n(getContext(), r102, 19);
        r1.l = ct.n(getContext(), r102, 16);
        r1.q = r102.getBoolean(5, false);
        r1.t = r102.getDimensionPixelSize(9, 0);
        r1.r = r102.getBoolean(21, true);
        WeakHashMap r04 = ja0.a;
        int r05 = t90.f(this);
        int r23 = getPaddingTop();
        int r3 = t90.e(this);
        int r4 = getPaddingBottom();
        if (r102.hasValue(0) == false) goto L8;
        r1.o = true;
        setSupportBackgroundTintList(r1.j);
        setSupportBackgroundTintMode(r1.i);
    L9:
        t90.k(this, r05 + r1.c, r23 + r1.e, r3 + r1.d, r4 + r1.f);
        r102.recycle();
        setCompoundDrawablePadding(this.n);
        if (this.i == null) goto L12;
        r92 = true;
    L12:
        c(r92);
        return;
    L8:
        r1.e();
        goto L9
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

    public final boolean a() {
        mt r0 = this.d;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.o == true) goto L10;
        return true;
    L10:
        return false;
    }

    public final void b() {
        int r0 = this.q;
        if (r0 != 1) goto L5;
    L22:
        k60.e(this, this.i, null, null, null);
        return;
    L5:
        if (r0 == 2) goto L22;
        if (r0 != 3) goto L10;
    L20:
        k60.e(this, null, null, this.i, null);
        return;
    L10:
        if (r0 == 4) goto L20;
        if (r0 != 16) goto L15;
    L18:
        k60.e(this, null, this.i, null, null);
        return;
    L15:
        if (r0 == 32) goto L18;
    }

    public final void c(boolean r7) {
        Drawable r0 = this.i;
        if (r0 == null) goto L16;
        Drawable r02 = r0.mutate();
        this.i = r02;
        ch.h(r02, this.h);
        PorterDuff.Mode r03 = this.g;
        if (r03 == null) goto L7;
        ch.i(this.i, r03);
    L7:
        int r04 = this.k;
        if (r04 != 0) goto L11;
        r04 = this.i.getIntrinsicWidth();
    L11:
        int r2 = this.k;
        if (r2 != 0) goto L15;
        r2 = this.i.getIntrinsicHeight();
    L15:
        Drawable r3 = this.i;
        int r4 = this.l;
        int r5 = this.m;
        r3.setBounds(r4, r5, r04 + r4, r2 + r5);
        this.i.setVisible(true, r7);
    L16:
        if (r7 == false) goto L19;
        b();
        return;
    L19:
        Drawable[] r72 = k60.a(this);
        Drawable r05 = r72[0];
        Drawable r22 = r72[1];
        Drawable r73 = r72[2];
        int r42 = this.q;
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
        if (r22 != this.i) goto L40;
        return;
    L40:
        b();
        return;
    L29:
        if (r73 != this.i) goto L40;
    L23:
        if (r05 != this.i) goto L40;
        goto L40
    }

    public final void d(int r7, int r8) {
        if (this.i != null) goto L5;
        return;
    L5:
        if (getLayout() == null) goto L66;
        int r0 = this.q;
        boolean r3 = true;
        if (r0 == 1) goto L31;
        if (r0 == 2) goto L31;
        if (r0 == 3) goto L31;
        if (r0 == 4) goto L31;
        if (r0 != 16) goto L17;
    L20:
        this.l = 0;
        if (r0 != 16) goto L24;
        this.m = 0;
        c(false);
        return;
    L24:
        int r72 = this.k;
        if (r72 != 0) goto L27;
        r72 = this.i.getIntrinsicHeight();
    L27:
        int r73 = Math.max(0, (((((r8 - getTextHeight()) - getPaddingTop()) - r72) - this.n) - getPaddingBottom()) / 2);
        if (this.m == r73) goto L64;
        this.m = r73;
        c(false);
        return;
    L64:
        return;
    L17:
        if (r0 == 32) goto L20;
        return;
    L31:
        this.m = 0;
        Layout.Alignment r82 = getActualTextAlignment();
        int r02 = this.q;
        if (r02 == 1) goto L61;
        if (r02 == 3) goto L61;
        if (r02 == 2) goto L36;
    L37:
        if (r02 == 4) goto L39;
    L41:
        int r03 = this.k;
        if (r03 != 0) goto L44;
        r03 = this.i.getIntrinsicWidth();
    L44:
        int r74 = r7 - getTextLayoutWidth();
        WeakHashMap r1 = ja0.a;
        int r75 = (((r74 - t90.e(this)) - r03) - this.n) - t90.f(this);
        if (r82 != Layout.Alignment.ALIGN_CENTER) goto L48;
        r75 = r75 / 2;
    L48:
        if (t90.d(this) != 1) goto L50;
        boolean r83 = true;
    L52:
        if (this.q == 4) goto L55;
        r3 = false;
    L55:
        if (r83 == r3) goto L58;
        r75 = -r75;
    L58:
        if (this.l == r75) goto L65;
        this.l = r75;
        c(false);
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
        this.l = 0;
        c(false);
        return;
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j) == false) goto L5;
        mt r0 = this.d;
        if (r0 != null) goto L9;
    L11:
        Class r02 = Button.class;
    L13:
        return r02.getName();
    L9:
        if (r0.q == false) goto L11;
        r02 = CompoundButton.class;
        goto L13
    L5:
        return this.j;
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
        if (a() == true) goto L5;
        return 0;
    L5:
        return this.d.g;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (a() == true) goto L5;
        return null;
    L5:
        return this.d.l;
    }

    public f30 getShapeAppearanceModel() {
        if (a() == false) goto L7;
        return this.d.b;
    L7:
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a() == true) goto L5;
        return null;
    L5:
        return this.d.k;
    }

    public int getStrokeWidth() {
        if (a() == true) goto L5;
        return 0;
    L5:
        return this.d.h;
    }

    @Override // defpackage.w2
    public ColorStateList getSupportBackgroundTintList() {
        if (a() == false) goto L7;
        return this.d.j;
    L7:
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.w2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a() == false) goto L7;
        return this.d.i;
    L7:
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a() == false) goto L6;
        gt.D(this, this.d.b(false));
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        mt r0 = this.d;
        if (r0 == null) goto L8;
        if (r0.q == false) goto L8;
        View.mergeDrawableStates(r22, r);
    L8:
        if (this.o == false) goto L10;
        View.mergeDrawableStates(r22, s);
    L10:
        return r22;
    }

    @Override // defpackage.w2, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(getA11yClassName());
        r2.setChecked(this.o);
    }

    @Override // defpackage.w2, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(getA11yClassName());
        mt r0 = this.d;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        r2.setCheckable(r02);
        r2.setChecked(this.o);
        r2.setClickable(isClickable());
        return;
    L5:
        if (r0.q == false) goto L7;
        r02 = true;
        goto L8
    }

    @Override // defpackage.w2, android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof lt) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        lt r22 = (lt) r2;
        super.onRestoreInstanceState(r22.a);
        setChecked(r22.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        lt r1 = new lt(super.onSaveInstanceState());
        r1.c = this.o;
        return r1;
    }

    @Override // defpackage.w2, android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r == false) goto L6;
        toggle();
    L6:
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i == null) goto L8;
        int[] r0 = getDrawableState();
        if (this.i.setState(r0) == false) goto L9;
        invalidate();
        return;
    L9:
        return;
    }

    public void setA11yClassName(String r1) {
        this.j = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundColor(int r4) {
        if (a() == false) goto L8;
        mt r0 = this.d;
        if (r0.b(false) == null) goto L10;
        r0.b(false).setTint(r4);
        return;
    L10:
        return;
    L8:
        super.setBackgroundColor(r4);
    }

    @Override // defpackage.w2, android.view.View
    public void setBackgroundDrawable(Drawable r4) {
        if (a() == true) goto L5;
        super.setBackgroundDrawable(r4);
        return;
    L5:
        if (r4 == getBackground()) goto L8;
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        mt r1 = this.d;
        r1.o = true;
        MaterialButton r0 = r1.a;
        r0.setSupportBackgroundTintList(r1.j);
        r0.setSupportBackgroundTintMode(r1.i);
        super.setBackgroundDrawable(r4);
        return;
    L8:
        getBackground().setState(r4.getState());
    }

    @Override // defpackage.w2, android.view.View
    public void setBackgroundResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = ff.r(getContext(), r2);
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
        if (a() == false) goto L6;
        this.d.q = r2;
        return;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
        mt r0 = this.d;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.q == true) goto L7;
        return;
    L7:
        if (isEnabled() == true) goto L9;
        return;
    L9:
        if (this.o == r3) goto L28;
        this.o = r3;
        refreshDrawableState();
        if ((getParent() instanceof MaterialButtonToggleGroup) == false) goto L17;
        MaterialButtonToggleGroup r32 = (MaterialButtonToggleGroup) getParent();
        boolean r02 = this.o;
        if (r32.f == true) goto L17;
        r32.b(getId(), r02);
    L17:
        if (this.p == true) goto L29;
        this.p = true;
        Iterator r33 = this.e.iterator();
        if (r33.hasNext() == true) goto L24;
        this.p = false;
        return;
    L24:
        throw z30.h(r33);
    L29:
        return;
    }

    public void setCornerRadius(int r4) {
        if (a() == false) goto L10;
        mt r0 = this.d;
        if (r0.p == true) goto L7;
    L8:
        r0.g = r4;
        r0.p = true;
        float r42 = r4;
        e30 r1 = r0.b.e();
        r1.e = new e(r42);
        r1.f = new e(r42);
        r1.g = new e(r42);
        r1.h = new e(r42);
        r0.c(r1.a());
        return;
    L7:
        if (r0.g != r4) goto L8;
        return;
    }

    public void setCornerRadiusResource(int r2) {
        if (a() == false) goto L6;
        setCornerRadius(getResources().getDimensionPixelSize(r2));
        return;
    }

    @Override // android.view.View
    public void setElevation(float r3) {
        super.setElevation(r3);
        if (a() == false) goto L6;
        this.d.b(false).i(r3);
        return;
    }

    public void setIcon(Drawable r2) {
        if (this.i == r2) goto L6;
        this.i = r2;
        c(true);
        d(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconGravity(int r2) {
        if (this.q == r2) goto L6;
        this.q = r2;
        d(getMeasuredWidth(), getMeasuredHeight());
        return;
    }

    public void setIconPadding(int r2) {
        if (this.n == r2) goto L6;
        this.n = r2;
        setCompoundDrawablePadding(r2);
        return;
    }

    public void setIconResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = ff.r(getContext(), r2);
    L5:
        setIcon(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setIconSize(int r2) {
        if (r2 < 0) goto L8;
        if (this.k == r2) goto L9;
        this.k = r2;
        c(true);
        return;
    L9:
        return;
    L8:
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList r2) {
        if (this.h == r2) goto L6;
        this.h = r2;
        c(false);
        return;
    }

    public void setIconTintMode(PorterDuff.Mode r2) {
        if (this.g == r2) goto L6;
        this.g = r2;
        c(false);
        return;
    }

    public void setIconTintResource(int r2) {
        setIconTint(ip.v(getContext(), r2));
    }

    public void setInsetBottom(int r3) {
        mt r0 = this.d;
        r0.d(r0.e, r3);
    }

    public void setInsetTop(int r3) {
        mt r0 = this.d;
        r0.d(r3, r0.f);
    }

    public void setInternalBackground(Drawable r1) {
        super.setBackgroundDrawable(r1);
    }

    public void setOnPressedChangeListenerInternal(kt r1) {
        this.f = r1;
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
        kt r0 = this.f;
        if (r0 == null) goto L5;
        ((MaterialButtonToggleGroup) ((l0) r0).b).invalidate();
    L5:
        super.setPressed(r2);
    }

    public void setRippleColor(ColorStateList r4) {
        if (a() == false) goto L10;
        mt r0 = this.d;
        MaterialButton r1 = r0.a;
        if (r0.l == r4) goto L11;
        r0.l = r4;
        if ((r1.getBackground() instanceof RippleDrawable) == false) goto L12;
        ((RippleDrawable) r1.getBackground()).setColor(g10.a(r4));
        return;
    L12:
        return;
    L11:
        return;
    }

    public void setRippleColorResource(int r2) {
        if (a() == false) goto L6;
        setRippleColor(ip.v(getContext(), r2));
        return;
    }

    @Override // defpackage.q30
    public void setShapeAppearanceModel(f30 r2) {
        if (a() == false) goto L7;
        this.d.c(r2);
        return;
    L7:
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
        if (a() == false) goto L6;
        mt r0 = this.d;
        r0.n = r2;
        r0.f();
        return;
    }

    public void setStrokeColor(ColorStateList r3) {
        if (a() == false) goto L8;
        mt r0 = this.d;
        if (r0.k == r3) goto L9;
        r0.k = r3;
        r0.f();
        return;
    L9:
        return;
    }

    public void setStrokeColorResource(int r2) {
        if (a() == false) goto L6;
        setStrokeColor(ip.v(getContext(), r2));
        return;
    }

    public void setStrokeWidth(int r3) {
        if (a() == false) goto L8;
        mt r0 = this.d;
        if (r0.h == r3) goto L9;
        r0.h = r3;
        r0.f();
        return;
    L9:
        return;
    }

    public void setStrokeWidthResource(int r2) {
        if (a() == false) goto L6;
        setStrokeWidth(getResources().getDimensionPixelSize(r2));
        return;
    }

    @Override // defpackage.w2
    public void setSupportBackgroundTintList(ColorStateList r3) {
        if (a() == false) goto L10;
        mt r0 = this.d;
        if (r0.j == r3) goto L12;
        r0.j = r3;
        if (r0.b(false) == null) goto L13;
        ch.h(r0.b(false), r0.j);
        return;
    L13:
        return;
    L12:
        return;
    L10:
        super.setSupportBackgroundTintList(r3);
    }

    @Override // defpackage.w2
    public void setSupportBackgroundTintMode(PorterDuff.Mode r3) {
        if (a() == false) goto L12;
        mt r0 = this.d;
        if (r0.i == r3) goto L14;
        r0.i = r3;
        if (r0.b(false) != null) goto L9;
        return;
    L9:
        if (r0.i == null) goto L16;
        ch.i(r0.b(false), r0.i);
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
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean r2) {
        this.d.r = r2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }
}
