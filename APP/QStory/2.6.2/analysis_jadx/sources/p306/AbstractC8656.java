package p306;

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
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p251.AbstractC8174;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8648;
import p305.C8651;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰哲子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8656 extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final ViewOnTouchListenerC8657 f24339 = new ViewOnTouchListenerC8657();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f24340;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f24341;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public PorterDuff.Mode f24342;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f24343;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f24344;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f24345;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f24346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8648 f24347;

    public AbstractC8656(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC8266.m13812(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC8669.f24430);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f24345 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f24347 = C8648.m14303(context2, attributeSet, 0, 0).m14301();
        }
        this.f24346 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC8189.m13678(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC3159.m7194(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f24341 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f24340 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f24343 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f24339);
        setFocusable(true);
        if (getBackground() == null) {
            int iM9884 = AbstractC4921.m9884(AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorSurface)), getBackgroundOverlayColorAlpha(), AbstractC4921.m9876(getContext(), AbstractC8174.m13603(this, R.attr.colorOnSurface)));
            C8648 c8648 = this.f24347;
            if (c8648 != null) {
                int i = AbstractC8655.f24338;
                C8651 c8651 = new C8651(c8648);
                c8651.m14323(ColorStateList.valueOf(iM9884));
                drawable = c8651;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC8655.f24338;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM9884);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f24344;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f24341;
    }

    public int getAnimationMode() {
        return this.f24345;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f24346;
    }

    public int getMaxInlineActionWidth() {
        return this.f24343;
    }

    public int getMaxWidth() {
        return this.f24340;
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
        int i3 = this.f24340;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f24345 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f24344 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f24344);
            drawable.setTintMode(this.f24342);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f24344 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f24342);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f24342 = mode;
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
        setOnTouchListener(onClickListener != null ? null : f24339);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC8655 abstractC8655) {
    }
}
