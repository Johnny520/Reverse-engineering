package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
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
import com.google.android.material.C1247R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0067Da;
import p000a.C0129H0;
import p000a.C0181Jg;
import p000a.C0324Rg;
import p000a.C0336Sa;
import p000a.C0393Vd;
import p000a.C0408Wa;
import p000a.C0437Y3;
import p000a.C0523cf;
import p000a.C0726n9;
import p000a.C0811s;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0893w5;
import p000a.InterfaceC0465Zd;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0129H0 implements Checkable, InterfaceC0465Zd {

    /* JADX INFO: renamed from: r */
    public static final int[] f5505r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f5506s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t */
    public static final int f5507t = C1247R.style.Widget_MaterialComponents_Button;

    /* JADX INFO: renamed from: d */
    public final C0067Da f5508d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet<InterfaceC1265a> f5509e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1266b f5510f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f5511g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f5512h;

    /* JADX INFO: renamed from: i */
    public Drawable f5513i;

    /* JADX INFO: renamed from: j */
    public String f5514j;

    /* JADX INFO: renamed from: k */
    public int f5515k;

    /* JADX INFO: renamed from: l */
    public int f5516l;

    /* JADX INFO: renamed from: m */
    public int f5517m;

    /* JADX INFO: renamed from: n */
    public int f5518n;

    /* JADX INFO: renamed from: o */
    public boolean f5519o;

    /* JADX INFO: renamed from: p */
    public boolean f5520p;

    /* JADX INFO: renamed from: q */
    public int f5521q;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC1265a {
        /* JADX INFO: renamed from: a */
        void m3120a();
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC1266b {
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C1267c extends AbstractC0792r {
        public static final Parcelable.Creator<C1267c> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public boolean f5522c;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c$a */
        public class a implements Parcelable.ClassLoaderCreator<C1267c> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1267c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1267c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1267c[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1267c(parcel, null);
            }
        }

        public C1267c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C1267c.class.getClassLoader();
            }
            this.f5522c = parcel.readInt() == 1;
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5522c ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.materialButtonStyle;
        int i2 = f5507t;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        this.f5509e = new LinkedHashSet<>();
        this.f5519o = false;
        this.f5520p = false;
        Context context2 = getContext();
        TypedArray typedArrayM1301d = C0523cf.m1301d(context2, attributeSet, C1247R.styleable.MaterialButton, i, i2, new int[0]);
        this.f5518n = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.MaterialButton_iconPadding, 0);
        int i3 = typedArrayM1301d.getInt(C1247R.styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f5511g = C0324Rg.m896b(i3, mode);
        this.f5512h = C0336Sa.m925b(getContext(), typedArrayM1301d, C1247R.styleable.MaterialButton_iconTint);
        this.f5513i = C0336Sa.m926c(getContext(), typedArrayM1301d, C1247R.styleable.MaterialButton_icon);
        this.f5521q = typedArrayM1301d.getInteger(C1247R.styleable.MaterialButton_iconGravity, 1);
        this.f5515k = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.MaterialButton_iconSize, 0);
        C0067Da c0067Da = new C0067Da(this, C0393Vd.m1023b(context2, attributeSet, i, i2).m1028a());
        this.f5508d = c0067Da;
        c0067Da.f220c = typedArrayM1301d.getDimensionPixelOffset(C1247R.styleable.MaterialButton_android_insetLeft, 0);
        c0067Da.f221d = typedArrayM1301d.getDimensionPixelOffset(C1247R.styleable.MaterialButton_android_insetRight, 0);
        c0067Da.f222e = typedArrayM1301d.getDimensionPixelOffset(C1247R.styleable.MaterialButton_android_insetTop, 0);
        c0067Da.f223f = typedArrayM1301d.getDimensionPixelOffset(C1247R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.MaterialButton_cornerRadius, -1);
            c0067Da.f224g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0393Vd.a aVarM1026e = c0067Da.f219b.m1026e();
            aVarM1026e.f1498e = new C0811s(f);
            aVarM1026e.f1499f = new C0811s(f);
            aVarM1026e.f1500g = new C0811s(f);
            aVarM1026e.f1501h = new C0811s(f);
            c0067Da.m167c(aVarM1026e.m1028a());
            c0067Da.f233p = true;
        }
        c0067Da.f225h = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.MaterialButton_strokeWidth, 0);
        c0067Da.f226i = C0324Rg.m896b(typedArrayM1301d.getInt(C1247R.styleable.MaterialButton_backgroundTintMode, -1), mode);
        c0067Da.f227j = C0336Sa.m925b(getContext(), typedArrayM1301d, C1247R.styleable.MaterialButton_backgroundTint);
        c0067Da.f228k = C0336Sa.m925b(getContext(), typedArrayM1301d, C1247R.styleable.MaterialButton_strokeColor);
        c0067Da.f229l = C0336Sa.m925b(getContext(), typedArrayM1301d, C1247R.styleable.MaterialButton_rippleColor);
        c0067Da.f234q = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialButton_android_checkable, false);
        c0067Da.f237t = typedArrayM1301d.getDimensionPixelSize(C1247R.styleable.MaterialButton_elevation, 0);
        c0067Da.f235r = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialButton_android_background)) {
            c0067Da.f232o = true;
            setSupportBackgroundTintList(c0067Da.f227j);
            setSupportBackgroundTintMode(c0067Da.f226i);
        } else {
            c0067Da.m169e();
        }
        setPaddingRelative(paddingStart + c0067Da.f220c, paddingTop + c0067Da.f222e, paddingEnd + c0067Da.f221d, paddingBottom + c0067Da.f223f);
        typedArrayM1301d.recycle();
        setCompoundDrawablePadding(this.f5518n);
        m3118c(this.f5513i != null);
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
    public final boolean m3116a() {
        C0067Da c0067Da = this.f5508d;
        return (c0067Da == null || c0067Da.f232o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3117b() {
        int i = this.f5521q;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.f5513i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f5513i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f5513i, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3118c(boolean z) {
        Drawable drawable = this.f5513i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f5513i = drawableMutate;
            C0893w5.a.m2176h(drawableMutate, this.f5512h);
            PorterDuff.Mode mode = this.f5511g;
            if (mode != null) {
                C0893w5.a.m2177i(this.f5513i, mode);
            }
            int intrinsicWidth = this.f5515k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f5513i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f5515k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f5513i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5513i;
            int i = this.f5516l;
            int i2 = this.f5517m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f5513i.setVisible(true, z);
        }
        if (z) {
            m3117b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f5521q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f5513i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f5513i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f5513i))) {
            m3117b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3119d(int i, int i2) {
        if (this.f5513i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f5521q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f5516l = 0;
                if (i3 == 16) {
                    this.f5517m = 0;
                    m3118c(false);
                    return;
                }
                int intrinsicHeight = this.f5515k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f5513i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f5518n) - getPaddingBottom()) / 2);
                if (this.f5517m != iMax) {
                    this.f5517m = iMax;
                    m3118c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f5517m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f5521q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f5516l = 0;
            m3118c(false);
            return;
        }
        int intrinsicWidth = this.f5515k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f5513i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f5518n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f5521q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f5516l != paddingEnd) {
            this.f5516l = paddingEnd;
            m3118c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f5514j)) {
            return this.f5514j;
        }
        C0067Da c0067Da = this.f5508d;
        return ((c0067Da == null || !c0067Da.f234q) ? Button.class : CompoundButton.class).getName();
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
        if (m3116a()) {
            return this.f5508d.f224g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5513i;
    }

    public int getIconGravity() {
        return this.f5521q;
    }

    public int getIconPadding() {
        return this.f5518n;
    }

    public int getIconSize() {
        return this.f5515k;
    }

    public ColorStateList getIconTint() {
        return this.f5512h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5511g;
    }

    public int getInsetBottom() {
        return this.f5508d.f223f;
    }

    public int getInsetTop() {
        return this.f5508d.f222e;
    }

    public ColorStateList getRippleColor() {
        if (m3116a()) {
            return this.f5508d.f229l;
        }
        return null;
    }

    public C0393Vd getShapeAppearanceModel() {
        if (m3116a()) {
            return this.f5508d.f219b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m3116a()) {
            return this.f5508d.f228k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m3116a()) {
            return this.f5508d.f225h;
        }
        return 0;
    }

    @Override // p000a.C0129H0
    public ColorStateList getSupportBackgroundTintList() {
        return m3116a() ? this.f5508d.f227j : super.getSupportBackgroundTintList();
    }

    @Override // p000a.C0129H0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m3116a() ? this.f5508d.f226i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5519o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m3116a()) {
            C0726n9.m1659A(this, this.f5508d.m166b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C0067Da c0067Da = this.f5508d;
        if (c0067Da != null && c0067Da.f234q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5505r);
        }
        if (this.f5519o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5506s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000a.C0129H0, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f5519o);
    }

    @Override // p000a.C0129H0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C0067Da c0067Da = this.f5508d;
        accessibilityNodeInfo.setCheckable(c0067Da != null && c0067Da.f234q);
        accessibilityNodeInfo.setChecked(this.f5519o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000a.C0129H0, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m3119d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1267c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1267c c1267c = (C1267c) parcelable;
        super.onRestoreInstanceState(c1267c.f3119a);
        setChecked(c1267c.f5522c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1267c c1267c = new C1267c(super.onSaveInstanceState());
        c1267c.f5522c = this.f5519o;
        return c1267c;
    }

    @Override // p000a.C0129H0, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m3119d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f5508d.f235r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f5513i != null) {
            if (this.f5513i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f5514j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m3116a()) {
            super.setBackgroundColor(i);
            return;
        }
        C0067Da c0067Da = this.f5508d;
        if (c0067Da.m166b(false) != null) {
            c0067Da.m166b(false).setTint(i);
        }
    }

    @Override // p000a.C0129H0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m3116a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0067Da c0067Da = this.f5508d;
        c0067Da.f232o = true;
        ColorStateList colorStateList = c0067Da.f227j;
        MaterialButton materialButton = c0067Da.f218a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0067Da.f226i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000a.C0129H0, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0889w1.m2115A(getContext(), i) : null);
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
        if (m3116a()) {
            this.f5508d.f234q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C0067Da c0067Da = this.f5508d;
        if (c0067Da == null || !c0067Da.f234q || !isEnabled() || this.f5519o == z) {
            return;
        }
        this.f5519o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f5519o;
            if (!materialButtonToggleGroup.f5529f) {
                materialButtonToggleGroup.m3122b(getId(), z2);
            }
        }
        if (this.f5520p) {
            return;
        }
        this.f5520p = true;
        Iterator<InterfaceC1265a> it = this.f5509e.iterator();
        while (it.hasNext()) {
            it.next().m3120a();
        }
        this.f5520p = false;
    }

    public void setCornerRadius(int i) {
        if (m3116a()) {
            C0067Da c0067Da = this.f5508d;
            if (c0067Da.f233p && c0067Da.f224g == i) {
                return;
            }
            c0067Da.f224g = i;
            c0067Da.f233p = true;
            float f = i;
            C0393Vd.a aVarM1026e = c0067Da.f219b.m1026e();
            aVarM1026e.f1498e = new C0811s(f);
            aVarM1026e.f1499f = new C0811s(f);
            aVarM1026e.f1500g = new C0811s(f);
            aVarM1026e.f1501h = new C0811s(f);
            c0067Da.m167c(aVarM1026e.m1028a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m3116a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m3116a()) {
            this.f5508d.m166b(false).m966j(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5513i != drawable) {
            this.f5513i = drawable;
            m3118c(true);
            m3119d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f5521q != i) {
            this.f5521q = i;
            m3119d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f5518n != i) {
            this.f5518n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0889w1.m2115A(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5515k != i) {
            this.f5515k = i;
            m3118c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5512h != colorStateList) {
            this.f5512h = colorStateList;
            m3118c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5511g != mode) {
            this.f5511g = mode;
            m3118c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0437Y3.m1091a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0067Da c0067Da = this.f5508d;
        c0067Da.m168d(c0067Da.f222e, i);
    }

    public void setInsetTop(int i) {
        C0067Da c0067Da = this.f5508d;
        c0067Da.m168d(i, c0067Da.f223f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1266b interfaceC1266b) {
        this.f5510f = interfaceC1266b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1266b interfaceC1266b = this.f5510f;
        if (interfaceC1266b != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m3116a()) {
            C0067Da c0067Da = this.f5508d;
            if (c0067Da.f229l != colorStateList) {
                c0067Da.f229l = colorStateList;
                MaterialButton materialButton = c0067Da.f218a;
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
        if (m3116a()) {
            setRippleColor(C0437Y3.m1091a(getContext(), i));
        }
    }

    @Override // p000a.InterfaceC0465Zd
    public void setShapeAppearanceModel(C0393Vd c0393Vd) {
        if (!m3116a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5508d.m167c(c0393Vd);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m3116a()) {
            C0067Da c0067Da = this.f5508d;
            c0067Da.f231n = z;
            c0067Da.m170f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m3116a()) {
            C0067Da c0067Da = this.f5508d;
            if (c0067Da.f228k != colorStateList) {
                c0067Da.f228k = colorStateList;
                c0067Da.m170f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m3116a()) {
            setStrokeColor(C0437Y3.m1091a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m3116a()) {
            C0067Da c0067Da = this.f5508d;
            if (c0067Da.f225h != i) {
                c0067Da.f225h = i;
                c0067Da.m170f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m3116a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000a.C0129H0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m3116a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0067Da c0067Da = this.f5508d;
        if (c0067Da.f227j != colorStateList) {
            c0067Da.f227j = colorStateList;
            if (c0067Da.m166b(false) != null) {
                C0893w5.a.m2176h(c0067Da.m166b(false), c0067Da.f227j);
            }
        }
    }

    @Override // p000a.C0129H0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m3116a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0067Da c0067Da = this.f5508d;
        if (c0067Da.f226i != mode) {
            c0067Da.f226i = mode;
            if (c0067Da.m166b(false) == null || c0067Da.f226i == null) {
                return;
            }
            C0893w5.a.m2177i(c0067Da.m166b(false), c0067Da.f226i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m3119d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f5508d.f235r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5519o);
    }
}
