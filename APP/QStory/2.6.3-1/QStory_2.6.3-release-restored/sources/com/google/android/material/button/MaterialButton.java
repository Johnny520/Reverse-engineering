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
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0946;
import androidx.appcompat.widget.C1042;
import androidx.compose.foundation.text.input.internal.RunnableC1714;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.core.view.C3075;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C3191;
import androidx.profileinstaller.AbstractC3275;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p178.AbstractC8482;
import p181.C8506;
import p181.C8507;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9445;
import p321.C9446;
import p321.C9451;
import p321.C9469;
import p321.C9472;
import p321.InterfaceC9448;
import p321.InterfaceC9464;
import p323.AbstractC9479;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C1042 implements Checkable, InterfaceC9448 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public boolean f10437;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10438;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public LinearLayout.LayoutParams f10439;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f10440;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f10441;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10442;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public float f10443;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10444;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10445;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10446;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int f10447;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f10448;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f10449;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f10450;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f10451;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public Drawable f10452;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10453;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public PorterDuff.Mode f10454;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10455;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f10456;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10457;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f10458;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10459;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10460;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashSet f10461;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3930 f10462;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ColorStateList f10463;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Drawable f10464;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC3926 f10465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f10466;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10467;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C9451 f10468;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10469;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C8507 f10470;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WidthChangeDirection f10471;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public float f10472;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final int[] f10436 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final int[] f10435 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final C3928 f10434 = new C3928();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3925();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public boolean f10473;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f10473 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10473 ? 1 : 0);
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
        super(AbstractC9096.m14389(C0328R.attr.materialButtonStyle, C0328R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{C0328R.attr.materialSizeOverlay}), attributeSet, C0328R.attr.materialButtonStyle);
        this.f10461 = new LinkedHashSet();
        this.f10455 = false;
        this.f10446 = false;
        this.f10447 = Integer.MIN_VALUE;
        this.f10443 = -2.1474836E9f;
        this.f10444 = Integer.MIN_VALUE;
        this.f10440 = Integer.MIN_VALUE;
        this.f10438 = Integer.MIN_VALUE;
        this.f10471 = WidthChangeDirection.BOTH;
        Context context2 = getContext();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24781, C0328R.attr.materialButtonStyle, C0328R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f10458 = typedArrayM7741.getDimensionPixelSize(13, 0);
        int i = typedArrayM7741.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f10466 = AbstractC3992.m7740(i, mode);
        this.f10463 = AbstractC8568.m13632(getContext(), typedArrayM7741, 15);
        this.f10464 = AbstractC8568.m13635(getContext(), typedArrayM7741, 11);
        this.f10445 = typedArrayM7741.getInteger(12, 1);
        this.f10449 = typedArrayM7741.getDimensionPixelSize(14, 0);
        this.f10454 = AbstractC3992.m7740(typedArrayM7741.getInt(22, -1), mode);
        this.f10453 = typedArrayM7741.hasValue(21) ? AbstractC8568.m13632(getContext(), typedArrayM7741, 21) : this.f10463;
        this.f10448 = typedArrayM7741.getInteger(20, 3);
        Drawable drawableM13635 = AbstractC8568.m13635(getContext(), typedArrayM7741, 19);
        this.f10452 = drawableM13635;
        this.f10451 = drawableM13635 == null;
        InterfaceC9464 interfaceC9464M14847 = C9446.m14847(context2, typedArrayM7741, 23);
        interfaceC9464M14847 = interfaceC9464M14847 == null ? C9469.m14880(context2, attributeSet, C0328R.attr.materialButtonStyle, C0328R.style.Widget_MaterialComponents_Button).m14878() : interfaceC9464M14847;
        boolean z = typedArrayM7741.getBoolean(17, false);
        C3930 c3930 = new C3930(this, interfaceC9464M14847);
        this.f10462 = c3930;
        c3930.f10485 = typedArrayM7741.getDimensionPixelOffset(2, 0);
        c3930.f10484 = typedArrayM7741.getDimensionPixelOffset(3, 0);
        c3930.f10501 = typedArrayM7741.getDimensionPixelOffset(4, 0);
        c3930.f10500 = typedArrayM7741.getDimensionPixelOffset(5, 0);
        if (typedArrayM7741.hasValue(9)) {
            int dimensionPixelSize = typedArrayM7741.getDimensionPixelSize(9, -1);
            c3930.f10504 = dimensionPixelSize;
            c3930.f10488 = c3930.f10488.mo14854(dimensionPixelSize);
            c3930.m7622();
            c3930.f10497 = true;
        }
        c3930.f10505 = typedArrayM7741.getDimensionPixelSize(26, 0);
        c3930.f10502 = AbstractC3992.m7740(typedArrayM7741.getInt(8, -1), mode);
        c3930.f10503 = AbstractC8568.m13632(getContext(), typedArrayM7741, 7);
        c3930.f10495 = AbstractC8568.m13632(getContext(), typedArrayM7741, 25);
        c3930.f10494 = AbstractC8568.m13632(getContext(), typedArrayM7741, 18);
        c3930.f10491 = typedArrayM7741.getBoolean(6, false);
        c3930.f10493 = typedArrayM7741.getDimensionPixelSize(10, 0);
        c3930.f10490 = typedArrayM7741.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM7741.hasValue(0)) {
            c3930.f10496 = true;
            setSupportBackgroundTintList(c3930.f10503);
            setSupportBackgroundTintMode(c3930.f10502);
        } else {
            c3930.m7623();
        }
        setPaddingRelative(paddingStart + c3930.f10485, paddingTop + c3930.f10501, paddingEnd + c3930.f10484, paddingBottom + c3930.f10500);
        setCheckedInternal(typedArrayM7741.getBoolean(1, false));
        if (interfaceC9464M14847 instanceof C9446) {
            c3930.f10487 = AbstractC7176.m12478(getContext());
            if (c3930.f10488 instanceof C9446) {
                c3930.m7622();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayM7741.recycle();
        setCompoundDrawablePadding(this.f10458);
        m7599(this.f10464 != null);
        m7601(this.f10452 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f10472;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C9472 c9472M7625;
        if (this.f10442 && this.f10437 && (c9472M7625 = this.f10462.m7625(false)) != null) {
            return (int) (c9472M7625.m14903() * 0.11f);
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
        if (!m7616() || this.f10455 == z) {
            return;
        }
        this.f10455 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f10455;
            if (!materialButtonToggleGroup.f10476) {
                materialButtonToggleGroup.m7618(getId(), z2);
            }
        }
        if (this.f10446) {
            return;
        }
        this.f10446 = true;
        Iterator it = this.f10461.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
        this.f10446 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.f10472 != f) {
            this.f10472 = f;
            m7604();
            invalidate();
            if (getParent() instanceof AbstractC3931) {
                AbstractC3931 abstractC3931 = (AbstractC3931) getParent();
                int i = (int) this.f10472;
                int iIndexOfChild = abstractC3931.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonM7632 = abstractC3931.m7632(iIndexOfChild);
                MaterialButton materialButtonM7633 = abstractC3931.m7633(iIndexOfChild);
                if (materialButtonM7632 == null && materialButtonM7633 == null) {
                    return;
                }
                if (materialButtonM7632 == null) {
                    materialButtonM7633.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7633 == null) {
                    materialButtonM7632.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM7632 == null || materialButtonM7633 == null) {
                    return;
                }
                materialButtonM7632.setDisplayedWidthDecrease(i / 2);
                materialButtonM7633.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m7595(MaterialButton materialButton) {
        materialButton.f10441 = materialButton.getOpticalCenterShift();
        materialButton.m7604();
        materialButton.invalidate();
    }

    public void addOnCheckedChangeListener(InterfaceC3927 interfaceC3927) {
        this.f10461.add(interfaceC3927);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f10450)) {
            return (m7616() ? CompoundButton.class : Button.class).getName();
        }
        return this.f10450;
    }

    public int getAllowedWidthDecrease() {
        return this.f10438;
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
        if (m7607()) {
            return this.f10462.f10504;
        }
        return 0;
    }

    public C8506 getCornerSpringForce() {
        return this.f10462.f10487;
    }

    public Drawable getIcon() {
        return this.f10464;
    }

    public int getIconGravity() {
        return this.f10445;
    }

    public int getIconPadding() {
        return this.f10458;
    }

    public int getIconSize() {
        return this.f10449;
    }

    public ColorStateList getIconTint() {
        return this.f10463;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10466;
    }

    public int getInsetBottom() {
        return this.f10462.f10500;
    }

    public int getInsetLeft() {
        return this.f10462.f10485;
    }

    public int getInsetRight() {
        return this.f10462.f10484;
    }

    public int getInsetTop() {
        return this.f10462.f10501;
    }

    public ColorStateList getRippleColor() {
        if (m7607()) {
            return this.f10462.f10494;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f10452;
    }

    public int getSecondaryIconGravity() {
        return this.f10448;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f10453;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f10454;
    }

    public InterfaceC9464 getShapeAppearance() {
        if (m7607()) {
            return this.f10462.f10488;
        }
        C6755.m11870("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public C9469 getShapeAppearanceModel() {
        if (m7607()) {
            return this.f10462.f10488.mo14851();
        }
        C6755.m11870("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m7607()) {
            return this.f10462.f10495;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m7607()) {
            return this.f10462.f10505;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C1042
    public ColorStateList getSupportBackgroundTintList() {
        return m7607() ? this.f10462.f10503 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C1042
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m7607() ? this.f10462.f10502 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10455;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m7607()) {
            AbstractC7173.m12428(this, this.f10462.m7625(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m7616()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10436);
        }
        if (this.f10455) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10435);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C1042, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f10455);
    }

    @Override // androidx.appcompat.widget.C1042, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m7616());
        accessibilityNodeInfo.setChecked(this.f10455);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C1042, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m7603(getMeasuredWidth(), getMeasuredHeight());
        m7602(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f10447 != i6) {
            this.f10447 = i6;
            this.f10443 = -2.1474836E9f;
        }
        if (this.f10443 == -2.1474836E9f) {
            this.f10443 = getMeasuredWidth();
            if (this.f10439 == null && (getParent() instanceof AbstractC3931) && ((AbstractC3931) getParent()).getButtonSizeChange() != null) {
                this.f10439 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10439);
                layoutParams.width = (int) this.f10443;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f10438 == Integer.MIN_VALUE) {
            if (this.f10464 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f10449;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f10464.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f10438 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f10444 == Integer.MIN_VALUE) {
            this.f10444 = getPaddingStart();
        }
        if (this.f10440 == Integer.MIN_VALUE) {
            this.f10440 = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC3931) && ((AbstractC3931) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f10437 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f7044);
        setChecked(savedState.f10473);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10473 = this.f10455;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C1042, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m7603(getMeasuredWidth(), getMeasuredHeight());
        m7602(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f10462.f10490) {
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
        if (this.f10464 != null) {
            if (this.f10464.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(InterfaceC3927 interfaceC3927) {
        this.f10461.remove(interfaceC3927);
    }

    public void setA11yClassName(String str) {
        this.f10450 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m7607()) {
            super.setBackgroundColor(i);
            return;
        }
        C3930 c3930 = this.f10462;
        if (c3930.m7625(false) != null) {
            c3930.m7625(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.C1042, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m7607()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C3930 c3930 = this.f10462;
        c3930.f10496 = true;
        MaterialButton materialButton = c3930.f10489;
        materialButton.setSupportBackgroundTintList(c3930.f10503);
        materialButton.setSupportBackgroundTintMode(c3930.f10502);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C1042, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC4765.m8871(getContext(), i) : null);
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
        if (m7607()) {
            this.f10462.f10491 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f10443 = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m7607()) {
            C3930 c3930 = this.f10462;
            if (c3930.f10497 && c3930.f10504 == i) {
                return;
            }
            c3930.f10504 = i;
            c3930.f10497 = true;
            c3930.f10488 = c3930.f10488.mo14854(i);
            c3930.m7622();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m7607()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C8506 c8506) {
        C3930 c3930 = this.f10462;
        c3930.f10487 = c8506;
        if (c3930.f10488 instanceof C9446) {
            c3930.m7622();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f10469 = Math.min(i, this.f10438);
        m7604();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m7607()) {
            this.f10462.m7625(false).m14899(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10464 == drawable || m7600(new RunnableC3929(this, drawable, 1))) {
            return;
        }
        this.f10443 = -2.1474836E9f;
        this.f10464 = drawable;
        m7599(true);
        m7603(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.f10445 != i) {
            if (this.f10464 != null && this.f10452 != null && m7598()) {
                C6755.m11869("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.f10445 = i;
                m7603(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f10458 != i) {
            this.f10458 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC4765.m8871(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C6755.m11869("iconSize cannot be less than 0");
            return;
        }
        if (this.f10449 == i || m7600(new RunnableC1714(this, i, 1))) {
            return;
        }
        this.f10443 = -2.1474836E9f;
        this.f10449 = i;
        m7599(true);
        m7601(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10463 != colorStateList) {
            this.f10463 = colorStateList;
            m7599(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10466 != mode) {
            this.f10466 = mode;
            m7599(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC8482.m13478(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C3930 c3930 = this.f10462;
        c3930.m7624(c3930.f10485, c3930.f10501, c3930.f10484, i);
    }

    public void setInsetLeft(int i) {
        C3930 c3930 = this.f10462;
        c3930.m7624(i, c3930.f10501, c3930.f10484, c3930.f10500);
    }

    public void setInsetRight(int i) {
        C3930 c3930 = this.f10462;
        c3930.m7624(c3930.f10485, c3930.f10501, i, c3930.f10500);
    }

    public void setInsetTop(int i) {
        C3930 c3930 = this.f10462;
        c3930.m7624(c3930.f10485, i, c3930.f10484, c3930.f10500);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC3926 interfaceC3926) {
        this.f10465 = interfaceC3926;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f10442 != z) {
            this.f10442 = z;
            C3930 c3930 = this.f10462;
            if (z) {
                c3930.setCornerSizeChangeListener(new C3191(this, 2));
            } else {
                c3930.setCornerSizeChangeListener(null);
            }
            post(new RunnableC1945(this, 3));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC3926 interfaceC3926 = this.f10465;
        if (interfaceC3926 != null) {
            ((MaterialButtonToggleGroup) ((C3075) interfaceC3926).f6882).invalidate();
        }
        super.setPressed(z);
        m7608(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m7607()) {
            C3930 c3930 = this.f10462;
            MaterialButton materialButton = c3930.f10489;
            if (c3930.f10494 != colorStateList) {
                c3930.f10494 = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC9479.m14909(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m7607()) {
            setRippleColor(AbstractC8482.m13478(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f10452 == drawable || m7600(new RunnableC3929(this, drawable, 0))) {
            return;
        }
        this.f10443 = -2.1474836E9f;
        this.f10452 = drawable;
        this.f10451 = false;
        m7601(true);
        m7602(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f10448 != i) {
            if (this.f10452 != null && this.f10464 != null && m7598()) {
                C6755.m11869("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.f10448 = i;
                m7602(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? AbstractC4765.m8871(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f10453 != colorStateList) {
            this.f10453 = colorStateList;
            m7601(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f10454 != mode) {
            this.f10454 = mode;
            m7601(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(AbstractC8482.m13478(getContext(), i));
    }

    public void setShapeAppearance(InterfaceC9464 interfaceC9464) {
        if (!m7607()) {
            C6755.m11870("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        C3930 c3930 = this.f10462;
        if (c3930.f10487 == null && interfaceC9464.mo14849()) {
            c3930.f10487 = AbstractC7176.m12478(getContext());
            if (c3930.f10488 instanceof C9446) {
                c3930.m7622();
            }
        }
        c3930.f10488 = interfaceC9464;
        c3930.m7622();
    }

    @Override // p321.InterfaceC9448
    public void setShapeAppearanceModel(C9469 c9469) {
        if (!m7607()) {
            C6755.m11870("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        C3930 c3930 = this.f10462;
        c3930.f10488 = c9469;
        c3930.m7622();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m7607()) {
            C3930 c3930 = this.f10462;
            c3930.f10499 = z;
            c3930.m7621();
        }
    }

    public void setSizeChange(C9451 c9451) {
        if (this.f10468 != c9451) {
            this.f10468 = c9451;
            m7608(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m7607()) {
            C3930 c3930 = this.f10462;
            if (c3930.f10495 != colorStateList) {
                c3930.f10495 = colorStateList;
                c3930.m7621();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m7607()) {
            setStrokeColor(AbstractC8482.m13478(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m7607()) {
            C3930 c3930 = this.f10462;
            if (c3930.f10505 != i) {
                c3930.f10505 = i;
                c3930.m7621();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m7607()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C1042
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m7607()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C3930 c3930 = this.f10462;
        if (c3930.f10503 != colorStateList) {
            c3930.f10503 = colorStateList;
            if (c3930.m7625(false) != null) {
                c3930.m7625(false).setTintList(c3930.f10503);
            }
        }
    }

    @Override // androidx.appcompat.widget.C1042
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m7607()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C3930 c3930 = this.f10462;
        if (c3930.f10502 != mode) {
            c3930.f10502 = mode;
            if (c3930.m7625(false) == null || c3930.f10502 == null) {
                return;
            }
            c3930.m7625(false).setTintMode(c3930.f10502);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f10443 = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m7603(getMeasuredWidth(), getMeasuredHeight());
        m7602(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.C1042, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f10443 = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f10443 = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f10462.f10490 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f10443 = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(WidthChangeDirection widthChangeDirection) {
        if (this.f10471 != widthChangeDirection) {
            this.f10471 = widthChangeDirection;
            m7608(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f10467 != i) {
            this.f10467 = i;
            m7608(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10455);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7596(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f10464;
        if (drawable != null) {
            intrinsicWidth = this.f10449;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f10452;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f10449;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f10458) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7597(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7598() {
        if (m7614() && m7609()) {
            return true;
        }
        if (m7613() && m7605()) {
            return true;
        }
        return m7606() && m7610();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7599(boolean z) {
        Drawable drawable = this.f10464;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10464 = drawableMutate;
            drawableMutate.setTintList(this.f10463);
            PorterDuff.Mode mode = this.f10466;
            if (mode != null) {
                this.f10464.setTintMode(mode);
            }
            int intrinsicWidth = this.f10449;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10464.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10449;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10464.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10464;
            int i = this.f10460;
            int i2 = this.f10459;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10464.setVisible(true, z);
        }
        if (this.f10464 != null && this.f10452 != null && m7598()) {
            C6755.m11869("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.f10464 == null && this.f10452 != null && m7598()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7614() && compoundDrawablesRelative[0] != this.f10464) || (m7613() && compoundDrawablesRelative[2] != this.f10464) || (m7606() && compoundDrawablesRelative[1] != this.f10464);
        if (z || z2) {
            if (m7614()) {
                setCompoundDrawablesRelative(this.f10464, m7611(1), m7611(2), null);
            } else if (m7613()) {
                setCompoundDrawablesRelative(m7611(0), m7611(1), this.f10464, null);
            } else if (m7606()) {
                setCompoundDrawablesRelative(m7611(0), this.f10464, m7611(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7600(Runnable runnable) {
        C8507 c8507 = this.f10470;
        if (c8507 == null || !c8507.f21164) {
            return false;
        }
        post(new RunnableC0946(this, 3, runnable));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7601(boolean z) {
        Drawable drawable = this.f10452;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f10452 = drawableMutate;
            drawableMutate.setTintList(this.f10453);
            PorterDuff.Mode mode = this.f10454;
            if (mode != null) {
                this.f10452.setTintMode(mode);
            }
            int intrinsicWidth = this.f10449;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10452.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10449;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10452.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10452;
            int i = this.f10457;
            int i2 = this.f10456;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f10452.setVisible(true, z);
        }
        if (this.f10452 != null && this.f10464 != null && m7598()) {
            C6755.m11869("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f10452 == null) {
            if (this.f10451) {
                return;
            }
            if (this.f10464 != null && m7598()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m7609() && compoundDrawablesRelative[0] != this.f10452) || (m7605() && compoundDrawablesRelative[2] != this.f10452) || (m7610() && compoundDrawablesRelative[1] != this.f10452);
        if (z || z2) {
            if (m7609()) {
                setCompoundDrawablesRelative(this.f10452, m7615(1), m7615(2), null);
            } else if (m7605()) {
                setCompoundDrawablesRelative(m7615(0), m7615(1), this.f10452, null);
            } else if (m7610()) {
                setCompoundDrawablesRelative(m7615(0), this.f10452, m7615(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m7602(int i, int i2) {
        if (this.f10452 == null || getLayout() == null) {
            return;
        }
        if (m7609() || m7605()) {
            this.f10456 = 0;
            if (m7597(this.f10448)) {
                this.f10457 = 0;
                m7601(false);
                return;
            }
            int iM7596 = m7596(i, this.f10448);
            if (this.f10457 != iM7596) {
                this.f10457 = iM7596;
                m7601(false);
                return;
            }
            return;
        }
        if (m7610()) {
            this.f10457 = 0;
            if (this.f10448 == 16) {
                this.f10456 = 0;
                m7601(false);
                return;
            }
            int intrinsicHeight = this.f10449;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10452.getIntrinsicHeight();
            }
            int iM7612 = m7612(i2, intrinsicHeight);
            if (this.f10456 != iM7612) {
                this.f10456 = iM7612;
                m7601(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7603(int i, int i2) {
        if (this.f10464 == null || getLayout() == null) {
            return;
        }
        if (m7614() || m7613()) {
            this.f10459 = 0;
            if (m7597(this.f10445)) {
                this.f10460 = 0;
                m7599(false);
                return;
            }
            int iM7596 = m7596(i, this.f10445);
            if (this.f10460 != iM7596) {
                this.f10460 = iM7596;
                m7599(false);
                return;
            }
            return;
        }
        if (m7606()) {
            this.f10460 = 0;
            if (this.f10445 == 16) {
                this.f10459 = 0;
                m7599(false);
                return;
            }
            int intrinsicHeight = this.f10449;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10464.getIntrinsicHeight();
            }
            int iM7612 = m7612(i2, intrinsicHeight);
            if (this.f10459 != iM7612) {
                this.f10459 = iM7612;
                m7599(false);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7604() {
        int i = (int) (this.f10472 - this.f10469);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.f10441;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f10443 + i);
        }
        setPaddingRelative(this.f10444 + i3, getPaddingTop(), (this.f10440 + i) - i3, getPaddingBottom());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m7605() {
        int i = this.f10448;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m7606() {
        int i = this.f10445;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m7607() {
        C3930 c3930 = this.f10462;
        return (c3930 == null || c3930.f10496) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7608(boolean z) {
        int i;
        if (this.f10468 == null) {
            return;
        }
        if (this.f10470 == null) {
            C8507 c8507 = new C8507(this, f10434);
            this.f10470 = c8507;
            c8507.f21195 = AbstractC7176.m12478(getContext());
        }
        if (!this.f10437) {
            return;
        }
        int iOrdinal = this.f10471.ordinal();
        int i2 = 0;
        int i3 = (iOrdinal == 1 || iOrdinal == 2) ? this.f10467 / 2 : iOrdinal != 3 ? 0 : this.f10467;
        C9451 c9451 = this.f10468;
        int[] drawableState = getDrawableState();
        int[][] iArr = c9451.f24561;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= c9451.f24563) {
                i4 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            int[] iArr2 = StateSet.WILD_CARD;
            int[][] iArr3 = c9451.f24561;
            int i5 = 0;
            while (true) {
                if (i5 >= c9451.f24563) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            i4 = i;
        }
        C9445 c9445 = (C9445) (i4 < 0 ? c9451.f24562 : c9451.f24560[i4]).f22564;
        int width = getWidth();
        float f = c9445.f24537;
        StateListSizeChange$SizeChangeType stateListSizeChange$SizeChangeType = c9445.f24538;
        if (stateListSizeChange$SizeChangeType != StateListSizeChange$SizeChangeType.PERCENT) {
            if (stateListSizeChange$SizeChangeType == StateListSizeChange$SizeChangeType.PIXELS) {
            }
            this.f10470.m13544(Math.min(i3, i2));
            if (z) {
                return;
            }
            this.f10470.m13543();
            return;
        }
        f *= width;
        i2 = (int) f;
        this.f10470.m13544(Math.min(i3, i2));
        if (z) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7609() {
        int i = this.f10448;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m7610() {
        int i = this.f10448;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Drawable m7611(int i) {
        if (i == 0) {
            if (this.f10452 == null || !m7609()) {
                return null;
            }
            return this.f10452;
        }
        if (i == 1) {
            if (this.f10452 == null || !m7610()) {
                return null;
            }
            return this.f10452;
        }
        if (i == 2 && this.f10452 != null && m7605()) {
            return this.f10452;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7612(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.f10458) - getPaddingBottom()) / 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m7613() {
        int i = this.f10445;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7614() {
        int i = this.f10445;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Drawable m7615(int i) {
        if (i == 0) {
            if (this.f10464 == null || !m7614()) {
                return null;
            }
            return this.f10464;
        }
        if (i == 1) {
            if (this.f10464 == null || !m7613()) {
                return null;
            }
            return this.f10464;
        }
        if (i == 2 && this.f10464 != null && m7613()) {
            return this.f10464;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m7616() {
        C3930 c3930 = this.f10462;
        return c3930 != null && c3930.f10491;
    }
}
