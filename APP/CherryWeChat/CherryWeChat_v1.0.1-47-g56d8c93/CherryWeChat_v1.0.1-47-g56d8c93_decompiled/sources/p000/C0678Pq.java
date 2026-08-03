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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: Pq */
/* JADX INFO: loaded from: classes.dex */
public final class C0678Pq extends C1481h3 {

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f2158e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f2159f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2160g;

    /* JADX INFO: renamed from: h */
    public boolean f2161h;

    /* JADX INFO: renamed from: i */
    public boolean f2162i;

    /* JADX INFO: renamed from: j */
    public boolean f2163j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2164k;

    /* JADX INFO: renamed from: l */
    public Drawable f2165l;

    /* JADX INFO: renamed from: m */
    public Drawable f2166m;

    /* JADX INFO: renamed from: n */
    public boolean f2167n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f2168o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f2169p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f2170q;

    /* JADX INFO: renamed from: r */
    public int f2171r;

    /* JADX INFO: renamed from: s */
    public int[] f2172s;

    /* JADX INFO: renamed from: t */
    public boolean f2173t;

    /* JADX INFO: renamed from: u */
    public CharSequence f2174u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f2175v;

    /* JADX INFO: renamed from: w */
    public final C0519M2 f2176w;

    /* JADX INFO: renamed from: x */
    public final C0592Nq f2177x;

    /* JADX INFO: renamed from: y */
    public static final int[] f2156y = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: z */
    public static final int[] f2157z = {R.attr.state_error};

