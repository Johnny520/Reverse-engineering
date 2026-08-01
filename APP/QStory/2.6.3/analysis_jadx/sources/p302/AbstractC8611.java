package p302;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.AbstractC3160;
import io.ktor.client.plugins.AbstractC3933;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p034.AbstractC6344;
import p034.AbstractC6347;
import p053.AbstractC6561;
import p162.AbstractC7653;
import p165.C7677;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p305.C8617;
import p305.C8640;
import p305.C8641;
import p305.C8643;
import p305.InterfaceC8619;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8611 extends CardView implements Checkable, InterfaceC8619 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f24180;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f24181;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f24182;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8609 f24183;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final int[] f24179 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f24178 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int[] f24177 = {com.davemorrissey.labs.subscaleview.R.attr.state_dragged};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final int[] f24176 = {R.attr.state_hovered};

    public AbstractC8611(Context context, AttributeSet attributeSet) {
        C8617 c8617M14288;
        super(AbstractC8267.m13830(com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CardView, context, attributeSet, new int[0]), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle);
        this.f24182 = false;
        this.f24180 = false;
        this.f24181 = true;
        TypedArray typedArrayM7182 = AbstractC3160.m7182(getContext(), attributeSet, AbstractC8661.f24430, com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C8609 c8609 = new C8609(this, attributeSet);
        this.f24183 = c8609;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C8643 c8643 = c8609.f24155;
        c8643.m14341(cardBackgroundColor);
        c8609.f24156.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c8609.m14284();
        AbstractC8611 abstractC8611 = c8609.f24157;
        ColorStateList colorStateListM13073 = AbstractC7739.m13073(abstractC8611.getContext(), typedArrayM7182, 11);
        c8609.f24168 = colorStateListM13073;
        if (colorStateListM13073 == null) {
            c8609.f24168 = ColorStateList.valueOf(-1);
        }
        c8609.f24174 = typedArrayM7182.getDimensionPixelSize(12, 0);
        boolean z = typedArrayM7182.getBoolean(0, false);
        c8609.f24158 = z;
        abstractC8611.setLongClickable(z);
        c8609.f24165 = AbstractC7739.m13073(abstractC8611.getContext(), typedArrayM7182, 6);
        c8609.m14282(AbstractC7739.m13076(abstractC8611.getContext(), typedArrayM7182, 2));
        c8609.f24171 = typedArrayM7182.getDimensionPixelSize(5, 0);
        c8609.f24152 = typedArrayM7182.getDimensionPixelSize(4, 0);
        c8609.f24170 = typedArrayM7182.getInteger(3, 8388661);
        ColorStateList colorStateListM130732 = AbstractC7739.m13073(abstractC8611.getContext(), typedArrayM7182, 7);
        c8609.f24173 = colorStateListM130732;
        if (colorStateListM130732 == null) {
            c8609.f24173 = ColorStateList.valueOf(AbstractC5062.m10026(abstractC8611.getContext(), AbstractC6561.m12059(abstractC8611, com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateListM130733 = AbstractC7739.m13073(abstractC8611.getContext(), typedArrayM7182, 1);
        colorStateListM130733 = colorStateListM130733 == null ? ColorStateList.valueOf(0) : colorStateListM130733;
        C8643 c86432 = c8609.f24154;
        c86432.m14341(colorStateListM130733);
        RippleDrawable rippleDrawable = c8609.f24169;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c8609.f24173);
        }
        c8643.m14340(abstractC8611.getCardElevation());
        float f = c8609.f24174;
        ColorStateList colorStateList = c8609.f24168;
        c86432.f24324.f24293 = f;
        c86432.invalidateSelf();
        C8641 c8641 = c86432.f24324;
        if (c8641.f24280 != colorStateList) {
            c8641.f24280 = colorStateList;
            c86432.onStateChange(c86432.getState());
        }
        abstractC8611.setBackgroundInternal(c8609.m14277(c8643));
        Drawable drawableM14278 = c8609.m14286() ? c8609.m14278() : c86432;
        c8609.f24175 = drawableM14278;
        abstractC8611.setForeground(c8609.m14277(drawableM14278));
        if (c8609.f24153 == -1.0f && (c8617M14288 = C8617.m14288(abstractC8611.getContext(), typedArrayM7182, 8)) != null) {
            C7677 c7677M11919 = AbstractC6347.m11919(abstractC8611.getContext());
            c8643.m14343(c7677M11919);
            c86432.m14343(c7677M11919);
            C8643 c86433 = c8609.f24167;
            if (c86433 != null) {
                c86433.m14343(c7677M11919);
            }
            c8609.m14281(c8617M14288);
        }
        typedArrayM7182.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24183.f24155.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f24183.f24155.f24324.f24281;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f24183.f24154.f24324.f24281;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f24183.f24172;
    }

    public int getCheckedIconGravity() {
        return this.f24183.f24170;
    }

    public int getCheckedIconMargin() {
        return this.f24183.f24152;
    }

    public int getCheckedIconSize() {
        return this.f24183.f24171;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24183.f24165;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f24183.f24156.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f24183.f24156.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f24183.f24156.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f24183.f24156.top;
    }

    public float getProgress() {
        return this.f24183.f24155.f24324.f24292;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f24183.f24155.m14346();
    }

    public ColorStateList getRippleColor() {
        return this.f24183.f24173;
    }

    public C8640 getShapeAppearanceModel() {
        return this.f24183.f24164.mo14292();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f24183.f24168;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f24183.f24168;
    }

    public int getStrokeWidth() {
        return this.f24183.f24174;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f24182;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8609 c8609 = this.f24183;
        c8609.m14283();
        AbstractC6344.m11869(this, c8609.f24155);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        C8609 c8609 = this.f24183;
        if (c8609 != null && c8609.f24158) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24179);
        }
        if (this.f24182) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24178);
        }
        if (this.f24180) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24177);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f24176);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f24182);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C8609 c8609 = this.f24183;
        accessibilityNodeInfo.setCheckable(c8609 != null && c8609.f24158);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f24182);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24183.m14276(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24181) {
            C8609 c8609 = this.f24183;
            if (!c8609.f24159) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c8609.f24159 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f24183.f24155.m14341(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C8609 c8609 = this.f24183;
        c8609.f24155.m14340(c8609.f24157.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C8643 c8643 = this.f24183.f24154;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c8643.m14341(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f24183.f24158 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f24182 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f24183.m14282(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C8609 c8609 = this.f24183;
        if (c8609.f24170 != i) {
            c8609.f24170 = i;
            AbstractC8611 abstractC8611 = c8609.f24157;
            c8609.m14276(abstractC8611.getMeasuredWidth(), abstractC8611.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f24183.f24152 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f24183.f24152 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f24183.m14282(AbstractC3933.m8312(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f24183.f24171 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f24183.f24171 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8609 c8609 = this.f24183;
        c8609.f24165 = colorStateList;
        Drawable drawable = c8609.f24172;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C8609 c8609 = this.f24183;
        if (c8609 != null) {
            c8609.m14283();
        }
    }

    public void setDragged(boolean z) {
        if (this.f24180 != z) {
            this.f24180 = z;
            refreshDrawableState();
            m14287();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f24183.m14280();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C8609 c8609 = this.f24183;
        c8609.m14280();
        c8609.m14284();
    }

    public void setProgress(float f) {
        C8609 c8609 = this.f24183;
        c8609.f24155.m14333(f);
        C8643 c8643 = c8609.f24154;
        if (c8643 != null) {
            c8643.m14333(f);
        }
        C8643 c86432 = c8609.f24167;
        if (c86432 != null) {
            c86432.m14333(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C8609 c8609 = this.f24183;
        c8609.f24153 = f;
        c8609.m14281(c8609.f24164.mo14292().mo14295(f));
        c8609.f24175.invalidateSelf();
        if (c8609.m14285() || (c8609.f24157.getPreventCornerOverlap() && !c8609.f24155.m14342())) {
            c8609.m14284();
        }
        if (c8609.m14285()) {
            c8609.m14280();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8609 c8609 = this.f24183;
        c8609.f24173 = colorStateList;
        RippleDrawable rippleDrawable = c8609.f24169;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM12919 = AbstractC7653.m12919(getContext(), i);
        C8609 c8609 = this.f24183;
        c8609.f24173 = colorStateListM12919;
        RippleDrawable rippleDrawable = c8609.f24169;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM12919);
        }
    }

    @Override // p305.InterfaceC8619
    public void setShapeAppearanceModel(C8640 c8640) {
        setClipToOutline(c8640.m14324(getBoundsAsRectF()));
        this.f24183.m14281(c8640);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C8609 c8609 = this.f24183;
        if (c8609.f24168 != colorStateList) {
            c8609.f24168 = colorStateList;
            C8643 c8643 = c8609.f24154;
            c8643.f24324.f24293 = c8609.f24174;
            c8643.invalidateSelf();
            C8641 c8641 = c8643.f24324;
            if (c8641.f24280 != colorStateList) {
                c8641.f24280 = colorStateList;
                c8643.onStateChange(c8643.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        C8609 c8609 = this.f24183;
        if (i != c8609.f24174) {
            c8609.f24174 = i;
            C8643 c8643 = c8609.f24154;
            ColorStateList colorStateList = c8609.f24168;
            c8643.f24324.f24293 = i;
            c8643.invalidateSelf();
            C8641 c8641 = c8643.f24324;
            if (c8641.f24280 != colorStateList) {
                c8641.f24280 = colorStateList;
                c8643.onStateChange(c8643.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C8609 c8609 = this.f24183;
        c8609.m14280();
        c8609.m14284();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C8609 c8609 = this.f24183;
        if (c8609 != null && c8609.f24158 && isEnabled()) {
            this.f24182 = !this.f24182;
            refreshDrawableState();
            m14287();
            c8609.m14275(this.f24182, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14287() {
        C8609 c8609 = this.f24183;
        RippleDrawable rippleDrawable = c8609.f24169;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            c8609.f24169.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c8609.f24169.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f24183.f24155.m14341(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC8612 interfaceC8612) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }
}
