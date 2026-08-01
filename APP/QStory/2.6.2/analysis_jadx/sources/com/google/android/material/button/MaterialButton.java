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
import com.bumptech.glide.AbstractC3054;
import com.google.android.material.internal.AbstractC3159;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p053.AbstractC6560;
import p162.AbstractC7652;
import p165.C7676;
import p165.C7677;
import p175.AbstractC7738;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8625;
import p305.C8630;
import p305.C8648;
import p305.C8651;
import p305.InterfaceC8627;
import p305.InterfaceC8643;
import p307.AbstractC8658;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0195 implements Checkable, InterfaceC8627 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10087;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10088;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public LinearLayout.LayoutParams f10089;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f10090;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f10091;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10092;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public float f10093;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10094;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10095;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10096;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f10097;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f10098;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f10099;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f10100;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10101;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10102;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10103;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public PorterDuff.Mode f10104;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10105;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f10106;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10107;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10108;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10109;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10111;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3097 f10112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ColorStateList f10113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f10114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC3093 f10115;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f10116;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10117;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C8630 f10118;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10119;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C7677 f10120;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WidthChangeDirection f10121;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public float f10122;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final int[] f10086 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final int[] f10085 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final C3095 f10084 = new C3095();

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3092();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f10123;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f10123 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10123 ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum WidthChangeDirection {
        NONE,
        START,
        END,
        BOTH
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13813(com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.davemorrissey.labs.subscaleview.R.attr.materialSizeOverlay}), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle);
        this.f10111 = new LinkedHashSet();
        this.f10105 = false;
        this.f10096 = false;
        this.f10097 = Integer.MIN_VALUE;
        this.f10093 = -2.1474836E9f;
        this.f10094 = Integer.MIN_VALUE;
        this.f10090 = Integer.MIN_VALUE;
        this.f10088 = Integer.MIN_VALUE;
        this.f10121 = WidthChangeDirection.BOTH;
        Context context2 = getContext();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24445, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f10108 = typedArrayM7195.getDimensionPixelSize(13, 0);
        int i = typedArrayM7195.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f10116 = AbstractC3159.m7194(i, mode);
        this.f10113 = AbstractC8189.m13678(getContext(), typedArrayM7195, 15);
        this.f10114 = AbstractC8189.m13683(getContext(), typedArrayM7195, 11);
        this.f10095 = typedArrayM7195.getInteger(12, 1);
        this.f10099 = typedArrayM7195.getDimensionPixelSize(14, 0);
        this.f10104 = AbstractC3159.m7194(typedArrayM7195.getInt(22, -1), mode);
        this.f10103 = typedArrayM7195.hasValue(21) ? AbstractC8189.m13678(getContext(), typedArrayM7195, 21) : this.f10113;
        this.f10098 = typedArrayM7195.getInteger(20, 3);
        Drawable drawableM13683 = AbstractC8189.m13683(getContext(), typedArrayM7195, 19);
        this.f10102 = drawableM13683;
        this.f10101 = drawableM13683 == null;
        InterfaceC8643 interfaceC8643M14269 = C8625.m14269(context2, typedArrayM7195, 23);
        interfaceC8643M14269 = interfaceC8643M14269 == null ? C8648.m14303(context2, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialButtonStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Button).m14301() : interfaceC8643M14269;
        boolean z = typedArrayM7195.getBoolean(17, false);
        C3097 c3097 = new C3097(this, interfaceC8643M14269);
        this.f10112 = c3097;
        c3097.f10135 = typedArrayM7195.getDimensionPixelOffset(2, 0);
        c3097.f10134 = typedArrayM7195.getDimensionPixelOffset(3, 0);
        c3097.f10151 = typedArrayM7195.getDimensionPixelOffset(4, 0);
        c3097.f10150 = typedArrayM7195.getDimensionPixelOffset(5, 0);
        if (typedArrayM7195.hasValue(9)) {
            int dimensionPixelSize = typedArrayM7195.getDimensionPixelSize(9, -1);
            c3097.f10154 = dimensionPixelSize;
            c3097.f10138 = c3097.f10138.mo14276(dimensionPixelSize);
            c3097.m7076();
            c3097.f10147 = true;
        }
        c3097.f10155 = typedArrayM7195.getDimensionPixelSize(26, 0);
        c3097.f10152 = AbstractC3159.m7194(typedArrayM7195.getInt(8, -1), mode);
        c3097.f10153 = AbstractC8189.m13678(getContext(), typedArrayM7195, 7);
        c3097.f10145 = AbstractC8189.m13678(getContext(), typedArrayM7195, 25);
        c3097.f10144 = AbstractC8189.m13678(getContext(), typedArrayM7195, 18);
        c3097.f10141 = typedArrayM7195.getBoolean(6, false);
        c3097.f10143 = typedArrayM7195.getDimensionPixelSize(10, 0);
        c3097.f10140 = typedArrayM7195.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM7195.hasValue(0)) {
            c3097.f10146 = true;
            setSupportBackgroundTintList(c3097.f10153);
            setSupportBackgroundTintMode(c3097.f10152);
        } else {
            c3097.m7077();
        }
        setPaddingRelative(paddingStart + c3097.f10135, paddingTop + c3097.f10151, paddingEnd + c3097.f10134, paddingBottom + c3097.f10150);
        setCheckedInternal(typedArrayM7195.getBoolean(1, false));
        if (interfaceC8643M14269 instanceof C8625) {
            c3097.f10137 = AbstractC7738.m13026(getContext());
            if (c3097.f10138 instanceof C8625) {
                c3097.m7076();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayM7195.recycle();
        setCompoundDrawablePadding(this.f10108);
        m7053(this.f10114 != null);
        m7055(this.f10102 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f10122;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C8651 c8651M7079;
        if (this.f10092 && this.f10087 && (c8651M7079 = this.f10112.m7079(false)) != null) {
            return (int) (c8651M7079.m14326() * 0.11f);
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
        if (!m7070() || this.f10105 == z) {
            return;
        }
        this.f10105 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f10105;
            if (!materialButtonToggleGroup.f10126) {
                materialButtonToggleGroup.m7072(getId(), z2);
            }
        }
        if (this.f10096) {
            return;
        }
        this.f10096 = true;
        Iterator it = this.f10111.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
        this.f10096 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.f10122 != f) {
            this.f10122 = f;
            m7058();
            invalidate();
            if (getParent() instanceof AbstractC3098) {
                AbstractC3098 abstractC3098 = (AbstractC3098) getParent();
                int i = (int) this.f10122;
                int iIndexOfChild = abstractC3098.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonM7086 = abstractC3098.m7086(iIndexOfChild);
                MaterialButton materialButtonM7087 = abstractC3098.m7087(iIndexOfChild);
                if (materialButtonM7086 == null && materialButtonM7087 == null) {
                    return;
                }
                if (materialButtonM7086 == null) {
                    materialButtonM7087.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7087 == null) {
                    materialButtonM7086.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7086 == null || materialButtonM7087 == null) {
                    return;
                }
                materialButtonM7086.setDisplayedWidthDecrease(i / 2);
                materialButtonM7087.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m7049(MaterialButton materialButton) {
        materialButton.f10091 = materialButton.getOpticalCenterShift();
        materialButton.m7058();
        materialButton.invalidate();
    }

    public void addOnCheckedChangeListener(InterfaceC3094 interfaceC3094) {
        this.f10111.add(interfaceC3094);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f10100)) {
            return (m7070() ? CompoundButton.class : Button.class).getName();
        }
        return this.f10100;
    }

    public int getAllowedWidthDecrease() {
        return this.f10088;
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
        if (m7061()) {
            return this.f10112.f10154;
        }
        return 0;
    }

    public C7676 getCornerSpringForce() {
        return this.f10112.f10137;
    }

    public Drawable getIcon() {
        return this.f10114;
    }

    public int getIconGravity() {
        return this.f10095;
    }

    public int getIconPadding() {
        return this.f10108;
    }

    public int getIconSize() {
        return this.f10099;
    }

    public ColorStateList getIconTint() {
        return this.f10113;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10116;
    }

    public int getInsetBottom() {
        return this.f10112.f10150;
    }

    public int getInsetLeft() {
        return this.f10112.f10135;
    }

    public int getInsetRight() {
        return this.f10112.f10134;
    }

    public int getInsetTop() {
        return this.f10112.f10151;
    }

    public ColorStateList getRippleColor() {
        if (m7061()) {
            return this.f10112.f10144;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f10102;
    }

    public int getSecondaryIconGravity() {
        return this.f10098;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f10103;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f10104;
    }

    public InterfaceC8643 getShapeAppearance() {
        if (m7061()) {
            return this.f10112.f10138;
        }
        C5919.m11250("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public C8648 getShapeAppearanceModel() {
        if (m7061()) {
            return this.f10112.f10138.mo14273();
        }
        C5919.m11250("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m7061()) {
            return this.f10112.f10145;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m7061()) {
            return this.f10112.f10155;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0195
    public ColorStateList getSupportBackgroundTintList() {
        return m7061() ? this.f10112.f10153 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0195
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m7061() ? this.f10112.f10152 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10105;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m7061()) {
            AbstractC6560.m12000(this, this.f10112.m7079(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m7070()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10086);
        }
        if (this.f10105) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10085);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f10105);
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m7070());
        accessibilityNodeInfo.setChecked(this.f10105);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m7057(getMeasuredWidth(), getMeasuredHeight());
        m7056(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f10097 != i6) {
            this.f10097 = i6;
            this.f10093 = -2.1474836E9f;
        }
        if (this.f10093 == -2.1474836E9f) {
            this.f10093 = getMeasuredWidth();
            if (this.f10089 == null && (getParent() instanceof AbstractC3098) && ((AbstractC3098) getParent()).getButtonSizeChange() != null) {
                this.f10089 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10089);
                layoutParams.width = (int) this.f10093;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f10088 == Integer.MIN_VALUE) {
            if (this.f10114 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f10099;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f10114.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f10088 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f10094 == Integer.MIN_VALUE) {
            this.f10094 = getPaddingStart();
        }
        if (this.f10090 == Integer.MIN_VALUE) {
            this.f10090 = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC3098) && ((AbstractC3098) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f10087 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6698);
        setChecked(savedState.f10123);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10123 = this.f10105;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m7057(getMeasuredWidth(), getMeasuredHeight());
        m7056(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f10112.f10140) {
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
        if (this.f10114 != null) {
            if (this.f10114.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(InterfaceC3094 interfaceC3094) {
        this.f10111.remove(interfaceC3094);
    }

    public void setA11yClassName(String str) {
        this.f10100 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m7061()) {
            super.setBackgroundColor(i);
            return;
        }
        C3097 c3097 = this.f10112;
        if (c3097.m7079(false) != null) {
            c3097.m7079(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m7061()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C3097 c3097 = this.f10112;
        c3097.f10146 = true;
        MaterialButton materialButton = c3097.f10139;
        materialButton.setSupportBackgroundTintList(c3097.f10153);
        materialButton.setSupportBackgroundTintMode(c3097.f10152);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0195, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC3054.m6607(getContext(), i) : null);
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
        if (m7061()) {
            this.f10112.f10141 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f10093 = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m7061()) {
            C3097 c3097 = this.f10112;
            if (c3097.f10147 && c3097.f10154 == i) {
                return;
            }
            c3097.f10154 = i;
            c3097.f10147 = true;
            c3097.f10138 = c3097.f10138.mo14276(i);
            c3097.m7076();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m7061()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C7676 c7676) {
        C3097 c3097 = this.f10112;
        c3097.f10137 = c7676;
        if (c3097.f10138 instanceof C8625) {
            c3097.m7076();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f10119 = Math.min(i, this.f10088);
        m7058();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m7061()) {
            this.f10112.m7079(false).m14322(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10114 == drawable || m7054(new RunnableC3096(this, drawable, 1))) {
            return;
        }
        this.f10093 = -2.1474836E9f;
        this.f10114 = drawable;
        m7053(true);
        m7057(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.f10095 != i) {
            if (this.f10114 != null && this.f10102 != null && m7052()) {
                C5919.m11249("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.f10095 = i;
                m7057(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f10108 != i) {
            this.f10108 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC3054.m6607(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C5919.m11249("iconSize cannot be less than 0");
            return;
        }
        if (this.f10099 == i || m7054(new RunnableC0876(this, i, 1))) {
            return;
        }
        this.f10093 = -2.1474836E9f;
        this.f10099 = i;
        m7053(true);
        m7055(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10113 != colorStateList) {
            this.f10113 = colorStateList;
            m7053(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10116 != mode) {
            this.f10116 = mode;
            m7053(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC7652.m12890(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C3097 c3097 = this.f10112;
        c3097.m7078(c3097.f10135, c3097.f10151, c3097.f10134, i);
    }

    public void setInsetLeft(int i) {
        C3097 c3097 = this.f10112;
        c3097.m7078(i, c3097.f10151, c3097.f10134, c3097.f10150);
    }

    public void setInsetRight(int i) {
        C3097 c3097 = this.f10112;
        c3097.m7078(c3097.f10135, c3097.f10151, i, c3097.f10150);
    }

    public void setInsetTop(int i) {
        C3097 c3097 = this.f10112;
        c3097.m7078(c3097.f10135, i, c3097.f10134, c3097.f10150);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC3093 interfaceC3093) {
        this.f10115 = interfaceC3093;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f10092 != z) {
            this.f10092 = z;
            C3097 c3097 = this.f10112;
            if (z) {
                c3097.setCornerSizeChangeListener(new C2358(this, 2));
            } else {
                c3097.setCornerSizeChangeListener(null);
            }
            post(new RunnableC1107(this, 3));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC3093 interfaceC3093 = this.f10115;
        if (interfaceC3093 != null) {
            ((MaterialButtonToggleGroup) ((C2242) interfaceC3093).f6536).invalidate();
        }
        super.setPressed(z);
        m7062(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m7061()) {
            C3097 c3097 = this.f10112;
            MaterialButton materialButton = c3097.f10139;
            if (c3097.f10144 != colorStateList) {
                c3097.f10144 = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC8658.m14332(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m7061()) {
            setRippleColor(AbstractC7652.m12890(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f10102 == drawable || m7054(new RunnableC3096(this, drawable, 0))) {
            return;
        }
        this.f10093 = -2.1474836E9f;
        this.f10102 = drawable;
        this.f10101 = false;
        m7055(true);
        m7056(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f10098 != i) {
            if (this.f10102 != null && this.f10114 != null && m7052()) {
                C5919.m11249("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.f10098 = i;
                m7056(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? AbstractC3054.m6607(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f10103 != colorStateList) {
            this.f10103 = colorStateList;
            m7055(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f10104 != mode) {
            this.f10104 = mode;
            m7055(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(AbstractC7652.m12890(getContext(), i));
    }

    public void setShapeAppearance(InterfaceC8643 interfaceC8643) {
        if (!m7061()) {
            C5919.m11250("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        C3097 c3097 = this.f10112;
        if (c3097.f10137 == null && interfaceC8643.mo14271()) {
            c3097.f10137 = AbstractC7738.m13026(getContext());
            if (c3097.f10138 instanceof C8625) {
                c3097.m7076();
            }
        }
        c3097.f10138 = interfaceC8643;
        c3097.m7076();
    }

    @Override // p305.InterfaceC8627
    public void setShapeAppearanceModel(C8648 c8648) {
        if (!m7061()) {
            C5919.m11250("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        C3097 c3097 = this.f10112;
        c3097.f10138 = c8648;
        c3097.m7076();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m7061()) {
            C3097 c3097 = this.f10112;
            c3097.f10149 = z;
            c3097.m7075();
        }
    }

    public void setSizeChange(C8630 c8630) {
        if (this.f10118 != c8630) {
            this.f10118 = c8630;
            m7062(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m7061()) {
            C3097 c3097 = this.f10112;
            if (c3097.f10145 != colorStateList) {
                c3097.f10145 = colorStateList;
                c3097.m7075();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m7061()) {
            setStrokeColor(AbstractC7652.m12890(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m7061()) {
            C3097 c3097 = this.f10112;
            if (c3097.f10155 != i) {
                c3097.f10155 = i;
                c3097.m7075();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m7061()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0195
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m7061()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C3097 c3097 = this.f10112;
        if (c3097.f10153 != colorStateList) {
            c3097.f10153 = colorStateList;
            if (c3097.m7079(false) != null) {
                c3097.m7079(false).setTintList(c3097.f10153);
            }
        }
    }

    @Override // androidx.appcompat.widget.C0195
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m7061()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C3097 c3097 = this.f10112;
        if (c3097.f10152 != mode) {
            c3097.f10152 = mode;
            if (c3097.m7079(false) == null || c3097.f10152 == null) {
                return;
            }
            c3097.m7079(false).setTintMode(c3097.f10152);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f10093 = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m7057(getMeasuredWidth(), getMeasuredHeight());
        m7056(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.C0195, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f10093 = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f10093 = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f10112.f10140 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f10093 = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(WidthChangeDirection widthChangeDirection) {
        if (this.f10121 != widthChangeDirection) {
            this.f10121 = widthChangeDirection;
            m7062(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f10117 != i) {
            this.f10117 = i;
            m7062(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10105);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7050(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f10114;
        if (drawable != null) {
            intrinsicWidth = this.f10099;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f10102;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f10099;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f10108) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7051(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7052() {
        if (m7068() && m7063()) {
            return true;
        }
        if (m7067() && m7059()) {
            return true;
        }
        return m7060() && m7064();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7053(boolean z) {
        Drawable drawable = this.f10114;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10114 = drawableMutate;
            drawableMutate.setTintList(this.f10113);
            PorterDuff.Mode mode = this.f10116;
            if (mode != null) {
                this.f10114.setTintMode(mode);
            }
            int intrinsicWidth = this.f10099;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10114.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10099;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10114.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10114;
            int i = this.f10110;
            int i2 = this.f10109;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10114.setVisible(true, z);
        }
        if (this.f10114 != null && this.f10102 != null && m7052()) {
            C5919.m11249("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.f10114 == null && this.f10102 != null && m7052()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7068() && compoundDrawablesRelative[0] != this.f10114) || (m7067() && compoundDrawablesRelative[2] != this.f10114) || (m7060() && compoundDrawablesRelative[1] != this.f10114);
        if (z || z2) {
            if (m7068()) {
                setCompoundDrawablesRelative(this.f10114, m7065(1), m7065(2), null);
            } else if (m7067()) {
                setCompoundDrawablesRelative(m7065(0), m7065(1), this.f10114, null);
            } else if (m7060()) {
                setCompoundDrawablesRelative(m7065(0), this.f10114, m7065(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7054(Runnable runnable) {
        C7677 c7677 = this.f10120;
        if (c7677 == null || !c7677.f20824) {
            return false;
        }
        post(new RunnableC0099(this, 3, runnable));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7055(boolean z) {
        Drawable drawable = this.f10102;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10102 = drawableMutate;
            drawableMutate.setTintList(this.f10103);
            PorterDuff.Mode mode = this.f10104;
            if (mode != null) {
                this.f10102.setTintMode(mode);
            }
            int intrinsicWidth = this.f10099;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10102.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10099;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10102.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10102;
            int i = this.f10107;
            int i2 = this.f10106;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10102.setVisible(true, z);
        }
        if (this.f10102 != null && this.f10114 != null && m7052()) {
            C5919.m11249("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f10102 == null) {
            if (this.f10101) {
                return;
            }
            if (this.f10114 != null && m7052()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7063() && compoundDrawablesRelative[0] != this.f10102) || (m7059() && compoundDrawablesRelative[2] != this.f10102) || (m7064() && compoundDrawablesRelative[1] != this.f10102);
        if (z || z2) {
            if (m7063()) {
                setCompoundDrawablesRelative(this.f10102, m7069(1), m7069(2), null);
            } else if (m7059()) {
                setCompoundDrawablesRelative(m7069(0), m7069(1), this.f10102, null);
            } else if (m7064()) {
                setCompoundDrawablesRelative(m7069(0), this.f10102, m7069(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7056(int i, int i2) {
        if (this.f10102 == null || getLayout() == null) {
            return;
        }
        if (m7063() || m7059()) {
            this.f10106 = 0;
            if (m7051(this.f10098)) {
                this.f10107 = 0;
                m7055(false);
                return;
            }
            int iM7050 = m7050(i, this.f10098);
            if (this.f10107 != iM7050) {
                this.f10107 = iM7050;
                m7055(false);
                return;
            }
            return;
        }
        if (m7064()) {
            this.f10107 = 0;
            if (this.f10098 == 16) {
                this.f10106 = 0;
                m7055(false);
                return;
            }
            int intrinsicHeight = this.f10099;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10102.getIntrinsicHeight();
            }
            int iM7066 = m7066(i2, intrinsicHeight);
            if (this.f10106 != iM7066) {
                this.f10106 = iM7066;
                m7055(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7057(int i, int i2) {
        if (this.f10114 == null || getLayout() == null) {
            return;
        }
        if (m7068() || m7067()) {
            this.f10109 = 0;
            if (m7051(this.f10095)) {
                this.f10110 = 0;
                m7053(false);
                return;
            }
            int iM7050 = m7050(i, this.f10095);
            if (this.f10110 != iM7050) {
                this.f10110 = iM7050;
                m7053(false);
                return;
            }
            return;
        }
        if (m7060()) {
            this.f10110 = 0;
            if (this.f10095 == 16) {
                this.f10109 = 0;
                m7053(false);
                return;
            }
            int intrinsicHeight = this.f10099;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10114.getIntrinsicHeight();
            }
            int iM7066 = m7066(i2, intrinsicHeight);
            if (this.f10109 != iM7066) {
                this.f10109 = iM7066;
                m7053(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7058() {
        int i = (int) (this.f10122 - this.f10119);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.f10091;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f10093 + i);
        }
        setPaddingRelative(this.f10094 + i3, getPaddingTop(), (this.f10090 + i) - i3, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m7059() {
        int i = this.f10098;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m7060() {
        int i = this.f10095;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7061() {
        C3097 c3097 = this.f10112;
        return (c3097 == null || c3097.f10146) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7062(boolean r9) {
        /*
            r8 = this;
            飘花落叶言楪苏兰世子哲.飘花落叶言子世苏楪哲兰 r0 = r8.f10118
            if (r0 != 0) goto L6
            goto La0
        L6:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r0 = r8.f10120
            if (r0 != 0) goto L1d
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r0 = new 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰
            com.google.android.material.button.飘花落叶言子楪世苏兰哲 r1 = com.google.android.material.button.MaterialButton.f10084
            r0.<init>(r8, r1)
            r8.f10120 = r0
            android.content.Context r1 = r8.getContext()
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = p175.AbstractC7738.m13026(r1)
            r0.f20855 = r1
        L1d:
            boolean r0 = r8.f10087
            if (r0 == 0) goto La0
            com.google.android.material.button.MaterialButton$WidthChangeDirection r0 = r8.f10121
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
            int r0 = r8.f10117
            goto L39
        L36:
            int r0 = r8.f10117
            int r0 = r0 / r3
        L39:
            飘花落叶言楪苏兰世子哲.飘花落叶言子世苏楪哲兰 r1 = r8.f10118
            int[] r3 = r8.getDrawableState()
            int[][] r4 = r1.f24225
            r5 = r2
        L42:
            int r6 = r1.f24227
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
            int[][] r4 = r1.f24225
            r5 = r2
        L5b:
            int r6 = r1.f24227
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
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏 r1 = r1.f24226
            goto L76
        L72:
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏[] r1 = r1.f24224
            r1 = r1[r5]
        L76:
            java.lang.Object r1 = r1.f22221
            飘花落叶言楪苏兰世子哲.飘花落叶言子世楪兰哲苏 r1 = (p305.C8624) r1
            int r3 = r8.getWidth()
            float r4 = r1.f24201
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r1 = r1.f24202
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
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r1 = r8.f10120
            float r0 = (float) r0
            r1.m12956(r0)
            if (r9 == 0) goto La0
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰 r8 = r8.f10120
            r8.m12955()
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.m7062(boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7063() {
        int i = this.f10098;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7064() {
        int i = this.f10098;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Drawable m7065(int i) {
        if (i == 0) {
            if (this.f10102 == null || !m7063()) {
                return null;
            }
            return this.f10102;
        }
        if (i == 1) {
            if (this.f10102 == null || !m7064()) {
                return null;
            }
            return this.f10102;
        }
        if (i == 2 && this.f10102 != null && m7059()) {
            return this.f10102;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7066(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.f10108) - getPaddingBottom()) / 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m7067() {
        int i = this.f10095;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7068() {
        int i = this.f10095;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Drawable m7069(int i) {
        if (i == 0) {
            if (this.f10114 == null || !m7068()) {
                return null;
            }
            return this.f10114;
        }
        if (i == 1) {
            if (this.f10114 == null || !m7067()) {
                return null;
            }
            return this.f10114;
        }
        if (i == 2 && this.f10114 != null && m7067()) {
            return this.f10114;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7070() {
        C3097 c3097 = this.f10112;
        return c3097 != null && c3097.f10141;
    }
}