    /* JADX INFO: renamed from: A */
    public static final int[][] f2154A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: B */
    public static final int f2155B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0678Pq(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f2158e = new LinkedHashSet();
        this.f2159f = new LinkedHashSet();
        Context context2 = getContext();
        C0519M2 c0519m2 = new C0519M2(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0125Cw.f295a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0519m2.f373a = drawable;
        drawable.setCallback(c0519m2.f1696f);
        new C0476L2(0, c0519m2.f373a.getConstantState());
        this.f2176w = c0519m2;
        this.f2177x = new C0592Nq(this);
        Context context3 = getContext();
        this.f2165l = getButtonDrawable();
        this.f2168o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC1293cr.m2547f(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC0939Vu.f2946o;
        AbstractC1293cr.m2549h(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C2656w4 c2656w4 = new C2656w4(context3, typedArrayObtainStyledAttributes);
        this.f2166m = c2656w4.m5210q(2);
        if (this.f2165l != null && AbstractC1293cr.m2538Q(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f2155B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f2165l = AbstractC1406fG.m2695U(context3, R.drawable.mtrl_checkbox_button);
                this.f2167n = true;
                if (this.f2166m == null) {
                    this.f2166m = AbstractC1406fG.m2695U(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f2169p = AbstractC0828TB.m1642i(context3, c2656w4, 3);
        this.f2170q = AbstractC0148Dc.m282p(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2161h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f2162i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f2163j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f2164k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c2656w4.m5195E();
        m1372a();
    }

    private String getButtonStateDescription() {
        int i = this.f2171r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2160g == null) {
            int iM621n = AbstractC0295Gu.m621n(this, R.attr.colorControlActivated);
            int iM621n2 = AbstractC0295Gu.m621n(this, R.attr.colorError);
            int iM621n3 = AbstractC0295Gu.m621n(this, R.attr.colorSurface);
            int iM621n4 = AbstractC0295Gu.m621n(this, R.attr.colorOnSurface);
            this.f2160g = new ColorStateList(f2154A, new int[]{AbstractC0295Gu.m629v(iM621n3, iM621n2, 1.0f), AbstractC0295Gu.m629v(iM621n3, iM621n, 1.0f), AbstractC0295Gu.m629v(iM621n3, iM621n4, 0.54f), AbstractC0295Gu.m629v(iM621n3, iM621n4, 0.38f), AbstractC0295Gu.m629v(iM621n3, iM621n4, 0.38f)});
        }
        return this.f2160g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2168o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m1372a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2437r0 c2437r0;
        Drawable drawableMutate = this.f2165l;
        ColorStateList colorStateList3 = this.f2168o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f2165l = drawableMutate;
        Drawable drawableMutate2 = this.f2166m;
        ColorStateList colorStateList4 = this.f2169p;
        PorterDuff.Mode mode = this.f2170q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f2166m = drawableMutate2;
        if (this.f2167n) {
            C0519M2 c0519m2 = this.f2176w;
            if (c0519m2 != null) {
                C0433K2 c0433k2 = c0519m2.f1692b;
                Drawable drawable = c0519m2.f373a;
                C0592Nq c0592Nq = this.f2177x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0592Nq.f1920a == null) {
                        c0592Nq.f1920a = new C0261G2(c0592Nq);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0592Nq.f1920a);
                }
                ArrayList arrayList = c0519m2.f1695e;
                if (arrayList != null && c0592Nq != null) {
                    arrayList.remove(c0592Nq);
                    if (c0519m2.f1695e.size() == 0 && (c2437r0 = c0519m2.f1694d) != null) {
                        c0433k2.f1421b.removeListener(c2437r0);
                        c0519m2.f1694d = null;
                    }
                }
                Drawable drawable2 = c0519m2.f373a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0592Nq.f1920a == null) {
                        c0592Nq.f1920a = new C0261G2(c0592Nq);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0592Nq.f1920a);
                } else if (c0592Nq != null) {
                    if (c0519m2.f1695e == null) {
                        c0519m2.f1695e = new ArrayList();
                    }
                    if (!c0519m2.f1695e.contains(c0592Nq)) {
                        c0519m2.f1695e.add(c0592Nq);
                        if (c0519m2.f1694d == null) {
                            c0519m2.f1694d = new C2437r0(1, c0519m2);
                        }
                        c0433k2.f1421b.addListener(c0519m2.f1694d);
                    }
                }
            }
            Drawable drawable3 = this.f2165l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0519m2 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0519m2, false);
                ((AnimatedStateListDrawable) this.f2165l).addTransition(R.id.indeterminate, R.id.unchecked, c0519m2, false);
            }
        }
        Drawable drawable4 = this.f2165l;
        if (drawable4 != null && (colorStateList2 = this.f2168o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f2166m;
        if (drawable5 != null && (colorStateList = this.f2169p) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f2165l;
        Drawable drawable7 = this.f2166m;
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
        return this.f2165l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2166m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2169p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2170q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2168o;
    }

    public int getCheckedState() {
        return this.f2171r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2164k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f2171r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2161h && this.f2168o == null && this.f2169p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2156y);
        }
        if (this.f2163j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2157z);
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
        this.f2172s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f2162i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f2163j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f2164k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0635Oq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0635Oq c0635Oq = (C0635Oq) parcelable;
        super.onRestoreInstanceState(c0635Oq.getSuperState());
        setCheckedState(c0635Oq.f2032a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0635Oq c0635Oq = new C0635Oq(super.onSaveInstanceState());
        c0635Oq.f2032a = getCheckedState();
        return c0635Oq;
    }

    @Override // p000.C1481h3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2166m = drawable;
        m1372a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2169p == colorStateList) {
            return;
        }
        this.f2169p = colorStateList;
        m1372a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2170q == mode) {
            return;
        }
        this.f2170q = mode;
        m1372a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2168o == colorStateList) {
            return;
        }
        this.f2168o = colorStateList;
        m1372a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m1372a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f2162i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2171r != i) {
            this.f2171r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f2174u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f2173t) {
                return;
            }
            this.f2173t = true;
            LinkedHashSet linkedHashSet = this.f2159f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f2171r != 2 && (onCheckedChangeListener = this.f2175v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f2173t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2164k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f2163j == z) {
            return;
        }
        this.f2163j = z;
        refreshDrawableState();
        Iterator it = this.f2158e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2175v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f2174u = charSequence;
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
        this.f2161h = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C1481h3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f2165l = drawable;
        this.f2167n = false;
        m1372a();
    }
}
