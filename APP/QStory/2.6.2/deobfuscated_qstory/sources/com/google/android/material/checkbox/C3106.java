package com.google.android.material.checkbox;

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
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0188;
import androidx.appcompat.widget.C0196;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p129.C7485;
import p129.C7486;
import p129.C7487;
import p129.C7489;
import p161.AbstractC7645;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p314.AbstractC8669;

/* JADX INFO: renamed from: com.google.android.material.checkbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3106 extends C0196 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C7485 f10185;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10186;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C3110 f10187;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ColorStateList f10188;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10189;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Drawable f10190;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10191;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f10192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10193;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public CharSequence f10194;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10195;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int[] f10196;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10197;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f10198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ColorStateList f10199;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f10201;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f10202;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10203;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f10204;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10184 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10182 = {R.attr.state_error};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final int[][] f10183 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final int f10181 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C3106(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f10200 = new LinkedHashSet();
        this.f10203 = new LinkedHashSet();
        Context context2 = getContext();
        C7485 c7485 = new C7485(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC7645.f20761;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c7485.f20339 = drawable;
        drawable.setCallback(c7485.f20284);
        new C7486(c7485.f20339.getConstantState(), 0);
        this.f10185 = c7485;
        this.f10187 = new C3110(this);
        Context context3 = getContext();
        this.f10191 = getButtonDrawable();
        this.f10188 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC3159.m7199(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC8669.f24438;
        AbstractC3159.m7198(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0108 c0108 = new C0108(context3, typedArrayObtainStyledAttributes);
        this.f10190 = c0108.m389(2);
        if (this.f10191 != null && AbstractC8174.m13596(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f10181 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f10191 = AbstractC3054.m6607(context3, R.drawable.mtrl_checkbox_button);
                this.f10189 = true;
                if (this.f10190 == null) {
                    this.f10190 = AbstractC3054.m6607(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f10199 = AbstractC8189.m13682(context3, c0108, 3);
        this.f10198 = AbstractC3159.m7194(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f10201 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10202 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10193 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f10192 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(AbstractC8189.m13682(context3, c0108, 10));
        }
        c0108.m362();
        m7096();
    }

    private String getButtonStateDescription() {
        int i = this.f10197;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10204 == null) {
            int iM9876 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorControlActivated));
            int iM98762 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorError));
            int iM98763 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorSurface));
            int iM98764 = AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorOnSurface));
            this.f10204 = new ColorStateList(f10183, new int[]{AbstractC4921.m9884(iM98763, 1.0f, iM98762), AbstractC4921.m9884(iM98763, 1.0f, iM9876), AbstractC4921.m9884(iM98763, 0.54f, iM98764), AbstractC4921.m9884(iM98763, 0.38f, iM98764), AbstractC4921.m9884(iM98763, 0.38f, iM98764)});
        }
        return this.f10204;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10188;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void addOnCheckedStateChangedListener(InterfaceC3109 interfaceC3109) {
        this.f10203.add(interfaceC3109);
    }

    public void addOnErrorChangedListener(InterfaceC3108 interfaceC3108) {
        this.f10200.add(interfaceC3108);
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f10191;
    }

    public Drawable getButtonIconDrawable() {
        return this.f10190;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f10199;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10198;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f10188;
    }

    public int getCheckedState() {
        return this.f10197;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f10192;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f10197 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10201 && this.f10188 == null && this.f10199 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10184);
        }
        if (this.f10193) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10182);
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
        this.f10196 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f10202 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f10193) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10192));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.f10180);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f10180 = getCheckedState();
        return materialCheckBox$SavedState;
    }

    public void removeOnCheckedStateChangedListener(InterfaceC3109 interfaceC3109) {
        this.f10203.remove(interfaceC3109);
    }

    public void removeOnErrorChangedListener(InterfaceC3108 interfaceC3108) {
        this.f10200.remove(interfaceC3108);
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3054.m6607(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f10190 = drawable;
        m7096();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC3054.m6607(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f10199 == colorStateList) {
            return;
        }
        this.f10199 = colorStateList;
        m7096();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f10198 == mode) {
            return;
        }
        this.f10198 = mode;
        m7096();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f10188 == colorStateList) {
            return;
        }
        this.f10188 = colorStateList;
        m7096();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m7096();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f10202 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10197 != i) {
            this.f10197 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f10194 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f10195) {
                return;
            }
            this.f10195 = true;
            LinkedHashSet linkedHashSet = this.f10203;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4568(it);
                }
            }
            if (this.f10197 != 2 && (onCheckedChangeListener = this.f10186) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f10195 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f10192 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f10193 == z) {
            return;
        }
        this.f10193 = z;
        refreshDrawableState();
        Iterator it = this.f10200.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10186 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f10194 = charSequence;
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
        this.f10201 = z;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7096() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0188 c0188;
        Drawable drawableMutate = this.f10191;
        ColorStateList colorStateList3 = this.f10188;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f10191 = drawableMutate;
        Drawable drawableMutate2 = this.f10190;
        ColorStateList colorStateList4 = this.f10199;
        PorterDuff.Mode mode = this.f10198;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f10190 = drawableMutate2;
        if (this.f10189) {
            C7485 c7485 = this.f10185;
            if (c7485 != null) {
                C7487 c7487 = c7485.f20285;
                Drawable drawable = c7485.f20339;
                C3110 c3110 = this.f10187;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c3110.f10206 == null) {
                        c3110.f10206 = new C7489(c3110);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c3110.f10206);
                }
                ArrayList arrayList = c7485.f20282;
                if (arrayList != null && c3110 != null) {
                    arrayList.remove(c3110);
                    if (c7485.f20282.size() == 0 && (c0188 = c7485.f20283) != null) {
                        c7487.f20291.removeListener(c0188);
                        c7485.f20283 = null;
                    }
                }
                Drawable drawable2 = c7485.f20339;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c3110.f10206 == null) {
                        c3110.f10206 = new C7489(c3110);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c3110.f10206);
                } else if (c3110 != null) {
                    if (c7485.f20282 == null) {
                        c7485.f20282 = new ArrayList();
                    }
                    if (!c7485.f20282.contains(c3110)) {
                        c7485.f20282.add(c3110);
                        if (c7485.f20283 == null) {
                            c7485.f20283 = new C0188(c7485, 4);
                        }
                        c7487.f20291.addListener(c7485.f20283);
                    }
                }
            }
            Drawable drawable3 = this.f10191;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c7485 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c7485, false);
                ((AnimatedStateListDrawable) this.f10191).addTransition(R.id.indeterminate, R.id.unchecked, c7485, false);
            }
        }
        Drawable drawable4 = this.f10191;
        if (drawable4 != null && (colorStateList2 = this.f10188) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f10190;
        if (drawable5 != null && (colorStateList = this.f10199) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f10191;
        Drawable drawable7 = this.f10190;
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

    @Override // androidx.appcompat.widget.C0196, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f10191 = drawable;
        this.f10189 = false;
        m7096();
    }
}
