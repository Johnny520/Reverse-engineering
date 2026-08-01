package p318;

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
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import io.ktor.client.plugins.AbstractC4765;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p069.AbstractC7390;
import p178.AbstractC8482;
import p181.C8506;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9446;
import p321.C9469;
import p321.C9470;
import p321.C9472;
import p321.InterfaceC9448;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9440 extends CardView implements Checkable, InterfaceC9448 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f24525;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f24526;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f24527;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C9438 f24528;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final int[] f24524 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f24523 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int[] f24522 = {C0328R.attr.state_dragged};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final int[] f24521 = {R.attr.state_hovered};

    public AbstractC9440(Context context, AttributeSet attributeSet) {
        C9446 c9446M14847;
        super(AbstractC9096.m14389(C0328R.attr.materialCardViewStyle, C0328R.style.Widget_MaterialComponents_CardView, context, attributeSet, new int[0]), attributeSet, C0328R.attr.materialCardViewStyle);
        this.f24527 = false;
        this.f24525 = false;
        this.f24526 = true;
        TypedArray typedArrayM7741 = AbstractC3992.m7741(getContext(), attributeSet, AbstractC9490.f24775, C0328R.attr.materialCardViewStyle, C0328R.style.Widget_MaterialComponents_CardView, new int[0]);
        C9438 c9438 = new C9438(this, attributeSet);
        this.f24528 = c9438;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C9472 c9472 = c9438.f24500;
        c9472.m14900(cardBackgroundColor);
        c9438.f24501.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c9438.m14843();
        AbstractC9440 abstractC9440 = c9438.f24502;
        ColorStateList colorStateListM13632 = AbstractC8568.m13632(abstractC9440.getContext(), typedArrayM7741, 11);
        c9438.f24513 = colorStateListM13632;
        if (colorStateListM13632 == null) {
            c9438.f24513 = ColorStateList.valueOf(-1);
        }
        c9438.f24519 = typedArrayM7741.getDimensionPixelSize(12, 0);
        boolean z = typedArrayM7741.getBoolean(0, false);
        c9438.f24503 = z;
        abstractC9440.setLongClickable(z);
        c9438.f24510 = AbstractC8568.m13632(abstractC9440.getContext(), typedArrayM7741, 6);
        c9438.m14841(AbstractC8568.m13635(abstractC9440.getContext(), typedArrayM7741, 2));
        c9438.f24516 = typedArrayM7741.getDimensionPixelSize(5, 0);
        c9438.f24497 = typedArrayM7741.getDimensionPixelSize(4, 0);
        c9438.f24515 = typedArrayM7741.getInteger(3, 8388661);
        ColorStateList colorStateListM136322 = AbstractC8568.m13632(abstractC9440.getContext(), typedArrayM7741, 7);
        c9438.f24518 = colorStateListM136322;
        if (colorStateListM136322 == null) {
            c9438.f24518 = ColorStateList.valueOf(AbstractC5894.m10585(abstractC9440.getContext(), AbstractC7390.m12618(abstractC9440, C0328R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateListM136323 = AbstractC8568.m13632(abstractC9440.getContext(), typedArrayM7741, 1);
        colorStateListM136323 = colorStateListM136323 == null ? ColorStateList.valueOf(0) : colorStateListM136323;
        C9472 c94722 = c9438.f24499;
        c94722.m14900(colorStateListM136323);
        RippleDrawable rippleDrawable = c9438.f24514;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c9438.f24518);
        }
        c9472.m14899(abstractC9440.getCardElevation());
        float f = c9438.f24519;
        ColorStateList colorStateList = c9438.f24513;
        c94722.f24669.f24638 = f;
        c94722.invalidateSelf();
        C9470 c9470 = c94722.f24669;
        if (c9470.f24625 != colorStateList) {
            c9470.f24625 = colorStateList;
            c94722.onStateChange(c94722.getState());
        }
        abstractC9440.setBackgroundInternal(c9438.m14836(c9472));
        Drawable drawableM14837 = c9438.m14845() ? c9438.m14837() : c94722;
        c9438.f24520 = drawableM14837;
        abstractC9440.setForeground(c9438.m14836(drawableM14837));
        if (c9438.f24498 == -1.0f && (c9446M14847 = C9446.m14847(abstractC9440.getContext(), typedArrayM7741, 8)) != null) {
            C8506 c8506M12478 = AbstractC7176.m12478(abstractC9440.getContext());
            c9472.m14902(c8506M12478);
            c94722.m14902(c8506M12478);
            C9472 c94723 = c9438.f24512;
            if (c94723 != null) {
                c94723.m14902(c8506M12478);
            }
            c9438.m14840(c9446M14847);
        }
        typedArrayM7741.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24528.f24500.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f24528.f24500.f24669.f24626;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f24528.f24499.f24669.f24626;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f24528.f24517;
    }

    public int getCheckedIconGravity() {
        return this.f24528.f24515;
    }

    public int getCheckedIconMargin() {
        return this.f24528.f24497;
    }

    public int getCheckedIconSize() {
        return this.f24528.f24516;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24528.f24510;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f24528.f24501.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f24528.f24501.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f24528.f24501.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f24528.f24501.top;
    }

    public float getProgress() {
        return this.f24528.f24500.f24669.f24637;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f24528.f24500.m14905();
    }

    public ColorStateList getRippleColor() {
        return this.f24528.f24518;
    }

    public C9469 getShapeAppearanceModel() {
        return this.f24528.f24509.mo14851();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f24528.f24513;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f24528.f24513;
    }

    public int getStrokeWidth() {
        return this.f24528.f24519;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f24527;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9438 c9438 = this.f24528;
        c9438.m14842();
        AbstractC7173.m12428(this, c9438.f24500);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        C9438 c9438 = this.f24528;
        if (c9438 != null && c9438.f24503) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24524);
        }
        if (this.f24527) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24523);
        }
        if (this.f24525) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24522);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f24521);
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
        accessibilityEvent.setChecked(this.f24527);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C9438 c9438 = this.f24528;
        accessibilityNodeInfo.setCheckable(c9438 != null && c9438.f24503);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f24527);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24528.m14835(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24526) {
            C9438 c9438 = this.f24528;
            if (!c9438.f24504) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c9438.f24504 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f24528.f24500.m14900(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C9438 c9438 = this.f24528;
        c9438.f24500.m14899(c9438.f24502.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C9472 c9472 = this.f24528.f24499;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c9472.m14900(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f24528.f24503 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f24527 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f24528.m14841(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C9438 c9438 = this.f24528;
        if (c9438.f24515 != i) {
            c9438.f24515 = i;
            AbstractC9440 abstractC9440 = c9438.f24502;
            c9438.m14835(abstractC9440.getMeasuredWidth(), abstractC9440.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f24528.f24497 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f24528.f24497 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f24528.m14841(AbstractC4765.m8871(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f24528.f24516 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f24528.f24516 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C9438 c9438 = this.f24528;
        c9438.f24510 = colorStateList;
        Drawable drawable = c9438.f24517;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C9438 c9438 = this.f24528;
        if (c9438 != null) {
            c9438.m14842();
        }
    }

    public void setDragged(boolean z) {
        if (this.f24525 != z) {
            this.f24525 = z;
            refreshDrawableState();
            m14846();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f24528.m14839();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C9438 c9438 = this.f24528;
        c9438.m14839();
        c9438.m14843();
    }

    public void setProgress(float f) {
        C9438 c9438 = this.f24528;
        c9438.f24500.m14892(f);
        C9472 c9472 = c9438.f24499;
        if (c9472 != null) {
            c9472.m14892(f);
        }
        C9472 c94722 = c9438.f24512;
        if (c94722 != null) {
            c94722.m14892(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C9438 c9438 = this.f24528;
        c9438.f24498 = f;
        c9438.m14840(c9438.f24509.mo14851().mo14854(f));
        c9438.f24520.invalidateSelf();
        if (c9438.m14844() || (c9438.f24502.getPreventCornerOverlap() && !c9438.f24500.m14901())) {
            c9438.m14843();
        }
        if (c9438.m14844()) {
            c9438.m14839();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C9438 c9438 = this.f24528;
        c9438.f24518 = colorStateList;
        RippleDrawable rippleDrawable = c9438.f24514;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM13478 = AbstractC8482.m13478(getContext(), i);
        C9438 c9438 = this.f24528;
        c9438.f24518 = colorStateListM13478;
        RippleDrawable rippleDrawable = c9438.f24514;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM13478);
        }
    }

    @Override // p321.InterfaceC9448
    public void setShapeAppearanceModel(C9469 c9469) {
        setClipToOutline(c9469.m14883(getBoundsAsRectF()));
        this.f24528.m14840(c9469);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C9438 c9438 = this.f24528;
        if (c9438.f24513 != colorStateList) {
            c9438.f24513 = colorStateList;
            C9472 c9472 = c9438.f24499;
            c9472.f24669.f24638 = c9438.f24519;
            c9472.invalidateSelf();
            C9470 c9470 = c9472.f24669;
            if (c9470.f24625 != colorStateList) {
                c9470.f24625 = colorStateList;
                c9472.onStateChange(c9472.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        C9438 c9438 = this.f24528;
        if (i != c9438.f24519) {
            c9438.f24519 = i;
            C9472 c9472 = c9438.f24499;
            ColorStateList colorStateList = c9438.f24513;
            c9472.f24669.f24638 = i;
            c9472.invalidateSelf();
            C9470 c9470 = c9472.f24669;
            if (c9470.f24625 != colorStateList) {
                c9470.f24625 = colorStateList;
                c9472.onStateChange(c9472.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C9438 c9438 = this.f24528;
        c9438.m14839();
        c9438.m14843();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C9438 c9438 = this.f24528;
        if (c9438 != null && c9438.f24503 && isEnabled()) {
            this.f24527 = !this.f24527;
            refreshDrawableState();
            m14846();
            c9438.m14834(this.f24527, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14846() {
        C9438 c9438 = this.f24528;
        RippleDrawable rippleDrawable = c9438.f24514;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            c9438.f24514.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c9438.f24514.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f24528.f24500.m14900(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC9441 interfaceC9441) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }
}
