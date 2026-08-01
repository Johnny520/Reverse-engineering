package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: xt */
/* JADX INFO: loaded from: classes.dex */
public final class C0905xt extends C0915y2 {

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f5192e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f5193f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f5194g;

    /* JADX INFO: renamed from: h */
    public boolean f5195h;

    /* JADX INFO: renamed from: i */
    public boolean f5196i;

    /* JADX INFO: renamed from: j */
    public boolean f5197j;

    /* JADX INFO: renamed from: k */
    public CharSequence f5198k;

    /* JADX INFO: renamed from: l */
    public Drawable f5199l;

    /* JADX INFO: renamed from: m */
    public Drawable f5200m;

    /* JADX INFO: renamed from: n */
    public boolean f5201n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f5202o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f5203p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f5204q;

    /* JADX INFO: renamed from: r */
    public int f5205r;

    /* JADX INFO: renamed from: s */
    public int[] f5206s;

    /* JADX INFO: renamed from: t */
    public boolean f5207t;

    /* JADX INFO: renamed from: u */
    public CharSequence f5208u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f5209v;

    /* JADX INFO: renamed from: w */
    public final C0507n2 f5210w;

    /* JADX INFO: renamed from: x */
    public final C0831vt f5211x;

    /* JADX INFO: renamed from: y */
    public static final int[] f5190y = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: z */
    public static final int[] f5191z = {R.attr.state_error};

