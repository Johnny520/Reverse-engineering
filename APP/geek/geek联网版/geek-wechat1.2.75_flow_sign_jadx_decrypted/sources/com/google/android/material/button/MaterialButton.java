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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0187eh;
import p000.AbstractC0259gf;
import p000.AbstractC0274gu;
import p000.AbstractC0387ju;
import p000.AbstractC0493mp;
import p000.AbstractC0498mu;
import p000.C0169e;
import p000.C0431l0;
import p000.C0608pt;
import p000.C0645qt;
import p000.C0841w2;
import p000.InterfaceC0571ot;
import p000.g40;
import p000.g80;
import p000.l30;
import p000.m30;
import p000.n10;
import p000.oa0;
import p000.q60;
import p000.x30;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0841w2 implements Checkable, x30 {

    /* JADX INFO: renamed from: r */
    public static final int[] f994r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f995s = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public final C0645qt f996d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f997e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0571ot f998f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f999g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f1000h;

    /* JADX INFO: renamed from: i */
    public Drawable f1001i;

    /* JADX INFO: renamed from: j */
    public String f1002j;

    /* JADX INFO: renamed from: k */
    public int f1003k;

    /* JADX INFO: renamed from: l */
    public int f1004l;

    /* JADX INFO: renamed from: m */
    public int f1005m;

    /* JADX INFO: renamed from: n */
    public int f1006n;

    /* JADX INFO: renamed from: o */
    public boolean f1007o;

    /* JADX INFO: renamed from: p */
    public boolean f1008p;

    /* JADX INFO: renamed from: q */
    public int f1009q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button), attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle);
        this.f997e = new LinkedHashSet();
        this.f1007o = false;
        this.f1008p = false;
        Context context2 = getContext();
        TypedArray typedArrayM1170A = g80.m1170A(context2, attributeSet, AbstractC0168dz.f1447j, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1006n = typedArrayM1170A.getDimensionPixelSize(12, 0);
        int i = typedArrayM1170A.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f999g = AbstractC0498mu.m1881C(i, mode);
        this.f1000h = AbstractC0274gu.m1315i(getContext(), typedArrayM1170A, 14);
        this.f1001i = AbstractC0274gu.m1316j(getContext(), typedArrayM1170A, 10);
        this.f1009q = typedArrayM1170A.getInteger(11, 1);
        this.f1003k = typedArrayM1170A.getDimensionPixelSize(13, 0);
        C0645qt c0645qt = new C0645qt(this, m30.m1799b(context2, attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button).m1731a());
        this.f996d = c0645qt;
        c0645qt.f3932c = typedArrayM1170A.getDimensionPixelOffset(1, 0);
        c0645qt.f3933d = typedArrayM1170A.getDimensionPixelOffset(2, 0);
        c0645qt.f3934e = typedArrayM1170A.getDimensionPixelOffset(3, 0);
        c0645qt.f3935f = typedArrayM1170A.getDimensionPixelOffset(4, 0);
        if (typedArrayM1170A.hasValue(8)) {
            int dimensionPixelSize = typedArrayM1170A.getDimensionPixelSize(8, -1);
            c0645qt.f3936g = dimensionPixelSize;
            float f = dimensionPixelSize;
            l30 l30VarM1802e = c0645qt.f3931b.m1802e();
            l30VarM1802e.f2908e = new C0169e(f);
            l30VarM1802e.f2909f = new C0169e(f);
            l30VarM1802e.f2910g = new C0169e(f);
            l30VarM1802e.f2911h = new C0169e(f);
            c0645qt.m2161c(l30VarM1802e.m1731a());
            c0645qt.f3945p = true;
        }
        c0645qt.f3937h = typedArrayM1170A.getDimensionPixelSize(20, 0);
        c0645qt.f3938i = AbstractC0498mu.m1881C(typedArrayM1170A.getInt(7, -1), mode);
        c0645qt.f3939j = AbstractC0274gu.m1315i(getContext(), typedArrayM1170A, 6);
        c0645qt.f3940k = AbstractC0274gu.m1315i(getContext(), typedArrayM1170A, 19);
        c0645qt.f3941l = AbstractC0274gu.m1315i(getContext(), typedArrayM1170A, 16);
        c0645qt.f3946q = typedArrayM1170A.getBoolean(5, false);
        c0645qt.f3949t = typedArrayM1170A.getDimensionPixelSize(9, 0);
        c0645qt.f3947r = typedArrayM1170A.getBoolean(21, true);
        WeakHashMap weakHashMap = oa0.f3426a;
        int iM2734f = y90.m2734f(this);
        int paddingTop = getPaddingTop();
        int iM2733e = y90.m2733e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayM1170A.hasValue(0)) {
            c0645qt.f3944o = true;
            setSupportBackgroundTintList(c0645qt.f3939j);
            setSupportBackgroundTintMode(c0645qt.f3938i);
        } else {
            c0645qt.m2163e();
        }
        y90.m2739k(this, iM2734f + c0645qt.f3932c, paddingTop + c0645qt.f3934e, iM2733e + c0645qt.f3933d, paddingBottom + c0645qt.f3935f);
        typedArrayM1170A.recycle();
        setCompoundDrawablePadding(this.f1006n);
        m694c(this.f1001i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
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

    /* JADX INFO: renamed from: a */
    public final boolean m692a() {
        C0645qt c0645qt = this.f996d;
        return (c0645qt == null || c0645qt.f3944o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m693b() {
        int i = this.f1009q;
        if (i == 1 || i == 2) {
            q60.m2125e(this, this.f1001i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            q60.m2125e(this, null, null, this.f1001i, null);
        } else if (i == 16 || i == 32) {
            q60.m2125e(this, null, this.f1001i, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m694c(boolean z) {
        Drawable drawable = this.f1001i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1001i = drawableMutate;
            AbstractC0187eh.m995h(drawableMutate, this.f1000h);
            PorterDuff.Mode mode = this.f999g;
            if (mode != null) {
                AbstractC0187eh.m996i(this.f1001i, mode);
            }
            int intrinsicWidth = this.f1003k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1001i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1003k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1001i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1001i;
            int i = this.f1004l;
            int i2 = this.f1005m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f1001i.setVisible(true, z);
        }
        if (z) {
            m693b();
            return;
        }
        Drawable[] drawableArrM2121a = q60.m2121a(this);
        Drawable drawable3 = drawableArrM2121a[0];
        Drawable drawable4 = drawableArrM2121a[1];
        Drawable drawable5 = drawableArrM2121a[2];
        int i3 = this.f1009q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f1001i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f1001i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f1001i))) {
            m693b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m695d(int i, int i2) {
        if (this.f1001i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1009q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1004l = 0;
                if (i3 == 16) {
                    this.f1005m = 0;
                    m694c(false);
                    return;
                }
                int intrinsicHeight = this.f1003k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f1001i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f1006n) - getPaddingBottom()) / 2);
                if (this.f1005m != iMax) {
                    this.f1005m = iMax;
                    m694c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1005m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f1009q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1004l = 0;
            m694c(false);
            return;
        }
        int intrinsicWidth = this.f1003k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f1001i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = oa0.f3426a;
        int iM2733e = (((textLayoutWidth - y90.m2733e(this)) - intrinsicWidth) - this.f1006n) - y90.m2734f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iM2733e /= 2;
        }
        if ((y90.m2732d(this) == 1) != (this.f1009q == 4)) {
            iM2733e = -iM2733e;
        }
        if (this.f1004l != iM2733e) {
            this.f1004l = iM2733e;
            m694c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1002j)) {
            return this.f1002j;
        }
        C0645qt c0645qt = this.f996d;
        return ((c0645qt == null || !c0645qt.f3946q) ? Button.class : CompoundButton.class).getName();
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
        if (m692a()) {
            return this.f996d.f3936g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1001i;
    }

    public int getIconGravity() {
        return this.f1009q;
    }

    public int getIconPadding() {
        return this.f1006n;
    }

    public int getIconSize() {
        return this.f1003k;
    }

    public ColorStateList getIconTint() {
        return this.f1000h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f999g;
    }

    public int getInsetBottom() {
        return this.f996d.f3935f;
    }

    public int getInsetTop() {
        return this.f996d.f3934e;
    }

    public ColorStateList getRippleColor() {
        if (m692a()) {
            return this.f996d.f3941l;
        }
        return null;
    }

    public m30 getShapeAppearanceModel() {
        if (m692a()) {
            return this.f996d.f3931b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m692a()) {
            return this.f996d.f3940k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m692a()) {
            return this.f996d.f3937h;
        }
        return 0;
    }

    @Override // p000.C0841w2
    public ColorStateList getSupportBackgroundTintList() {
        return m692a() ? this.f996d.f3939j : super.getSupportBackgroundTintList();
    }

    @Override // p000.C0841w2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m692a() ? this.f996d.f3938i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1007o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m692a()) {
            AbstractC0387ju.m1631v(this, this.f996d.m2160b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C0645qt c0645qt = this.f996d;
        if (c0645qt != null && c0645qt.f3946q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f994r);
        }
        if (this.f1007o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f995s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C0841w2, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1007o);
    }

    @Override // p000.C0841w2, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0645qt c0645qt = this.f996d;
        accessibilityNodeInfo.setCheckable(c0645qt != null && c0645qt.f3946q);
        accessibilityNodeInfo.setChecked(this.f1007o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C0841w2, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m695d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0608pt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0608pt c0608pt = (C0608pt) parcelable;
        super.onRestoreInstanceState(c0608pt.f1274a);
        setChecked(c0608pt.f3753c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0608pt c0608pt = new C0608pt(super.onSaveInstanceState());
        c0608pt.f3753c = this.f1007o;
        return c0608pt;
    }

    @Override // p000.C0841w2, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m695d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f996d.f3947r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1001i != null) {
            if (this.f1001i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1002j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m692a()) {
            super.setBackgroundColor(i);
            return;
        }
        C0645qt c0645qt = this.f996d;
        if (c0645qt.m2160b(false) != null) {
            c0645qt.m2160b(false).setTint(i);
        }
    }

    @Override // p000.C0841w2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m692a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0645qt c0645qt = this.f996d;
        c0645qt.f3944o = true;
        MaterialButton materialButton = c0645qt.f3930a;
        materialButton.setSupportBackgroundTintList(c0645qt.f3939j);
        materialButton.setSupportBackgroundTintMode(c0645qt.f3938i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C0841w2, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0259gf.m1261w(getContext(), i) : null);
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
        if (m692a()) {
            this.f996d.f3946q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C0645qt c0645qt = this.f996d;
        if (c0645qt == null || !c0645qt.f3946q || !isEnabled() || this.f1007o == z) {
            return;
        }
        this.f1007o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f1007o;
            if (!materialButtonToggleGroup.f1016f) {
                materialButtonToggleGroup.m697b(getId(), z2);
            }
        }
        if (this.f1008p) {
            return;
        }
        this.f1008p = true;
        Iterator it = this.f997e.iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        this.f1008p = false;
    }

    public void setCornerRadius(int i) {
        if (m692a()) {
            C0645qt c0645qt = this.f996d;
            if (c0645qt.f3945p && c0645qt.f3936g == i) {
                return;
            }
            c0645qt.f3936g = i;
            c0645qt.f3945p = true;
            float f = i;
            l30 l30VarM1802e = c0645qt.f3931b.m1802e();
            l30VarM1802e.f2908e = new C0169e(f);
            l30VarM1802e.f2909f = new C0169e(f);
            l30VarM1802e.f2910g = new C0169e(f);
            l30VarM1802e.f2911h = new C0169e(f);
            c0645qt.m2161c(l30VarM1802e.m1731a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m692a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m692a()) {
            this.f996d.m2160b(false).m1536i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1001i != drawable) {
            this.f1001i = drawable;
            m694c(true);
            m695d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1009q != i) {
            this.f1009q = i;
            m695d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1006n != i) {
            this.f1006n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0259gf.m1261w(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1003k != i) {
            this.f1003k = i;
            m694c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1000h != colorStateList) {
            this.f1000h = colorStateList;
            m694c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f999g != mode) {
            this.f999g = mode;
            m694c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0493mp.m1864n(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0645qt c0645qt = this.f996d;
        c0645qt.m2162d(c0645qt.f3934e, i);
    }

    public void setInsetTop(int i) {
        C0645qt c0645qt = this.f996d;
        c0645qt.m2162d(i, c0645qt.f3935f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0571ot interfaceC0571ot) {
        this.f998f = interfaceC0571ot;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0571ot interfaceC0571ot = this.f998f;
        if (interfaceC0571ot != null) {
            ((MaterialButtonToggleGroup) ((C0431l0) interfaceC0571ot).f2886b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m692a()) {
            C0645qt c0645qt = this.f996d;
            MaterialButton materialButton = c0645qt.f3930a;
            if (c0645qt.f3941l != colorStateList) {
                c0645qt.f3941l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(n10.m1909a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m692a()) {
            setRippleColor(AbstractC0493mp.m1864n(getContext(), i));
        }
    }

    @Override // p000.x30
    public void setShapeAppearanceModel(m30 m30Var) {
        if (!m692a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f996d.m2161c(m30Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m692a()) {
            C0645qt c0645qt = this.f996d;
            c0645qt.f3943n = z;
            c0645qt.m2164f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m692a()) {
            C0645qt c0645qt = this.f996d;
            if (c0645qt.f3940k != colorStateList) {
                c0645qt.f3940k = colorStateList;
                c0645qt.m2164f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m692a()) {
            setStrokeColor(AbstractC0493mp.m1864n(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m692a()) {
            C0645qt c0645qt = this.f996d;
            if (c0645qt.f3937h != i) {
                c0645qt.f3937h = i;
                c0645qt.m2164f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m692a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C0841w2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m692a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0645qt c0645qt = this.f996d;
        if (c0645qt.f3939j != colorStateList) {
            c0645qt.f3939j = colorStateList;
            if (c0645qt.m2160b(false) != null) {
                AbstractC0187eh.m995h(c0645qt.m2160b(false), c0645qt.f3939j);
            }
        }
    }

    @Override // p000.C0841w2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m692a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0645qt c0645qt = this.f996d;
        if (c0645qt.f3938i != mode) {
            c0645qt.f3938i = mode;
            if (c0645qt.m2160b(false) == null || c0645qt.f3938i == null) {
                return;
            }
            AbstractC0187eh.m996i(c0645qt.m2160b(false), c0645qt.f3938i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m695d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f996d.f3947r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1007o);
    }
}
