package com.google.android.material.checkbox;

import android.R;
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
import androidx.appcompat.app.C0955;
import androidx.appcompat.widget.C1035;
import androidx.appcompat.widget.C1043;
import androidx.profileinstaller.AbstractC3275;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p145.C8315;
import p145.C8316;
import p145.C8317;
import p145.C8319;
import p177.AbstractC8475;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p330.AbstractC9490;

/* JADX INFO: renamed from: com.google.android.material.checkbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3939 extends C1043 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C8315 f10535;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10536;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C3943 f10537;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ColorStateList f10538;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10539;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Drawable f10540;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10541;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f10542;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10543;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public CharSequence f10544;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10545;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int[] f10546;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10547;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f10548;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ColorStateList f10549;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f10551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f10552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10553;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f10554;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10534 = {C0328R.attr.state_indeterminate};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10532 = {C0328R.attr.state_error};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final int[][] f10533 = {new int[]{R.attr.state_enabled, C0328R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final int f10531 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C3939(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.checkboxStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, C0328R.attr.checkboxStyle);
        this.f10550 = new LinkedHashSet();
        this.f10553 = new LinkedHashSet();
        Context context2 = getContext();
        C8315 c8315 = new C8315(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC8475.f21101;
        Drawable drawable = resources.getDrawable(C0328R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c8315.f20679 = drawable;
        drawable.setCallback(c8315.f20624);
        new C8316(c8315.f20679.getConstantState(), 0);
        this.f10535 = c8315;
        this.f10537 = new C3943(this);
        Context context3 = getContext();
        this.f10541 = getButtonDrawable();
        this.f10538 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC3992.m7745(context3, attributeSet, C0328R.attr.checkboxStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC9490.f24774;
        AbstractC3992.m7744(context3, attributeSet, iArr, C0328R.attr.checkboxStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, C0328R.attr.checkboxStyle, C0328R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0955 c0955 = new C0955(context3, typedArrayObtainStyledAttributes);
        this.f10540 = c0955.m950(2);
        if (this.f10541 != null && AbstractC7390.m12627(context3.getTheme(), C0328R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f10531 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f10541 = AbstractC4765.m8871(context3, C0328R.drawable.mtrl_checkbox_button);
                this.f10539 = true;
                if (this.f10540 == null) {
                    this.f10540 = AbstractC4765.m8871(context3, C0328R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f10549 = AbstractC8568.m13631(context3, c0955, 3);
        this.f10548 = AbstractC3992.m7740(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f10551 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10552 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10543 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f10542 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(AbstractC8568.m13631(context3, c0955, 10));
        }
        c0955.m923();
        m7642();
    }

    private String getButtonStateDescription() {
        int i = this.f10547;
        return i == 1 ? getResources().getString(C0328R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C0328R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C0328R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10554 == null) {
            int iM10585 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorControlActivated));
            int iM105852 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorError));
            int iM105853 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorSurface));
            int iM105854 = AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorOnSurface));
            this.f10554 = new ColorStateList(f10533, new int[]{AbstractC5894.m10583(iM105853, 1.0f, iM105852), AbstractC5894.m10583(iM105853, 1.0f, iM10585), AbstractC5894.m10583(iM105853, 0.54f, iM105854), AbstractC5894.m10583(iM105853, 0.38f, iM105854), AbstractC5894.m10583(iM105853, 0.38f, iM105854)});
        }
        return this.f10554;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10538;
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

    public void addOnCheckedStateChangedListener(InterfaceC3942 interfaceC3942) {
        this.f10553.add(interfaceC3942);
    }

    public void addOnErrorChangedListener(InterfaceC3941 interfaceC3941) {
        this.f10550.add(interfaceC3941);
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f10541;
    }

    public Drawable getButtonIconDrawable() {
        return this.f10540;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f10549;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10548;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f10538;
    }

    public int getCheckedState() {
        return this.f10547;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f10542;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f10547 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10551 && this.f10538 == null && this.f10549 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10534);
        }
        if (this.f10543) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10532);
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
        this.f10546 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f10552 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f10543) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10542));
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
        setCheckedState(materialCheckBox$SavedState.f10530);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f10530 = getCheckedState();
        return materialCheckBox$SavedState;
    }

    public void removeOnCheckedStateChangedListener(InterfaceC3942 interfaceC3942) {
        this.f10553.remove(interfaceC3942);
    }

    public void removeOnErrorChangedListener(InterfaceC3941 interfaceC3941) {
        this.f10550.remove(interfaceC3941);
    }

    @Override // androidx.appcompat.widget.C1043, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4765.m8871(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f10540 = drawable;
        m7642();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC4765.m8871(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f10549 == colorStateList) {
            return;
        }
        this.f10549 = colorStateList;
        m7642();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f10548 == mode) {
            return;
        }
        this.f10548 = mode;
        m7642();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f10538 == colorStateList) {
            return;
        }
        this.f10538 = colorStateList;
        m7642();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m7642();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f10552 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10547 != i) {
            this.f10547 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f10544 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f10545) {
                return;
            }
            this.f10545 = true;
            LinkedHashSet linkedHashSet = this.f10553;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC3275.m5138(it);
                }
            }
            if (this.f10547 != 2 && (onCheckedChangeListener = this.f10536) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f10545 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f10542 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f10543 == z) {
            return;
        }
        this.f10543 = z;
        refreshDrawableState();
        Iterator it = this.f10550.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10536 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f10544 = charSequence;
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
        this.f10551 = z;
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
    public final void m7642() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1035 c1035;
        Drawable drawableMutate = this.f10541;
        ColorStateList colorStateList3 = this.f10538;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f10541 = drawableMutate;
        Drawable drawableMutate2 = this.f10540;
        ColorStateList colorStateList4 = this.f10549;
        PorterDuff.Mode mode = this.f10548;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f10540 = drawableMutate2;
        if (this.f10539) {
            C8315 c8315 = this.f10535;
            if (c8315 != null) {
                C8317 c8317 = c8315.f20625;
                Drawable drawable = c8315.f20679;
                C3943 c3943 = this.f10537;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c3943.f10556 == null) {
                        c3943.f10556 = new C8319(c3943);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c3943.f10556);
                }
                ArrayList arrayList = c8315.f20622;
                if (arrayList != null && c3943 != null) {
                    arrayList.remove(c3943);
                    if (c8315.f20622.size() == 0 && (c1035 = c8315.f20623) != null) {
                        c8317.f20631.removeListener(c1035);
                        c8315.f20623 = null;
                    }
                }
                Drawable drawable2 = c8315.f20679;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c3943.f10556 == null) {
                        c3943.f10556 = new C8319(c3943);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c3943.f10556);
                } else if (c3943 != null) {
                    if (c8315.f20622 == null) {
                        c8315.f20622 = new ArrayList();
                    }
                    if (!c8315.f20622.contains(c3943)) {
                        c8315.f20622.add(c3943);
                        if (c8315.f20623 == null) {
                            c8315.f20623 = new C1035(c8315, 4);
                        }
                        c8317.f20631.addListener(c8315.f20623);
                    }
                }
            }
            Drawable drawable3 = this.f10541;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c8315 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(C0328R.id.checked, C0328R.id.unchecked, c8315, false);
                ((AnimatedStateListDrawable) this.f10541).addTransition(C0328R.id.indeterminate, C0328R.id.unchecked, c8315, false);
            }
        }
        Drawable drawable4 = this.f10541;
        if (drawable4 != null && (colorStateList2 = this.f10538) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f10540;
        if (drawable5 != null && (colorStateList = this.f10549) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f10541;
        Drawable drawable7 = this.f10540;
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

    @Override // androidx.appcompat.widget.C1043, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f10541 = drawable;
        this.f10539 = false;
        m7642();
    }
}
