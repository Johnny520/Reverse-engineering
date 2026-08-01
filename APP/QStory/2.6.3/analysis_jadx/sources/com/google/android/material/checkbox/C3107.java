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
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p129.C7486;
import p129.C7487;
import p129.C7488;
import p129.C7490;
import p161.AbstractC7646;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p314.AbstractC8661;

/* JADX INFO: renamed from: com.google.android.material.checkbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3107 extends C0196 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C7486 f10190;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f10191;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C3111 f10192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public ColorStateList f10193;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10194;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Drawable f10195;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10196;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f10197;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public CharSequence f10199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int[] f10201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f10203;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ColorStateList f10204;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10205;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f10206;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f10207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10208;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f10209;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int[] f10189 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final int[] f10187 = {R.attr.state_error};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final int[][] f10188 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final int f10186 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C3107(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f10205 = new LinkedHashSet();
        this.f10208 = new LinkedHashSet();
        Context context2 = getContext();
        C7486 c7486 = new C7486(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC7646.f20756;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c7486.f20334 = drawable;
        drawable.setCallback(c7486.f20279);
        new C7487(c7486.f20334.getConstantState(), 0);
        this.f10190 = c7486;
        this.f10192 = new C3111(this);
        Context context3 = getContext();
        this.f10196 = getButtonDrawable();
        this.f10193 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC3160.m7186(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC8661.f24429;
        AbstractC3160.m7185(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0108 c0108 = new C0108(context3, typedArrayObtainStyledAttributes);
        this.f10195 = c0108.m390(2);
        if (this.f10196 != null && AbstractC6561.m12068(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f10186 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f10196 = AbstractC3933.m8312(context3, R.drawable.mtrl_checkbox_button);
                this.f10194 = true;
                if (this.f10195 == null) {
                    this.f10195 = AbstractC3933.m8312(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f10204 = AbstractC7739.m13072(context3, c0108, 3);
        this.f10203 = AbstractC3160.m7181(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f10206 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10207 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10198 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f10197 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(AbstractC7739.m13072(context3, c0108, 10));
        }
        c0108.m363();
        m7083();
    }

    private String getButtonStateDescription() {
        int i = this.f10202;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10209 == null) {
            int iM10026 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, R.attr.colorControlActivated));
            int iM100262 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, R.attr.colorError));
            int iM100263 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, R.attr.colorSurface));
            int iM100264 = AbstractC5062.m10026(getContext(), AbstractC6561.m12059(this, R.attr.colorOnSurface));
            this.f10209 = new ColorStateList(f10188, new int[]{AbstractC5062.m10024(iM100263, 1.0f, iM100262), AbstractC5062.m10024(iM100263, 1.0f, iM10026), AbstractC5062.m10024(iM100263, 0.54f, iM100264), AbstractC5062.m10024(iM100263, 0.38f, iM100264), AbstractC5062.m10024(iM100263, 0.38f, iM100264)});
        }
        return this.f10209;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10193;
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

    public void addOnCheckedStateChangedListener(InterfaceC3110 interfaceC3110) {
        this.f10208.add(interfaceC3110);
    }

    public void addOnErrorChangedListener(InterfaceC3109 interfaceC3109) {
        this.f10205.add(interfaceC3109);
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f10196;
    }

    public Drawable getButtonIconDrawable() {
        return this.f10195;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f10204;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10203;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f10193;
    }

    public int getCheckedState() {
        return this.f10202;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f10197;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f10202 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10206 && this.f10193 == null && this.f10204 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10189);
        }
        if (this.f10198) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10187);
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
        this.f10201 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f10207 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
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
        if (accessibilityNodeInfo != null && this.f10198) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10197));
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
        setCheckedState(materialCheckBox$SavedState.f10185);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.f10185 = getCheckedState();
        return materialCheckBox$SavedState;
    }

    public void removeOnCheckedStateChangedListener(InterfaceC3110 interfaceC3110) {
        this.f10208.remove(interfaceC3110);
    }

    public void removeOnErrorChangedListener(InterfaceC3109 interfaceC3109) {
        this.f10205.remove(interfaceC3109);
    }

    @Override // androidx.appcompat.widget.C0196, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3933.m8312(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f10195 = drawable;
        m7083();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC3933.m8312(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f10204 == colorStateList) {
            return;
        }
        this.f10204 = colorStateList;
        m7083();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f10203 == mode) {
            return;
        }
        this.f10203 = mode;
        m7083();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f10193 == colorStateList) {
            return;
        }
        this.f10193 = colorStateList;
        m7083();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m7083();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f10207 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10202 != i) {
            this.f10202 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f10199 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f10200) {
                return;
            }
            this.f10200 = true;
            LinkedHashSet linkedHashSet = this.f10208;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4578(it);
                }
            }
            if (this.f10202 != 2 && (onCheckedChangeListener = this.f10191) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f10200 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f10197 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f10198 == z) {
            return;
        }
        this.f10198 = z;
        refreshDrawableState();
        Iterator it = this.f10205.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10191 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f10199 = charSequence;
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
        this.f10206 = z;
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
    public final void m7083() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0188 c0188;
        Drawable drawableMutate = this.f10196;
        ColorStateList colorStateList3 = this.f10193;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f10196 = drawableMutate;
        Drawable drawableMutate2 = this.f10195;
        ColorStateList colorStateList4 = this.f10204;
        PorterDuff.Mode mode = this.f10203;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f10195 = drawableMutate2;
        if (this.f10194) {
            C7486 c7486 = this.f10190;
            if (c7486 != null) {
                C7488 c7488 = c7486.f20280;
                Drawable drawable = c7486.f20334;
                C3111 c3111 = this.f10192;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c3111.f10211 == null) {
                        c3111.f10211 = new C7490(c3111);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c3111.f10211);
                }
                ArrayList arrayList = c7486.f20277;
                if (arrayList != null && c3111 != null) {
                    arrayList.remove(c3111);
                    if (c7486.f20277.size() == 0 && (c0188 = c7486.f20278) != null) {
                        c7488.f20286.removeListener(c0188);
                        c7486.f20278 = null;
                    }
                }
                Drawable drawable2 = c7486.f20334;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c3111.f10211 == null) {
                        c3111.f10211 = new C7490(c3111);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c3111.f10211);
                } else if (c3111 != null) {
                    if (c7486.f20277 == null) {
                        c7486.f20277 = new ArrayList();
                    }
                    if (!c7486.f20277.contains(c3111)) {
                        c7486.f20277.add(c3111);
                        if (c7486.f20278 == null) {
                            c7486.f20278 = new C0188(c7486, 4);
                        }
                        c7488.f20286.addListener(c7486.f20278);
                    }
                }
            }
            Drawable drawable3 = this.f10196;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c7486 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c7486, false);
                ((AnimatedStateListDrawable) this.f10196).addTransition(R.id.indeterminate, R.id.unchecked, c7486, false);
            }
        }
        Drawable drawable4 = this.f10196;
        if (drawable4 != null && (colorStateList2 = this.f10193) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f10195;
        if (drawable5 != null && (colorStateList = this.f10204) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f10196;
        Drawable drawable7 = this.f10195;
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
        this.f10196 = drawable;
        this.f10194 = false;
        m7083();
    }
}
