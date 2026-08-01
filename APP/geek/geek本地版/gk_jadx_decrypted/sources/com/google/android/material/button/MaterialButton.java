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
import p000.AbstractC0104ch;
import p000.AbstractC0126ct;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0346ip;
import p000.AbstractC0873wy;
import p000.C0169e;
import p000.C0431l0;
import p000.C0460lt;
import p000.C0497mt;
import p000.C0841w2;
import p000.InterfaceC0423kt;
import p000.a80;
import p000.e30;
import p000.f30;
import p000.g10;
import p000.ja0;
import p000.k60;
import p000.q30;
import p000.t90;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0841w2 implements Checkable, q30 {

    /* JADX INFO: renamed from: r */
    public static final int[] f1069r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f1070s = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public final C0497mt f1071d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f1072e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0423kt f1073f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f1074g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f1075h;

    /* JADX INFO: renamed from: i */
    public Drawable f1076i;

    /* JADX INFO: renamed from: j */
    public String f1077j;

    /* JADX INFO: renamed from: k */
    public int f1078k;

    /* JADX INFO: renamed from: l */
    public int f1079l;

    /* JADX INFO: renamed from: m */
    public int f1080m;

    /* JADX INFO: renamed from: n */
    public int f1081n;

    /* JADX INFO: renamed from: o */
    public boolean f1082o;

    /* JADX INFO: renamed from: p */
    public boolean f1083p;

    /* JADX INFO: renamed from: q */
    public int f1084q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button), attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle);
        this.f1072e = new LinkedHashSet();
        this.f1082o = false;
        this.f1083p = false;
        Context context2 = getContext();
        TypedArray typedArrayM56u = a80.m56u(context2, attributeSet, AbstractC0873wy.f5051j, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1081n = typedArrayM56u.getDimensionPixelSize(12, 0);
        int i = typedArrayM56u.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1074g = AbstractC0273gt.m1313v(i, mode);
        this.f1075h = AbstractC0126ct.m816n(getContext(), typedArrayM56u, 14);
        this.f1076i = AbstractC0126ct.m817o(getContext(), typedArrayM56u, 10);
        this.f1084q = typedArrayM56u.getInteger(11, 1);
        this.f1078k = typedArrayM56u.getDimensionPixelSize(13, 0);
        C0497mt c0497mt = new C0497mt(this, f30.m1136b(context2, attributeSet, com.ljx.wechatmod.R.attr.materialButtonStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Button).m982a());
        this.f1071d = c0497mt;
        c0497mt.f3272c = typedArrayM56u.getDimensionPixelOffset(1, 0);
        c0497mt.f3273d = typedArrayM56u.getDimensionPixelOffset(2, 0);
        c0497mt.f3274e = typedArrayM56u.getDimensionPixelOffset(3, 0);
        c0497mt.f3275f = typedArrayM56u.getDimensionPixelOffset(4, 0);
        if (typedArrayM56u.hasValue(8)) {
            int dimensionPixelSize = typedArrayM56u.getDimensionPixelSize(8, -1);
            c0497mt.f3276g = dimensionPixelSize;
            float f = dimensionPixelSize;
            e30 e30VarM1139e = c0497mt.f3271b.m1139e();
            e30VarM1139e.f1697e = new C0169e(f);
            e30VarM1139e.f1698f = new C0169e(f);
            e30VarM1139e.f1699g = new C0169e(f);
            e30VarM1139e.f1700h = new C0169e(f);
            c0497mt.m1858c(e30VarM1139e.m982a());
            c0497mt.f3285p = true;
        }
        c0497mt.f3277h = typedArrayM56u.getDimensionPixelSize(20, 0);
        c0497mt.f3278i = AbstractC0273gt.m1313v(typedArrayM56u.getInt(7, -1), mode);
        c0497mt.f3279j = AbstractC0126ct.m816n(getContext(), typedArrayM56u, 6);
        c0497mt.f3280k = AbstractC0126ct.m816n(getContext(), typedArrayM56u, 19);
        c0497mt.f3281l = AbstractC0126ct.m816n(getContext(), typedArrayM56u, 16);
        c0497mt.f3286q = typedArrayM56u.getBoolean(5, false);
        c0497mt.f3289t = typedArrayM56u.getDimensionPixelSize(9, 0);
        c0497mt.f3287r = typedArrayM56u.getBoolean(21, true);
        WeakHashMap weakHashMap = ja0.f2600a;
        int iM2369f = t90.m2369f(this);
        int paddingTop = getPaddingTop();
        int iM2368e = t90.m2368e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayM56u.hasValue(0)) {
            c0497mt.f3284o = true;
            setSupportBackgroundTintList(c0497mt.f3279j);
            setSupportBackgroundTintMode(c0497mt.f3278i);
        } else {
            c0497mt.m1860e();
        }
        t90.m2374k(this, iM2369f + c0497mt.f3272c, paddingTop + c0497mt.f3274e, iM2368e + c0497mt.f3273d, paddingBottom + c0497mt.f3275f);
        typedArrayM56u.recycle();
        setCompoundDrawablePadding(this.f1081n);
        m736c(this.f1076i != null);
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
    public final boolean m734a() {
        C0497mt c0497mt = this.f1071d;
        return (c0497mt == null || c0497mt.f3284o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m735b() {
        int i = this.f1084q;
        if (i == 1 || i == 2) {
            k60.m1636e(this, this.f1076i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            k60.m1636e(this, null, null, this.f1076i, null);
        } else if (i == 16 || i == 32) {
            k60.m1636e(this, null, this.f1076i, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m736c(boolean z) {
        Drawable drawable = this.f1076i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1076i = drawableMutate;
            AbstractC0104ch.m688h(drawableMutate, this.f1075h);
            PorterDuff.Mode mode = this.f1074g;
            if (mode != null) {
                AbstractC0104ch.m689i(this.f1076i, mode);
            }
            int intrinsicWidth = this.f1078k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1076i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1078k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1076i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1076i;
            int i = this.f1079l;
            int i2 = this.f1080m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f1076i.setVisible(true, z);
        }
        if (z) {
            m735b();
            return;
        }
        Drawable[] drawableArrM1632a = k60.m1632a(this);
        Drawable drawable3 = drawableArrM1632a[0];
        Drawable drawable4 = drawableArrM1632a[1];
        Drawable drawable5 = drawableArrM1632a[2];
        int i3 = this.f1084q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f1076i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f1076i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f1076i))) {
            m735b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m737d(int i, int i2) {
        if (this.f1076i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1084q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1079l = 0;
                if (i3 == 16) {
                    this.f1080m = 0;
                    m736c(false);
                    return;
                }
                int intrinsicHeight = this.f1078k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f1076i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f1081n) - getPaddingBottom()) / 2);
                if (this.f1080m != iMax) {
                    this.f1080m = iMax;
                    m736c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1080m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f1084q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1079l = 0;
            m736c(false);
            return;
        }
        int intrinsicWidth = this.f1078k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f1076i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = ja0.f2600a;
        int iM2368e = (((textLayoutWidth - t90.m2368e(this)) - intrinsicWidth) - this.f1081n) - t90.m2369f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iM2368e /= 2;
        }
        if ((t90.m2367d(this) == 1) != (this.f1084q == 4)) {
            iM2368e = -iM2368e;
        }
        if (this.f1079l != iM2368e) {
            this.f1079l = iM2368e;
            m736c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1077j)) {
            return this.f1077j;
        }
        C0497mt c0497mt = this.f1071d;
        return ((c0497mt == null || !c0497mt.f3286q) ? Button.class : CompoundButton.class).getName();
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
        if (m734a()) {
            return this.f1071d.f3276g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1076i;
    }

    public int getIconGravity() {
        return this.f1084q;
    }

    public int getIconPadding() {
        return this.f1081n;
    }

    public int getIconSize() {
        return this.f1078k;
    }

    public ColorStateList getIconTint() {
        return this.f1075h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1074g;
    }

    public int getInsetBottom() {
        return this.f1071d.f3275f;
    }

    public int getInsetTop() {
        return this.f1071d.f3274e;
    }

    public ColorStateList getRippleColor() {
        if (m734a()) {
            return this.f1071d.f3281l;
        }
        return null;
    }

    public f30 getShapeAppearanceModel() {
        if (m734a()) {
            return this.f1071d.f3271b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m734a()) {
            return this.f1071d.f3280k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m734a()) {
            return this.f1071d.f3277h;
        }
        return 0;
    }

    @Override // p000.C0841w2
    public ColorStateList getSupportBackgroundTintList() {
        return m734a() ? this.f1071d.f3279j : super.getSupportBackgroundTintList();
    }

    @Override // p000.C0841w2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m734a() ? this.f1071d.f3278i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1082o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m734a()) {
            AbstractC0273gt.m1298D(this, this.f1071d.m1857b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C0497mt c0497mt = this.f1071d;
        if (c0497mt != null && c0497mt.f3286q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1069r);
        }
        if (this.f1082o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1070s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C0841w2, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1082o);
    }

    @Override // p000.C0841w2, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0497mt c0497mt = this.f1071d;
        accessibilityNodeInfo.setCheckable(c0497mt != null && c0497mt.f3286q);
        accessibilityNodeInfo.setChecked(this.f1082o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C0841w2, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m737d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0460lt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0460lt c0460lt = (C0460lt) parcelable;
        super.onRestoreInstanceState(c0460lt.f1344a);
        setChecked(c0460lt.f3103c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0460lt c0460lt = new C0460lt(super.onSaveInstanceState());
        c0460lt.f3103c = this.f1082o;
        return c0460lt;
    }

    @Override // p000.C0841w2, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m737d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f1071d.f3287r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1076i != null) {
            if (this.f1076i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1077j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m734a()) {
            super.setBackgroundColor(i);
            return;
        }
        C0497mt c0497mt = this.f1071d;
        if (c0497mt.m1857b(false) != null) {
            c0497mt.m1857b(false).setTint(i);
        }
    }

    @Override // p000.C0841w2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m734a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0497mt c0497mt = this.f1071d;
        c0497mt.f3284o = true;
        MaterialButton materialButton = c0497mt.f3270a;
        materialButton.setSupportBackgroundTintList(c0497mt.f3279j);
        materialButton.setSupportBackgroundTintMode(c0497mt.f3278i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C0841w2, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0222ff.m1196r(getContext(), i) : null);
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
        if (m734a()) {
            this.f1071d.f3286q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C0497mt c0497mt = this.f1071d;
        if (c0497mt == null || !c0497mt.f3286q || !isEnabled() || this.f1082o == z) {
            return;
        }
        this.f1082o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f1082o;
            if (!materialButtonToggleGroup.f1091f) {
                materialButtonToggleGroup.m739b(getId(), z2);
            }
        }
        if (this.f1083p) {
            return;
        }
        this.f1083p = true;
        Iterator it = this.f1072e.iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        this.f1083p = false;
    }

    public void setCornerRadius(int i) {
        if (m734a()) {
            C0497mt c0497mt = this.f1071d;
            if (c0497mt.f3285p && c0497mt.f3276g == i) {
                return;
            }
            c0497mt.f3276g = i;
            c0497mt.f3285p = true;
            float f = i;
            e30 e30VarM1139e = c0497mt.f3271b.m1139e();
            e30VarM1139e.f1697e = new C0169e(f);
            e30VarM1139e.f1698f = new C0169e(f);
            e30VarM1139e.f1699g = new C0169e(f);
            e30VarM1139e.f1700h = new C0169e(f);
            c0497mt.m1858c(e30VarM1139e.m982a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m734a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m734a()) {
            this.f1071d.m1857b(false).m1084i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1076i != drawable) {
            this.f1076i = drawable;
            m736c(true);
            m737d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1084q != i) {
            this.f1084q = i;
            m737d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1081n != i) {
            this.f1081n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0222ff.m1196r(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1078k != i) {
            this.f1078k = i;
            m736c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1075h != colorStateList) {
            this.f1075h = colorStateList;
            m736c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1074g != mode) {
            this.f1074g = mode;
            m736c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0346ip.m1510v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0497mt c0497mt = this.f1071d;
        c0497mt.m1859d(c0497mt.f3274e, i);
    }

    public void setInsetTop(int i) {
        C0497mt c0497mt = this.f1071d;
        c0497mt.m1859d(i, c0497mt.f3275f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0423kt interfaceC0423kt) {
        this.f1073f = interfaceC0423kt;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0423kt interfaceC0423kt = this.f1073f;
        if (interfaceC0423kt != null) {
            ((MaterialButtonToggleGroup) ((C0431l0) interfaceC0423kt).f2980b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m734a()) {
            C0497mt c0497mt = this.f1071d;
            MaterialButton materialButton = c0497mt.f3270a;
            if (c0497mt.f3281l != colorStateList) {
                c0497mt.f3281l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(g10.m1247a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m734a()) {
            setRippleColor(AbstractC0346ip.m1510v(getContext(), i));
        }
    }

    @Override // p000.q30
    public void setShapeAppearanceModel(f30 f30Var) {
        if (!m734a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f1071d.m1858c(f30Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m734a()) {
            C0497mt c0497mt = this.f1071d;
            c0497mt.f3283n = z;
            c0497mt.m1861f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m734a()) {
            C0497mt c0497mt = this.f1071d;
            if (c0497mt.f3280k != colorStateList) {
                c0497mt.f3280k = colorStateList;
                c0497mt.m1861f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m734a()) {
            setStrokeColor(AbstractC0346ip.m1510v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m734a()) {
            C0497mt c0497mt = this.f1071d;
            if (c0497mt.f3277h != i) {
                c0497mt.f3277h = i;
                c0497mt.m1861f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m734a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C0841w2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m734a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0497mt c0497mt = this.f1071d;
        if (c0497mt.f3279j != colorStateList) {
            c0497mt.f3279j = colorStateList;
            if (c0497mt.m1857b(false) != null) {
                AbstractC0104ch.m688h(c0497mt.m1857b(false), c0497mt.f3279j);
            }
        }
    }

    @Override // p000.C0841w2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m734a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0497mt c0497mt = this.f1071d;
        if (c0497mt.f3278i != mode) {
            c0497mt.f3278i = mode;
            if (c0497mt.m1857b(false) == null || c0497mt.f3278i == null) {
                return;
            }
            AbstractC0104ch.m689i(c0497mt.m1857b(false), c0497mt.f3278i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m737d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f1071d.f3287r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1082o);
    }
}