    /* JADX INFO: renamed from: A */
    public static final int[][] f5188A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: B */
    public static final int f5189B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0905xt(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f5192e = new LinkedHashSet();
        this.f5193f = new LinkedHashSet();
        Context context2 = getContext();
        C0507n2 c0507n2 = new C0507n2(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = c10.f879a;
        Drawable drawableM2603a = x00.m2603a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0507n2.f4819a = drawableM2603a;
        drawableM2603a.setCallback(c0507n2.f3310f);
        new C0470m2(c0507n2.f4819a.getConstantState());
        this.f5210w = c0507n2;
        this.f5211x = new C0831vt(this);
        Context context3 = getContext();
        this.f5199l = AbstractC0887xb.m2619a(this);
        this.f5202o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a80.m39c(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC0873wy.f5055n;
        a80.m41e(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0659r5 c0659r5 = new C0659r5(context3, typedArrayObtainStyledAttributes);
        this.f5200m = c0659r5.m2234m(2);
        if (this.f5199l != null && AbstractC0273gt.m1317z(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f5189B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f5199l = AbstractC0222ff.m1196r(context3, R.drawable.mtrl_checkbox_button);
                this.f5201n = true;
                if (this.f5200m == null) {
                    this.f5200m = AbstractC0222ff.m1196r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f5203p = AbstractC0126ct.m815m(context3, c0659r5, 3);
        this.f5204q = AbstractC0273gt.m1313v(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f5195h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f5196i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f5197j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f5198k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0659r5.m2245z();
        m2634a();
    }

    private String getButtonStateDescription() {
        int i = this.f5205r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5194g == null) {
            int iM2830k = AbstractC0979zt.m2830k(this, R.attr.colorControlActivated);
            int iM2830k2 = AbstractC0979zt.m2830k(this, R.attr.colorError);
            int iM2830k3 = AbstractC0979zt.m2830k(this, R.attr.colorSurface);
            int iM2830k4 = AbstractC0979zt.m2830k(this, R.attr.colorOnSurface);
            this.f5194g = new ColorStateList(f5188A, new int[]{AbstractC0979zt.m2814E(1.0f, iM2830k3, iM2830k2), AbstractC0979zt.m2814E(1.0f, iM2830k3, iM2830k), AbstractC0979zt.m2814E(0.54f, iM2830k3, iM2830k4), AbstractC0979zt.m2814E(0.38f, iM2830k3, iM2830k4), AbstractC0979zt.m2814E(0.38f, iM2830k3, iM2830k4)});
        }
        return this.f5194g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5202o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m2634a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0913y0 c0913y0;
        Drawable drawableMutate = this.f5199l;
        ColorStateList colorStateList3 = this.f5202o;
        PorterDuff.Mode modeM2559b = AbstractC0850wb.m2559b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM2559b != null) {
                AbstractC0104ch.m689i(drawableMutate, modeM2559b);
            }
        }
        this.f5199l = drawableMutate;
        Drawable drawableMutate2 = this.f5200m;
        ColorStateList colorStateList4 = this.f5203p;
        PorterDuff.Mode mode = this.f5204q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                AbstractC0104ch.m689i(drawableMutate2, mode);
            }
        }
        this.f5200m = drawableMutate2;
        if (this.f5201n) {
            C0507n2 c0507n2 = this.f5210w;
            if (c0507n2 != null) {
                C0433l2 c0433l2 = c0507n2.f3306b;
                Drawable drawable = c0507n2.f4819a;
                C0831vt c0831vt = this.f5211x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0831vt.f4886a == null) {
                        c0831vt.f4886a = new C0359j2(c0831vt);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0831vt.f4886a);
                }
                ArrayList arrayList = c0507n2.f3309e;
                if (arrayList != null && c0831vt != null) {
                    arrayList.remove(c0831vt);
                    if (c0507n2.f3309e.size() == 0 && (c0913y0 = c0507n2.f3308d) != null) {
                        c0433l2.f2993b.removeListener(c0913y0);
                        c0507n2.f3308d = null;
                    }
                }
                Drawable drawable2 = c0507n2.f4819a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0831vt.f4886a == null) {
                        c0831vt.f4886a = new C0359j2(c0831vt);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0831vt.f4886a);
                } else if (c0831vt != null) {
                    if (c0507n2.f3309e == null) {
                        c0507n2.f3309e = new ArrayList();
                    }
                    if (!c0507n2.f3309e.contains(c0831vt)) {
                        c0507n2.f3309e.add(c0831vt);
                        if (c0507n2.f3308d == null) {
                            c0507n2.f3308d = new C0913y0(1, c0507n2);
                        }
                        c0433l2.f2993b.addListener(c0507n2.f3308d);
                    }
                }
            }
            Drawable drawable3 = this.f5199l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0507n2 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0507n2, false);
                ((AnimatedStateListDrawable) this.f5199l).addTransition(R.id.indeterminate, R.id.unchecked, c0507n2, false);
            }
        }
        Drawable drawable4 = this.f5199l;
        if (drawable4 != null && (colorStateList2 = this.f5202o) != null) {
            AbstractC0104ch.m688h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f5200m;
        if (drawable5 != null && (colorStateList = this.f5203p) != null) {
            AbstractC0104ch.m688h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f5199l;
        Drawable drawable7 = this.f5200m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f5199l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5200m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5203p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5204q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f5202o;
    }

    public int getCheckedState() {
        return this.f5205r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5198k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f5205r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5195h && this.f5202o == null && this.f5203p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5190y);
        }
        if (this.f5197j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5191z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f5206s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM2619a;
        if (!this.f5196i || !TextUtils.isEmpty(getText()) || (drawableM2619a = AbstractC0887xb.m2619a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM2619a.getIntrinsicWidth()) / 2) * (AbstractC0273gt.m1311n(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM2619a.getBounds();
            AbstractC0104ch.m686f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5197j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f5198k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0868wt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0868wt c0868wt = (C0868wt) parcelable;
        super.onRestoreInstanceState(c0868wt.getSuperState());
        setCheckedState(c0868wt.f5022a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0868wt c0868wt = new C0868wt(super.onSaveInstanceState());
        c0868wt.f5022a = getCheckedState();
        return c0868wt;
    }

    @Override // p000.C0915y2, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5200m = drawable;
        m2634a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5203p == colorStateList) {
            return;
        }
        this.f5203p = colorStateList;
        m2634a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5204q == mode) {
            return;
        }
        this.f5204q = mode;
        m2634a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5202o == colorStateList) {
            return;
        }
        this.f5202o = colorStateList;
        m2634a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m2634a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f5196i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f5205r != i) {
            this.f5205r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f5208u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f5207t) {
                return;
            }
            this.f5207t = true;
            LinkedHashSet linkedHashSet = this.f5193f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw z30.m2763h(it);
                }
            }
            if (this.f5205r != 2 && (onCheckedChangeListener = this.f5209v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f5207t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5198k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f5197j == z) {
            return;
        }
        this.f5197j = z;
        refreshDrawableState();
        Iterator it = this.f5192e.iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5209v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f5208u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5195h = z;
        if (z) {
            AbstractC0850wb.m2560c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0850wb.m2560c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C0915y2, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f5199l = drawable;
        this.f5201n = false;
        m2634a();
    }
}
