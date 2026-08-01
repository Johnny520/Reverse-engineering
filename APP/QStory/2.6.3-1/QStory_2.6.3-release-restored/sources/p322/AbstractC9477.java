package p322;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9469;
import p321.C9472;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰哲子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9477 extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final ViewOnTouchListenerC9478 f24675 = new ViewOnTouchListenerC9478();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f24676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f24677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public PorterDuff.Mode f24678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f24679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f24680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f24682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9469 f24683;

    public AbstractC9477(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC9096.m14388(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC9490.f24766);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f24681 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f24683 = C9469.m14880(context2, attributeSet, 0, 0).m14878();
        }
        this.f24682 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC8568.m13632(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC3992.m7740(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f24677 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f24676 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f24679 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f24675);
        setFocusable(true);
        if (getBackground() == null) {
            int iM10583 = AbstractC5894.m10583(AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorSurface)), getBackgroundOverlayColorAlpha(), AbstractC5894.m10585(getContext(), AbstractC7390.m12618(this, C0328R.attr.colorOnSurface)));
            C9469 c9469 = this.f24683;
            if (c9469 != null) {
                int i = AbstractC9476.f24674;
                C9472 c9472 = new C9472(c9469);
                c9472.m14900(ColorStateList.valueOf(iM10583));
                drawable = c9472;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC9476.f24674;
                float dimension = resources.getDimension(C0328R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM10583);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f24680;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f24677;
    }

    public int getAnimationMode() {
        return this.f24681;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f24682;
    }

    public int getMaxInlineActionWidth() {
        return this.f24679;
    }

    public int getMaxWidth() {
        return this.f24676;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f24676;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f24681 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f24680 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f24680);
            drawable.setTintMode(this.f24678);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f24680 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f24678);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f24678 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f24675);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC9476 abstractC9476) {
    }
}
