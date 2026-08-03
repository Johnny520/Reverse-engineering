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
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: B5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049B5 extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC0006A5 f99i = new ViewOnTouchListenerC0006A5();

    /* JADX INFO: renamed from: a */
    public final C0728Qx f100a;

    /* JADX INFO: renamed from: b */
    public int f101b;

    /* JADX INFO: renamed from: c */
    public final float f102c;

    /* JADX INFO: renamed from: d */
    public final float f103d;

    /* JADX INFO: renamed from: e */
    public final int f104e;

    /* JADX INFO: renamed from: f */
    public final int f105f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f106g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f107h;

    public AbstractC0049B5(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC0148Dc.m291y(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2927A);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f101b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f100a = C0728Qx.m1512b(context2, attributeSet, 0, 0).m1383a();
        }
        this.f102c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0828TB.m1643j(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0148Dc.m282p(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f103d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f104e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f105f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f99i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM629v = AbstractC0295Gu.m629v(AbstractC0295Gu.m621n(this, R.attr.colorSurface), AbstractC0295Gu.m621n(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0728Qx c0728Qx = this.f100a;
            if (c0728Qx != null) {
                int i = AbstractC0092C5.f207a;
                C1021Xq c1021Xq = new C1021Xq(c0728Qx);
                c1021Xq.m1928n(ColorStateList.valueOf(iM629v));
                drawable = c1021Xq;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0092C5.f207a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM629v);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f106g;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC0092C5 abstractC0092C5) {
    }

    public float getActionTextColorAlpha() {
        return this.f103d;
    }

    public int getAnimationMode() {
        return this.f101b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f102c;
    }

    public int getMaxInlineActionWidth() {
        return this.f105f;
    }

    public int getMaxWidth() {
        return this.f104e;
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
        int i3 = this.f104e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f101b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f106g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f106g);
            drawable.setTintMode(this.f107h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f106g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f107h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f107h = mode;
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
        setOnTouchListener(onClickListener != null ? null : f99i);
        super.setOnClickListener(onClickListener);
    }
}
