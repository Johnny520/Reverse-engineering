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

/* JADX INFO: renamed from: bu */
/* JADX INFO: loaded from: classes.dex */
public final class C0081bu extends C0915y2 {

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f762e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f763f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f764g;

    /* JADX INFO: renamed from: h */
    public boolean f765h;

    /* JADX INFO: renamed from: i */
    public boolean f766i;

    /* JADX INFO: renamed from: j */
    public boolean f767j;

    /* JADX INFO: renamed from: k */
    public CharSequence f768k;

    /* JADX INFO: renamed from: l */
    public Drawable f769l;

    /* JADX INFO: renamed from: m */
    public Drawable f770m;

    /* JADX INFO: renamed from: n */
    public boolean f771n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f772o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f773p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f774q;

    /* JADX INFO: renamed from: r */
    public int f775r;

    /* JADX INFO: renamed from: s */
    public int[] f776s;

    /* JADX INFO: renamed from: t */
    public boolean f777t;

    /* JADX INFO: renamed from: u */
    public CharSequence f778u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f779v;

    /* JADX INFO: renamed from: w */
    public final C0507n2 f780w;

    /* JADX INFO: renamed from: x */
    public final C0979zt f781x;

    /* JADX INFO: renamed from: y */
    public static final int[] f760y = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: z */
    public static final int[] f761z = {R.attr.state_error};

