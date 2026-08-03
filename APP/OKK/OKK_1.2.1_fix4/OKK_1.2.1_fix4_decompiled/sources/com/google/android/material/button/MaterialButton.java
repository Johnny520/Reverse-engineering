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
    public static final int[] f2337r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f2338s = {R.attr.state_checked};

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

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0059a.m197a(context, attributeSet, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f2340e = new LinkedHashSet();
        this.f2350o = false;
        this.f2351p = false;
        Context context2 = getContext();
        int[] iArr = AbstractC0942a.f3337i;
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button);
        this.f2349n = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2342g = AbstractC1077k.m2558f(i2, mode);
        this.f2343h = AbstractC0805P.m2051r(getContext(), typedArrayObtainStyledAttributes, 14);
        this.f2344i = AbstractC0805P.m2052t(getContext(), typedArrayObtainStyledAttributes, 10);
        this.f2352q = typedArrayObtainStyledAttributes.getInteger(11, 1);
        this.f2346k = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        C0993c c0993c = new C0993c(this, C1127k.m2657a(context2, attributeSet, C1031R.attr.materialButtonStyle, C1031R.style.Widget_MaterialComponents_Button).m2656a());
        this.f2339d = c0993c;
        c0993c.f3532c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        c0993c.f3533d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        c0993c.f3534e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        c0993c.f3535f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            c0993c.f3536g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            C1126j c1126jM2660d = c0993c.f3531b.m2660d();
            c1126jM2660d.f4339e = new C1117a(f2);
            c1126jM2660d.f4340f = new C1117a(f2);
            c1126jM2660d.f4341g = new C1117a(f2);
            c1126jM2660d.f4342h = new C1117a(f2);
            c0993c.m2382c(c1126jM2660d.m2656a());
            c0993c.f3545p = true;
        }
        c0993c.f3537h = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
        c0993c.f3538i = AbstractC1077k.m2558f(typedArrayObtainStyledAttributes.getInt(7, -1), mode);
        c0993c.f3539j = AbstractC0805P.m2051r(getContext(), typedArrayObtainStyledAttributes, 6);
        c0993c.f3540k = AbstractC0805P.m2051r(getContext(), typedArrayObtainStyledAttributes, 19);
        c0993c.f3541l = AbstractC0805P.m2051r(getContext(), typedArrayObtainStyledAttributes, 16);
        c0993c.f3546q = typedArrayObtainStyledAttributes.getBoolean(5, false);
        c0993c.f3549t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        c0993c.f3547r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        Field field = AbstractC0080Q.f219a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            c0993c.f3544o = true;
            setSupportBackgroundTintList(c0993c.f3539j);
            setSupportBackgroundTintMode(c0993c.f3538i);
        } else {
            c0993c.m2384e();
        }
        setPaddingRelative(paddingStart + c0993c.f3532c, paddingTop + c0993c.f3534e, paddingEnd + c0993c.f3533d, paddingBottom + c0993c.f3535f);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f2349n);
        m1856d(this.f2344i != null);
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
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1853a() {
        C0993c c0993c = this.f2339d;
        return c0993c != null && c0993c.f3546q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1854b() {
        C0993c c0993c = this.f2339d;
        return (c0993c == null || c0993c.f3544o) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1855c() {
        int i2 = this.f2352q;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2344i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f2344i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f2344i, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1856d(boolean z2) {
        Drawable drawable = this.f2344i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f2344i = drawableMutate;
            AbstractC1111a.m2626h(drawableMutate, this.f2343h);
            PorterDuff.Mode mode = this.f2342g;
            if (mode != null) {
                AbstractC1111a.m2627i(this.f2344i, mode);
            }
            int intrinsicWidth = this.f2346k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2344i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2346k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2344i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2344i;
            int i2 = this.f2347l;
            int i3 = this.f2348m;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f2344i.setVisible(true, z2);
        }
        if (z2) {
            m1855c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.f2352q;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.f2344i) || (((i4 == 3 || i4 == 4) && drawable5 != this.f2344i) || ((i4 == 16 || i4 == 32) && drawable4 != this.f2344i))) {
            m1855c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1857e(int i2, int i3) {
        if (this.f2344i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f2352q;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f2347l = 0;
                if (i4 == 16) {
                    this.f2348m = 0;
                    m1856d(false);
                    return;
                }
                int intrinsicHeight = this.f2346k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2344i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f2349n) - getPaddingBottom()) / 2);
                if (this.f2348m != iMax) {
                    this.f2348m = iMax;
                    m1856d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2348m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f2352q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2347l = 0;
            m1856d(false);
            return;
        }
        int intrinsicWidth = this.f2346k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2344i.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        Field field = AbstractC0080Q.f219a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f2349n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2352q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2347l != paddingEnd) {
            this.f2347l = paddingEnd;
            m1856d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2345j)) {
            return (m1853a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f2345j;
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
        if (m1854b()) {
            return this.f2339d.f3536g;
        }
        return 0;
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
        if (m1854b()) {
            return this.f2339d.f3541l;
        }
        return null;
    }

    public C1127k getShapeAppearanceModel() {
        if (m1854b()) {
            return this.f2339d.f3531b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1854b()) {
            return this.f2339d.f3540k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1854b()) {
            return this.f2339d.f3537h;
        }
        return 0;
    }

    @Override // p057g.AbstractC0918o
    public ColorStateList getSupportBackgroundTintList() {
        return m1854b() ? this.f2339d.f3539j : super.getSupportBackgroundTintList();
    }

    @Override // p057g.AbstractC0918o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1854b() ? this.f2339d.f3538i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2350o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1854b()) {
            AbstractC0805P.m2042V(this, this.f2339d.m2381b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (m1853a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2337r);
        }
        if (this.f2350o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2338s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2350o);
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m1853a());
        accessibilityNodeInfo.setChecked(this.f2350o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p057g.AbstractC0918o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0992b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0992b c0992b = (C0992b) parcelable;
        super.onRestoreInstanceState(c0992b.f481a);
        setChecked(c0992b.f3529c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0992b c0992b = new C0992b(super.onSaveInstanceState());
        c0992b.f3529c = this.f2350o;
        return c0992b;
    }

    @Override // p057g.AbstractC0918o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2339d.f3547r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2344i != null) {
            if (this.f2344i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2345j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!m1854b()) {
            super.setBackgroundColor(i2);
            return;
        }
        C0993c c0993c = this.f2339d;
        if (c0993c.m2381b(false) != null) {
            c0993c.m2381b(false).setTint(i2);
        }
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1854b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C0993c c0993c = this.f2339d;
        c0993c.f3544o = true;
        ColorStateList colorStateList = c0993c.f3539j;
        MaterialButton materialButton = c0993c.f3530a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0993c.f3538i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p057g.AbstractC0918o, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AbstractC0358S.m916w(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m1854b()) {
            this.f2339d.f3546q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (m1853a() && isEnabled() && this.f2350o != z2) {
            this.f2350o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2350o;
                if (!materialButtonToggleGroup.f2359f) {
                    materialButtonToggleGroup.m1859b(getId(), z3);
                }
            }
            if (this.f2351p) {
                return;
            }
            this.f2351p = true;
            Iterator it = this.f2340e.iterator();
            if (it.hasNext()) {
                AbstractC0324d.m726i(it.next());
                throw null;
            }
            this.f2351p = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (m1854b()) {
            C0993c c0993c = this.f2339d;
            if (c0993c.f3545p && c0993c.f3536g == i2) {
                return;
            }
            c0993c.f3536g = i2;
            c0993c.f3545p = true;
            float f2 = i2;
            C1126j c1126jM2660d = c0993c.f3531b.m2660d();
            c1126jM2660d.f4339e = new C1117a(f2);
            c1126jM2660d.f4340f = new C1117a(f2);
            c1126jM2660d.f4341g = new C1117a(f2);
            c1126jM2660d.f4342h = new C1117a(f2);
            c0993c.m2382c(c1126jM2660d.m2656a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m1854b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m1854b()) {
            this.f2339d.m2381b(false).m2650j(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2344i != drawable) {
            this.f2344i = drawable;
            m1856d(true);
            m1857e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2352q != i2) {
            this.f2352q = i2;
            m1857e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2349n != i2) {
            this.f2349n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AbstractC0358S.m916w(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2346k != i2) {
            this.f2346k = i2;
            m1856d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2343h != colorStateList) {
            this.f2343h = colorStateList;
            m1856d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2342g != mode) {
            this.f2342g = mode;
            m1856d(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(AbstractC0805P.m2049p(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        C0993c c0993c = this.f2339d;
        c0993c.m2383d(c0993c.f3534e, i2);
    }

    public void setInsetTop(int i2) {
        C0993c c0993c = this.f2339d;
        c0993c.m2383d(i2, c0993c.f3535f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0991a interfaceC0991a) {
        this.f2341f = interfaceC0991a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0991a interfaceC0991a = this.f2341f;
        if (interfaceC0991a != null) {
            ((MaterialButtonToggleGroup) ((C0095d) interfaceC0991a).f251b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1854b()) {
            C0993c c0993c = this.f2339d;
            if (c0993c.f3541l != colorStateList) {
                c0993c.f3541l = colorStateList;
                MaterialButton materialButton = c0993c.f3530a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1110a.m2618a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (m1854b()) {
            setRippleColor(AbstractC0805P.m2049p(getContext(), i2));
        }
    }

    @Override // p089x0.InterfaceC1138v
    public void setShapeAppearanceModel(C1127k c1127k) {
        if (!m1854b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2339d.m2382c(c1127k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m1854b()) {
            C0993c c0993c = this.f2339d;
            c0993c.f3543n = z2;
            c0993c.m2385f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1854b()) {
            C0993c c0993c = this.f2339d;
            if (c0993c.f3540k != colorStateList) {
                c0993c.f3540k = colorStateList;
                c0993c.m2385f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m1854b()) {
            setStrokeColor(AbstractC0805P.m2049p(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m1854b()) {
            C0993c c0993c = this.f2339d;
            if (c0993c.f3537h != i2) {
                c0993c.f3537h = i2;
                c0993c.m2385f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m1854b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // p057g.AbstractC0918o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1854b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0993c c0993c = this.f2339d;
        if (c0993c.f3539j != colorStateList) {
            c0993c.f3539j = colorStateList;
            if (c0993c.m2381b(false) != null) {
                AbstractC1111a.m2626h(c0993c.m2381b(false), c0993c.f3539j);
            }
        }
    }

    @Override // p057g.AbstractC0918o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1854b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0993c c0993c = this.f2339d;
        if (c0993c.f3538i != mode) {
            c0993c.f3538i = mode;
            if (c0993c.m2381b(false) == null || c0993c.f3538i == null) {
                return;
            }
            AbstractC1111a.m2627i(c0993c.m2381b(false), c0993c.f3538i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        m1857e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2339d.f3547r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2350o);
    }
}
