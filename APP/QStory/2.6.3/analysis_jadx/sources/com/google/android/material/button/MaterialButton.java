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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0099;
import androidx.appcompat.widget.C0195;
import androidx.compose.foundation.text.input.internal.RunnableC0876;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.core.view.C2242;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C2358;
import androidx.profileinstaller.AbstractC2442;
import com.google.android.material.internal.AbstractC3160;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p034.AbstractC6344;
import p034.AbstractC6347;
import p162.AbstractC7653;
import p165.C7677;
import p165.C7678;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p305.C8617;
import p305.C8622;
import p305.C8640;
import p305.C8643;
import p305.InterfaceC8619;
import p305.InterfaceC8635;
import p307.AbstractC8650;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0195 implements Checkable, InterfaceC8619 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10092;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10093;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public LinearLayout.LayoutParams f10094;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f10095;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f10096;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10097;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public float f10098;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10099;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10100;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10101;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f10102;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f10103;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f10104;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f10105;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10106;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10107;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10108;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public PorterDuff.Mode f10109;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10110;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f10111;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10112;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10113;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10114;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10115;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10116;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3098 f10117;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ColorStateList f10118;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f10119;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC3094 f10120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f10121;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10122;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8622 f10123;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10124;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C7678 f10125;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WidthChangeDirection f10126;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public float f10127;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final int[] f10091 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final int[] f10090 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final C3096 f10089 = new C3096();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3093();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f10128;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f10128 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10128 ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum WidthChangeDirection {
        NONE,
        START,
        END,
        BOTH
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13830(com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.davemorrissey.labs.subscaleview.R.attr.materialSizeOverlay}), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle);
        this.f10116 = new LinkedHashSet();
        this.f10110 = false;
        this.f10101 = false;
        this.f10102 = Integer.MIN_VALUE;
        this.f10098 = -2.1474836E9f;
        this.f10099 = Integer.MIN_VALUE;
        this.f10095 = Integer.MIN_VALUE;
        this.f10093 = Integer.MIN_VALUE;
        this.f10126 = WidthChangeDirection.BOTH;
        Context context2 = getContext();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context2, attributeSet, AbstractC8661.f24436, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f10113 = typedArrayM7182.getDimensionPixelSize(13, 0);
        int i = typedArrayM7182.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f10121 = AbstractC3160.m7181(i, mode);
        this.f10118 = AbstractC7739.m13073(getContext(), typedArrayM7182, 15);
        this.f10119 = AbstractC7739.m13076(getContext(), typedArrayM7182, 11);
        this.f10100 = typedArrayM7182.getInteger(12, 1);
        this.f10104 = typedArrayM7182.getDimensionPixelSize(14, 0);
        this.f10109 = AbstractC3160.m7181(typedArrayM7182.getInt(22, -1), mode);
        this.f10108 = typedArrayM7182.hasValue(21) ? AbstractC7739.m13073(getContext(), typedArrayM7182, 21) : this.f10118;
        this.f10103 = typedArrayM7182.getInteger(20, 3);
        Drawable drawableM13076 = AbstractC7739.m13076(getContext(), typedArrayM7182, 19);
        this.f10107 = drawableM13076;
        this.f10106 = drawableM13076 == null;
        InterfaceC8635 interfaceC8635M14288 = C8617.m14288(context2, typedArrayM7182, 23);
        interfaceC8635M14288 = interfaceC8635M14288 == null ? C8640.m14321(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button).m14319() : interfaceC8635M14288;
        boolean z = typedArrayM7182.getBoolean(17, false);
        C3098 c3098 = new C3098(this, interfaceC8635M14288);
        this.f10117 = c3098;
        c3098.f10140 = typedArrayM7182.getDimensionPixelOffset(2, 0);
        c3098.f10139 = typedArrayM7182.getDimensionPixelOffset(3, 0);
        c3098.f10156 = typedArrayM7182.getDimensionPixelOffset(4, 0);
        c3098.f10155 = typedArrayM7182.getDimensionPixelOffset(5, 0);
        if (typedArrayM7182.hasValue(9)) {
            int dimensionPixelSize = typedArrayM7182.getDimensionPixelSize(9, -1);
            c3098.f10159 = dimensionPixelSize;
            c3098.f10143 = c3098.f10143.mo14295(dimensionPixelSize);
            c3098.m7063();
            c3098.f10152 = true;
        }
        c3098.f10160 = typedArrayM7182.getDimensionPixelSize(26, 0);
        c3098.f10157 = AbstractC3160.m7181(typedArrayM7182.getInt(8, -1), mode);
        c3098.f10158 = AbstractC7739.m13073(getContext(), typedArrayM7182, 7);
        c3098.f10150 = AbstractC7739.m13073(getContext(), typedArrayM7182, 25);
        c3098.f10149 = AbstractC7739.m13073(getContext(), typedArrayM7182, 18);
        c3098.f10146 = typedArrayM7182.getBoolean(6, false);
        c3098.f10148 = typedArrayM7182.getDimensionPixelSize(10, 0);
        c3098.f10145 = typedArrayM7182.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM7182.hasValue(0)) {
            c3098.f10151 = true;
            setSupportBackgroundTintList(c3098.f10158);
            setSupportBackgroundTintMode(c3098.f10157);
        } else {
            c3098.m7064();
        }
        setPaddingRelative(paddingStart + c3098.f10140, paddingTop + c3098.f10156, paddingEnd + c3098.f10139, paddingBottom + c3098.f10155);
        setCheckedInternal(typedArrayM7182.getBoolean(1, false));
        if (interfaceC8635M14288 instanceof C8617) {
            c3098.f10142 = AbstractC6347.m11919(getContext());
            if (c3098.f10143 instanceof C8617) {
                c3098.m7063();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayM7182.recycle();
        setCompoundDrawablePadding(this.f10113);
        m7040(this.f10119 != null);
        m7042(this.f10107 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f10127;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C8643 c8643M7066;
        if (this.f10097 && this.f10092 && (c8643M7066 = this.f10117.m7066(false)) != null) {
            return (int) (c8643M7066.m14344() * 0.11f);
        }
        return 0;
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

    private void setCheckedInternal(boolean z) {
        if (!m7057() || this.f10110 == z) {
            return;
        }
        this.f10110 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f10110;
            if (!materialButtonToggleGroup.f10131) {
                materialButtonToggleGroup.m7059(getId(), z2);
            }
        }
        if (this.f10101) {
            return;
        }
        this.f10101 = true;
        Iterator it = this.f10116.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
        this.f10101 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.f10127 != f) {
            this.f10127 = f;
            m7045();
            invalidate();
            if (getParent() instanceof AbstractC3099) {
                AbstractC3099 abstractC3099 = (AbstractC3099) getParent();
                int i = (int) this.f10127;
                int iIndexOfChild = abstractC3099.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonM7073 = abstractC3099.m7073(iIndexOfChild);
                MaterialButton materialButtonM7074 = abstractC3099.m7074(iIndexOfChild);
                if (materialButtonM7073 == null && materialButtonM7074 == null) {
                    return;
                }
                if (materialButtonM7073 == null) {
                    materialButtonM7074.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7074 == null) {
                    materialButtonM7073.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7073 == null || materialButtonM7074 == null) {
                    return;
                }
                materialButtonM7073.setDisplayedWidthDecrease(i / 2);
                materialButtonM7074.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m7036(MaterialButton materialButton) {
        materialButton.f10096 = materialButton.getOpticalCenterShift();
        materialButton.m7045();
        materialButton.invalidate();
    }

    public void addOnCheckedChangeListener(InterfaceC3095 interfaceC3095) {
        this.f10116.add(interfaceC3095);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f10105)) {
            return (m7057() ? CompoundButton.class : Button.class).getName();
        }
        return this.f10105;
    }

    public int getAllowedWidthDecrease() {
        return this.f10093;
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
        if (m7048()) {
            return this.f10117.f10159;
        }
        return 0;
    }

    public C7677 getCornerSpringForce() {
        return this.f10117.f10142;
    }

    public Drawable getIcon() {
        return this.f10119;
    }

    public int getIconGravity() {
        return this.f10100;
    }

    public int getIconPadding() {
        return this.f10113;
    }

    public int getIconSize() {
        return this.f10104;
    }

    public ColorStateList getIconTint() {
        return this.f10118;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10121;
    }

    public int getInsetBottom() {
        return this.f10117.f10155;
    }

    public int getInsetLeft() {
        return this.f10117.f10140;
    }

    public int getInsetRight() {
        return this.f10117.f10139;
    }

    public int getInsetTop() {
        return this.f10117.f10156;
    }

    public ColorStateList getRippleColor() {
        if (m7048()) {
            return this.f10117.f10149;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f10107;
    }

    public int getSecondaryIconGravity() {
        return this.f10103;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f10108;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f10109;
    }

    public InterfaceC8635 getShapeAppearance() {
        if (m7048()) {
            return this.f10117.f10143;
        }
        C5925.m11311("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public C8640 getShapeAppearanceModel() {
        if (m7048()) {
            return this.f10117.f10143.mo14292();
        }
        C5925.m11311("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m7048()) {
            return this.f10117.f10150;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m7048()) {
            return this.f10117.f10160;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0195
    public ColorStateList getSupportBackgroundTintList() {
        return m7048() ? this.f10117.f10158 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0195
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m7048() ? this.f10117.f10157 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10110;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m7048()) {
            AbstractC6344.m11869(this, this.f10117.m7066(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m7057()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10091);
        }
        if (this.f10110) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10090);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f10110);
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m7057());
        accessibilityNodeInfo.setChecked(this.f10110);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m7044(getMeasuredWidth(), getMeasuredHeight());
        m7043(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f10102 != i6) {
            this.f10102 = i6;
            this.f10098 = -2.1474836E9f;
        }
        if (this.f10098 == -2.1474836E9f) {
            this.f10098 = getMeasuredWidth();
            if (this.f10094 == null && (getParent() instanceof AbstractC3099) && ((AbstractC3099) getParent()).getButtonSizeChange() != null) {
                this.f10094 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10094);
                layoutParams.width = (int) this.f10098;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f10093 == Integer.MIN_VALUE) {
            if (this.f10119 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f10104;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f10119.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f10093 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f10099 == Integer.MIN_VALUE) {
            this.f10099 = getPaddingStart();
        }
        if (this.f10095 == Integer.MIN_VALUE) {
            this.f10095 = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC3099) && ((AbstractC3099) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f10092 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6699);
        setChecked(savedState.f10128);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10128 = this.f10110;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m7044(getMeasuredWidth(), getMeasuredHeight());
        m7043(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f10117.f10145) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f10119 != null) {
            if (this.f10119.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(InterfaceC3095 interfaceC3095) {
        this.f10116.remove(interfaceC3095);
    }

    public void setA11yClassName(String str) {
        this.f10105 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m7048()) {
            super.setBackgroundColor(i);
            return;
        }
        C3098 c3098 = this.f10117;
        if (c3098.m7066(false) != null) {
            c3098.m7066(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m7048()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C3098 c3098 = this.f10117;
        c3098.f10151 = true;
        MaterialButton materialButton = c3098.f10144;
        materialButton.setSupportBackgroundTintList(c3098.f10158);
        materialButton.setSupportBackgroundTintMode(c3098.f10157);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC3933.m8312(getContext(), i) : null);
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
        if (m7048()) {
            this.f10117.f10146 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f10098 = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m7048()) {
            C3098 c3098 = this.f10117;
            if (c3098.f10152 && c3098.f10159 == i) {
                return;
            }
            c3098.f10159 = i;
            c3098.f10152 = true;
            c3098.f10143 = c3098.f10143.mo14295(i);
            c3098.m7063();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m7048()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C7677 c7677) {
        C3098 c3098 = this.f10117;
        c3098.f10142 = c7677;
        if (c3098.f10143 instanceof C8617) {
            c3098.m7063();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f10124 = Math.min(i, this.f10093);
        m7045();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m7048()) {
            this.f10117.m7066(false).m14340(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10119 == drawable || m7041(new RunnableC3097(this, drawable, 1))) {
            return;
        }
        this.f10098 = -2.1474836E9f;
        this.f10119 = drawable;
        m7040(true);
        m7044(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.f10100 != i) {
            if (this.f10119 != null && this.f10107 != null && m7039()) {
                C5925.m11310("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.f10100 = i;
                m7044(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f10113 != i) {
            this.f10113 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC3933.m8312(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C5925.m11310("iconSize cannot be less than 0");
            return;
        }
        if (this.f10104 == i || m7041(new RunnableC0876(this, i, 1))) {
            return;
        }
        this.f10098 = -2.1474836E9f;
        this.f10104 = i;
        m7040(true);
        m7042(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10118 != colorStateList) {
            this.f10118 = colorStateList;
            m7040(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10121 != mode) {
            this.f10121 = mode;
            m7040(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC7653.m12919(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C3098 c3098 = this.f10117;
        c3098.m7065(c3098.f10140, c3098.f10156, c3098.f10139, i);
    }

    public void setInsetLeft(int i) {
        C3098 c3098 = this.f10117;
        c3098.m7065(i, c3098.f10156, c3098.f10139, c3098.f10155);
    }

    public void setInsetRight(int i) {
        C3098 c3098 = this.f10117;
        c3098.m7065(c3098.f10140, c3098.f10156, i, c3098.f10155);
    }

    public void setInsetTop(int i) {
        C3098 c3098 = this.f10117;
        c3098.m7065(c3098.f10140, i, c3098.f10139, c3098.f10155);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC3094 interfaceC3094) {
        this.f10120 = interfaceC3094;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f10097 != z) {
            this.f10097 = z;
            C3098 c3098 = this.f10117;
            if (z) {
                c3098.setCornerSizeChangeListener(new C2358(this, 2));
            } else {
                c3098.setCornerSizeChangeListener(null);
            }
            post(new RunnableC1107(this, 3));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC3094 interfaceC3094 = this.f10120;
        if (interfaceC3094 != null) {
            ((MaterialButtonToggleGroup) ((C2242) interfaceC3094).f6537).invalidate();
        }
        super.setPressed(z);
        m7049(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m7048()) {
            C3098 c3098 = this.f10117;
            MaterialButton materialButton = c3098.f10144;
            if (c3098.f10149 != colorStateList) {
                c3098.f10149 = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC8650.m14350(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m7048()) {
            setRippleColor(AbstractC7653.m12919(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f10107 == drawable || m7041(new RunnableC3097(this, drawable, 0))) {
            return;
        }
        this.f10098 = -2.1474836E9f;
        this.f10107 = drawable;
        this.f10106 = false;
        m7042(true);
        m7043(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f10103 != i) {
            if (this.f10107 != null && this.f10119 != null && m7039()) {
                C5925.m11310("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.f10103 = i;
                m7043(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? AbstractC3933.m8312(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f10108 != colorStateList) {
            this.f10108 = colorStateList;
            m7042(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f10109 != mode) {
            this.f10109 = mode;
            m7042(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(AbstractC7653.m12919(getContext(), i));
    }

    public void setShapeAppearance(InterfaceC8635 interfaceC8635) {
        if (!m7048()) {
            C5925.m11311("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        C3098 c3098 = this.f10117;
        if (c3098.f10142 == null && interfaceC8635.mo14290()) {
            c3098.f10142 = AbstractC6347.m11919(getContext());
            if (c3098.f10143 instanceof C8617) {
                c3098.m7063();
            }
        }
        c3098.f10143 = interfaceC8635;
        c3098.m7063();
    }

    @Override // p305.InterfaceC8619
    public void setShapeAppearanceModel(C8640 c8640) {
        if (!m7048()) {
            C5925.m11311("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        C3098 c3098 = this.f10117;
        c3098.f10143 = c8640;
        c3098.m7063();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m7048()) {
            C3098 c3098 = this.f10117;
            c3098.f10154 = z;
            c3098.m7062();
        }
    }

    public void setSizeChange(C8622 c8622) {
        if (this.f10123 != c8622) {
            this.f10123 = c8622;
            m7049(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m7048()) {
            C3098 c3098 = this.f10117;
            if (c3098.f10150 != colorStateList) {
                c3098.f10150 = colorStateList;
                c3098.m7062();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m7048()) {
            setStrokeColor(AbstractC7653.m12919(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m7048()) {
            C3098 c3098 = this.f10117;
            if (c3098.f10160 != i) {
                c3098.f10160 = i;
                c3098.m7062();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m7048()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0195
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m7048()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C3098 c3098 = this.f10117;
        if (c3098.f10158 != colorStateList) {
            c3098.f10158 = colorStateList;
            if (c3098.m7066(false) != null) {
                c3098.m7066(false).setTintList(c3098.f10158);
            }
        }
    }

    @Override // androidx.appcompat.widget.C0195
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m7048()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C3098 c3098 = this.f10117;
        if (c3098.f10157 != mode) {
            c3098.f10157 = mode;
            if (c3098.m7066(false) == null || c3098.f10157 == null) {
                return;
            }
            c3098.m7066(false).setTintMode(c3098.f10157);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f10098 = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m7044(getMeasuredWidth(), getMeasuredHeight());
        m7043(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f10098 = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f10098 = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f10117.f10145 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f10098 = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(WidthChangeDirection widthChangeDirection) {
        if (this.f10126 != widthChangeDirection) {
            this.f10126 = widthChangeDirection;
            m7049(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f10122 != i) {
            this.f10122 = i;
            m7049(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10110);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7037(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f10119;
        if (drawable != null) {
            intrinsicWidth = this.f10104;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f10107;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f10104;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f10113) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7038(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7039() {
        if (m7055() && m7050()) {
            return true;
        }
        if (m7054() && m7046()) {
            return true;
        }
        return m7047() && m7051();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7040(boolean z) {
        Drawable drawable = this.f10119;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10119 = drawableMutate;
            drawableMutate.setTintList(this.f10118);
            PorterDuff.Mode mode = this.f10121;
            if (mode != null) {
                this.f10119.setTintMode(mode);
            }
            int intrinsicWidth = this.f10104;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10119.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10104;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10119.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10119;
            int i = this.f10115;
            int i2 = this.f10114;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10119.setVisible(true, z);
        }
        if (this.f10119 != null && this.f10107 != null && m7039()) {
            C5925.m11310("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.f10119 == null && this.f10107 != null && m7039()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7055() && compoundDrawablesRelative[0] != this.f10119) || (m7054() && compoundDrawablesRelative[2] != this.f10119) || (m7047() && compoundDrawablesRelative[1] != this.f10119);
        if (z || z2) {
            if (m7055()) {
                setCompoundDrawablesRelative(this.f10119, m7052(1), m7052(2), null);
            } else if (m7054()) {
                setCompoundDrawablesRelative(m7052(0), m7052(1), this.f10119, null);
            } else if (m7047()) {
                setCompoundDrawablesRelative(m7052(0), this.f10119, m7052(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7041(Runnable runnable) {
        C7678 c7678 = this.f10125;
        if (c7678 == null || !c7678.f20819) {
            return false;
        }
        post(new RunnableC0099(this, 3, runnable));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7042(boolean z) {
        Drawable drawable = this.f10107;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10107 = drawableMutate;
            drawableMutate.setTintList(this.f10108);
            PorterDuff.Mode mode = this.f10109;
            if (mode != null) {
                this.f10107.setTintMode(mode);
            }
            int intrinsicWidth = this.f10104;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10107.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10104;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10107.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10107;
            int i = this.f10112;
            int i2 = this.f10111;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10107.setVisible(true, z);
        }
        if (this.f10107 != null && this.f10119 != null && m7039()) {
            C5925.m11310("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f10107 == null) {
            if (this.f10106) {
                return;
            }
            if (this.f10119 != null && m7039()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7050() && compoundDrawablesRelative[0] != this.f10107) || (m7046() && compoundDrawablesRelative[2] != this.f10107) || (m7051() && compoundDrawablesRelative[1] != this.f10107);
        if (z || z2) {
            if (m7050()) {
                setCompoundDrawablesRelative(this.f10107, m7056(1), m7056(2), null);
            } else if (m7046()) {
                setCompoundDrawablesRelative(m7056(0), m7056(1), this.f10107, null);
            } else if (m7051()) {
                setCompoundDrawablesRelative(m7056(0), this.f10107, m7056(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7043(int i, int i2) {
        if (this.f10107 == null || getLayout() == null) {
            return;
        }
        if (m7050() || m7046()) {
            this.f10111 = 0;
            if (m7038(this.f10103)) {
                this.f10112 = 0;
                m7042(false);
                return;
            }
            int iM7037 = m7037(i, this.f10103);
            if (this.f10112 != iM7037) {
                this.f10112 = iM7037;
                m7042(false);
                return;
            }
            return;
        }
        if (m7051()) {
            this.f10112 = 0;
            if (this.f10103 == 16) {
                this.f10111 = 0;
                m7042(false);
                return;
            }
            int intrinsicHeight = this.f10104;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10107.getIntrinsicHeight();
            }
            int iM7053 = m7053(i2, intrinsicHeight);
            if (this.f10111 != iM7053) {
                this.f10111 = iM7053;
                m7042(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7044(int i, int i2) {
        if (this.f10119 == null || getLayout() == null) {
            return;
        }
        if (m7055() || m7054()) {
            this.f10114 = 0;
            if (m7038(this.f10100)) {
                this.f10115 = 0;
                m7040(false);
                return;
            }
            int iM7037 = m7037(i, this.f10100);
            if (this.f10115 != iM7037) {
                this.f10115 = iM7037;
                m7040(false);
                return;
            }
            return;
        }
        if (m7047()) {
            this.f10115 = 0;
            if (this.f10100 == 16) {
                this.f10114 = 0;
                m7040(false);
                return;
            }
            int intrinsicHeight = this.f10104;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10119.getIntrinsicHeight();
            }
            int iM7053 = m7053(i2, intrinsicHeight);
            if (this.f10114 != iM7053) {
                this.f10114 = iM7053;
                m7040(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7045() {
        int i = (int) (this.f10127 - this.f10124);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.f10096;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f10098 + i);
        }
        setPaddingRelative(this.f10099 + i3, getPaddingTop(), (this.f10095 + i) - i3, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m7046() {
        int i = this.f10103;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m7047() {
        int i = this.f10100;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7048() {
        C3098 c3098 = this.f10117;
        return (c3098 == null || c3098.f10151) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7049(boolean r9) {
        /*
            r8 = this;
            飘花落叶言楪苏兰世子哲.飘花落叶言子世苏楪哲兰 r0 = r8.f10123
            if (r0 != 0) goto L6
            goto La0
        L6:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r0 = r8.f10125
            if (r0 != 0) goto L1d
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r0 = new 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰
            com.google.android.material.button.飘花落叶言子楪世苏兰哲 r1 = com.google.android.material.button.MaterialButton.f10089
            r0.<init>(r8, r1)
            r8.f10125 = r0
            android.content.Context r1 = r8.getContext()
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = p034.AbstractC6347.m11919(r1)
            r0.f20850 = r1
        L1d:
            boolean r0 = r8.f10092
            if (r0 == 0) goto La0
            com.google.android.material.button.MaterialButton$WidthChangeDirection r0 = r8.f10126
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == r1) goto L36
            if (r0 == r3) goto L36
            r1 = 3
            if (r0 == r1) goto L33
            r0 = r2
            goto L39
        L33:
            int r0 = r8.f10122
            goto L39
        L36:
            int r0 = r8.f10122
            int r0 = r0 / r3
        L39:
            飘花落叶言楪苏兰世子哲.飘花落叶言子世苏楪哲兰 r1 = r8.f10123
            int[] r3 = r8.getDrawableState()
            int[][] r4 = r1.f24216
            r5 = r2
        L42:
            int r6 = r1.f24218
            r7 = -1
            if (r5 >= r6) goto L53
            r6 = r4[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r3)
            if (r6 == 0) goto L50
            goto L54
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L6d
            int[] r3 = android.util.StateSet.WILD_CARD
            int[][] r4 = r1.f24216
            r5 = r2
        L5b:
            int r6 = r1.f24218
            if (r5 >= r6) goto L6c
            r6 = r4[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r3)
            if (r6 == 0) goto L69
            r7 = r5
            goto L6c
        L69:
            int r5 = r5 + 1
            goto L5b
        L6c:
            r5 = r7
        L6d:
            if (r5 >= 0) goto L72
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏 r1 = r1.f24217
            goto L76
        L72:
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏[] r1 = r1.f24215
            r1 = r1[r5]
        L76:
            java.lang.Object r1 = r1.f22219
            飘花落叶言楪苏兰世子哲.飘花落叶言子世楪兰哲苏 r1 = (p305.C8616) r1
            int r3 = r8.getWidth()
            float r4 = r1.f24192
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r1 = r1.f24193
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r5 = com.google.android.material.shape.StateListSizeChange$SizeChangeType.PERCENT
            if (r1 != r5) goto L8a
            float r1 = (float) r3
            float r4 = r4 * r1
        L88:
            int r2 = (int) r4
            goto L8f
        L8a:
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r3 = com.google.android.material.shape.StateListSizeChange$SizeChangeType.PIXELS
            if (r1 != r3) goto L8f
            goto L88
        L8f:
            int r0 = java.lang.Math.min(r0, r2)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r1 = r8.f10125
            float r0 = (float) r0
            r1.m12985(r0)
            if (r9 == 0) goto La0
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r8 = r8.f10125
            r8.m12984()
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.m7049(boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7050() {
        int i = this.f10103;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7051() {
        int i = this.f10103;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Drawable m7052(int i) {
        if (i == 0) {
            if (this.f10107 == null || !m7050()) {
                return null;
            }
            return this.f10107;
        }
        if (i == 1) {
            if (this.f10107 == null || !m7051()) {
                return null;
            }
            return this.f10107;
        }
        if (i == 2 && this.f10107 != null && m7046()) {
            return this.f10107;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7053(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.f10113) - getPaddingBottom()) / 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m7054() {
        int i = this.f10100;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7055() {
        int i = this.f10100;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Drawable m7056(int i) {
        if (i == 0) {
            if (this.f10119 == null || !m7055()) {
                return null;
            }
            return this.f10119;
        }
        if (i == 1) {
            if (this.f10119 == null || !m7054()) {
                return null;
            }
            return this.f10119;
        }
        if (i == 2 && this.f10119 != null && m7054()) {
            return this.f10119;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7057() {
        C3098 c3098 = this.f10117;
        return c3098 != null && c3098.f10146;
    }
}
