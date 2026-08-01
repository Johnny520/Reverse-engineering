package p000;

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
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0288h7 extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC0251g7 f2243i = new ViewOnTouchListenerC0251g7();

    /* JADX INFO: renamed from: a */
    public final f30 f2244a;

    /* JADX INFO: renamed from: b */
    public int f2245b;

    /* JADX INFO: renamed from: c */
    public final float f2246c;

    /* JADX INFO: renamed from: d */
    public final float f2247d;

    /* JADX INFO: renamed from: e */
    public final int f2248e;

    /* JADX INFO: renamed from: f */
    public final int f2249f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2250g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2251h;

    public AbstractC0288h7(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC0222ff.m1177W(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5065x);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = ja0.f2600a;
            y90.m2673s(this, dimensionPixelSize);
        }
        this.f2245b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2244a = f30.m1136b(context2, attributeSet, 0, 0).m982a();
        }
        this.f2246c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0126ct.m816n(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0273gt.m1313v(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2247d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2248e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2249f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2243i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM2814E = AbstractC0979zt.m2814E(getBackgroundOverlayColorAlpha(), AbstractC0979zt.m2830k(this, R.attr.colorSurface), AbstractC0979zt.m2830k(this, R.attr.colorOnSurface));
            f30 f30Var = this.f2244a;
            if (f30Var != null) {
                int i = AbstractC0325i7.f2360a;
                C0200eu c0200eu = new C0200eu(f30Var);
                c0200eu.m1085j(ColorStateList.valueOf(iM2814E));
                drawable = c0200eu;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0325i7.f2360a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM2814E);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f2250g;
            if (colorStateList != null) {
                AbstractC0104ch.m688h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = ja0.f2600a;
            s90.m2325q(this, drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f2247d;
    }

    public int getAnimationMode() {
        return this.f2245b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2246c;
    }

    public int getMaxInlineActionWidth() {
        return this.f2249f;
    }

    public int getMaxWidth() {
        return this.f2248e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(this);
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
        int i3 = this.f2248e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f2245b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2250g != null) {
            drawable = drawable.mutate();
            AbstractC0104ch.m688h(drawable, this.f2250g);
            AbstractC0104ch.m689i(drawable, this.f2251h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2250g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0104ch.m688h(drawableMutate, colorStateList);
            AbstractC0104ch.m689i(drawableMutate, this.f2251h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2251h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0104ch.m689i(drawableMutate, mode);
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
        setOnTouchListener(onClickListener != null ? null : f2243i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0325i7 abstractC0325i7) {
    }
}