    /* JADX INFO: renamed from: A */
    public static final int[][] f758A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: B */
    public static final int f759B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0081bu(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f762e = new LinkedHashSet();
        this.f763f = new LinkedHashSet();
        Context context2 = getContext();
        C0507n2 c0507n2 = new C0507n2(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = j10.f2646a;
        Drawable drawableM952a = e10.m952a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0507n2.f55a = drawableM952a;
        drawableM952a.setCallback(c0507n2.f3210f);
        new C0470m2(c0507n2.f55a.getConstantState());
        this.f780w = c0507n2;
        this.f781x = new C0979zt(this);
        Context context3 = getContext();
        this.f769l = AbstractC0256gc.m1222a(this);
        this.f772o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        g80.m1188c(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC0168dz.f1451n;
        g80.m1190e(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0658r5 c0658r5 = new C0658r5(context3, typedArrayObtainStyledAttributes);
        this.f770m = c0658r5.m2241m(2);
        if (this.f769l != null && AbstractC0493mp.m1837K(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f759B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f769l = AbstractC0259gf.m1261w(context3, R.drawable.mtrl_checkbox_button);
                this.f771n = true;
                if (this.f770m == null) {
                    this.f770m = AbstractC0259gf.m1261w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f773p = AbstractC0274gu.m1314h(context3, c0658r5, 3);
        this.f774q = AbstractC0498mu.m1881C(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f765h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f766i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f767j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f768k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0658r5.m2252z();
        m528a();
    }

    private String getButtonStateDescription() {
        int i = this.f775r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f764g == null) {
            int iM1198m = g80.m1198m(this, R.attr.colorControlActivated);
            int iM1198m2 = g80.m1198m(this, R.attr.colorError);
            int iM1198m3 = g80.m1198m(this, R.attr.colorSurface);
            int iM1198m4 = g80.m1198m(this, R.attr.colorOnSurface);
            this.f764g = new ColorStateList(f758A, new int[]{g80.m1207v(1.0f, iM1198m3, iM1198m2), g80.m1207v(1.0f, iM1198m3, iM1198m), g80.m1207v(0.54f, iM1198m3, iM1198m4), g80.m1207v(0.38f, iM1198m3, iM1198m4), g80.m1207v(0.38f, iM1198m3, iM1198m4)});
        }
        return this.f764g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f772o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m528a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0913y0 c0913y0;
        Drawable drawableMutate = this.f769l;
        ColorStateList colorStateList3 = this.f772o;
        PorterDuff.Mode modeM1091b = AbstractC0219fc.m1091b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM1091b != null) {
                AbstractC0187eh.m996i(drawableMutate, modeM1091b);
            }
        }
        this.f769l = drawableMutate;
        Drawable drawableMutate2 = this.f770m;
        ColorStateList colorStateList4 = this.f773p;
        PorterDuff.Mode mode = this.f774q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                AbstractC0187eh.m996i(drawableMutate2, mode);
            }
        }
        this.f770m = drawableMutate2;
        if (this.f771n) {
            C0507n2 c0507n2 = this.f780w;
            if (c0507n2 != null) {
                C0433l2 c0433l2 = c0507n2.f3206b;
                Drawable drawable = c0507n2.f55a;
                C0979zt c0979zt = this.f781x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0979zt.f5618a == null) {
                        c0979zt.f5618a = new C0359j2(c0979zt);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0979zt.f5618a);
                }
                ArrayList arrayList = c0507n2.f3209e;
                if (arrayList != null && c0979zt != null) {
                    arrayList.remove(c0979zt);
                    if (c0507n2.f3209e.size() == 0 && (c0913y0 = c0507n2.f3208d) != null) {
                        c0433l2.f2896b.removeListener(c0913y0);
                        c0507n2.f3208d = null;
                    }
                }
                Drawable drawable2 = c0507n2.f55a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0979zt.f5618a == null) {
                        c0979zt.f5618a = new C0359j2(c0979zt);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0979zt.f5618a);
                } else if (c0979zt != null) {
                    if (c0507n2.f3209e == null) {
                        c0507n2.f3209e = new ArrayList();
                    }
                    if (!c0507n2.f3209e.contains(c0979zt)) {
                        c0507n2.f3209e.add(c0979zt);
                        if (c0507n2.f3208d == null) {
                            c0507n2.f3208d = new C0913y0(1, c0507n2);
                        }
                        c0433l2.f2896b.addListener(c0507n2.f3208d);
                    }
                }
            }
            Drawable drawable3 = this.f769l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0507n2 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0507n2, false);
                ((AnimatedStateListDrawable) this.f769l).addTransition(R.id.indeterminate, R.id.unchecked, c0507n2, false);
            }
        }
        Drawable drawable4 = this.f769l;
        if (drawable4 != null && (colorStateList2 = this.f772o) != null) {
            AbstractC0187eh.m995h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f770m;
        if (drawable5 != null && (colorStateList = this.f773p) != null) {
            AbstractC0187eh.m995h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f769l;
        Drawable drawable7 = this.f770m;
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
        return this.f769l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f770m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f773p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f774q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f772o;
    }

    public int getCheckedState() {
        return this.f775r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f768k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f775r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f765h && this.f772o == null && this.f773p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f760y);
        }
        if (this.f767j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f761z);
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
        this.f776s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM1222a;
        if (!this.f766i || !TextUtils.isEmpty(getText()) || (drawableM1222a = AbstractC0256gc.m1222a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM1222a.getIntrinsicWidth()) / 2) * (AbstractC0498mu.m1899t(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM1222a.getBounds();
            AbstractC0187eh.m993f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f767j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f768k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0044au)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0044au c0044au = (C0044au) parcelable;
        super.onRestoreInstanceState(c0044au.getSuperState());
        setCheckedState(c0044au.f635a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0044au c0044au = new C0044au(super.onSaveInstanceState());
        c0044au.f635a = getCheckedState();
        return c0044au;
    }

    @Override // p000.C0915y2, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f770m = drawable;
        m528a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f773p == colorStateList) {
            return;
        }
        this.f773p = colorStateList;
        m528a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f774q == mode) {
            return;
        }
        this.f774q = mode;
        m528a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f772o == colorStateList) {
            return;
        }
        this.f772o = colorStateList;
        m528a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m528a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f766i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f775r != i) {
            this.f775r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f778u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f777t) {
                return;
            }
            this.f777t = true;
            LinkedHashSet linkedHashSet = this.f763f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g40.m1145h(it);
                }
            }
            if (this.f775r != 2 && (onCheckedChangeListener = this.f779v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f777t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f768k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f767j == z) {
            return;
        }
        this.f767j = z;
        refreshDrawableState();
        Iterator it = this.f762e.iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f779v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f778u = charSequence;
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
        this.f765h = z;
        if (z) {
            AbstractC0219fc.m1092c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0219fc.m1092c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C0915y2, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f769l = drawable;
        this.f771n = false;
        m528a();
    }
}
