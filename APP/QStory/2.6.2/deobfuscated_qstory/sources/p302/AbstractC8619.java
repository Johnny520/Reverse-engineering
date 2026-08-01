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
import com.bumptech.glide.AbstractC3054;
import com.google.android.material.internal.AbstractC3159;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p053.AbstractC6560;
import p162.AbstractC7652;
import p165.C7676;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8625;
import p305.C8648;
import p305.C8649;
import p305.C8651;
import p305.InterfaceC8627;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8619 extends CardView implements Checkable, InterfaceC8627 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f24189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f24190;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f24191;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8617 f24192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final int[] f24188 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int[] f24187 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final int[] f24186 = {com.davemorrissey.labs.subscaleview.R.attr.state_dragged};

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final int[] f24185 = {R.attr.state_hovered};

    public AbstractC8619(Context context, AttributeSet attributeSet) {
        C8625 c8625M14269;
        super(AbstractC8266.m13813(com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CardView, context, attributeSet, new int[0]), attributeSet, com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle);
        this.f24191 = false;
        this.f24189 = false;
        this.f24190 = true;
        TypedArray typedArrayM7195 = AbstractC3159.m7195(getContext(), attributeSet, AbstractC8669.f24439, com.davemorrissey.labs.subscaleview.R.attr.materialCardViewStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C8617 c8617 = new C8617(this, attributeSet);
        this.f24192 = c8617;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C8651 c8651 = c8617.f24164;
        c8651.m14323(cardBackgroundColor);
        c8617.f24165.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c8617.m14265();
        AbstractC8619 abstractC8619 = c8617.f24166;
        ColorStateList colorStateListM13678 = AbstractC8189.m13678(abstractC8619.getContext(), typedArrayM7195, 11);
        c8617.f24177 = colorStateListM13678;
        if (colorStateListM13678 == null) {
            c8617.f24177 = ColorStateList.valueOf(-1);
        }
        c8617.f24183 = typedArrayM7195.getDimensionPixelSize(12, 0);
        boolean z = typedArrayM7195.getBoolean(0, false);
        c8617.f24167 = z;
        abstractC8619.setLongClickable(z);
        c8617.f24174 = AbstractC8189.m13678(abstractC8619.getContext(), typedArrayM7195, 6);
        c8617.m14263(AbstractC8189.m13683(abstractC8619.getContext(), typedArrayM7195, 2));
        c8617.f24180 = typedArrayM7195.getDimensionPixelSize(5, 0);
        c8617.f24161 = typedArrayM7195.getDimensionPixelSize(4, 0);
        c8617.f24179 = typedArrayM7195.getInteger(3, 8388661);
        ColorStateList colorStateListM136782 = AbstractC8189.m13678(abstractC8619.getContext(), typedArrayM7195, 7);
        c8617.f24182 = colorStateListM136782;
        if (colorStateListM136782 == null) {
            c8617.f24182 = ColorStateList.valueOf(AbstractC4921.m9876(abstractC8619.getContext(), AbstractC8174.m13603(abstractC8619, com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateListM136783 = AbstractC8189.m13678(abstractC8619.getContext(), typedArrayM7195, 1);
        colorStateListM136783 = colorStateListM136783 == null ? ColorStateList.valueOf(0) : colorStateListM136783;
        C8651 c86512 = c8617.f24163;
        c86512.m14323(colorStateListM136783);
        RippleDrawable rippleDrawable = c8617.f24178;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c8617.f24182);
        }
        c8651.m14322(abstractC8619.getCardElevation());
        float f = c8617.f24183;
        ColorStateList colorStateList = c8617.f24177;
        c86512.f24333.f24302 = f;
        c86512.invalidateSelf();
        C8649 c8649 = c86512.f24333;
        if (c8649.f24289 != colorStateList) {
            c8649.f24289 = colorStateList;
            c86512.onStateChange(c86512.getState());
        }
        abstractC8619.setBackgroundInternal(c8617.m14258(c8651));
        Drawable drawableM14259 = c8617.m14267() ? c8617.m14259() : c86512;
        c8617.f24184 = drawableM14259;
        abstractC8619.setForeground(c8617.m14258(drawableM14259));
        if (c8617.f24162 == -1.0f && (c8625M14269 = C8625.m14269(abstractC8619.getContext(), typedArrayM7195, 8)) != null) {
            C7676 c7676M13026 = AbstractC7738.m13026(abstractC8619.getContext());
            c8651.m14325(c7676M13026);
            c86512.m14325(c7676M13026);
            C8651 c86513 = c8617.f24176;
            if (c86513 != null) {
                c86513.m14325(c7676M13026);
            }
            c8617.m14262(c8625M14269);
        }
        typedArrayM7195.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24192.f24164.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f24192.f24164.f24333.f24290;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f24192.f24163.f24333.f24290;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f24192.f24181;
    }

    public int getCheckedIconGravity() {
        return this.f24192.f24179;
    }

    public int getCheckedIconMargin() {
        return this.f24192.f24161;
    }

    public int getCheckedIconSize() {
        return this.f24192.f24180;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24192.f24174;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f24192.f24165.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f24192.f24165.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f24192.f24165.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f24192.f24165.top;
    }

    public float getProgress() {
        return this.f24192.f24164.f24333.f24301;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f24192.f24164.m14328();
    }

    public ColorStateList getRippleColor() {
        return this.f24192.f24182;
    }

    public C8648 getShapeAppearanceModel() {
        return this.f24192.f24173.mo14273();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f24192.f24177;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f24192.f24177;
    }

    public int getStrokeWidth() {
        return this.f24192.f24183;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f24191;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8617 c8617 = this.f24192;
        c8617.m14264();
        AbstractC6560.m12000(this, c8617.f24164);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        C8617 c8617 = this.f24192;
        if (c8617 != null && c8617.f24167) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24188);
        }
        if (this.f24191) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24187);
        }
        if (this.f24189) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f24186);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f24185);
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
        accessibilityEvent.setChecked(this.f24191);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C8617 c8617 = this.f24192;
        accessibilityNodeInfo.setCheckable(c8617 != null && c8617.f24167);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f24191);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24192.m14257(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24190) {
            C8617 c8617 = this.f24192;
            if (!c8617.f24168) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c8617.f24168 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f24192.f24164.m14323(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C8617 c8617 = this.f24192;
        c8617.f24164.m14322(c8617.f24166.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C8651 c8651 = this.f24192.f24163;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c8651.m14323(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f24192.f24167 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f24191 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f24192.m14263(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C8617 c8617 = this.f24192;
        if (c8617.f24179 != i) {
            c8617.f24179 = i;
            AbstractC8619 abstractC8619 = c8617.f24166;
            c8617.m14257(abstractC8619.getMeasuredWidth(), abstractC8619.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f24192.f24161 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f24192.f24161 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f24192.m14263(AbstractC3054.m6607(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f24192.f24180 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f24192.f24180 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8617 c8617 = this.f24192;
        c8617.f24174 = colorStateList;
        Drawable drawable = c8617.f24181;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C8617 c8617 = this.f24192;
        if (c8617 != null) {
            c8617.m14264();
        }
    }

    public void setDragged(boolean z) {
        if (this.f24189 != z) {
            this.f24189 = z;
            refreshDrawableState();
            m14268();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f24192.m14261();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C8617 c8617 = this.f24192;
        c8617.m14261();
        c8617.m14265();
    }

    public void setProgress(float f) {
        C8617 c8617 = this.f24192;
        c8617.f24164.m14315(f);
        C8651 c8651 = c8617.f24163;
        if (c8651 != null) {
            c8651.m14315(f);
        }
        C8651 c86512 = c8617.f24176;
        if (c86512 != null) {
            c86512.m14315(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C8617 c8617 = this.f24192;
        c8617.f24162 = f;
        c8617.m14262(c8617.f24173.mo14273().mo14276(f));
        c8617.f24184.invalidateSelf();
        if (c8617.m14266() || (c8617.f24166.getPreventCornerOverlap() && !c8617.f24164.m14324())) {
            c8617.m14265();
        }
        if (c8617.m14266()) {
            c8617.m14261();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8617 c8617 = this.f24192;
        c8617.f24182 = colorStateList;
        RippleDrawable rippleDrawable = c8617.f24178;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM12890 = AbstractC7652.m12890(getContext(), i);
        C8617 c8617 = this.f24192;
        c8617.f24182 = colorStateListM12890;
        RippleDrawable rippleDrawable = c8617.f24178;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM12890);
        }
    }

    @Override // p305.InterfaceC8627
    public void setShapeAppearanceModel(C8648 c8648) {
        setClipToOutline(c8648.m14306(getBoundsAsRectF()));
        this.f24192.m14262(c8648);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C8617 c8617 = this.f24192;
        if (c8617.f24177 != colorStateList) {
            c8617.f24177 = colorStateList;
            C8651 c8651 = c8617.f24163;
            c8651.f24333.f24302 = c8617.f24183;
            c8651.invalidateSelf();
            C8649 c8649 = c8651.f24333;
            if (c8649.f24289 != colorStateList) {
                c8649.f24289 = colorStateList;
                c8651.onStateChange(c8651.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        C8617 c8617 = this.f24192;
        if (i != c8617.f24183) {
            c8617.f24183 = i;
            C8651 c8651 = c8617.f24163;
            ColorStateList colorStateList = c8617.f24177;
            c8651.f24333.f24302 = i;
            c8651.invalidateSelf();
            C8649 c8649 = c8651.f24333;
            if (c8649.f24289 != colorStateList) {
                c8649.f24289 = colorStateList;
                c8651.onStateChange(c8651.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C8617 c8617 = this.f24192;
        c8617.m14261();
        c8617.m14265();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C8617 c8617 = this.f24192;
        if (c8617 != null && c8617.f24167 && isEnabled()) {
            this.f24191 = !this.f24191;
            refreshDrawableState();
            m14268();
            c8617.m14256(this.f24191, true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14268() {
        C8617 c8617 = this.f24192;
        RippleDrawable rippleDrawable = c8617.f24178;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            c8617.f24178.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c8617.f24178.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f24192.f24164.m14323(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC8620 interfaceC8620) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }
}
